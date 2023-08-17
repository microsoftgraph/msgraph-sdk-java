package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageResourceRoleScope extends Entity implements Parsable {
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime createdDateTime;
    /**
     * The role property
     */
    private AccessPackageResourceRole role;
    /**
     * The scope property
     */
    private AccessPackageResourceScope scope;
    /**
     * Instantiates a new accessPackageResourceRoleScope and sets the default values.
     */
    public AccessPackageResourceRoleScope() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceRoleScope
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceRoleScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceRoleScope();
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getObjectValue(AccessPackageResourceRole::createFromDiscriminatorValue)); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getObjectValue(AccessPackageResourceScope::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the role property value. The role property
     * @return a accessPackageResourceRole
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceRole getRole() {
        return this.role;
    }
    /**
     * Gets the scope property value. The scope property
     * @return a accessPackageResourceScope
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceScope getScope() {
        return this.scope;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("role", this.getRole());
        writer.writeObjectValue("scope", this.getScope());
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final AccessPackageResourceRole value) {
        this.role = value;
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final AccessPackageResourceScope value) {
        this.scope = value;
    }
}
