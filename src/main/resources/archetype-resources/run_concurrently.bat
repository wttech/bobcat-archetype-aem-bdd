set THREADS_NO=2

@set JVM_OPTS="-Dcucumber.threads=%THREADS_NO%"
@set GLUE="-g classpath:${package}"
@set FORMAT="-f pretty -f html:target/cucumber-html-report"
@set FEATURES="src/main/features"
@set CUCUMBER_OPTS="%GLUE% %FORMAT% %FEATURES%"

mvn clean compile assembly:single -Pconcurrent
java %JVM_OPTS% -jar target/${artifactId}.jar %CUCUMBER_OPTS%
