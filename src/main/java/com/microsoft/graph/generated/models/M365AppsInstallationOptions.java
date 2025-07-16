package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class M365AppsInstallationOptions extends Entity implements Parsable {
    /**
     * Instantiates a new {@link M365AppsInstallationOptions} and sets the default values.
     */
    public M365AppsInstallationOptions() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link M365AppsInstallationOptions}
     */
    @jakarta.annotation.Nonnull
    public static M365AppsInstallationOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new M365AppsInstallationOptions();
    }
    /**
     * Gets the appsForMac property value. The appsForMac property
     * @return a {@link AppsInstallationOptionsForMac}
     */
    @jakarta.annotation.Nullable
    public AppsInstallationOptionsForMac getAppsForMac() {
        return this.backingStore.get("appsForMac");
    }
    /**
     * Gets the appsForWindows property value. The appsForWindows property
     * @return a {@link AppsInstallationOptionsForWindows}
     */
    @jakarta.annotation.Nullable
    public AppsInstallationOptionsForWindows getAppsForWindows() {
        return this.backingStore.get("appsForWindows");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appsForMac", (n) -> { this.setAppsForMac(n.getObjectValue(AppsInstallationOptionsForMac::createFromDiscriminatorValue)); });
        deserializerMap.put("appsForWindows", (n) -> { this.setAppsForWindows(n.getObjectValue(AppsInstallationOptionsForWindows::createFromDiscriminatorValue)); });
        deserializerMap.put("updateChannel", (n) -> { this.setUpdateChannel(n.getEnumValue(AppsUpdateChannelType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the updateChannel property value. The updateChannel property
     * @return a {@link AppsUpdateChannelType}
     */
    @jakarta.annotation.Nullable
    public AppsUpdateChannelType getUpdateChannel() {
        return this.backingStore.get("updateChannel");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("appsForMac", this.getAppsForMac());
        writer.writeObjectValue("appsForWindows", this.getAppsForWindows());
        writer.writeEnumValue("updateChannel", this.getUpdateChannel());
    }
    /**
     * Sets the appsForMac property value. The appsForMac property
     * @param value Value to set for the appsForMac property.
     */
    public void setAppsForMac(@jakarta.annotation.Nullable final AppsInstallationOptionsForMac value) {
        this.backingStore.set("appsForMac", value);
    }
    /**
     * Sets the appsForWindows property value. The appsForWindows property
     * @param value Value to set for the appsForWindows property.
     */
    public void setAppsForWindows(@jakarta.annotation.Nullable final AppsInstallationOptionsForWindows value) {
        this.backingStore.set("appsForWindows", value);
    }
    /**
     * Sets the updateChannel property value. The updateChannel property
     * @param value Value to set for the updateChannel property.
     */
    public void setUpdateChannel(@jakarta.annotation.Nullable final AppsUpdateChannelType value) {
        this.backingStore.set("updateChannel", value);
    }
}
