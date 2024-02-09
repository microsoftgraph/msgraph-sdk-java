package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewQueryScope extends AccessReviewScope implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewQueryScope} and sets the default values.
     */
    public AccessReviewQueryScope() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewQueryScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewQueryScope}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewQueryScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * Gets the query property value. The query representing what will be reviewed in an access review.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQuery() {
        return this.backingStore.get("query");
    }
    /**
     * Gets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query is specified. For example, ./manager.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQueryRoot() {
        return this.backingStore.get("queryRoot");
    }
    /**
     * Gets the queryType property value. Indicates the type of query. Types include MicrosoftGraph and ARM.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQueryType() {
        return this.backingStore.get("queryType");
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
     * Sets the query property value. The query representing what will be reviewed in an access review.
     * @param value Value to set for the query property.
     */
    public void setQuery(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("query", value);
    }
    /**
     * Sets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query is specified. For example, ./manager.
     * @param value Value to set for the queryRoot property.
     */
    public void setQueryRoot(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("queryRoot", value);
    }
    /**
     * Sets the queryType property value. Indicates the type of query. Types include MicrosoftGraph and ARM.
     * @param value Value to set for the queryType property.
     */
    public void setQueryType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("queryType", value);
    }
}
