package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Win32LobAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /** Contains value for delivery optimization priority. */
    private Win32LobAppDeliveryOptimizationPriority _deliveryOptimizationPriority;
    /** The install time settings to apply for this app assignment. */
    private MobileAppInstallTimeSettings _installTimeSettings;
    /** Contains value for notification status. */
    private Win32LobAppNotification _notifications;
    /** The reboot settings to apply for this app assignment. */
    private Win32LobAppRestartSettings _restartSettings;
    /**
     * Instantiates a new Win32LobAppAssignmentSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Win32LobAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppAssignmentSettings
     */
    @javax.annotation.Nonnull
    public static Win32LobAppAssignmentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppAssignmentSettings();
    }
    /**
     * Gets the deliveryOptimizationPriority property value. Contains value for delivery optimization priority.
     * @return a win32LobAppDeliveryOptimizationPriority
     */
    @javax.annotation.Nullable
    public Win32LobAppDeliveryOptimizationPriority getDeliveryOptimizationPriority() {
        return this._deliveryOptimizationPriority;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Win32LobAppAssignmentSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("deliveryOptimizationPriority", (n) -> { currentObject.setDeliveryOptimizationPriority(n.getEnumValue(Win32LobAppDeliveryOptimizationPriority.class)); });
            this.put("installTimeSettings", (n) -> { currentObject.setInstallTimeSettings(n.getObjectValue(MobileAppInstallTimeSettings::createFromDiscriminatorValue)); });
            this.put("notifications", (n) -> { currentObject.setNotifications(n.getEnumValue(Win32LobAppNotification.class)); });
            this.put("restartSettings", (n) -> { currentObject.setRestartSettings(n.getObjectValue(Win32LobAppRestartSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the installTimeSettings property value. The install time settings to apply for this app assignment.
     * @return a mobileAppInstallTimeSettings
     */
    @javax.annotation.Nullable
    public MobileAppInstallTimeSettings getInstallTimeSettings() {
        return this._installTimeSettings;
    }
    /**
     * Gets the notifications property value. Contains value for notification status.
     * @return a win32LobAppNotification
     */
    @javax.annotation.Nullable
    public Win32LobAppNotification getNotifications() {
        return this._notifications;
    }
    /**
     * Gets the restartSettings property value. The reboot settings to apply for this app assignment.
     * @return a win32LobAppRestartSettings
     */
    @javax.annotation.Nullable
    public Win32LobAppRestartSettings getRestartSettings() {
        return this._restartSettings;
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
        writer.writeEnumValue("deliveryOptimizationPriority", this.getDeliveryOptimizationPriority());
        writer.writeObjectValue("installTimeSettings", this.getInstallTimeSettings());
        writer.writeEnumValue("notifications", this.getNotifications());
        writer.writeObjectValue("restartSettings", this.getRestartSettings());
    }
    /**
     * Sets the deliveryOptimizationPriority property value. Contains value for delivery optimization priority.
     * @param value Value to set for the deliveryOptimizationPriority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeliveryOptimizationPriority(@javax.annotation.Nullable final Win32LobAppDeliveryOptimizationPriority value) {
        this._deliveryOptimizationPriority = value;
    }
    /**
     * Sets the installTimeSettings property value. The install time settings to apply for this app assignment.
     * @param value Value to set for the installTimeSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallTimeSettings(@javax.annotation.Nullable final MobileAppInstallTimeSettings value) {
        this._installTimeSettings = value;
    }
    /**
     * Sets the notifications property value. Contains value for notification status.
     * @param value Value to set for the notifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotifications(@javax.annotation.Nullable final Win32LobAppNotification value) {
        this._notifications = value;
    }
    /**
     * Sets the restartSettings property value. The reboot settings to apply for this app assignment.
     * @param value Value to set for the restartSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestartSettings(@javax.annotation.Nullable final Win32LobAppRestartSettings value) {
        this._restartSettings = value;
    }
}
