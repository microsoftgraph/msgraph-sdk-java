package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamGuestSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** If set to true, guests can add and update channels.  */
    private Boolean _allowCreateUpdateChannels;
    /** If set to true, guests can delete channels.  */
    private Boolean _allowDeleteChannels;
    /**
     * Instantiates a new teamGuestSettings and sets the default values.
     * @return a void
     */
    public TeamGuestSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamGuestSettings
     */
    @javax.annotation.Nonnull
    public static TeamGuestSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamGuestSettings();
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
     * Gets the allowCreateUpdateChannels property value. If set to true, guests can add and update channels.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowCreateUpdateChannels() {
        return this._allowCreateUpdateChannels;
    }
    /**
     * Gets the allowDeleteChannels property value. If set to true, guests can delete channels.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDeleteChannels() {
        return this._allowDeleteChannels;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamGuestSettings currentObject = this;
        return new HashMap<>(2) {{
            this.put("allowCreateUpdateChannels", (n) -> { currentObject.setAllowCreateUpdateChannels(n.getBooleanValue()); });
            this.put("allowDeleteChannels", (n) -> { currentObject.setAllowDeleteChannels(n.getBooleanValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowCreateUpdateChannels", this.getAllowCreateUpdateChannels());
        writer.writeBooleanValue("allowDeleteChannels", this.getAllowDeleteChannels());
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
     * Sets the allowCreateUpdateChannels property value. If set to true, guests can add and update channels.
     * @param value Value to set for the allowCreateUpdateChannels property.
     * @return a void
     */
    public void setAllowCreateUpdateChannels(@javax.annotation.Nullable final Boolean value) {
        this._allowCreateUpdateChannels = value;
    }
    /**
     * Sets the allowDeleteChannels property value. If set to true, guests can delete channels.
     * @param value Value to set for the allowDeleteChannels property.
     * @return a void
     */
    public void setAllowDeleteChannels(@javax.annotation.Nullable final Boolean value) {
        this._allowDeleteChannels = value;
    }
}
