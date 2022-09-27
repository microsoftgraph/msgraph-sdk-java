package com.microsoft.graph.models;

import com.microsoft.graph.models.AccessReviewInactiveUsersQueryScope;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewQueryScope extends AccessReviewScope implements Parsable {
    /** The query representing what will be reviewed in an access review. */
    private String _query;
    /** In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query is specified. For example, ./manager. */
    private String _queryRoot;
    /** Indicates the type of query. Types include MicrosoftGraph and ARM. */
    private String _queryType;
    /**
     * Instantiates a new AccessReviewQueryScope and sets the default values.
     * @return a void
     */
    public AccessReviewQueryScope() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewQueryScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewQueryScope
     */
    @javax.annotation.Nonnull
    public static AccessReviewQueryScope createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.accessReviewInactiveUsersQueryScope": return new AccessReviewInactiveUsersQueryScope();
            }
        }
        return new AccessReviewQueryScope();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewQueryScope currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("query", (n) -> { currentObject.setQuery(n.getStringValue()); });
            this.put("queryRoot", (n) -> { currentObject.setQueryRoot(n.getStringValue()); });
            this.put("queryType", (n) -> { currentObject.setQueryType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the query property value. The query representing what will be reviewed in an access review.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuery() {
        return this._query;
    }
    /**
     * Gets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query is specified. For example, ./manager.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryRoot() {
        return this._queryRoot;
    }
    /**
     * Gets the queryType property value. Indicates the type of query. Types include MicrosoftGraph and ARM.
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
        super.serialize(writer);
        writer.writeStringValue("query", this.getQuery());
        writer.writeStringValue("queryRoot", this.getQueryRoot());
        writer.writeStringValue("queryType", this.getQueryType());
    }
    /**
     * Sets the query property value. The query representing what will be reviewed in an access review.
     * @param value Value to set for the query property.
     * @return a void
     */
    public void setQuery(@javax.annotation.Nullable final String value) {
        this._query = value;
    }
    /**
     * Sets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query is specified. For example, ./manager.
     * @param value Value to set for the queryRoot property.
     * @return a void
     */
    public void setQueryRoot(@javax.annotation.Nullable final String value) {
        this._queryRoot = value;
    }
    /**
     * Sets the queryType property value. Indicates the type of query. Types include MicrosoftGraph and ARM.
     * @param value Value to set for the queryType property.
     * @return a void
     */
    public void setQueryType(@javax.annotation.Nullable final String value) {
        this._queryType = value;
    }
}
