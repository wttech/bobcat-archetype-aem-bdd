![Cognifide logo](http://cognifide.github.io/images/cognifide-logo.png)

# Bobcat AEM Archetype

## Summary 
This project is Maven archetype for Bobcat using BDD tests with support for AEM. It contains tests examples and page object ready to use in AEM .

## Prerequisites
* JDK 8
* Maven 3

## Create project
```
mvn archetype:generate \
        -DarchetypeGroupId=com.cognifide.qa.bb \
        -DarchetypeArtifactId=bobcat-archetype-aem-bdd \
        -DarchetypeVersion=0.9.1-SNAPSHOT \
```
```
Define value for property 'groupId': : com.cognifde.qa.bb
Define value for property 'artifactId': : hello-world
Define value for property 'version':  1.0-SNAPSHOT: : 1.0.0
Define value for property 'package':  com.cognifde.qa.bb: : com.hello.world
```
## Project structure
```
└───hello-world
 |    └───src
 |        ├───main
 |        │   ├───config
 |        │   │   ├───common
 |        │   │   ├───dev
 |        │   │   └───integration
 |        │   ├───features
 |        │   │   ├───components
 |        │   │   └───login
 |        │   ├───java
 |        │   │   └───com
 |        │   │       └───hello
 |        │   │           └───world
 |        │   │               ├───hooks
 |        │   │               ├───pageobjects
 |        │   │               │   ├───feedback
 |        │   │               │   └───login
 |        │   │               └───steps
 |        │   └───resources
 |        └───test
 |            └───java
 |                └───com
 |                    └───hello
 |                        └───world
 └───pom.xml 
```

Test cases written in Gherkin are in features in directory:

```
└───hello-world
 |    └───src
 |        ├───main
 |        │   ├───features
```

BDD project contains also runners for Gherkin scenarios:

```
 |        └───test
 |            └───java
 |                └───com
 |                    └───hello
 |                        └───world
```

Package com.hello.world.steps for steps implementation:
```
└───hello-world
 |    └───src
 |        │   ├───java
 |        │   │   └───com
 |        │   │       └───hello
 |        │   │           └───world
 |        │   │               └───steps
```

There is also special place for hooks (com.hello.world.hooks) - actions to be executed before and after tests execution (e.g. browser window maximize):

```
└───hello-world
 |    └───src
 |        │   ├───java
 |        │   │   └───com
 |        │   │       └───hello
 |        │   │           └───world
 |        │   │               ├───hooks
```

## Running sample AEM test cases
Instruction is the same regardless of a project archetype:
1. Edit _/src/main/config/integration/instances.properties_ and provide your AEM instance details,
2. Edit _/src/main/config/common/webdriver.properties_ and provide your browser details,
3. Execute following command from the command line:
```
mvn clean test -Pintegration
```
