# Microsoft Graph Java SDK v3 changelog and upgrade guide

Welcome to the Microsoft Graph Java SDK migration guide to v3. The purpose of this document is to list out any breaking change and migration work SDK users might run into while upgrading to the latest version of the SDK.

## Breaking changes

To improve the development experience provided by the SDK, it was necessary to make the following breaking changes in addition to the changes listed in the migration guide below:

- The minimum [android API level](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels) is now level 26 (from 15).
- The minimum Java version is now version 8 (from 7).

## Upgrade guide for breaking changes

The following section lists out the breaking changes requiring code changes from SDK users.

### Shorter package names

To upgrade your application do the following.

- Replace any reference to `com.microsoft.graph.models.generated` and `com.microsoft.graph.models.extensions` by `com.microsoft.graph.models`.
- Replace any reference to `com.microsoft.graph.requests.extensions` by `com.microsoft.graph.requests`.

### Cleanup of unnecessary interfaces

To provide a cleaner API surface and avoid shipping potentially breaking changes when properties are added, some interfaces have been removed. To upgrade your application do the following.

- Replace any reference to `IGraphServiceClient` by `GraphServiceClient`.
- Replace any reference to `IEntityCollectionPage` by `EntityCollectionPage` (e.g. `IEventCollectionPage`).

### Azure identity

