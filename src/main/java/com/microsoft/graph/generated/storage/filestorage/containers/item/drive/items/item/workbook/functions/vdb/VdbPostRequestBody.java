package com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.vdb;

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
public class VdbPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link VdbPostRequestBody} and sets the default values.
     */
    public VdbPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VdbPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static VdbPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VdbPostRequestBody();
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
     * Gets the cost property value. The cost property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCost() {
        return this.backingStore.get("cost");
    }
    /**
     * Gets the endPeriod property value. The endPeriod property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getEndPeriod() {
        return this.backingStore.get("endPeriod");
    }
    /**
     * Gets the factor property value. The factor property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getFactor() {
        return this.backingStore.get("factor");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("cost", (n) -> { this.setCost(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("endPeriod", (n) -> { this.setEndPeriod(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("factor", (n) -> { this.setFactor(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("life", (n) -> { this.setLife(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("noSwitch", (n) -> { this.setNoSwitch(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("salvage", (n) -> { this.setSalvage(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("startPeriod", (n) -> { this.setStartPeriod(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the life property value. The life property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getLife() {
        return this.backingStore.get("life");
    }
    /**
     * Gets the noSwitch property value. The noSwitch property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getNoSwitch() {
        return this.backingStore.get("noSwitch");
    }
    /**
     * Gets the salvage property value. The salvage property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getSalvage() {
        return this.backingStore.get("salvage");
    }
    /**
     * Gets the startPeriod property value. The startPeriod property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getStartPeriod() {
        return this.backingStore.get("startPeriod");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cost", this.getCost());
        writer.writeObjectValue("endPeriod", this.getEndPeriod());
        writer.writeObjectValue("factor", this.getFactor());
        writer.writeObjectValue("life", this.getLife());
        writer.writeObjectValue("noSwitch", this.getNoSwitch());
        writer.writeObjectValue("salvage", this.getSalvage());
        writer.writeObjectValue("startPeriod", this.getStartPeriod());
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
     * Sets the cost property value. The cost property
     * @param value Value to set for the cost property.
     */
    public void setCost(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("cost", value);
    }
    /**
     * Sets the endPeriod property value. The endPeriod property
     * @param value Value to set for the endPeriod property.
     */
    public void setEndPeriod(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("endPeriod", value);
    }
    /**
     * Sets the factor property value. The factor property
     * @param value Value to set for the factor property.
     */
    public void setFactor(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("factor", value);
    }
    /**
     * Sets the life property value. The life property
     * @param value Value to set for the life property.
     */
    public void setLife(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("life", value);
    }
    /**
     * Sets the noSwitch property value. The noSwitch property
     * @param value Value to set for the noSwitch property.
     */
    public void setNoSwitch(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("noSwitch", value);
    }
    /**
     * Sets the salvage property value. The salvage property
     * @param value Value to set for the salvage property.
     */
    public void setSalvage(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("salvage", value);
    }
    /**
     * Sets the startPeriod property value. The startPeriod property
     * @param value Value to set for the startPeriod property.
     */
    public void setStartPeriod(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("startPeriod", value);
    }
}
