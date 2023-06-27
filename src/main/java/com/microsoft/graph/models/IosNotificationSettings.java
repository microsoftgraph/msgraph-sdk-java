package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An item describing notification setting.
 */
public class IosNotificationSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Notification Settings Alert Type.
     */
    private IosNotificationAlertType alertType;
    /**
     * Application name to be associated with the bundleID.
     */
    private String appName;
    /**
     * Indicates whether badges are allowed for this app.
     */
    private Boolean badgesEnabled;
    /**
     * Bundle id of app to which to apply these notification settings.
     */
    private String bundleID;
    /**
     * Indicates whether notifications are allowed for this app.
     */
    private Boolean enabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Publisher to be associated with the bundleID.
     */
    private String publisher;
    /**
     * Indicates whether notifications can be shown in notification center.
     */
    private Boolean showInNotificationCenter;
    /**
     * Indicates whether notifications can be shown on the lock screen.
     */
    private Boolean showOnLockScreen;
    /**
     * Indicates whether sounds are allowed for this app.
     */
    private Boolean soundsEnabled;
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
        return this.additionalData;
    }
    /**
     * Gets the alertType property value. Notification Settings Alert Type.
     * @return a IosNotificationAlertType
     */
    @javax.annotation.Nullable
    public IosNotificationAlertType getAlertType() {
        return this.alertType;
    }
    /**
     * Gets the appName property value. Application name to be associated with the bundleID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppName() {
        return this.appName;
    }
    /**
     * Gets the badgesEnabled property value. Indicates whether badges are allowed for this app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBadgesEnabled() {
        return this.badgesEnabled;
    }
    /**
     * Gets the bundleID property value. Bundle id of app to which to apply these notification settings.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleID() {
        return this.bundleID;
    }
    /**
     * Gets the enabled property value. Indicates whether notifications are allowed for this app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("alertType", (n) -> { this.setAlertType(n.getEnumValue(IosNotificationAlertType.class)); });
        deserializerMap.put("appName", (n) -> { this.setAppName(n.getStringValue()); });
        deserializerMap.put("badgesEnabled", (n) -> { this.setBadgesEnabled(n.getBooleanValue()); });
        deserializerMap.put("bundleID", (n) -> { this.setBundleID(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("showInNotificationCenter", (n) -> { this.setShowInNotificationCenter(n.getBooleanValue()); });
        deserializerMap.put("showOnLockScreen", (n) -> { this.setShowOnLockScreen(n.getBooleanValue()); });
        deserializerMap.put("soundsEnabled", (n) -> { this.setSoundsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the publisher property value. Publisher to be associated with the bundleID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * Gets the showInNotificationCenter property value. Indicates whether notifications can be shown in notification center.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowInNotificationCenter() {
        return this.showInNotificationCenter;
    }
    /**
     * Gets the showOnLockScreen property value. Indicates whether notifications can be shown on the lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowOnLockScreen() {
        return this.showOnLockScreen;
    }
    /**
     * Gets the soundsEnabled property value. Indicates whether sounds are allowed for this app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSoundsEnabled() {
        return this.soundsEnabled;
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
        this.additionalData = value;
    }
    /**
     * Sets the alertType property value. Notification Settings Alert Type.
     * @param value Value to set for the alertType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertType(@javax.annotation.Nullable final IosNotificationAlertType value) {
        this.alertType = value;
    }
    /**
     * Sets the appName property value. Application name to be associated with the bundleID.
     * @param value Value to set for the appName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppName(@javax.annotation.Nullable final String value) {
        this.appName = value;
    }
    /**
     * Sets the badgesEnabled property value. Indicates whether badges are allowed for this app.
     * @param value Value to set for the badgesEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBadgesEnabled(@javax.annotation.Nullable final Boolean value) {
        this.badgesEnabled = value;
    }
    /**
     * Sets the bundleID property value. Bundle id of app to which to apply these notification settings.
     * @param value Value to set for the bundleID property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBundleID(@javax.annotation.Nullable final String value) {
        this.bundleID = value;
    }
    /**
     * Sets the enabled property value. Indicates whether notifications are allowed for this app.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the publisher property value. Publisher to be associated with the bundleID.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this.publisher = value;
    }
    /**
     * Sets the showInNotificationCenter property value. Indicates whether notifications can be shown in notification center.
     * @param value Value to set for the showInNotificationCenter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowInNotificationCenter(@javax.annotation.Nullable final Boolean value) {
        this.showInNotificationCenter = value;
    }
    /**
     * Sets the showOnLockScreen property value. Indicates whether notifications can be shown on the lock screen.
     * @param value Value to set for the showOnLockScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowOnLockScreen(@javax.annotation.Nullable final Boolean value) {
        this.showOnLockScreen = value;
    }
    /**
     * Sets the soundsEnabled property value. Indicates whether sounds are allowed for this app.
     * @param value Value to set for the soundsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoundsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.soundsEnabled = value;
    }
}
