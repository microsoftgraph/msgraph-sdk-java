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
public class SearchAlteration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new SearchAlteration and sets the default values.
     */
    public SearchAlteration() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SearchAlteration
     */
    @jakarta.annotation.Nonnull
    public static SearchAlteration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchAlteration();
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
     * Gets the alteredHighlightedQueryString property value. Defines the altered highlighted query string with spelling correction. The annotation around the corrected segment is: /ue000, /ue001.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlteredHighlightedQueryString() {
        return this.BackingStore.get("alteredHighlightedQueryString");
    }
    /**
     * Gets the alteredQueryString property value. Defines the altered query string with spelling correction.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlteredQueryString() {
        return this.BackingStore.get("alteredQueryString");
    }
    /**
     * Gets the alteredQueryTokens property value. Represents changed segments related to an original user query.
     * @return a java.util.List<AlteredQueryToken>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlteredQueryToken> getAlteredQueryTokens() {
        return this.BackingStore.get("alteredQueryTokens");
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
        deserializerMap.put("alteredHighlightedQueryString", (n) -> { this.setAlteredHighlightedQueryString(n.getStringValue()); });
        deserializerMap.put("alteredQueryString", (n) -> { this.setAlteredQueryString(n.getStringValue()); });
        deserializerMap.put("alteredQueryTokens", (n) -> { this.setAlteredQueryTokens(n.getCollectionOfObjectValues(AlteredQueryToken::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alteredHighlightedQueryString", this.getAlteredHighlightedQueryString());
        writer.writeStringValue("alteredQueryString", this.getAlteredQueryString());
        writer.writeCollectionOfObjectValues("alteredQueryTokens", this.getAlteredQueryTokens());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the alteredHighlightedQueryString property value. Defines the altered highlighted query string with spelling correction. The annotation around the corrected segment is: /ue000, /ue001.
     * @param value Value to set for the alteredHighlightedQueryString property.
     */
    public void setAlteredHighlightedQueryString(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("alteredHighlightedQueryString", value);
    }
    /**
     * Sets the alteredQueryString property value. Defines the altered query string with spelling correction.
     * @param value Value to set for the alteredQueryString property.
     */
    public void setAlteredQueryString(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("alteredQueryString", value);
    }
    /**
     * Sets the alteredQueryTokens property value. Represents changed segments related to an original user query.
     * @param value Value to set for the alteredQueryTokens property.
     */
    public void setAlteredQueryTokens(@jakarta.annotation.Nullable final java.util.List<AlteredQueryToken> value) {
        this.BackingStore.set("alteredQueryTokens", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
}
