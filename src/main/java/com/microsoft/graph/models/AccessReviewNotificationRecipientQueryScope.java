package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
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
     * Instantiates a new AccessReviewNotificationRecipientQueryScope and sets the default values.
     */
    public AccessReviewNotificationRecipientQueryScope() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewNotificationRecipientQueryScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewNotificationRecipientQueryScope
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewNotificationRecipientQueryScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewNotificationRecipientQueryScope();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        deserializerMap.put("queryRoot", (n) -> { this.setQueryRoot(n.getStringValue()); });
        deserializerMap.put("queryType", (n) -> { this.setQueryType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the query property value. Represents the query for who the recipients are. For example, /groups/{group id}/members for group members and /users/{user id} for a specific user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQuery() {
        return this.query;
    }
    /**
     * Gets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, indicates the relative source of the query. This property is only required if a relative query (that is, ./manager) is specified.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQueryRoot() {
        return this.queryRoot;
    }
    /**
     * Gets the queryType property value. Indicates the type of query. Allowed value is MicrosoftGraph.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQueryType() {
        return this.queryType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("query", this.getQuery());
        writer.writeStringValue("queryRoot", this.getQueryRoot());
        writer.writeStringValue("queryType", this.getQueryType());
    }
    /**
     * Sets the query property value. Represents the query for who the recipients are. For example, /groups/{group id}/members for group members and /users/{user id} for a specific user.
     * @param value Value to set for the query property.
     */
    public void setQuery(@jakarta.annotation.Nullable final String value) {
        this.query = value;
    }
    /**
     * Sets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, indicates the relative source of the query. This property is only required if a relative query (that is, ./manager) is specified.
     * @param value Value to set for the queryRoot property.
     */
    public void setQueryRoot(@jakarta.annotation.Nullable final String value) {
        this.queryRoot = value;
    }
    /**
     * Sets the queryType property value. Indicates the type of query. Allowed value is MicrosoftGraph.
     * @param value Value to set for the queryType property.
     */
    public void setQueryType(@jakarta.annotation.Nullable final String value) {
        this.queryType = value;
    }
}
