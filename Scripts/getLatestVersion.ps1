# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License.

<# 
.Synopsis
    Retrieve the latest version of the library
.Description 
    Retrieves the latest version specified in the Gradle.Properties file
    Uses the retrieved values to update the enviornment variable VERSION_STRING
#>

.Parameter propertiesPath

Param(
    [parameter(Mandatory = $true)]
    [string]$propertiesPath
)

#Retrieve the current version from the Gradle.Properties file given the specified path
$file = get-item $propertiesPath
$findVersions = $file | Select-String -Pattern "mavenMajorVersion" -Context 0,2
$findVersions = $findVersions -split "`r`n"

$majorVersion = $findVersions[0].Substring($findVersions[0].Length-1)
$minorVersion = $findVersions[1].Substring($findVersions[1].Length-1)
$patchVersion = $findVersions[2].Substring($findVersions[2].Length-1)
$version = "$majorVersion.$minorVersion.$patchVersion"

#Update the VERSION_STRING env variable and inform the user
Write-Host "##vso[task.setVariable variable=VERSION_STRING]$($version)";
Write-Host "Updated the VERSION_STRING enviornment variable with the current Gradle.Properties, $version"