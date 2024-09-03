package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RestorePointSearchResponse implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RestorePointSearchResponse} and sets the default values.
     */
    public RestorePointSearchResponse() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RestorePointSearchResponse}
     */
    @jakarta.annotation.Nonnull
    public static RestorePointSearchResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RestorePointSearchResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("noResultProtectionUnitIds", (n) -> { this.setNoResultProtectionUnitIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("searchResponseId", (n) -> { this.setSearchResponseId(n.getStringValue()); });
        deserializerMap.put("searchResults", (n) -> { this.setSearchResults(n.getCollectionOfObjectValues(RestorePointSearchResult::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the noResultProtectionUnitIds property value. Contains  alist of protection units with no restore points.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNoResultProtectionUnitIds() {
        return this.backingStore.get("noResultProtectionUnitIds");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the searchResponseId property value. The unique identifier of the search response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSearchResponseId() {
        return this.backingStore.get("searchResponseId");
    }
    /**
     * Gets the searchResults property value. Contains a collection of restore points.
     * @return a {@link java.util.List<RestorePointSearchResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RestorePointSearchResult> getSearchResults() {
        return this.backingStore.get("searchResults");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("noResultProtectionUnitIds", this.getNoResultProtectionUnitIds());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("searchResponseId", this.getSearchResponseId());
        writer.writeCollectionOfObjectValues("searchResults", this.getSearchResults());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the noResultProtectionUnitIds property value. Contains  alist of protection units with no restore points.
     * @param value Value to set for the noResultProtectionUnitIds property.
     */
    public void setNoResultProtectionUnitIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("noResultProtectionUnitIds", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the searchResponseId property value. The unique identifier of the search response.
     * @param value Value to set for the searchResponseId property.
     */
    public void setSearchResponseId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("searchResponseId", value);
    }
    /**
     * Sets the searchResults property value. Contains a collection of restore points.
     * @param value Value to set for the searchResults property.
     */
    public void setSearchResults(@jakarta.annotation.Nullable final java.util.List<RestorePointSearchResult> value) {
        this.backingStore.set("searchResults", value);
    }
}
