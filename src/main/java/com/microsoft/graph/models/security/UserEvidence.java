package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserEvidence extends AlertEvidence implements Parsable {
    /**
     * The user account details.
     */
    private UserAccount userAccount;
    /**
     * Instantiates a new userEvidence and sets the default values.
     */
    public UserEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.userEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userEvidence
     */
    @jakarta.annotation.Nonnull
    public static UserEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userAccount", (n) -> { this.setUserAccount(n.getObjectValue(UserAccount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the userAccount property value. The user account details.
     * @return a userAccount
     */
    @jakarta.annotation.Nullable
    public UserAccount getUserAccount() {
        return this.userAccount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("userAccount", this.getUserAccount());
    }
    /**
     * Sets the userAccount property value. The user account details.
     * @param value Value to set for the userAccount property.
     */
    public void setUserAccount(@jakarta.annotation.Nullable final UserAccount value) {
        this.userAccount = value;
    }
}
