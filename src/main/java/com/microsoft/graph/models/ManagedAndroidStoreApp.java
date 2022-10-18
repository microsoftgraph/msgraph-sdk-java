package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedAndroidStoreApp extends ManagedApp implements Parsable {
    /** The Android AppStoreUrl. */
    private String _appStoreUrl;
    /** Contains properties for the minimum operating system required for an Android mobile app. */
    private AndroidMinimumOperatingSystem _minimumSupportedOperatingSystem;
    /** The app's package ID. */
    private String _packageId;
    /**
     * Instantiates a new ManagedAndroidStoreApp and sets the default values.
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
     * @return a ManagedAndroidStoreApp
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
        return this._appStoreUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedAndroidStoreApp currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("appStoreUrl", (n) -> { currentObject.setAppStoreUrl(n.getStringValue()); });
            this.put("minimumSupportedOperatingSystem", (n) -> { currentObject.setMinimumSupportedOperatingSystem(n.getObjectValue(AndroidMinimumOperatingSystem::createFromDiscriminatorValue)); });
            this.put("packageId", (n) -> { currentObject.setPackageId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. Contains properties for the minimum operating system required for an Android mobile app.
     * @return a androidMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public AndroidMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this._minimumSupportedOperatingSystem;
    }
    /**
     * Gets the packageId property value. The app's package ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageId() {
        return this._packageId;
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
        this._appStoreUrl = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. Contains properties for the minimum operating system required for an Android mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final AndroidMinimumOperatingSystem value) {
        this._minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the packageId property value. The app's package ID.
     * @param value Value to set for the packageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageId(@javax.annotation.Nullable final String value) {
        this._packageId = value;
    }
}
