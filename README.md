# Preview Microsoft Graph SDK for Java
*This SDK is currently in preview. Please continue to provide [feedback](https://github.com/microsoftgraph/msgraph-sdk-java/issues/new) as we iterate towards a production-supported library.*

[ ![Download](https://api.bintray.com/packages/microsoftgraph/Maven/microsoft-graph/images/download.svg) ](https://bintray.com/microsoftgraph/Maven/microsoft-graph/_latestVersion)


Get started with the Microsoft Graph SDK for Java by integrating the [Microsoft Graph API](https://graph.microsoft.io/en-us/getting-started) into your Java application!

## 1. Installation

### 1.1 Install via Gradle

Add the repository and a compile dependency for `microsoft-graph` to your project's `build.gradle`:

```gradle
repository {
    jcenter {
        url "https://dl.bintray.com/microsoftgraph/Maven"
    }
}

dependency {
    // Include the sdk as a dependency
    compile('com.microsoft.graph:microsoft-graph:0.1.+')
}
```

### 1.2 Enable ProGuard (Android)
The nature of the Graph API is such that the SDK needs quite a large set of classes to describe its functionality. You need to ensure that [ProGuard](https://developer.android.com/studio/build/shrink-code.html) is enabled on your project. Otherwise, you will incur long build times for functionality that is not necessarily relevant to your particular application. If you are still hitting the 64K method limit, you can also enable [multidexing](https://developer.android.com/studio/build/multidex.html).

## 2. Getting started

### 2.1 Register your application

Register your application by following the steps at [Register your app with the Azure AD v2.0 endpoint](https://developer.microsoft.com/en-us/graph/docs/concepts/auth_register_app_v2).

### 2.2 Create an IAuthenticationProvider object

An instance of the **GraphServiceClient** class handles building requests, sending them to the Microsoft Graph API, and processing the responses. To create a new instance of this class, you need to provide an instance of `IAuthenticationProvider`, which can authenticate requests to Microsoft Graph.

For an example of authentication in a client application, see the [MSGraph SDK Android MSA Auth for Android Adapter](https://github.com/microsoftgraph/msgraph-sdk-android-msa-auth-for-android-adapter).

### 2.3 Get a GraphServiceClient object
After you have set the correct application ID and URL, you must get a **GraphServiceClient** object to make requests against the service. The SDK stores the account information for you, but when a user signs in for the first time, it invokes the UI to get the user's account information.

```java
IGraphServiceClient graphClient = 
  GraphServiceClient
    .builder()
    .authenticationProvider(authenticationProvider)
    .buildClient();
```

## 3. Make requests against the service

After you have a GraphServiceClient that is authenticated, you can begin making calls against the service. The requests against the service look like our [REST API](https://developer.microsoft.com/en-us/graph/docs/concepts/overview).

### 3.1 Get the user's drive

To retrieve the user's drive:

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

For a general overview of how the SDK is designed, see [overview](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview).

## 4. Documentation

For more detailed documentation, see:

* [Overview](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview)
* [Extending the library](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Extending-the-Library)
* [Handling Open Types, PATCH support with `null` values](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Open-Types)
* [Collections](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Collections)
* [Making custom requests](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Custom-Requests)
* [Known issues](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Known-Issues)
* [Contributions](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md)

## 5. Issues

For known issues, see [issues](https://github.com/MicrosoftGraph/msgraph-sdk-java/issues).

## 6. Contributions

The Microsoft Graph SDK is open for contribution. To contribute to this project, see [Contributing](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md).

Thanks to everyone who has already devoted time to improving the library:

<!-- ALL-CONTRIBUTORS-LIST:START  -->
<!-- prettier-ignore -->
| [<img src="https://avatars.githubusercontent.com/u/2273297?v=4" width="100px;"/><br /><sub><b>Caitlin Bales</b></sub>](https://developer.microsoft.com/graph)<br />[💬](#question-cbales "Answering Questions") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") [👀](#review-cbales "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Tests")| [<img src="https://avatars.githubusercontent.com/u/318187?v=4" width="100px;"/><br /><sub><b>David Moten</b></sub>](https://github.com/davidmoten)<br /> [🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3Adavidmoten "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/commit/87389b5a4240072e3f2226a2f04f089916ffed0b#diff-04c6e90faac2675aa89e2176d2eec7d8 "Documentation") [🤔](#ideas-davidmoten "Ideas & Planning") [👀](#review-davidmoten "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Tests") | [<img src="https://avatars.githubusercontent.com/u/8527305?v=4" width="100px;"/><br /><sub><b>Michael Mainer</b></sub>](https://developer.microsoft.com/graph)<br /> [💬](#question-cbales "Answering Questions") [🤔](#ideas-MIchaelMainer "Ideas & Planning") [👀](#review-MIchaelMainer "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/27295799?v=4" width="100px;"/><br /><sub><b>Linda Caputo</b></sub>](https://developer.microsoft.com/graph)<br />[📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") | [<img src="https://avatars.githubusercontent.com/u/8884923?v=4" width="100px;"/><br /><sub><b>John Austin</b></sub>](https://developer.microsoft.com/graph)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues "Bug reports") | [<img src="https://avatars.githubusercontent.com/u/3460953?v=4" width="100px;"/><br /><sub><b>Dmitry Pimenov</b></sub>](https://developer.microsoft.com/graph)<br />[🤔](#ideas-dpim "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/1427840?v=4" width="100px;"/><br /><sub><b>Jonathan Giles</b></sub>](https://github.com/JonathanGiles)<br />[🤔](#ideas-JonathanGiles "Ideas & Planning") |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  [<img src="https://avatars.githubusercontent.com/u/881767?v=4" width="100px;"/><br /><sub><b>Martin Sawicki</b></sub>](https://github.com/martinsawicki)<br />[🤔](#ideas-martinsawicki "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/29152134?v=4" width="100px;"/><br /><sub><b>Louis Maresca</b></sub>](https://github.com/LouMM)<br />[🤔](#ideas-LouMM "Ideas & Planning") [👀](#review-LouMM "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/604089?v=4" width="100px;"/><br /><sub><b>Josef H.B. Schneider</b></sub>](https://j0s.at/)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3AJ0s3f "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=J0s3f "Code") |
<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/kentcdodds/all-contributors) specification. Contributions of any kind are welcome!

## 7. Supported Java versions
The Microsoft Graph SDK for Java library is supported at runtime for Java 7+ and [Android API revision 15](http://source.android.com/source/build-numbers.html) and greater.

## 8. License

Copyright (c) Microsoft Corporation. All Rights Reserved. Licensed under the [MIT license](LICENSE).

## 9. Third-party notices

[Third-party notices](THIRD%20PARTY%20NOTICES)
