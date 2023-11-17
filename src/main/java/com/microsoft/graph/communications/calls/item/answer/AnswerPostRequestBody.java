package com.microsoft.graph.communications.calls.item.answer;

import com.microsoft.graph.models.IncomingCallOptions;
import com.microsoft.graph.models.MediaConfig;
import com.microsoft.graph.models.Modality;
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
public class AnswerPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AnswerPostRequestBody and sets the default values.
     */
    public AnswerPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AnswerPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AnswerPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnswerPostRequestBody();
    }
    /**
     * Gets the acceptedModalities property value. The acceptedModalities property
     * @return a java.util.List<Modality>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Modality> getAcceptedModalities() {
        return this.backingStore.get("acceptedModalities");
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
     * Gets the callbackUri property value. The callbackUri property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCallbackUri() {
        return this.backingStore.get("callbackUri");
    }
    /**
     * Gets the callOptions property value. The callOptions property
     * @return a IncomingCallOptions
     */
    @jakarta.annotation.Nullable
    public IncomingCallOptions getCallOptions() {
        return this.backingStore.get("callOptions");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("acceptedModalities", (n) -> { this.setAcceptedModalities(n.getCollectionOfEnumValues(Modality.class)); });
        deserializerMap.put("callbackUri", (n) -> { this.setCallbackUri(n.getStringValue()); });
        deserializerMap.put("callOptions", (n) -> { this.setCallOptions(n.getObjectValue(IncomingCallOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaConfig", (n) -> { this.setMediaConfig(n.getObjectValue(MediaConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("participantCapacity", (n) -> { this.setParticipantCapacity(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mediaConfig property value. The mediaConfig property
     * @return a MediaConfig
     */
    @jakarta.annotation.Nullable
    public MediaConfig getMediaConfig() {
        return this.backingStore.get("mediaConfig");
    }
    /**
     * Gets the participantCapacity property value. The participantCapacity property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getParticipantCapacity() {
        return this.backingStore.get("participantCapacity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("acceptedModalities", this.getAcceptedModalities());
        writer.writeStringValue("callbackUri", this.getCallbackUri());
        writer.writeObjectValue("callOptions", this.getCallOptions());
        writer.writeObjectValue("mediaConfig", this.getMediaConfig());
        writer.writeIntegerValue("participantCapacity", this.getParticipantCapacity());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acceptedModalities property value. The acceptedModalities property
     * @param value Value to set for the acceptedModalities property.
     */
    public void setAcceptedModalities(@jakarta.annotation.Nullable final java.util.List<Modality> value) {
        this.backingStore.set("acceptedModalities", value);
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
     * Sets the callbackUri property value. The callbackUri property
     * @param value Value to set for the callbackUri property.
     */
    public void setCallbackUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callbackUri", value);
    }
    /**
     * Sets the callOptions property value. The callOptions property
     * @param value Value to set for the callOptions property.
     */
    public void setCallOptions(@jakarta.annotation.Nullable final IncomingCallOptions value) {
        this.backingStore.set("callOptions", value);
    }
    /**
     * Sets the mediaConfig property value. The mediaConfig property
     * @param value Value to set for the mediaConfig property.
     */
    public void setMediaConfig(@jakarta.annotation.Nullable final MediaConfig value) {
        this.backingStore.set("mediaConfig", value);
    }
    /**
     * Sets the participantCapacity property value. The participantCapacity property
     * @param value Value to set for the participantCapacity property.
     */
    public void setParticipantCapacity(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("participantCapacity", value);
    }
}
