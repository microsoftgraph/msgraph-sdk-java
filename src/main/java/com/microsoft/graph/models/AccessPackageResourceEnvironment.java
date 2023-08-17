package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageResourceEnvironment extends Entity implements Parsable {
    /**
     * The date and time that this object was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description of this object.
     */
    private String description;
    /**
     * The display name of this object.
     */
    private String displayName;
    /**
     * Determines whether this is default environment or not. It is set to true for all static origin systems, such as Azure AD groups and Azure AD Applications.
     */
    private Boolean isDefaultEnvironment;
    /**
     * The date and time that this object was last modified. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * The unique identifier of this environment in the origin system.
     */
    private String originId;
    /**
     * The type of the resource in the origin system, that is, SharePointOnline. Requires $filter (eq).
     */
    private String originSystem;
    /**
     * Read-only. Required.
     */
    private java.util.List<AccessPackageResource> resources;
    /**
     * Instantiates a new accessPackageResourceEnvironment and sets the default values.
     */
    public AccessPackageResourceEnvironment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceEnvironment
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceEnvironment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceEnvironment();
    }
    /**
     * Gets the createdDateTime property value. The date and time that this object was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description of this object.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name of this object.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * Gets the isDefaultEnvironment property value. Determines whether this is default environment or not. It is set to true for all static origin systems, such as Azure AD groups and Azure AD Applications.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultEnvironment() {
        return this.isDefaultEnvironment;
    }
    /**
     * Gets the modifiedDateTime property value. The date and time that this object was last modified. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the originId property value. The unique identifier of this environment in the origin system.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOriginId() {
        return this.originId;
    }
    /**
     * Gets the originSystem property value. The type of the resource in the origin system, that is, SharePointOnline. Requires $filter (eq).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOriginSystem() {
        return this.originSystem;
    }
    /**
     * Gets the resources property value. Read-only. Required.
     * @return a accessPackageResource
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResource> getResources() {
        return this.resources;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
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
     * Sets the createdDateTime property value. The date and time that this object was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of this object.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name of this object.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isDefaultEnvironment property value. Determines whether this is default environment or not. It is set to true for all static origin systems, such as Azure AD groups and Azure AD Applications.
     * @param value Value to set for the isDefaultEnvironment property.
     */
    public void setIsDefaultEnvironment(@jakarta.annotation.Nullable final Boolean value) {
        this.isDefaultEnvironment = value;
    }
    /**
     * Sets the modifiedDateTime property value. The date and time that this object was last modified. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the originId property value. The unique identifier of this environment in the origin system.
     * @param value Value to set for the originId property.
     */
    public void setOriginId(@jakarta.annotation.Nullable final String value) {
        this.originId = value;
    }
    /**
     * Sets the originSystem property value. The type of the resource in the origin system, that is, SharePointOnline. Requires $filter (eq).
     * @param value Value to set for the originSystem property.
     */
    public void setOriginSystem(@jakarta.annotation.Nullable final String value) {
        this.originSystem = value;
    }
    /**
     * Sets the resources property value. Read-only. Required.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<AccessPackageResource> value) {
        this.resources = value;
    }
}
