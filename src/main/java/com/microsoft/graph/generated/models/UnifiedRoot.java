package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UnifiedRoot} and sets the default values.
     */
    public UnifiedRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedRoot}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoot();
    }
    /**
     * Gets the decisions property value. Represents the unified (vNext) access review decisions on an instance of a review.
     * @return a {@link java.util.List<AccessReviewInstanceDecisionItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewInstanceDecisionItem> getDecisions() {
        return this.backingStore.get("decisions");
    }
    /**
     * Gets the definitions property value. Represents the unified (vNext) template and scheduling for an access review.
     * @return a {@link java.util.List<AccessReviewScheduleDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewScheduleDefinition> getDefinitions() {
        return this.backingStore.get("definitions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("decisions", (n) -> { this.setDecisions(n.getCollectionOfObjectValues(AccessReviewInstanceDecisionItem::createFromDiscriminatorValue)); });
        deserializerMap.put("definitions", (n) -> { this.setDefinitions(n.getCollectionOfObjectValues(AccessReviewScheduleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("instances", (n) -> { this.setInstances(n.getCollectionOfObjectValues(AccessReviewInstance::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the instances property value. Represents the unified (vNext) instance of a review.
     * @return a {@link java.util.List<AccessReviewInstance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewInstance> getInstances() {
        return this.backingStore.get("instances");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("decisions", this.getDecisions());
        writer.writeCollectionOfObjectValues("definitions", this.getDefinitions());
        writer.writeCollectionOfObjectValues("instances", this.getInstances());
    }
    /**
     * Sets the decisions property value. Represents the unified (vNext) access review decisions on an instance of a review.
     * @param value Value to set for the decisions property.
     */
    public void setDecisions(@jakarta.annotation.Nullable final java.util.List<AccessReviewInstanceDecisionItem> value) {
        this.backingStore.set("decisions", value);
    }
    /**
     * Sets the definitions property value. Represents the unified (vNext) template and scheduling for an access review.
     * @param value Value to set for the definitions property.
     */
    public void setDefinitions(@jakarta.annotation.Nullable final java.util.List<AccessReviewScheduleDefinition> value) {
        this.backingStore.set("definitions", value);
    }
    /**
     * Sets the instances property value. Represents the unified (vNext) instance of a review.
     * @param value Value to set for the instances property.
     */
    public void setInstances(@jakarta.annotation.Nullable final java.util.List<AccessReviewInstance> value) {
        this.backingStore.set("instances", value);
    }
}
