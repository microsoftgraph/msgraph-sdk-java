# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License.

<# 
.Synopsis
    Decode the encoded string and write it to a local file. 
.Description 
    Recieves an encoded string value and decodes it using base64. 
    Write the new decoded string to a local file for later consumption. 
.Parameter encodedValue
    The encoded string we wish to decode.
.Parameter outputPath
    The file path that we wish to write the decoded value to.  
#>

Param(
    [string]$encodedValue , 
    [string]$outputPath
)

if($outputPath -eq "" -or $null -eq $outputPath) {
    Write-Output "Value of Variable: outputPath is Null or Empty. Exiting."
    Exit 
}
if($encodedValue -eq "" -or $null -eq $encodedValue) {
    Write-Output "Value of Variable: encodedValue is Null of Empty. Exiting."
    Exit
}

$decodedValue = [System.Convert]::FromBase64String($encodedValue)
Set-Content $outputPath -Value $decodedValue -Encoding Byte
