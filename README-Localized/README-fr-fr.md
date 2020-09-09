\# Kit de développement logiciel Microsoft Graph pour Java

[ ![Téléchargement](https://api.bintray.com/packages/microsoftgraph/Maven/microsoft-graph/images/download.svg) ](https://bintray.com/microsoftgraph/Maven/microsoft-graph/_latestVersion)


Prise en main du kit de développement logiciel (SDK) Microsoft Graph pour Java en intégrant l'[API Microsoft Graph](https://graph.microsoft.io/en-us/getting-started) dans votre application Java !

## 1. Installation

### 1.1 Installation via Gradle

Ajoutez le référentiel et une dépendance de compilation pour `microsoft-graph` à `build.gradle` de votre projet :

```gradle
repository {
    jcenter()
}

dependency {
    // Include the sdk as a dependency
    compile('com.microsoft.graph:microsoft-graph:1.5.+')
}
```

### 1.2 Installation via Maven
Ajoutez la dépendance dans `dépendances` dans pom.xml
```dependency
<dependency>
	<groupId>com.microsoft.graph</groupId>
	<artifactId>microsoft-graph</artifactId>
	<version>1.5.0</version>
</dependency>
```

### 1.3 Activer ProGuard (Android)
La nature de l’API Graph est telle que le kit de développement logiciel nécessite un groupe important de classes pour décrire ses fonctionnalités. Vous devez vous assurer que [ProGuard](https://developer.android.com/studio/build/shrink-code.html) est activé sur votre projet. Dans le cas contraire, vous vous exposez à de longues heures de build pour une fonctionnalité qui n'est pas pertinente dans l'application concernée. Si vous atteignez toujours la limite de la méthode 64k, vous pouvez également activer [multidexing](https://developer.android.com/studio/build/multidex.html).

## 2. Prise en main

### 2.1 Inscription de votre application

Enregistrez votre application en suivant les étapes décrites dans [Inscrire votre application avec le point de terminaison Azure AD v2.0](https://developer.microsoft.com/fr-fr/graph/docs/concepts/auth_register_app_v2).

### 2.2 Créer un objet IAuthenticationProvider

Une instance de la classe **GraphServiceClient** gère la création de demandes en les envoyant vers l’API Microsoft Graph et en traitant les réponses. Pour créer une nouvelle instance de cette classe, vous devez fournir une instance `IAuthenticationProvider`, laquelle peut authentifier les demandes adressées à Microsoft Graph.

Pour obtenir un exemple d’authentification dans une application cliente, voir le [Kit de développement logiciel Android MSGraph pour adaptateur Android](https://github.com/microsoftgraph/msgraph-sdk-android-msa-auth-for-android-adapter).

### 2.3 Obtenir un objet GraphServiceClient
Après avoir configuré les corrects ID et URL d'application, vous devez obtenir un objet **GraphServiceClient** pour formuler des demandes auprès du service. Le kit de développement logiciel stocke les informations de compte à votre place, mais lorsqu’un utilisateur ouvre une session pour la première fois, il appelle l'interface utilisateur pour obtenir les informations de compte utilisateur.

```java
IGraphServiceClient graphClient = 
  GraphServiceClient
    .builder()
    .authenticationProvider(authenticationProvider)
    .buildClient();
```

## 3. Effectuer des demandes auprès du service

Après avoir authentifié un GraphServiceClient, vous pouvez commencer à effectuer des appels auprès du service. Les demandes effectuées auprès du service ressemblent à celles de notre [API REST](https://developer.microsoft.com/fr-fr/graph/docs/concepts/overview).

### 3.1 Obtenir le lecteur de l’utilisateur

Récupérer le lecteur d’un utilisateur :

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

Pour obtenir une vue générale sur la conception du kit de développement logiciel, voir [vue d’ensemble](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview).

## 4. Documentation

Pour plus de détails, voir :

* [Vue d'ensemble](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview)
* [Extension de la bibliothèque](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Extending-the-Library)
* [Gestion des types ouverts, prise en charge des CORRECTIFS avec des `null` valeurs](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Open-Types)
* [Collections](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Collections)
* [Envoyer des demandes personnalisées](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Custom-Requests)
* [Problèmes connus](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Known-Issues)
* [Contributions](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md)

## 5. Problèmes

Pour les problèmes connus, voir [problèmes](https://github.com/MicrosoftGraph/msgraph-sdk-java/issues).

## 6. Contributions

Le kit de développement logiciel Microsoft Graph est ouvert aux contributions. Pour contribuer à ce projet, voir [Contribution](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md).

Merci à toutes les personnes qui ont déjà consacré du temps à améliorer la bibliothèque :

<!-- ALL-CONTRIBUTORS-LIST:START  -->
<!-- prettier-ignore -->
| [<img src="https://avatars.githubusercontent.com/u/2273297?v=4" width="100px;"/><br /><sub><b>Caitlin Bales</b></sub>](https://developer.microsoft.com/graph)<br />[💬](#question-cbales "Answering Questions") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") [👀](#review-cbales "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Tests")| [<img src="https://avatars.githubusercontent.com/u/318187?v=4" width="100px;"/><br /><sub><b>David Moten</b></sub>](https://github.com/davidmoten)<br /> [🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3Adavidmoten "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/commit/87389b5a4240072e3f2226a2f04f089916ffed0b#diff-04c6e90faac2675aa89e2176d2eec7d8 "Documentation") [🤔](#ideas-davidmoten "Ideas & Planning") [👀](#review-davidmoten "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Tests") | [<img src="https://avatars.githubusercontent.com/u/8527305?v=4" width="100px;"/><br /><sub><b>Michael Mainer</b></sub>](https://developer.microsoft.com/graph)<br /> [💬](#question-cbales "Answering Questions") [🤔](#ideas-MIchaelMainer "Ideas & Planning") [👀](#review-MIchaelMainer "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/27295799?v=4" width="100px;"/><br /><sub><b>Linda Caputo</b></sub>](https://developer.microsoft.com/graph)<br />[📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") | [<img src="https://avatars.githubusercontent.com/u/8884923?v=4" width="100px;"/><br /><sub><b>John Austin</b></sub>](https://developer.microsoft.com/graph)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues "Bug reports") | [<img src="https://avatars.githubusercontent.com/u/3460953?v=4" width="100px;"/><br /><sub><b>Dmitry Pimenov</b></sub>](https://developer.microsoft.com/graph)<br />[🤔](#ideas-dpim "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/1427840?v=4" width="100px;"/><br /><sub><b>Jonathan Giles</b></sub>](https://github.com/JonathanGiles)<br />[🤔](#ideas-JonathanGiles "Ideas & Planning") |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  [<img src="https://avatars.githubusercontent.com/u/881767?v=4" width="100px;"/><br /><sub><b>Martin Sawicki</b></sub>](https://github.com/martinsawicki)<br />[🤔](#ideas-martinsawicki "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/29152134?v=4" width="100px;"/><br /><sub><b>Louis Maresca</b></sub>](https://github.com/LouMM)<br />[🤔](#ideas-LouMM "Ideas & Planning") [👀](#review-LouMM "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/604089?v=4" width="100px;"/><br /><sub><b>Josef H.B. Schneider</b></sub>](https://j0s.at/)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3AJ0s3f "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=J0s3f "Code") | [<img src="https://avatars2.githubusercontent.com/u/3197588?v=4" width="100px;"/><br /><sub><b>Deepak Agrawal</b></sub>](https://github.com/deepak2016)<br />[💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=deepak2016 "Code") | <img src="https://avatars.githubusercontent.com/u/22523479?v=4" width="100px;"/><br /><sub><b>Ben Tipper</b></sub><br /> | [<img src="https://avatars3.githubusercontent.com/u/16473684?v=4" width="100px;"/><br /><sub><b>Nakul Sabharwal</b></sub>](https://github.com/NakulSabharwal)<br />[💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=NakulSabharwal "Code") [👀](#review-NakulSabharwal "Reviewed Pull Requests")
<!-- ALL-CONTRIBUTORS-LIST:END -->

Ce projet suit la spécification [all-contributors](https://github.com/kentcdodds/all-contributors). Les contributions de tout genre sont les bienvenues !

## 7. Versions Java prises en charge
Le kit de développement logiciel Microsoft Graph pour bibliothèque Java est pris en charge lors de l’exécution pour Java 7+ et l'[API Android version 15](http://source.android.com/source/build-numbers.html) et versions ultérieures.

## 8. Licence

Copyright (c) Microsoft Corporation. Tous droits réservés. Sous [licence MIT](LICENSE).

## 9. Notifications tierces

[Notifications tierces](THIRD%20PARTY%20NOTICES)
