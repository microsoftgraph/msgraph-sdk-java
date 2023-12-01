package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationStrengthPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new AuthenticationStrengthPolicy and sets the default values.
     */
    public AuthenticationStrengthPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationStrengthPolicy
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationStrengthPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationStrengthPolicy();
    }
    /**
     * Gets the allowedCombinations property value. A collection of authentication method modes that are required be used to satify this authentication strength.
     * @return a java.util.List<AuthenticationMethodModes>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getAllowedCombinations() {
        return this.backingStore.get("allowedCombinations");
    }
    /**
     * Gets the combinationConfigurations property value. Settings that may be used to require specific types or instances of an authentication method to be used when authenticating with a specified combination of authentication methods.
     * @return a java.util.List<AuthenticationCombinationConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationCombinationConfiguration> getCombinationConfigurations() {
        return this.backingStore.get("combinationConfigurations");
    }
    /**
     * Gets the createdDateTime property value. The datetime when this policy was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The human-readable description of this policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The human-readable display name of this policy. Supports $filter (eq, ne, not , and in).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedCombinations", (n) -> { this.setAllowedCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes::forValue)); });
        deserializerMap.put("combinationConfigurations", (n) -> { this.setCombinationConfigurations(n.getCollectionOfObjectValues(AuthenticationCombinationConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("policyType", (n) -> { this.setPolicyType(n.getEnumValue(AuthenticationStrengthPolicyType::forValue)); });
        deserializerMap.put("requirementsSatisfied", (n) -> { this.setRequirementsSatisfied(n.getEnumSetValue(AuthenticationStrengthRequirements::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedDateTime property value. The datetime when this policy was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.backingStore.get("modifiedDateTime");
    }
    /**
     * Gets the policyType property value. The policyType property
     * @return a AuthenticationStrengthPolicyType
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrengthPolicyType getPolicyType() {
        return this.backingStore.get("policyType");
    }
    /**
     * Gets the requirementsSatisfied property value. The requirementsSatisfied property
     * @return a EnumSet<AuthenticationStrengthRequirements>
     */
    @jakarta.annotation.Nullable
    public EnumSet<AuthenticationStrengthRequirements> getRequirementsSatisfied() {
        return this.backingStore.get("requirementsSatisfied");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("allowedCombinations", this.getAllowedCombinations());
        writer.writeCollectionOfObjectValues("combinationConfigurations", this.getCombinationConfigurations());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeEnumValue("policyType", this.getPolicyType());
        writer.writeEnumSetValue("requirementsSatisfied", this.getRequirementsSatisfied());
    }
    /**
     * Sets the allowedCombinations property value. A collection of authentication method modes that are required be used to satify this authentication strength.
     * @param value Value to set for the allowedCombinations property.
     */
    public void setAllowedCombinations(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this.backingStore.set("allowedCombinations", value);
    }
    /**
     * Sets the combinationConfigurations property value. Settings that may be used to require specific types or instances of an authentication method to be used when authenticating with a specified combination of authentication methods.
     * @param value Value to set for the combinationConfigurations property.
     */
    public void setCombinationConfigurations(@jakarta.annotation.Nullable final java.util.List<AuthenticationCombinationConfiguration> value) {
        this.backingStore.set("combinationConfigurations", value);
    }
    /**
     * Sets the createdDateTime property value. The datetime when this policy was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The human-readable description of this policy.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The human-readable display name of this policy. Supports $filter (eq, ne, not , and in).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the modifiedDateTime property value. The datetime when this policy was last modified.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modifiedDateTime", value);
    }
    /**
     * Sets the policyType property value. The policyType property
     * @param value Value to set for the policyType property.
     */
    public void setPolicyType(@jakarta.annotation.Nullable final AuthenticationStrengthPolicyType value) {
        this.backingStore.set("policyType", value);
    }
    /**
     * Sets the requirementsSatisfied property value. The requirementsSatisfied property
     * @param value Value to set for the requirementsSatisfied property.
     */
    public void setRequirementsSatisfied(@jakarta.annotation.Nullable final EnumSet<AuthenticationStrengthRequirements> value) {
        this.backingStore.set("requirementsSatisfied", value);
    }
}
