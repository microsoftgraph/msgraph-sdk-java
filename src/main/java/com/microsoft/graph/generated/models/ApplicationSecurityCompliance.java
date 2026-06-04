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
public class ApplicationSecurityCompliance implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ApplicationSecurityCompliance} and sets the default values.
     */
    public ApplicationSecurityCompliance() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicationSecurityCompliance}
     */
    @jakarta.annotation.Nonnull
    public static ApplicationSecurityCompliance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationSecurityCompliance();
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
     * Gets the cobit property value. Indicates whether the application adheres to the Control Objectives for Information and Related Technologies (COBIT) framework.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCobit() {
        return this.backingStore.get("cobit");
    }
    /**
     * Gets the coppa property value. Indicates whether the application complies with the Childrens Online Privacy Protection Act (COPPA).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCoppa() {
        return this.backingStore.get("coppa");
    }
    /**
     * Gets the csaStar property value. Specifies the Cloud Security Alliance (CSA) Security, Trust &amp; Assurance Registry (STAR) certification level. The possible values are: none, attestation, certification, continuousMonitoring, cStarAssessment, selfAssessment, notSupported, unknownFutureValue.
     * @return a {@link CsaStarLevel}
     */
    @jakarta.annotation.Nullable
    public CsaStarLevel getCsaStar() {
        return this.backingStore.get("csaStar");
    }
    /**
     * Gets the fedRamp property value. Specifies the Federal Risk and Authorization Management Program (FedRAMP) certification level. The possible values are: none, high, liSaas, low, moderate, notSupported, unknownFutureValue.
     * @return a {@link FedRampLevel}
     */
    @jakarta.annotation.Nullable
    public FedRampLevel getFedRamp() {
        return this.backingStore.get("fedRamp");
    }
    /**
     * Gets the ferpa property value. Indicates whether the application complies with the Family Educational Rights and Privacy Act (FERPA).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFerpa() {
        return this.backingStore.get("ferpa");
    }
    /**
     * Gets the ffiec property value. Indicates whether the application meets Federal Financial Institutions Examination Council (FFIEC) requirements.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFfiec() {
        return this.backingStore.get("ffiec");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(31);
        deserializerMap.put("cobit", (n) -> { this.setCobit(n.getBooleanValue()); });
        deserializerMap.put("coppa", (n) -> { this.setCoppa(n.getBooleanValue()); });
        deserializerMap.put("csaStar", (n) -> { this.setCsaStar(n.getEnumValue(CsaStarLevel::forValue)); });
        deserializerMap.put("fedRamp", (n) -> { this.setFedRamp(n.getEnumValue(FedRampLevel::forValue)); });
        deserializerMap.put("ferpa", (n) -> { this.setFerpa(n.getBooleanValue()); });
        deserializerMap.put("ffiec", (n) -> { this.setFfiec(n.getBooleanValue()); });
        deserializerMap.put("finra", (n) -> { this.setFinra(n.getBooleanValue()); });
        deserializerMap.put("fisma", (n) -> { this.setFisma(n.getBooleanValue()); });
        deserializerMap.put("gaap", (n) -> { this.setGaap(n.getBooleanValue()); });
        deserializerMap.put("gapp", (n) -> { this.setGapp(n.getBooleanValue()); });
        deserializerMap.put("glba", (n) -> { this.setGlba(n.getBooleanValue()); });
        deserializerMap.put("hipaa", (n) -> { this.setHipaa(n.getBooleanValue()); });
        deserializerMap.put("hitrust", (n) -> { this.setHitrust(n.getBooleanValue()); });
        deserializerMap.put("isae3402", (n) -> { this.setIsae3402(n.getBooleanValue()); });
        deserializerMap.put("iso27001", (n) -> { this.setIso27001(n.getBooleanValue()); });
        deserializerMap.put("iso27002", (n) -> { this.setIso27002(n.getBooleanValue()); });
        deserializerMap.put("iso27017", (n) -> { this.setIso27017(n.getBooleanValue()); });
        deserializerMap.put("iso27018", (n) -> { this.setIso27018(n.getBooleanValue()); });
        deserializerMap.put("itar", (n) -> { this.setItar(n.getBooleanValue()); });
        deserializerMap.put("jerichoForumCommandments", (n) -> { this.setJerichoForumCommandments(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pci", (n) -> { this.setPci(n.getEnumValue(PciVersion::forValue)); });
        deserializerMap.put("privacyShield", (n) -> { this.setPrivacyShield(n.getBooleanValue()); });
        deserializerMap.put("safeHarbor", (n) -> { this.setSafeHarbor(n.getBooleanValue()); });
        deserializerMap.put("soc1", (n) -> { this.setSoc1(n.getBooleanValue()); });
        deserializerMap.put("soc2", (n) -> { this.setSoc2(n.getBooleanValue()); });
        deserializerMap.put("soc3", (n) -> { this.setSoc3(n.getBooleanValue()); });
        deserializerMap.put("sox", (n) -> { this.setSox(n.getBooleanValue()); });
        deserializerMap.put("sp800_53", (n) -> { this.setSp80053(n.getBooleanValue()); });
        deserializerMap.put("ssae16", (n) -> { this.setSsae16(n.getBooleanValue()); });
        deserializerMap.put("ustr", (n) -> { this.setUstr(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the finra property value. Indicates whether the application complies with Financial Industry Regulatory Authority (FINRA) standards.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFinra() {
        return this.backingStore.get("finra");
    }
    /**
     * Gets the fisma property value. Indicates whether the application complies with the Federal Information Security Management Act (FISMA).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFisma() {
        return this.backingStore.get("fisma");
    }
    /**
     * Gets the gaap property value. Indicates whether the application provider adheres to Generally Accepted Accounting Principles (GAAP).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGaap() {
        return this.backingStore.get("gaap");
    }
    /**
     * Gets the gapp property value. Indicates whether the application adheres to Generally Accepted Privacy Principles (GAPP).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGapp() {
        return this.backingStore.get("gapp");
    }
    /**
     * Gets the glba property value. Indicates whether the application complies with the GrammLeachBliley Act (GLBA) for financial data protection.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGlba() {
        return this.backingStore.get("glba");
    }
    /**
     * Gets the hipaa property value. Indicates whether the application complies with the Health Insurance Portability and Accountability Act (HIPAA).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHipaa() {
        return this.backingStore.get("hipaa");
    }
    /**
     * Gets the hitrust property value. Indicates whether the application holds HITRUST certification, demonstrating alignment with healthcare and data security standards.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHitrust() {
        return this.backingStore.get("hitrust");
    }
    /**
     * Gets the isae3402 property value. Indicates whether the application complies with International Standard on Assurance Engagements (ISAE) 3402 requirements.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsae3402() {
        return this.backingStore.get("isae3402");
    }
    /**
     * Gets the iso27001 property value. Indicates whether the application is certified against ISO/IEC 27001 for information security management systems (ISMS).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIso27001() {
        return this.backingStore.get("iso27001");
    }
    /**
     * Gets the iso27002 property value. Indicates whether the application follows ISO/IEC 27002 security control best practices.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIso27002() {
        return this.backingStore.get("iso27002");
    }
    /**
     * Gets the iso27017 property value. Indicates whether the application complies with ISO/IEC 27017 standards for cloud security controls.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIso27017() {
        return this.backingStore.get("iso27017");
    }
    /**
     * Gets the iso27018 property value. Indicates whether the application complies with ISO/IEC 27018 standards for protecting personally identifiable information (PII) in cloud environments.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIso27018() {
        return this.backingStore.get("iso27018");
    }
    /**
     * Gets the itar property value. Indicates whether the application complies with International Traffic in Arms Regulations (ITAR).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getItar() {
        return this.backingStore.get("itar");
    }
    /**
     * Gets the jerichoForumCommandments property value. Indicates whether the application aligns with Jericho Forum security principles for deperimeterized environments.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getJerichoForumCommandments() {
        return this.backingStore.get("jerichoForumCommandments");
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
     * Gets the pci property value. Specifies the Payment Card Industry (PCI) Data Security Standard (DSS) version the application complies with. The possible values are: none, v321, v4, notSupported, unknownFutureValue.
     * @return a {@link PciVersion}
     */
    @jakarta.annotation.Nullable
    public PciVersion getPci() {
        return this.backingStore.get("pci");
    }
    /**
     * Gets the privacyShield property value. Indicates whether the application complies with the EUU.S. Privacy Shield framework for cross-border data transfers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPrivacyShield() {
        return this.backingStore.get("privacyShield");
    }
    /**
     * Gets the safeHarbor property value. Indicates whether the application previously adhered to the U.S.EU Safe Harbor data transfer framework.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSafeHarbor() {
        return this.backingStore.get("safeHarbor");
    }
    /**
     * Gets the soc1 property value. Indicates whether the application provider undergoes a Service Organization Control (SOC) one audit report.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSoc1() {
        return this.backingStore.get("soc1");
    }
    /**
     * Gets the soc2 property value. Indicates whether the application provider undergoes a Service Organization Control (SOC) two audit report.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSoc2() {
        return this.backingStore.get("soc2");
    }
    /**
     * Gets the soc3 property value. Indicates whether the application provider undergoes a Service Organization Control (SOC) three audit report.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSoc3() {
        return this.backingStore.get("soc3");
    }
    /**
     * Gets the sox property value. Indicates whether the application complies with the SarbanesOxley Act (SOX) financial reporting requirements.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSox() {
        return this.backingStore.get("sox");
    }
    /**
     * Gets the sp800_53 property value. Indicates whether the application aligns with National Institute of Standards and Technology (NIST) Special Publication 800-53 security and privacy controls.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSp80053() {
        return this.backingStore.get("sp80053");
    }
    /**
     * Gets the ssae16 property value. Indicates whether the application adheres to Statement on Standards for Attestation Engagements (SSAE) No. 16.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSsae16() {
        return this.backingStore.get("ssae16");
    }
    /**
     * Gets the ustr property value. Indicates whether the application complies with U.S. Trade Representative (USTR) data and trade protection requirements.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUstr() {
        return this.backingStore.get("ustr");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("cobit", this.getCobit());
        writer.writeBooleanValue("coppa", this.getCoppa());
        writer.writeEnumValue("csaStar", this.getCsaStar());
        writer.writeEnumValue("fedRamp", this.getFedRamp());
        writer.writeBooleanValue("ferpa", this.getFerpa());
        writer.writeBooleanValue("ffiec", this.getFfiec());
        writer.writeBooleanValue("finra", this.getFinra());
        writer.writeBooleanValue("fisma", this.getFisma());
        writer.writeBooleanValue("gaap", this.getGaap());
        writer.writeBooleanValue("gapp", this.getGapp());
        writer.writeBooleanValue("glba", this.getGlba());
        writer.writeBooleanValue("hipaa", this.getHipaa());
        writer.writeBooleanValue("hitrust", this.getHitrust());
        writer.writeBooleanValue("isae3402", this.getIsae3402());
        writer.writeBooleanValue("iso27001", this.getIso27001());
        writer.writeBooleanValue("iso27002", this.getIso27002());
        writer.writeBooleanValue("iso27017", this.getIso27017());
        writer.writeBooleanValue("iso27018", this.getIso27018());
        writer.writeBooleanValue("itar", this.getItar());
        writer.writeBooleanValue("jerichoForumCommandments", this.getJerichoForumCommandments());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("pci", this.getPci());
        writer.writeBooleanValue("privacyShield", this.getPrivacyShield());
        writer.writeBooleanValue("safeHarbor", this.getSafeHarbor());
        writer.writeBooleanValue("soc1", this.getSoc1());
        writer.writeBooleanValue("soc2", this.getSoc2());
        writer.writeBooleanValue("soc3", this.getSoc3());
        writer.writeBooleanValue("sox", this.getSox());
        writer.writeBooleanValue("sp800_53", this.getSp80053());
        writer.writeBooleanValue("ssae16", this.getSsae16());
        writer.writeBooleanValue("ustr", this.getUstr());
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
     * Sets the cobit property value. Indicates whether the application adheres to the Control Objectives for Information and Related Technologies (COBIT) framework.
     * @param value Value to set for the cobit property.
     */
    public void setCobit(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cobit", value);
    }
    /**
     * Sets the coppa property value. Indicates whether the application complies with the Childrens Online Privacy Protection Act (COPPA).
     * @param value Value to set for the coppa property.
     */
    public void setCoppa(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("coppa", value);
    }
    /**
     * Sets the csaStar property value. Specifies the Cloud Security Alliance (CSA) Security, Trust &amp; Assurance Registry (STAR) certification level. The possible values are: none, attestation, certification, continuousMonitoring, cStarAssessment, selfAssessment, notSupported, unknownFutureValue.
     * @param value Value to set for the csaStar property.
     */
    public void setCsaStar(@jakarta.annotation.Nullable final CsaStarLevel value) {
        this.backingStore.set("csaStar", value);
    }
    /**
     * Sets the fedRamp property value. Specifies the Federal Risk and Authorization Management Program (FedRAMP) certification level. The possible values are: none, high, liSaas, low, moderate, notSupported, unknownFutureValue.
     * @param value Value to set for the fedRamp property.
     */
    public void setFedRamp(@jakarta.annotation.Nullable final FedRampLevel value) {
        this.backingStore.set("fedRamp", value);
    }
    /**
     * Sets the ferpa property value. Indicates whether the application complies with the Family Educational Rights and Privacy Act (FERPA).
     * @param value Value to set for the ferpa property.
     */
    public void setFerpa(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("ferpa", value);
    }
    /**
     * Sets the ffiec property value. Indicates whether the application meets Federal Financial Institutions Examination Council (FFIEC) requirements.
     * @param value Value to set for the ffiec property.
     */
    public void setFfiec(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("ffiec", value);
    }
    /**
     * Sets the finra property value. Indicates whether the application complies with Financial Industry Regulatory Authority (FINRA) standards.
     * @param value Value to set for the finra property.
     */
    public void setFinra(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("finra", value);
    }
    /**
     * Sets the fisma property value. Indicates whether the application complies with the Federal Information Security Management Act (FISMA).
     * @param value Value to set for the fisma property.
     */
    public void setFisma(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fisma", value);
    }
    /**
     * Sets the gaap property value. Indicates whether the application provider adheres to Generally Accepted Accounting Principles (GAAP).
     * @param value Value to set for the gaap property.
     */
    public void setGaap(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("gaap", value);
    }
    /**
     * Sets the gapp property value. Indicates whether the application adheres to Generally Accepted Privacy Principles (GAPP).
     * @param value Value to set for the gapp property.
     */
    public void setGapp(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("gapp", value);
    }
    /**
     * Sets the glba property value. Indicates whether the application complies with the GrammLeachBliley Act (GLBA) for financial data protection.
     * @param value Value to set for the glba property.
     */
    public void setGlba(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("glba", value);
    }
    /**
     * Sets the hipaa property value. Indicates whether the application complies with the Health Insurance Portability and Accountability Act (HIPAA).
     * @param value Value to set for the hipaa property.
     */
    public void setHipaa(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hipaa", value);
    }
    /**
     * Sets the hitrust property value. Indicates whether the application holds HITRUST certification, demonstrating alignment with healthcare and data security standards.
     * @param value Value to set for the hitrust property.
     */
    public void setHitrust(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hitrust", value);
    }
    /**
     * Sets the isae3402 property value. Indicates whether the application complies with International Standard on Assurance Engagements (ISAE) 3402 requirements.
     * @param value Value to set for the isae3402 property.
     */
    public void setIsae3402(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isae3402", value);
    }
    /**
     * Sets the iso27001 property value. Indicates whether the application is certified against ISO/IEC 27001 for information security management systems (ISMS).
     * @param value Value to set for the iso27001 property.
     */
    public void setIso27001(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iso27001", value);
    }
    /**
     * Sets the iso27002 property value. Indicates whether the application follows ISO/IEC 27002 security control best practices.
     * @param value Value to set for the iso27002 property.
     */
    public void setIso27002(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iso27002", value);
    }
    /**
     * Sets the iso27017 property value. Indicates whether the application complies with ISO/IEC 27017 standards for cloud security controls.
     * @param value Value to set for the iso27017 property.
     */
    public void setIso27017(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iso27017", value);
    }
    /**
     * Sets the iso27018 property value. Indicates whether the application complies with ISO/IEC 27018 standards for protecting personally identifiable information (PII) in cloud environments.
     * @param value Value to set for the iso27018 property.
     */
    public void setIso27018(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iso27018", value);
    }
    /**
     * Sets the itar property value. Indicates whether the application complies with International Traffic in Arms Regulations (ITAR).
     * @param value Value to set for the itar property.
     */
    public void setItar(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("itar", value);
    }
    /**
     * Sets the jerichoForumCommandments property value. Indicates whether the application aligns with Jericho Forum security principles for deperimeterized environments.
     * @param value Value to set for the jerichoForumCommandments property.
     */
    public void setJerichoForumCommandments(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("jerichoForumCommandments", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the pci property value. Specifies the Payment Card Industry (PCI) Data Security Standard (DSS) version the application complies with. The possible values are: none, v321, v4, notSupported, unknownFutureValue.
     * @param value Value to set for the pci property.
     */
    public void setPci(@jakarta.annotation.Nullable final PciVersion value) {
        this.backingStore.set("pci", value);
    }
    /**
     * Sets the privacyShield property value. Indicates whether the application complies with the EUU.S. Privacy Shield framework for cross-border data transfers.
     * @param value Value to set for the privacyShield property.
     */
    public void setPrivacyShield(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("privacyShield", value);
    }
    /**
     * Sets the safeHarbor property value. Indicates whether the application previously adhered to the U.S.EU Safe Harbor data transfer framework.
     * @param value Value to set for the safeHarbor property.
     */
    public void setSafeHarbor(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("safeHarbor", value);
    }
    /**
     * Sets the soc1 property value. Indicates whether the application provider undergoes a Service Organization Control (SOC) one audit report.
     * @param value Value to set for the soc1 property.
     */
    public void setSoc1(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("soc1", value);
    }
    /**
     * Sets the soc2 property value. Indicates whether the application provider undergoes a Service Organization Control (SOC) two audit report.
     * @param value Value to set for the soc2 property.
     */
    public void setSoc2(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("soc2", value);
    }
    /**
     * Sets the soc3 property value. Indicates whether the application provider undergoes a Service Organization Control (SOC) three audit report.
     * @param value Value to set for the soc3 property.
     */
    public void setSoc3(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("soc3", value);
    }
    /**
     * Sets the sox property value. Indicates whether the application complies with the SarbanesOxley Act (SOX) financial reporting requirements.
     * @param value Value to set for the sox property.
     */
    public void setSox(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("sox", value);
    }
    /**
     * Sets the sp800_53 property value. Indicates whether the application aligns with National Institute of Standards and Technology (NIST) Special Publication 800-53 security and privacy controls.
     * @param value Value to set for the sp800_53 property.
     */
    public void setSp80053(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("sp80053", value);
    }
    /**
     * Sets the ssae16 property value. Indicates whether the application adheres to Statement on Standards for Attestation Engagements (SSAE) No. 16.
     * @param value Value to set for the ssae16 property.
     */
    public void setSsae16(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("ssae16", value);
    }
    /**
     * Sets the ustr property value. Indicates whether the application complies with U.S. Trade Representative (USTR) data and trade protection requirements.
     * @param value Value to set for the ustr property.
     */
    public void setUstr(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("ustr", value);
    }
}
