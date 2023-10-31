package com.microsoft.graph.models;

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
public class MediaStream implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new MediaStream and sets the default values.
     */
    public MediaStream() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MediaStream
     */
    @jakarta.annotation.Nonnull
    public static MediaStream createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaStream();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the direction property value. The direction property
     * @return a MediaDirection
     */
    @jakarta.annotation.Nullable
    public MediaDirection getDirection() {
        return this.getBackingStore().get("direction");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("direction", (n) -> { this.setDirection(n.getEnumValue(MediaDirection.class)); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("mediaType", (n) -> { this.setMediaType(n.getEnumValue(Modality.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("serverMuted", (n) -> { this.setServerMuted(n.getBooleanValue()); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. The media stream label.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.getBackingStore().get("label");
    }
    /**
     * Gets the mediaType property value. The mediaType property
     * @return a Modality
     */
    @jakarta.annotation.Nullable
    public Modality getMediaType() {
        return this.getBackingStore().get("mediaType");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the serverMuted property value. If the media is muted by the server.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getServerMuted() {
        return this.getBackingStore().get("serverMuted");
    }
    /**
     * Gets the sourceId property value. The source ID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.getBackingStore().get("sourceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("direction", this.getDirection());
        writer.writeStringValue("label", this.getLabel());
        writer.writeEnumValue("mediaType", this.getMediaType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("serverMuted", this.getServerMuted());
        writer.writeStringValue("sourceId", this.getSourceId());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the direction property value. The direction property
     * @param value Value to set for the direction property.
     */
    public void setDirection(@jakarta.annotation.Nullable final MediaDirection value) {
        this.getBackingStore().set("direction", value);
    }
    /**
     * Sets the label property value. The media stream label.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("label", value);
    }
    /**
     * Sets the mediaType property value. The mediaType property
     * @param value Value to set for the mediaType property.
     */
    public void setMediaType(@jakarta.annotation.Nullable final Modality value) {
        this.getBackingStore().set("mediaType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the serverMuted property value. If the media is muted by the server.
     * @param value Value to set for the serverMuted property.
     */
    public void setServerMuted(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("serverMuted", value);
    }
    /**
     * Sets the sourceId property value. The source ID.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("sourceId", value);
    }
}
