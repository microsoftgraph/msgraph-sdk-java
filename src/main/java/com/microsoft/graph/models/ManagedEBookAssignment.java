package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign a eBook to a group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedEBookAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new ManagedEBookAssignment and sets the default values.
     */
    public ManagedEBookAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedEBookAssignment
     */
    @jakarta.annotation.Nonnull
    public static ManagedEBookAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.iosVppEBookAssignment": return new IosVppEBookAssignment();
            }
        }
        return new ManagedEBookAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("installIntent", (n) -> { this.setInstallIntent(n.getEnumValue(InstallIntent.class)); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the installIntent property value. Possible values for the install intent chosen by the admin.
     * @return a InstallIntent
     */
    @jakarta.annotation.Nullable
    public InstallIntent getInstallIntent() {
        return this.backingStore.get("installIntent");
    }
    /**
     * Gets the target property value. The assignment target for eBook.
     * @return a DeviceAndAppManagementAssignmentTarget
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this.backingStore.get("target");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("installIntent", this.getInstallIntent());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the installIntent property value. Possible values for the install intent chosen by the admin.
     * @param value Value to set for the installIntent property.
     */
    public void setInstallIntent(@jakarta.annotation.Nullable final InstallIntent value) {
        this.backingStore.set("installIntent", value);
    }
    /**
     * Sets the target property value. The assignment target for eBook.
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this.backingStore.set("target", value);
    }
}
