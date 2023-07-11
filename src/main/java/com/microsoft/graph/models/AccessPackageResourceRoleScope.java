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
     * The createdDateTime property
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
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageResourceRoleScope() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceRoleScope
     */
    @javax.annotation.Nonnull
    public static AccessPackageResourceRoleScope createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceRoleScope();
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public AccessPackageResourceRole getRole() {
        return this.role;
    }
    /**
     * Gets the scope property value. The scope property
     * @return a accessPackageResourceScope
     */
    @javax.annotation.Nullable
    public AccessPackageResourceScope getScope() {
        return this.scope;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("role", this.getRole());
        writer.writeObjectValue("scope", this.getScope());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRole(@javax.annotation.Nullable final AccessPackageResourceRole value) {
        this.role = value;
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScope(@javax.annotation.Nullable final AccessPackageResourceScope value) {
        this.scope = value;
    }
}
