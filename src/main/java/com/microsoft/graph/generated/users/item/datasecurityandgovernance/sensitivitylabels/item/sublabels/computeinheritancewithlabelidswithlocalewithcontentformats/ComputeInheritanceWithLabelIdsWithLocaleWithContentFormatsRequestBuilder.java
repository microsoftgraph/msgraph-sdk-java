package com.microsoft.graph.users.item.datasecurityandgovernance.sensitivitylabels.item.sublabels.computeinheritancewithlabelidswithlocalewithcontentformats;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SensitivityLabel;
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
 * Provides operations to call the computeInheritance method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComputeInheritanceWithLabelIdsWithLocaleWithContentFormatsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ComputeInheritanceWithLabelIdsWithLocaleWithContentFormatsRequestBuilder} and sets the default values.
     * @param contentFormats Usage: contentFormats={contentFormats}
     * @param labelIds Usage: labelIds={labelIds}
     * @param locale Usage: locale=&apos;{locale}&apos;
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ComputeInheritanceWithLabelIdsWithLocaleWithContentFormatsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String contentFormats, @jakarta.annotation.Nullable final String labelIds, @jakarta.annotation.Nullable final String locale) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/dataSecurityAndGovernance/sensitivityLabels/{sensitivityLabel%2Did}/sublabels/computeInheritance(labelIds={labelIds},locale='{locale}',contentFormats={contentFormats})", pathParameters);
        this.pathParameters.put("contentFormats", contentFormats);
        this.pathParameters.put("labelIds", labelIds);
        this.pathParameters.put("locale", locale);
    }
    /**
     * Instantiates a new {@link ComputeInheritanceWithLabelIdsWithLocaleWithContentFormatsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ComputeInheritanceWithLabelIdsWithLocaleWithContentFormatsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/dataSecurityAndGovernance/sensitivityLabels/{sensitivityLabel%2Did}/sublabels/computeInheritance(labelIds={labelIds},locale='{locale}',contentFormats={contentFormats})", rawUrl);
    }
    /**
     * Calculate the sensitivity label that should be inherited by an output artifact, given a set of sensitivity labels from input or referenced artifacts.
     * @return a {@link SensitivityLabel}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SensitivityLabel get() {
        return get(null);
    }
    /**
     * Calculate the sensitivity label that should be inherited by an output artifact, given a set of sensitivity labels from input or referenced artifacts.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SensitivityLabel}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SensitivityLabel get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SensitivityLabel::createFromDiscriminatorValue);
    }
    /**
     * Calculate the sensitivity label that should be inherited by an output artifact, given a set of sensitivity labels from input or referenced artifacts.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Calculate the sensitivity label that should be inherited by an output artifact, given a set of sensitivity labels from input or referenced artifacts.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ComputeInheritanceWithLabelIdsWithLocaleWithContentFormatsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComputeInheritanceWithLabelIdsWithLocaleWithContentFormatsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ComputeInheritanceWithLabelIdsWithLocaleWithContentFormatsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
