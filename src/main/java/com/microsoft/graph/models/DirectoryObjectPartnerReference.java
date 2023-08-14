package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class DirectoryObjectPartnerReference extends DirectoryObject implements Parsable {
    /**
     * Description of the object returned. Read-only.
     */
    private String description;
    /**
     * Name of directory object being returned, like group or application. Read-only.
     */
    private String displayName;
    /**
     * The tenant identifier for the partner tenant. Read-only.
     */
    private UUID externalPartnerTenantId;
    /**
     * The type of the referenced object in the partner tenant. Read-only.
     */
    private String objectType;
    /**
     * Instantiates a new directoryObjectPartnerReference and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DirectoryObjectPartnerReference() {
        super();
        this.setOdataType("#microsoft.graph.directoryObjectPartnerReference");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directoryObjectPartnerReference
     */
    @jakarta.annotation.Nonnull
    public static DirectoryObjectPartnerReference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectoryObjectPartnerReference();
    }
    /**
     * Gets the description property value. Description of the object returned. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Name of directory object being returned, like group or application. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the externalPartnerTenantId property value. The tenant identifier for the partner tenant. Read-only.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getExternalPartnerTenantId() {
        return this.externalPartnerTenantId;
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getObjectType() {
        return this.objectType;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeUUIDValue("externalPartnerTenantId", this.getExternalPartnerTenantId());
        writer.writeStringValue("objectType", this.getObjectType());
    }
    /**
     * Sets the description property value. Description of the object returned. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Name of directory object being returned, like group or application. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the externalPartnerTenantId property value. The tenant identifier for the partner tenant. Read-only.
     * @param value Value to set for the externalPartnerTenantId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setExternalPartnerTenantId(@jakarta.annotation.Nullable final UUID value) {
        this.externalPartnerTenantId = value;
    }
    /**
     * Sets the objectType property value. The type of the referenced object in the partner tenant. Read-only.
     * @param value Value to set for the objectType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setObjectType(@jakarta.annotation.Nullable final String value) {
        this.objectType = value;
    }
}
