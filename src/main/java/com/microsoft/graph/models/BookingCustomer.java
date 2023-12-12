package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a customer of the business.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BookingCustomer extends BookingCustomerBase implements Parsable {
    /**
     * Instantiates a new BookingCustomer and sets the default values.
     */
    public BookingCustomer() {
        super();
        this.setOdataType("#microsoft.graph.bookingCustomer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BookingCustomer
     */
    @jakarta.annotation.Nonnull
    public static BookingCustomer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingCustomer();
    }
    /**
     * Gets the addresses property value. Addresses associated with the customer. The attribute type of physicalAddress is not supported in v1.0. Internally we map the addresses to the type others.
     * @return a java.util.List<PhysicalAddress>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PhysicalAddress> getAddresses() {
        return this.backingStore.get("addresses");
    }
    /**
     * Gets the displayName property value. The name of the customer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the emailAddress property value. The SMTP address of the customer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.backingStore.get("emailAddress");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addresses", (n) -> { this.setAddresses(n.getCollectionOfObjectValues(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("phones", (n) -> { this.setPhones(n.getCollectionOfObjectValues(Phone::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the phones property value. Phone numbers associated with the customer, including home, business and mobile numbers.
     * @return a java.util.List<Phone>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Phone> getPhones() {
        return this.backingStore.get("phones");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("addresses", this.getAddresses());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeCollectionOfObjectValues("phones", this.getPhones());
    }
    /**
     * Sets the addresses property value. Addresses associated with the customer. The attribute type of physicalAddress is not supported in v1.0. Internally we map the addresses to the type others.
     * @param value Value to set for the addresses property.
     */
    public void setAddresses(@jakarta.annotation.Nullable final java.util.List<PhysicalAddress> value) {
        this.backingStore.set("addresses", value);
    }
    /**
     * Sets the displayName property value. The name of the customer.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the emailAddress property value. The SMTP address of the customer.
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailAddress", value);
    }
    /**
     * Sets the phones property value. Phone numbers associated with the customer, including home, business and mobile numbers.
     * @param value Value to set for the phones property.
     */
    public void setPhones(@jakarta.annotation.Nullable final java.util.List<Phone> value) {
        this.backingStore.set("phones", value);
    }
}
