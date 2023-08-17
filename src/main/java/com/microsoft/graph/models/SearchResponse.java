package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A collection of search results.
     */
    private java.util.List<SearchHitsContainer> hitsContainers;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Provides information related to spelling corrections in the alteration response.
     */
    private AlterationResponse queryAlterationResponse;
    /**
     * A dictionary of resultTemplateIds and associated values, which include the name and JSON schema of the result templates.
     */
    private ResultTemplateDictionary resultTemplates;
    /**
     * Contains the search terms sent in the initial search query.
     */
    private java.util.List<String> searchTerms;
    /**
     * Instantiates a new searchResponse and sets the default values.
     */
    public SearchResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchResponse
     */
    @jakarta.annotation.Nonnull
    public static SearchResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchResponse();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("hitsContainers", (n) -> { this.setHitsContainers(n.getCollectionOfObjectValues(SearchHitsContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("queryAlterationResponse", (n) -> { this.setQueryAlterationResponse(n.getObjectValue(AlterationResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("resultTemplates", (n) -> { this.setResultTemplates(n.getObjectValue(ResultTemplateDictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("searchTerms", (n) -> { this.setSearchTerms(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hitsContainers property value. A collection of search results.
     * @return a searchHitsContainer
     */
    @jakarta.annotation.Nullable
    public java.util.List<SearchHitsContainer> getHitsContainers() {
        return this.hitsContainers;
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
     * Gets the queryAlterationResponse property value. Provides information related to spelling corrections in the alteration response.
     * @return a alterationResponse
     */
    @jakarta.annotation.Nullable
    public AlterationResponse getQueryAlterationResponse() {
        return this.queryAlterationResponse;
    }
    /**
     * Gets the resultTemplates property value. A dictionary of resultTemplateIds and associated values, which include the name and JSON schema of the result templates.
     * @return a resultTemplateDictionary
     */
    @jakarta.annotation.Nullable
    public ResultTemplateDictionary getResultTemplates() {
        return this.resultTemplates;
    }
    /**
     * Gets the searchTerms property value. Contains the search terms sent in the initial search query.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSearchTerms() {
        return this.searchTerms;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("hitsContainers", this.getHitsContainers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("queryAlterationResponse", this.getQueryAlterationResponse());
        writer.writeObjectValue("resultTemplates", this.getResultTemplates());
        writer.writeCollectionOfPrimitiveValues("searchTerms", this.getSearchTerms());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the hitsContainers property value. A collection of search results.
     * @param value Value to set for the hitsContainers property.
     */
    public void setHitsContainers(@jakarta.annotation.Nullable final java.util.List<SearchHitsContainer> value) {
        this.hitsContainers = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the queryAlterationResponse property value. Provides information related to spelling corrections in the alteration response.
     * @param value Value to set for the queryAlterationResponse property.
     */
    public void setQueryAlterationResponse(@jakarta.annotation.Nullable final AlterationResponse value) {
        this.queryAlterationResponse = value;
    }
    /**
     * Sets the resultTemplates property value. A dictionary of resultTemplateIds and associated values, which include the name and JSON schema of the result templates.
     * @param value Value to set for the resultTemplates property.
     */
    public void setResultTemplates(@jakarta.annotation.Nullable final ResultTemplateDictionary value) {
        this.resultTemplates = value;
    }
    /**
     * Sets the searchTerms property value. Contains the search terms sent in the initial search query.
     * @param value Value to set for the searchTerms property.
     */
    public void setSearchTerms(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.searchTerms = value;
    }
}
