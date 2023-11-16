package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the properties used for Group Assignment of a Mobile App.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new MobileAppAssignment and sets the default values.
     */
    public MobileAppAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppAssignment
     */
    @jakarta.annotation.Nonnull
    public static MobileAppAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("intent", (n) -> { this.setIntent(n.getEnumValue(InstallIntent.class)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(MobileAppAssignmentSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the intent property value. Possible values for the install intent chosen by the admin.
     * @return a InstallIntent
     */
    @jakarta.annotation.Nullable
    public InstallIntent getIntent() {
        return this.BackingStore.get("intent");
    }
    /**
     * Gets the settings property value. The settings for target assignment defined by the admin.
     * @return a MobileAppAssignmentSettings
     */
    @jakarta.annotation.Nullable
    public MobileAppAssignmentSettings getSettings() {
        return this.BackingStore.get("settings");
    }
    /**
     * Gets the target property value. The target group assignment defined by the admin.
     * @return a DeviceAndAppManagementAssignmentTarget
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this.BackingStore.get("target");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("intent", this.getIntent());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the intent property value. Possible values for the install intent chosen by the admin.
     * @param value Value to set for the intent property.
     */
    public void setIntent(@jakarta.annotation.Nullable final InstallIntent value) {
        this.BackingStore.set("intent", value);
    }
    /**
     * Sets the settings property value. The settings for target assignment defined by the admin.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final MobileAppAssignmentSettings value) {
        this.BackingStore.set("settings", value);
    }
    /**
     * Sets the target property value. The target group assignment defined by the admin.
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this.BackingStore.set("target", value);
    }
}
