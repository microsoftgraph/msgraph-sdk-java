package com.microsoft.graph.drives.item.items.item.workbook.functions.hyperlink;

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
public class HyperlinkPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new HyperlinkPostRequestBody and sets the default values.
     */
    public HyperlinkPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HyperlinkPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static HyperlinkPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HyperlinkPostRequestBody();
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
        deserializerMap.put("friendlyName", (n) -> { this.setFriendlyName(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("linkLocation", (n) -> { this.setLinkLocation(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the friendlyName property value. The friendlyName property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getFriendlyName() {
        return this.backingStore.get("friendlyName");
    }
    /**
     * Gets the linkLocation property value. The linkLocation property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getLinkLocation() {
        return this.backingStore.get("linkLocation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("friendlyName", this.getFriendlyName());
        writer.writeObjectValue("linkLocation", this.getLinkLocation());
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
     * Sets the friendlyName property value. The friendlyName property
     * @param value Value to set for the friendlyName property.
     */
    public void setFriendlyName(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("friendlyName", value);
    }
    /**
     * Sets the linkLocation property value. The linkLocation property
     * @param value Value to set for the linkLocation property.
     */
    public void setLinkLocation(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("linkLocation", value);
    }
}
