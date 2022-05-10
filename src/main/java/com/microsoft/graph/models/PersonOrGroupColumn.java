package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersonOrGroupColumn implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether multiple values can be selected from the source. */
    private Boolean _allowMultipleSelection;
    /** Whether to allow selection of people only, or people and groups. Must be one of peopleAndGroups or peopleOnly. */
    private String _chooseFromType;
    /** How to display the information about the person or group chosen. See below. */
    private String _displayAs;
    /**
     * Instantiates a new personOrGroupColumn and sets the default values.
     * @return a void
     */
    public PersonOrGroupColumn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a personOrGroupColumn
     */
    @javax.annotation.Nonnull
    public static PersonOrGroupColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonOrGroupColumn();
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
     * Gets the allowMultipleSelection property value. Indicates whether multiple values can be selected from the source.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowMultipleSelection() {
        return this._allowMultipleSelection;
    }
    /**
     * Gets the chooseFromType property value. Whether to allow selection of people only, or people and groups. Must be one of peopleAndGroups or peopleOnly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChooseFromType() {
        return this._chooseFromType;
    }
    /**
     * Gets the displayAs property value. How to display the information about the person or group chosen. See below.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayAs() {
        return this._displayAs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PersonOrGroupColumn currentObject = this;
        return new HashMap<>(3) {{
            this.put("allowMultipleSelection", (n) -> { currentObject.setAllowMultipleSelection(n.getBooleanValue()); });
            this.put("chooseFromType", (n) -> { currentObject.setChooseFromType(n.getStringValue()); });
            this.put("displayAs", (n) -> { currentObject.setDisplayAs(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowMultipleSelection", this.getAllowMultipleSelection());
        writer.writeStringValue("chooseFromType", this.getChooseFromType());
        writer.writeStringValue("displayAs", this.getDisplayAs());
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
     * Sets the allowMultipleSelection property value. Indicates whether multiple values can be selected from the source.
     * @param value Value to set for the allowMultipleSelection property.
     * @return a void
     */
    public void setAllowMultipleSelection(@javax.annotation.Nullable final Boolean value) {
        this._allowMultipleSelection = value;
    }
    /**
     * Sets the chooseFromType property value. Whether to allow selection of people only, or people and groups. Must be one of peopleAndGroups or peopleOnly.
     * @param value Value to set for the chooseFromType property.
     * @return a void
     */
    public void setChooseFromType(@javax.annotation.Nullable final String value) {
        this._chooseFromType = value;
    }
    /**
     * Sets the displayAs property value. How to display the information about the person or group chosen. See below.
     * @param value Value to set for the displayAs property.
     * @return a void
     */
    public void setDisplayAs(@javax.annotation.Nullable final String value) {
        this._displayAs = value;
    }
}
