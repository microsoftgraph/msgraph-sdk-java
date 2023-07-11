package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewNotificationRecipientQueryScope extends AccessReviewNotificationRecipientScope implements Parsable {
    /**
     * Represents the query for who the recipients are. For example, /groups/{group id}/members for group members and /users/{user id} for a specific user.
     */
    private String query;
    /**
     * In the scenario where reviewers need to be specified dynamically, indicates the relative source of the query. This property is only required if a relative query (that is, ./manager) is specified.
     */
    private String queryRoot;
    /**
     * Indicates the type of query. Allowed value is MicrosoftGraph.
     */
    private String queryType;
    /**
     * Instantiates a new accessReviewNotificationRecipientQueryScope and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReviewNotificationRecipientQueryScope() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewNotificationRecipientQueryScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewNotificationRecipientQueryScope
     */
    @javax.annotation.Nonnull
    public static AccessReviewNotificationRecipientQueryScope createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewNotificationRecipientQueryScope();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        deserializerMap.put("queryRoot", (n) -> { this.setQueryRoot(n.getStringValue()); });
        deserializerMap.put("queryType", (n) -> { this.setQueryType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the query property value. Represents the query for who the recipients are. For example, /groups/{group id}/members for group members and /users/{user id} for a specific user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuery() {
        return this.query;
    }
    /**
     * Gets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, indicates the relative source of the query. This property is only required if a relative query (that is, ./manager) is specified.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryRoot() {
        return this.queryRoot;
    }
    /**
     * Gets the queryType property value. Indicates the type of query. Allowed value is MicrosoftGraph.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryType() {
        return this.queryType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("query", this.getQuery());
        writer.writeStringValue("queryRoot", this.getQueryRoot());
        writer.writeStringValue("queryType", this.getQueryType());
    }
    /**
     * Sets the query property value. Represents the query for who the recipients are. For example, /groups/{group id}/members for group members and /users/{user id} for a specific user.
     * @param value Value to set for the query property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuery(@javax.annotation.Nullable final String value) {
        this.query = value;
    }
    /**
     * Sets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, indicates the relative source of the query. This property is only required if a relative query (that is, ./manager) is specified.
     * @param value Value to set for the queryRoot property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryRoot(@javax.annotation.Nullable final String value) {
        this.queryRoot = value;
    }
    /**
     * Sets the queryType property value. Indicates the type of query. Allowed value is MicrosoftGraph.
     * @param value Value to set for the queryType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryType(@javax.annotation.Nullable final String value) {
        this.queryType = value;
    }
}
