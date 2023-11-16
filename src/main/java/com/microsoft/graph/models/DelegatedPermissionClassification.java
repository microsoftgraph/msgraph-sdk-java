package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DelegatedPermissionClassification extends Entity implements Parsable {
    /**
     * Instantiates a new DelegatedPermissionClassification and sets the default values.
     */
    public DelegatedPermissionClassification() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DelegatedPermissionClassification
     */
    @jakarta.annotation.Nonnull
    public static DelegatedPermissionClassification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedPermissionClassification();
    }
    /**
     * Gets the classification property value. The classification value being given. Possible value: low. Doesn't support $filter.
     * @return a PermissionClassificationType
     */
    @jakarta.annotation.Nullable
    public PermissionClassificationType getClassification() {
        return this.BackingStore.get("classification");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getEnumValue(PermissionClassificationType.class)); });
        deserializerMap.put("permissionId", (n) -> { this.setPermissionId(n.getStringValue()); });
        deserializerMap.put("permissionName", (n) -> { this.setPermissionName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the permissionId property value. The unique identifier (id) for the delegated permission listed in the oauth2PermissionScopes collection of the servicePrincipal. Required on create. Doesn't support $filter.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPermissionId() {
        return this.BackingStore.get("permissionId");
    }
    /**
     * Gets the permissionName property value. The claim value (value) for the delegated permission listed in the oauth2PermissionScopes collection of the servicePrincipal. Doesn't support $filter.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPermissionName() {
        return this.BackingStore.get("permissionName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeStringValue("permissionId", this.getPermissionId());
        writer.writeStringValue("permissionName", this.getPermissionName());
    }
    /**
     * Sets the classification property value. The classification value being given. Possible value: low. Doesn't support $filter.
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final PermissionClassificationType value) {
        this.BackingStore.set("classification", value);
    }
    /**
     * Sets the permissionId property value. The unique identifier (id) for the delegated permission listed in the oauth2PermissionScopes collection of the servicePrincipal. Required on create. Doesn't support $filter.
     * @param value Value to set for the permissionId property.
     */
    public void setPermissionId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("permissionId", value);
    }
    /**
     * Sets the permissionName property value. The claim value (value) for the delegated permission listed in the oauth2PermissionScopes collection of the servicePrincipal. Doesn't support $filter.
     * @param value Value to set for the permissionName property.
     */
    public void setPermissionName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("permissionName", value);
    }
}
