package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserSignIn extends SignInIdentity implements Parsable {
    /**
     * Instantiates a new {@link UserSignIn} and sets the default values.
     */
    public UserSignIn() {
        super();
        this.setOdataType("#microsoft.graph.userSignIn");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserSignIn}
     */
    @jakarta.annotation.Nonnull
    public static UserSignIn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSignIn();
    }
    /**
     * Gets the externalTenantId property value. TenantId of the guest user as applies to Microsoft Entra B2B scenarios.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalTenantId() {
        return this.backingStore.get("externalTenantId");
    }
    /**
     * Gets the externalUserType property value. The externalUserType property
     * @return a {@link EnumSet<ConditionalAccessGuestOrExternalUserTypes>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ConditionalAccessGuestOrExternalUserTypes> getExternalUserType() {
        return this.backingStore.get("externalUserType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("externalTenantId", (n) -> { this.setExternalTenantId(n.getStringValue()); });
        deserializerMap.put("externalUserType", (n) -> { this.setExternalUserType(n.getEnumSetValue(ConditionalAccessGuestOrExternalUserTypes::forValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the userId property value. Object ID of the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("externalTenantId", this.getExternalTenantId());
        writer.writeEnumSetValue("externalUserType", this.getExternalUserType());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the externalTenantId property value. TenantId of the guest user as applies to Microsoft Entra B2B scenarios.
     * @param value Value to set for the externalTenantId property.
     */
    public void setExternalTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalTenantId", value);
    }
    /**
     * Sets the externalUserType property value. The externalUserType property
     * @param value Value to set for the externalUserType property.
     */
    public void setExternalUserType(@jakarta.annotation.Nullable final EnumSet<ConditionalAccessGuestOrExternalUserTypes> value) {
        this.backingStore.set("externalUserType", value);
    }
    /**
     * Sets the userId property value. Object ID of the user.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
