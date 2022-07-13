package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewNotificationRecipientQueryScope extends AccessReviewNotificationRecipientScope implements Parsable {
    /** This represents the query for who the recipients are. For example, /groups/{group id}/members for group members and /users/{user id} for a specific user. */
    private String _query;
    /** In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query that is, ./manager) is specified. */
    private String _queryRoot;
    /** Indicates the type of query. Allowed value is MicrosoftGraph. */
    private String _queryType;
    /**
     * Instantiates a new AccessReviewNotificationRecipientQueryScope and sets the default values.
     * @return a void
     */
    public AccessReviewNotificationRecipientQueryScope() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewNotificationRecipientQueryScope
     */
    @javax.annotation.Nonnull
    public static AccessReviewNotificationRecipientQueryScope createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewNotificationRecipientQueryScope();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewNotificationRecipientQueryScope currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("query", (n) -> { currentObject.setQuery(n.getStringValue()); });
            this.put("queryRoot", (n) -> { currentObject.setQueryRoot(n.getStringValue()); });
            this.put("queryType", (n) -> { currentObject.setQueryType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the query property value. This represents the query for who the recipients are. For example, /groups/{group id}/members for group members and /users/{user id} for a specific user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuery() {
        return this._query;
    }
    /**
     * Gets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query that is, ./manager) is specified.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryRoot() {
        return this._queryRoot;
    }
    /**
     * Gets the queryType property value. Indicates the type of query. Allowed value is MicrosoftGraph.
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
     * Sets the query property value. This represents the query for who the recipients are. For example, /groups/{group id}/members for group members and /users/{user id} for a specific user.
     * @param value Value to set for the query property.
     * @return a void
     */
    public void setQuery(@javax.annotation.Nullable final String value) {
        this._query = value;
    }
    /**
     * Sets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query that is, ./manager) is specified.
     * @param value Value to set for the queryRoot property.
     * @return a void
     */
    public void setQueryRoot(@javax.annotation.Nullable final String value) {
        this._queryRoot = value;
    }
    /**
     * Sets the queryType property value. Indicates the type of query. Allowed value is MicrosoftGraph.
     * @param value Value to set for the queryType property.
     * @return a void
     */
    public void setQueryType(@javax.annotation.Nullable final String value) {
        this._queryType = value;
    }
}
