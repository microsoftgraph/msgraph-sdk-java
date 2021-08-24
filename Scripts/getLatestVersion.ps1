# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License.

<# 
.Synopsis
    Retrieve the latest version of the library
.Description 
    Retrieves the latest version specified in the Gradle.Properties file
    Uses the retrieved values to update the enviornment variable VERSION_STRING
.Parameter propertiesPath
#>
Param(
    [string]$propertiesPath
)

#Retrieve the current version from the Gradle.Properties file given the specified path
if($propertiesPath -eq "" -or $null -eq $propertiesPath) {
    $propertiesPath = Join-Path -Path $PSScriptRoot -ChildPath "../gradle.properties"
}
$file = get-item $propertiesPath
$findVersions = $file | Select-String -Pattern "mavenMajorVersion" -Context 0,2
$findVersions = $findVersions -split "`r`n"

$versionIndex = $findVersions[0].IndexOf("=")
$majorVersion = $findVersions[0].Substring($versionIndex+2)
$minorVersion = $findVersions[1].Substring($versionIndex+2)
$patchVersion = $findVersions[2].Substring($versionIndex+2)
$version = "$majorVersion.$minorVersion.$patchVersion"

#Update the VERSION_STRING env variable and inform the user
Write-Host "##vso[task.setVariable variable=VERSION_STRING]$($version)";
Write-Host "Updated the VERSION_STRING enviornment variable with the current Gradle.Properties, $version"
