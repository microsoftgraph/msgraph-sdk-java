package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Managed Android Line Of Business apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedAndroidLobApp extends ManagedMobileLobApp implements Parsable {
    /**
     * Instantiates a new {@link ManagedAndroidLobApp} and sets the default values.
     */
    public ManagedAndroidLobApp() {
        super();
        this.setOdataType("#microsoft.graph.managedAndroidLobApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedAndroidLobApp}
     */
    @jakarta.annotation.Nonnull
    public static ManagedAndroidLobApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAndroidLobApp();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(AndroidMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        deserializerMap.put("versionCode", (n) -> { this.setVersionCode(n.getStringValue()); });
        deserializerMap.put("versionName", (n) -> { this.setVersionName(n.getStringValue()); });
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
     * Gets the versionCode property value. The version code of managed Android Line of Business (LoB) app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersionCode() {
        return this.backingStore.get("versionCode");
    }
    /**
     * Gets the versionName property value. The version name of managed Android Line of Business (LoB) app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersionName() {
        return this.backingStore.get("versionName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    /**
     * Sets the versionCode property value. The version code of managed Android Line of Business (LoB) app.
     * @param value Value to set for the versionCode property.
     */
    public void setVersionCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("versionCode", value);
    }
    /**
     * Sets the versionName property value. The version name of managed Android Line of Business (LoB) app.
     * @param value Value to set for the versionName property.
     */
    public void setVersionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("versionName", value);
    }
}
