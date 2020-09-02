# Пакет SDK Microsoft Graph для Java

[ ![Скачать](https://api.bintray.com/packages/microsoftgraph/Maven/microsoft-graph/images/download.svg) ](https://bintray.com/microsoftgraph/Maven/microsoft-graph/_latestVersion)


Чтобы начать работу с пакетом SDK Microsoft Graph для Java, интегрируйте [API Microsoft Graph](https://graph.microsoft.io/en-us/getting-started) в приложение Java!

## 1. Установка

### 1.1 Установка с помощью Gradle

Добавьте репозиторий и зависимость компиляции для `microsoft-graph` в `build.gradle` вашего проекта:

```gradle
repository {
    jcenter()
}

dependency {
    // Include the sdk as a dependency
    compile('com.microsoft.graph:microsoft-graph:1.5.+')
}
```

### 1.2 Установка с помощью Maven
Добавьте зависимость в раздел `Зависимости` в pom.xml
```dependency
<dependency>
	<groupId>com.microsoft.graph</groupId>
	<artifactId>microsoft-graph</artifactId>
	<version>1.5.0</version>
</dependency>
```

### 1.3 Включение ProGuard (Android)
Сущность API Graph такова, что для описания функций пакета SDK необходимо использовать довольно большой набор классов. Убедитесь в том, что [ProGuard](https://developer.android.com/studio/build/shrink-code.html) включен в вашем проекте. В противном случае вы потратите много времени на подключение функций, необязательных для вашего конкретного приложения. Если вы все равно превышаете ограничение для метода 64K, включите [мультидексинг](https://developer.android.com/studio/build/multidex.html).

## 2. Начало работы

### 2.1 Регистрация приложения

Зарегистрируйте приложение, выполнив действия, описанные в статье [Регистрация приложения с помощью конечной точки Azure AD версии 2.0](https://developer.microsoft.com/ru-ru/graph/docs/concepts/auth_register_app_v2).

### 2.2 Создание объекта IAuthenticationProvider

Экземпляр класса **GraphServiceClient** обрабатывает запросы на создание, отправляя их в API Microsoft Graph и обрабатывая ответы. Чтобы создать экземпляр этого класса, требуется предоставить экземпляр объекта `IAuthenticationProvider`, который может проверять подлинность запросов к Microsoft Graph.

Пример проверки подлинности в клиентском приложении см. в статье [Проверка подлинности MSA на устройствах с Android с помощью пакета SDK MS Graph для адаптера Android](https://github.com/microsoftgraph/msgraph-sdk-android-msa-auth-for-android-adapter).

### 2.3 Получение объекта GraphServiceClient
После настройки идентификатора приложения и URL-адреса, необходимо получить объект **GraphServiceClient**, чтобы отправить запросы к службе. В пакете SDK хранятся сведения об учетной записи, но при первом входе пользователя в систему открывается интерфейс для получения сведений об его учетной записи.

```java
IGraphServiceClient graphClient = 
  GraphServiceClient
    .builder()
    .authenticationProvider(authenticationProvider)
    .buildClient();
```

## 3. Создание запросов к службе

Проверив подлинность GraphServiceClient, можно приступить к созданию запросов к службе. Запрос к службе выглядит так же, как и [REST API](https://developer.microsoft.com/ru-ru/graph/docs/concepts/overview).

### 3.1 Получение диска пользователя

Чтобы получить диск пользователя, выполните следующую команду:

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

Общие сведения о структуре пакета SDK см. в [обзоре](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview).

## 4. Документация

Для получения более подробной документации см. следующие статьи:

* [Обзор](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview)
* [Расширение библиотеки](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Extending-the-Library)
* [Обработка открытых типов. Поддержка PATCH со значением `null`](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Open-Types)
* [Коллекции](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Collections)
* [Создание пользовательских запросов](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Custom-Requests)
* [Известные проблемы](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Known-Issues)
* [Участие](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md)

## 5. Проблемы

Известные проблемы см. в статье [Проблемы](https://github.com/MicrosoftGraph/msgraph-sdk-java/issues).

## 6. Участие

Пакет SDK Microsoft Graph открыт для участников. Сведения о том, как принять участие в проекте, см. в статье [Участие](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md).

Благодаря всем пользователям, которые выделили время на совершенствование библиотеки,

<!-- ALL-CONTRIBUTORS-LIST:START  -->
<!-- prettier-ignore -->
| [<img src="https://avatars.githubusercontent.com/u/2273297?v=4" width="100px;"/><br /><sub><b>Caitlin Bales</b></sub>](https://developer.microsoft.com/graph)<br />[💬](#question-cbales "Answering Questions") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") [👀](#review-cbales "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Tests")| [<img src="https://avatars.githubusercontent.com/u/318187?v=4" width="100px;"/><br /><sub><b>David Moten</b></sub>](https://github.com/davidmoten)<br /> [🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3Adavidmoten "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/commit/87389b5a4240072e3f2226a2f04f089916ffed0b#diff-04c6e90faac2675aa89e2176d2eec7d8 "Documentation") [🤔](#ideas-davidmoten "Ideas & Planning") [👀](#review-davidmoten "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Tests") | [<img src="https://avatars.githubusercontent.com/u/8527305?v=4" width="100px;"/><br /><sub><b>Michael Mainer</b></sub>](https://developer.microsoft.com/graph)<br /> [💬](#question-cbales "Answering Questions") [🤔](#ideas-MIchaelMainer "Ideas & Planning") [👀](#review-MIchaelMainer "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/27295799?v=4" width="100px;"/><br /><sub><b>Linda Caputo</b></sub>](https://developer.microsoft.com/graph)<br />[📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") | [<img src="https://avatars.githubusercontent.com/u/8884923?v=4" width="100px;"/><br /><sub><b>John Austin</b></sub>](https://developer.microsoft.com/graph)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues "Bug reports") | [<img src="https://avatars.githubusercontent.com/u/3460953?v=4" width="100px;"/><br /><sub><b>Dmitry Pimenov</b></sub>](https://developer.microsoft.com/graph)<br />[🤔](#ideas-dpim "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/1427840?v=4" width="100px;"/><br /><sub><b>Jonathan Giles</b></sub>](https://github.com/JonathanGiles)<br />[🤔](#ideas-JonathanGiles "Ideas & Planning") |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  [<img src="https://avatars.githubusercontent.com/u/881767?v=4" width="100px;"/><br /><sub><b>Martin Sawicki</b></sub>](https://github.com/martinsawicki)<br />[🤔](#ideas-martinsawicki "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/29152134?v=4" width="100px;"/><br /><sub><b>Louis Maresca</b></sub>](https://github.com/LouMM)<br />[🤔](#ideas-LouMM "Ideas & Planning") [👀](#review-LouMM "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/604089?v=4" width="100px;"/><br /><sub><b>Josef H.B. Schneider</b></sub>](https://j0s.at/)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3AJ0s3f "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=J0s3f "Code") | [<img src="https://avatars2.githubusercontent.com/u/3197588?v=4" width="100px;"/><br /><sub><b>Deepak Agrawal</b></sub>](https://github.com/deepak2016)<br />[💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=deepak2016 "Code") | <img src="https://avatars.githubusercontent.com/u/22523479?v=4" width="100px;"/><br /><sub><b>Ben Tipper</b></sub><br /> | [<img src="https://avatars3.githubusercontent.com/u/16473684?v=4" width="100px;"/><br /><sub><b>Nakul Sabharwal</b></sub>](https://github.com/NakulSabharwal)<br />[💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=NakulSabharwal "Code") [👀](#review-NakulSabharwal "Reviewed Pull Requests")
<!-- ALL-CONTRIBUTORS-LIST:END -->

этот проект соответствует общей спецификации [всех участников](https://github.com/kentcdodds/all-contributors). Любое участие приветствуется!

## 7. Поддерживаемые версии Java
Библиотека пакета SDK Microsoft Graph для Java поддерживается в среде выполнения для Java 7+, [API Android версии 15](http://source.android.com/source/build-numbers.html) и более поздних версий.

## 8. Лицензия

© Корпорация Майкрософт (Microsoft Corporation). Все права защищены. Предоставляется по [лицензии MIT](LICENSE).

## 9. Уведомления третьих лиц

[Уведомления третьих лиц](THIRD%20PARTY%20NOTICES)
