package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Android store apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidStoreApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new {@link AndroidStoreApp} and sets the default values.
     */
    public AndroidStoreApp() {
        super();
        this.setOdataType("#microsoft.graph.androidStoreApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidStoreApp}
     */
    @jakarta.annotation.Nonnull
    public static AndroidStoreApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidStoreApp();
    }
    /**
     * Gets the appStoreUrl property value. The Android app store URL.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppStoreUrl() {
        return this.backingStore.get("appStoreUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appStoreUrl", (n) -> { this.setAppStoreUrl(n.getStringValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(AndroidMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @return a {@link AndroidMinimumOperatingSystem}
     */
    @jakarta.annotation.Nullable
    public AndroidMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.backingStore.get("minimumSupportedOperatingSystem");
    }
    /**
     * Gets the packageId property value. The package identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageId() {
        return this.backingStore.get("packageId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appStoreUrl", this.getAppStoreUrl());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("packageId", this.getPackageId());
    }
    /**
     * Sets the appStoreUrl property value. The Android app store URL.
     * @param value Value to set for the appStoreUrl property.
     */
    public void setAppStoreUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appStoreUrl", value);
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     */
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final AndroidMinimumOperatingSystem value) {
        this.backingStore.set("minimumSupportedOperatingSystem", value);
    }
    /**
     * Sets the packageId property value. The package identifier.
     * @param value Value to set for the packageId property.
     */
    public void setPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("packageId", value);
    }
}
