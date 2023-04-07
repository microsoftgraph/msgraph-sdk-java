package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosStoreApp extends MobileApp implements Parsable {
    /** Contains properties of the possible iOS device types the mobile app can run on. */
    private IosDeviceType applicableDeviceType;
    /** The Apple App Store URL */
    private String appStoreUrl;
    /** The Identity Name. */
    private String bundleId;
    /** The value for the minimum applicable operating system. */
    private IosMinimumOperatingSystem minimumSupportedOperatingSystem;
    /**
     * Instantiates a new IosStoreApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosStoreApp() {
        super();
        this.setOdataType("#microsoft.graph.iosStoreApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosStoreApp
     */
    @javax.annotation.Nonnull
    public static IosStoreApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosStoreApp();
    }
    /**
     * Gets the applicableDeviceType property value. Contains properties of the possible iOS device types the mobile app can run on.
     * @return a iosDeviceType
     */
    @javax.annotation.Nullable
    public IosDeviceType getApplicableDeviceType() {
        return this.applicableDeviceType;
    }
    /**
     * Gets the appStoreUrl property value. The Apple App Store URL
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppStoreUrl() {
        return this.appStoreUrl;
    }
    /**
     * Gets the bundleId property value. The Identity Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleId() {
        return this.bundleId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableDeviceType", (n) -> { this.setApplicableDeviceType(n.getObjectValue(IosDeviceType::createFromDiscriminatorValue)); });
        deserializerMap.put("appStoreUrl", (n) -> { this.setAppStoreUrl(n.getStringValue()); });
        deserializerMap.put("bundleId", (n) -> { this.setBundleId(n.getStringValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(IosMinimumOperatingSystem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @return a iosMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public IosMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.minimumSupportedOperatingSystem;
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
        writer.writeObjectValue("applicableDeviceType", this.getApplicableDeviceType());
        writer.writeStringValue("appStoreUrl", this.getAppStoreUrl());
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
    }
    /**
     * Sets the applicableDeviceType property value. Contains properties of the possible iOS device types the mobile app can run on.
     * @param value Value to set for the applicableDeviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicableDeviceType(@javax.annotation.Nullable final IosDeviceType value) {
        this.applicableDeviceType = value;
    }
    /**
     * Sets the appStoreUrl property value. The Apple App Store URL
     * @param value Value to set for the appStoreUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppStoreUrl(@javax.annotation.Nullable final String value) {
        this.appStoreUrl = value;
    }
    /**
     * Sets the bundleId property value. The Identity Name.
     * @param value Value to set for the bundleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBundleId(@javax.annotation.Nullable final String value) {
        this.bundleId = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final IosMinimumOperatingSystem value) {
        this.minimumSupportedOperatingSystem = value;
    }
}