The Microsoft Graph Java SDK now leverages azure-identity to improve the authentication experience. This new library provides support for [more authentication flows](https://docs.microsoft.com/graph/sdks/choose-authentication-providers?tabs=Java) and improves the configuration experience. To upgrade your application do the following.

- Remove any dependency on `microsoft-graph-auth` and replace them by one of the providers available in azure-identity.
- Remove any dependency on `microsoft-graph-android-auth` and replace them by one of the providers available in azure-identity.
- Reconsider the need for custom authentication providers (implementation of `IAuthenticationProvider` or `ICoreAuthenticationProvider`) that might be part of your project and use a provider available in azure-identity whenever possible.

Check out [this document](./upgrade-to-v3-auth.md) to find examples on how to upgrade your authentication providers to azure-identity providers.

### Single authentication provider interface

Due to historical reasons, the SDK provided two authentication provider interfaces `ICoreAuthenticationProvider` and `IAuthenticationProvider`. This was creating confusion and duplication and has been resolved to a single `IAuthenticationProvider` interface. To upgrade your application do the following.

- Replace any reference to `ICoreAuthenticationProvider` by `IAuthenticationProvider`.
- Update the implementation to match the new interface.
- Replace any reference to `com.microsoft.graph`.

> Note: if your project implements its own authentication provider, you might want to review the list of providers available with Azure identity to review whether a custom provider is still required. If a custom provider is still required, you should extend `BaseAuthenticationProvider` which provides a method to check whether a specific request should be authenticated based on its URL.

### Modern date and time API

To provide a modern, more reliable, and faster date and time API, `Calendar` properties have been replaced by `OffsetDateTime` properties. To upgrade your application do the following.

- Replace any `Calendar` assignment by `OffsetDateTime`.

### Fluent method parameter sets and support for optional parameters

To provide support for optional parameters for OData methods (actions, functions), the SDK now makes use of parameter classes with fluent builders. To upgrade your application do the following.

- Replace any OData method reference by it's parameter set equivalent.

   Example:

   ```Java
   final WorkbookRange workbookRange = graphClient.me()
             .drive()
             .items("{id}")
             .workbook()
             .worksheets("{id|name}")
             .range("A1:B2");
   ```

   Now becomes:

   ```Java
   final WorkbookRange workbookRange = graphClient.me()
             .drive()
             .items("{id}")
             .workbook()
             .worksheets("{id|name}")
             .range(WorkbookWorksheetRangeParameterSet
               .newBuilder()
               .withAddress("A1:B2")
               .build());
   ```

### Futures vs Callbacks

To provide a standard and modern way of executing requests asynchronously to SDK users, the custom defined `ICallback` interface has been removed and the API now returns `CompletableFuture`. To upgrade your application do the following.

- Replace any of the code built the following way

    ```Java
    graphClient
    .me()
    .drive()
    .buildRequest()
    .get(new ICallback<Drive>() {
      @Override
      public void success(final Drive result) {
        System.out.println("Found Drive " + result.id);
      }
    });
    ```

    By:

    ```Java
    graphClient
    .me()
    .drive()
    .buildRequest()
    .getAsync()
    .thenApply(result -> {
        System.out.println("Found Drive " + result.id);
    });
    ```

### Removal of connection configuration

As the connection configuration evolved over time, the connection configuration infrastructure had become redundant with the native library configuration capabilities. To upgrade your application do the following.

- Remove any reference to `IConnectionConfiguration` and re-implement the configuration using [Customize the Microsoft Graph SDK service client](https://docs.microsoft.com/graph/sdks/customize-client?tabs=java).

### Dependencies upgrade

- OkHttpClient has been upgraded from 3.X to 4.X.
- Google Guava has been upgraded from 20 to 30.

No action needs to be taken unless the project has a direct reference to an older version of those libraries, in which case the references need to be upgraded to match the versions listed here.

### float properties have been replaced by Float

As the OData specification mandates support for null values for numeric values, any property that previously was implemented using a float primitive type is now using a Float object type. To upgrade your application do the following.

- Replace any assignment from float to Float and check for null values.

### Merge of GraphServiceClient and BaseGraphServiceClient

To simplify the object model of the SDK, `BaseGraphServiceClient` has been merged into `GraphServiceClient`. To upgrade your application do the following.

- Replace any reference to `BaseGraphServiceClient` by `GraphServiceClient`.

### Generic refactoring

Requests, request builders, and responses have been refactored to take advantage of generic types. This maximizes code reusability improving performances, binary size and more. These changes should be transparent to most SDK consumers but it's possible to impact developers calling the SDK using reflection techniques.

### Batch object model improvements

The object model for JSON batching has been improved to provide a cleaner API surface to SDK users. To upgrade your application do the following.

- Replace any of the following patterns

    ```Java
    final MSBatchRequestContent batchRequestContent = new MSBatchRequestContent();
    final String meGetId = batchRequestContent.addbatchRequestStep(graphClient.me().buildRequest().withHttpMethod(HttpMethod.GET).getHttpRequest());
    final ICoreAuthenticationProvider auth = (ICoreAuthenticationProvider)graphClient.getAuthenticationProvider();
    final OkHttpClient client = HttpClients.createDefault(auth);
    final String batchContent = batchRequestContent.getBatchRequestContent();
    final Request batchRequest = new Request.Builder()
    .url("https://graph.microsoft.com/v1.0/$batch")
    .post(RequestBody.create(MediaType.parse("application/json"), batchContent))
    .build();
    final Response batchResponse = client.newCall(batchRequest).execute();
    final MSBatchResponseContent batchResponseContent = new MSBatchResponseContent(batchResponse);
    final Response userResponse = batchResponseContent.getResponseById(meGetId);
    ```

    By:

    ```Java
    final BatchRequestContent batchRequestContent = new BatchRequestContent();
    final String meGetId = batchRequestContent.addBatchRequestStep(graphClient.me().buildRequest(), HttpMethod.GET);
    final BatchResponseContent batchResponseContent = graphClient.batch().buildRequest().post(batchRequestContent);
    final User me = batchResponseContent.getResponseById(meGetId).getDeserializedBody(User.class);
    ```
    
    Requests with POST body should have the body object added to the `addBatchRequestStep` like so:
    ```Java
    IHttpRequest request = graphClient.me().contacts().buildRequest();
    batchRequestContent.addBatchRequestStep(request, HttpMethod.POST, body);
    ```

### IJsonBackedObject interface

The interface has been simplified to remove the `getRawObject` and `getSerializer` methods. This avoid entity and collection objects storing a copy of the JSON on top of the properties they already have, which improves drastically the memory impacts. To upgrade your application do the following.

- Replace any reference to `getRawObject` by `additionalDataManager`.
- Replace any reference to `getSerializer` by `graphClient.getSerializer` or create a new instance of the serializer.

### Improved delta API

When using [change tracking/delta APIs](https://docs.microsoft.com/graph/delta-query-overview) Microsoft Graph provides two types of links with the response collection:

- A next link whenever there are more change results to iterate through.
- A delta link whenever there are no more change results to iterate through at this instant. This is the link your application should use to get new changes in the future.

This new version improves the Java API provided to developers. To upgrade your application do the following.

- Replace any of the following

    ```Java
    graphClient.users().delta("https://mydeltalink").buildRequest().get();
    ```

    by

    ```Java
    graphClient.users().delta().buildRequest().deltaLink("https://mydeltalink").get();
    ```

- Replace any of the following

    ```Java
    graphClient.customRequest("mydeltaPathAndQuery").buildRequest().get();
    ```

    by

    ```Java
    graphClient.users().delta().buildRequest().deltaLink("https://mydeltalink").get();
    ```

> Note: the `DeltaCollectionPage` also offers a `getNextPage` method which simplifies iterating through results and removes the need for consumers to directly handle the next link themselves.

### ChunkedUploadProvider renamed to LargeFileUploadTask

The chunked upload provider has been renamed to large file upload task and moved from the concurrency package to the tasks package in order to align with SDK design specifications and to clarify the intent of the class. To upgrade your application do the following.

- Replace any of the following

    ```Java
    import com.microsoft.graph.requests.extensions.ChunkedUploadProvider;
    ```

    By

    ```Java
    import com.microsoft.graph.tasks.LargeFileUploadTask;
    ```

- Replace any of the following

    ```Java
    final DriveItem result = chunkedUploadProvider.upload();
    ```

    By

    ```Java
    final LargeFileUploadResult<DriveItem> result = largeFileUploadTask.upload();
    ```

> Note: The **LargeFileUploadTask** now also provides an **uploadAsync** method to perform uploads in the background.

### Non-generated code moved to the core library

The service library (microsoft-graph) was designed to contain only code that has been generated automatically from the API metadata. All code that has been manually handcrafted should live in the core library (microsoft-graph-core). This principle makes reusability of code easier for consumers and it was not respected until this new version of the SDK. All the code living under anything but `com.microsoft.graph.models` or `com.microsoft.graph.requests` have been moved to the same package name in the core asset. This move should be transparent to consumers, except for the following that needs to be updated. To upgrade your application do the following.

- Replace any reference to `ChunkUploadProvider` as showed above.
- Replace any reference to `CustomRequestBuilder`, `DateOnly`, `TimeOfDay`, and `Multipart` from `com.microsoft.graph.(models|requests).extensions` to `com.microsoft.graph.core`.

## Upgrade guide for non-breaking improvements

This section lists out other improvements which are not considered as breaking changes. SDK users are strongly encouraged to take advantage of those new improvements to simplify their code.

### Support for OData Count

The SDK now produces methods to include the count of items included in collections. To upgrade your application do the following.

- Replace any use of `QueryOption`

    ```Java
    graphClient
    .users()
    .buildRequest(new QueryOption("$count", true))
    .get();
    ```

    By

    ```Java
    graphClient
    .users()
    .buildRequest()
    .count()
    .get();
    ```

- Replace any custom request

    ```Java
    graphClient
    .customRequest("https://graph.microsoft.com/v1.0/users/$count", Int.class)
    .buildRequest()
    .get()
    ```

    By

    ```Java
    graphClient
    .users()
    .count()
    .buildRequest()
    .get()
    ```

> Note: support for `filter`, `orderBy`, `top`, `skip`, `skipToken`, and `expand` was also added in the last 2.X versions, if you are upgrading from an older version you might want to consider updating the use of query options by these new methods.

### Support for inherited OData methods

The SDK now produces methods in child request builder types for the parents' OData methods (actions & functions). This change allows you to write more specific requests reducing the permissions required for your application.

Replacing

```Java
    graphClient.directoryObjects("userId").getMemberGroups(<...>).buildRequest().post();
```

By

```Java
    graphClient.users("userId").getMemberGroups(<...>).buildRequest().post();
```

Your application now only needs **User.Read.All** instead of **Directory.Read.All**.

### JavaDoc improvements and Nullability annotations

Multiple improvements to the JavaDoc and annotations (`@Nullable`, `@Nonnull`) have been added to improve the developement experience for Java and Kotlin developers.

## Remarks about this guide

This guide is written to be as exhaustive as possible, it is possible that we forgot to mention some breaking changes. If you experience breaking changes in your upgrade process that are not already listed in this guide, please open an issue or a pull request to add any information that might be missing.
