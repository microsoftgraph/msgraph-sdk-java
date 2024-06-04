package com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.fv;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FvPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link FvPostRequestBody} and sets the default values.
     */
    public FvPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FvPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static FvPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FvPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("nper", (n) -> { this.setNper(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("pmt", (n) -> { this.setPmt(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("pv", (n) -> { this.setPv(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the nper property value. The nper property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getNper() {
        return this.backingStore.get("nper");
    }
    /**
     * Gets the pmt property value. The pmt property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getPmt() {
        return this.backingStore.get("pmt");
    }
    /**
     * Gets the pv property value. The pv property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getPv() {
        return this.backingStore.get("pv");
    }
    /**
     * Gets the rate property value. The rate property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getRate() {
        return this.backingStore.get("rate");
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("nper", this.getNper());
        writer.writeObjectValue("pmt", this.getPmt());
        writer.writeObjectValue("pv", this.getPv());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("type", this.getType());
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
     * Sets the nper property value. The nper property
     * @param value Value to set for the nper property.
     */
    public void setNper(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("nper", value);
    }
    /**
     * Sets the pmt property value. The pmt property
     * @param value Value to set for the pmt property.
     */
    public void setPmt(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("pmt", value);
    }
    /**
     * Sets the pv property value. The pv property
     * @param value Value to set for the pv property.
     */
    public void setPv(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("pv", value);
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     */
    public void setRate(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("rate", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("type", value);
    }
}
