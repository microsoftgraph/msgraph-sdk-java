package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
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
     * Instantiates a new NumberColumn and sets the default values.
     */
    public NumberColumn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NumberColumn
     */
    @jakarta.annotation.Nonnull
    public static NumberColumn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NumberColumn();
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
     * Gets the decimalPlaces property value. How many decimal places to display. See below for information about the possible values.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDecimalPlaces() {
        return this.decimalPlaces;
    }
    /**
     * Gets the displayAs property value. How the value should be presented in the UX. Must be one of number or percentage. If unspecified, treated as number.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayAs() {
        return this.displayAs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getMaximum() {
        return this.maximum;
    }
    /**
     * Gets the minimum property value. The minimum permitted value.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getMinimum() {
        return this.minimum;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("decimalPlaces", this.getDecimalPlaces());
        writer.writeStringValue("displayAs", this.getDisplayAs());
        writer.writeDoubleValue("maximum", this.getMaximum());
        writer.writeDoubleValue("minimum", this.getMinimum());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the decimalPlaces property value. How many decimal places to display. See below for information about the possible values.
     * @param value Value to set for the decimalPlaces property.
     */
    public void setDecimalPlaces(@jakarta.annotation.Nullable final String value) {
        this.decimalPlaces = value;
    }
    /**
     * Sets the displayAs property value. How the value should be presented in the UX. Must be one of number or percentage. If unspecified, treated as number.
     * @param value Value to set for the displayAs property.
     */
    public void setDisplayAs(@jakarta.annotation.Nullable final String value) {
        this.displayAs = value;
    }
    /**
     * Sets the maximum property value. The maximum permitted value.
     * @param value Value to set for the maximum property.
     */
    public void setMaximum(@jakarta.annotation.Nullable final Double value) {
        this.maximum = value;
    }
    /**
     * Sets the minimum property value. The minimum permitted value.
     * @param value Value to set for the minimum property.
     */
    public void setMinimum(@jakarta.annotation.Nullable final Double value) {
        this.minimum = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
