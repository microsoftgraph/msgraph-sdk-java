package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityUserFlowAttribute extends Entity implements Parsable {
    /** The data type of the user flow attribute. This cannot be modified after the custom user flow attribute is created. The supported values for dataType are: string , boolean , int64 , stringCollection , dateTime. */
    private IdentityUserFlowAttributeDataType _dataType;
    /** The description of the user flow attribute that's shown to the user at the time of sign-up. */
    private String _description;
    /** The display name of the user flow attribute. */
    private String _displayName;
    /** The type of the user flow attribute. This is a read-only attribute that is automatically set. Depending on the type of attribute, the values for this property will be builtIn, custom, or required. */
    private IdentityUserFlowAttributeType _userFlowAttributeType;
    /**
     * Instantiates a new identityUserFlowAttribute and sets the default values.
     * @return a void
     */
    public IdentityUserFlowAttribute() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identityUserFlowAttribute
     */
    @javax.annotation.Nonnull
    public static IdentityUserFlowAttribute createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityUserFlowAttribute();
    }
    /**
     * Gets the dataType property value. The data type of the user flow attribute. This cannot be modified after the custom user flow attribute is created. The supported values for dataType are: string , boolean , int64 , stringCollection , dateTime.
     * @return a identityUserFlowAttributeDataType
     */
    @javax.annotation.Nullable
    public IdentityUserFlowAttributeDataType getDataType() {
        return this._dataType;
    }
    /**
     * Gets the description property value. The description of the user flow attribute that's shown to the user at the time of sign-up.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the user flow attribute.
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
        final IdentityUserFlowAttribute currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("dataType", (n) -> { currentObject.setDataType(n.getEnumValue(IdentityUserFlowAttributeDataType.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("userFlowAttributeType", (n) -> { currentObject.setUserFlowAttributeType(n.getEnumValue(IdentityUserFlowAttributeType.class)); });
        }};
    }
    /**
     * Gets the userFlowAttributeType property value. The type of the user flow attribute. This is a read-only attribute that is automatically set. Depending on the type of attribute, the values for this property will be builtIn, custom, or required.
     * @return a identityUserFlowAttributeType
     */
    @javax.annotation.Nullable
    public IdentityUserFlowAttributeType getUserFlowAttributeType() {
        return this._userFlowAttributeType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("dataType", this.getDataType());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("userFlowAttributeType", this.getUserFlowAttributeType());
    }
    /**
     * Sets the dataType property value. The data type of the user flow attribute. This cannot be modified after the custom user flow attribute is created. The supported values for dataType are: string , boolean , int64 , stringCollection , dateTime.
     * @param value Value to set for the dataType property.
     * @return a void
     */
    public void setDataType(@javax.annotation.Nullable final IdentityUserFlowAttributeDataType value) {
        this._dataType = value;
    }
    /**
     * Sets the description property value. The description of the user flow attribute that's shown to the user at the time of sign-up.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the user flow attribute.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the userFlowAttributeType property value. The type of the user flow attribute. This is a read-only attribute that is automatically set. Depending on the type of attribute, the values for this property will be builtIn, custom, or required.
     * @param value Value to set for the userFlowAttributeType property.
     * @return a void
     */
    public void setUserFlowAttributeType(@javax.annotation.Nullable final IdentityUserFlowAttributeType value) {
        this._userFlowAttributeType = value;
    }
}
