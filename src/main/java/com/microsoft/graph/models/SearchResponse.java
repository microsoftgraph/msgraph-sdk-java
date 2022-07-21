package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A collection of search results. */
    private java.util.List<SearchHitsContainer> _hitsContainers;
    /** The OdataType property */
    private String _odataType;
    /** Provides details of query alteration response for spelling correction. */
    private AlterationResponse _queryAlterationResponse;
    /** A dictionary of resultTemplateIds and associated values, which include the name and JSON schema of the result templates. */
    private ResultTemplateDictionary _resultTemplates;
    /** Contains the search terms sent in the initial search query. */
    private java.util.List<String> _searchTerms;
    /**
     * Instantiates a new searchResponse and sets the default values.
     * @return a void
     */
    public SearchResponse() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.searchResponse");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchResponse
     */
    @javax.annotation.Nonnull
    public static SearchResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchResponse();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SearchResponse currentObject = this;
        return new HashMap<>(5) {{
            this.put("hitsContainers", (n) -> { currentObject.setHitsContainers(n.getCollectionOfObjectValues(SearchHitsContainer::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("queryAlterationResponse", (n) -> { currentObject.setQueryAlterationResponse(n.getObjectValue(AlterationResponse::createFromDiscriminatorValue)); });
            this.put("resultTemplates", (n) -> { currentObject.setResultTemplates(n.getObjectValue(ResultTemplateDictionary::createFromDiscriminatorValue)); });
            this.put("searchTerms", (n) -> { currentObject.setSearchTerms(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the hitsContainers property value. A collection of search results.
     * @return a searchHitsContainer
     */
    @javax.annotation.Nullable
    public java.util.List<SearchHitsContainer> getHitsContainers() {
        return this._hitsContainers;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the queryAlterationResponse property value. Provides details of query alteration response for spelling correction.
     * @return a alterationResponse
     */
    @javax.annotation.Nullable
    public AlterationResponse getQueryAlterationResponse() {
        return this._queryAlterationResponse;
    }
    /**
     * Gets the resultTemplates property value. A dictionary of resultTemplateIds and associated values, which include the name and JSON schema of the result templates.
     * @return a resultTemplateDictionary
     */
    @javax.annotation.Nullable
    public ResultTemplateDictionary getResultTemplates() {
        return this._resultTemplates;
    }
    /**
     * Gets the searchTerms property value. Contains the search terms sent in the initial search query.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSearchTerms() {
        return this._searchTerms;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the hitsContainers property value. A collection of search results.
     * @param value Value to set for the hitsContainers property.
     * @return a void
     */
    public void setHitsContainers(@javax.annotation.Nullable final java.util.List<SearchHitsContainer> value) {
        this._hitsContainers = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the queryAlterationResponse property value. Provides details of query alteration response for spelling correction.
     * @param value Value to set for the queryAlterationResponse property.
     * @return a void
     */
    public void setQueryAlterationResponse(@javax.annotation.Nullable final AlterationResponse value) {
        this._queryAlterationResponse = value;
    }
    /**
     * Sets the resultTemplates property value. A dictionary of resultTemplateIds and associated values, which include the name and JSON schema of the result templates.
     * @param value Value to set for the resultTemplates property.
     * @return a void
     */
    public void setResultTemplates(@javax.annotation.Nullable final ResultTemplateDictionary value) {
        this._resultTemplates = value;
    }
    /**
     * Sets the searchTerms property value. Contains the search terms sent in the initial search query.
     * @param value Value to set for the searchTerms property.
     * @return a void
     */
    public void setSearchTerms(@javax.annotation.Nullable final java.util.List<String> value) {
        this._searchTerms = value;
    }
}
