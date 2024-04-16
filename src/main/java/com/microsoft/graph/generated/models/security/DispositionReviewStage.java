package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DispositionReviewStage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DispositionReviewStage} and sets the default values.
     */
    public DispositionReviewStage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DispositionReviewStage}
     */
    @jakarta.annotation.Nonnull
    public static DispositionReviewStage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DispositionReviewStage();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("reviewersEmailAddresses", (n) -> { this.setReviewersEmailAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("stageNumber", (n) -> { this.setStageNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name representing each stage within a collection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the reviewersEmailAddresses property value. A collection of reviewers at each stage.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getReviewersEmailAddresses() {
        return this.backingStore.get("reviewersEmailAddresses");
    }
    /**
     * Gets the stageNumber property value. The sequence number for each stage of the disposition review.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStageNumber() {
        return this.backingStore.get("stageNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("reviewersEmailAddresses", this.getReviewersEmailAddresses());
        writer.writeStringValue("stageNumber", this.getStageNumber());
    }
    /**
     * Sets the name property value. Name representing each stage within a collection.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the reviewersEmailAddresses property value. A collection of reviewers at each stage.
     * @param value Value to set for the reviewersEmailAddresses property.
     */
    public void setReviewersEmailAddresses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("reviewersEmailAddresses", value);
    }
    /**
     * Sets the stageNumber property value. The sequence number for each stage of the disposition review.
     * @param value Value to set for the stageNumber property.
     */
    public void setStageNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("stageNumber", value);
    }
}
