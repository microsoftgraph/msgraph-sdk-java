package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PhysicalAddress implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The city. */
    private String _city;
    /** The country or region. It's a free-format string value, for example, 'United States'. */
    private String _countryOrRegion;
    /** The OdataType property */
    private String _odataType;
    /** The postal code. */
    private String _postalCode;
    /** The state. */
    private String _state;
    /** The street. */
    private String _street;
    /**
     * Instantiates a new physicalAddress and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PhysicalAddress() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.physicalAddress");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a physicalAddress
     */
    @javax.annotation.Nonnull
    public static PhysicalAddress createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhysicalAddress();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the city property value. The city.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this._city;
    }
    /**
     * Gets the countryOrRegion property value. The country or region. It's a free-format string value, for example, 'United States'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryOrRegion() {
        return this._countryOrRegion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PhysicalAddress currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("city", (n) -> { currentObject.setCity(n.getStringValue()); });
            this.put("countryOrRegion", (n) -> { currentObject.setCountryOrRegion(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("postalCode", (n) -> { currentObject.setPostalCode(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getStringValue()); });
            this.put("street", (n) -> { currentObject.setStreet(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the postalCode property value. The postal code.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostalCode() {
        return this._postalCode;
    }
    /**
     * Gets the state property value. The state.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Gets the street property value. The street.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStreet() {
        return this._street;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("countryOrRegion", this.getCountryOrRegion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("street", this.getStreet());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the city property value. The city.
     * @param value Value to set for the city property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCity(@javax.annotation.Nullable final String value) {
        this._city = value;
    }
    /**
     * Sets the countryOrRegion property value. The country or region. It's a free-format string value, for example, 'United States'.
     * @param value Value to set for the countryOrRegion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountryOrRegion(@javax.annotation.Nullable final String value) {
        this._countryOrRegion = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the postalCode property value. The postal code.
     * @param value Value to set for the postalCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostalCode(@javax.annotation.Nullable final String value) {
        this._postalCode = value;
    }
    /**
     * Sets the state property value. The state.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
    /**
     * Sets the street property value. The street.
     * @param value Value to set for the street property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStreet(@javax.annotation.Nullable final String value) {
        this._street = value;
    }
}
