# Checks that expected files are present & have contents after the publish process to the local cache
param(
  [Parameter(Mandatory=$true)][string] $ArtifactId,
  [Parameter(Mandatory=$true)][string] $Version,
  [Parameter()][string] $GroupId = "com.microsoft.graph",
  [Parameter()][string] $MavenLocalCachePath = "~" + [System.IO.Path]::DirectorySeparatorChar + ".m2" + [System.IO.Path]::DirectorySeparatorChar + "repository"
)

$groupIdPath = $GroupId -replace "\.", [System.IO.Path]::DirectorySeparatorChar
$packagePath = Join-Path -Path $groupIdPath -ChildPath $ArtifactId
$packageFullPath = Join-Path -Path $MavenLocalCachePath -ChildPath $packagePath -AdditionalChildPath $Version

Write-Output "---------------------------------------------------"
Write-Output "Validating package contents at $packageFullPath"

if(-not (Test-Path -Path $packageFullPath)) {
  Write-Output "Package not found in local cache."
  exit 1
}

Write-Output "Package exists in local cache."

$expectedFiles = @(
  "-javadoc.jar",
  "-javadoc.jar.asc",
  "-sources.jar",
  "-sources.jar.asc",
  ".module",
  ".module.asc",
  ".pom",
  ".pom.asc",
  ".jar",
  ".jar.asc"
)

foreach($file in $expectedFiles) {
  $file = $ArtifactId + "-" + $Version + $file
  $filePath = Join-Path -Path $packageFullPath -ChildPath $file
  if(-not (Test-Path -Path $filePath)) {
    Write-Output "Expected file $file not found in package."
    exit 1
  }
  $fileSize = (Get-Item -Path $filePath).length
  if($fileSize -eq 0) {
    Write-Output "File $file is empty."
    exit 1
  }
}

$mavenMetadataFiles = Get-ChildItem -Path $packageFullPath -Filter "maven-metadata*.xml"
if($mavenMetadataFiles.Count -eq 0) {
  Write-Output "No maven-metadata*.xml files found in package."
  exit 1
}

Write-Output "Package $ArtifactId is valid."
Write-Output "---------------------------------------------------"
exit 0
