# Preview Microsoft Graph SDK for Java

This client library is currently in private preview status. This means that: 
- The API surface may change significantly.
- Non-blocking issues *may* be triaged at a slower pace.
- You may submit feedback through issues or PRs. You will have a better chance of your changes being implemented if they are submitted before public preview release.
- We do not define an SLA or support strategy for this library.

We welcome your feedback as we drive the quality of this to general availability.

Get started with the Microsoft Graph SDK for Java by integrating the [Microsoft Graph API](https://graph.microsoft.io/en-us/getting-started) into your Java application!

## 1. Installation

### 1.1 Install via Gradle

> [!NOTE] 
> This package will not be available via Gradle until it is in public preview. You need to download the source and reference the package locally.

Add the JCenter repository and a compile dependency for `microsoft-graph` to your project's `build.gradle`:

```gradle
repository {
    jcenter()
}

dependency {
    // Include the sdk as a dependency
    compile('com.microsoft.graph:msgraph-sdk-java:1.0.+')
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

<!--TODO: the following para needs expansion or removal. Would need to mention the different flows (authorization code flow, implicit flow, client credential flow) and give pointers on where to get sample code. Dave Moten can provide link for client credentials flow.-->

After you have set the correct application ID and URL, you must get a **GraphServiceClient** object to make requests against the service. The SDK stores the account information for you, but when a user signs in for the first time, it invokes the UI to get the user's account information.

```java
IClientConfig clientConfig = 
  DefaultClientConfig.createWithAuthenticationProvider(mAuthenticationProvider);

IGraphServiceClient graphClient = 
  GraphServiceClient.builder()
    .fromConfig(mClientConfig)
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

## 7. Supported Java versions
The Microsoft Graph SDK for Java library is supported at runtime for Java 7+ and [Android API revision 15](http://source.android.com/source/build-numbers.html) and greater.

## 8. License

Copyright (c) Microsoft Corporation. All Rights Reserved. Licensed under the [MIT license](LICENSE).

## 9. Third-party notices

[Third-party notices](THIRD%20PARTY%20NOTICES)
