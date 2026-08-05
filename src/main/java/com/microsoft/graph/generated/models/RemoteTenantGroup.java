package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RemoteTenantGroup extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link RemoteTenantGroup} and sets the default values.
     */
    public RemoteTenantGroup() {
        super();
        this.setOdataType("#microsoft.graph.remoteTenantGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RemoteTenantGroup}
     */
    @jakarta.annotation.Nonnull
    public static RemoteTenantGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteTenantGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("remoteGroupDisplayName", (n) -> { this.setRemoteGroupDisplayName(n.getStringValue()); });
        deserializerMap.put("remoteGroupId", (n) -> { this.setRemoteGroupId(n.getUUIDValue()); });
        deserializerMap.put("remoteTenantDisplayName", (n) -> { this.setRemoteTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("remoteTenantId", (n) -> { this.setRemoteTenantId(n.getUUIDValue()); });
        deserializerMap.put("remoteTenantPrimaryDomain", (n) -> { this.setRemoteTenantPrimaryDomain(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the remoteGroupDisplayName property value. Display name of the group in the remote tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemoteGroupDisplayName() {
        return this.backingStore.get("remoteGroupDisplayName");
    }
    /**
     * Gets the remoteGroupId property value. Unique identifier of the group in the remote tenant.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getRemoteGroupId() {
        return this.backingStore.get("remoteGroupId");
    }
    /**
     * Gets the remoteTenantDisplayName property value. Display name of the remote tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemoteTenantDisplayName() {
        return this.backingStore.get("remoteTenantDisplayName");
    }
    /**
     * Gets the remoteTenantId property value. Unique identifier of the remote tenant.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getRemoteTenantId() {
        return this.backingStore.get("remoteTenantId");
    }
    /**
     * Gets the remoteTenantPrimaryDomain property value. Primary domain name of the remote tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemoteTenantPrimaryDomain() {
        return this.backingStore.get("remoteTenantPrimaryDomain");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("remoteGroupDisplayName", this.getRemoteGroupDisplayName());
        writer.writeUUIDValue("remoteGroupId", this.getRemoteGroupId());
        writer.writeStringValue("remoteTenantDisplayName", this.getRemoteTenantDisplayName());
        writer.writeUUIDValue("remoteTenantId", this.getRemoteTenantId());
        writer.writeStringValue("remoteTenantPrimaryDomain", this.getRemoteTenantPrimaryDomain());
    }
    /**
     * Sets the remoteGroupDisplayName property value. Display name of the group in the remote tenant.
     * @param value Value to set for the remoteGroupDisplayName property.
     */
    public void setRemoteGroupDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remoteGroupDisplayName", value);
    }
    /**
     * Sets the remoteGroupId property value. Unique identifier of the group in the remote tenant.
     * @param value Value to set for the remoteGroupId property.
     */
    public void setRemoteGroupId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("remoteGroupId", value);
    }
    /**
     * Sets the remoteTenantDisplayName property value. Display name of the remote tenant.
     * @param value Value to set for the remoteTenantDisplayName property.
     */
    public void setRemoteTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remoteTenantDisplayName", value);
    }
    /**
     * Sets the remoteTenantId property value. Unique identifier of the remote tenant.
     * @param value Value to set for the remoteTenantId property.
     */
    public void setRemoteTenantId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("remoteTenantId", value);
    }
    /**
     * Sets the remoteTenantPrimaryDomain property value. Primary domain name of the remote tenant.
     * @param value Value to set for the remoteTenantPrimaryDomain property.
     */
    public void setRemoteTenantPrimaryDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remoteTenantPrimaryDomain", value);
    }
}
