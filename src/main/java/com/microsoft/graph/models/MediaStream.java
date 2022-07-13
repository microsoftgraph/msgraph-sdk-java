package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MediaStream implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The direction property */
    private MediaDirection _direction;
    /** The media stream label. */
    private String _label;
    /** The mediaType property */
    private Modality _mediaType;
    /** Indicates whether the media is muted by the server. */
    private Boolean _serverMuted;
    /** The source ID. */
    private String _sourceId;
    /**
     * Instantiates a new mediaStream and sets the default values.
     * @return a void
     */
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
        return this._additionalData;
    }
    /**
     * Gets the direction property value. The direction property
     * @return a mediaDirection
     */
    @javax.annotation.Nullable
    public MediaDirection getDirection() {
        return this._direction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MediaStream currentObject = this;
        return new HashMap<>(5) {{
            this.put("direction", (n) -> { currentObject.setDirection(n.getEnumValue(MediaDirection.class)); });
            this.put("label", (n) -> { currentObject.setLabel(n.getStringValue()); });
            this.put("mediaType", (n) -> { currentObject.setMediaType(n.getEnumValue(Modality.class)); });
            this.put("serverMuted", (n) -> { currentObject.setServerMuted(n.getBooleanValue()); });
            this.put("sourceId", (n) -> { currentObject.setSourceId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the label property value. The media stream label.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabel() {
        return this._label;
    }
    /**
     * Gets the mediaType property value. The mediaType property
     * @return a modality
     */
    @javax.annotation.Nullable
    public Modality getMediaType() {
        return this._mediaType;
    }
    /**
     * Gets the serverMuted property value. Indicates whether the media is muted by the server.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getServerMuted() {
        return this._serverMuted;
    }
    /**
     * Gets the sourceId property value. The source ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return this._sourceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("direction", this.getDirection());
        writer.writeStringValue("label", this.getLabel());
        writer.writeEnumValue("mediaType", this.getMediaType());
        writer.writeBooleanValue("serverMuted", this.getServerMuted());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the direction property value. The direction property
     * @param value Value to set for the direction property.
     * @return a void
     */
    public void setDirection(@javax.annotation.Nullable final MediaDirection value) {
        this._direction = value;
    }
    /**
     * Sets the label property value. The media stream label.
     * @param value Value to set for the label property.
     * @return a void
     */
    public void setLabel(@javax.annotation.Nullable final String value) {
        this._label = value;
    }
    /**
     * Sets the mediaType property value. The mediaType property
     * @param value Value to set for the mediaType property.
     * @return a void
     */
    public void setMediaType(@javax.annotation.Nullable final Modality value) {
        this._mediaType = value;
    }
    /**
     * Sets the serverMuted property value. Indicates whether the media is muted by the server.
     * @param value Value to set for the serverMuted property.
     * @return a void
     */
    public void setServerMuted(@javax.annotation.Nullable final Boolean value) {
        this._serverMuted = value;
    }
    /**
     * Sets the sourceId property value. The source ID.
     * @param value Value to set for the sourceId property.
     * @return a void
     */
    public void setSourceId(@javax.annotation.Nullable final String value) {
        this._sourceId = value;
    }
}
