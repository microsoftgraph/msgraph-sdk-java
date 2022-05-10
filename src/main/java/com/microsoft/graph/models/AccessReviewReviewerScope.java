package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewReviewerScope implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The query specifying who will be the reviewer. See table for examples. */
    private String _query;
    /** In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query, for example, ./manager, is specified. Possible value: decisions. */
    private String _queryRoot;
    /** The type of query. Examples include MicrosoftGraph and ARM. */
    private String _queryType;
    /**
     * Instantiates a new accessReviewReviewerScope and sets the default values.
     * @return a void
     */
    public AccessReviewReviewerScope() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewReviewerScope
     */
    @javax.annotation.Nonnull
    public static AccessReviewReviewerScope createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewReviewerScope();
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
        final AccessReviewReviewerScope currentObject = this;
        return new HashMap<>(3) {{
            this.put("query", (n) -> { currentObject.setQuery(n.getStringValue()); });
            this.put("queryRoot", (n) -> { currentObject.setQueryRoot(n.getStringValue()); });
            this.put("queryType", (n) -> { currentObject.setQueryType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the query property value. The query specifying who will be the reviewer. See table for examples.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuery() {
        return this._query;
    }
    /**
     * Gets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query, for example, ./manager, is specified. Possible value: decisions.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryRoot() {
        return this._queryRoot;
    }
    /**
     * Gets the queryType property value. The type of query. Examples include MicrosoftGraph and ARM.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryType() {
        return this._queryType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("query", this.getQuery());
        writer.writeStringValue("queryRoot", this.getQueryRoot());
        writer.writeStringValue("queryType", this.getQueryType());
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
     * Sets the query property value. The query specifying who will be the reviewer. See table for examples.
     * @param value Value to set for the query property.
     * @return a void
     */
    public void setQuery(@javax.annotation.Nullable final String value) {
        this._query = value;
    }
    /**
     * Sets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query, for example, ./manager, is specified. Possible value: decisions.
     * @param value Value to set for the queryRoot property.
     * @return a void
     */
    public void setQueryRoot(@javax.annotation.Nullable final String value) {
        this._queryRoot = value;
    }
    /**
     * Sets the queryType property value. The type of query. Examples include MicrosoftGraph and ARM.
     * @param value Value to set for the queryType property.
     * @return a void
     */
    public void setQueryType(@javax.annotation.Nullable final String value) {
        this._queryType = value;
    }
}
