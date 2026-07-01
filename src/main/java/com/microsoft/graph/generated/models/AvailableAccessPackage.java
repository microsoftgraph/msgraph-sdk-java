package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AvailableAccessPackage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AvailableAccessPackage} and sets the default values.
     */
    public AvailableAccessPackage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AvailableAccessPackage}
     */
    @jakarta.annotation.Nonnull
    public static AvailableAccessPackage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AvailableAccessPackage();
    }
    /**
     * Gets the description property value. The description of the access package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the access package.
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("resourceRoleScopes", (n) -> { this.setResourceRoleScopes(n.getCollectionOfObjectValues(AccessPackageResourceRoleScope::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceRoleScopes property value. The resource role scopes associated with this available access package.
     * @return a {@link java.util.List<AccessPackageResourceRoleScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceRoleScope> getResourceRoleScopes() {
        return this.backingStore.get("resourceRoleScopes");
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
        writer.writeCollectionOfObjectValues("resourceRoleScopes", this.getResourceRoleScopes());
    }
    /**
     * Sets the description property value. The description of the access package.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the access package.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the resourceRoleScopes property value. The resource role scopes associated with this available access package.
     * @param value Value to set for the resourceRoleScopes property.
     */
    public void setResourceRoleScopes(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceRoleScope> value) {
        this.backingStore.set("resourceRoleScopes", value);
    }
}
