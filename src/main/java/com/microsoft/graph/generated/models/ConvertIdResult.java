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
public class ConvertIdResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ConvertIdResult} and sets the default values.
     */
    public ConvertIdResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConvertIdResult}
     */
    @jakarta.annotation.Nonnull
    public static ConvertIdResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConvertIdResult();
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
     * Gets the errorDetails property value. An error object indicating the reason for the conversion failure. This value isn't present if the conversion succeeded.
     * @return a {@link GenericError}
     */
    @jakarta.annotation.Nullable
    public GenericError getErrorDetails() {
        return this.backingStore.get("errorDetails");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("errorDetails", (n) -> { this.setErrorDetails(n.getObjectValue(GenericError::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("targetId", (n) -> { this.setTargetId(n.getStringValue()); });
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
     * Gets the sourceId property value. The identifier that was converted. This value is the original, un-converted identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.backingStore.get("sourceId");
    }
    /**
     * Gets the targetId property value. The converted identifier. This value isn't present if the conversion failed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetId() {
        return this.backingStore.get("targetId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("errorDetails", this.getErrorDetails());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeStringValue("targetId", this.getTargetId());
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
     * Sets the errorDetails property value. An error object indicating the reason for the conversion failure. This value isn't present if the conversion succeeded.
     * @param value Value to set for the errorDetails property.
     */
    public void setErrorDetails(@jakarta.annotation.Nullable final GenericError value) {
        this.backingStore.set("errorDetails", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sourceId property value. The identifier that was converted. This value is the original, un-converted identifier.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceId", value);
    }
    /**
     * Sets the targetId property value. The converted identifier. This value isn't present if the conversion failed.
     * @param value Value to set for the targetId property.
     */
    public void setTargetId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetId", value);
    }
}
