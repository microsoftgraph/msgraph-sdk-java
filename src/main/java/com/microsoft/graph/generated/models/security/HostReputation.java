package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostReputation extends Entity implements Parsable {
    /**
     * Instantiates a new HostReputation and sets the default values.
     */
    public HostReputation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HostReputation
     */
    @jakarta.annotation.Nonnull
    public static HostReputation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostReputation();
    }
    /**
     * Gets the classification property value. The classification property
     * @return a HostReputationClassification
     */
    @jakarta.annotation.Nullable
    public HostReputationClassification getClassification() {
        return this.backingStore.get("classification");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getEnumValue(HostReputationClassification::forValue)); });
        deserializerMap.put("rules", (n) -> { this.setRules(n.getCollectionOfObjectValues(HostReputationRule::createFromDiscriminatorValue)); });
        deserializerMap.put("score", (n) -> { this.setScore(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the rules property value. A collection of rules that have been used to calculate the classification and score.
     * @return a java.util.List<HostReputationRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostReputationRule> getRules() {
        return this.backingStore.get("rules");
    }
    /**
     * Gets the score property value. The calculated score (0-100) of the requested host. A higher value indicates that this host is more likely to be suspicious or malicious.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getScore() {
        return this.backingStore.get("score");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeCollectionOfObjectValues("rules", this.getRules());
        writer.writeIntegerValue("score", this.getScore());
    }
    /**
     * Sets the classification property value. The classification property
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final HostReputationClassification value) {
        this.backingStore.set("classification", value);
    }
    /**
     * Sets the rules property value. A collection of rules that have been used to calculate the classification and score.
     * @param value Value to set for the rules property.
     */
    public void setRules(@jakarta.annotation.Nullable final java.util.List<HostReputationRule> value) {
        this.backingStore.set("rules", value);
    }
    /**
     * Sets the score property value. The calculated score (0-100) of the requested host. A higher value indicates that this host is more likely to be suspicious or malicious.
     * @param value Value to set for the score property.
     */
    public void setScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("score", value);
    }
}
