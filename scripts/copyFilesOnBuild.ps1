# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License.

<# 
.Synopsis
    Copy files to a new location that is the parent of the current directory. 
.Description 
    Receives an encoded string value and decodes it using base64. 
    Write the new decoded string to a local file for later consumption. 
.Parameter inputPath
    The encoded string we wish to decode.  
#>

Param(
    [Parameter(Mandatory = $true)][string]$inputPath 
)

$fullPath = (Get-Item $inputPath).FullName
$parentDirectory = (Get-Item $inputPath).Parent
Push-Location $inputPath

Get-ChildItem '*' -Filter *.java -recurse | ForEach-Object {
    $TargetDirectory = $_.DirectoryName.Replace($fullPath, "")
    $TargetPath = Join-Path -Path $parentDirectory -ChildPath $TargetDirectory 
    If (!(Test-Path $TargetPath)) {
        New-Item -Path $TargetPath -Type Directory -Force | out-null
    }
    $_ | Move-Item -Destination $TargetPath -Force
}
Pop-Location
