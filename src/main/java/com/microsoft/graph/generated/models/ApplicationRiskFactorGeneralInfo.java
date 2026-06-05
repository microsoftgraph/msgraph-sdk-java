package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.LocalDate;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicationRiskFactorGeneralInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ApplicationRiskFactorGeneralInfo} and sets the default values.
     */
    public ApplicationRiskFactorGeneralInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicationRiskFactorGeneralInfo}
     */
    @jakarta.annotation.Nonnull
    public static ApplicationRiskFactorGeneralInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationRiskFactorGeneralInfo();
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
     * Gets the consumerPopularity property value. Indicates the relative popularity or adoption of the application based on the user or tenant usage metrics.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getConsumerPopularity() {
        return this.backingStore.get("consumerPopularity");
    }
    /**
     * Gets the domainRegistrationDate property value. Specifies the date when the application&apos;s primary domain was registered, used to assess domain maturity and legitimacy.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getDomainRegistrationDate() {
        return this.backingStore.get("domainRegistrationDate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("consumerPopularity", (n) -> { this.setConsumerPopularity(n.getIntegerValue()); });
        deserializerMap.put("domainRegistrationDate", (n) -> { this.setDomainRegistrationDate(n.getLocalDateValue()); });
        deserializerMap.put("founded", (n) -> { this.setFounded(n.getIntegerValue()); });
        deserializerMap.put("hasDisasterRecoveryPlan", (n) -> { this.setHasDisasterRecoveryPlan(n.getBooleanValue()); });
        deserializerMap.put("hold", (n) -> { this.setHold(n.getEnumValue(HoldType::forValue)); });
        deserializerMap.put("hostingCompanyName", (n) -> { this.setHostingCompanyName(n.getStringValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(ApplicationLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("privacyPolicy", (n) -> { this.setPrivacyPolicy(n.getStringValue()); });
        deserializerMap.put("processedDataTypes", (n) -> { this.setProcessedDataTypes(n.getEnumSetValue(ApplicationDataType::forValue)); });
        deserializerMap.put("termsOfService", (n) -> { this.setTermsOfService(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the founded property value. Year the company or organization behind the application was founded.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFounded() {
        return this.backingStore.get("founded");
    }
    /**
     * Gets the hasDisasterRecoveryPlan property value. Indicates whether the application provider maintains a disaster recovery or business continuity plan.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasDisasterRecoveryPlan() {
        return this.backingStore.get("hasDisasterRecoveryPlan");
    }
    /**
     * Gets the hold property value. The hold property
     * @return a {@link HoldType}
     */
    @jakarta.annotation.Nullable
    public HoldType getHold() {
        return this.backingStore.get("hold");
    }
    /**
     * Gets the hostingCompanyName property value. Specifies the name of the company or provider that hosts the application&apos;s infrastructure.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHostingCompanyName() {
        return this.backingStore.get("hostingCompanyName");
    }
    /**
     * Gets the location property value. Provides the geographical and operational location information for the application, including data center and headquarters regions.
     * @return a {@link ApplicationLocation}
     */
    @jakarta.annotation.Nullable
    public ApplicationLocation getLocation() {
        return this.backingStore.get("location");
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
     * Gets the privacyPolicy property value. Specifies the URL of the application&apos;s privacy policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrivacyPolicy() {
        return this.backingStore.get("privacyPolicy");
    }
    /**
     * Gets the processedDataTypes property value. The processedDataTypes property
     * @return a {@link EnumSet<ApplicationDataType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ApplicationDataType> getProcessedDataTypes() {
        return this.backingStore.get("processedDataTypes");
    }
    /**
     * Gets the termsOfService property value. Specifies the URL of the application&apos;s terms of service.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTermsOfService() {
        return this.backingStore.get("termsOfService");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("consumerPopularity", this.getConsumerPopularity());
        writer.writeLocalDateValue("domainRegistrationDate", this.getDomainRegistrationDate());
        writer.writeIntegerValue("founded", this.getFounded());
        writer.writeBooleanValue("hasDisasterRecoveryPlan", this.getHasDisasterRecoveryPlan());
        writer.writeEnumValue("hold", this.getHold());
        writer.writeStringValue("hostingCompanyName", this.getHostingCompanyName());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("privacyPolicy", this.getPrivacyPolicy());
        writer.writeEnumSetValue("processedDataTypes", this.getProcessedDataTypes());
        writer.writeStringValue("termsOfService", this.getTermsOfService());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the consumerPopularity property value. Indicates the relative popularity or adoption of the application based on the user or tenant usage metrics.
     * @param value Value to set for the consumerPopularity property.
     */
    public void setConsumerPopularity(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("consumerPopularity", value);
    }
    /**
     * Sets the domainRegistrationDate property value. Specifies the date when the application&apos;s primary domain was registered, used to assess domain maturity and legitimacy.
     * @param value Value to set for the domainRegistrationDate property.
     */
    public void setDomainRegistrationDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("domainRegistrationDate", value);
    }
    /**
     * Sets the founded property value. Year the company or organization behind the application was founded.
     * @param value Value to set for the founded property.
     */
    public void setFounded(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("founded", value);
    }
    /**
     * Sets the hasDisasterRecoveryPlan property value. Indicates whether the application provider maintains a disaster recovery or business continuity plan.
     * @param value Value to set for the hasDisasterRecoveryPlan property.
     */
    public void setHasDisasterRecoveryPlan(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasDisasterRecoveryPlan", value);
    }
    /**
     * Sets the hold property value. The hold property
     * @param value Value to set for the hold property.
     */
    public void setHold(@jakarta.annotation.Nullable final HoldType value) {
        this.backingStore.set("hold", value);
    }
    /**
     * Sets the hostingCompanyName property value. Specifies the name of the company or provider that hosts the application&apos;s infrastructure.
     * @param value Value to set for the hostingCompanyName property.
     */
    public void setHostingCompanyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hostingCompanyName", value);
    }
    /**
     * Sets the location property value. Provides the geographical and operational location information for the application, including data center and headquarters regions.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final ApplicationLocation value) {
        this.backingStore.set("location", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the privacyPolicy property value. Specifies the URL of the application&apos;s privacy policy.
     * @param value Value to set for the privacyPolicy property.
     */
    public void setPrivacyPolicy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("privacyPolicy", value);
    }
    /**
     * Sets the processedDataTypes property value. The processedDataTypes property
     * @param value Value to set for the processedDataTypes property.
     */
    public void setProcessedDataTypes(@jakarta.annotation.Nullable final EnumSet<ApplicationDataType> value) {
        this.backingStore.set("processedDataTypes", value);
    }
    /**
     * Sets the termsOfService property value. Specifies the URL of the application&apos;s terms of service.
     * @param value Value to set for the termsOfService property.
     */
    public void setTermsOfService(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("termsOfService", value);
    }
}
