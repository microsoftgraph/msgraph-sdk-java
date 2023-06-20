package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MediaStream implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The direction property */
    private MediaDirection direction;
    /** The media stream label. */
    private String label;
    /** The mediaType property */
    private Modality mediaType;
    /** The OdataType property */
    private String odataType;
    /** If the media is muted by the server. */
    private Boolean serverMuted;
    /** The source ID. */
    private String sourceId;
    /**
     * Instantiates a new mediaStream and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MediaStream() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mediaStream
     */
    @javax.annotation.Nonnull
    public static MediaStream createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaStream();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the direction property value. The direction property
     * @return a MediaDirection
     */
    @javax.annotation.Nullable
    public MediaDirection getDirection() {
        return this.direction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the mediaType property value. The mediaType property
     * @return a Modality
     */
    @javax.annotation.Nullable
    public Modality getMediaType() {
        return this.mediaType;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the serverMuted property value. If the media is muted by the server.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getServerMuted() {
        return this.serverMuted;
    }
    /**
     * Gets the sourceId property value. The source ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("direction", this.getDirection());
        writer.writeStringValue("label", this.getLabel());
        writer.writeEnumValue("mediaType", this.getMediaType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("serverMuted", this.getServerMuted());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the direction property value. The direction property
     * @param value Value to set for the direction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirection(@javax.annotation.Nullable final MediaDirection value) {
        this.direction = value;
    }
    /**
     * Sets the label property value. The media stream label.
     * @param value Value to set for the label property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabel(@javax.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the mediaType property value. The mediaType property
     * @param value Value to set for the mediaType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaType(@javax.annotation.Nullable final Modality value) {
        this.mediaType = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the serverMuted property value. If the media is muted by the server.
     * @param value Value to set for the serverMuted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServerMuted(@javax.annotation.Nullable final Boolean value) {
        this.serverMuted = value;
    }
    /**
     * Sets the sourceId property value. The source ID.
     * @param value Value to set for the sourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceId(@javax.annotation.Nullable final String value) {
        this.sourceId = value;
    }
}
