package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewInstanceDecisionItemCustomDataProvidedResource extends AccessReviewInstanceDecisionItemResource implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewInstanceDecisionItemCustomDataProvidedResource} and sets the default values.
     */
    public AccessReviewInstanceDecisionItemCustomDataProvidedResource() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewInstanceDecisionItemCustomDataProvidedResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewInstanceDecisionItemCustomDataProvidedResource}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewInstanceDecisionItemCustomDataProvidedResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItemCustomDataProvidedResource();
    }
    /**
     * Gets the customData property value. The customData property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomData() {
        return this.backingStore.get("customData");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customData", (n) -> { this.setCustomData(n.getStringValue()); });
        deserializerMap.put("scopeDisplayName", (n) -> { this.setScopeDisplayName(n.getStringValue()); });
        deserializerMap.put("scopeId", (n) -> { this.setScopeId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the scopeDisplayName property value. The scopeDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScopeDisplayName() {
        return this.backingStore.get("scopeDisplayName");
    }
    /**
     * Gets the scopeId property value. The scopeId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScopeId() {
        return this.backingStore.get("scopeId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("customData", this.getCustomData());
        writer.writeStringValue("scopeDisplayName", this.getScopeDisplayName());
        writer.writeStringValue("scopeId", this.getScopeId());
    }
    /**
     * Sets the customData property value. The customData property
     * @param value Value to set for the customData property.
     */
    public void setCustomData(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customData", value);
    }
    /**
     * Sets the scopeDisplayName property value. The scopeDisplayName property
     * @param value Value to set for the scopeDisplayName property.
     */
    public void setScopeDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scopeDisplayName", value);
    }
    /**
     * Sets the scopeId property value. The scopeId property
     * @param value Value to set for the scopeId property.
     */
    public void setScopeId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scopeId", value);
    }
}
