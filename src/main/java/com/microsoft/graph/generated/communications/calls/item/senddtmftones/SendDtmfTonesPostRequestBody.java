package com.microsoft.graph.communications.calls.item.senddtmftones;

import com.microsoft.graph.models.Tone;
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
public class SendDtmfTonesPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SendDtmfTonesPostRequestBody} and sets the default values.
     */
    public SendDtmfTonesPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendDtmfTonesPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static SendDtmfTonesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendDtmfTonesPostRequestBody();
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
     * Gets the clientContext property value. The clientContext property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientContext() {
        return this.backingStore.get("clientContext");
    }
    /**
     * Gets the delayBetweenTonesMs property value. The delayBetweenTonesMs property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDelayBetweenTonesMs() {
        return this.backingStore.get("delayBetweenTonesMs");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("clientContext", (n) -> { this.setClientContext(n.getStringValue()); });
        deserializerMap.put("delayBetweenTonesMs", (n) -> { this.setDelayBetweenTonesMs(n.getIntegerValue()); });
        deserializerMap.put("tones", (n) -> { this.setTones(n.getCollectionOfEnumValues(Tone::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tones property value. The tones property
     * @return a {@link java.util.List<Tone>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Tone> getTones() {
        return this.backingStore.get("tones");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clientContext", this.getClientContext());
        writer.writeIntegerValue("delayBetweenTonesMs", this.getDelayBetweenTonesMs());
        writer.writeCollectionOfEnumValues("tones", this.getTones());
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
     * Sets the clientContext property value. The clientContext property
     * @param value Value to set for the clientContext property.
     */
    public void setClientContext(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientContext", value);
    }
    /**
     * Sets the delayBetweenTonesMs property value. The delayBetweenTonesMs property
     * @param value Value to set for the delayBetweenTonesMs property.
     */
    public void setDelayBetweenTonesMs(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("delayBetweenTonesMs", value);
    }
    /**
     * Sets the tones property value. The tones property
     * @param value Value to set for the tones property.
     */
    public void setTones(@jakarta.annotation.Nullable final java.util.List<Tone> value) {
        this.backingStore.set("tones", value);
    }
}
