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
public class ItemPreviewInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ItemPreviewInfo and sets the default values.
     */
    public ItemPreviewInfo() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ItemPreviewInfo
     */
    @jakarta.annotation.Nonnull
    public static ItemPreviewInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemPreviewInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("getUrl", (n) -> { this.setGetUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("postParameters", (n) -> { this.setPostParameters(n.getStringValue()); });
        deserializerMap.put("postUrl", (n) -> { this.setPostUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the getUrl property value. The getUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGetUrl() {
        return this.BackingStore.get("getUrl");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the postParameters property value. The postParameters property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPostParameters() {
        return this.BackingStore.get("postParameters");
    }
    /**
     * Gets the postUrl property value. The postUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPostUrl() {
        return this.BackingStore.get("postUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("getUrl", this.getGetUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("postParameters", this.getPostParameters());
        writer.writeStringValue("postUrl", this.getPostUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the getUrl property value. The getUrl property
     * @param value Value to set for the getUrl property.
     */
    public void setGetUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("getUrl", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the postParameters property value. The postParameters property
     * @param value Value to set for the postParameters property.
     */
    public void setPostParameters(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("postParameters", value);
    }
    /**
     * Sets the postUrl property value. The postUrl property
     * @param value Value to set for the postUrl property.
     */
    public void setPostUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("postUrl", value);
    }
}
