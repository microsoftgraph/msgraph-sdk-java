package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InferenceClassificationOverride extends Entity implements Parsable {
    /**
     * Instantiates a new InferenceClassificationOverride and sets the default values.
     */
    public InferenceClassificationOverride() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InferenceClassificationOverride
     */
    @jakarta.annotation.Nonnull
    public static InferenceClassificationOverride createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InferenceClassificationOverride();
    }
    /**
     * Gets the classifyAs property value. Specifies how incoming messages from a specific sender should always be classified as. The possible values are: focused, other.
     * @return a InferenceClassificationType
     */
    @jakarta.annotation.Nullable
    public InferenceClassificationType getClassifyAs() {
        return this.backingStore.get("classifyAs");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classifyAs", (n) -> { this.setClassifyAs(n.getEnumValue(InferenceClassificationType.class)); });
        deserializerMap.put("senderEmailAddress", (n) -> { this.setSenderEmailAddress(n.getObjectValue(EmailAddress::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the senderEmailAddress property value. The email address information of the sender for whom the override is created.
     * @return a EmailAddress
     */
    @jakarta.annotation.Nullable
    public EmailAddress getSenderEmailAddress() {
        return this.backingStore.get("senderEmailAddress");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("classifyAs", this.getClassifyAs());
        writer.writeObjectValue("senderEmailAddress", this.getSenderEmailAddress());
    }
    /**
     * Sets the classifyAs property value. Specifies how incoming messages from a specific sender should always be classified as. The possible values are: focused, other.
     * @param value Value to set for the classifyAs property.
     */
    public void setClassifyAs(@jakarta.annotation.Nullable final InferenceClassificationType value) {
        this.backingStore.set("classifyAs", value);
    }
    /**
     * Sets the senderEmailAddress property value. The email address information of the sender for whom the override is created.
     * @param value Value to set for the senderEmailAddress property.
     */
    public void setSenderEmailAddress(@jakarta.annotation.Nullable final EmailAddress value) {
        this.backingStore.set("senderEmailAddress", value);
    }
}
