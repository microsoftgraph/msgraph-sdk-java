package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign an Win32 LOB mobile app to a group.
 */
public class Win32LobAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * Contains value for delivery optimization priority.
     */
    private Win32LobAppDeliveryOptimizationPriority deliveryOptimizationPriority;
    /**
     * The install time settings to apply for this app assignment.
     */
    private MobileAppInstallTimeSettings installTimeSettings;
    /**
     * Contains value for notification status.
     */
    private Win32LobAppNotification notifications;
    /**
     * The reboot settings to apply for this app assignment.
     */
    private Win32LobAppRestartSettings restartSettings;
    /**
     * Instantiates a new win32LobAppAssignmentSettings and sets the default values.
     */
    public Win32LobAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobAppAssignmentSettings
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppAssignmentSettings();
    }
    /**
     * Gets the deliveryOptimizationPriority property value. Contains value for delivery optimization priority.
     * @return a win32LobAppDeliveryOptimizationPriority
     */
    @jakarta.annotation.Nullable
    public Win32LobAppDeliveryOptimizationPriority getDeliveryOptimizationPriority() {
        return this.deliveryOptimizationPriority;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deliveryOptimizationPriority", (n) -> { this.setDeliveryOptimizationPriority(n.getEnumValue(Win32LobAppDeliveryOptimizationPriority.class)); });
        deserializerMap.put("installTimeSettings", (n) -> { this.setInstallTimeSettings(n.getObjectValue(MobileAppInstallTimeSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("notifications", (n) -> { this.setNotifications(n.getEnumValue(Win32LobAppNotification.class)); });
        deserializerMap.put("restartSettings", (n) -> { this.setRestartSettings(n.getObjectValue(Win32LobAppRestartSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the installTimeSettings property value. The install time settings to apply for this app assignment.
     * @return a mobileAppInstallTimeSettings
     */
    @jakarta.annotation.Nullable
    public MobileAppInstallTimeSettings getInstallTimeSettings() {
        return this.installTimeSettings;
    }
    /**
     * Gets the notifications property value. Contains value for notification status.
     * @return a win32LobAppNotification
     */
    @jakarta.annotation.Nullable
    public Win32LobAppNotification getNotifications() {
        return this.notifications;
    }
    /**
     * Gets the restartSettings property value. The reboot settings to apply for this app assignment.
     * @return a win32LobAppRestartSettings
     */
    @jakarta.annotation.Nullable
    public Win32LobAppRestartSettings getRestartSettings() {
        return this.restartSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("deliveryOptimizationPriority", this.getDeliveryOptimizationPriority());
        writer.writeObjectValue("installTimeSettings", this.getInstallTimeSettings());
        writer.writeEnumValue("notifications", this.getNotifications());
        writer.writeObjectValue("restartSettings", this.getRestartSettings());
    }
    /**
     * Sets the deliveryOptimizationPriority property value. Contains value for delivery optimization priority.
     * @param value Value to set for the deliveryOptimizationPriority property.
     */
    public void setDeliveryOptimizationPriority(@jakarta.annotation.Nullable final Win32LobAppDeliveryOptimizationPriority value) {
        this.deliveryOptimizationPriority = value;
    }
    /**
     * Sets the installTimeSettings property value. The install time settings to apply for this app assignment.
     * @param value Value to set for the installTimeSettings property.
     */
    public void setInstallTimeSettings(@jakarta.annotation.Nullable final MobileAppInstallTimeSettings value) {
        this.installTimeSettings = value;
    }
    /**
     * Sets the notifications property value. Contains value for notification status.
     * @param value Value to set for the notifications property.
     */
    public void setNotifications(@jakarta.annotation.Nullable final Win32LobAppNotification value) {
        this.notifications = value;
    }
    /**
     * Sets the restartSettings property value. The reboot settings to apply for this app assignment.
     * @param value Value to set for the restartSettings property.
     */
    public void setRestartSettings(@jakarta.annotation.Nullable final Win32LobAppRestartSettings value) {
        this.restartSettings = value;
    }
}
