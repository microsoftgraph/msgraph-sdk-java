package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageResourceScope extends Entity implements Parsable {
    /**
     * The description of the scope.
     */
    private String description;
    /**
     * The display name of the scope.
     */
    private String displayName;
    /**
     * True if the scopes are arranged in a hierarchy and this is the top or root scope of the resource.
     */
    private Boolean isRootScope;
    /**
     * The unique identifier for the scope in the resource as defined in the origin system.
     */
    private String originId;
    /**
     * The origin system for the scope.
     */
    private String originSystem;
    /**
     * The resource property
     */
    private AccessPackageResource resource;
    /**
     * Instantiates a new accessPackageResourceScope and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceScope() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceScope
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceScope();
    }
    /**
     * Gets the description property value. The description of the scope.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name of the scope.
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isRootScope", (n) -> { this.setIsRootScope(n.getBooleanValue()); });
        deserializerMap.put("originId", (n) -> { this.setOriginId(n.getStringValue()); });
        deserializerMap.put("originSystem", (n) -> { this.setOriginSystem(n.getStringValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(AccessPackageResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isRootScope property value. True if the scopes are arranged in a hierarchy and this is the top or root scope of the resource.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRootScope() {
        return this.isRootScope;
    }
    /**
     * Gets the originId property value. The unique identifier for the scope in the resource as defined in the origin system.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOriginId() {
        return this.originId;
    }
    /**
     * Gets the originSystem property value. The origin system for the scope.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOriginSystem() {
        return this.originSystem;
    }
    /**
     * Gets the resource property value. The resource property
     * @return a accessPackageResource
     */
    @jakarta.annotation.Nullable
    public AccessPackageResource getResource() {
        return this.resource;
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
        writer.writeBooleanValue("isRootScope", this.getIsRootScope());
        writer.writeStringValue("originId", this.getOriginId());
        writer.writeStringValue("originSystem", this.getOriginSystem());
        writer.writeObjectValue("resource", this.getResource());
    }
    /**
     * Sets the description property value. The description of the scope.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name of the scope.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isRootScope property value. True if the scopes are arranged in a hierarchy and this is the top or root scope of the resource.
     * @param value Value to set for the isRootScope property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsRootScope(@jakarta.annotation.Nullable final Boolean value) {
        this.isRootScope = value;
    }
    /**
     * Sets the originId property value. The unique identifier for the scope in the resource as defined in the origin system.
     * @param value Value to set for the originId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOriginId(@jakarta.annotation.Nullable final String value) {
        this.originId = value;
    }
    /**
     * Sets the originSystem property value. The origin system for the scope.
     * @param value Value to set for the originSystem property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOriginSystem(@jakarta.annotation.Nullable final String value) {
        this.originSystem = value;
    }
    /**
     * Sets the resource property value. The resource property
     * @param value Value to set for the resource property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResource(@jakarta.annotation.Nullable final AccessPackageResource value) {
        this.resource = value;
    }
}
