\# SDK do Microsoft Graph para Java

[ ![Baixar](https://api.bintray.com/packages/microsoftgraph/Maven/microsoft-graph/images/download.svg) ](https://bintray.com/microsoftgraph/Maven/microsoft-graph/_latestVersion)


Comece a trabalhar com o SDK do Microsoft Graph para Java ao integrar a [API do Microsoft Graph](https://graph.microsoft.io/en-us/getting-started) em seu aplicativo Java!

## 1. Instalação

### 1.1 Instalar por meio do Gradle

Adicione o repositório e uma dependência de compilação para `microsoft-graph` a `build.gradle` do projeto:

```gradle
repository {
    jcenter()
}

dependency {
    // Include the sdk as a dependency
    compile('com.microsoft.graph:microsoft-graph:1.5.+')
}
```

### 1.2 Instalar por meio do Maven
Adicione a dependência em `dependencies` em pom.xml
```dependency
<dependency>
	<groupId>com.microsoft.graph</groupId>
	<artifactId>microsoft-graph</artifactId>
	<version>1.5.0</version>
</dependency>
```

### 1.3 Habilitar o ProGuard (Android)
A natureza da API do Graph é tão ampla que o SDK precisa de um grande conjunto de classes para descrever suas funcionalidades. É necessário garantir que o [ProGuard](https://developer.android.com/studio/build/shrink-code.html) esteja habilitado em seu projeto. Caso contrário, você incorrerá longos períodos de compilação para recursos que não são necessariamente relevantes para o seu aplicativo específico. Se você ainda estiver atingindo o limite do método 64K, também poderá habilitar o [multidexing](https://developer.android.com/studio/build/multidex.html).

## 2. Introdução

### 2.1 Registre seu aplicativo

Registre o aplicativo seguindo as etapas em [Registrar um aplicativo no ponto de extremidade do Azure AD v2.0](https://developer.microsoft.com/pt-br/graph/docs/concepts/auth_register_app_v2).

### 2.2 Criar um objeto IAuthenticationProvider

Uma instância da classe **GraphServiceClient** manipula solicitações de criação, enviando-as à API do Microsoft Graph e processando as respostas. Para criar uma nova instância dessa classe, você precisa fornecer uma instância de `IAuthenticationProvider` que possa autenticar as solicitações para o Microsoft Graph.

Para obter um exemplo de autenticação em um aplicativo cliente, confira a [Autenticação do MSA do Android do SDK do MSGraph para o Adaptador do Android](https://github.com/microsoftgraph/msgraph-sdk-android-msa-auth-for-android-adapter).

### 2.3 Obter um objeto GraphServiceClient
Depois de definir a ID e a URL corretas do aplicativo, você deve obter um objeto **GraphServiceClient** para fazer solicitações no serviço. O SDK armazena as informações da conta para você, mas quando um usuário entra pela primeira vez, ele invoca a interface do usuário para obter as informações de conta do usuário.

```java
IGraphServiceClient graphClient = 
  GraphServiceClient
    .builder()
    .authenticationProvider(authenticationProvider)
    .buildClient();
```

## 3. Fazer solicitações ao serviço

Depois autenticar GraphServiceClient, você pode começar a fazer chamadas de serviço. As solicitações ao serviço se parecem com a [API REST](https://developer.microsoft.com/pt-br/graph/docs/concepts/overview).

### 3.1 Obter a unidade do usuário

Para recuperar a unidade do usuário:

```java
graphClient
  .me()
  .drive()
  .buildRequest()
  .get(new ICallback<Drive>() {
     @Override
     public void success(final Drive result) {
        System.out.println("Found Drive " + result.id);
     }
     ...
     // Handle failure case
  });
```

Confira como o SDK foi desenvolvido na [visão geral](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview).

## 4. Documentação

Confira a documentação mais detalhada em:

* [Visão Geral](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview)
* [Estender a biblioteca](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Extending-the-Library)
* [Manipulação de tipos abertos, suporte a PATCH com valores `nulos`](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Open-Types)
* [Coleções](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Collections)
* [Fazer solicitações personalizadas](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Custom-Requests)
* [Problemas conhecidos](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Known-Issues)
* [Contribuições](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md)

## 5. Problemas

Confira problemas conhecidos em [problemas](https://github.com/MicrosoftGraph/msgraph-sdk-java/issues).

## 6. Contribuições

O SDK do Microsoft Graph está aberto para contribuições. Para contribuir com esse projeto, confira [Contribuir](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md).

Agradecimentos a todos que já dedicaram tempo para melhorar a biblioteca:

<!-- ALL-CONTRIBUTORS-LIST:START  -->
<!-- prettier-ignore -->
| [<img src="https://avatars.githubusercontent.com/u/2273297?v=4" width="100px;"/><br /><sub><b>Caitlin Bales</b></sub>](https://developer.microsoft.com/graph)<br />[💬](#question-cbales "Answering Questions") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") [👀](#review-cbales "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Tests")| [<img src="https://avatars.githubusercontent.com/u/318187?v=4" width="100px;"/><br /><sub><b>David Moten</b></sub>](https://github.com/davidmoten)<br /> [🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3Adavidmoten "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/commit/87389b5a4240072e3f2226a2f04f089916ffed0b#diff-04c6e90faac2675aa89e2176d2eec7d8 "Documentation") [🤔](#ideas-davidmoten "Ideas & Planning") [👀](#review-davidmoten "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Tests") | [<img src="https://avatars.githubusercontent.com/u/8527305?v=4" width="100px;"/><br /><sub><b>Michael Mainer</b></sub>](https://developer.microsoft.com/graph)<br /> [💬](#question-cbales "Answering Questions") [🤔](#ideas-MIchaelMainer "Ideas & Planning") [👀](#review-MIchaelMainer "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/27295799?v=4" width="100px;"/><br /><sub><b>Linda Caputo</b></sub>](https://developer.microsoft.com/graph)<br />[📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") | [<img src="https://avatars.githubusercontent.com/u/8884923?v=4" width="100px;"/><br /><sub><b>John Austin</b></sub>](https://developer.microsoft.com/graph)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues "Bug reports") | [<img src="https://avatars.githubusercontent.com/u/3460953?v=4" width="100px;"/><br /><sub><b>Dmitry Pimenov</b></sub>](https://developer.microsoft.com/graph)<br />[🤔](#ideas-dpim "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/1427840?v=4" width="100px;"/><br /><sub><b>Jonathan Giles</b></sub>](https://github.com/JonathanGiles)<br />[🤔](#ideas-JonathanGiles "Ideas & Planning") |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  [<img src="https://avatars.githubusercontent.com/u/881767?v=4" width="100px;"/><br /><sub><b>Martin Sawicki</b></sub>](https://github.com/martinsawicki)<br />[🤔](#ideas-martinsawicki "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/29152134?v=4" width="100px;"/><br /><sub><b>Louis Maresca</b></sub>](https://github.com/LouMM)<br />[🤔](#ideas-LouMM "Ideas & Planning") [👀](#review-LouMM "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/604089?v=4" width="100px;"/><br /><sub><b>Josef H.B. Schneider</b></sub>](https://j0s.at/)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3AJ0s3f "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=J0s3f "Code") | [<img src="https://avatars2.githubusercontent.com/u/3197588?v=4" width="100px;"/><br /><sub><b>Deepak Agrawal</b></sub>](https://github.com/deepak2016)<br />[💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=deepak2016 "Code") | <img src="https://avatars.githubusercontent.com/u/22523479?v=4" width="100px;"/><br /><sub><b>Ben Tipper</b></sub><br /> | [<img src="https://avatars3.githubusercontent.com/u/16473684?v=4" width="100px;"/><br /><sub><b>Nakul Sabharwal</b></sub>](https://github.com/NakulSabharwal)<br />[💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=NakulSabharwal "Code") [👀](#review-NakulSabharwal "Reviewed Pull Requests")
<!-- ALL-CONTRIBUTORS-LIST:END -->

Este projeto acompanha a especificação [all-contributors](https://github.com/kentcdodds/all-contributors). As contribuições de qualquer tipo são bem-vindas!

## 7. Versões Java com suporte
O SDK do Microsoft Graph para biblioteca Java tem suporte em tempo de execução para Java 7+ e para a [API do Android revisão 15](http://source.android.com/source/build-numbers.html) e posteriores.

## 8. Licença

Copyright (c) Microsoft Corporation. Todos os direitos reservados. Licenciada sob a [Licença do MIT](LICENSE).

## 9. Avisos de terceiros

[Avisos de terceiros](THIRD%20PARTY%20NOTICES)
