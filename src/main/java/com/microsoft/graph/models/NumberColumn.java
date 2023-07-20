package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NumberColumn implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * How many decimal places to display. See below for information about the possible values.
     */
    private String decimalPlaces;
    /**
     * How the value should be presented in the UX. Must be one of number or percentage. If unspecified, treated as number.
     */
    private String displayAs;
    /**
     * The maximum permitted value.
     */
    private Double maximum;
    /**
     * The minimum permitted value.
     */
    private Double minimum;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new numberColumn and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NumberColumn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a numberColumn
     */
    @javax.annotation.Nonnull
    public static NumberColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NumberColumn();
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
     * Gets the decimalPlaces property value. How many decimal places to display. See below for information about the possible values.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDecimalPlaces() {
        return this.decimalPlaces;
    }
    /**
     * Gets the displayAs property value. How the value should be presented in the UX. Must be one of number or percentage. If unspecified, treated as number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayAs() {
        return this.displayAs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("decimalPlaces", (n) -> { this.setDecimalPlaces(n.getStringValue()); });
        deserializerMap.put("displayAs", (n) -> { this.setDisplayAs(n.getStringValue()); });
        deserializerMap.put("maximum", (n) -> { this.setMaximum(n.getDoubleValue()); });
        deserializerMap.put("minimum", (n) -> { this.setMinimum(n.getDoubleValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximum property value. The maximum permitted value.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaximum() {
        return this.maximum;
    }
    /**
     * Gets the minimum property value. The minimum permitted value.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMinimum() {
        return this.minimum;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("decimalPlaces", this.getDecimalPlaces());
        writer.writeStringValue("displayAs", this.getDisplayAs());
        writer.writeDoubleValue("maximum", this.getMaximum());
        writer.writeDoubleValue("minimum", this.getMinimum());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the decimalPlaces property value. How many decimal places to display. See below for information about the possible values.
     * @param value Value to set for the decimalPlaces property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDecimalPlaces(@javax.annotation.Nullable final String value) {
        this.decimalPlaces = value;
    }
    /**
     * Sets the displayAs property value. How the value should be presented in the UX. Must be one of number or percentage. If unspecified, treated as number.
     * @param value Value to set for the displayAs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayAs(@javax.annotation.Nullable final String value) {
        this.displayAs = value;
    }
    /**
     * Sets the maximum property value. The maximum permitted value.
     * @param value Value to set for the maximum property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximum(@javax.annotation.Nullable final Double value) {
        this.maximum = value;
    }
    /**
     * Sets the minimum property value. The minimum permitted value.
     * @param value Value to set for the minimum property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimum(@javax.annotation.Nullable final Double value) {
        this.minimum = value;
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
}
