#!/usr/bin/env bash
echo "Running Log4j2 application"
java --module-path mods:lib -cp $PWD/resources --module pl.tfij.java9modules.app

echo "Running SLF4J application"
java --module-path mods:lib -cp $PWD/resources --module pl.tfij.java9modules.slf4japp
