package com.microsoft.graph.admin.teams.telephonenumbermanagement.numberassignments.microsoftgraphteamsadministrationupdatenumber;

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
public class UpdateNumberPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UpdateNumberPostRequestBody} and sets the default values.
     */
    public UpdateNumberPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateNumberPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static UpdateNumberPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateNumberPostRequestBody();
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
        deserializerMap.put("locationId", (n) -> { this.setLocationId(n.getStringValue()); });
        deserializerMap.put("networkSiteId", (n) -> { this.setNetworkSiteId(n.getStringValue()); });
        deserializerMap.put("reverseNumberLookupOptions", (n) -> { this.setReverseNumberLookupOptions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("telephoneNumber", (n) -> { this.setTelephoneNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the locationId property value. The locationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationId() {
        return this.backingStore.get("locationId");
    }
    /**
     * Gets the networkSiteId property value. The networkSiteId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetworkSiteId() {
        return this.backingStore.get("networkSiteId");
    }
    /**
     * Gets the reverseNumberLookupOptions property value. The reverseNumberLookupOptions property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getReverseNumberLookupOptions() {
        return this.backingStore.get("reverseNumberLookupOptions");
    }
    /**
     * Gets the telephoneNumber property value. The telephoneNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTelephoneNumber() {
        return this.backingStore.get("telephoneNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("locationId", this.getLocationId());
        writer.writeStringValue("networkSiteId", this.getNetworkSiteId());
        writer.writeCollectionOfPrimitiveValues("reverseNumberLookupOptions", this.getReverseNumberLookupOptions());
        writer.writeStringValue("telephoneNumber", this.getTelephoneNumber());
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
     * Sets the locationId property value. The locationId property
     * @param value Value to set for the locationId property.
     */
    public void setLocationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("locationId", value);
    }
    /**
     * Sets the networkSiteId property value. The networkSiteId property
     * @param value Value to set for the networkSiteId property.
     */
    public void setNetworkSiteId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkSiteId", value);
    }
    /**
     * Sets the reverseNumberLookupOptions property value. The reverseNumberLookupOptions property
     * @param value Value to set for the reverseNumberLookupOptions property.
     */
    public void setReverseNumberLookupOptions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("reverseNumberLookupOptions", value);
    }
    /**
     * Sets the telephoneNumber property value. The telephoneNumber property
     * @param value Value to set for the telephoneNumber property.
     */
    public void setTelephoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("telephoneNumber", value);
    }
}
