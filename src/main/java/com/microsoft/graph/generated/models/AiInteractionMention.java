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
public class AiInteractionMention implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AiInteractionMention} and sets the default values.
     */
    public AiInteractionMention() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AiInteractionMention}
     */
    @jakarta.annotation.Nonnull
    public static AiInteractionMention createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AiInteractionMention();
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
        deserializerMap.put("mentioned", (n) -> { this.setMentioned(n.getObjectValue(AiInteractionMentionedIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("mentionId", (n) -> { this.setMentionId(n.getIntegerValue()); });
        deserializerMap.put("mentionText", (n) -> { this.setMentionText(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mentioned property value. The mentioned property
     * @return a {@link AiInteractionMentionedIdentitySet}
     */
    @jakarta.annotation.Nullable
    public AiInteractionMentionedIdentitySet getMentioned() {
        return this.backingStore.get("mentioned");
    }
    /**
     * Gets the mentionId property value. The mentionId property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMentionId() {
        return this.backingStore.get("mentionId");
    }
    /**
     * Gets the mentionText property value. The mentionText property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMentionText() {
        return this.backingStore.get("mentionText");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("mentioned", this.getMentioned());
        writer.writeIntegerValue("mentionId", this.getMentionId());
        writer.writeStringValue("mentionText", this.getMentionText());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the mentioned property value. The mentioned property
     * @param value Value to set for the mentioned property.
     */
    public void setMentioned(@jakarta.annotation.Nullable final AiInteractionMentionedIdentitySet value) {
        this.backingStore.set("mentioned", value);
    }
    /**
     * Sets the mentionId property value. The mentionId property
     * @param value Value to set for the mentionId property.
     */
    public void setMentionId(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("mentionId", value);
    }
    /**
     * Sets the mentionText property value. The mentionText property
     * @param value Value to set for the mentionText property.
     */
    public void setMentionText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mentionText", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
