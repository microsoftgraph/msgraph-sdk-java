package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CountryNamedLocation extends NamedLocation implements Parsable {
    /** List of countries and/or regions in two-letter format specified by ISO 3166-2. Required. */
    private java.util.List<String> _countriesAndRegions;
    /** Determines what method is used to decide which country the user is located in. Possible values are clientIpAddress(default) and authenticatorAppGps. Note: authenticatorAppGps is not yet supported in the Microsoft Cloud for US Government. */
    private CountryLookupMethodType _countryLookupMethod;
    /** true if IP addresses that don't map to a country or region should be included in the named location. Optional. Default value is false. */
    private Boolean _includeUnknownCountriesAndRegions;
    /**
     * Instantiates a new CountryNamedLocation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CountryNamedLocation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CountryNamedLocation
     */
    @javax.annotation.Nonnull
    public static CountryNamedLocation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CountryNamedLocation();
    }
    /**
     * Gets the countriesAndRegions property value. List of countries and/or regions in two-letter format specified by ISO 3166-2. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCountriesAndRegions() {
        return this._countriesAndRegions;
    }
    /**
     * Gets the countryLookupMethod property value. Determines what method is used to decide which country the user is located in. Possible values are clientIpAddress(default) and authenticatorAppGps. Note: authenticatorAppGps is not yet supported in the Microsoft Cloud for US Government.
     * @return a countryLookupMethodType
     */
    @javax.annotation.Nullable
    public CountryLookupMethodType getCountryLookupMethod() {
        return this._countryLookupMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("countriesAndRegions", (n) -> { this.setCountriesAndRegions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("countryLookupMethod", (n) -> { this.setCountryLookupMethod(n.getEnumValue(CountryLookupMethodType.class)); });
        deserializerMap.put("includeUnknownCountriesAndRegions", (n) -> { this.setIncludeUnknownCountriesAndRegions(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeUnknownCountriesAndRegions property value. true if IP addresses that don't map to a country or region should be included in the named location. Optional. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIncludeUnknownCountriesAndRegions() {
        return this._includeUnknownCountriesAndRegions;
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
        writer.writeCollectionOfPrimitiveValues("countriesAndRegions", this.getCountriesAndRegions());
        writer.writeEnumValue("countryLookupMethod", this.getCountryLookupMethod());
        writer.writeBooleanValue("includeUnknownCountriesAndRegions", this.getIncludeUnknownCountriesAndRegions());
    }
    /**
     * Sets the countriesAndRegions property value. List of countries and/or regions in two-letter format specified by ISO 3166-2. Required.
     * @param value Value to set for the countriesAndRegions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountriesAndRegions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._countriesAndRegions = value;
    }
    /**
     * Sets the countryLookupMethod property value. Determines what method is used to decide which country the user is located in. Possible values are clientIpAddress(default) and authenticatorAppGps. Note: authenticatorAppGps is not yet supported in the Microsoft Cloud for US Government.
     * @param value Value to set for the countryLookupMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountryLookupMethod(@javax.annotation.Nullable final CountryLookupMethodType value) {
        this._countryLookupMethod = value;
    }
    /**
     * Sets the includeUnknownCountriesAndRegions property value. true if IP addresses that don't map to a country or region should be included in the named location. Optional. Default value is false.
     * @param value Value to set for the includeUnknownCountriesAndRegions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeUnknownCountriesAndRegions(@javax.annotation.Nullable final Boolean value) {
        this._includeUnknownCountriesAndRegions = value;
    }
}
