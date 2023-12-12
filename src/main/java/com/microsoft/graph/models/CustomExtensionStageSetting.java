package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomExtensionStageSetting extends Entity implements Parsable {
    /**
     * Instantiates a new CustomExtensionStageSetting and sets the default values.
     */
    public CustomExtensionStageSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CustomExtensionStageSetting
     */
    @jakarta.annotation.Nonnull
    public static CustomExtensionStageSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomExtensionStageSetting();
    }
    /**
     * Gets the customExtension property value. Indicates the custom workflow extension that will be executed at this stage. Nullable. Supports $expand.
     * @return a CustomCalloutExtension
     */
    @jakarta.annotation.Nullable
    public CustomCalloutExtension getCustomExtension() {
        return this.backingStore.get("customExtension");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customExtension", (n) -> { this.setCustomExtension(n.getObjectValue(CustomCalloutExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("stage", (n) -> { this.setStage(n.getEnumValue(AccessPackageCustomExtensionStage::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the stage property value. The stage property
     * @return a AccessPackageCustomExtensionStage
     */
    @jakarta.annotation.Nullable
    public AccessPackageCustomExtensionStage getStage() {
        return this.backingStore.get("stage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("customExtension", this.getCustomExtension());
        writer.writeEnumValue("stage", this.getStage());
    }
    /**
     * Sets the customExtension property value. Indicates the custom workflow extension that will be executed at this stage. Nullable. Supports $expand.
     * @param value Value to set for the customExtension property.
     */
    public void setCustomExtension(@jakarta.annotation.Nullable final CustomCalloutExtension value) {
        this.backingStore.set("customExtension", value);
    }
    /**
     * Sets the stage property value. The stage property
     * @param value Value to set for the stage property.
     */
    public void setStage(@jakarta.annotation.Nullable final AccessPackageCustomExtensionStage value) {
        this.backingStore.set("stage", value);
    }
}
