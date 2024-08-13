# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License.

<# 
.Synopsis
    Retrieve the latest version of the library
.Description 
    Retrieves the latest version specified in the Gradle.Properties file
    Uses the retrieved values to update the environment variable VERSION_STRING
.Parameter propertiesPath
    The path pointing to the gradle.properties file.
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
$content = Get-Content $propertiesPath

$lineNumber = $findVersions.LineNumber - 1
$versionIndex = $content[$lineNumber].IndexOf("=")
$versionIndex += 2 # skipping =[space]
$majorVersion = $content[$lineNumber].Substring($versionIndex)
$lineNumber++
$minorVersion = $content[$lineNumber].Substring($versionIndex)
$lineNumber++
$patchVersion = $content[$lineNumber].Substring($versionIndex)
$version = "$majorVersion.$minorVersion.$patchVersion"

#Set Task output to create tag
Write-Output "::set-output name=tag::v${version}"
