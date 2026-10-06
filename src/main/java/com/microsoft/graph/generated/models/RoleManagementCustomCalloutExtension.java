package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleManagementCustomCalloutExtension extends CustomCalloutExtension implements Parsable {
    /**
     * Instantiates a new {@link RoleManagementCustomCalloutExtension} and sets the default values.
     */
    public RoleManagementCustomCalloutExtension() {
        super();
        this.setOdataType("#microsoft.graph.roleManagementCustomCalloutExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RoleManagementCustomCalloutExtension}
     */
    @jakarta.annotation.Nonnull
    public static RoleManagementCustomCalloutExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleManagementCustomCalloutExtension();
    }
    /**
     * Gets the customAttributes property value. The customAttributes property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCustomAttributes() {
        return this.backingStore.get("customAttributes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customAttributes", (n) -> { this.setCustomAttributes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getEnumValue(CustomExtensionResourceType::forValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(CustomCalloutExtensionType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceType property value. The resourceType property
     * @return a {@link CustomExtensionResourceType}
     */
    @jakarta.annotation.Nullable
    public CustomExtensionResourceType getResourceType() {
        return this.backingStore.get("resourceType");
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link CustomCalloutExtensionType}
     */
    @jakarta.annotation.Nullable
    public CustomCalloutExtensionType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("customAttributes", this.getCustomAttributes());
        writer.writeEnumValue("resourceType", this.getResourceType());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the customAttributes property value. The customAttributes property
     * @param value Value to set for the customAttributes property.
     */
    public void setCustomAttributes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("customAttributes", value);
    }
    /**
     * Sets the resourceType property value. The resourceType property
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final CustomExtensionResourceType value) {
        this.backingStore.set("resourceType", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final CustomCalloutExtensionType value) {
        this.backingStore.set("type", value);
    }
}
