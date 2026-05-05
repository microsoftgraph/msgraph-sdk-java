package com.microsoft.graph.solutions.backuprestore.browsesessions.item.browse;

import com.microsoft.graph.models.BrowsableResourceType;
import com.microsoft.graph.models.BrowseQueryOrder;
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
public class BrowsePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link BrowsePostRequestBody} and sets the default values.
     */
    public BrowsePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BrowsePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static BrowsePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowsePostRequestBody();
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
     * Gets the browseLocationItemKey property value. The browseLocationItemKey property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrowseLocationItemKey() {
        return this.backingStore.get("browseLocationItemKey");
    }
    /**
     * Gets the browseResourceType property value. The browseResourceType property
     * @return a {@link BrowsableResourceType}
     */
    @jakarta.annotation.Nullable
    public BrowsableResourceType getBrowseResourceType() {
        return this.backingStore.get("browseResourceType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("browseLocationItemKey", (n) -> { this.setBrowseLocationItemKey(n.getStringValue()); });
        deserializerMap.put("browseResourceType", (n) -> { this.setBrowseResourceType(n.getEnumValue(BrowsableResourceType::forValue)); });
        deserializerMap.put("filter", (n) -> { this.setFilter(n.getStringValue()); });
        deserializerMap.put("orderBy", (n) -> { this.setOrderBy(n.getEnumValue(BrowseQueryOrder::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filter property value. The filter property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFilter() {
        return this.backingStore.get("filter");
    }
    /**
     * Gets the orderBy property value. The orderBy property
     * @return a {@link BrowseQueryOrder}
     */
    @jakarta.annotation.Nullable
    public BrowseQueryOrder getOrderBy() {
        return this.backingStore.get("orderBy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("browseLocationItemKey", this.getBrowseLocationItemKey());
        writer.writeEnumValue("browseResourceType", this.getBrowseResourceType());
        writer.writeStringValue("filter", this.getFilter());
        writer.writeEnumValue("orderBy", this.getOrderBy());
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
     * Sets the browseLocationItemKey property value. The browseLocationItemKey property
     * @param value Value to set for the browseLocationItemKey property.
     */
    public void setBrowseLocationItemKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("browseLocationItemKey", value);
    }
    /**
     * Sets the browseResourceType property value. The browseResourceType property
     * @param value Value to set for the browseResourceType property.
     */
    public void setBrowseResourceType(@jakarta.annotation.Nullable final BrowsableResourceType value) {
        this.backingStore.set("browseResourceType", value);
    }
    /**
     * Sets the filter property value. The filter property
     * @param value Value to set for the filter property.
     */
    public void setFilter(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filter", value);
    }
    /**
     * Sets the orderBy property value. The orderBy property
     * @param value Value to set for the orderBy property.
     */
    public void setOrderBy(@jakarta.annotation.Nullable final BrowseQueryOrder value) {
        this.backingStore.set("orderBy", value);
    }
}
