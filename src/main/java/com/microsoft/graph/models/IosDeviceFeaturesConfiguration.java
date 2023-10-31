package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * iOS Device Features Configuration Profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosDeviceFeaturesConfiguration extends AppleDeviceFeaturesConfigurationBase implements Parsable {
    /**
     * Instantiates a new IosDeviceFeaturesConfiguration and sets the default values.
     */
    public IosDeviceFeaturesConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosDeviceFeaturesConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosDeviceFeaturesConfiguration
     */
    @jakarta.annotation.Nonnull
    public static IosDeviceFeaturesConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosDeviceFeaturesConfiguration();
    }
    /**
     * Gets the assetTagTemplate property value. Asset tag information for the device, displayed on the login window and lock screen.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssetTagTemplate() {
        return this.getBackingStore().get("assetTagTemplate");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assetTagTemplate", (n) -> { this.setAssetTagTemplate(n.getStringValue()); });
        deserializerMap.put("homeScreenDockIcons", (n) -> { this.setHomeScreenDockIcons(n.getCollectionOfObjectValues(IosHomeScreenItem::createFromDiscriminatorValue)); });
        deserializerMap.put("homeScreenPages", (n) -> { this.setHomeScreenPages(n.getCollectionOfObjectValues(IosHomeScreenPage::createFromDiscriminatorValue)); });
        deserializerMap.put("lockScreenFootnote", (n) -> { this.setLockScreenFootnote(n.getStringValue()); });
        deserializerMap.put("notificationSettings", (n) -> { this.setNotificationSettings(n.getCollectionOfObjectValues(IosNotificationSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the homeScreenDockIcons property value. A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<IosHomeScreenItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosHomeScreenItem> getHomeScreenDockIcons() {
        return this.getBackingStore().get("homeScreenDockIcons");
    }
    /**
     * Gets the homeScreenPages property value. A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<IosHomeScreenPage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosHomeScreenPage> getHomeScreenPages() {
        return this.getBackingStore().get("homeScreenPages");
    }
    /**
     * Gets the lockScreenFootnote property value. A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLockScreenFootnote() {
        return this.getBackingStore().get("lockScreenFootnote");
    }
    /**
     * Gets the notificationSettings property value. Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements.
     * @return a java.util.List<IosNotificationSettings>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosNotificationSettings> getNotificationSettings() {
        return this.getBackingStore().get("notificationSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assetTagTemplate", this.getAssetTagTemplate());
        writer.writeCollectionOfObjectValues("homeScreenDockIcons", this.getHomeScreenDockIcons());
        writer.writeCollectionOfObjectValues("homeScreenPages", this.getHomeScreenPages());
        writer.writeStringValue("lockScreenFootnote", this.getLockScreenFootnote());
        writer.writeCollectionOfObjectValues("notificationSettings", this.getNotificationSettings());
    }
    /**
     * Sets the assetTagTemplate property value. Asset tag information for the device, displayed on the login window and lock screen.
     * @param value Value to set for the assetTagTemplate property.
     */
    public void setAssetTagTemplate(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("assetTagTemplate", value);
    }
    /**
     * Sets the homeScreenDockIcons property value. A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the homeScreenDockIcons property.
     */
    public void setHomeScreenDockIcons(@jakarta.annotation.Nullable final java.util.List<IosHomeScreenItem> value) {
        this.getBackingStore().set("homeScreenDockIcons", value);
    }
    /**
     * Sets the homeScreenPages property value. A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the homeScreenPages property.
     */
    public void setHomeScreenPages(@jakarta.annotation.Nullable final java.util.List<IosHomeScreenPage> value) {
        this.getBackingStore().set("homeScreenPages", value);
    }
    /**
     * Sets the lockScreenFootnote property value. A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
     * @param value Value to set for the lockScreenFootnote property.
     */
    public void setLockScreenFootnote(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("lockScreenFootnote", value);
    }
    /**
     * Sets the notificationSettings property value. Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the notificationSettings property.
     */
    public void setNotificationSettings(@jakarta.annotation.Nullable final java.util.List<IosNotificationSettings> value) {
        this.getBackingStore().set("notificationSettings", value);
    }
}
