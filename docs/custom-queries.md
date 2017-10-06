# Making Custom Calls to Graph

The Graph SDK attempts to enable all available scenarios through Microsoft Graph. There are times, however, through errors or custom Graph functionality, that makes calling the desired endpoint not possible through the provided requests and builders.

## Creating a custom request
You can extend BaseRequest to create a custom request:

```Java
public class CustomRequest extends BaseRequest {

    public CustomRequest(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
    }

    public String get() throws ClientException {
        return send(HttpMethod.GET, null);
    }
}
```
Then you can instantiate a new request to use to call Graph:

```Java
CustomRequest request = new CustomRequest("https://graph.microsoft.com/v1.0/custom", graphServiceClient, requestOptions);
request.get();
```
