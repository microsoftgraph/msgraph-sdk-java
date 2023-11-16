package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryObjectPartnerReference extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new DirectoryObjectPartnerReference and sets the default values.
     */
    public DirectoryObjectPartnerReference() {
        super();
        this.setOdataType("#microsoft.graph.directoryObjectPartnerReference");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DirectoryObjectPartnerReference
     */
    @jakarta.annotation.Nonnull
    public static DirectoryObjectPartnerReference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectoryObjectPartnerReference();
    }
    /**
     * Gets the description property value. Description of the object returned. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Name of directory object being returned, like group or application. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the externalPartnerTenantId property value. The tenant identifier for the partner tenant. Read-only.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getExternalPartnerTenantId() {
        return this.backingStore.get("externalPartnerTenantId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalPartnerTenantId", (n) -> { this.setExternalPartnerTenantId(n.getUUIDValue()); });
        deserializerMap.put("objectType", (n) -> { this.setObjectType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the objectType property value. The type of the referenced object in the partner tenant. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getObjectType() {
        return this.backingStore.get("objectType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeUUIDValue("externalPartnerTenantId", this.getExternalPartnerTenantId());
        writer.writeStringValue("objectType", this.getObjectType());
    }
    /**
     * Sets the description property value. Description of the object returned. Read-only.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Name of directory object being returned, like group or application. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the externalPartnerTenantId property value. The tenant identifier for the partner tenant. Read-only.
     * @param value Value to set for the externalPartnerTenantId property.
     */
    public void setExternalPartnerTenantId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("externalPartnerTenantId", value);
    }
    /**
     * Sets the objectType property value. The type of the referenced object in the partner tenant. Read-only.
     * @param value Value to set for the objectType property.
     */
    public void setObjectType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("objectType", value);
    }
}
