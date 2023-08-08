package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomExtensionStageSetting extends Entity implements Parsable {
    /**
     * Indicates the custom workflow extension that will be executed at this stage. Nullable. Supports $expand.
     */
    private CustomCalloutExtension customExtension;
    /**
     * The stage property
     */
    private AccessPackageCustomExtensionStage stage;
    /**
     * Instantiates a new customExtensionStageSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustomExtensionStageSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customExtensionStageSetting
     */
    @javax.annotation.Nonnull
    public static CustomExtensionStageSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomExtensionStageSetting();
    }
    /**
     * Gets the customExtension property value. Indicates the custom workflow extension that will be executed at this stage. Nullable. Supports $expand.
     * @return a customCalloutExtension
     */
    @javax.annotation.Nullable
    public CustomCalloutExtension getCustomExtension() {
        return this.customExtension;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customExtension", (n) -> { this.setCustomExtension(n.getObjectValue(CustomCalloutExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("stage", (n) -> { this.setStage(n.getEnumValue(AccessPackageCustomExtensionStage.class)); });
        return deserializerMap;
    }
    /**
     * Gets the stage property value. The stage property
     * @return a accessPackageCustomExtensionStage
     */
    @javax.annotation.Nullable
    public AccessPackageCustomExtensionStage getStage() {
        return this.stage;
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
        writer.writeObjectValue("customExtension", this.getCustomExtension());
        writer.writeEnumValue("stage", this.getStage());
    }
    /**
     * Sets the customExtension property value. Indicates the custom workflow extension that will be executed at this stage. Nullable. Supports $expand.
     * @param value Value to set for the customExtension property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomExtension(@javax.annotation.Nullable final CustomCalloutExtension value) {
        this.customExtension = value;
    }
    /**
     * Sets the stage property value. The stage property
     * @param value Value to set for the stage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStage(@javax.annotation.Nullable final AccessPackageCustomExtensionStage value) {
        this.stage = value;
    }
}
