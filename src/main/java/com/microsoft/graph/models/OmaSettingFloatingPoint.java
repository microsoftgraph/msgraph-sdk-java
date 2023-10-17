package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OMA Settings Floating Point definition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OmaSettingFloatingPoint extends OmaSetting implements Parsable {
    /**
     * Value.
     */
    private Float value;
    /**
     * Instantiates a new OmaSettingFloatingPoint and sets the default values.
     */
    public OmaSettingFloatingPoint() {
        super();
        this.setOdataType("#microsoft.graph.omaSettingFloatingPoint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OmaSettingFloatingPoint
     */
    @jakarta.annotation.Nonnull
    public static OmaSettingFloatingPoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OmaSettingFloatingPoint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getFloatValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. Value.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeFloatValue("value", this.getValue());
    }
    /**
     * Sets the value property value. Value.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Float value) {
        this.value = value;
    }
}
