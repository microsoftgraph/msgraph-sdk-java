package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AlterationResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Defines the original user query string. */
    private String _originalQueryString;
    /** Defines the details of alteration information for the spelling correction. */
    private SearchAlteration _queryAlteration;
    /** Defines the type of the spelling correction. Possible values are suggestion, modification. */
    private SearchAlterationType _queryAlterationType;
    /**
     * Instantiates a new alterationResponse and sets the default values.
     * @return a void
     */
    public AlterationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alterationResponse
     */
    @javax.annotation.Nonnull
    public static AlterationResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlterationResponse();
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
        final AlterationResponse currentObject = this;
        return new HashMap<>(3) {{
            this.put("originalQueryString", (n) -> { currentObject.setOriginalQueryString(n.getStringValue()); });
            this.put("queryAlteration", (n) -> { currentObject.setQueryAlteration(n.getObjectValue(SearchAlteration::createFromDiscriminatorValue)); });
            this.put("queryAlterationType", (n) -> { currentObject.setQueryAlterationType(n.getEnumValue(SearchAlterationType.class)); });
        }};
    }
    /**
     * Gets the originalQueryString property value. Defines the original user query string.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginalQueryString() {
        return this._originalQueryString;
    }
    /**
     * Gets the queryAlteration property value. Defines the details of alteration information for the spelling correction.
     * @return a searchAlteration
     */
    @javax.annotation.Nullable
    public SearchAlteration getQueryAlteration() {
        return this._queryAlteration;
    }
    /**
     * Gets the queryAlterationType property value. Defines the type of the spelling correction. Possible values are suggestion, modification.
     * @return a searchAlterationType
     */
    @javax.annotation.Nullable
    public SearchAlterationType getQueryAlterationType() {
        return this._queryAlterationType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("originalQueryString", this.getOriginalQueryString());
        writer.writeObjectValue("queryAlteration", this.getQueryAlteration());
        writer.writeEnumValue("queryAlterationType", this.getQueryAlterationType());
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
     * Sets the originalQueryString property value. Defines the original user query string.
     * @param value Value to set for the originalQueryString property.
     * @return a void
     */
    public void setOriginalQueryString(@javax.annotation.Nullable final String value) {
        this._originalQueryString = value;
    }
    /**
     * Sets the queryAlteration property value. Defines the details of alteration information for the spelling correction.
     * @param value Value to set for the queryAlteration property.
     * @return a void
     */
    public void setQueryAlteration(@javax.annotation.Nullable final SearchAlteration value) {
        this._queryAlteration = value;
    }
    /**
     * Sets the queryAlterationType property value. Defines the type of the spelling correction. Possible values are suggestion, modification.
     * @param value Value to set for the queryAlterationType property.
     * @return a void
     */
    public void setQueryAlterationType(@javax.annotation.Nullable final SearchAlterationType value) {
        this._queryAlterationType = value;
    }
}
