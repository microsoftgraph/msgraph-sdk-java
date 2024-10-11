# Microsoft Graph Java SDK v6 Changelog and Upgrade Guide

This document provides a list of changes and upgrade considerations for the Microsoft Graph Java SDK v6 release.

## Overview

Version 6.1.0 of the Microsoft Graph Java SDK is based on the new [Kiota](https://github.com/microsoft/kiota) code generation tool. By using Kiota the SDK is now able to support a broader range of Microsoft Graph API endpoints while also being more intuitive. Furthermore, [Graph-Core](https://github.com/microsoftgraph/msgraph-sdk-java-core) has also been updated to v3 which provides a great amount of added functionality; this makes v6 of the SDK a significant upgrade from v5.

## Table Of Contents

- [Breaking Changes](#breaking-changes)
  - [Namespace Changes and Disambiguation](#namespace-changes-and-disambiguation)
  - [Authentication](#authentication)
  - [`BaseRequest<T>` Changed to `RequestInformation`](#use-of-requestinformation-in-place-of-baserequestt)
  - [Removal of `Async` Suffix](#removal-of-async-suffix-from-executor-methods)
  - [Removal of `buildRequest`](#removal-of-buildrequest)
  - [`CollectionPage` Changed to `CollectionResponse`](#collectionpage-types-changed-to-collectionresponse-types)
  - [Private Properties](#properties-now-accessed-via-getters-and-setters)
  - [Querying Collections](#querying-collections)
  - [Indexing via Improved Fluent API Pattern](#change-in-indexing-via-improved-fluent-api-pattern)
  - [Option Class Removal](#option-class-removal)
  - [Header Options](#headers)
  - [Query Parameter Options](#query-parameter-options)
  - [Odata Function Parameters](#odata-function-parameters)
  - [Odata Action Parameters](#odata-action-parameters)
  - [Error Handling](#error-handling)
  - [Drive Item Paths](#drive-item-paths)
  - [Upload a Small File with conflictBehavior Set](#upload-a-small-file-with-conflictbehavior-set)
- [New Features](#new-features)
  - [Backing Store](#backing-store)
  - [Page Iterator](#pageiterator)
  - [Batch Requests](#batch-requests)
  - [Large File Upload Enhancements](#large-file-upload-enhancements)
  - [Per-Request Options](#per-request-options)
  - [Native Response Object](#native-response-object)
  - [Support for OData Casts](#support-for-odata-casts)


## Breaking Changes

The following is a list of breaking changes that users upgrading will want to consider while upgrading to v6 of the SDK.

### Namespace Changes and Disambiguation

Historically the SDK as well as the underlying Graph-Core library have all used the same parent namespace, `com.microsoft.graph.*`. This has caused issues for users who have wanted to use both the [v1.0](https://github.com/microsoftgraph/msgraph-sdk-java), [beta](https://github.com/microsoftgraph/msgraph-beta-sdk-java) and [core](https://github.com/microsoftgraph/msgraph-sdk-java-core) libraries in the same project. 
This has the following implications:
- The v1.0 version of the SDK maintains the `com.microsoft.graph.*` namespace.
- The beta version of the SDK is now disambiguated to `com.microsoft.graph.beta.*`.
- The core library is now disambiguated to `com.microsoft.graph.core.*`.
- Models types are now stored in `com.microsoft.graph.models`/`com.microsoft.graph.beta.models` for v1.0 and beta respectively.
- RequestBuilder and RequestBody types reside in namespaces relative to the path they are calling. e.g. The `SendMailRequestBuilder` and `SendMailPostRequestBody` types will reside in the `com.microsoft.graph.users.item.sendmail`/`com.microsoft.graph.beta.users.item.sendMail` namespace if you are sending mail via `graphClient.me().sendMail().post(sendMailPostRequestBody)`. 

### Authentication

The `GraphServiceClient` class now accepts an instance of `TokenCredential` from AzureIdentity directly rather than an instance of `TokenCredentialAuthProvider`.
Thus 
```java 
final DeviceCodeCredential credential = new DeviceCodeCredentialBuilder()
                .clientId(appId)
                .challengeConsumer(challenge -> System.out.println(challenge.getMessage()))
                .build();
final TokenCredentialAuthProvider tokenCredential = new TokenCredentialAuthProvider(scopes, credential);                
GraphServiceClient graphClient = GraphServiceClient.builder()
    .authenticationProvider(tokenCredential)
    .buildClient();
```
becomes
```java
final DeviceCodeCredential credential = new DeviceCodeCredentialBuilder()
                .clientId(appId)
                .challengeConsumer(challenge -> System.out.println(challenge.getMessage()))
                .build();
GraphServiceClient graphClient = GraphServiceClient(credential, scopes);
```
Custom authentication flows can be implemented by creating a class that implements [AccessTokenProvider](https://github.com/microsoft/kiota-java/blob/main/components/abstractions/src/main/java/com/microsoft/kiota/authentication/AccessTokenProvider.java) in conjunction with the [BaseBearerTokenAuthenticationProvider](https://github.com/microsoft/kiota-java/blob/main/components/abstractions/src/main/java/com/microsoft/kiota/authentication/BaseBearerTokenAuthenticationProvider.java) and passing that to GraphServiceClient constructor. 
For example:
```java
public class CustomTokenProvider implements AccessTokenProvider {
    @Override
    public String getAuthorizationToken(URI uri, Map<String, Object> additionalAuthenticationContex) { 
        String token = "";
        // Handle token retrieval logic here
        return token;
    }

    // Make sure to have the right set of hosts
    private final AllowedHostsValidator validator = new AllowedHostsValidator("graph.microsoft.com");
    @Override
    public AllowedHostsValidator getAllowedHostsValidator() {
        // Handle allowed hosts validation logic here
        return validator;
    }
```
Then instantiate the GraphServiceClient as follows: 
```java
BaseBearerTokenAuthenticationProvider authProvider = new BaseBearerTokenAuthenticationProvider(new CustomTokenProvider());
GraphServiceClient graphClient = GraphServiceClient(authProvider);
```
Alternatively a user may chose to create their own class that implements [AuthenticationProvider](https://github.com/microsoft/kiota-java/blob/main/components/abstractions/src/main/java/com/microsoft/kiota/authentication/AuthenticationProvider.java) and pass it to the GraphServiceClient constructor directly. 
> Authentication using the graph client is no longer handled in the OkHttpClient middleware pipeline by default. Therefore, using the `GraphServiceClient(okHttpClient)` constructor will assume that the passed OkHttpClient has already been configured to handle authentication in its pipeline. 
Otherwise, passing an instance of `AuthenticationProvider` to the constructor (`GraphServiceClient(authenticationProvider, okHttpClient)`) will make authenticated requests if the passed OkHttpClient is not already configured.

### Use of `RequestInformation` in Place of `BaseRequest<T>`

The `RequestInformation` class is now used to represent requests in the SDK and the `BaseRequest<T>` abstract class has been dropped. Using the fluent API patten a user can now get the `RequestInformation` instance for a request as follows: 
```java
// Getting the RequestInformation for a Get request 
RequestInformation requestInfo = graphClient.directoryObjects().toGetRequestInformation();
// Getting the RequestInformation for a Post request
DirectoryObject directoryObject = new DirectoryObject();
directoryObject.setId("1234");
graphClient.directoryObjects().toPostRequestInformation(directoryObject);
```

### Removal of Async Suffix from Executor Methods

The sdk no longer provides async methods for executing requests thus the async suffix has removed from executor methods. `postAsync()` is removed and now only `post()` is available, `getAsync()` is removed and only `get()`is available, etc.
> If users wish to execute requests asynchronously they may choose to wrap their calls in CompleteableFutures or a separate async workflow.   

### Removal of `buildRequest()`

In the previous version of the SDK the `buildRequest()` method call was necessary when building and calling requests.
Previously a call to get the current user would look like the following: 
```java
User me = graphClient.me().buildRequest().get();
```
The same call would be the following in v6:
```java 
User me = graphClient.me().get();
```

### CollectionPage Types Changed to CollectionResponse Types

The `CollectionPage` suffix has been changed to `CollectionResponse` to better reflect the type of object that is returned from a request. 
For example, a call to get a collection of users would return the following in v5:
```java
UserCollectionPage users = graphClient.users().buildRequest().get();
```
In v6 the same call would return:
```java
UserCollectionResponse users = graphClient.users().get();
```

### Properties Now Accessed via Getters and Setters

In v5 properties were accessed directly via the property name. In v6 properties are accessed via getters and setters.
For example, in v5 a user would access the `displayName` property of a `User` object as follows:
```java
User me = graphClient.me().buildRequest().get();
String displayName = me.displayName;
```
In v6 the same call would look like the following:
```java
User me = graphClient.me().get();
String displayName = me.getDisplayName();
```

### Querying Collections

Querying collections has changed in v6 to more closely resemble the response from the API. 
Previously a user would prepare to query a collection as follows:
```java
UserCollectionPage response = graphClient.users()
                            .buildRequest()
                            .get();
List<User> usersList = response.getCurrentPage();                        
```
In v6 the same call would look like the following:
```java
UserCollectionResponse response = graphClient.users().get();
List<User> usersList = response.getValue();
```

### Change in Indexing via Improved Fluent API Pattern

The fluent API pattern has changed slightly in v6. Previously the fluent API pattern would index into a collection through an overload method call in the request builder pattern. In v6 we have added the `byId` suffix to make it obvious when a user is indexing into a collection.
For example, retrieving a message by id would look like the following in v5:
```java
Message singleMessage = graphClient.me().messages("<Message Id>").buildRequest().get();
``` 
In v6 the same call would look like the following:
```java
Message singleMessage = graphClient.me().messages().byMessageId("<Message Id>").get();
```

### Option Class Removal

The `Option` class has been removed and is no longer used to define query parameters, headers, or function parameters. These classes have been replaced with more specific and intuitive implementations. 

#### Headers
Passing headers to requests has changed in v6. The `HeaderOption` class, which extends the `Option` class,  has been removed and is no longer used to define headers. 
Previously a user would pass headers to a request as follows:
```java
LinkedList<Option> requestOptions = new LinkedList<Option>(); 
requestOptions.add(new HeaderOption("headerKey", "headerValue"));
User user = graphClient.users("<User Id>")
                .buildRequest(requestOptions)
                .get();
```
Users should now use the `requestConfiguration` lambda to pass headers to a request.
In v6 the same call would look like the following:
```java
User user = graphClient.users().byUserId("<User Id>").get(requestConfiguration -> {
            requestConfiguration.headers.add("headerKey", "headerValue");
        });
```

#### Query Parameter Options

Passing query parameters to requests has changed in v6. The `QueryOption` class, which extends the `Option` class,  has been removed and is no longer used to define query parameters. 
Previously a user would pass query parameters to a request as follows:
```java
LinkedList<Option> requestOptions = new LinkedList<Option>();
requestOptions.add(new QueryOption("includeHiddenFolders", "true"));

MailFolderCollectionPage mailFolders = graphClient.me().mailFolders()
                                        .buildRequest(requestOptions)
                                        .get();
```
Users should now use the `requestConfiguration` lambda to pass query parameters to a request.
In v6 the same call would look like the following:
```java
MailFolderCollectionResponse mailFolders = graphClient.me().mailFolders().get(requestConfiguration -> {
            requestConfiguration.queryParameters.includeHiddenFolders = "true";
        });
```

### Odata Function Parameters

Passing function parameters to requests has changed in v6. The `FunctionOption` class, which extends the `Option` class, has been removed and is no longer used to define function parameters. Futhermore, function and action parameter classes, currently defined by classes with the suffix `ParameterSet`, have been removed. 
Previously a user would pass function parameters to a request as follows:
```java
ReportRootGetMailboxUsageDetailParameterSet parameterSet = ReportRootGetMailboxUsageDetailParameterSet.newBuilder()
                .withPeriod("<Period Option>") // This is a function parameter
                .build();
InputStream usageDetail = graphClient.reports().getMailboxUsageDetail(parameterSet).buildRequest().get();
```
In v6 the same call would look like the following:
```java
InputStream usageDetail = graphClient.reports().getMailboxUsageDetailWithPeriod("<Period Option>").get();
```

### Odata Action Parameters

The SDK now supports adding parameters to Odata actions via `RequestBody` classes. This aligns with the removal of `ParameterSet` classes. 
For example, the `sendMail` action would be called as follows in v5:
```java
UserSendMailParameterSet userSendMailParameterSet = UserSendMailParameterSet.newBuilder()
                .withMessage(new Message())
                .withSaveToSentItems(true)
                .build();
graphClient.me().sendMail(userSendMailParameterSet).buildRequest().post();
```
In v6 the same call would look like the following:
```java
SendMailPostRequestBody sendMailPostRequestBody = new SendMailPostRequestBody();
sendMailPostRequestBody.setMessage(new Message());
sendMailPostRequestBody.setSaveToSentItems(true);
graphClient.me().sendMail().post(sendMailPostRequestBody);
```

### Error Handling

`GraphServiceException` has been removed and is no longer used to handle errors. Instead, the SDK now throws an `ApiException` when an issue occurs with a request. The message of the `ApiException` will contain a more specific error message based on the OdataError returned from the API. `ClientException` remains, however, this is now used to handle less frequent issues with the client itself.
In v6 a user would handle an error as follows:
```java
try {
    User user = graphClient.me().get();
} catch (ApiException e) {
    System.out.println(e.getMessage());
}
```

### Drive Item Paths

The SDK generation process avoids generation of redundant paths, which impacts request builders for driveItems. To mitigate this paths should be available through alternative paths as documented in the reference documentation as seen [here](https://learn.microsoft.com/en-us/graph/api/driveitem-list-children?view=graph-rest-1.0&tabs=http#http-request). 

Examples of using alternative paths are as shown below.

1. List children from a user's drive.
```java
// Get the user's driveId 
Drive driveItem = graphClient.me().drive().get();
String driveId = driveItem.getId();
// List children of a DriveItem in the Drive
DriveItemCollectionResponse response = graphClient.drives().byDriveId(driveId).items().byDriveItemId("Item Id").children().get();
List<DriveItem> children = response.getValue();
```
>NOTE: /drives/{drive-id}/root is a shorthand for /drives/{drive-id}/items/root, so 'Item Id' can be replaced with 'root' to make a call to get the root folder and subsequently its children as shown below.
```java
// List children in the drive by replacing 'Item Id' with 'root'
DriveItemCollectionResponse response = graphClient.drives().byDriveId(driveId).items().byDriveItemId("root").children().get();
List<DriveItem> children = response.getValue();
// Or more simply
DriveItem root = graphClient.drives().byDriveId(driveId).root().get();
List<DriveItem> children = root.getChildren();
```
>NOTE: 'Item Id' can also be replaced with 'root:/{file-path}' to make a call to get a specific file or folder and subsequently its children as shown below. For more information on alternative paths see documentation linked above.

2. List children from a site's drive.
```java 
// Get the site's driveId
Drive siteDrive = graphClient.sites().bySiteId("Site Id").drive().get();
String siteDriveId = siteDrive.getId();
// List children of a DriveItem in the site's drive
DriveItemCollectionResponse response = graphClient.drives().byDriveId(siteDriveId).items().byDriveItemId("Item Id").children().get();
// See note above for using 'root' as the 'Item Id'
```

3. List children from a group's drive.
```java 
// Get the group's drive
Drive groupDrive = graphClient.groups().byGroupId("Group Id").drive().get();
String groupDriveId = groupDrive.getId();
// List children of a DriveItem in the group's drive
DriveItemCollectionResponse response = graphClient.drives().byDriveId(groupDriveId).items().byDriveItemId("Item Id").children().get();
// See note above for using 'root' as the 'Item Id'
```

### Upload a Small File with conflictBehavior Set

To upload a small file (size should not exceed 4mb according to the [docs](https://learn.microsoft.com/en-us/graph/api/driveitem-put-content?view=graph-rest-1.0&tabs=http)) and set the `conflictBehavior` [instance attribute](https://learn.microsoft.com/en-us/graph/api/resources/driveitem?view=graph-rest-1.0#instance-attributes) you'll need to do it this way:

```java
RequestInformation requestInformation = graphClient.drives().byDriveId("Drive-Id").items().byDriveItemId("root:/MediaMeta.xml").content().toPutRequestInformation(file);
// 'file' should be an inputStream
URI uriIncludesConflictBehavior = new URI(requestInformation.getUri().toString()+"?@microsoft.graph.conflictBehavior=rename");
requestInformation.setUri(uriIncludesConflictBehavior);

graphClient.getRequestAdapter().sendPrimitive(requestInformation, null, InputStream.class);
```
## New Features

### Backing Store

The backing store allows multiple things like dirty tracking of changes, making it possible to get an object from the API, update a property, send that object back with only the changed property and not the full objects.
This has the added advantage in that SDK user can simply get an object from the API and set a property to null and send back the object without having to use known workarounds where setting properties to null would require to be placed in the additionalData bag.
```Java
// Get the object 
Event event = graphClient.me().events().byEventId("Event-Id").get();
// The backing store will track changes to the object and send the updated values. 
event.setRecurrence(null);
// Update the object
graphClient.me().events().byEventId("Event-Id").update(event);
```

### PageIterator

In v6 we have introduced a `PageIterator` class that can be used to iterate over collection objects and the pages containing these collections. Previously a user would have to manually retrieve the `@odata.nextLink`, which appears in the response body when a collection is returned that is too large to fit in a single response, and then manually send another request to get the next page of the collection. Then repeat this process until all pages have been retrieved. The `PageIterator` class handles this for the user and allows them to iterate over the collection as if it were a single object.

For example, iterating over a collection of messages would look like the following in v5:
```java
MessageCollectionPage messagePage = graphClient.me().messages().buildRequest().get();
List<Message> allMessages = new ArrayList<>();
boolean hasNextPage;
do{
    allMessages.addAll(messagePage.getCurrentPage());
    if (messagePage.getNextPage()!=null) {
        hasNextPage = true;
        messagePage = messagePage.getNextPage().buildRequest().get();
    } else {
        hasNextPage = false;
    }
}while (hasNextPage);
```
In v6 the same call would look like the following:
```java
MessageCollectionResponse messagePage = graphClient.me().messages().get();
List<Message> allMessages = new LinkedList<>();
PageIterator<Message, MessageCollectionResponse> pageIterator = new PageIterator.Builder<Message, MessageCollectionResponse>()
        .client(graphClient)
        // The first page of the collection is passed to the collectionPage method
        .collectionPage(messagePage)
        // CollectionPageFactory is called to create a new collection page from the nextLink
        .collectionPageFactory(MessageCollectionResponse::createFromDiscriminatorValue)
        // ProcessPageItemCallback is called for each item in the collection
        .processPageItemCallback(message -> {
            allMessages.add(message);
            return true;
        }).build();
// Handles the process of iterating through every page and every item         
pageIterator.iterate();
```

### Batch Requests

The Java SDK now supports Batch requests. Batching allows a user to send multiple requests in a single HTTP request which can improve performance and reduce network traffic. A user can chose to add a `RequestInformation` instance or an OkHttp3 `Request` instance to the Batch which will then be sent to the API as a single HTTP request. See here for more information on [batching](https://learn.microsoft.com/en-us/graph/json-batching).
```java
// Create two requests via RequestInformation
RequestInformation getMe = graphClient.me().toGetRequestInformation();
RequestInformation getEvents = graphClient.me().calendar().events().toGetRequestInformation();

// Create a batch request content object and add the requests to it
BatchRequestContent batchRequestContent = new BatchRequestContent(graphClient);
// The id of the request is returned, can be used later to retrieve the specific response for that request    
String meRequestId = batchRequestContent.addBatchRequestStep(getMe);
String eventsRequestId = batchRequestContent.addBatchRequestStep(getEvents);

// Send the batch request
BatchResponseContent responseContent = graphClient.getBatchRequestBuilder().post(batchRequestContent, null);

// Retrieve the specific responses for the requests based on the request id
User meResponse = responseContent.getResponseById(meRequestId, User::createFromDiscriminatorValue);
EventCollectionResponse eventsResponse = responseContent.getResponseById(eventsRequestId, EventCollectionResponse::createFromDiscriminatorValue);
List<Event> events = eventsResponse.getValue();
```
Find specific failing requests in the batch response and retry:
```java
// Retrieve a map containing all the responses and their status codes
Map<String, Integer> statusCodes = responseContent.getResponsesStatusCode();
Map<String, Integer> specificFailedCodes = new HashMap<>();
// Narrow down the map to only contain the failed requests with a status code of 429
for (Map.Entry<String, Integer> entry : statusCodes.entrySet()) {
    if (entry.getValue() == 429) { 
        specificFailedCodes.put(entry.getKey(), entry.getValue());
    }
}
BatchRequestContent failedRequests = batchRequestContent.createNewBatchFromFailedRequests(specificFailedCodes);
BatchResponseContent retriedResponse = graphClient.getBatchRequestBuilder().post(failedRequests, null);       
```
Batch requests have a limit of 20 requests per batch. If a user attempts to add more than 20 requests to a batch an `IllegalArgumentException` will be thrown. To mitigate this in cases when a user may want to add more than 20 requests there is the `BatchRequestContentCollection` class. This class allows a user to add more than 20 requests and handles splitting the requests into multiple batches.  The `BatchRequestContentCollection` class will then handle the process of creating multiple batches and sending them to the API. 

By making the following changes to the code from above, a user can make 'unlimited' requests which are split into multiple batches:
```java
// Simply replace BatchRequestContent with BatchRequestContentCollection and the code from above remains the same
BatchRequestContentCollection batchRequestContentCollection = new BatchRequestContentCollection(graphClient);
// User can also specify the max number of requests per batch
// Rather than 20 requests per batch, this will send 10 requests per batch
BatchRequestContentCollection batchRequestContentCollection = new BatchRequestContentCollection(graphClient, 10);
```
Using batched requests can make your code a lot faster, if you need to query several endpoints at once or if you're creating/deleting a lot of items at the same time.

### Large File Upload Enhancements

In v6 we have enhanced our large file upload experience by adding the ability to pause and resume large file uploads. This functionality is described in detail [here](https://learn.microsoft.com/en-us/graph/api/driveitem-createuploadsession?view=graph-rest-1.0&preserve-view=true).

See the [docs](https://learn.microsoft.com/en-us/graph/sdks/large-file-upload?view=graph-rest-1.0&tabs=java) for Large File Upload examples.

### Per-Request Options

Users can now add per-request options to the default middleware without creating a new middleware pipeline in the client. Previously, a user would need to set middleware options at client instantiation. Now users can pass per-request options to the default middleware to configure actions like redirects and retries, this can be done using the `requestConfiguration` lambda by adding a `RequestOption` instance to the `Options` collection.

For example, adding custom `RedirectHandlerOption` to a request would look like the following:
```java
RedirectHandlerOption redirectHandlerOption = new RedirectHandlerOption(5, response -> {
    return response.code() == 200 ? true : false;} // Only redirect if the response code is 200
);
graphClient.me().get(requestConfiguration -> {
    requestConfiguration.options.add(redirectHandlerOption);
});
```

Current middleware enabled by default includes: 
- `RedirectHandler` 
- `RetryHandler` 
- `ParametersNameDecodingHandler` 
- `UserAgentHandler`
- `HeadersInspectionHandler`

`RequestOption` implementations for these handlers can be found [here](https://github.com/microsoft/kiota-java/tree/main/components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/options).

>NOTE: Users will need to add the following dependency to their project in order to make use of the currently available option implementations:
`implementation 'com.microsoft.kiota:microsoft-kiota-http-okHttp:0.12.1'` 
For latest version see the [Kiota-Java Repo](https://github.com/microsoft/kiota-java)

### Native Response Object

Users can pass an instance of the `NativeResponseHandler` class, an implementation of the `ResponseHandler` interface, within a per-request `ResponseHandlerOption` to get a native `Okhttp3.Response` object from a request. This can be used in scenarios where a user wants to access the native response object and it's properties directly. 

In the following example, the `NativeResponseHandler` is passed as a property of the `ResponseHandlerOption` class to the `RequestConfiguration` lambda. The `NativeResponseHandler` is then used to get the native response object after the request has been made. 
```java
NativeResponseHandler nativeResponseHandler = new NativeResponseHandler();
ResponseHandlerOption responseHandlerOption = new ResponseHandlerOption();
responseHandlerOption.setResponseHandler(nativeResponseHandler);
graphClient.me().get(requestConfiguration -> {
    requestConfiguration.options.add(responseHandlerOption);
});
Response nativeResponse = (Response) nativeResponseHandler.getValue();
```
Users can also fully customize response handling 

### Support for OData Casts

OData allows downcasting the result to the right specialized type, meaning that users can have access to all properties in the response, rather than pulling those out from the AdditionalData holder. The fluent API pattern now comes with enriched segments allowing users to request a specific Odata type in the event that an endpoint supports multiple types. 

For example:
```java
// Get the collection of Users in a group
// API Endpoint: /groups/{id}/members/microsoft.graph.user
UserCollectionResponse users = graphClient.groups().byGroupId("Group-Id").members().graphUser().get();
// Get the collection of Applications in a group
// API Endpoint: /groups/{id}/members/microsoft.graph.application
ApplicationCollectionResponse applications = graphClient.groups().byGroupId("Group-Id").members().graphApplication().get();
```
