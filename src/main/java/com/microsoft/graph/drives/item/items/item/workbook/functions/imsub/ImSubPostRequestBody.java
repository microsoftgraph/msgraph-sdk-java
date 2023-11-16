package com.microsoft.graph.drives.item.items.item.workbook.functions.imsub;

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
public class ImSubPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new ImSubPostRequestBody and sets the default values.
     */
    public ImSubPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ImSubPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ImSubPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImSubPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("inumber1", (n) -> { this.setInumber1(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("inumber2", (n) -> { this.setInumber2(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inumber1 property value. The inumber1 property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getInumber1() {
        return this.backingStore.get("inumber1");
    }
    /**
     * Gets the inumber2 property value. The inumber2 property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getInumber2() {
        return this.backingStore.get("inumber2");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("inumber1", this.getInumber1());
        writer.writeObjectValue("inumber2", this.getInumber2());
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
     * Sets the inumber1 property value. The inumber1 property
     * @param value Value to set for the inumber1 property.
     */
    public void setInumber1(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("inumber1", value);
    }
    /**
     * Sets the inumber2 property value. The inumber2 property
     * @param value Value to set for the inumber2 property.
     */
    public void setInumber2(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("inumber2", value);
    }
}
