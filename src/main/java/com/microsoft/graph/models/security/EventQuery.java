package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventQuery implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Represents unique identification for the  query. 'Asset ID' for SharePoint Online and OneDrive for Business, 'keywords' for Exchange Online.
     */
    private String query;
    /**
     * Represents the type of query associated with an event. 'files' for SPO and ODB and 'messages' for EXO.The possible values are: files, messages, unknownFutureValue.
     */
    private QueryType queryType;
    /**
     * Instantiates a new eventQuery and sets the default values.
     */
    public EventQuery() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a eventQuery
     */
    @jakarta.annotation.Nonnull
    public static EventQuery createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EventQuery();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        deserializerMap.put("queryType", (n) -> { this.setQueryType(n.getEnumValue(QueryType.class)); });
        return deserializerMap;
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
     * Gets the query property value. Represents unique identification for the  query. 'Asset ID' for SharePoint Online and OneDrive for Business, 'keywords' for Exchange Online.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getQuery() {
        return this.query;
    }
    /**
     * Gets the queryType property value. Represents the type of query associated with an event. 'files' for SPO and ODB and 'messages' for EXO.The possible values are: files, messages, unknownFutureValue.
     * @return a queryType
     */
    @jakarta.annotation.Nullable
    public QueryType getQueryType() {
        return this.queryType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("query", this.getQuery());
        writer.writeEnumValue("queryType", this.getQueryType());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the query property value. Represents unique identification for the  query. 'Asset ID' for SharePoint Online and OneDrive for Business, 'keywords' for Exchange Online.
     * @param value Value to set for the query property.
     */
    public void setQuery(@jakarta.annotation.Nullable final String value) {
        this.query = value;
    }
    /**
     * Sets the queryType property value. Represents the type of query associated with an event. 'files' for SPO and ODB and 'messages' for EXO.The possible values are: files, messages, unknownFutureValue.
     * @param value Value to set for the queryType property.
     */
    public void setQueryType(@jakarta.annotation.Nullable final QueryType value) {
        this.queryType = value;
    }
}
