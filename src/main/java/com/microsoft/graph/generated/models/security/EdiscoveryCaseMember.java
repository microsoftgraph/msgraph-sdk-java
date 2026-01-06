package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryCaseMember extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EdiscoveryCaseMember} and sets the default values.
     */
    public EdiscoveryCaseMember() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EdiscoveryCaseMember}
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryCaseMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryCaseMember();
    }
    /**
     * Gets the displayName property value. The display name of the eDiscovery case member. Allowed only for case members of type roleGroup.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("recipientType", (n) -> { this.setRecipientType(n.getEnumSetValue(RecipientType::forValue)); });
        deserializerMap.put("smtpAddress", (n) -> { this.setSmtpAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recipientType property value. Specifies the recipient type of the eDiscovery case member. The possible values are: user, roleGroup, unknownFutureValue.
     * @return a {@link EnumSet<RecipientType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<RecipientType> getRecipientType() {
        return this.backingStore.get("recipientType");
    }
    /**
     * Gets the smtpAddress property value. The smtp address of the eDiscovery case member. Allowed only for case members of type user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSmtpAddress() {
        return this.backingStore.get("smtpAddress");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumSetValue("recipientType", this.getRecipientType());
        writer.writeStringValue("smtpAddress", this.getSmtpAddress());
    }
    /**
     * Sets the displayName property value. The display name of the eDiscovery case member. Allowed only for case members of type roleGroup.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the recipientType property value. Specifies the recipient type of the eDiscovery case member. The possible values are: user, roleGroup, unknownFutureValue.
     * @param value Value to set for the recipientType property.
     */
    public void setRecipientType(@jakarta.annotation.Nullable final EnumSet<RecipientType> value) {
        this.backingStore.set("recipientType", value);
    }
    /**
     * Sets the smtpAddress property value. The smtp address of the eDiscovery case member. Allowed only for case members of type user.
     * @param value Value to set for the smtpAddress property.
     */
    public void setSmtpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("smtpAddress", value);
    }
}
