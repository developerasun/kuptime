![GitHub last commit](https://img.shields.io/github/last-commit/developerasun/developerasun)
![Static Badge](https://img.shields.io/badge/Is_Jake_Working_On_This_Now-Yes-green)

[![Coffee Chat](https://img.shields.io/badge/Coffee_Chat-795548?style=for-the-badge&logo=coffeescript&logoColor=white)](https://forms.gle/QrFAaXgbLnsxywhA7)

# kuptime

<div align="center">

<img src="./docs/logo.svg" width="40%" />

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum euismod tellus at blandit tempor.

![Static Badge](https://img.shields.io/badge/release-v0.1.0-orange)
![Static Badge](https://img.shields.io/badge/license-MIT-blue)

<img src="./docs/demo.gif" width="100%" />

</div>

# Table of contents

- [introduction](#introduction)
- [installation](#installation)
- [getting started](#getting-started)
- [setup](#setup)
  - [package manager](#package-manager)
- [commands](#commands)
- [reference](#reference)

## introduction

TBD

## installation

TBD

## getting started

TBD

## setup

### package manager

add a plugin for java, kotlin, and spring boot.

```sh
asdf plugin list all kotlin # v2.3.0
asdf plugin add kotlin
asdf plugin install kotlin 2.3.0

asdf plugin list all java
asdf plugin add java
asdf install java temurin-21.0.9+10.0.LTS

asdf plugin list all spring-boot
asdf plugin add spring-boot
asdf install spring-boot 4.0.0
```

set it.

```sh
asdf set java temurin-21.0.9+10.0.LTS
asdf set kotlin 2.3.0
asdf set spring-boot 4.0.0
```

check it.

```sh
asdf current java
asdf current kotlin
asdf current spring-boot
```

### language server

install required extensions on vscode first: `Extension Pack for Java` and `Kotlin`.

check java sdk path.

```sh
asdf where java
/[your-home]/.asdf/installs/java/temurin-21.0.9+10.0.LTS

asdf where kotlin
/[your-home]/.asdf/installs/kotlin/2.3.0
```

set the path for language server in `.vscode`,

```json
{
  "java.jdt.ls.java.home": "/[your-home]/.asdf/installs/java/temurin-21.0.9+10.0.LTS",
  "kotlin.java.home": "/[your-home]/.asdf/installs/java/temurin-21.0.9+10.0.LTS"
}
```

### cli

install `spring` cli with `asdf`.

```sh
asdf plugin add spring-boot
asdf install spring-boot 4.0.0
asdf set spring-boot 4.0.0
```

scaffold a kotlin spring boot.

```sh
spring init --bootVersion=4.0.0 --javaVersion=21 --language=kotlin --name=kuptime --type=gradle-project-kotlin --version=0.1.0 --groupId=io.kuptime --artifactId=kuptime --dependencies=web
```

## reference

- [spring docs: Installing the Spring Boot CLI](https://docs.spring.io/spring-boot/installing.html#getting-started.installing.cli)
- [spring docs: Using the CLI](https://docs.spring.io/spring-boot/cli/using-the-cli.html)
