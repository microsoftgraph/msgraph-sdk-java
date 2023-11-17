package com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.applycustomfilter;

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
public class ApplyCustomFilterPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ApplyCustomFilterPostRequestBody and sets the default values.
     */
    public ApplyCustomFilterPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ApplyCustomFilterPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ApplyCustomFilterPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyCustomFilterPostRequestBody();
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
     * Gets the criteria1 property value. The criteria1 property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCriteria1() {
        return this.backingStore.get("criteria1");
    }
    /**
     * Gets the criteria2 property value. The criteria2 property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCriteria2() {
        return this.backingStore.get("criteria2");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("criteria1", (n) -> { this.setCriteria1(n.getStringValue()); });
        deserializerMap.put("criteria2", (n) -> { this.setCriteria2(n.getStringValue()); });
        deserializerMap.put("oper", (n) -> { this.setOper(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the oper property value. The oper property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOper() {
        return this.backingStore.get("oper");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("criteria1", this.getCriteria1());
        writer.writeStringValue("criteria2", this.getCriteria2());
        writer.writeStringValue("oper", this.getOper());
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
     * Sets the criteria1 property value. The criteria1 property
     * @param value Value to set for the criteria1 property.
     */
    public void setCriteria1(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("criteria1", value);
    }
    /**
     * Sets the criteria2 property value. The criteria2 property
     * @param value Value to set for the criteria2 property.
     */
    public void setCriteria2(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("criteria2", value);
    }
    /**
     * Sets the oper property value. The oper property
     * @param value Value to set for the oper property.
     */
    public void setOper(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("oper", value);
    }
}
