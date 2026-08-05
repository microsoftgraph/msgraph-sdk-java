package com.microsoft.graph.models.customdataprovidedresourcepayloads;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewContextDataBase extends Data implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewContextDataBase} and sets the default values.
     */
    public AccessReviewContextDataBase() {
        super();
        this.setOdataType("#microsoft.graph.customDataProvidedResourcePayloads.accessReviewContextDataBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewContextDataBase}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewContextDataBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.customDataProvidedResourcePayloads.accessReviewContextData": return new AccessReviewContextData();
                case "#microsoft.graph.customDataProvidedResourcePayloads.applyDecisionContextData": return new ApplyDecisionContextData();
            }
        }
        return new AccessReviewContextDataBase();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("reviewDefinitionId", (n) -> { this.setReviewDefinitionId(n.getStringValue()); });
        deserializerMap.put("reviewInstanceId", (n) -> { this.setReviewInstanceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reviewDefinitionId property value. The unique identifier of the access review definition that this data is associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReviewDefinitionId() {
        return this.backingStore.get("reviewDefinitionId");
    }
    /**
     * Gets the reviewInstanceId property value. The unique identifier of the access review instance that this data is associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReviewInstanceId() {
        return this.backingStore.get("reviewInstanceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("reviewDefinitionId", this.getReviewDefinitionId());
        writer.writeStringValue("reviewInstanceId", this.getReviewInstanceId());
    }
    /**
     * Sets the reviewDefinitionId property value. The unique identifier of the access review definition that this data is associated with.
     * @param value Value to set for the reviewDefinitionId property.
     */
    public void setReviewDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reviewDefinitionId", value);
    }
    /**
     * Sets the reviewInstanceId property value. The unique identifier of the access review instance that this data is associated with.
     * @param value Value to set for the reviewInstanceId property.
     */
    public void setReviewInstanceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reviewInstanceId", value);
    }
}
