package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomSecurityAttributeExemption extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CustomSecurityAttributeExemption} and sets the default values.
     */
    public CustomSecurityAttributeExemption() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomSecurityAttributeExemption}
     */
    @jakarta.annotation.Nonnull
    public static CustomSecurityAttributeExemption createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.customSecurityAttributeStringValueExemption": return new CustomSecurityAttributeStringValueExemption();
            }
        }
        return new CustomSecurityAttributeExemption();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getEnumValue(CustomSecurityAttributeComparisonOperator::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the operator property value. The operator property
     * @return a {@link CustomSecurityAttributeComparisonOperator}
     */
    @jakarta.annotation.Nullable
    public CustomSecurityAttributeComparisonOperator getOperator() {
        return this.backingStore.get("operator");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("operator", this.getOperator());
    }
    /**
     * Sets the operator property value. The operator property
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final CustomSecurityAttributeComparisonOperator value) {
        this.backingStore.set("operator", value);
    }
}
