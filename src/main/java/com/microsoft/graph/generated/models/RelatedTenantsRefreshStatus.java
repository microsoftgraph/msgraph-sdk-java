package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents the status of the most recent Related Tenants refresh operation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedTenantsRefreshStatus implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RelatedTenantsRefreshStatus} and sets the default values.
     */
    public RelatedTenantsRefreshStatus() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelatedTenantsRefreshStatus}
     */
    @jakarta.annotation.Nonnull
    public static RelatedTenantsRefreshStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedTenantsRefreshStatus();
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
        deserializerMap.put("isFirstRefresh", (n) -> { this.setIsFirstRefresh(n.getBooleanValue()); });
        deserializerMap.put("mostRecentRefreshDateTime", (n) -> { this.setMostRecentRefreshDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mostRecentRefreshRequestStatus", (n) -> { this.setMostRecentRefreshRequestStatus(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isFirstRefresh property value. The isFirstRefresh property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFirstRefresh() {
        return this.backingStore.get("isFirstRefresh");
    }
    /**
     * Gets the mostRecentRefreshDateTime property value. The mostRecentRefreshDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getMostRecentRefreshDateTime() {
        return this.backingStore.get("mostRecentRefreshDateTime");
    }
    /**
     * Gets the mostRecentRefreshRequestStatus property value. The mostRecentRefreshRequestStatus property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMostRecentRefreshRequestStatus() {
        return this.backingStore.get("mostRecentRefreshRequestStatus");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isFirstRefresh", this.getIsFirstRefresh());
        writer.writeOffsetDateTimeValue("mostRecentRefreshDateTime", this.getMostRecentRefreshDateTime());
        writer.writeStringValue("mostRecentRefreshRequestStatus", this.getMostRecentRefreshRequestStatus());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the isFirstRefresh property value. The isFirstRefresh property
     * @param value Value to set for the isFirstRefresh property.
     */
    public void setIsFirstRefresh(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFirstRefresh", value);
    }
    /**
     * Sets the mostRecentRefreshDateTime property value. The mostRecentRefreshDateTime property
     * @param value Value to set for the mostRecentRefreshDateTime property.
     */
    public void setMostRecentRefreshDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("mostRecentRefreshDateTime", value);
    }
    /**
     * Sets the mostRecentRefreshRequestStatus property value. The mostRecentRefreshRequestStatus property
     * @param value Value to set for the mostRecentRefreshRequestStatus property.
     */
    public void setMostRecentRefreshRequestStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mostRecentRefreshRequestStatus", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
