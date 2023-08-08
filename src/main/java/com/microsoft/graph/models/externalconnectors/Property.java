package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Property implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A set of aliases or a friendly names for the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &, ?, @, #, /, ~, ', ', <, >, `, ^. Optional.
     */
    private java.util.List<String> aliases;
    /**
     * Specifies if the property is queryable. Queryable properties can be used in Keyword Query Language (KQL) queries. Optional.
     */
    private Boolean isQueryable;
    /**
     * Specifies if the property is refinable.  Refinable properties can be used to filter search results in the Search API and add a refiner control in the Microsoft Search user experience. Optional.
     */
    private Boolean isRefinable;
    /**
     * Specifies if the property is retrievable. Retrievable properties are returned in the result set when items are returned by the search API. Retrievable properties are also available to add to the display template used to render search results. Optional.
     */
    private Boolean isRetrievable;
    /**
     * Specifies if the property is searchable. Only properties of type String or StringCollection can be searchable. Non-searchable properties are not added to the search index. Optional.
     */
    private Boolean isSearchable;
    /**
     * Specifies one or more well-known tags added against a property. Labels help Microsoft Search understand the semantics of the data in the connection. Adding appropriate labels would result in an enhanced search experience (e.g. better relevance). The possible values are: title, url, createdBy, lastModifiedBy, authors, createdDateTime, lastModifiedDateTime, fileName, fileExtension, unknownFutureValue. Optional.
     */
    private java.util.List<Label> labels;
    /**
     * The name of the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &, ?, @, #, /, ~, ', ', <, >, `, ^.  Required.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The type property
     */
    private PropertyType type;
    /**
     * Instantiates a new property and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Property() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a property
     */
    @jakarta.annotation.Nonnull
    public static Property createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Property();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the aliases property value. A set of aliases or a friendly names for the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &, ?, @, #, /, ~, ', ', <, >, `, ^. Optional.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAliases() {
        return this.aliases;
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
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getCollectionOfEnumValues(Label.class)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(PropertyType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isQueryable property value. Specifies if the property is queryable. Queryable properties can be used in Keyword Query Language (KQL) queries. Optional.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsQueryable() {
        return this.isQueryable;
    }
    /**
     * Gets the isRefinable property value. Specifies if the property is refinable.  Refinable properties can be used to filter search results in the Search API and add a refiner control in the Microsoft Search user experience. Optional.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRefinable() {
        return this.isRefinable;
    }
    /**
     * Gets the isRetrievable property value. Specifies if the property is retrievable. Retrievable properties are returned in the result set when items are returned by the search API. Retrievable properties are also available to add to the display template used to render search results. Optional.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRetrievable() {
        return this.isRetrievable;
    }
    /**
     * Gets the isSearchable property value. Specifies if the property is searchable. Only properties of type String or StringCollection can be searchable. Non-searchable properties are not added to the search index. Optional.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSearchable() {
        return this.isSearchable;
    }
    /**
     * Gets the labels property value. Specifies one or more well-known tags added against a property. Labels help Microsoft Search understand the semantics of the data in the connection. Adding appropriate labels would result in an enhanced search experience (e.g. better relevance). The possible values are: title, url, createdBy, lastModifiedBy, authors, createdDateTime, lastModifiedDateTime, fileName, fileExtension, unknownFutureValue. Optional.
     * @return a label
     */
    @jakarta.annotation.Nullable
    public java.util.List<Label> getLabels() {
        return this.labels;
    }
    /**
     * Gets the name property value. The name of the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &, ?, @, #, /, ~, ', ', <, >, `, ^.  Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the type property value. The type property
     * @return a propertyType
     */
    @jakarta.annotation.Nullable
    public PropertyType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the aliases property value. A set of aliases or a friendly names for the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &, ?, @, #, /, ~, ', ', <, >, `, ^. Optional.
     * @param value Value to set for the aliases property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAliases(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.aliases = value;
    }
    /**
     * Sets the isQueryable property value. Specifies if the property is queryable. Queryable properties can be used in Keyword Query Language (KQL) queries. Optional.
     * @param value Value to set for the isQueryable property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsQueryable(@jakarta.annotation.Nullable final Boolean value) {
        this.isQueryable = value;
    }
    /**
     * Sets the isRefinable property value. Specifies if the property is refinable.  Refinable properties can be used to filter search results in the Search API and add a refiner control in the Microsoft Search user experience. Optional.
     * @param value Value to set for the isRefinable property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsRefinable(@jakarta.annotation.Nullable final Boolean value) {
        this.isRefinable = value;
    }
    /**
     * Sets the isRetrievable property value. Specifies if the property is retrievable. Retrievable properties are returned in the result set when items are returned by the search API. Retrievable properties are also available to add to the display template used to render search results. Optional.
     * @param value Value to set for the isRetrievable property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsRetrievable(@jakarta.annotation.Nullable final Boolean value) {
        this.isRetrievable = value;
    }
    /**
     * Sets the isSearchable property value. Specifies if the property is searchable. Only properties of type String or StringCollection can be searchable. Non-searchable properties are not added to the search index. Optional.
     * @param value Value to set for the isSearchable property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsSearchable(@jakarta.annotation.Nullable final Boolean value) {
        this.isSearchable = value;
    }
    /**
     * Sets the labels property value. Specifies one or more well-known tags added against a property. Labels help Microsoft Search understand the semantics of the data in the connection. Adding appropriate labels would result in an enhanced search experience (e.g. better relevance). The possible values are: title, url, createdBy, lastModifiedBy, authors, createdDateTime, lastModifiedDateTime, fileName, fileExtension, unknownFutureValue. Optional.
     * @param value Value to set for the labels property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLabels(@jakarta.annotation.Nullable final java.util.List<Label> value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. The name of the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &, ?, @, #, /, ~, ', ', <, >, `, ^.  Required.
     * @param value Value to set for the name property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setType(@jakarta.annotation.Nullable final PropertyType value) {
        this.type = value;
    }
}
