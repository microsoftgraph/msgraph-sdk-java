package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailboxEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new MailboxEvidence and sets the default values.
     */
    public MailboxEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.mailboxEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MailboxEvidence
     */
    @jakarta.annotation.Nonnull
    public static MailboxEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailboxEvidence();
    }
    /**
     * Gets the displayName property value. The name associated with the mailbox.
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
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("primaryAddress", (n) -> { this.setPrimaryAddress(n.getStringValue()); });
        deserializerMap.put("userAccount", (n) -> { this.setUserAccount(n.getObjectValue(UserAccount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the primaryAddress property value. The primary email address of the mailbox.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimaryAddress() {
        return this.backingStore.get("primaryAddress");
    }
    /**
     * Gets the userAccount property value. The user account of the mailbox.
     * @return a UserAccount
     */
    @jakarta.annotation.Nullable
    public UserAccount getUserAccount() {
        return this.backingStore.get("userAccount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("primaryAddress", this.getPrimaryAddress());
        writer.writeObjectValue("userAccount", this.getUserAccount());
    }
    /**
     * Sets the displayName property value. The name associated with the mailbox.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the primaryAddress property value. The primary email address of the mailbox.
     * @param value Value to set for the primaryAddress property.
     */
    public void setPrimaryAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("primaryAddress", value);
    }
    /**
     * Sets the userAccount property value. The user account of the mailbox.
     * @param value Value to set for the userAccount property.
     */
    public void setUserAccount(@jakarta.annotation.Nullable final UserAccount value) {
        this.backingStore.set("userAccount", value);
    }
}
