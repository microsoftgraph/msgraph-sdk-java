package com.microsoft.graph.models.security;

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
public class DetonationObservables implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DetonationObservables} and sets the default values.
     */
    public DetonationObservables() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DetonationObservables}
     */
    @jakarta.annotation.Nonnull
    public static DetonationObservables createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DetonationObservables();
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
     * Gets the contactedIps property value. The list of all contacted IPs in the detonation.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getContactedIps() {
        return this.backingStore.get("contactedIps");
    }
    /**
     * Gets the contactedUrls property value. The list of all URLs found in the detonation.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getContactedUrls() {
        return this.backingStore.get("contactedUrls");
    }
    /**
     * Gets the droppedfiles property value. The list of all dropped files in the detonation.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDroppedfiles() {
        return this.backingStore.get("droppedfiles");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("contactedIps", (n) -> { this.setContactedIps(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("contactedUrls", (n) -> { this.setContactedUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("droppedfiles", (n) -> { this.setDroppedfiles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeCollectionOfPrimitiveValues("contactedIps", this.getContactedIps());
        writer.writeCollectionOfPrimitiveValues("contactedUrls", this.getContactedUrls());
        writer.writeCollectionOfPrimitiveValues("droppedfiles", this.getDroppedfiles());
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
     * Sets the contactedIps property value. The list of all contacted IPs in the detonation.
     * @param value Value to set for the contactedIps property.
     */
    public void setContactedIps(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("contactedIps", value);
    }
    /**
     * Sets the contactedUrls property value. The list of all URLs found in the detonation.
     * @param value Value to set for the contactedUrls property.
     */
    public void setContactedUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("contactedUrls", value);
    }
    /**
     * Sets the droppedfiles property value. The list of all dropped files in the detonation.
     * @param value Value to set for the droppedfiles property.
     */
    public void setDroppedfiles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("droppedfiles", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
