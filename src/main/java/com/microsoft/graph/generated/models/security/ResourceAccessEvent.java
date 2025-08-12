package com.microsoft.graph.models.security;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResourceAccessEvent implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ResourceAccessEvent} and sets the default values.
     */
    public ResourceAccessEvent() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResourceAccessEvent}
     */
    @jakarta.annotation.Nonnull
    public static ResourceAccessEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceAccessEvent();
    }
    /**
     * Gets the accessDateTime property value. The time of the access event.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAccessDateTime() {
        return this.backingStore.get("accessDateTime");
    }
    /**
     * Gets the accountId property value. The identifier of the user account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountId() {
        return this.backingStore.get("accountId");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("accessDateTime", (n) -> { this.setAccessDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("accountId", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceIdentifier", (n) -> { this.setResourceIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. IP address of the resource.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.backingStore.get("ipAddress");
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
     * Gets the resourceIdentifier property value. The protocol and host name pairs describing the connection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceIdentifier() {
        return this.backingStore.get("resourceIdentifier");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("accessDateTime", this.getAccessDateTime());
        writer.writeStringValue("accountId", this.getAccountId());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("resourceIdentifier", this.getResourceIdentifier());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessDateTime property value. The time of the access event.
     * @param value Value to set for the accessDateTime property.
     */
    public void setAccessDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("accessDateTime", value);
    }
    /**
     * Sets the accountId property value. The identifier of the user account.
     * @param value Value to set for the accountId property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accountId", value);
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
     * Sets the ipAddress property value. IP address of the resource.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipAddress", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the resourceIdentifier property value. The protocol and host name pairs describing the connection.
     * @param value Value to set for the resourceIdentifier property.
     */
    public void setResourceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceIdentifier", value);
    }
}
