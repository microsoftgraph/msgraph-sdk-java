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
public class BookingPageSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link BookingPageSettings} and sets the default values.
     */
    public BookingPageSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BookingPageSettings}
     */
    @jakarta.annotation.Nonnull
    public static BookingPageSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingPageSettings();
    }
    /**
     * Gets the accessControl property value. The accessControl property
     * @return a {@link BookingPageAccessControl}
     */
    @jakarta.annotation.Nullable
    public BookingPageAccessControl getAccessControl() {
        return this.backingStore.get("accessControl");
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the bookingPageColorCode property value. Custom color for the booking page. The value should be in Hex format. For example, #123456.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBookingPageColorCode() {
        return this.backingStore.get("bookingPageColorCode");
    }
    /**
     * Gets the businessTimeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessTimeZone() {
        return this.backingStore.get("businessTimeZone");
    }
    /**
     * Gets the customerConsentMessage property value. The personal data collection and usage consent message in the booking page.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerConsentMessage() {
        return this.backingStore.get("customerConsentMessage");
    }
    /**
     * Gets the enforceOneTimePassword property value. Determines whether the one-time password is required to create an appointment. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnforceOneTimePassword() {
        return this.backingStore.get("enforceOneTimePassword");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("accessControl", (n) -> { this.setAccessControl(n.getEnumValue(BookingPageAccessControl::forValue)); });
        deserializerMap.put("bookingPageColorCode", (n) -> { this.setBookingPageColorCode(n.getStringValue()); });
        deserializerMap.put("businessTimeZone", (n) -> { this.setBusinessTimeZone(n.getStringValue()); });
        deserializerMap.put("customerConsentMessage", (n) -> { this.setCustomerConsentMessage(n.getStringValue()); });
        deserializerMap.put("enforceOneTimePassword", (n) -> { this.setEnforceOneTimePassword(n.getBooleanValue()); });
        deserializerMap.put("isBusinessLogoDisplayEnabled", (n) -> { this.setIsBusinessLogoDisplayEnabled(n.getBooleanValue()); });
        deserializerMap.put("isCustomerConsentEnabled", (n) -> { this.setIsCustomerConsentEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSearchEngineIndexabilityDisabled", (n) -> { this.setIsSearchEngineIndexabilityDisabled(n.getBooleanValue()); });
        deserializerMap.put("isTimeSlotTimeZoneSetToBusinessTimeZone", (n) -> { this.setIsTimeSlotTimeZoneSetToBusinessTimeZone(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("privacyPolicyWebUrl", (n) -> { this.setPrivacyPolicyWebUrl(n.getStringValue()); });
        deserializerMap.put("termsAndConditionsWebUrl", (n) -> { this.setTermsAndConditionsWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isBusinessLogoDisplayEnabled property value. Indicates whether the business logo is displayed on the booking page. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBusinessLogoDisplayEnabled() {
        return this.backingStore.get("isBusinessLogoDisplayEnabled");
    }
    /**
     * Gets the isCustomerConsentEnabled property value. Enables personal data collection and the usage consent toggle on the booking page. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCustomerConsentEnabled() {
        return this.backingStore.get("isCustomerConsentEnabled");
    }
    /**
     * Gets the isSearchEngineIndexabilityDisabled property value. Indicates whether web crawlers index this page. The defaults value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSearchEngineIndexabilityDisabled() {
        return this.backingStore.get("isSearchEngineIndexabilityDisabled");
    }
    /**
     * Gets the isTimeSlotTimeZoneSetToBusinessTimeZone property value. Indicates whether the time zone of the time slot is set to the time zone of the business. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTimeSlotTimeZoneSetToBusinessTimeZone() {
        return this.backingStore.get("isTimeSlotTimeZoneSetToBusinessTimeZone");
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
     * Gets the privacyPolicyWebUrl property value. URL of a webpage that provides the terms and conditions of the business. If a privacy policy isn&apos;t included, the following text appears on the booking page as default: &apos;The policies and practices of {bookingbusinessname} apply to the use of your data.&apos;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrivacyPolicyWebUrl() {
        return this.backingStore.get("privacyPolicyWebUrl");
    }
    /**
     * Gets the termsAndConditionsWebUrl property value. URL of a webpage that provides the terms and conditions of the business.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTermsAndConditionsWebUrl() {
        return this.backingStore.get("termsAndConditionsWebUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessControl", this.getAccessControl());
        writer.writeStringValue("bookingPageColorCode", this.getBookingPageColorCode());
        writer.writeStringValue("businessTimeZone", this.getBusinessTimeZone());
        writer.writeStringValue("customerConsentMessage", this.getCustomerConsentMessage());
        writer.writeBooleanValue("enforceOneTimePassword", this.getEnforceOneTimePassword());
        writer.writeBooleanValue("isBusinessLogoDisplayEnabled", this.getIsBusinessLogoDisplayEnabled());
        writer.writeBooleanValue("isCustomerConsentEnabled", this.getIsCustomerConsentEnabled());
        writer.writeBooleanValue("isSearchEngineIndexabilityDisabled", this.getIsSearchEngineIndexabilityDisabled());
        writer.writeBooleanValue("isTimeSlotTimeZoneSetToBusinessTimeZone", this.getIsTimeSlotTimeZoneSetToBusinessTimeZone());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("privacyPolicyWebUrl", this.getPrivacyPolicyWebUrl());
        writer.writeStringValue("termsAndConditionsWebUrl", this.getTermsAndConditionsWebUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessControl property value. The accessControl property
     * @param value Value to set for the accessControl property.
     */
    public void setAccessControl(@jakarta.annotation.Nullable final BookingPageAccessControl value) {
        this.backingStore.set("accessControl", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
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
     * Sets the bookingPageColorCode property value. Custom color for the booking page. The value should be in Hex format. For example, #123456.
     * @param value Value to set for the bookingPageColorCode property.
     */
    public void setBookingPageColorCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bookingPageColorCode", value);
    }
    /**
     * Sets the businessTimeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @param value Value to set for the businessTimeZone property.
     */
    public void setBusinessTimeZone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("businessTimeZone", value);
    }
    /**
     * Sets the customerConsentMessage property value. The personal data collection and usage consent message in the booking page.
     * @param value Value to set for the customerConsentMessage property.
     */
    public void setCustomerConsentMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customerConsentMessage", value);
    }
    /**
     * Sets the enforceOneTimePassword property value. Determines whether the one-time password is required to create an appointment. The default value is false.
     * @param value Value to set for the enforceOneTimePassword property.
     */
    public void setEnforceOneTimePassword(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enforceOneTimePassword", value);
    }
    /**
     * Sets the isBusinessLogoDisplayEnabled property value. Indicates whether the business logo is displayed on the booking page. The default value is false.
     * @param value Value to set for the isBusinessLogoDisplayEnabled property.
     */
    public void setIsBusinessLogoDisplayEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBusinessLogoDisplayEnabled", value);
    }
    /**
     * Sets the isCustomerConsentEnabled property value. Enables personal data collection and the usage consent toggle on the booking page. The default value is false.
     * @param value Value to set for the isCustomerConsentEnabled property.
     */
    public void setIsCustomerConsentEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCustomerConsentEnabled", value);
    }
    /**
     * Sets the isSearchEngineIndexabilityDisabled property value. Indicates whether web crawlers index this page. The defaults value is false.
     * @param value Value to set for the isSearchEngineIndexabilityDisabled property.
     */
    public void setIsSearchEngineIndexabilityDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSearchEngineIndexabilityDisabled", value);
    }
    /**
     * Sets the isTimeSlotTimeZoneSetToBusinessTimeZone property value. Indicates whether the time zone of the time slot is set to the time zone of the business. The default value is false.
     * @param value Value to set for the isTimeSlotTimeZoneSetToBusinessTimeZone property.
     */
    public void setIsTimeSlotTimeZoneSetToBusinessTimeZone(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTimeSlotTimeZoneSetToBusinessTimeZone", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the privacyPolicyWebUrl property value. URL of a webpage that provides the terms and conditions of the business. If a privacy policy isn&apos;t included, the following text appears on the booking page as default: &apos;The policies and practices of {bookingbusinessname} apply to the use of your data.&apos;
     * @param value Value to set for the privacyPolicyWebUrl property.
     */
    public void setPrivacyPolicyWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("privacyPolicyWebUrl", value);
    }
    /**
     * Sets the termsAndConditionsWebUrl property value. URL of a webpage that provides the terms and conditions of the business.
     * @param value Value to set for the termsAndConditionsWebUrl property.
     */
    public void setTermsAndConditionsWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("termsAndConditionsWebUrl", value);
    }
}
