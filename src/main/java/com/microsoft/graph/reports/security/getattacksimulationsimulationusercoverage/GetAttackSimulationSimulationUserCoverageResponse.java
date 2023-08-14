package com.microsoft.graph.reports.security.getattacksimulationsimulationusercoverage;

import com.microsoft.graph.models.AttackSimulationSimulationUserCoverage;
import com.microsoft.graph.models.BaseCollectionPaginationCountResponse;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GetAttackSimulationSimulationUserCoverageResponse extends BaseCollectionPaginationCountResponse implements Parsable {
    /**
     * The value property
     */
    private java.util.List<AttackSimulationSimulationUserCoverage> value;
    /**
     * Instantiates a new getAttackSimulationSimulationUserCoverageResponse and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public GetAttackSimulationSimulationUserCoverageResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getAttackSimulationSimulationUserCoverageResponse
     */
    @jakarta.annotation.Nonnull
    public static GetAttackSimulationSimulationUserCoverageResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetAttackSimulationSimulationUserCoverageResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(AttackSimulationSimulationUserCoverage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a attackSimulationSimulationUserCoverage
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttackSimulationSimulationUserCoverage> getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValue(@jakarta.annotation.Nullable final java.util.List<AttackSimulationSimulationUserCoverage> value) {
        this.value = value;
    }
}
