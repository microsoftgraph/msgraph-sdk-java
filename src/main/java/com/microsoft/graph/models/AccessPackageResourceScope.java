package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageResourceScope extends Entity implements Parsable {
    /**
     * Instantiates a new AccessPackageResourceScope and sets the default values.
     */
    public AccessPackageResourceScope() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageResourceScope
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceScope();
    }
    /**
     * Gets the description property value. The description of the scope.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.getBackingStore().get("description");
    }
    /**
     * Gets the displayName property value. The display name of the scope.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.getBackingStore().get("displayName");
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRootScope() {
        return this.getBackingStore().get("isRootScope");
    }
    /**
     * Gets the originId property value. The unique identifier for the scope in the resource as defined in the origin system.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOriginId() {
        return this.getBackingStore().get("originId");
    }
    /**
     * Gets the originSystem property value. The origin system for the scope.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOriginSystem() {
        return this.getBackingStore().get("originSystem");
    }
    /**
     * Gets the resource property value. The resource property
     * @return a AccessPackageResource
     */
    @jakarta.annotation.Nullable
    public AccessPackageResource getResource() {
        return this.getBackingStore().get("resource");
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
        writer.writeBooleanValue("isRootScope", this.getIsRootScope());
        writer.writeStringValue("originId", this.getOriginId());
        writer.writeStringValue("originSystem", this.getOriginSystem());
        writer.writeObjectValue("resource", this.getResource());
    }
    /**
     * Sets the description property value. The description of the scope.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the scope.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("displayName", value);
    }
    /**
     * Sets the isRootScope property value. True if the scopes are arranged in a hierarchy and this is the top or root scope of the resource.
     * @param value Value to set for the isRootScope property.
     */
    public void setIsRootScope(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("isRootScope", value);
    }
    /**
     * Sets the originId property value. The unique identifier for the scope in the resource as defined in the origin system.
     * @param value Value to set for the originId property.
     */
    public void setOriginId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("originId", value);
    }
    /**
     * Sets the originSystem property value. The origin system for the scope.
     * @param value Value to set for the originSystem property.
     */
    public void setOriginSystem(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("originSystem", value);
    }
    /**
     * Sets the resource property value. The resource property
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final AccessPackageResource value) {
        this.getBackingStore().set("resource", value);
    }
}
