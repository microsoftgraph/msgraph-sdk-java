package com.microsoft.graph.security.cases.ediscoverycases.item.reviewsets.item.microsoftgraphsecurityaddtoreviewset;

import com.microsoft.graph.models.security.AdditionalDataOptions;
import com.microsoft.graph.models.security.EdiscoverySearch;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddToReviewSetPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The additionalDataOptions property
     */
    private EnumSet<AdditionalDataOptions> additionalDataOptions;
    /**
     * The search property
     */
    private EdiscoverySearch search;
    /**
     * Instantiates a new addToReviewSetPostRequestBody and sets the default values.
     */
    public AddToReviewSetPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a addToReviewSetPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AddToReviewSetPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddToReviewSetPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the additionalDataOptions property value. The additionalDataOptions property
     * @return a additionalDataOptions
     */
    @jakarta.annotation.Nullable
    public AdditionalDataOptions getAdditionalDataOptions() {
        return this.additionalDataOptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("additionalDataOptions", (n) -> { this.setAdditionalDataOptions(n.getEnumSetValue(AdditionalDataOptions.class)); });
        deserializerMap.put("search", (n) -> { this.setSearch(n.getObjectValue(EdiscoverySearch::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the search property value. The search property
     * @return a ediscoverySearch
     */
    @jakarta.annotation.Nullable
    public EdiscoverySearch getSearch() {
        return this.search;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("additionalDataOptions", this.getAdditionalDataOptions());
        writer.writeObjectValue("search", this.getSearch());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the additionalDataOptions property value. The additionalDataOptions property
     * @param value Value to set for the additionalDataOptions property.
     */
    public void setAdditionalDataOptions(@jakarta.annotation.Nullable final AdditionalDataOptions value) {
        this.additionalDataOptions = value;
    }
    /**
     * Sets the search property value. The search property
     * @param value Value to set for the search property.
     */
    public void setSearch(@jakarta.annotation.Nullable final EdiscoverySearch value) {
        this.search = value;
    }
}
