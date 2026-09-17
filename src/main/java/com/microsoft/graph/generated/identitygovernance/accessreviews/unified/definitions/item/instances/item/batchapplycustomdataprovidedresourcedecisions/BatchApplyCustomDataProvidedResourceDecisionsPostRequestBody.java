package com.microsoft.graph.identitygovernance.accessreviews.unified.definitions.item.instances.item.batchapplycustomdataprovidedresourcedecisions;

import com.microsoft.graph.models.AccessReviewInstanceDecisionItemApplyResult;
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
public class BatchApplyCustomDataProvidedResourceDecisionsPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link BatchApplyCustomDataProvidedResourceDecisionsPostRequestBody} and sets the default values.
     */
    public BatchApplyCustomDataProvidedResourceDecisionsPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BatchApplyCustomDataProvidedResourceDecisionsPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static BatchApplyCustomDataProvidedResourceDecisionsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BatchApplyCustomDataProvidedResourceDecisionsPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the applyDescription property value. The applyDescription property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplyDescription() {
        return this.backingStore.get("applyDescription");
    }
    /**
     * Gets the applyResult property value. The applyResult property
     * @return a {@link AccessReviewInstanceDecisionItemApplyResult}
     */
    @jakarta.annotation.Nullable
    public AccessReviewInstanceDecisionItemApplyResult getApplyResult() {
        return this.backingStore.get("applyResult");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the customDataProvidedResourceId property value. The customDataProvidedResourceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomDataProvidedResourceId() {
        return this.backingStore.get("customDataProvidedResourceId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("applyDescription", (n) -> { this.setApplyDescription(n.getStringValue()); });
        deserializerMap.put("applyResult", (n) -> { this.setApplyResult(n.getEnumValue(AccessReviewInstanceDecisionItemApplyResult::forValue)); });
        deserializerMap.put("customDataProvidedResourceId", (n) -> { this.setCustomDataProvidedResourceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applyDescription", this.getApplyDescription());
        writer.writeEnumValue("applyResult", this.getApplyResult());
        writer.writeStringValue("customDataProvidedResourceId", this.getCustomDataProvidedResourceId());
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
     * Sets the applyDescription property value. The applyDescription property
     * @param value Value to set for the applyDescription property.
     */
    public void setApplyDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applyDescription", value);
    }
    /**
     * Sets the applyResult property value. The applyResult property
     * @param value Value to set for the applyResult property.
     */
    public void setApplyResult(@jakarta.annotation.Nullable final AccessReviewInstanceDecisionItemApplyResult value) {
        this.backingStore.set("applyResult", value);
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
     * Sets the customDataProvidedResourceId property value. The customDataProvidedResourceId property
     * @param value Value to set for the customDataProvidedResourceId property.
     */
    public void setCustomDataProvidedResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customDataProvidedResourceId", value);
    }
}
