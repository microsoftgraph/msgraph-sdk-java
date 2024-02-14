package com.microsoft.graph.shares.item.list.contenttypes.item.copytodefaultcontentlocation;

import com.microsoft.graph.models.ItemReference;
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
public class CopyToDefaultContentLocationPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CopyToDefaultContentLocationPostRequestBody} and sets the default values.
     */
    public CopyToDefaultContentLocationPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopyToDefaultContentLocationPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static CopyToDefaultContentLocationPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopyToDefaultContentLocationPostRequestBody();
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
     * Gets the destinationFileName property value. The destinationFileName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationFileName() {
        return this.backingStore.get("destinationFileName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("destinationFileName", (n) -> { this.setDestinationFileName(n.getStringValue()); });
        deserializerMap.put("sourceFile", (n) -> { this.setSourceFile(n.getObjectValue(ItemReference::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sourceFile property value. The sourceFile property
     * @return a {@link ItemReference}
     */
    @jakarta.annotation.Nullable
    public ItemReference getSourceFile() {
        return this.backingStore.get("sourceFile");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("destinationFileName", this.getDestinationFileName());
        writer.writeObjectValue("sourceFile", this.getSourceFile());
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
     * Sets the destinationFileName property value. The destinationFileName property
     * @param value Value to set for the destinationFileName property.
     */
    public void setDestinationFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationFileName", value);
    }
    /**
     * Sets the sourceFile property value. The sourceFile property
     * @param value Value to set for the sourceFile property.
     */
    public void setSourceFile(@jakarta.annotation.Nullable final ItemReference value) {
        this.backingStore.set("sourceFile", value);
    }
}
