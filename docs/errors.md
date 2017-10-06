# Handling errors in the Microsoft Graph SDK for Android

Errors in the Graph SDK for Android behave just like errors returned from the service. You can read more about them [here](https://graph.microsoft.io/en-us/docs/overview/errors).

Anytime you make a request against the service there is the potential for an error. You will see that all requests to the service can return an error. The errors are returned as `ClientException`, with possible subclasses `GraphServiceException` which your application will want to handle.

## Checking the error

There are a few different types of errors that can occur during a network call. We have provided some helper methods to make it easy to check what kind of error occurred. These error types are defined in [GraphErrorCodes.java](../graphsdk/src/main/java/com/microsoft/graph/core/GraphErrorCodes.java).

```java
try {
    // ...
} catch (final ClientExcepion ex) {
    if (ex.isError(GraphErrorCodes.AuthenticationFailure)) {
        // Handle the specific authentication failure
    }
    // Handle the authentication exception
}
```

### Graph service exceptions

These are exceptions from the Graph service, that contain extra error diagnostic information. The standard error codes should give your application more than enough detail to message users. However, there is useful debug information contained in the response.

__Note__: Sometimes you might see a `GraphFatalServiceException`. If you do, please open a [new issue](https://github.com/microsoftgraph/msgraph-sdk-android/issues/new) so that we can fix it.
