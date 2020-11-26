# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License.

<#
.Synopsis
    Increment the minor version string in the gradle.properties if the major,
    minor, or patch version hasn't been manually updated.
.Description
    Assumptions:
        Targets Gradle.properties
        This script assumes it is run from the repo root.
        Minor version is typically auto-incremented.

#>

function Update-ReadmeVersion([string]$readmeFilePath, [string]$version) {
	$readmeFileContent = Get-Content -Path $readmeFilePath -Raw
	$readmeFileContent = $readmeFileContent -replace "\d{1,}\.\d{1,}\.\d{1,}", $version
	Set-Content -Path $readmeFilePath $readmeFileContent
}

function Update-TelemetryVersion([string]$telemetryFilePath, [string]$version) {
	$telemetryFileContent = Get-Content -Path $telemetryFilePath -Raw
	$telemetryFileContent = $telemetryFileContent -replace "\d{1,}\.\d{1,}\.\d{1,}", $version
	Set-Content -Path $telemetryFilePath $telemetryFileContent
}

function Update-PackageVersion([string]$propertiesFilePath, [string]$version) {
	$propertiesFileContent = Get-Content -Path $propertiesFilePath -Raw
	if($version -match "(\d{1,})\.(\d{1,})\.(\d{1,})") {
		$patch = $Matches[3]
		$minor = $Matches[2]
		$major = $Matches[1]
		$propertiesFileContent = $propertiesFileContent -replace "mavenMajorVersion\s+=\s+\d{1,}", "mavenMajorVersion = $major"
		$propertiesFileContent = $propertiesFileContent -replace "mavenMinorVersion\s+=\s+\d{1,}", "mavenMinorVersion = $minor"
		$propertiesFileContent = $propertiesFileContent -replace "mavenPatchVersion\s+=\s+\d{1,}", "mavenPatchVersion = $patch"
		Set-Content -Path $propertiesFilePath $propertiesFileContent
	} else {
		Write-Error "Invalid version number format $version"
	}
}
function Get-CurrentTelemetryVersion([string]$telemetryFilePath) {
	$telemetryFileContent = Get-Content -Path $telemetryFilePath -Raw
	if($telemetryFileContent -match "(\d{1,}\.\d{1,}\.\d{1,})") {
		return $Matches[1]
	} else {
		Write-Error "Invalid version number format"
		return ""
	}
}

function Update-MinorVersionNumber([string]$currentVersion) {
	if($currentVersion -match "(\d{1,})\.(\d{1,})\.(\d{1,})") {
		[int]$minor = [convert]::ToInt32($Matches[2])
		$minor++;
		$major = $Matches[1]
		return "$major.$minor.0"
	} else {
		Write-Error "Invalid version number format $currentVersion"
		return ""
	}
}

function Update-MinorVersion() {
	$readmeFilePath = Join-Path -Path $PWD.ToString() -ChildPath "../readme.md"
	$propertiesFilePath = Join-Path -Path $PWD.ToString() -ChildPath "../gradle.properties"
	$telemetryFilePath = Join-Path -Path $PWD.ToString() -ChildPath "../src/main/java/com/microsoft/graph/core/Constants.java"
	$currentVersion = Get-CurrentTelemetryVersion -telemetryFilePath $telemetryFilePath
	$nextVersion = Update-MinorVersionNumber -currentVersion $currentVersion
	Update-ReadmeVersion -version $nextVersion -readmeFilePath $readmeFilePath
	Update-TelemetryVersion -version $nextVersion -telemetryFilePath $telemetryFilePath
	Update-PackageVersion -version $nextVersion -propertiesFilePath $propertiesFilePath
}
Update-MinorVersion