package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationStrengthPolicy extends Entity implements Parsable {
    /** The allowedCombinations property */
    private java.util.List<AuthenticationMethodModes> allowedCombinations;
    /** The combinationConfigurations property */
    private java.util.List<AuthenticationCombinationConfiguration> combinationConfigurations;
    /** The createdDateTime property */
    private OffsetDateTime createdDateTime;
    /** The description property */
    private String description;
    /** The displayName property */
    private String displayName;
    /** The modifiedDateTime property */
    private OffsetDateTime modifiedDateTime;
    /** The policyType property */
    private AuthenticationStrengthPolicyType policyType;
    /** The requirementsSatisfied property */
    private AuthenticationStrengthRequirements requirementsSatisfied;
    /**
     * Instantiates a new AuthenticationStrengthPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationStrengthPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationStrengthPolicy
     */
    @javax.annotation.Nonnull
    public static AuthenticationStrengthPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationStrengthPolicy();
    }
    /**
     * Gets the allowedCombinations property value. The allowedCombinations property
     * @return a authenticationMethodModes
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getAllowedCombinations() {
        return this.allowedCombinations;
    }
    /**
     * Gets the combinationConfigurations property value. The combinationConfigurations property
     * @return a authenticationCombinationConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationCombinationConfiguration> getCombinationConfigurations() {
        return this.combinationConfigurations;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedCombinations", (n) -> { this.setAllowedCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes.class)); });
        deserializerMap.put("combinationConfigurations", (n) -> { this.setCombinationConfigurations(n.getCollectionOfObjectValues(AuthenticationCombinationConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("policyType", (n) -> { this.setPolicyType(n.getEnumValue(AuthenticationStrengthPolicyType.class)); });
        deserializerMap.put("requirementsSatisfied", (n) -> { this.setRequirementsSatisfied(n.getEnumValue(AuthenticationStrengthRequirements.class)); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedDateTime property value. The modifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the policyType property value. The policyType property
     * @return a authenticationStrengthPolicyType
     */
    @javax.annotation.Nullable
    public AuthenticationStrengthPolicyType getPolicyType() {
        return this.policyType;
    }
    /**
     * Gets the requirementsSatisfied property value. The requirementsSatisfied property
     * @return a authenticationStrengthRequirements
     */
    @javax.annotation.Nullable
    public AuthenticationStrengthRequirements getRequirementsSatisfied() {
        return this.requirementsSatisfied;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("allowedCombinations", this.getAllowedCombinations());
        writer.writeCollectionOfObjectValues("combinationConfigurations", this.getCombinationConfigurations());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeEnumValue("policyType", this.getPolicyType());
        writer.writeEnumValue("requirementsSatisfied", this.getRequirementsSatisfied());
    }
    /**
     * Sets the allowedCombinations property value. The allowedCombinations property
     * @param value Value to set for the allowedCombinations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedCombinations(@javax.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this.allowedCombinations = value;
    }
    /**
     * Sets the combinationConfigurations property value. The combinationConfigurations property
     * @param value Value to set for the combinationConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCombinationConfigurations(@javax.annotation.Nullable final java.util.List<AuthenticationCombinationConfiguration> value) {
        this.combinationConfigurations = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the modifiedDateTime property value. The modifiedDateTime property
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the policyType property value. The policyType property
     * @param value Value to set for the policyType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyType(@javax.annotation.Nullable final AuthenticationStrengthPolicyType value) {
        this.policyType = value;
    }
    /**
     * Sets the requirementsSatisfied property value. The requirementsSatisfied property
     * @param value Value to set for the requirementsSatisfied property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequirementsSatisfied(@javax.annotation.Nullable final AuthenticationStrengthRequirements value) {
        this.requirementsSatisfied = value;
    }
}
