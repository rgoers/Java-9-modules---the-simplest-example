#!/usr/bin/env bash
mkdir -p mods
jar --create --file=mods/pl.tfij.java9modules.app@1.0.jar --module-version=1.0 --main-class=pl.tfij.java9modules.app.ModuleApp -C build/pl.tfij.java9modules.app .
jar --create --file=mods/pl.tfij.java9modules.slf4japp@1.0.jar --module-version=1.0 --main-class=pl.tfij.java9modules.slf4japp.SLF4JApp -C build/pl.tfij.java9modules.slf4japp .
jar --create --file=mods/pl.tfij.java9modules.greetings@1.0.jar --module-version=1.0 -C build/pl.tfij.java9modules.greetings .
