
To run the cucumber tests using the cucumber CLI run the below commands
- `mvn clean test`
- `mvn exec:java -Dexec.classpathScope=test -Dexec.mainClass=io.cucumber.core.cli.Main`

- `mvn exec:java -Dexec.classpathScope=test -Dexec.mainClass=io.cucumber.core.cli.Main -Dexec.args="src/test/resources/wdcoder/test.feature --glue wdcoder"`

- `mvn exec:java -Dexec.classpathScope=test -Dexec.mainClass=io.cucumber.core.cli.Main -Dexec.args="--plugin pretty --pl
  ugin html:target/cucumber.html"`