package com.microsoft.graph.applications.item.addkey;

import com.microsoft.graph.models.KeyCredential;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the addKey method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddKeyRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new AddKeyRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddKeyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/applications/{application%2Did}/addKey", pathParameters);
    }
    /**
     * Instantiates a new AddKeyRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddKeyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/applications/{application%2Did}/addKey", rawUrl);
    }
    /**
     * Add a key credential to an application. This method, along with removeKey can be used by an application to automate rolling its expiring keys. As part of the request validation for this method, a proof of possession of an existing key is verified before the action can be performed.  Applications that dont have any existing valid certificates (no certificates have been added yet, or all certificates have expired), wont be able to use this service action. You can use the Update application operation to perform an update instead.
     * @param body The request body
     * @return a KeyCredential
     * @see <a href="https://learn.microsoft.com/graph/api/application-addkey?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public KeyCredential post(@jakarta.annotation.Nonnull final AddKeyPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Add a key credential to an application. This method, along with removeKey can be used by an application to automate rolling its expiring keys. As part of the request validation for this method, a proof of possession of an existing key is verified before the action can be performed.  Applications that dont have any existing valid certificates (no certificates have been added yet, or all certificates have expired), wont be able to use this service action. You can use the Update application operation to perform an update instead.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a KeyCredential
     * @see <a href="https://learn.microsoft.com/graph/api/application-addkey?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public KeyCredential post(@jakarta.annotation.Nonnull final AddKeyPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, KeyCredential::createFromDiscriminatorValue);
    }
    /**
     * Add a key credential to an application. This method, along with removeKey can be used by an application to automate rolling its expiring keys. As part of the request validation for this method, a proof of possession of an existing key is verified before the action can be performed.  Applications that dont have any existing valid certificates (no certificates have been added yet, or all certificates have expired), wont be able to use this service action. You can use the Update application operation to perform an update instead.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddKeyPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add a key credential to an application. This method, along with removeKey can be used by an application to automate rolling its expiring keys. As part of the request validation for this method, a proof of possession of an existing key is verified before the action can be performed.  Applications that dont have any existing valid certificates (no certificates have been added yet, or all certificates have expired), wont be able to use this service action. You can use the Update application operation to perform an update instead.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddKeyPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a AddKeyRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AddKeyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AddKeyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
