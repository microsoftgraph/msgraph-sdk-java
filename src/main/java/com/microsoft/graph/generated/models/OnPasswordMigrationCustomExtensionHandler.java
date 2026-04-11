package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPasswordMigrationCustomExtensionHandler extends OnPasswordSubmitHandler implements Parsable {
    /**
     * Instantiates a new {@link OnPasswordMigrationCustomExtensionHandler} and sets the default values.
     */
    public OnPasswordMigrationCustomExtensionHandler() {
        super();
        this.setOdataType("#microsoft.graph.onPasswordMigrationCustomExtensionHandler");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnPasswordMigrationCustomExtensionHandler}
     */
    @jakarta.annotation.Nonnull
    public static OnPasswordMigrationCustomExtensionHandler createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPasswordMigrationCustomExtensionHandler();
    }
    /**
     * Gets the configuration property value. Configuration that overrides the default settings from the referenced custom extension, such as timeout and retry values. Optional.
     * @return a {@link CustomExtensionOverwriteConfiguration}
     */
    @jakarta.annotation.Nullable
    public CustomExtensionOverwriteConfiguration getConfiguration() {
        return this.backingStore.get("configuration");
    }
    /**
     * Gets the customExtension property value. The customExtension property
     * @return a {@link OnPasswordSubmitCustomExtension}
     */
    @jakarta.annotation.Nullable
    public OnPasswordSubmitCustomExtension getCustomExtension() {
        return this.backingStore.get("customExtension");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(CustomExtensionOverwriteConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("customExtension", (n) -> { this.setCustomExtension(n.getObjectValue(OnPasswordSubmitCustomExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("migrationPropertyId", (n) -> { this.setMigrationPropertyId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the migrationPropertyId property value. The name of the custom extension attribute that indicates whether a user requires migration. This property must reference a valid custom attribute on the user object (for example, extension&lt;appId&gt;requiresMigration). Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMigrationPropertyId() {
        return this.backingStore.get("migrationPropertyId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeObjectValue("customExtension", this.getCustomExtension());
        writer.writeStringValue("migrationPropertyId", this.getMigrationPropertyId());
    }
    /**
     * Sets the configuration property value. Configuration that overrides the default settings from the referenced custom extension, such as timeout and retry values. Optional.
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final CustomExtensionOverwriteConfiguration value) {
        this.backingStore.set("configuration", value);
    }
    /**
     * Sets the customExtension property value. The customExtension property
     * @param value Value to set for the customExtension property.
     */
    public void setCustomExtension(@jakarta.annotation.Nullable final OnPasswordSubmitCustomExtension value) {
        this.backingStore.set("customExtension", value);
    }
    /**
     * Sets the migrationPropertyId property value. The name of the custom extension attribute that indicates whether a user requires migration. This property must reference a valid custom attribute on the user object (for example, extension&lt;appId&gt;requiresMigration). Required.
     * @param value Value to set for the migrationPropertyId property.
     */
    public void setMigrationPropertyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("migrationPropertyId", value);
    }
}
