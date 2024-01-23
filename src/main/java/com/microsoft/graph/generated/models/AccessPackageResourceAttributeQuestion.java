package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageResourceAttributeQuestion extends AccessPackageResourceAttributeSource implements Parsable {
    /**
     * Instantiates a new AccessPackageResourceAttributeQuestion and sets the default values.
     */
    public AccessPackageResourceAttributeQuestion() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageResourceAttributeQuestion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageResourceAttributeQuestion
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceAttributeQuestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceAttributeQuestion();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("question", (n) -> { this.setQuestion(n.getObjectValue(AccessPackageQuestion::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the question property value. The question property
     * @return a AccessPackageQuestion
     */
    @jakarta.annotation.Nullable
    public AccessPackageQuestion getQuestion() {
        return this.backingStore.get("question");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("question", this.getQuestion());
    }
    /**
     * Sets the question property value. The question property
     * @param value Value to set for the question property.
     */
    public void setQuestion(@jakarta.annotation.Nullable final AccessPackageQuestion value) {
        this.backingStore.set("question", value);
    }
}
