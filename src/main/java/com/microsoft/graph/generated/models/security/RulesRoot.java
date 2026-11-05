package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RulesRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RulesRoot} and sets the default values.
     */
    public RulesRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RulesRoot}
     */
    @jakarta.annotation.Nonnull
    public static RulesRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RulesRoot();
    }
    /**
     * Gets the detectionRules property value. The custom detection rules configured for the tenant.
     * @return a {@link java.util.List<DetectionRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DetectionRule> getDetectionRules() {
        return this.backingStore.get("detectionRules");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detectionRules", (n) -> { this.setDetectionRules(n.getCollectionOfObjectValues(DetectionRule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("detectionRules", this.getDetectionRules());
    }
    /**
     * Sets the detectionRules property value. The custom detection rules configured for the tenant.
     * @param value Value to set for the detectionRules property.
     */
    public void setDetectionRules(@jakarta.annotation.Nullable final java.util.List<DetectionRule> value) {
        this.backingStore.set("detectionRules", value);
    }
}
