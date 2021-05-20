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

function Update-ReadmeVersion([string]$readmeFilePath, [version]$version) {
	$readmeFileContent = Get-Content -Path $readmeFilePath -Raw
	$readmeFileContent = $readmeFileContent -replace "graph(\-beta)?:\d{1,}\.\d{1,}\.\d{1,}", "graph`$1:$($version.ToString())"
	$gradleLineNumber = Select-String -Path $readmeFilePath -Pattern "```xml" | Select-Object -First 1 -ExpandProperty LineNumber;
	$gradleLineNumber+= 4 # skipping triple tick, block open, comment, groupid, artifactid
	$readmeLines = $readmeFileContent -split "`n"
	$readmeLines[$gradleLineNumber] = $readmeLines[$gradleLineNumber] -replace "\d{1,}\.\d{1,}\.\d{1,}", $version.ToString()
	$readmeFileContent = $readmeLines -join "`n"
	Set-Content -Path $readmeFilePath $readmeFileContent
}

function Update-TelemetryVersion([string]$telemetryFilePath, [version]$version) {
	$telemetryFileContent = Get-Content -Path $telemetryFilePath -Raw
	$telemetryFileContent = $telemetryFileContent -replace "\d{1,}\.\d{1,}\.\d{1,}", $version.ToString()
	Set-Content -Path $telemetryFilePath $telemetryFileContent
}

function Update-PackageVersion([string]$propertiesFilePath, [version]$version) {
	$propertiesFileContent = Get-Content -Path $propertiesFilePath -Raw
	$propertiesFileContent = $propertiesFileContent -replace "mavenMajorVersion\s+=\s+\d{1,}", "mavenMajorVersion = $($version.Major)"
	$propertiesFileContent = $propertiesFileContent -replace "mavenMinorVersion\s+=\s+\d{1,}", "mavenMinorVersion = $($version.Minor)"
	$propertiesFileContent = $propertiesFileContent -replace "mavenPatchVersion\s+=\s+\d{1,}", "mavenPatchVersion = $($version.Build)"
	Set-Content -Path $propertiesFilePath $propertiesFileContent
}
function Get-CurrentTelemetryVersion([string]$telemetryFilePath) {
	$telemetryFileContent = Get-Content -Path $telemetryFilePath -Raw
	if($telemetryFileContent -match "(\d{1,}\.\d{1,}\.\d{1,})") {
		return [version]::Parse($Matches[1])
	} else {
		Write-Error "Invalid version number format"
		return $null;
	}
}

function Update-MinorVersionNumber([version]$currentVersion) {
	return [version]::new($currentVersion.Major, $currentVersion.Minor + 1, 0);
}

function Update-MinorVersion() {
	$readmeFilePath = Join-Path -Path $PWD.ToString() -ChildPath "../README.md"
	$propertiesFilePath = Join-Path -Path $PWD.ToString() -ChildPath "../gradle.properties"
	$telemetryFilePath = Join-Path -Path $PWD.ToString() -ChildPath "../src/main/java/com/microsoft/graph/info/Constants.java"
	$currentVersion = Get-CurrentTelemetryVersion -telemetryFilePath $telemetryFilePath
	$nextVersion = Update-MinorVersionNumber -currentVersion $currentVersion
	Update-ReadmeVersion -version $nextVersion -readmeFilePath $readmeFilePath
	Update-TelemetryVersion -version $nextVersion -telemetryFilePath $telemetryFilePath
	Update-PackageVersion -version $nextVersion -propertiesFilePath $propertiesFilePath
}
Update-MinorVersion