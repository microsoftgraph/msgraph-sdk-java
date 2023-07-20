package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CalculatedColumn implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * For dateTime output types, the format of the value. Possible values are: dateOnly or dateTime.
     */
    private String format;
    /**
     * The formula used to compute the value for this column.
     */
    private String formula;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The output type used to format values in this column. Possible values are: boolean, currency, dateTime, number, or text.
     */
    private String outputType;
    /**
     * Instantiates a new calculatedColumn and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CalculatedColumn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a calculatedColumn
     */
    @javax.annotation.Nonnull
    public static CalculatedColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalculatedColumn();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("format", (n) -> { this.setFormat(n.getStringValue()); });
        deserializerMap.put("formula", (n) -> { this.setFormula(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("outputType", (n) -> { this.setOutputType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. For dateTime output types, the format of the value. Possible values are: dateOnly or dateTime.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFormat() {
        return this.format;
    }
    /**
     * Gets the formula property value. The formula used to compute the value for this column.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFormula() {
        return this.formula;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the outputType property value. The output type used to format values in this column. Possible values are: boolean, currency, dateTime, number, or text.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOutputType() {
        return this.outputType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("format", this.getFormat());
        writer.writeStringValue("formula", this.getFormula());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("outputType", this.getOutputType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the format property value. For dateTime output types, the format of the value. Possible values are: dateOnly or dateTime.
     * @param value Value to set for the format property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final String value) {
        this.format = value;
    }
    /**
     * Sets the formula property value. The formula used to compute the value for this column.
     * @param value Value to set for the formula property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormula(@javax.annotation.Nullable final String value) {
        this.formula = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the outputType property value. The output type used to format values in this column. Possible values are: boolean, currency, dateTime, number, or text.
     * @param value Value to set for the outputType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutputType(@javax.annotation.Nullable final String value) {
        this.outputType = value;
    }
}
