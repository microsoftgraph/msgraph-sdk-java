# Preview Microsoft Graph SDK for Java
This client library is currently in private preview status. This means that: 
- The API surface may change significantly
- Non-blocking issues *may* be triaged at a slower pace
- You may submit feedback through issues or PRs. You will have a better chance of your changes being implemented if they are submitted before public preview release
- We do not define an SLA or support strategy for this library

We welcome your feedback as we drive the quality of this to general availability.

# Get started with the Microsoft Graph SDK for Java

Integrate the [Microsoft Graph API](https://graph.microsoft.io/en-us/getting-started) into your Java application!

## 1. Installation
### 1.1 Install AAR via Gradle
Add the JCenter repository and a compile dependency for `msicrosoft-graph` to your project's `build.gradle`

```gradle
repository {
    jcenter()
}

dependency {
    // Include the sdk as a dependency
    compile('com.microsoft.graph:1.0.+')

    // Include the gson dependency
    compile('com.google.code.gson:gson:2.3.1')
}
```

### 1.2 Enable ProGuard (Android)
The nature of the Graph API is such that the SDK needs quite a large set of classes to describe its functionality. You will need to ensure that [ProGuard](https://developer.android.com/studio/build/shrink-code.html) is enabled on your project. Otherwise, you will incur long build times for functionality that is not necessary relevant to your particular application. If you are still hitting the 64k method limit, you can also enable [multidexing](https://developer.android.com/studio/build/multidex.html).

## 2. Getting started

### 2.1 Register your application

Register your application by following [these](https://developer.microsoft.com/en-us/graph/docs/concepts/auth_register_app_v2) steps.

### 2.2 Create an IAuthenticationProvider object

An instance of the **GraphServiceClient** class handles building requests,
sending them to Microsoft Graph API, and processing the responses. To create a
new instance of this class, you need to provide an instance of
`IAuthenticationProvider` which can authenticate requests to Microsoft Graph.

For an example of authentication in a client application see the [MSGraph SDK Android MSA Auth for Android Adapter](https://github.com/microsoftgraph/msgraph-sdk-android-msa-auth-for-android-adapter).

### 2.3 Get a GraphServiceClient object

Once you have set the correct application ID and url, you must get a **GraphServiceClient** object to make requests against the service. The SDK will store the account information for you, but when a user logs on for the first time, it will invoke UI to get the user's account information.

```java
final IClientConfig mCLientConfig = DefaultClientConfig
                                        .createWithAuthenticationProvider(mAuthenticationProvider);

final IGraphServiceClient mClient = new GraphServiceClient
                                            .Builder()
                                            .fromConfig(mClientConfig)
                                            .buildClient();
```

## 3. Make requests against the service

Once you have an GraphServiceClient that is authenticated you can begin making calls against the service. The requests against the service look like our [REST API](https://developer.microsoft.com/en-us/graph/docs/concepts/overview).

### Get the drive

To retrieve a user's drive:

```java
graphClient
    .me()
    .drive()
    .buildRequest()
    .get(new ICallback<Drive>() {
  @Override
  public void success(final Drive result) {
    final String msg = "Found Drive " + result.id;
    Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT)
        .show();
  }
  ...
  // Handle failure case
});
```

For a general overview of how the SDK is designed, see [overview](docs/overview.md).

## 4. Documentation

For a more detailed documentation see:

* [Overview](docs/overview.md)
* [Extensibility](docs/extensibility.md)
* [Handling Open Types, PATCH support with `null` values](docs/opentypes.md)
* [Collections](docs/collections.md)
* [Errors](docs/errors.md)
* [Making Custom Requests](docs/custom-queries.md)
* [Known Issues](docs/known-issues.md)
* [Contributions](docs/contributions.md)

## 5. Issues

For known issues, see [issues](https://github.com/MicrosoftGraph/msgraph-sdk-java/issues).

## 6. Contributions

The Microsoft Graph SDK is open for contribution. Please read how to contribute to this project [here](docs/contributions.md).

## 7. Supported Java Versions
The Microsoft Graph SDK for Java library is supported at runtime for Java 6+ and [Android API revision 15](http://source.android.com/source/build-numbers.html) and greater.

## 8. License

Copyright (c) Microsoft Corporation. All Rights Reserved. Licensed under the [MIT license](LICENSE).

## 9. Third Party Notices

[Third Party Notices](THIRD%20PARTY%20NOTICES)
