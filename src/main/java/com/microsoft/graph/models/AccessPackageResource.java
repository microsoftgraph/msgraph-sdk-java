package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageResource extends Entity implements Parsable {
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description property
     */
    private String description;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The environment property
     */
    private AccessPackageResourceEnvironment environment;
    /**
     * The modifiedDateTime property
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * The originId property
     */
    private String originId;
    /**
     * The originSystem property
     */
    private String originSystem;
    /**
     * The roles property
     */
    private java.util.List<AccessPackageResourceRole> roles;
    /**
     * The scopes property
     */
    private java.util.List<AccessPackageResourceScope> scopes;
    /**
     * Instantiates a new accessPackageResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResource
     */
    @javax.annotation.Nonnull
    public static AccessPackageResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResource();
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
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the environment property value. The environment property
     * @return a accessPackageResourceEnvironment
     */
    @javax.annotation.Nullable
    public AccessPackageResourceEnvironment getEnvironment() {
        return this.environment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("environment", (n) -> { this.setEnvironment(n.getObjectValue(AccessPackageResourceEnvironment::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("originId", (n) -> { this.setOriginId(n.getStringValue()); });
        deserializerMap.put("originSystem", (n) -> { this.setOriginSystem(n.getStringValue()); });
        deserializerMap.put("roles", (n) -> { this.setRoles(n.getCollectionOfObjectValues(AccessPackageResourceRole::createFromDiscriminatorValue)); });
        deserializerMap.put("scopes", (n) -> { this.setScopes(n.getCollectionOfObjectValues(AccessPackageResourceScope::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedDateTime property value. The modifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the originId property value. The originId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginId() {
        return this.originId;
    }
    /**
     * Gets the originSystem property value. The originSystem property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginSystem() {
        return this.originSystem;
    }
    /**
     * Gets the roles property value. The roles property
     * @return a accessPackageResourceRole
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceRole> getRoles() {
        return this.roles;
    }
    /**
     * Gets the scopes property value. The scopes property
     * @return a accessPackageResourceScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceScope> getScopes() {
        return this.scopes;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("environment", this.getEnvironment());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeStringValue("originId", this.getOriginId());
        writer.writeStringValue("originSystem", this.getOriginSystem());
        writer.writeCollectionOfObjectValues("roles", this.getRoles());
        writer.writeCollectionOfObjectValues("scopes", this.getScopes());
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
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the environment property value. The environment property
     * @param value Value to set for the environment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnvironment(@javax.annotation.Nullable final AccessPackageResourceEnvironment value) {
        this.environment = value;
    }
    /**
     * Sets the modifiedDateTime property value. The modifiedDateTime property
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the originId property value. The originId property
     * @param value Value to set for the originId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginId(@javax.annotation.Nullable final String value) {
        this.originId = value;
    }
    /**
     * Sets the originSystem property value. The originSystem property
     * @param value Value to set for the originSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginSystem(@javax.annotation.Nullable final String value) {
        this.originSystem = value;
    }
    /**
     * Sets the roles property value. The roles property
     * @param value Value to set for the roles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoles(@javax.annotation.Nullable final java.util.List<AccessPackageResourceRole> value) {
        this.roles = value;
    }
    /**
     * Sets the scopes property value. The scopes property
     * @param value Value to set for the scopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopes(@javax.annotation.Nullable final java.util.List<AccessPackageResourceScope> value) {
        this.scopes = value;
    }
}
