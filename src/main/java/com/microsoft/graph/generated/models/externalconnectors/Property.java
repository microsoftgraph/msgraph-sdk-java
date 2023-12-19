package com.microsoft.graph.models.externalconnectors;

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
public class Property implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new Property and sets the default values.
     */
    public Property() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Property
     */
    @jakarta.annotation.Nonnull
    public static Property createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Property();
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
     * Gets the aliases property value. A set of aliases or a friendly name for the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &, ?, @, #, /, ~, ', ', <, >, `, ^. Optional.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAliases() {
        return this.backingStore.get("aliases");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("aliases", (n) -> { this.setAliases(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isQueryable", (n) -> { this.setIsQueryable(n.getBooleanValue()); });
        deserializerMap.put("isRefinable", (n) -> { this.setIsRefinable(n.getBooleanValue()); });
        deserializerMap.put("isRetrievable", (n) -> { this.setIsRetrievable(n.getBooleanValue()); });
        deserializerMap.put("isSearchable", (n) -> { this.setIsSearchable(n.getBooleanValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getCollectionOfEnumValues(PropertyLabels::forValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(PropertyType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isQueryable property value. Specifies if the property is queryable. Queryable properties can be used in Keyword Query Language (KQL) queries. Optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsQueryable() {
        return this.backingStore.get("isQueryable");
    }
    /**
     * Gets the isRefinable property value. Specifies if the property is refinable.  Refinable properties can be used to filter search results in the Search API and add a refiner control in the Microsoft Search user experience. Optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRefinable() {
        return this.backingStore.get("isRefinable");
    }
    /**
     * Gets the isRetrievable property value. Specifies if the property is retrievable. Retrievable properties are returned in the result set when items are returned by the search API. Retrievable properties are also available to add to the display template used to render search results. Optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRetrievable() {
        return this.backingStore.get("isRetrievable");
    }
    /**
     * Gets the isSearchable property value. Specifies if the property is searchable. Only properties of type String or StringCollection can be searchable. Nonsearchable properties aren't added to the search index. Optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSearchable() {
        return this.backingStore.get("isSearchable");
    }
    /**
     * Gets the labels property value. Specifies one or more well-known tags added against a property. Labels help Microsoft Search understand the semantics of the data in the connection. Adding appropriate labels would result in an enhanced search experience (for example, better relevance). Optional.The possible values are: title, url, createdBy, lastModifiedBy, authors, createdDateTime, lastModifiedDateTime, fileName, fileExtension, unknownFutureValue, iconUrl. You must use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: iconUrl.
     * @return a java.util.List<PropertyLabels>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PropertyLabels> getLabels() {
        return this.backingStore.get("labels");
    }
    /**
     * Gets the name property value. The name of the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &, ?, @, #, /, ~, ', ', <, >, `, ^.  Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
     * Gets the type property value. The type property
     * @return a PropertyType
     */
    @jakarta.annotation.Nullable
    public PropertyType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("aliases", this.getAliases());
        writer.writeBooleanValue("isQueryable", this.getIsQueryable());
        writer.writeBooleanValue("isRefinable", this.getIsRefinable());
        writer.writeBooleanValue("isRetrievable", this.getIsRetrievable());
        writer.writeBooleanValue("isSearchable", this.getIsSearchable());
        writer.writeCollectionOfEnumValues("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the aliases property value. A set of aliases or a friendly name for the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &, ?, @, #, /, ~, ', ', <, >, `, ^. Optional.
     * @param value Value to set for the aliases property.
     */
    public void setAliases(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("aliases", value);
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
     * Sets the isQueryable property value. Specifies if the property is queryable. Queryable properties can be used in Keyword Query Language (KQL) queries. Optional.
     * @param value Value to set for the isQueryable property.
     */
    public void setIsQueryable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isQueryable", value);
    }
    /**
     * Sets the isRefinable property value. Specifies if the property is refinable.  Refinable properties can be used to filter search results in the Search API and add a refiner control in the Microsoft Search user experience. Optional.
     * @param value Value to set for the isRefinable property.
     */
    public void setIsRefinable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRefinable", value);
    }
    /**
     * Sets the isRetrievable property value. Specifies if the property is retrievable. Retrievable properties are returned in the result set when items are returned by the search API. Retrievable properties are also available to add to the display template used to render search results. Optional.
     * @param value Value to set for the isRetrievable property.
     */
    public void setIsRetrievable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRetrievable", value);
    }
    /**
     * Sets the isSearchable property value. Specifies if the property is searchable. Only properties of type String or StringCollection can be searchable. Nonsearchable properties aren't added to the search index. Optional.
     * @param value Value to set for the isSearchable property.
     */
    public void setIsSearchable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSearchable", value);
    }
    /**
     * Sets the labels property value. Specifies one or more well-known tags added against a property. Labels help Microsoft Search understand the semantics of the data in the connection. Adding appropriate labels would result in an enhanced search experience (for example, better relevance). Optional.The possible values are: title, url, createdBy, lastModifiedBy, authors, createdDateTime, lastModifiedDateTime, fileName, fileExtension, unknownFutureValue, iconUrl. You must use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: iconUrl.
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final java.util.List<PropertyLabels> value) {
        this.backingStore.set("labels", value);
    }
    /**
     * Sets the name property value. The name of the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &, ?, @, #, /, ~, ', ', <, >, `, ^.  Required.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final PropertyType value) {
        this.backingStore.set("type", value);
    }
}
