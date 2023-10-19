package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HuntingQueryResults implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The results of the hunting query.
     */
    private java.util.List<HuntingRowResult> results;
    /**
     * The schema for the response.
     */
    private java.util.List<SinglePropertySchema> schema;
    /**
     * Instantiates a new HuntingQueryResults and sets the default values.
     */
    public HuntingQueryResults() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HuntingQueryResults
     */
    @jakarta.annotation.Nonnull
    public static HuntingQueryResults createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HuntingQueryResults();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
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
        deserializerMap.put("results", (n) -> { this.setResults(n.getCollectionOfObjectValues(HuntingRowResult::createFromDiscriminatorValue)); });
        deserializerMap.put("schema", (n) -> { this.setSchema(n.getCollectionOfObjectValues(SinglePropertySchema::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the results property value. The results of the hunting query.
     * @return a java.util.List<HuntingRowResult>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HuntingRowResult> getResults() {
        return this.results;
    }
    /**
     * Gets the schema property value. The schema for the response.
     * @return a java.util.List<SinglePropertySchema>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SinglePropertySchema> getSchema() {
        return this.schema;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("results", this.getResults());
        writer.writeCollectionOfObjectValues("schema", this.getSchema());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
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
     * Sets the results property value. The results of the hunting query.
     * @param value Value to set for the results property.
     */
    public void setResults(@jakarta.annotation.Nullable final java.util.List<HuntingRowResult> value) {
        this.results = value;
    }
    /**
     * Sets the schema property value. The schema for the response.
     * @param value Value to set for the schema property.
     */
    public void setSchema(@jakarta.annotation.Nullable final java.util.List<SinglePropertySchema> value) {
        this.schema = value;
    }
}
