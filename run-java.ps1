param(
    [Parameter(Mandatory = $true)]
    [string]$File
)

if (-not (Test-Path -LiteralPath $File)) {
    Write-Error "File not found: $File"
    exit 1
}

$dir = Split-Path -LiteralPath $File -Parent
$name = [System.IO.Path]::GetFileNameWithoutExtension($File)

Push-Location -LiteralPath $dir

javac "$name.java"
if ($LASTEXITCODE -ne 0) {
    Pop-Location
    exit $LASTEXITCODE
}

& java -cp "." $name
$code = $LASTEXITCODE

Pop-Location
exit $code

