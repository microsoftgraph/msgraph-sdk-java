package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailboxConfigurationEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link MailboxConfigurationEvidence} and sets the default values.
     */
    public MailboxConfigurationEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.mailboxConfigurationEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MailboxConfigurationEvidence}
     */
    @jakarta.annotation.Nonnull
    public static MailboxConfigurationEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailboxConfigurationEvidence();
    }
    /**
     * Gets the configurationId property value. The unique identifier of the mailbox configuration.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConfigurationId() {
        return this.backingStore.get("configurationId");
    }
    /**
     * Gets the configurationType property value. The type of mailbox configuration. The possible values are: mailForwardingRule, owaSettings, ewsSettings, mailDelegation, userInboxRule, unknownFutureValue.
     * @return a {@link MailboxConfigurationType}
     */
    @jakarta.annotation.Nullable
    public MailboxConfigurationType getConfigurationType() {
        return this.backingStore.get("configurationType");
    }
    /**
     * Gets the displayName property value. The display name of the mailbox.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the externalDirectoryObjectId property value. The external directory object identifier of the mailbox.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getExternalDirectoryObjectId() {
        return this.backingStore.get("externalDirectoryObjectId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configurationId", (n) -> { this.setConfigurationId(n.getStringValue()); });
        deserializerMap.put("configurationType", (n) -> { this.setConfigurationType(n.getEnumValue(MailboxConfigurationType::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalDirectoryObjectId", (n) -> { this.setExternalDirectoryObjectId(n.getUUIDValue()); });
        deserializerMap.put("mailboxPrimaryAddress", (n) -> { this.setMailboxPrimaryAddress(n.getStringValue()); });
        deserializerMap.put("upn", (n) -> { this.setUpn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mailboxPrimaryAddress property value. The primary email address of the mailbox.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMailboxPrimaryAddress() {
        return this.backingStore.get("mailboxPrimaryAddress");
    }
    /**
     * Gets the upn property value. The user principal name (UPN) of the mailbox.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpn() {
        return this.backingStore.get("upn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("configurationId", this.getConfigurationId());
        writer.writeEnumValue("configurationType", this.getConfigurationType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeUUIDValue("externalDirectoryObjectId", this.getExternalDirectoryObjectId());
        writer.writeStringValue("mailboxPrimaryAddress", this.getMailboxPrimaryAddress());
        writer.writeStringValue("upn", this.getUpn());
    }
    /**
     * Sets the configurationId property value. The unique identifier of the mailbox configuration.
     * @param value Value to set for the configurationId property.
     */
    public void setConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("configurationId", value);
    }
    /**
     * Sets the configurationType property value. The type of mailbox configuration. The possible values are: mailForwardingRule, owaSettings, ewsSettings, mailDelegation, userInboxRule, unknownFutureValue.
     * @param value Value to set for the configurationType property.
     */
    public void setConfigurationType(@jakarta.annotation.Nullable final MailboxConfigurationType value) {
        this.backingStore.set("configurationType", value);
    }
    /**
     * Sets the displayName property value. The display name of the mailbox.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the externalDirectoryObjectId property value. The external directory object identifier of the mailbox.
     * @param value Value to set for the externalDirectoryObjectId property.
     */
    public void setExternalDirectoryObjectId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("externalDirectoryObjectId", value);
    }
    /**
     * Sets the mailboxPrimaryAddress property value. The primary email address of the mailbox.
     * @param value Value to set for the mailboxPrimaryAddress property.
     */
    public void setMailboxPrimaryAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mailboxPrimaryAddress", value);
    }
    /**
     * Sets the upn property value. The user principal name (UPN) of the mailbox.
     * @param value Value to set for the upn property.
     */
    public void setUpn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("upn", value);
    }
}
