package com.microsoft.graph.models;

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
public class ProcessContentResponse implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ProcessContentResponse} and sets the default values.
     */
    public ProcessContentResponse() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProcessContentResponse}
     */
    @jakarta.annotation.Nonnull
    public static ProcessContentResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProcessContentResponse();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyActions", (n) -> { this.setPolicyActions(n.getCollectionOfObjectValues(DlpActionInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("processingErrors", (n) -> { this.setProcessingErrors(n.getCollectionOfObjectValues(ProcessingError::createFromDiscriminatorValue)); });
        deserializerMap.put("protectionScopeState", (n) -> { this.setProtectionScopeState(n.getEnumValue(ProtectionScopeState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the policyActions property value. A collection of policy actions (like DLP actions) triggered by the processed content. NOTE: Currently, the only policy action supported in for this resource type is restrictAccess.
     * @return a {@link java.util.List<DlpActionInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DlpActionInfo> getPolicyActions() {
        return this.backingStore.get("policyActions");
    }
    /**
     * Gets the processingErrors property value. A collection of errors encountered during the content processing.
     * @return a {@link java.util.List<ProcessingError>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProcessingError> getProcessingErrors() {
        return this.backingStore.get("processingErrors");
    }
    /**
     * Gets the protectionScopeState property value. The protectionScopeState property
     * @return a {@link ProtectionScopeState}
     */
    @jakarta.annotation.Nullable
    public ProtectionScopeState getProtectionScopeState() {
        return this.backingStore.get("protectionScopeState");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("policyActions", this.getPolicyActions());
        writer.writeCollectionOfObjectValues("processingErrors", this.getProcessingErrors());
        writer.writeEnumValue("protectionScopeState", this.getProtectionScopeState());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyActions property value. A collection of policy actions (like DLP actions) triggered by the processed content. NOTE: Currently, the only policy action supported in for this resource type is restrictAccess.
     * @param value Value to set for the policyActions property.
     */
    public void setPolicyActions(@jakarta.annotation.Nullable final java.util.List<DlpActionInfo> value) {
        this.backingStore.set("policyActions", value);
    }
    /**
     * Sets the processingErrors property value. A collection of errors encountered during the content processing.
     * @param value Value to set for the processingErrors property.
     */
    public void setProcessingErrors(@jakarta.annotation.Nullable final java.util.List<ProcessingError> value) {
        this.backingStore.set("processingErrors", value);
    }
    /**
     * Sets the protectionScopeState property value. The protectionScopeState property
     * @param value Value to set for the protectionScopeState property.
     */
    public void setProtectionScopeState(@jakarta.annotation.Nullable final ProtectionScopeState value) {
        this.backingStore.set("protectionScopeState", value);
    }
}
