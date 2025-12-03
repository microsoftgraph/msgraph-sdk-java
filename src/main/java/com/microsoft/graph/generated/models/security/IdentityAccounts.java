package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityAccounts extends Entity implements Parsable {
    /**
     * Instantiates a new {@link IdentityAccounts} and sets the default values.
     */
    public IdentityAccounts() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdentityAccounts}
     */
    @jakarta.annotation.Nonnull
    public static IdentityAccounts createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.user": return new User();
            }
        }
        return new IdentityAccounts();
    }
    /**
     * Gets the accounts property value. Collection of accounts of the identity in different identity providers.
     * @return a {@link java.util.List<Account>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Account> getAccounts() {
        return this.backingStore.get("accounts");
    }
    /**
     * Gets the cloudSecurityIdentifier property value. The cloud security identifier of the identityAccount.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCloudSecurityIdentifier() {
        return this.backingStore.get("cloudSecurityIdentifier");
    }
    /**
     * Gets the displayName property value. The  Active Directory display name of the identityAccount.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the domain property value. The Active Directory domain name of the identityAccount.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomain() {
        return this.backingStore.get("domain");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accounts", (n) -> { this.setAccounts(n.getCollectionOfObjectValues(Account::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudSecurityIdentifier", (n) -> { this.setCloudSecurityIdentifier(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getStringValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("onPremisesSecurityIdentifier", (n) -> { this.setOnPremisesSecurityIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Boolean indicating if the identityAccounts is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the onPremisesSecurityIdentifier property value. The on-premises security identifier of the identityAccount.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this.backingStore.get("onPremisesSecurityIdentifier");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accounts", this.getAccounts());
        writer.writeStringValue("cloudSecurityIdentifier", this.getCloudSecurityIdentifier());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("domain", this.getDomain());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("onPremisesSecurityIdentifier", this.getOnPremisesSecurityIdentifier());
    }
    /**
     * Sets the accounts property value. Collection of accounts of the identity in different identity providers.
     * @param value Value to set for the accounts property.
     */
    public void setAccounts(@jakarta.annotation.Nullable final java.util.List<Account> value) {
        this.backingStore.set("accounts", value);
    }
    /**
     * Sets the cloudSecurityIdentifier property value. The cloud security identifier of the identityAccount.
     * @param value Value to set for the cloudSecurityIdentifier property.
     */
    public void setCloudSecurityIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cloudSecurityIdentifier", value);
    }
    /**
     * Sets the displayName property value. The  Active Directory display name of the identityAccount.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the domain property value. The Active Directory domain name of the identityAccount.
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domain", value);
    }
    /**
     * Sets the isEnabled property value. Boolean indicating if the identityAccounts is enabled.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the onPremisesSecurityIdentifier property value. The on-premises security identifier of the identityAccount.
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     */
    public void setOnPremisesSecurityIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onPremisesSecurityIdentifier", value);
    }
}
