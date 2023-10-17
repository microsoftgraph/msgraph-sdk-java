package com.microsoft.graph.models.security;

import com.microsoft.graph.models.PhysicalAddress;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WhoisContact implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The physical address of the entity.
     */
    private PhysicalAddress address;
    /**
     * The email of this WHOIS contact.
     */
    private String email;
    /**
     * The fax of this WHOIS contact. No format is guaranteed.
     */
    private String fax;
    /**
     * The name of this WHOIS contact.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The organization of this WHOIS contact.
     */
    private String organization;
    /**
     * The telephone of this WHOIS contact. No format is guaranteed.
     */
    private String telephone;
    /**
     * Instantiates a new WhoisContact and sets the default values.
     */
    public WhoisContact() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WhoisContact
     */
    @jakarta.annotation.Nonnull
    public static WhoisContact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WhoisContact();
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
     * Gets the address property value. The physical address of the entity.
     * @return a PhysicalAddress
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this.address;
    }
    /**
     * Gets the email property value. The email of this WHOIS contact.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * Gets the fax property value. The fax of this WHOIS contact. No format is guaranteed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFax() {
        return this.fax;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("fax", (n) -> { this.setFax(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getStringValue()); });
        deserializerMap.put("telephone", (n) -> { this.setTelephone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of this WHOIS contact.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the organization property value. The organization of this WHOIS contact.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganization() {
        return this.organization;
    }
    /**
     * Gets the telephone property value. The telephone of this WHOIS contact. No format is guaranteed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTelephone() {
        return this.telephone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("fax", this.getFax());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("organization", this.getOrganization());
        writer.writeStringValue("telephone", this.getTelephone());
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
     * Sets the address property value. The physical address of the entity.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.address = value;
    }
    /**
     * Sets the email property value. The email of this WHOIS contact.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the fax property value. The fax of this WHOIS contact. No format is guaranteed.
     * @param value Value to set for the fax property.
     */
    public void setFax(@jakarta.annotation.Nullable final String value) {
        this.fax = value;
    }
    /**
     * Sets the name property value. The name of this WHOIS contact.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the organization property value. The organization of this WHOIS contact.
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final String value) {
        this.organization = value;
    }
    /**
     * Sets the telephone property value. The telephone of this WHOIS contact. No format is guaranteed.
     * @param value Value to set for the telephone property.
     */
    public void setTelephone(@jakarta.annotation.Nullable final String value) {
        this.telephone = value;
    }
}
