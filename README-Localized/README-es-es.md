# SDK de Microsoft Graph para Java

[![Descargar](https://api.bintray.com/packages/microsoftgraph/Maven/microsoft-graph/images/download.svg)](https://bintray.com/microsoftgraph/Maven/microsoft-graph/_latestVersion)


Introducción al SDK de Microsoft Graph para Java mediante la integración de la [API de Microsoft Graph](https://graph.microsoft.io/en-us/getting-started) en la aplicación de Java.

## 1. Instalación

### 1.1 Instalar a través de Gradle

Agregue el repositorio y una dependencia de compilación para `microsoft-graph` al `build.gradle` de su proyecto:

```gradle
repository {
    jcenter()
}

dependency {
    // Include the sdk as a dependency
    compile('com.microsoft.graph:microsoft-graph:1.5.+')
}
```

### 1.2 Instalar a través de Maven
Agregue la dependencia en `dependencies` en pom.xml
```dependency
<dependency>
	<groupId>com.microsoft.graph</groupId>
	<artifactId>microsoft-graph</artifactId>
	<version>1.5.0</version>
</dependency>
```

### 1.3 Habilitar ProGuard (Android)
Debido a la naturaleza de la API de Graph el SDK necesita un conjunto de clases muy amplio para describir su funcionalidad. Debe asegurarse de que [ProGuard](https://developer.android.com/studio/build/shrink-code.html) está habilitado en su proyecto. En caso contrario, se provocarán largos tiempos de compilación para funciones que no sean necesarias para su aplicación en particular. Si sigue experimentando el límite del método de 64K, también puede habilitar [multidex](https://developer.android.com/studio/build/multidex.html).

## 2. Introducción

### 2.1 Registrar la aplicación

Para registrar la aplicación, siga los pasos descritos en [Registrar la aplicación con el punto de conexión de Azure AD v 2.0](https://developer.microsoft.com/es-es/graph/docs/concepts/auth_register_app_v2).

### 2.2 Crear un objeto IAuthenticationProvider

Una instancia de la clase **GraphServiceClient** controla las solicitudes de creación, su envío a la API de Microsoft Graph y el procesamiento de las respuestas. Para crear una nueva instancia de esta clase, tiene que proporcionar una instancia de `IAuthenticationProvider` que pueda autenticar solicitudes en Microsoft Graph.

Para obtener un ejemplo de autenticación en una aplicación cliente, vea el [Adaptador de MSGraph SDK Android MSA Auth para Android](https://github.com/microsoftgraph/msgraph-sdk-android-msa-auth-for-android-adapter).

### 2.3 Obtener un objeto GraphServiceClient
Una vez que haya establecido la dirección URL y el identificador de aplicación correctos, debe obtener un objeto **GraphServiceClient** para realizar solicitudes en el servicio. El SDK almacena la información de la cuenta, pero cuando un usuario inicia sesión por primera vez, invoca la interfaz de usuario para obtener la información de la cuenta de usuario.

```java
IGraphServiceClient graphClient = 
  GraphServiceClient
    .builder()
    .authenticationProvider(authenticationProvider)
    .buildClient();
```

## 3. Realizar solicitudes en el servicio

Una vez que tenga un GraphServiceClient que está autenticado, puede empezar a realizar llamadas en el servicio. Las solicitudes en el servicio son como nuestra [API de REST](https://developer.microsoft.com/es-es/graph/docs/concepts/overview).

### 3.1 Obtener el "drive" del usuario

Para obtener el "drive" del usuario:

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

Para obtener información general sobre cómo está diseñado el SDK, vea [información general](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview).

## 4. Documentación

Para ver documentación más detallada, consulte:

* [Información general](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview)
* [Extendiendo la biblioteca](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Extending-the-Library)
* [Control de tipos abiertos, compatibilidad de revisiones con valores `null`](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Open-Types)
* [Colecciones](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Collections)
* [Realizar solicitudes personalizadas](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Custom-Requests)
* [Problemas conocidos](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Known-Issues)
* [Contribuciones](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md)

## 5. Problemas

Para los problemas conocidos, vea [problemas](https://github.com/MicrosoftGraph/msgraph-sdk-java/issues).

## 6. Contribuciones

El SDK de Microsoft Graph está abierto a colaboraciones. Para contribuir a este proyecto, consulte [Colaborar](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md).

Gracias a todos los usuarios que ya dedican tiempo a mejorar la biblioteca:

<!-- ALL-CONTRIBUTORS-LIST:START  -->
<!-- prettier-ignore -->
| [<img src="https://avatars.githubusercontent.com/u/2273297?v=4" width="100px;"/><br /><sub><b>Caitlin Bales</b></sub>](https://developer.microsoft.com/graph)<br />[💬](#question-cbales "Answering Questions") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") [👀](#review-cbales "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Tests")| [<img src="https://avatars.githubusercontent.com/u/318187?v=4" width="100px;"/><br /><sub><b>David Moten</b></sub>](https://github.com/davidmoten)<br /> [🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3Adavidmoten "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/commit/87389b5a4240072e3f2226a2f04f089916ffed0b#diff-04c6e90faac2675aa89e2176d2eec7d8 "Documentation") [🤔](#ideas-davidmoten "Ideas & Planning") [👀](#review-davidmoten "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Tests") | [<img src="https://avatars.githubusercontent.com/u/8527305?v=4" width="100px;"/><br /><sub><b>Michael Mainer</b></sub>](https://developer.microsoft.com/graph)<br /> [💬](#question-cbales "Answering Questions") [🤔](#ideas-MIchaelMainer "Ideas & Planning") [👀](#review-MIchaelMainer "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/27295799?v=4" width="100px;"/><br /><sub><b>Linda Caputo</b></sub>](https://developer.microsoft.com/graph)<br />[📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") | [<img src="https://avatars.githubusercontent.com/u/8884923?v=4" width="100px;"/><br /><sub><b>John Austin</b></sub>](https://developer.microsoft.com/graph)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues "Bug reports") | [<img src="https://avatars.githubusercontent.com/u/3460953?v=4" width="100px;"/><br /><sub><b>Dmitry Pimenov</b></sub>](https://developer.microsoft.com/graph)<br />[🤔](#ideas-dpim "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/1427840?v=4" width="100px;"/><br /><sub><b>Jonathan Giles</b></sub>](https://github.com/JonathanGiles)<br />[🤔](#ideas-JonathanGiles "Ideas & Planning") |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  [<img src="https://avatars.githubusercontent.com/u/881767?v=4" width="100px;"/><br /><sub><b>Martin Sawicki</b></sub>](https://github.com/martinsawicki)<br />[🤔](#ideas-martinsawicki "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/29152134?v=4" width="100px;"/><br /><sub><b>Louis Maresca</b></sub>](https://github.com/LouMM)<br />[🤔](#ideas-LouMM "Ideas & Planning") [👀](#review-LouMM "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/604089?v=4" width="100px;"/><br /><sub><b>Josef H.B. Schneider</b></sub>](https://j0s.at/)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3AJ0s3f "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=J0s3f "Code") | [<img src="https://avatars2.githubusercontent.com/u/3197588?v=4" width="100px;"/><br /><sub><b>Deepak Agrawal</b></sub>](https://github.com/deepak2016)<br />[💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=deepak2016 "Code") | <img src="https://avatars.githubusercontent.com/u/22523479?v=4" width="100px;"/><br /><sub><b>Ben Tipper</b></sub><br /> | [<img src="https://avatars3.githubusercontent.com/u/16473684?v=4" width="100px;"/><br /><sub><b>Nakul Sabharwal</b></sub>](https://github.com/NakulSabharwal)<br />[💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=NakulSabharwal "Code") [👀](#review-NakulSabharwal "Reviewed Pull Requests")
<!-- ALL-CONTRIBUTORS-LIST:END -->

Este proyecto sigue la especificación [todos los colaboradores](https://github.com/kentcdodds/all-contributors). Las contribuciones de cualquier tipo son bienvenidas.

## 7. Versiones de Java compatibles
La biblioteca SDK de Microsoft Graph para Java es compatible en tiempo de ejecución con Java 7+ y [la API de Android revisión 15](http://source.android.com/source/build-numbers.html) y posteriores.

## 8. Licencia

Copyright (c) Microsoft Corporation. Reservados todos los derechos. Publicado bajo la [licencia MIT](LICENSE).

## 9. Avisos de terceros

[Avisos de terceros](THIRD%20PARTY%20NOTICES)
