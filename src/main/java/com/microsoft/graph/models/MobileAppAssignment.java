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
public class MobileAppAssignment extends Entity implements Parsable {
    /**
     * Possible values for the install intent chosen by the admin.
     */
    private InstallIntent intent;
    /**
     * The settings for target assignment defined by the admin.
     */
    private MobileAppAssignmentSettings settings;
    /**
     * The target group assignment defined by the admin.
     */
    private DeviceAndAppManagementAssignmentTarget target;
    /**
     * Instantiates a new mobileAppAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppAssignment
     */
    @javax.annotation.Nonnull
    public static MobileAppAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("intent", (n) -> { this.setIntent(n.getEnumValue(InstallIntent.class)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(MobileAppAssignmentSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the intent property value. Possible values for the install intent chosen by the admin.
     * @return a installIntent
     */
    @javax.annotation.Nullable
    public InstallIntent getIntent() {
        return this.intent;
    }
    /**
     * Gets the settings property value. The settings for target assignment defined by the admin.
     * @return a mobileAppAssignmentSettings
     */
    @javax.annotation.Nullable
    public MobileAppAssignmentSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the target property value. The target group assignment defined by the admin.
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
        writer.writeEnumValue("intent", this.getIntent());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the intent property value. Possible values for the install intent chosen by the admin.
     * @param value Value to set for the intent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntent(@javax.annotation.Nullable final InstallIntent value) {
        this.intent = value;
    }
    /**
     * Sets the settings property value. The settings for target assignment defined by the admin.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final MobileAppAssignmentSettings value) {
        this.settings = value;
    }
    /**
     * Sets the target property value. The target group assignment defined by the admin.
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this.target = value;
    }
}
