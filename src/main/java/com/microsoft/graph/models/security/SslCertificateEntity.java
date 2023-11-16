package com.microsoft.graph.models.security;

import com.microsoft.graph.models.PhysicalAddress;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SslCertificateEntity implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new SslCertificateEntity and sets the default values.
     */
    public SslCertificateEntity() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SslCertificateEntity
     */
    @jakarta.annotation.Nonnull
    public static SslCertificateEntity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SslCertificateEntity();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the address property value. A physical address of the entity.
     * @return a PhysicalAddress
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this.BackingStore.get("address");
    }
    /**
     * Gets the alternateNames property value. Alternate names for this entity that are part of the certificate.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAlternateNames() {
        return this.BackingStore.get("alternateNames");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the commonName property value. A common name for this entity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCommonName() {
        return this.BackingStore.get("commonName");
    }
    /**
     * Gets the email property value. An email for this entity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.BackingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("alternateNames", (n) -> { this.setAlternateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("commonName", (n) -> { this.setCommonName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("givenName", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organizationName", (n) -> { this.setOrganizationName(n.getStringValue()); });
        deserializerMap.put("organizationUnitName", (n) -> { this.setOrganizationUnitName(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("surname", (n) -> { this.setSurname(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the givenName property value. If the entity is a person, this is the person's given name (first name).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGivenName() {
        return this.BackingStore.get("givenName");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the organizationName property value. If the entity is an organization, this is the name of the organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationName() {
        return this.BackingStore.get("organizationName");
    }
    /**
     * Gets the organizationUnitName property value. If the entity is an organization, this communicates if a unit in the organization is named on the entity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationUnitName() {
        return this.BackingStore.get("organizationUnitName");
    }
    /**
     * Gets the serialNumber property value. A serial number assigned to the entity; usually only available if the entity is the issuer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.BackingStore.get("serialNumber");
    }
    /**
     * Gets the surname property value. If the entity is a person, this is the person's surname (last name).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSurname() {
        return this.BackingStore.get("surname");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeCollectionOfPrimitiveValues("alternateNames", this.getAlternateNames());
        writer.writeStringValue("commonName", this.getCommonName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("organizationName", this.getOrganizationName());
        writer.writeStringValue("organizationUnitName", this.getOrganizationUnitName());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the address property value. A physical address of the entity.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.BackingStore.set("address", value);
    }
    /**
     * Sets the alternateNames property value. Alternate names for this entity that are part of the certificate.
     * @param value Value to set for the alternateNames property.
     */
    public void setAlternateNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("alternateNames", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the commonName property value. A common name for this entity.
     * @param value Value to set for the commonName property.
     */
    public void setCommonName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("commonName", value);
    }
    /**
     * Sets the email property value. An email for this entity.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("email", value);
    }
    /**
     * Sets the givenName property value. If the entity is a person, this is the person's given name (first name).
     * @param value Value to set for the givenName property.
     */
    public void setGivenName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("givenName", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the organizationName property value. If the entity is an organization, this is the name of the organization.
     * @param value Value to set for the organizationName property.
     */
    public void setOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("organizationName", value);
    }
    /**
     * Sets the organizationUnitName property value. If the entity is an organization, this communicates if a unit in the organization is named on the entity.
     * @param value Value to set for the organizationUnitName property.
     */
    public void setOrganizationUnitName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("organizationUnitName", value);
    }
    /**
     * Sets the serialNumber property value. A serial number assigned to the entity; usually only available if the entity is the issuer.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("serialNumber", value);
    }
    /**
     * Sets the surname property value. If the entity is a person, this is the person's surname (last name).
     * @param value Value to set for the surname property.
     */
    public void setSurname(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("surname", value);
    }
}
