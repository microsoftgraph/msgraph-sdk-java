package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InferenceClassification extends Entity implements Parsable {
    /**
     * A set of overrides for a user to always classify messages from specific senders in certain ways: focused, or other. Read-only. Nullable.
     */
    private java.util.List<InferenceClassificationOverride> overrides;
    /**
     * Instantiates a new inferenceClassification and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public InferenceClassification() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a inferenceClassification
     */
    @jakarta.annotation.Nonnull
    public static InferenceClassification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InferenceClassification();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("overrides", (n) -> { this.setOverrides(n.getCollectionOfObjectValues(InferenceClassificationOverride::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the overrides property value. A set of overrides for a user to always classify messages from specific senders in certain ways: focused, or other. Read-only. Nullable.
     * @return a inferenceClassificationOverride
     */
    @jakarta.annotation.Nullable
    public java.util.List<InferenceClassificationOverride> getOverrides() {
        return this.overrides;
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
        writer.writeCollectionOfObjectValues("overrides", this.getOverrides());
    }
    /**
     * Sets the overrides property value. A set of overrides for a user to always classify messages from specific senders in certain ways: focused, or other. Read-only. Nullable.
     * @param value Value to set for the overrides property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOverrides(@jakarta.annotation.Nullable final java.util.List<InferenceClassificationOverride> value) {
        this.overrides = value;
    }
}
