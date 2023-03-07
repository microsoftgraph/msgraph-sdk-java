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
public class ManagedEBookAssignment extends Entity implements Parsable {
    /** Possible values for the install intent chosen by the admin. */
    private InstallIntent installIntent;
    /** The assignment target for eBook. */
    private DeviceAndAppManagementAssignmentTarget target;
    /**
     * Instantiates a new managedEBookAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedEBookAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedEBookAssignment
     */
    @javax.annotation.Nonnull
    public static ManagedEBookAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("installIntent", (n) -> { this.setInstallIntent(n.getEnumValue(InstallIntent.class)); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the installIntent property value. Possible values for the install intent chosen by the admin.
     * @return a installIntent
     */
    @javax.annotation.Nullable
    public InstallIntent getInstallIntent() {
        return this.installIntent;
    }
    /**
     * Gets the target property value. The assignment target for eBook.
     * @return a deviceAndAppManagementAssignmentTarget
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this.target;
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
        writer.writeEnumValue("installIntent", this.getInstallIntent());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the installIntent property value. Possible values for the install intent chosen by the admin.
     * @param value Value to set for the installIntent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallIntent(@javax.annotation.Nullable final InstallIntent value) {
        this.installIntent = value;
    }
    /**
     * Sets the target property value. The assignment target for eBook.
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this.target = value;
    }
}
