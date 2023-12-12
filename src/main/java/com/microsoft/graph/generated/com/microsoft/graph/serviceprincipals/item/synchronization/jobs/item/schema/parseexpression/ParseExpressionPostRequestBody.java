package com.microsoft.graph.serviceprincipals.item.synchronization.jobs.item.schema.parseexpression;

import com.microsoft.graph.models.AttributeDefinition;
import com.microsoft.graph.models.ExpressionInputObject;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ParseExpressionPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ParseExpressionPostRequestBody and sets the default values.
     */
    public ParseExpressionPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ParseExpressionPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ParseExpressionPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParseExpressionPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the expression property value. The expression property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExpression() {
        return this.backingStore.get("expression");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("expression", (n) -> { this.setExpression(n.getStringValue()); });
        deserializerMap.put("targetAttributeDefinition", (n) -> { this.setTargetAttributeDefinition(n.getObjectValue(AttributeDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("testInputObject", (n) -> { this.setTestInputObject(n.getObjectValue(ExpressionInputObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the targetAttributeDefinition property value. The targetAttributeDefinition property
     * @return a AttributeDefinition
     */
    @jakarta.annotation.Nullable
    public AttributeDefinition getTargetAttributeDefinition() {
        return this.backingStore.get("targetAttributeDefinition");
    }
    /**
     * Gets the testInputObject property value. The testInputObject property
     * @return a ExpressionInputObject
     */
    @jakarta.annotation.Nullable
    public ExpressionInputObject getTestInputObject() {
        return this.backingStore.get("testInputObject");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expression", this.getExpression());
        writer.writeObjectValue("targetAttributeDefinition", this.getTargetAttributeDefinition());
        writer.writeObjectValue("testInputObject", this.getTestInputObject());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the expression property value. The expression property
     * @param value Value to set for the expression property.
     */
    public void setExpression(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("expression", value);
    }
    /**
     * Sets the targetAttributeDefinition property value. The targetAttributeDefinition property
     * @param value Value to set for the targetAttributeDefinition property.
     */
    public void setTargetAttributeDefinition(@jakarta.annotation.Nullable final AttributeDefinition value) {
        this.backingStore.set("targetAttributeDefinition", value);
    }
    /**
     * Sets the testInputObject property value. The testInputObject property
     * @param value Value to set for the testInputObject property.
     */
    public void setTestInputObject(@jakarta.annotation.Nullable final ExpressionInputObject value) {
        this.backingStore.set("testInputObject", value);
    }
}
