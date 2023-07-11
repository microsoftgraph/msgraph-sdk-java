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
public class IosMobileAppConfiguration extends ManagedDeviceMobileAppConfiguration implements Parsable {
    /**
     * mdm app configuration Base64 binary.
     */
    private byte[] encodedSettingXml;
    /**
     * app configuration setting items.
     */
    private java.util.List<AppConfigurationSettingItem> settings;
    /**
     * Instantiates a new iosMobileAppConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosMobileAppConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosMobileAppConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosMobileAppConfiguration
     */
    @javax.annotation.Nonnull
    public static IosMobileAppConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosMobileAppConfiguration();
    }
    /**
     * Gets the encodedSettingXml property value. mdm app configuration Base64 binary.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getEncodedSettingXml() {
        return this.encodedSettingXml;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("encodedSettingXml", (n) -> { this.setEncodedSettingXml(n.getByteArrayValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getCollectionOfObjectValues(AppConfigurationSettingItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. app configuration setting items.
     * @return a appConfigurationSettingItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppConfigurationSettingItem> getSettings() {
        return this.settings;
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
        writer.writeByteArrayValue("encodedSettingXml", this.getEncodedSettingXml());
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
    }
    /**
     * Sets the encodedSettingXml property value. mdm app configuration Base64 binary.
     * @param value Value to set for the encodedSettingXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEncodedSettingXml(@javax.annotation.Nullable final byte[] value) {
        this.encodedSettingXml = value;
    }
    /**
     * Sets the settings property value. app configuration setting items.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final java.util.List<AppConfigurationSettingItem> value) {
        this.settings = value;
    }
}
