package com.microsoft.graph.models;

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
public class OidcInboundClaimMappingOverride implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OidcInboundClaimMappingOverride} and sets the default values.
     */
    public OidcInboundClaimMappingOverride() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OidcInboundClaimMappingOverride}
     */
    @jakarta.annotation.Nonnull
    public static OidcInboundClaimMappingOverride createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OidcInboundClaimMappingOverride();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the address property value. The address property
     * @return a {@link OidcAddressInboundClaims}
     */
    @jakarta.annotation.Nullable
    public OidcAddressInboundClaims getAddress() {
        return this.backingStore.get("address");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the email property value. The email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * Gets the email_verified property value. The email_verified property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailVerified() {
        return this.backingStore.get("emailVerified");
    }
    /**
     * Gets the family_name property value. The family_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFamilyName() {
        return this.backingStore.get("familyName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(OidcAddressInboundClaims::createFromDiscriminatorValue)); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("email_verified", (n) -> { this.setEmailVerified(n.getStringValue()); });
        deserializerMap.put("family_name", (n) -> { this.setFamilyName(n.getStringValue()); });
        deserializerMap.put("given_name", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("phone_number", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("phone_number_verified", (n) -> { this.setPhoneNumberVerified(n.getStringValue()); });
        deserializerMap.put("sub", (n) -> { this.setSub(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the given_name property value. The given_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGivenName() {
        return this.backingStore.get("givenName");
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the phone_number property value. The phone_number property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.backingStore.get("phoneNumber");
    }
    /**
     * Gets the phone_number_verified property value. The phone_number_verified property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumberVerified() {
        return this.backingStore.get("phoneNumberVerified");
    }
    /**
     * Gets the sub property value. The sub property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSub() {
        return this.backingStore.get("sub");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("email_verified", this.getEmailVerified());
        writer.writeStringValue("family_name", this.getFamilyName());
        writer.writeStringValue("given_name", this.getGivenName());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("phone_number", this.getPhoneNumber());
        writer.writeStringValue("phone_number_verified", this.getPhoneNumberVerified());
        writer.writeStringValue("sub", this.getSub());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the address property value. The address property
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final OidcAddressInboundClaims value) {
        this.backingStore.set("address", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the email_verified property value. The email_verified property
     * @param value Value to set for the email_verified property.
     */
    public void setEmailVerified(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailVerified", value);
    }
    /**
     * Sets the family_name property value. The family_name property
     * @param value Value to set for the family_name property.
     */
    public void setFamilyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("familyName", value);
    }
    /**
     * Sets the given_name property value. The given_name property
     * @param value Value to set for the given_name property.
     */
    public void setGivenName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("givenName", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the phone_number property value. The phone_number property
     * @param value Value to set for the phone_number property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phoneNumber", value);
    }
    /**
     * Sets the phone_number_verified property value. The phone_number_verified property
     * @param value Value to set for the phone_number_verified property.
     */
    public void setPhoneNumberVerified(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phoneNumberVerified", value);
    }
    /**
     * Sets the sub property value. The sub property
     * @param value Value to set for the sub property.
     */
    public void setSub(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sub", value);
    }
}
