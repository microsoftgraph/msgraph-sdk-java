package com.microsoft.graph.models.teamsadministration;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.User;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsUserConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TeamsUserConfiguration} and sets the default values.
     */
    public TeamsUserConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamsUserConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static TeamsUserConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsUserConfiguration();
    }
    /**
     * Gets the accountType property value. The accountType property
     * @return a {@link AccountType}
     */
    @jakarta.annotation.Nullable
    public AccountType getAccountType() {
        return this.backingStore.get("accountType");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the user was created. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the effectivePolicyAssignments property value. Contains the user&apos;s effective policy assignments, with each assignment including policyType and policyAssignment details.
     * @return a {@link java.util.List<EffectivePolicyAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EffectivePolicyAssignment> getEffectivePolicyAssignments() {
        return this.backingStore.get("effectivePolicyAssignments");
    }
    /**
     * Gets the featureTypes property value. The Teams features enabled for a given user based on licensing or service plan.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFeatureTypes() {
        return this.backingStore.get("featureTypes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountType", (n) -> { this.setAccountType(n.getEnumValue(AccountType::forValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("effectivePolicyAssignments", (n) -> { this.setEffectivePolicyAssignments(n.getCollectionOfObjectValues(EffectivePolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("featureTypes", (n) -> { this.setFeatureTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isEnterpriseVoiceEnabled", (n) -> { this.setIsEnterpriseVoiceEnabled(n.getBooleanValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("telephoneNumbers", (n) -> { this.setTelephoneNumbers(n.getCollectionOfObjectValues(AssignedTelephoneNumber::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnterpriseVoiceEnabled property value. Indicates whether voice capability is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnterpriseVoiceEnabled() {
        return this.backingStore.get("isEnterpriseVoiceEnabled");
    }
    /**
     * Gets the modifiedDateTime property value. The date and time when the user&apos;s details were last modified. The system updates this value each time the user&apos;s details are changed. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.backingStore.get("modifiedDateTime");
    }
    /**
     * Gets the telephoneNumbers property value. Includes both the phone number and its corresponding assignment category. The assignment category can include values such as primary, private, and alternate.
     * @return a {@link java.util.List<AssignedTelephoneNumber>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignedTelephoneNumber> getTelephoneNumbers() {
        return this.backingStore.get("telephoneNumbers");
    }
    /**
     * Gets the tenantId property value. The unique identifier of the tenant in Entra to which this user is assigned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the user property value. Represents an Entra user account.
     * @return a {@link User}
     */
    @jakarta.annotation.Nullable
    public User getUser() {
        return this.backingStore.get("user");
    }
    /**
     * Gets the userPrincipalName property value. The sign-in address of the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("accountType", this.getAccountType());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("effectivePolicyAssignments", this.getEffectivePolicyAssignments());
        writer.writeCollectionOfPrimitiveValues("featureTypes", this.getFeatureTypes());
        writer.writeBooleanValue("isEnterpriseVoiceEnabled", this.getIsEnterpriseVoiceEnabled());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeCollectionOfObjectValues("telephoneNumbers", this.getTelephoneNumbers());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeObjectValue("user", this.getUser());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the accountType property value. The accountType property
     * @param value Value to set for the accountType property.
     */
    public void setAccountType(@jakarta.annotation.Nullable final AccountType value) {
        this.backingStore.set("accountType", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the user was created. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the effectivePolicyAssignments property value. Contains the user&apos;s effective policy assignments, with each assignment including policyType and policyAssignment details.
     * @param value Value to set for the effectivePolicyAssignments property.
     */
    public void setEffectivePolicyAssignments(@jakarta.annotation.Nullable final java.util.List<EffectivePolicyAssignment> value) {
        this.backingStore.set("effectivePolicyAssignments", value);
    }
    /**
     * Sets the featureTypes property value. The Teams features enabled for a given user based on licensing or service plan.
     * @param value Value to set for the featureTypes property.
     */
    public void setFeatureTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("featureTypes", value);
    }
    /**
     * Sets the isEnterpriseVoiceEnabled property value. Indicates whether voice capability is enabled.
     * @param value Value to set for the isEnterpriseVoiceEnabled property.
     */
    public void setIsEnterpriseVoiceEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnterpriseVoiceEnabled", value);
    }
    /**
     * Sets the modifiedDateTime property value. The date and time when the user&apos;s details were last modified. The system updates this value each time the user&apos;s details are changed. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modifiedDateTime", value);
    }
    /**
     * Sets the telephoneNumbers property value. Includes both the phone number and its corresponding assignment category. The assignment category can include values such as primary, private, and alternate.
     * @param value Value to set for the telephoneNumbers property.
     */
    public void setTelephoneNumbers(@jakarta.annotation.Nullable final java.util.List<AssignedTelephoneNumber> value) {
        this.backingStore.set("telephoneNumbers", value);
    }
    /**
     * Sets the tenantId property value. The unique identifier of the tenant in Entra to which this user is assigned.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the user property value. Represents an Entra user account.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final User value) {
        this.backingStore.set("user", value);
    }
    /**
     * Sets the userPrincipalName property value. The sign-in address of the user.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
