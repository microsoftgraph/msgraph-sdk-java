package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceUpdateMessageViewpoint implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether the user archived the message. */
    private Boolean _isArchived;
    /** Indicates whether the user marked the message as favorite. */
    private Boolean _isFavorited;
    /** Indicates whether the user read the message. */
    private Boolean _isRead;
    /**
     * Instantiates a new serviceUpdateMessageViewpoint and sets the default values.
     * @return a void
     */
    public ServiceUpdateMessageViewpoint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serviceUpdateMessageViewpoint
     */
    @javax.annotation.Nonnull
    public static ServiceUpdateMessageViewpoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUpdateMessageViewpoint();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ServiceUpdateMessageViewpoint currentObject = this;
        return new HashMap<>(3) {{
            this.put("isArchived", (n) -> { currentObject.setIsArchived(n.getBooleanValue()); });
            this.put("isFavorited", (n) -> { currentObject.setIsFavorited(n.getBooleanValue()); });
            this.put("isRead", (n) -> { currentObject.setIsRead(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isArchived property value. Indicates whether the user archived the message.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsArchived() {
        return this._isArchived;
    }
    /**
     * Gets the isFavorited property value. Indicates whether the user marked the message as favorite.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFavorited() {
        return this._isFavorited;
    }
    /**
     * Gets the isRead property value. Indicates whether the user read the message.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRead() {
        return this._isRead;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeBooleanValue("isFavorited", this.getIsFavorited());
        writer.writeBooleanValue("isRead", this.getIsRead());
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
     * Sets the isArchived property value. Indicates whether the user archived the message.
     * @param value Value to set for the isArchived property.
     * @return a void
     */
    public void setIsArchived(@javax.annotation.Nullable final Boolean value) {
        this._isArchived = value;
    }
    /**
     * Sets the isFavorited property value. Indicates whether the user marked the message as favorite.
     * @param value Value to set for the isFavorited property.
     * @return a void
     */
    public void setIsFavorited(@javax.annotation.Nullable final Boolean value) {
        this._isFavorited = value;
    }
    /**
     * Sets the isRead property value. Indicates whether the user read the message.
     * @param value Value to set for the isRead property.
     * @return a void
     */
    public void setIsRead(@javax.annotation.Nullable final Boolean value) {
        this._isRead = value;
    }
}
