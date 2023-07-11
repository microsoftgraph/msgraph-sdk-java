package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Android store apps that you can manage with an Intune app protection policy.
 */
public class ManagedAndroidStoreApp extends ManagedApp implements Parsable {
    /**
     * The Android AppStoreUrl.
     */
    private String appStoreUrl;
    /**
     * Contains properties for the minimum operating system required for an Android mobile app.
     */
    private AndroidMinimumOperatingSystem minimumSupportedOperatingSystem;
    /**
     * The app's package ID.
     */
    private String packageId;
    /**
     * Instantiates a new managedAndroidStoreApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedAndroidStoreApp() {
        super();
        this.setOdataType("#microsoft.graph.managedAndroidStoreApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedAndroidStoreApp
     */
    @javax.annotation.Nonnull
    public static ManagedAndroidStoreApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAndroidStoreApp();
    }
    /**
     * Gets the appStoreUrl property value. The Android AppStoreUrl.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppStoreUrl() {
        return this.appStoreUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appStoreUrl", (n) -> { this.setAppStoreUrl(n.getStringValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(AndroidMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. Contains properties for the minimum operating system required for an Android mobile app.
     * @return a androidMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public AndroidMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.minimumSupportedOperatingSystem;
    }
    /**
     * Gets the packageId property value. The app's package ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageId() {
        return this.packageId;
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
        writer.writeStringValue("appStoreUrl", this.getAppStoreUrl());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("packageId", this.getPackageId());
    }
    /**
     * Sets the appStoreUrl property value. The Android AppStoreUrl.
     * @param value Value to set for the appStoreUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppStoreUrl(@javax.annotation.Nullable final String value) {
        this.appStoreUrl = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. Contains properties for the minimum operating system required for an Android mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final AndroidMinimumOperatingSystem value) {
        this.minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the packageId property value. The app's package ID.
     * @param value Value to set for the packageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageId(@javax.annotation.Nullable final String value) {
        this.packageId = value;
    }
}
