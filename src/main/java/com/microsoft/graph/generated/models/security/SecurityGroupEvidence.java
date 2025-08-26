package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityGroupEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link SecurityGroupEvidence} and sets the default values.
     */
    public SecurityGroupEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.securityGroupEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SecurityGroupEvidence}
     */
    @jakarta.annotation.Nonnull
    public static SecurityGroupEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityGroupEvidence();
    }
    /**
     * Gets the activeDirectoryObjectGuid property value. The activeDirectoryObjectGuid property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getActiveDirectoryObjectGuid() {
        return this.backingStore.get("activeDirectoryObjectGuid");
    }
    /**
     * Gets the displayName property value. The name of the security group.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the distinguishedName property value. The distinguishedName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDistinguishedName() {
        return this.backingStore.get("distinguishedName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDirectoryObjectGuid", (n) -> { this.setActiveDirectoryObjectGuid(n.getUUIDValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("distinguishedName", (n) -> { this.setDistinguishedName(n.getStringValue()); });
        deserializerMap.put("friendlyName", (n) -> { this.setFriendlyName(n.getStringValue()); });
        deserializerMap.put("securityGroupId", (n) -> { this.setSecurityGroupId(n.getStringValue()); });
        deserializerMap.put("sid", (n) -> { this.setSid(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the friendlyName property value. The friendlyName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFriendlyName() {
        return this.backingStore.get("friendlyName");
    }
    /**
     * Gets the securityGroupId property value. Unique identifier of the security group.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecurityGroupId() {
        return this.backingStore.get("securityGroupId");
    }
    /**
     * Gets the sid property value. The sid property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSid() {
        return this.backingStore.get("sid");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeUUIDValue("activeDirectoryObjectGuid", this.getActiveDirectoryObjectGuid());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("distinguishedName", this.getDistinguishedName());
        writer.writeStringValue("friendlyName", this.getFriendlyName());
        writer.writeStringValue("securityGroupId", this.getSecurityGroupId());
        writer.writeStringValue("sid", this.getSid());
    }
    /**
     * Sets the activeDirectoryObjectGuid property value. The activeDirectoryObjectGuid property
     * @param value Value to set for the activeDirectoryObjectGuid property.
     */
    public void setActiveDirectoryObjectGuid(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("activeDirectoryObjectGuid", value);
    }
    /**
     * Sets the displayName property value. The name of the security group.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the distinguishedName property value. The distinguishedName property
     * @param value Value to set for the distinguishedName property.
     */
    public void setDistinguishedName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("distinguishedName", value);
    }
    /**
     * Sets the friendlyName property value. The friendlyName property
     * @param value Value to set for the friendlyName property.
     */
    public void setFriendlyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("friendlyName", value);
    }
    /**
     * Sets the securityGroupId property value. Unique identifier of the security group.
     * @param value Value to set for the securityGroupId property.
     */
    public void setSecurityGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("securityGroupId", value);
    }
    /**
     * Sets the sid property value. The sid property
     * @param value Value to set for the sid property.
     */
    public void setSid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sid", value);
    }
}
