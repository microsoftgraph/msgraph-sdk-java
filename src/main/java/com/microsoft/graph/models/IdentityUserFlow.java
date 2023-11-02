package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityUserFlow extends Entity implements Parsable {
    /**
     * Instantiates a new IdentityUserFlow and sets the default values.
     */
    public IdentityUserFlow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentityUserFlow
     */
    @jakarta.annotation.Nonnull
    public static IdentityUserFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.b2xIdentityUserFlow": return new B2xIdentityUserFlow();
            }
        }
        return new IdentityUserFlow();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userFlowType", (n) -> { this.setUserFlowType(n.getEnumValue(UserFlowType.class)); });
        deserializerMap.put("userFlowTypeVersion", (n) -> { this.setUserFlowTypeVersion(n.getFloatValue()); });
        return deserializerMap;
    }
    /**
     * Gets the userFlowType property value. The userFlowType property
     * @return a UserFlowType
     */
    @jakarta.annotation.Nullable
    public UserFlowType getUserFlowType() {
        return this.getBackingStore().get("userFlowType");
    }
    /**
     * Gets the userFlowTypeVersion property value. The userFlowTypeVersion property
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getUserFlowTypeVersion() {
        return this.getBackingStore().get("userFlowTypeVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("userFlowType", this.getUserFlowType());
        writer.writeFloatValue("userFlowTypeVersion", this.getUserFlowTypeVersion());
    }
    /**
     * Sets the userFlowType property value. The userFlowType property
     * @param value Value to set for the userFlowType property.
     */
    public void setUserFlowType(@jakarta.annotation.Nullable final UserFlowType value) {
        this.getBackingStore().set("userFlowType", value);
    }
    /**
     * Sets the userFlowTypeVersion property value. The userFlowTypeVersion property
     * @param value Value to set for the userFlowTypeVersion property.
     */
    public void setUserFlowTypeVersion(@jakarta.annotation.Nullable final Float value) {
        this.getBackingStore().set("userFlowTypeVersion", value);
    }
}
