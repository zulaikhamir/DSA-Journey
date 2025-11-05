@echo off
setlocal enabledelayedexpansion

if "%~1"=="" (
    echo Usage: %~nx0 path\to\File.java
	goto :eof
)

set "FILE=%~1"
if not exist "%FILE%" (
    echo File not found: %FILE%
	goto :eof
)

for %%I in ("%FILE%") do (
    set "DIR=%%~dpI"
    set "NAME=%%~nI"
)

pushd "%DIR%" >nul 2>&1

javac "%NAME%.java"
if errorlevel 1 (
    echo Compilation failed.
    popd >nul 2>&1
    goto :eof
)

java -cp . "%NAME%"
set "ERR=%errorlevel%"

popd >nul 2>&1
exit /b %ERR%

