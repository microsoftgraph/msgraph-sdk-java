package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidLobApp extends MobileLobApp implements Parsable {
    /** The value for the minimum applicable operating system. */
    private AndroidMinimumOperatingSystem _minimumSupportedOperatingSystem;
    /** The package identifier. */
    private String _packageId;
    /** The version code of Android Line of Business (LoB) app. */
    private String _versionCode;
    /** The version name of Android Line of Business (LoB) app. */
    private String _versionName;
    /**
     * Instantiates a new AndroidLobApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidLobApp() {
        super();
        this.setOdataType("#microsoft.graph.androidLobApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidLobApp
     */
    @javax.annotation.Nonnull
    public static AndroidLobApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidLobApp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidLobApp currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { currentObject.setMinimumSupportedOperatingSystem(n.getObjectValue(AndroidMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("packageId", (n) -> { currentObject.setPackageId(n.getStringValue()); });
        deserializerMap.put("versionCode", (n) -> { currentObject.setVersionCode(n.getStringValue()); });
        deserializerMap.put("versionName", (n) -> { currentObject.setVersionName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @return a androidMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public AndroidMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this._minimumSupportedOperatingSystem;
    }
    /**
     * Gets the packageId property value. The package identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageId() {
        return this._packageId;
    }
    /**
     * Gets the versionCode property value. The version code of Android Line of Business (LoB) app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersionCode() {
        return this._versionCode;
    }
    /**
     * Gets the versionName property value. The version name of Android Line of Business (LoB) app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersionName() {
        return this._versionName;
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
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeStringValue("versionCode", this.getVersionCode());
        writer.writeStringValue("versionName", this.getVersionName());
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final AndroidMinimumOperatingSystem value) {
        this._minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the packageId property value. The package identifier.
     * @param value Value to set for the packageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageId(@javax.annotation.Nullable final String value) {
        this._packageId = value;
    }
    /**
     * Sets the versionCode property value. The version code of Android Line of Business (LoB) app.
     * @param value Value to set for the versionCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersionCode(@javax.annotation.Nullable final String value) {
        this._versionCode = value;
    }
    /**
     * Sets the versionName property value. The version name of Android Line of Business (LoB) app.
     * @param value Value to set for the versionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersionName(@javax.annotation.Nullable final String value) {
        this._versionName = value;
    }
}
