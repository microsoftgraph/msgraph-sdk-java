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
public class ApplicationRiskFactors implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ApplicationRiskFactors} and sets the default values.
     */
    public ApplicationRiskFactors() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicationRiskFactors}
     */
    @jakarta.annotation.Nonnull
    public static ApplicationRiskFactors createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationRiskFactors();
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
     * Gets the compliance property value. Provides information about the application&apos;s adherence to security frameworks, certifications, and industry compliance standards.
     * @return a {@link ApplicationSecurityCompliance}
     */
    @jakarta.annotation.Nullable
    public ApplicationSecurityCompliance getCompliance() {
        return this.backingStore.get("compliance");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("compliance", (n) -> { this.setCompliance(n.getObjectValue(ApplicationSecurityCompliance::createFromDiscriminatorValue)); });
        deserializerMap.put("general", (n) -> { this.setGeneral(n.getObjectValue(ApplicationRiskFactorGeneralInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("legal", (n) -> { this.setLegal(n.getObjectValue(ApplicationRiskFactorLegalInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("security", (n) -> { this.setSecurity(n.getObjectValue(ApplicationRiskFactorSecurityInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the general property value. Contains general business, operational, and data handling details that influence the application&apos;s risk assessment.
     * @return a {@link ApplicationRiskFactorGeneralInfo}
     */
    @jakarta.annotation.Nullable
    public ApplicationRiskFactorGeneralInfo getGeneral() {
        return this.backingStore.get("general");
    }
    /**
     * Gets the legal property value. Provides legal and regulatory compliance information, including data ownership, retention, and GDPR adherence.
     * @return a {@link ApplicationRiskFactorLegalInfo}
     */
    @jakarta.annotation.Nullable
    public ApplicationRiskFactorLegalInfo getLegal() {
        return this.backingStore.get("legal");
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
     * Gets the security property value. Contains information related to the application&apos;s security posture, such as encryption, authentication, and vulnerability management practices.
     * @return a {@link ApplicationRiskFactorSecurityInfo}
     */
    @jakarta.annotation.Nullable
    public ApplicationRiskFactorSecurityInfo getSecurity() {
        return this.backingStore.get("security");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("compliance", this.getCompliance());
        writer.writeObjectValue("general", this.getGeneral());
        writer.writeObjectValue("legal", this.getLegal());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("security", this.getSecurity());
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
     * Sets the compliance property value. Provides information about the application&apos;s adherence to security frameworks, certifications, and industry compliance standards.
     * @param value Value to set for the compliance property.
     */
    public void setCompliance(@jakarta.annotation.Nullable final ApplicationSecurityCompliance value) {
        this.backingStore.set("compliance", value);
    }
    /**
     * Sets the general property value. Contains general business, operational, and data handling details that influence the application&apos;s risk assessment.
     * @param value Value to set for the general property.
     */
    public void setGeneral(@jakarta.annotation.Nullable final ApplicationRiskFactorGeneralInfo value) {
        this.backingStore.set("general", value);
    }
    /**
     * Sets the legal property value. Provides legal and regulatory compliance information, including data ownership, retention, and GDPR adherence.
     * @param value Value to set for the legal property.
     */
    public void setLegal(@jakarta.annotation.Nullable final ApplicationRiskFactorLegalInfo value) {
        this.backingStore.set("legal", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the security property value. Contains information related to the application&apos;s security posture, such as encryption, authentication, and vulnerability management practices.
     * @param value Value to set for the security property.
     */
    public void setSecurity(@jakarta.annotation.Nullable final ApplicationRiskFactorSecurityInfo value) {
        this.backingStore.set("security", value);
    }
}
