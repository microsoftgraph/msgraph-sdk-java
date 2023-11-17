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
public class AccessReviewReviewerScope implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore backingStore;
    /**
     * Instantiates a new AccessReviewReviewerScope and sets the default values.
     */
    public AccessReviewReviewerScope() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewReviewerScope
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewReviewerScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewReviewerScope();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        deserializerMap.put("queryRoot", (n) -> { this.setQueryRoot(n.getStringValue()); });
        deserializerMap.put("queryType", (n) -> { this.setQueryType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the query property value. The query specifying who will be the reviewer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQuery() {
        return this.backingStore.get("query");
    }
    /**
     * Gets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query, for example, ./manager, is specified. Possible value: decisions.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQueryRoot() {
        return this.backingStore.get("queryRoot");
    }
    /**
     * Gets the queryType property value. The type of query. Examples include MicrosoftGraph and ARM.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQueryType() {
        return this.backingStore.get("queryType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("query", this.getQuery());
        writer.writeStringValue("queryRoot", this.getQueryRoot());
        writer.writeStringValue("queryType", this.getQueryType());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the query property value. The query specifying who will be the reviewer.
     * @param value Value to set for the query property.
     */
    public void setQuery(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("query", value);
    }
    /**
     * Sets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query, for example, ./manager, is specified. Possible value: decisions.
     * @param value Value to set for the queryRoot property.
     */
    public void setQueryRoot(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("queryRoot", value);
    }
    /**
     * Sets the queryType property value. The type of query. Examples include MicrosoftGraph and ARM.
     * @param value Value to set for the queryType property.
     */
    public void setQueryType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("queryType", value);
    }
}
