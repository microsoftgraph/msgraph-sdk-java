# Overview for the Microsoft Graph SDK for Android
The Microsoft Graph SDK for Android is designed to look just like the Microsoft Graph APIs.

## GraphServiceClient
A `GraphServiceClient` is always associated with an authentication provider to ensure requests are authenticated. This can be created by using the **Builder** subclass of the `GraphServiceClient` implementation, `buildClient()`.  All requests use this object to send information to the service and it should be constructed once for your applications life cycle.

## Resource model
Resources, like items or drives, are represented by `DriveItem` and `Drive`, respectively. These objects contain properties that represent the properties of a resource. These objects can't make calls against the service-they are purely models.

To get the name of an item you address the `name` property. It is possible for any of these properties to be null at any time.

The resources that are generated map to the json model described by the [$metadata service document](https://graph.microsoft.com/v1.0/$metadata). There are items that might not be exposed because they expire very quickly or represent functionality that is not featured in this SDK as of yet. To access these fields use `getRawObject()` on the model items and access the specific properties that are not in the model.

Advanced users can use the [MSGraph SDK Code Generator](https://github.com/microsoftgraph/MSGraph-SDK-Code-Generator) in concert with updated $metadata from the [beta](https://graph.microsoft.com/beta/$metadata) or other preview endpoints.

## Issuing requests
To make requests against the service, first build a request with **RequestBuilder** and then build it into a Request object, which is then sent against the service. This follows the URL scheme that the Microsoft Graph API uses for all its resources.

### Request builders
To generate requests you chain together calls on request builder objects. You get the first request builder from the `GraphServiceClient` object. To get a drive, create a request builder by calling **GraphServiceClient.getMe**.

|Task            | SDK               | URL                             |
|:---------------|:-----------------:|:--------------------------------|
|Get the user     | `GraphServiceClient.getMe()` | GET graph.microsoft.com/v1.0/me|

`getMe` will return an `IUserRequestBuilder` object. From `getMe`, you can continue to chain the requests to get everything else in the API, like a drive.

|Task            | SDK                                | URL                                       |
|:---------------|:----------------------------------:|:------------------------------------------|
|Get the user's drive     | `GraphServiceClient.getMe().getDrive()` | GET graph.microsoft.com/v1.0/me/drive/|


Here, `GraphServiceClient.getMe().getDrive()` returns an `IUserRequestBuilder` that contains a method `getDrive(...)` to get an `IUserRequestBuilder`.

### Requests
Once you have constructed the request you call the `buildRequest()` method on the request builder. This will construct the request object needed to make calls against the service.

For an item you call:

```java
final IDriveItemRequest itemRequest = graphServiceClient
    .getMe()
    .getDrive()
    .getItems("1234")
    .buildRequest();
```

All request builders have a `buildRequest()` method that can generate a `IHttpRequest` object. Request objects may have different methods on them depending on the type of request. To get an item you call:

```java
itemRequest.get(new ICallback<DriveItem>{
    @Override
    public void success(final DriveItem result) {
        // This will make the network request and return the item
    }
    @Override
    public void failure(final ClientException ex) {
        // or an error if there was one
    }
});
```

You could also chain this together with call above :
```java

graphServiceClient
    .getMe()
    .getDrive()
    .getItems("1234")
    .buildRequest()
    .get(new ICallback<DriveItem>{
        @Override
        public void success(final DriveItem result) {
            // This will make the network request and return the item
        }
        @Override
        public void failure(final ClientException ex) {
            // or an error if there was one
        }
    });
```

See [items](/docs/items.md) for more info on items and [errors](/docs/errors.md) for more info on errors.

## Query options

If you only want to retrieve certain properties of a resource, you use `select` specify them. Here's how to get only the names and ids of an item:

```java
graphServiceClient
    .getMe()
    .getDrive()
    .getItems("1234")
    .buildRequest()
    .select("name,id")
    .get(new ICallback<DriveItem>() {
        @Override
        public void success(final DriveItem result) {
            // The item object will have null properties for everything except name and id
        }
    });
```

To expand certain properties on resources you can call a similar `expand` method, like this:

```java
graphServiceClient
    .getMe()
    .getDrive()
    .getItems("1234")
    .buildRequest()
    .expand("thumbnails")
    .get(new ICallback<DriveItem>() {
        @Override
        public void success(final DriveItem result) {
            // the item object will have collection page of thumbnails for its thumbnails property if thumbnails exist.
        }
    });
```

## Additional request options

If you need to include more specific behavior during a request, there are `Option` objects that you can add when calling `buildRequest`.

Here's an example of how to add an additional query parameter to sort the returned collection page results by size:

```java
final List<Option> options = new LinkedList<Option>();
options.add(new QueryOption("orderby", "size"));
graphServiceClient
    .getMe()
    .getDrive()
    .getRoot()
    .getChildren()
    .buildRequest(options)
    .get(new ICallback<IDriveItemCollectionPage>() {
        @Override
        public void success(final IDriveItemCollectionPage iDriveItemCollectionPage) {
            // Handle success of this page and its getNextPage() results will have their contents sorted by size
        }
        @Override
        public void failure(final ClientException ex) {
            // Handle failure
        }
    });
```

 Here's how to add an additional HTTP header to request only a specific set of bytes from a file (partial download):

 ```java
final String myItemId = "1234"; // The id of the item to download
final List<Option> options = new LinkedList<Option>();
options.add(new HeaderOption("Range", "bytes=0-128"));
graphServiceClient()
    .getMe()
    .getDrive()
    .getItems(myItemId)
    .getContent()
    .buildRequest(options)
    .get(new ICallback<InputStream>() {
        @Override
        public void success(final InputStream inputStream) {
            // Handle success of this partial range of the file
        }
        @Override
        public void failure(final ClientException ex) {
            // Handle failure
        }
    });
 ```

## Setting properties to `null`
To support PATCH operations involving `null` values, specify the property name you wish to nullify:

```java
user
    .getAdditionalDataManager()
    .put("officeLocation", JsonNull.INSTANCE);
```
