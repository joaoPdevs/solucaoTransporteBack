# solu-oTransporteBack

Para contribuir, Certifique-se de documentar as alterações realizadas tanto no código quanto nos outros itens do repositório. Escreva seus pull requests de maneira que os outros possam entender com o que estamos trabalhando e rastrear erros com mais facilidade.

## Como executar o projeto

### Pré-requisitos

- Java JDK 25 instalado.
- Git instalado (caso vá clonar o repositório).

### Executando a aplicação

1. Clone o repositório e entre na pasta do projeto.
2. Abra um terminal na pasta que contém o arquivo `mvnw`.
3. Execute o comando:

```bash
./mvnw spring-boot:run
```

4. Aguarde até que a aplicação seja iniciada.
5. Acesse `http://localhost:8080` no navegador para testar a API, utilizando os endpoints disponíveis no projeto.

**Observação:** mantenha o terminal aberto enquanto estiver utilizando a aplicação.

### Windows (PowerShell)

```powershell
.\mvnw.cmd spring-boot:run
```

1. Corrige o JAVA_HOME
   No terminal Git Bash do VS Code, copia e executa estes comandos:
   export JAVA_HOME="/c/Users/joaor/AppData/Local/Programs/Eclipse Adoptium/jdk-25.0.2.10-hotspot"
   export PATH="$JAVA_HOME/bin:$PATH"

Esse é o caminho que identificamos anteriormente para tua instalação do JDK 25. 2. Confirma a versão utilizada
Executa:
echo "$JAVA_HOME"
java -version
javac -version
./mvnw -version

O resultado esperado no último comando é algo semelhante a:
Java version: 25.0.2

Se ainda aparecer Java 24, não prossigas para a compilação: precisamos corrigir o ambiente primeiro. 3. Tenta iniciar novamente
Se o Maven mostrar Java 25, executa:
./mvnw clean spring-boot:run
