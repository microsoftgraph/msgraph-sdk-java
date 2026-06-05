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
public class ApplicationRiskScore implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ApplicationRiskScore} and sets the default values.
     */
    public ApplicationRiskScore() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicationRiskScore}
     */
    @jakarta.annotation.Nonnull
    public static ApplicationRiskScore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationRiskScore();
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
     * Gets the compliance property value. Specifies the compliance risk score based on the application&apos;s alignment with regulatory standards and industry certifications such as HIPAA, CSA, and PCI-DSS.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getCompliance() {
        return this.backingStore.get("compliance");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("compliance", (n) -> { this.setCompliance(n.getFloatValue()); });
        deserializerMap.put("legal", (n) -> { this.setLegal(n.getFloatValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getFloatValue()); });
        deserializerMap.put("security", (n) -> { this.setSecurity(n.getFloatValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getFloatValue()); });
        return deserializerMap;
    }
    /**
     * Gets the legal property value. Specifies the legal risk score based on data protection practices, privacy policy transparency, and jurisdictional compliance to regulations and policies such as DMCA and data retention policy.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getLegal() {
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
     * Gets the provider property value. Specifies the provider risk score based on vendor credibility, operational maturity, and trustworthiness.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getProvider() {
        return this.backingStore.get("provider");
    }
    /**
     * Gets the security property value. Specifies the security risk score based on authentication strength, encryption, vulnerability management, and overall security hygiene.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getSecurity() {
        return this.backingStore.get("security");
    }
    /**
     * Gets the total property value. Represents the composite risk score derived from all risk categories.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getTotal() {
        return this.backingStore.get("total");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeFloatValue("compliance", this.getCompliance());
        writer.writeFloatValue("legal", this.getLegal());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeFloatValue("provider", this.getProvider());
        writer.writeFloatValue("security", this.getSecurity());
        writer.writeFloatValue("total", this.getTotal());
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
     * Sets the compliance property value. Specifies the compliance risk score based on the application&apos;s alignment with regulatory standards and industry certifications such as HIPAA, CSA, and PCI-DSS.
     * @param value Value to set for the compliance property.
     */
    public void setCompliance(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("compliance", value);
    }
    /**
     * Sets the legal property value. Specifies the legal risk score based on data protection practices, privacy policy transparency, and jurisdictional compliance to regulations and policies such as DMCA and data retention policy.
     * @param value Value to set for the legal property.
     */
    public void setLegal(@jakarta.annotation.Nullable final Float value) {
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
     * Sets the provider property value. Specifies the provider risk score based on vendor credibility, operational maturity, and trustworthiness.
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("provider", value);
    }
    /**
     * Sets the security property value. Specifies the security risk score based on authentication strength, encryption, vulnerability management, and overall security hygiene.
     * @param value Value to set for the security property.
     */
    public void setSecurity(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("security", value);
    }
    /**
     * Sets the total property value. Represents the composite risk score derived from all risk categories.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("total", value);
    }
}
