package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryRoleManagementDeletedItemContainer extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DirectoryRoleManagementDeletedItemContainer} and sets the default values.
     */
    public DirectoryRoleManagementDeletedItemContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DirectoryRoleManagementDeletedItemContainer}
     */
    @jakarta.annotation.Nonnull
    public static DirectoryRoleManagementDeletedItemContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectoryRoleManagementDeletedItemContainer();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("roleDefinitions", (n) -> { this.setRoleDefinitions(n.getCollectionOfObjectValues(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the roleDefinitions property value. The soft-deleted custom role definitions in the directory.
     * @return a {@link java.util.List<UnifiedRoleDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleDefinition> getRoleDefinitions() {
        return this.backingStore.get("roleDefinitions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
    }
    /**
     * Sets the roleDefinitions property value. The soft-deleted custom role definitions in the directory.
     * @param value Value to set for the roleDefinitions property.
     */
    public void setRoleDefinitions(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleDefinition> value) {
        this.backingStore.set("roleDefinitions", value);
    }
}
