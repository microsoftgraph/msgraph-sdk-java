# Microsoft Graph SDK for Java

[![Download](https://img.shields.io/maven-central/v/com.microsoft.graph/microsoft-graph.svg)](https://search.maven.org/artifact/com.microsoft.graph/microsoft-graph)

Get started with the Microsoft Graph SDK for Java by integrating the [Microsoft Graph API](https://developer.microsoft.com/en-us/graph/get-started/java) into your Java application!

> **Note:** this SDK allows you to build applications using the [v1.0](https://docs.microsoft.com/en-us/graph/use-the-api#version) of Microsoft Graph. If you want to try the latest Microsoft Graph APIs under beta, use our [beta SDK](https://github.com/microsoftgraph/msgraph-beta-sdk-java) instead.

## 1. Installation

### 1.1 Install via Gradle

Add the repository and a compile dependency for `microsoft-graph` to your project's `build.gradle`:

```groovy
repositories {
    mavenCentral()
}

dependencies {
    // Include the sdk as a dependency
    implementation 'com.microsoft.graph:microsoft-graph:4.2.0'
    // Uncomment the line below if you are building an android application
    //implementation 'com.google.guava:guava:30.1.1-android'
    // This dependency is only needed if you are using the TokenCrendentialAuthProvider
    implementation 'com.azure:azure-identity:1.2.5'
}
```

### 1.2 Install via Maven

Add the dependency in `dependencies` in pom.xml

```xml
<dependency>
  <!-- Include the sdk as a dependency -->
  <groupId>com.microsoft.graph</groupId>
  <artifactId>microsoft-graph</artifactId>
  <version>4.2.0</version>
</dependency>
<dependency>
  <!-- This dependency is only needed if you are using the TokenCrendentialAuthProvider -->
  <groupId>com.azure</groupId>
  <artifactId>azure-identity</artifactId>
  <version>1.2.5</version>
</dependency>
```

### 1.3 Enable ProGuard (Android)

The nature of the Graph API is such that the SDK needs quite a large set of classes to describe its functionality. You need to ensure that [ProGuard](https://developer.android.com/studio/build/shrink-code.html) is enabled on your project. Otherwise, you will incur long build times for functionality that is not necessarily relevant to your particular application. If you are still hitting the 64K method limit, you can also enable [multidexing](https://developer.android.com/studio/build/multidex.html). Checkout the [recommended rules](./docs/proguard-rules.txt).

## 2. Getting started

### 2.1 Register your application

Register your application by following the steps at [Register your app with the Azure AD v2.0 endpoint](https://developer.microsoft.com/en-us/graph/docs/concepts/auth_register_app_v2).

### 2.2 Create an IAuthenticationProvider object

An instance of the **GraphServiceClient** class handles building requests, sending them to the Microsoft Graph API, and processing the responses. To create a new instance of this class, you need to provide an instance of `IAuthenticationProvider`, which can authenticate requests to Microsoft Graph.

For an example of how to get an authentication provider, see [choose a Microsoft Graph authentication provider](https://docs.microsoft.com/graph/sdks/choose-authentication-providers?tabs=Java).

### 2.3 Get a GraphServiceClient object

After you have set the correct application ID and URL, you must get a **GraphServiceClient** object to make requests against the service. The SDK stores the account information for you, but when a user signs in for the first time, it invokes the UI to get the user's account information.

```java
GraphServiceClient<Request> graphClient = 
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
final Drive result = graphClient
  .me()
  .drive()
  .buildRequest()
  .get();
System.out.println("Found Drive " + result.id);
```

Or with the asynchronous API.

```java
graphClient
  .me()
  .drive()
  .buildRequest()
  .futureGet()
  .thenApply(result -> {
    System.out.println("Found Drive " + result.id);
  });
```

## 4. Documentation

For more detailed documentation, see:

* [Overview](https://docs.microsoft.com/graph/overview)
* [Collections](https://docs.microsoft.com/graph/sdks/paging)
* [Making requests](https://docs.microsoft.com/graph/sdks/create-requests)
* [Known issues](https://github.com/MicrosoftGraph/msgraph-sdk-java/issues)
* [Contributions](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md)

## 5. Issues

For known issues, see [issues](https://github.com/MicrosoftGraph/msgraph-sdk-java/issues).

## 6. Contributions

The Microsoft Graph SDK is open for contribution. To contribute to this project, see [Contributing](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/CONTRIBUTING.md).

## 7. Supported Java versions

The Microsoft Graph SDK for Java library is supported at runtime for Java 8+ and [Android API revision 26](http://source.android.com/source/build-numbers.html) and greater.

Android developers targeting lower android API levels can do so by [enabling desugaring](https://developer.android.com/studio/write/java8-support#library-desugaring) in their project.

## 8. License

Copyright (c) Microsoft Corporation. All Rights Reserved. Licensed under the [MIT license](LICENSE).

## 9. Third-party notices

[Third-party notices](THIRD%20PARTY%20NOTICES)












