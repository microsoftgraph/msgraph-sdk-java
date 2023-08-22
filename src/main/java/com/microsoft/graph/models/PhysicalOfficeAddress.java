package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhysicalOfficeAddress implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The city.
     */
    private String city;
    /**
     * The country or region. It's a free-format string value, for example, 'United States'.
     */
    private String countryOrRegion;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Office location such as building and office number for an organizational contact.
     */
    private String officeLocation;
    /**
     * The postal code.
     */
    private String postalCode;
    /**
     * The state.
     */
    private String state;
    /**
     * The street.
     */
    private String street;
    /**
     * Instantiates a new physicalOfficeAddress and sets the default values.
     */
    public PhysicalOfficeAddress() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a physicalOfficeAddress
     */
    @jakarta.annotation.Nonnull
    public static PhysicalOfficeAddress createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhysicalOfficeAddress();
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
     * Gets the city property value. The city.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the countryOrRegion property value. The country or region. It's a free-format string value, for example, 'United States'.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCountryOrRegion() {
        return this.countryOrRegion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("countryOrRegion", (n) -> { this.setCountryOrRegion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("officeLocation", (n) -> { this.setOfficeLocation(n.getStringValue()); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("street", (n) -> { this.setStreet(n.getStringValue()); });
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
     * Gets the officeLocation property value. Office location such as building and office number for an organizational contact.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOfficeLocation() {
        return this.officeLocation;
    }
    /**
     * Gets the postalCode property value. The postal code.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Gets the state property value. The state.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the street property value. The street.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getStreet() {
        return this.street;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("countryOrRegion", this.getCountryOrRegion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("officeLocation", this.getOfficeLocation());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("street", this.getStreet());
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
     * Sets the city property value. The city.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the countryOrRegion property value. The country or region. It's a free-format string value, for example, 'United States'.
     * @param value Value to set for the countryOrRegion property.
     */
    public void setCountryOrRegion(@jakarta.annotation.Nullable final String value) {
        this.countryOrRegion = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the officeLocation property value. Office location such as building and office number for an organizational contact.
     * @param value Value to set for the officeLocation property.
     */
    public void setOfficeLocation(@jakarta.annotation.Nullable final String value) {
        this.officeLocation = value;
    }
    /**
     * Sets the postalCode property value. The postal code.
     * @param value Value to set for the postalCode property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.postalCode = value;
    }
    /**
     * Sets the state property value. The state.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the street property value. The street.
     * @param value Value to set for the street property.
     */
    public void setStreet(@jakarta.annotation.Nullable final String value) {
        this.street = value;
    }
}
