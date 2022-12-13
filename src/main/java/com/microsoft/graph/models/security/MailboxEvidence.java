package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MailboxEvidence extends AlertEvidence implements Parsable {
    /** The displayName property */
    private String _displayName;
    /** The primaryAddress property */
    private String _primaryAddress;
    /** The userAccount property */
    private UserAccount _userAccount;
    /**
     * Instantiates a new MailboxEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MailboxEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MailboxEvidence
     */
    @javax.annotation.Nonnull
    public static MailboxEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailboxEvidence();
    }
    /**
     * Gets the displayName property value. The displayName property
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("primaryAddress", (n) -> { this.setPrimaryAddress(n.getStringValue()); });
        deserializerMap.put("userAccount", (n) -> { this.setUserAccount(n.getObjectValue(UserAccount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the primaryAddress property value. The primaryAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryAddress() {
        return this._primaryAddress;
    }
    /**
     * Gets the userAccount property value. The userAccount property
     * @return a userAccount
     */
    @javax.annotation.Nullable
    public UserAccount getUserAccount() {
        return this._userAccount;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("primaryAddress", this.getPrimaryAddress());
        writer.writeObjectValue("userAccount", this.getUserAccount());
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the primaryAddress property value. The primaryAddress property
     * @param value Value to set for the primaryAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryAddress(@javax.annotation.Nullable final String value) {
        this._primaryAddress = value;
    }
    /**
     * Sets the userAccount property value. The userAccount property
     * @param value Value to set for the userAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAccount(@javax.annotation.Nullable final UserAccount value) {
        this._userAccount = value;
    }
}
