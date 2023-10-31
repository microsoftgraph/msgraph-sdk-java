package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.item.setdata;

import com.microsoft.graph.models.Json;
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
public class SetDataPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new SetDataPostRequestBody and sets the default values.
     */
    public SetDataPostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SetDataPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SetDataPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetDataPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("seriesBy", (n) -> { this.setSeriesBy(n.getStringValue()); });
        deserializerMap.put("sourceData", (n) -> { this.setSourceData(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the seriesBy property value. The seriesBy property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSeriesBy() {
        return this.getBackingStore().get("seriesBy");
    }
    /**
     * Gets the sourceData property value. The sourceData property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getSourceData() {
        return this.getBackingStore().get("sourceData");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("seriesBy", this.getSeriesBy());
        writer.writeObjectValue("sourceData", this.getSourceData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the seriesBy property value. The seriesBy property
     * @param value Value to set for the seriesBy property.
     */
    public void setSeriesBy(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("seriesBy", value);
    }
    /**
     * Sets the sourceData property value. The sourceData property
     * @param value Value to set for the sourceData property.
     */
    public void setSourceData(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("sourceData", value);
    }
}
