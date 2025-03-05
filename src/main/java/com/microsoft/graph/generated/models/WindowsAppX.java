package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Windows AppX Line Of Business apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsAppX extends MobileLobApp implements Parsable {
    /**
     * Instantiates a new {@link WindowsAppX} and sets the default values.
     */
    public WindowsAppX() {
        super();
        this.setOdataType("#microsoft.graph.windowsAppX");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsAppX}
     */
    @jakarta.annotation.Nonnull
    public static WindowsAppX createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAppX();
    }
    /**
     * Gets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @return a {@link EnumSet<WindowsArchitecture>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsArchitecture> getApplicableArchitectures() {
        return this.backingStore.get("applicableArchitectures");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableArchitectures", (n) -> { this.setApplicableArchitectures(n.getEnumSetValue(WindowsArchitecture::forValue)); });
        deserializerMap.put("identityName", (n) -> { this.setIdentityName(n.getStringValue()); });
        deserializerMap.put("identityPublisherHash", (n) -> { this.setIdentityPublisherHash(n.getStringValue()); });
        deserializerMap.put("identityResourceIdentifier", (n) -> { this.setIdentityResourceIdentifier(n.getStringValue()); });
        deserializerMap.put("identityVersion", (n) -> { this.setIdentityVersion(n.getStringValue()); });
        deserializerMap.put("isBundle", (n) -> { this.setIsBundle(n.getBooleanValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(WindowsMinimumOperatingSystem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identityName property value. The identity name of the uploaded app package. For example: &apos;Contoso.DemoApp&apos;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityName() {
        return this.backingStore.get("identityName");
    }
    /**
     * Gets the identityPublisherHash property value. The identity publisher hash of the uploaded app package. This is the hash of the publisher from the manifest. For example: &apos;AB82CD0XYZ&apos;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityPublisherHash() {
        return this.backingStore.get("identityPublisherHash");
    }
    /**
     * Gets the identityResourceIdentifier property value. The identity resource identifier of the uploaded app package. For example: &apos;TestResourceId&apos;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityResourceIdentifier() {
        return this.backingStore.get("identityResourceIdentifier");
    }
    /**
     * Gets the identityVersion property value. The identity version of the uploaded app package. For example: &apos;1.0.0.0&apos;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityVersion() {
        return this.backingStore.get("identityVersion");
    }
    /**
     * Gets the isBundle property value. When TRUE, indicates that the app is a bundle. When FALSE, indicates that the app is not a bundle. By default, property is set to FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBundle() {
        return this.backingStore.get("isBundle");
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @return a {@link WindowsMinimumOperatingSystem}
     */
    @jakarta.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.backingStore.get("minimumSupportedOperatingSystem");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("applicableArchitectures", this.getApplicableArchitectures());
        writer.writeStringValue("identityName", this.getIdentityName());
        writer.writeStringValue("identityPublisherHash", this.getIdentityPublisherHash());
        writer.writeStringValue("identityResourceIdentifier", this.getIdentityResourceIdentifier());
        writer.writeStringValue("identityVersion", this.getIdentityVersion());
        writer.writeBooleanValue("isBundle", this.getIsBundle());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
    }
    /**
     * Sets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @param value Value to set for the applicableArchitectures property.
     */
    public void setApplicableArchitectures(@jakarta.annotation.Nullable final EnumSet<WindowsArchitecture> value) {
        this.backingStore.set("applicableArchitectures", value);
    }
    /**
     * Sets the identityName property value. The identity name of the uploaded app package. For example: &apos;Contoso.DemoApp&apos;.
     * @param value Value to set for the identityName property.
     */
    public void setIdentityName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityName", value);
    }
    /**
     * Sets the identityPublisherHash property value. The identity publisher hash of the uploaded app package. This is the hash of the publisher from the manifest. For example: &apos;AB82CD0XYZ&apos;.
     * @param value Value to set for the identityPublisherHash property.
     */
    public void setIdentityPublisherHash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityPublisherHash", value);
    }
    /**
     * Sets the identityResourceIdentifier property value. The identity resource identifier of the uploaded app package. For example: &apos;TestResourceId&apos;.
     * @param value Value to set for the identityResourceIdentifier property.
     */
    public void setIdentityResourceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityResourceIdentifier", value);
    }
    /**
     * Sets the identityVersion property value. The identity version of the uploaded app package. For example: &apos;1.0.0.0&apos;.
     * @param value Value to set for the identityVersion property.
     */
    public void setIdentityVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityVersion", value);
    }
    /**
     * Sets the isBundle property value. When TRUE, indicates that the app is a bundle. When FALSE, indicates that the app is not a bundle. By default, property is set to FALSE.
     * @param value Value to set for the isBundle property.
     */
    public void setIsBundle(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBundle", value);
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     */
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this.backingStore.set("minimumSupportedOperatingSystem", value);
    }
}
