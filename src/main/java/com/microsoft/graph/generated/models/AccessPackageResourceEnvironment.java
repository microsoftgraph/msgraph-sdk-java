package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageResourceEnvironment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessPackageResourceEnvironment} and sets the default values.
     */
    public AccessPackageResourceEnvironment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageResourceEnvironment}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceEnvironment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceEnvironment();
    }
    /**
     * Gets the connectionInfo property value. Connection information of an environment used to connect to a resource.
     * @return a {@link ConnectionInfo}
     */
    @jakarta.annotation.Nullable
    public ConnectionInfo getConnectionInfo() {
        return this.backingStore.get("connectionInfo");
    }
    /**
     * Gets the createdDateTime property value. The date and time that this object was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description of this object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of this object.
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
        deserializerMap.put("connectionInfo", (n) -> { this.setConnectionInfo(n.getObjectValue(ConnectionInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isDefaultEnvironment", (n) -> { this.setIsDefaultEnvironment(n.getBooleanValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("originId", (n) -> { this.setOriginId(n.getStringValue()); });
        deserializerMap.put("originSystem", (n) -> { this.setOriginSystem(n.getStringValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(AccessPackageResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isDefaultEnvironment property value. Determines whether this is default environment or not. It is set to true for all static origin systems, such as Microsoft Entra groups and Microsoft Entra Applications.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultEnvironment() {
        return this.backingStore.get("isDefaultEnvironment");
    }
    /**
     * Gets the modifiedDateTime property value. The date and time that this object was last modified. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.backingStore.get("modifiedDateTime");
    }
    /**
     * Gets the originId property value. The unique identifier of this environment in the origin system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginId() {
        return this.backingStore.get("originId");
    }
    /**
     * Gets the originSystem property value. The type of the resource in the origin system, that is, SharePointOnline. Requires $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginSystem() {
        return this.backingStore.get("originSystem");
    }
    /**
     * Gets the resources property value. Read-only. Required.
     * @return a {@link java.util.List<AccessPackageResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResource> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("connectionInfo", this.getConnectionInfo());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isDefaultEnvironment", this.getIsDefaultEnvironment());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeStringValue("originId", this.getOriginId());
        writer.writeStringValue("originSystem", this.getOriginSystem());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
    }
    /**
     * Sets the connectionInfo property value. Connection information of an environment used to connect to a resource.
     * @param value Value to set for the connectionInfo property.
     */
    public void setConnectionInfo(@jakarta.annotation.Nullable final ConnectionInfo value) {
        this.backingStore.set("connectionInfo", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time that this object was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description of this object.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of this object.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isDefaultEnvironment property value. Determines whether this is default environment or not. It is set to true for all static origin systems, such as Microsoft Entra groups and Microsoft Entra Applications.
     * @param value Value to set for the isDefaultEnvironment property.
     */
    public void setIsDefaultEnvironment(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefaultEnvironment", value);
    }
    /**
     * Sets the modifiedDateTime property value. The date and time that this object was last modified. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modifiedDateTime", value);
    }
    /**
     * Sets the originId property value. The unique identifier of this environment in the origin system.
     * @param value Value to set for the originId property.
     */
    public void setOriginId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originId", value);
    }
    /**
     * Sets the originSystem property value. The type of the resource in the origin system, that is, SharePointOnline. Requires $filter (eq).
     * @param value Value to set for the originSystem property.
     */
    public void setOriginSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originSystem", value);
    }
    /**
     * Sets the resources property value. Read-only. Required.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<AccessPackageResource> value) {
        this.backingStore.set("resources", value);
    }
}
