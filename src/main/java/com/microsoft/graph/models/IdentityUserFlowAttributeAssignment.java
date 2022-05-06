package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityUserFlowAttributeAssignment extends Entity implements Parsable {
    /** The display name of the identityUserFlowAttribute within a user flow.  */
    private String _displayName;
    /** Determines whether the identityUserFlowAttribute is optional. true means the user doesn't have to provide a value. false means the user cannot complete sign-up without providing a value.  */
    private Boolean _isOptional;
    /** Determines whether the identityUserFlowAttribute requires verification. This is only used for verifying the user's phone number or email address.  */
    private Boolean _requiresVerification;
    /** The user attribute that you want to add to your user flow.  */
    private IdentityUserFlowAttribute _userAttribute;
    /** The input options for the user flow attribute. Only applicable when the userInputType is radioSingleSelect, dropdownSingleSelect, or checkboxMultiSelect.  */
    private java.util.List<UserAttributeValuesItem> _userAttributeValues;
    /** The input type of the user flow attribute. Possible values are: textBox, dateTimeDropdown, radioSingleSelect, dropdownSingleSelect, emailBox, checkboxMultiSelect.  */
    private IdentityUserFlowAttributeInputType _userInputType;
    /**
     * Instantiates a new identityUserFlowAttributeAssignment and sets the default values.
     * @return a void
     */
    public IdentityUserFlowAttributeAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identityUserFlowAttributeAssignment
     */
    @javax.annotation.Nonnull
    public static IdentityUserFlowAttributeAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityUserFlowAttributeAssignment();
    }
    /**
     * Gets the displayName property value. The display name of the identityUserFlowAttribute within a user flow.
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
        final IdentityUserFlowAttributeAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isOptional", (n) -> { currentObject.setIsOptional(n.getBooleanValue()); });
            this.put("requiresVerification", (n) -> { currentObject.setRequiresVerification(n.getBooleanValue()); });
            this.put("userAttribute", (n) -> { currentObject.setUserAttribute(n.getObjectValue(IdentityUserFlowAttribute::createFromDiscriminatorValue)); });
            this.put("userAttributeValues", (n) -> { currentObject.setUserAttributeValues(n.getCollectionOfObjectValues(UserAttributeValuesItem::createFromDiscriminatorValue)); });
            this.put("userInputType", (n) -> { currentObject.setUserInputType(n.getEnumValue(IdentityUserFlowAttributeInputType.class)); });
        }};
    }
    /**
     * Gets the isOptional property value. Determines whether the identityUserFlowAttribute is optional. true means the user doesn't have to provide a value. false means the user cannot complete sign-up without providing a value.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOptional() {
        return this._isOptional;
    }
    /**
     * Gets the requiresVerification property value. Determines whether the identityUserFlowAttribute requires verification. This is only used for verifying the user's phone number or email address.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequiresVerification() {
        return this._requiresVerification;
    }
    /**
     * Gets the userAttribute property value. The user attribute that you want to add to your user flow.
     * @return a identityUserFlowAttribute
     */
    @javax.annotation.Nullable
    public IdentityUserFlowAttribute getUserAttribute() {
        return this._userAttribute;
    }
    /**
     * Gets the userAttributeValues property value. The input options for the user flow attribute. Only applicable when the userInputType is radioSingleSelect, dropdownSingleSelect, or checkboxMultiSelect.
     * @return a userAttributeValuesItem
     */
    @javax.annotation.Nullable
    public java.util.List<UserAttributeValuesItem> getUserAttributeValues() {
        return this._userAttributeValues;
    }
    /**
     * Gets the userInputType property value. The input type of the user flow attribute. Possible values are: textBox, dateTimeDropdown, radioSingleSelect, dropdownSingleSelect, emailBox, checkboxMultiSelect.
     * @return a identityUserFlowAttributeInputType
     */
    @javax.annotation.Nullable
    public IdentityUserFlowAttributeInputType getUserInputType() {
        return this._userInputType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isOptional", this.getIsOptional());
        writer.writeBooleanValue("requiresVerification", this.getRequiresVerification());
        writer.writeObjectValue("userAttribute", this.getUserAttribute());
        writer.writeCollectionOfObjectValues("userAttributeValues", this.getUserAttributeValues());
        writer.writeEnumValue("userInputType", this.getUserInputType());
    }
    /**
     * Sets the displayName property value. The display name of the identityUserFlowAttribute within a user flow.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isOptional property value. Determines whether the identityUserFlowAttribute is optional. true means the user doesn't have to provide a value. false means the user cannot complete sign-up without providing a value.
     * @param value Value to set for the isOptional property.
     * @return a void
     */
    public void setIsOptional(@javax.annotation.Nullable final Boolean value) {
        this._isOptional = value;
    }
    /**
     * Sets the requiresVerification property value. Determines whether the identityUserFlowAttribute requires verification. This is only used for verifying the user's phone number or email address.
     * @param value Value to set for the requiresVerification property.
     * @return a void
     */
    public void setRequiresVerification(@javax.annotation.Nullable final Boolean value) {
        this._requiresVerification = value;
    }
    /**
     * Sets the userAttribute property value. The user attribute that you want to add to your user flow.
     * @param value Value to set for the userAttribute property.
     * @return a void
     */
    public void setUserAttribute(@javax.annotation.Nullable final IdentityUserFlowAttribute value) {
        this._userAttribute = value;
    }
    /**
     * Sets the userAttributeValues property value. The input options for the user flow attribute. Only applicable when the userInputType is radioSingleSelect, dropdownSingleSelect, or checkboxMultiSelect.
     * @param value Value to set for the userAttributeValues property.
     * @return a void
     */
    public void setUserAttributeValues(@javax.annotation.Nullable final java.util.List<UserAttributeValuesItem> value) {
        this._userAttributeValues = value;
    }
    /**
     * Sets the userInputType property value. The input type of the user flow attribute. Possible values are: textBox, dateTimeDropdown, radioSingleSelect, dropdownSingleSelect, emailBox, checkboxMultiSelect.
     * @param value Value to set for the userInputType property.
     * @return a void
     */
    public void setUserInputType(@javax.annotation.Nullable final IdentityUserFlowAttributeInputType value) {
        this._userInputType = value;
    }
}
