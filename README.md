# Preview Microsoft Graph SDK for Java
*This SDK is currently in preview. Please continue to provide [feedback](https://github.com/microsoftgraph/msgraph-sdk-java/issues/new) as we iterate towards a production-supported library.*

# Get started with the Microsoft Graph SDK for Java

Integrate the [Microsoft Graph API](https://developer.microsoft.com/graph) into your Java application!

## 1. Installation
### 1.1 Install via Gradle
Add the JCenter repository and a compile dependency for `microsoft-graph` to your project's `build.gradle`

```gradle
repository {
    jcenter()
}

dependency {
    // Include the sdk as a dependency
    compile('com.microsoft.graph:microsoft-graph:0.1.+')
}
```

### 1.2 Enable ProGuard (Android)

The nature of the Graph API is such that the SDK needs quite a large set of classes to describe its functionality. You will need to ensure that [ProGuard](https://developer.android.com/studio/build/shrink-code.html) is enabled on your project. Otherwise, you will incur long build times for functionality that is not necessary relevant to your particular application. If you are still hitting the 64k method limit, you can also enable [multidexing](https://developer.android.com/studio/build/multidex.html).

## 2. Getting started

### 2.1 Register your application

Register your application by following [these](https://developer.microsoft.com/en-us/graph/docs/concepts/auth_register_app_v2) steps.

### 2.2 Create an IAuthenticationProvider object

An instance of the **GraphServiceClient** class handles building requests,
sending them to the Microsoft Graph API, and processing the responses. To create a
new instance of this class, you need to provide an instance of
`IAuthenticationProvider` which can authenticate requests to Microsoft Graph.

For an example of authentication in a client application see the [MSGraph SDK Android MSA Auth for Android Adapter](https://github.com/microsoftgraph/msgraph-sdk-android-msa-auth-for-android-adapter).

### 2.3 Get a GraphServiceClient object

Once you have set the correct application ID and url, you must get a **GraphServiceClient** object to make requests against the service. The SDK will store the account information for you, but when a user logs on for the first time, it will invoke UI to get the user's account information.

```java
IClientConfig clientConfig = 
  DefaultClientConfig.createWithAuthenticationProvider(mAuthenticationProvider);

IGraphServiceClient graphClient = 
  GraphServiceClient.builder()
    .fromConfig(mClientConfig)
    .buildClient();
```

## 3. Make requests against the service

Once you have a GraphServiceClient that is authenticated you can begin making calls against the service. The requests against the service look like our [REST API](https://developer.microsoft.com/en-us/graph/docs/concepts/overview).

### Get the user's drive

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

For a more detailed documentation see:

* [Overview](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview)
* [Extending the library](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Extending-the-Library)
* [Handling Open Types, PATCH support with `null` values](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Open-Types)
* [Collections](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Working-with-Collections)
* [Making Custom Requests](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Custom-Requests)
* [Known Issues](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Known-Issues)
* [Contributions](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md)

## 5. Issues

For known issues, see [issues](https://github.com/MicrosoftGraph/msgraph-sdk-java/issues).

## 6. Contributions

The Microsoft Graph SDK is open for contribution. Please read how to contribute to this project [here](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md).

Thanks to everyone who has already devoted time to improving the library:

<!-- ALL-CONTRIBUTORS-LIST:START  -->
<!-- prettier-ignore -->
| [<img src="https://avatars.githubusercontent.com/u/2273297?v=4" width="100px;"/><br /><sub><b>Caitlin Bales</b></sub>](https://developer.microsoft.com/graph)<br />[💬](#question-cbales "Answering Questions") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") [👀](#review-cbales "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=cbales "Tests")| [<img src="https://avatars.githubusercontent.com/u/318187?v=4" width="100px;"/><br /><sub><b>David Moten</b></sub>](https://github.com/davidmoten)<br /> [🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues?q=is%3Aissue+author%3Adavidmoten "Bug reports") [💻](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Code") [📖](https://github.com/microsoftgraph/msgraph-sdk-java/commit/87389b5a4240072e3f2226a2f04f089916ffed0b#diff-04c6e90faac2675aa89e2176d2eec7d8 "Documentation") [🤔](#ideas-davidmoten "Ideas & Planning") [👀](#review-davidmoten "Reviewed Pull Requests") [⚠️](https://github.com/microsoftgraph/msgraph-sdk-java/commits?author=davidmoten "Tests") | [<img src="https://avatars.githubusercontent.com/u/8527305?v=4" width="100px;"/><br /><sub><b>Michael Mainer</b></sub>](https://developer.microsoft.com/graph)<br /> [💬](#question-cbales "Answering Questions") [🤔](#ideas-MIchaelMainer "Ideas & Planning") [👀](#review-MIchaelMainer "Reviewed Pull Requests") | [<img src="https://avatars.githubusercontent.com/u/27295799?v=4" width="100px;"/><br /><sub><b>Linda Caputo</b></sub>](https://developer.microsoft.com/graph)<br />[📖](https://github.com/microsoftgraph/msgraph-sdk-java/wiki "Documentation") | [<img src="https://avatars.githubusercontent.com/u/8884923?v=4" width="100px;"/><br /><sub><b>John Austin</b></sub>](https://developer.microsoft.com/graph)<br />[🐛](https://github.com/microsoftgraph/msgraph-sdk-java/issues "Bug reports") | [<img src="https://avatars.githubusercontent.com/u/3460953?v=4" width="100px;"/><br /><sub><b>Dmitry Pimenov</b></sub>](https://developer.microsoft.com/graph)<br />[🤔](#ideas-dpim "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/1427840?v=4" width="100px;"/><br /><sub><b>Jonathan Giles</b></sub>](https://github.com/JonathanGiles)<br />[🤔](#ideas-JonathanGiles "Ideas & Planning") |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  [<img src="https://avatars.githubusercontent.com/u/881767?v=4" width="100px;"/><br /><sub><b>Martin Sawicki</b></sub>](https://github.com/martinsawicki)<br />[🤔](#ideas-martinsawicki "Ideas & Planning") | [<img src="https://avatars.githubusercontent.com/u/29152134?v=4" width="100px;"/><br /><sub><b>Louis Maresca</b></sub>](https://github.com/LouMM)<br />[🤔](#ideas-LouMM "Ideas & Planning") [👀](#review-LouMM "Reviewed Pull Requests") |
<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/kentcdodds/all-contributors) specification. Contributions of any kind are welcome!

## 7. Supported Java Versions
The Microsoft Graph SDK for Java library is supported at runtime for Java 7+ and [Android API revision 15](http://source.android.com/source/build-numbers.html) and greater.

## 8. License

Copyright (c) Microsoft Corporation. All Rights Reserved. Licensed under the [MIT license](LICENSE).

## 9. Third Party Notices

[Third Party Notices](THIRD%20PARTY%20NOTICES)
