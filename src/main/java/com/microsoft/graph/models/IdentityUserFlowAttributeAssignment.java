package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityUserFlowAttributeAssignment extends Entity implements Parsable {
    /**
     * The display name of the identityUserFlowAttribute within a user flow.
     */
    private String displayName;
    /**
     * Determines whether the identityUserFlowAttribute is optional. true means the user doesn't have to provide a value. false means the user cannot complete sign-up without providing a value.
     */
    private Boolean isOptional;
    /**
     * Determines whether the identityUserFlowAttribute requires verification. This is only used for verifying the user's phone number or email address.
     */
    private Boolean requiresVerification;
    /**
     * The user attribute that you want to add to your user flow.
     */
    private IdentityUserFlowAttribute userAttribute;
    /**
     * The input options for the user flow attribute. Only applicable when the userInputType is radioSingleSelect, dropdownSingleSelect, or checkboxMultiSelect.
     */
    private java.util.List<UserAttributeValuesItem> userAttributeValues;
    /**
     * The userInputType property
     */
    private IdentityUserFlowAttributeInputType userInputType;
    /**
     * Instantiates a new identityUserFlowAttributeAssignment and sets the default values.
     */
    public IdentityUserFlowAttributeAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identityUserFlowAttributeAssignment
     */
    @jakarta.annotation.Nonnull
    public static IdentityUserFlowAttributeAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityUserFlowAttributeAssignment();
    }
    /**
     * Gets the displayName property value. The display name of the identityUserFlowAttribute within a user flow.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isOptional", (n) -> { this.setIsOptional(n.getBooleanValue()); });
        deserializerMap.put("requiresVerification", (n) -> { this.setRequiresVerification(n.getBooleanValue()); });
        deserializerMap.put("userAttribute", (n) -> { this.setUserAttribute(n.getObjectValue(IdentityUserFlowAttribute::createFromDiscriminatorValue)); });
        deserializerMap.put("userAttributeValues", (n) -> { this.setUserAttributeValues(n.getCollectionOfObjectValues(UserAttributeValuesItem::createFromDiscriminatorValue)); });
        deserializerMap.put("userInputType", (n) -> { this.setUserInputType(n.getEnumValue(IdentityUserFlowAttributeInputType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isOptional property value. Determines whether the identityUserFlowAttribute is optional. true means the user doesn't have to provide a value. false means the user cannot complete sign-up without providing a value.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOptional() {
        return this.isOptional;
    }
    /**
     * Gets the requiresVerification property value. Determines whether the identityUserFlowAttribute requires verification. This is only used for verifying the user's phone number or email address.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequiresVerification() {
        return this.requiresVerification;
    }
    /**
     * Gets the userAttribute property value. The user attribute that you want to add to your user flow.
     * @return a identityUserFlowAttribute
     */
    @jakarta.annotation.Nullable
    public IdentityUserFlowAttribute getUserAttribute() {
        return this.userAttribute;
    }
    /**
     * Gets the userAttributeValues property value. The input options for the user flow attribute. Only applicable when the userInputType is radioSingleSelect, dropdownSingleSelect, or checkboxMultiSelect.
     * @return a userAttributeValuesItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserAttributeValuesItem> getUserAttributeValues() {
        return this.userAttributeValues;
    }
    /**
     * Gets the userInputType property value. The userInputType property
     * @return a identityUserFlowAttributeInputType
     */
    @jakarta.annotation.Nullable
    public IdentityUserFlowAttributeInputType getUserInputType() {
        return this.userInputType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isOptional property value. Determines whether the identityUserFlowAttribute is optional. true means the user doesn't have to provide a value. false means the user cannot complete sign-up without providing a value.
     * @param value Value to set for the isOptional property.
     */
    public void setIsOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.isOptional = value;
    }
    /**
     * Sets the requiresVerification property value. Determines whether the identityUserFlowAttribute requires verification. This is only used for verifying the user's phone number or email address.
     * @param value Value to set for the requiresVerification property.
     */
    public void setRequiresVerification(@jakarta.annotation.Nullable final Boolean value) {
        this.requiresVerification = value;
    }
    /**
     * Sets the userAttribute property value. The user attribute that you want to add to your user flow.
     * @param value Value to set for the userAttribute property.
     */
    public void setUserAttribute(@jakarta.annotation.Nullable final IdentityUserFlowAttribute value) {
        this.userAttribute = value;
    }
    /**
     * Sets the userAttributeValues property value. The input options for the user flow attribute. Only applicable when the userInputType is radioSingleSelect, dropdownSingleSelect, or checkboxMultiSelect.
     * @param value Value to set for the userAttributeValues property.
     */
    public void setUserAttributeValues(@jakarta.annotation.Nullable final java.util.List<UserAttributeValuesItem> value) {
        this.userAttributeValues = value;
    }
    /**
     * Sets the userInputType property value. The userInputType property
     * @param value Value to set for the userInputType property.
     */
    public void setUserInputType(@jakarta.annotation.Nullable final IdentityUserFlowAttributeInputType value) {
        this.userInputType = value;
    }
}
