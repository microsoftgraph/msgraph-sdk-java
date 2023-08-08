package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserIdentity extends Identity implements Parsable {
    /**
     * Indicates the client IP address used by user performing the activity (audit log only).
     */
    private String ipAddress;
    /**
     * The userPrincipalName attribute of the user.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new userIdentity and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UserIdentity() {
        super();
        this.setOdataType("#microsoft.graph.userIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userIdentity
     */
    @jakarta.annotation.Nonnull
    public static UserIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserIdentity();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. Indicates the client IP address used by user performing the activity (audit log only).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName attribute of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the ipAddress property value. Indicates the client IP address used by user performing the activity (audit log only).
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName attribute of the user.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
