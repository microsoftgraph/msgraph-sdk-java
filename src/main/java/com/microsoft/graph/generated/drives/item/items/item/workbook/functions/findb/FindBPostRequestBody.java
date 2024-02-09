package com.microsoft.graph.drives.item.items.item.workbook.functions.findb;

import com.microsoft.graph.models.Json;
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
public class FindBPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link FindBPostRequestBody} and sets the default values.
     */
    public FindBPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FindBPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static FindBPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FindBPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("findText", (n) -> { this.setFindText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startNum", (n) -> { this.setStartNum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("withinText", (n) -> { this.setWithinText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the findText property value. The findText property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getFindText() {
        return this.backingStore.get("findText");
    }
    /**
     * Gets the startNum property value. The startNum property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getStartNum() {
        return this.backingStore.get("startNum");
    }
    /**
     * Gets the withinText property value. The withinText property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getWithinText() {
        return this.backingStore.get("withinText");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("findText", this.getFindText());
        writer.writeObjectValue("startNum", this.getStartNum());
        writer.writeObjectValue("withinText", this.getWithinText());
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
     * Sets the findText property value. The findText property
     * @param value Value to set for the findText property.
     */
    public void setFindText(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("findText", value);
    }
    /**
     * Sets the startNum property value. The startNum property
     * @param value Value to set for the startNum property.
     */
    public void setStartNum(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("startNum", value);
    }
    /**
     * Sets the withinText property value. The withinText property
     * @param value Value to set for the withinText property.
     */
    public void setWithinText(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("withinText", value);
    }
}
