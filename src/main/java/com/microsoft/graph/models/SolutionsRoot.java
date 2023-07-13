package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SolutionsRoot implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The bookingBusinesses property
     */
    private java.util.List<BookingBusiness> bookingBusinesses;
    /**
     * The bookingCurrencies property
     */
    private java.util.List<BookingCurrency> bookingCurrencies;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new solutionsRoot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SolutionsRoot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a solutionsRoot
     */
    @javax.annotation.Nonnull
    public static SolutionsRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SolutionsRoot();
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
     * Gets the bookingBusinesses property value. The bookingBusinesses property
     * @return a bookingBusiness
     */
    @javax.annotation.Nullable
    public java.util.List<BookingBusiness> getBookingBusinesses() {
        return this.bookingBusinesses;
    }
    /**
     * Gets the bookingCurrencies property value. The bookingCurrencies property
     * @return a bookingCurrency
     */
    @javax.annotation.Nullable
    public java.util.List<BookingCurrency> getBookingCurrencies() {
        return this.bookingCurrencies;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("bookingBusinesses", (n) -> { this.setBookingBusinesses(n.getCollectionOfObjectValues(BookingBusiness::createFromDiscriminatorValue)); });
        deserializerMap.put("bookingCurrencies", (n) -> { this.setBookingCurrencies(n.getCollectionOfObjectValues(BookingCurrency::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeCollectionOfObjectValues("bookingBusinesses", this.getBookingBusinesses());
        writer.writeCollectionOfObjectValues("bookingCurrencies", this.getBookingCurrencies());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the bookingBusinesses property value. The bookingBusinesses property
     * @param value Value to set for the bookingBusinesses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBookingBusinesses(@javax.annotation.Nullable final java.util.List<BookingBusiness> value) {
        this.bookingBusinesses = value;
    }
    /**
     * Sets the bookingCurrencies property value. The bookingCurrencies property
     * @param value Value to set for the bookingCurrencies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBookingCurrencies(@javax.annotation.Nullable final java.util.List<BookingCurrency> value) {
        this.bookingCurrencies = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
