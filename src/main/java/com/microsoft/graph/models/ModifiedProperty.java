package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ModifiedProperty implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Name of property that was modified.  */
    private String _displayName;
    /** New property value.  */
    private String _newValue;
    /** Old property value.  */
    private String _oldValue;
    /**
     * Instantiates a new modifiedProperty and sets the default values.
     * @return a void
     */
    public ModifiedProperty() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a modifiedProperty
     */
    @javax.annotation.Nonnull
    public static ModifiedProperty createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ModifiedProperty();
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
     * Gets the displayName property value. Name of property that was modified.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ModifiedProperty currentObject = this;
        return new HashMap<>(3) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("newValue", (n) -> { currentObject.setNewValue(n.getStringValue()); });
            this.put("oldValue", (n) -> { currentObject.setOldValue(n.getStringValue()); });
        }};
    }
    /**
     * Gets the newValue property value. New property value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNewValue() {
        return this._newValue;
    }
    /**
     * Gets the oldValue property value. Old property value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOldValue() {
        return this._oldValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("newValue", this.getNewValue());
        writer.writeStringValue("oldValue", this.getOldValue());
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
     * Sets the displayName property value. Name of property that was modified.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the newValue property value. New property value.
     * @param value Value to set for the newValue property.
     * @return a void
     */
    public void setNewValue(@javax.annotation.Nullable final String value) {
        this._newValue = value;
    }
    /**
     * Sets the oldValue property value. Old property value.
     * @param value Value to set for the oldValue property.
     * @return a void
     */
    public void setOldValue(@javax.annotation.Nullable final String value) {
        this._oldValue = value;
    }
}
