package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchQuery implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The search query containing the search terms. Required.
     */
    private String queryString;
    /**
     * Provides a way to decorate the query string. Supports both KQL and query variables. Optional.
     */
    private String queryTemplate;
    /**
     * Instantiates a new searchQuery and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SearchQuery() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchQuery
     */
    @javax.annotation.Nonnull
    public static SearchQuery createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchQuery();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("queryString", (n) -> { this.setQueryString(n.getStringValue()); });
        deserializerMap.put("queryTemplate", (n) -> { this.setQueryTemplate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the queryString property value. The search query containing the search terms. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryString() {
        return this.queryString;
    }
    /**
     * Gets the queryTemplate property value. Provides a way to decorate the query string. Supports both KQL and query variables. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryTemplate() {
        return this.queryTemplate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("queryString", this.getQueryString());
        writer.writeStringValue("queryTemplate", this.getQueryTemplate());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the queryString property value. The search query containing the search terms. Required.
     * @param value Value to set for the queryString property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryString(@javax.annotation.Nullable final String value) {
        this.queryString = value;
    }
    /**
     * Sets the queryTemplate property value. Provides a way to decorate the query string. Supports both KQL and query variables. Optional.
     * @param value Value to set for the queryTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryTemplate(@javax.annotation.Nullable final String value) {
        this.queryTemplate = value;
    }
}
