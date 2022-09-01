package com.microsoft.graph.models;

import com.microsoft.graph.models.IosVppEBookAssignment;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties used to assign a eBook to a group. */
public class ManagedEBookAssignment extends Entity implements Parsable {
    /** Possible values for the install intent chosen by the admin. */
    private InstallIntent _installIntent;
    /** The assignment target for eBook. */
    private DeviceAndAppManagementAssignmentTarget _target;
    /**
     * Instantiates a new managedEBookAssignment and sets the default values.
     * @return a void
     */
    public ManagedEBookAssignment() {
        super();
        this.setOdataType("#microsoft.graph.managedEBookAssignment");
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedEBookAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("installIntent", (n) -> { currentObject.setInstallIntent(n.getEnumValue(InstallIntent.class)); });
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the installIntent property value. Possible values for the install intent chosen by the admin.
     * @return a installIntent
     */
    @javax.annotation.Nullable
    public InstallIntent getInstallIntent() {
        return this._installIntent;
    }
    /**
     * Gets the target property value. The assignment target for eBook.
     * @return a deviceAndAppManagementAssignmentTarget
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this._target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setInstallIntent(@javax.annotation.Nullable final InstallIntent value) {
        this._installIntent = value;
    }
    /**
     * Sets the target property value. The assignment target for eBook.
     * @param value Value to set for the target property.
     * @return a void
     */
    public void setTarget(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this._target = value;
    }
}
