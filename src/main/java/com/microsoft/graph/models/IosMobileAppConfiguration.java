package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties, inherited properties and actions for iOS mobile app configurations.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosMobileAppConfiguration extends ManagedDeviceMobileAppConfiguration implements Parsable {
    /**
     * Instantiates a new IosMobileAppConfiguration and sets the default values.
     */
    public IosMobileAppConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosMobileAppConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosMobileAppConfiguration
     */
    @jakarta.annotation.Nonnull
    public static IosMobileAppConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosMobileAppConfiguration();
    }
    /**
     * Gets the encodedSettingXml property value. mdm app configuration Base64 binary.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getEncodedSettingXml() {
        return this.backingStore.get("encodedSettingXml");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("encodedSettingXml", (n) -> { this.setEncodedSettingXml(n.getByteArrayValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getCollectionOfObjectValues(AppConfigurationSettingItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. app configuration setting items.
     * @return a java.util.List<AppConfigurationSettingItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppConfigurationSettingItem> getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("encodedSettingXml", this.getEncodedSettingXml());
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
    }
    /**
     * Sets the encodedSettingXml property value. mdm app configuration Base64 binary.
     * @param value Value to set for the encodedSettingXml property.
     */
    public void setEncodedSettingXml(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("encodedSettingXml", value);
    }
    /**
     * Sets the settings property value. app configuration setting items.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final java.util.List<AppConfigurationSettingItem> value) {
        this.backingStore.set("settings", value);
    }
}
