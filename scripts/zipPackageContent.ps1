# Checks that expected files are present & have contents after the publish process to the local cache
param(
  [Parameter(Mandatory=$true)][string] $ArtifactId,
  [Parameter(Mandatory=$true)][string] $PackageSegment,
  [Parameter(Mandatory=$true)][string] $Version,
  [Parameter(Mandatory=$true)][string] $OutputDirectory,
  [Parameter()][string] $GroupId = "com.microsoft.kiota",
  [Parameter()][string] $ComponentsSegment = "..\components",
  [Parameter()][string] $buildOutDir = "build\publishing-repository"
)

#components\bundle\build\publishing-repository\com\microsoft\kiota\microsoft-kiota-bundle\1.8.5\

$groupIdPath = $GroupId -replace "\.", [System.IO.Path]::DirectorySeparatorChar
$packageFullPath = Join-Path -Path $PSScriptRoot -ChildPath $ComponentsSegment -AdditionalChildPath $PackageSegment, $buildOutDir, $groupIdPath, $ArtifactId, $Version

Write-Output "---------------------------------------------------"
Write-Output "Zipping package contents at $packageFullPath"

if(-not (Test-Path -Path $packageFullPath)) {
  Write-Output "Package not found in local cache."
  exit 1
}

$outputFilePath = Join-Path -Path $OutputDirectory -ChildPath "$ArtifactId-$Version.zip"
# removing any existing file
Remove-Item -Path $outputFilePath -ErrorAction SilentlyContinue
# removing any xml files that are not expected in ESRP release
Compress-Archive -Path "$packageFullPath\*" -DestinationPath $outputFilePath

exit 0