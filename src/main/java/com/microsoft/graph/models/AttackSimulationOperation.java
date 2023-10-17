package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttackSimulationOperation extends LongRunningOperation implements Parsable {
    /**
     * The percentageCompleted property
     */
    private Integer percentageCompleted;
    /**
     * The tenantId property
     */
    private String tenantId;
    /**
     * The type property
     */
    private AttackSimulationOperationType type;
    /**
     * Instantiates a new AttackSimulationOperation and sets the default values.
     */
    public AttackSimulationOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttackSimulationOperation
     */
    @jakarta.annotation.Nonnull
    public static AttackSimulationOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("percentageCompleted", (n) -> { this.setPercentageCompleted(n.getIntegerValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(AttackSimulationOperationType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the percentageCompleted property value. The percentageCompleted property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPercentageCompleted() {
        return this.percentageCompleted;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the type property value. The type property
     * @return a AttackSimulationOperationType
     */
    @jakarta.annotation.Nullable
    public AttackSimulationOperationType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("percentageCompleted", this.getPercentageCompleted());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the percentageCompleted property value. The percentageCompleted property
     * @param value Value to set for the percentageCompleted property.
     */
    public void setPercentageCompleted(@jakarta.annotation.Nullable final Integer value) {
        this.percentageCompleted = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final AttackSimulationOperationType value) {
        this.type = value;
    }
}
