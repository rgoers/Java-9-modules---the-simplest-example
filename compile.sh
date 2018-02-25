#!/usr/bin/env bash
javac -d build --module-path lib --module-source-path src $(find src -name "*.java")
