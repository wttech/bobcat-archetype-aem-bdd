#!/bin/sh

THREADS_NO=2
JVM_OPTS="-Dcucumber.threads=$THREADS_NO"

GLUE="-g classpath:${package}"
FORMAT="-f pretty -f html:target/cucumber-html-report"
FEATURES="src/main/features"
CUCUMBER_OPTS="$GLUE $FORMAT $FEATURES"

mvn clean compile assembly:single -Pconcurrent
java $JVM_OPTS -jar target/${artifactId}.jar $CUCUMBER_OPTS
