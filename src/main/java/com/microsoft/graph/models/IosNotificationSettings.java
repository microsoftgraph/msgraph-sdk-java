package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** An item describing notification setting. */
public class IosNotificationSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Notification Settings Alert Type. */
    private IosNotificationAlertType _alertType;
    /** Application name to be associated with the bundleID. */
    private String _appName;
    /** Indicates whether badges are allowed for this app. */
    private Boolean _badgesEnabled;
    /** Bundle id of app to which to apply these notification settings. */
    private String _bundleID;
    /** Indicates whether notifications are allowed for this app. */
    private Boolean _enabled;
    /** The OdataType property */
    private String _odataType;
    /** Publisher to be associated with the bundleID. */
    private String _publisher;
    /** Indicates whether notifications can be shown in notification center. */
    private Boolean _showInNotificationCenter;
    /** Indicates whether notifications can be shown on the lock screen. */
    private Boolean _showOnLockScreen;
    /** Indicates whether sounds are allowed for this app. */
    private Boolean _soundsEnabled;
    /**
     * Instantiates a new iosNotificationSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosNotificationSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosNotificationSettings
     */
    @javax.annotation.Nonnull
    public static IosNotificationSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosNotificationSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the alertType property value. Notification Settings Alert Type.
     * @return a iosNotificationAlertType
     */
    @javax.annotation.Nullable
    public IosNotificationAlertType getAlertType() {
        return this._alertType;
    }
    /**
     * Gets the appName property value. Application name to be associated with the bundleID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppName() {
        return this._appName;
    }
    /**
     * Gets the badgesEnabled property value. Indicates whether badges are allowed for this app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBadgesEnabled() {
        return this._badgesEnabled;
    }
    /**
     * Gets the bundleID property value. Bundle id of app to which to apply these notification settings.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleID() {
        return this._bundleID;
    }
    /**
     * Gets the enabled property value. Indicates whether notifications are allowed for this app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this._enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosNotificationSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(10) {{
            this.put("alertType", (n) -> { currentObject.setAlertType(n.getEnumValue(IosNotificationAlertType.class)); });
            this.put("appName", (n) -> { currentObject.setAppName(n.getStringValue()); });
            this.put("badgesEnabled", (n) -> { currentObject.setBadgesEnabled(n.getBooleanValue()); });
            this.put("bundleID", (n) -> { currentObject.setBundleID(n.getStringValue()); });
            this.put("enabled", (n) -> { currentObject.setEnabled(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("publisher", (n) -> { currentObject.setPublisher(n.getStringValue()); });
            this.put("showInNotificationCenter", (n) -> { currentObject.setShowInNotificationCenter(n.getBooleanValue()); });
            this.put("showOnLockScreen", (n) -> { currentObject.setShowOnLockScreen(n.getBooleanValue()); });
            this.put("soundsEnabled", (n) -> { currentObject.setSoundsEnabled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the publisher property value. Publisher to be associated with the bundleID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the showInNotificationCenter property value. Indicates whether notifications can be shown in notification center.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowInNotificationCenter() {
        return this._showInNotificationCenter;
    }
    /**
     * Gets the showOnLockScreen property value. Indicates whether notifications can be shown on the lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowOnLockScreen() {
        return this._showOnLockScreen;
    }
    /**
     * Gets the soundsEnabled property value. Indicates whether sounds are allowed for this app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSoundsEnabled() {
        return this._soundsEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("alertType", this.getAlertType());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeBooleanValue("badgesEnabled", this.getBadgesEnabled());
        writer.writeStringValue("bundleID", this.getBundleID());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeBooleanValue("showInNotificationCenter", this.getShowInNotificationCenter());
        writer.writeBooleanValue("showOnLockScreen", this.getShowOnLockScreen());
        writer.writeBooleanValue("soundsEnabled", this.getSoundsEnabled());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the alertType property value. Notification Settings Alert Type.
     * @param value Value to set for the alertType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertType(@javax.annotation.Nullable final IosNotificationAlertType value) {
        this._alertType = value;
    }
    /**
     * Sets the appName property value. Application name to be associated with the bundleID.
     * @param value Value to set for the appName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppName(@javax.annotation.Nullable final String value) {
        this._appName = value;
    }
    /**
     * Sets the badgesEnabled property value. Indicates whether badges are allowed for this app.
     * @param value Value to set for the badgesEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBadgesEnabled(@javax.annotation.Nullable final Boolean value) {
        this._badgesEnabled = value;
    }
    /**
     * Sets the bundleID property value. Bundle id of app to which to apply these notification settings.
     * @param value Value to set for the bundleID property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBundleID(@javax.annotation.Nullable final String value) {
        this._bundleID = value;
    }
    /**
     * Sets the enabled property value. Indicates whether notifications are allowed for this app.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the publisher property value. Publisher to be associated with the bundleID.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
    /**
     * Sets the showInNotificationCenter property value. Indicates whether notifications can be shown in notification center.
     * @param value Value to set for the showInNotificationCenter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowInNotificationCenter(@javax.annotation.Nullable final Boolean value) {
        this._showInNotificationCenter = value;
    }
    /**
     * Sets the showOnLockScreen property value. Indicates whether notifications can be shown on the lock screen.
     * @param value Value to set for the showOnLockScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowOnLockScreen(@javax.annotation.Nullable final Boolean value) {
        this._showOnLockScreen = value;
    }
    /**
     * Sets the soundsEnabled property value. Indicates whether sounds are allowed for this app.
     * @param value Value to set for the soundsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoundsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._soundsEnabled = value;
    }
}
