package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccessRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PrivilegedAccessRoot} and sets the default values.
     */
    public PrivilegedAccessRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivilegedAccessRoot}
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedAccessRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedAccessRoot();
    }
    /**
     * Gets the customExtensions property value. The customExtensions property
     * @return a {@link java.util.List<RoleManagementCustomCalloutExtension>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RoleManagementCustomCalloutExtension> getCustomExtensions() {
        return this.backingStore.get("customExtensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customExtensions", (n) -> { this.setCustomExtensions(n.getCollectionOfObjectValues(RoleManagementCustomCalloutExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(PrivilegedAccessGroup::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. A group that&apos;s governed through Privileged Identity Management (PIM).
     * @return a {@link PrivilegedAccessGroup}
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroup getGroup() {
        return this.backingStore.get("group");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("customExtensions", this.getCustomExtensions());
        writer.writeObjectValue("group", this.getGroup());
    }
    /**
     * Sets the customExtensions property value. The customExtensions property
     * @param value Value to set for the customExtensions property.
     */
    public void setCustomExtensions(@jakarta.annotation.Nullable final java.util.List<RoleManagementCustomCalloutExtension> value) {
        this.backingStore.set("customExtensions", value);
    }
    /**
     * Sets the group property value. A group that&apos;s governed through Privileged Identity Management (PIM).
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final PrivilegedAccessGroup value) {
        this.backingStore.set("group", value);
    }
}
