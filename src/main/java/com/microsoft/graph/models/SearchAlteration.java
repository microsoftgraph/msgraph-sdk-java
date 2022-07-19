package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchAlteration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Defines the altered highlighted query string with spelling correction. The annotation around the corrected segment is (/ue000, /ue001) */
    private String _alteredHighlightedQueryString;
    /** Defines the altered query string with spelling correction. */
    private String _alteredQueryString;
    /** Represents changed segments with respect to original query. */
    private java.util.List<AlteredQueryToken> _alteredQueryTokens;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new searchAlteration and sets the default values.
     * @return a void
     */
    public SearchAlteration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.searchAlteration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchAlteration
     */
    @javax.annotation.Nonnull
    public static SearchAlteration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchAlteration();
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
     * Gets the alteredHighlightedQueryString property value. Defines the altered highlighted query string with spelling correction. The annotation around the corrected segment is (/ue000, /ue001)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlteredHighlightedQueryString() {
        return this._alteredHighlightedQueryString;
    }
    /**
     * Gets the alteredQueryString property value. Defines the altered query string with spelling correction.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlteredQueryString() {
        return this._alteredQueryString;
    }
    /**
     * Gets the alteredQueryTokens property value. Represents changed segments with respect to original query.
     * @return a alteredQueryToken
     */
    @javax.annotation.Nullable
    public java.util.List<AlteredQueryToken> getAlteredQueryTokens() {
        return this._alteredQueryTokens;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SearchAlteration currentObject = this;
        return new HashMap<>(4) {{
            this.put("alteredHighlightedQueryString", (n) -> { currentObject.setAlteredHighlightedQueryString(n.getStringValue()); });
            this.put("alteredQueryString", (n) -> { currentObject.setAlteredQueryString(n.getStringValue()); });
            this.put("alteredQueryTokens", (n) -> { currentObject.setAlteredQueryTokens(n.getCollectionOfObjectValues(AlteredQueryToken::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alteredHighlightedQueryString", this.getAlteredHighlightedQueryString());
        writer.writeStringValue("alteredQueryString", this.getAlteredQueryString());
        writer.writeCollectionOfObjectValues("alteredQueryTokens", this.getAlteredQueryTokens());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the alteredHighlightedQueryString property value. Defines the altered highlighted query string with spelling correction. The annotation around the corrected segment is (/ue000, /ue001)
     * @param value Value to set for the alteredHighlightedQueryString property.
     * @return a void
     */
    public void setAlteredHighlightedQueryString(@javax.annotation.Nullable final String value) {
        this._alteredHighlightedQueryString = value;
    }
    /**
     * Sets the alteredQueryString property value. Defines the altered query string with spelling correction.
     * @param value Value to set for the alteredQueryString property.
     * @return a void
     */
    public void setAlteredQueryString(@javax.annotation.Nullable final String value) {
        this._alteredQueryString = value;
    }
    /**
     * Sets the alteredQueryTokens property value. Represents changed segments with respect to original query.
     * @param value Value to set for the alteredQueryTokens property.
     * @return a void
     */
    public void setAlteredQueryTokens(@javax.annotation.Nullable final java.util.List<AlteredQueryToken> value) {
        this._alteredQueryTokens = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
