package com.microsoft.graph.drives.item.items.item.assignsensitivitylabel;

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
 * Provides operations to call the assignSensitivityLabel method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignSensitivityLabelRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AssignSensitivityLabelRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignSensitivityLabelRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/assignSensitivityLabel", pathParameters);
    }
    /**
     * Instantiates a new {@link AssignSensitivityLabelRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignSensitivityLabelRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/assignSensitivityLabel", rawUrl);
    }
    /**
     * Asynchronously assign a sensitivity label to a driveItem. This API is part of the Microsoft SharePoint and OneDrive APIs that perform advanced premium administrative functions, and is considered as protected. Protected APIs require you to have more validations, beyond permission and consent, before you can use them. For more information about sensitivity labels from an administrator&apos;s perspective, see Enable sensitivity labels for Office files in SharePoint and OneDrive. This API applies sensitivity labels to files at rest. Office clients don&apos;t apply watermarks, headers, or footers to files that contain the label information. For more information about sensitivity labels from an administrator&apos;s perspective, see Enable sensitivity labels for Office files in SharePoint and OneDrive.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/driveitem-assignsensitivitylabel?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final AssignSensitivityLabelPostRequestBody body) {
        post(body, null);
    }
    /**
     * Asynchronously assign a sensitivity label to a driveItem. This API is part of the Microsoft SharePoint and OneDrive APIs that perform advanced premium administrative functions, and is considered as protected. Protected APIs require you to have more validations, beyond permission and consent, before you can use them. For more information about sensitivity labels from an administrator&apos;s perspective, see Enable sensitivity labels for Office files in SharePoint and OneDrive. This API applies sensitivity labels to files at rest. Office clients don&apos;t apply watermarks, headers, or footers to files that contain the label information. For more information about sensitivity labels from an administrator&apos;s perspective, see Enable sensitivity labels for Office files in SharePoint and OneDrive.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/driveitem-assignsensitivitylabel?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final AssignSensitivityLabelPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Asynchronously assign a sensitivity label to a driveItem. This API is part of the Microsoft SharePoint and OneDrive APIs that perform advanced premium administrative functions, and is considered as protected. Protected APIs require you to have more validations, beyond permission and consent, before you can use them. For more information about sensitivity labels from an administrator&apos;s perspective, see Enable sensitivity labels for Office files in SharePoint and OneDrive. This API applies sensitivity labels to files at rest. Office clients don&apos;t apply watermarks, headers, or footers to files that contain the label information. For more information about sensitivity labels from an administrator&apos;s perspective, see Enable sensitivity labels for Office files in SharePoint and OneDrive.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AssignSensitivityLabelPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Asynchronously assign a sensitivity label to a driveItem. This API is part of the Microsoft SharePoint and OneDrive APIs that perform advanced premium administrative functions, and is considered as protected. Protected APIs require you to have more validations, beyond permission and consent, before you can use them. For more information about sensitivity labels from an administrator&apos;s perspective, see Enable sensitivity labels for Office files in SharePoint and OneDrive. This API applies sensitivity labels to files at rest. Office clients don&apos;t apply watermarks, headers, or footers to files that contain the label information. For more information about sensitivity labels from an administrator&apos;s perspective, see Enable sensitivity labels for Office files in SharePoint and OneDrive.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AssignSensitivityLabelPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AssignSensitivityLabelRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignSensitivityLabelRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AssignSensitivityLabelRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
