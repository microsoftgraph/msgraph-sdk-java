package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OMA Settings Boolean definition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OmaSettingBoolean extends OmaSetting implements Parsable {
    /**
     * Value.
     */
    private Boolean value;
    /**
     * Instantiates a new OmaSettingBoolean and sets the default values.
     */
    public OmaSettingBoolean() {
        super();
        this.setOdataType("#microsoft.graph.omaSettingBoolean");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OmaSettingBoolean
     */
    @jakarta.annotation.Nonnull
    public static OmaSettingBoolean createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OmaSettingBoolean();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. Value.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("value", this.getValue());
    }
    /**
     * Sets the value property value. Value.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Boolean value) {
        this.value = value;
    }
}
