To run the code in this repository the following code has to be used in the terminal:
Compilation:
```zsh
javac -cp "$(find lib -name '*.jar' | tr '\n' ':')" -d out $(find com -name '*.java')
```
Execution:
```zsh
java -cp "out:$(find lib -name '*.jar' | tr '\n' ':')" com.whatsapp.cli.messaging.APP
```

