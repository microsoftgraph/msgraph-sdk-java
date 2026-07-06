package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DetonationDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DetonationDetails} and sets the default values.
     */
    public DetonationDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DetonationDetails}
     */
    @jakarta.annotation.Nonnull
    public static DetonationDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DetonationDetails();
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
     * Gets the analysisDateTime property value. The time of detonation.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAnalysisDateTime() {
        return this.backingStore.get("analysisDateTime");
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
     * Gets the compromiseIndicators property value. Represents indicators and its associated verdict that suggests whether an email is compromised.
     * @return a {@link java.util.List<CompromiseIndicator>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CompromiseIndicator> getCompromiseIndicators() {
        return this.backingStore.get("compromiseIndicators");
    }
    /**
     * Gets the detonationBehaviourDetails property value. Shows the exact events that took place during detonation, and problematic or benign observations that contain URLs, IPs, domains, and files that were found during detonation. This property is deprecated and still stop returning data in March 2026. Use the detonationBehaviourDetailsV2 property instead.
     * @return a {@link DetonationBehaviourDetails}
     */
    @jakarta.annotation.Nullable
    public DetonationBehaviourDetails getDetonationBehaviourDetails() {
        return this.backingStore.get("detonationBehaviourDetails");
    }
    /**
     * Gets the detonationBehaviourDetailsV2 property value. Shows the exact events that took place during detonation, and problematic or benign observations that contain URLs, IPs, domains, and files that were found during detonation in a JSON format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetonationBehaviourDetailsV2() {
        return this.backingStore.get("detonationBehaviourDetailsV2");
    }
    /**
     * Gets the detonationChain property value. The chain of detonation.
     * @return a {@link DetonationChain}
     */
    @jakarta.annotation.Nullable
    public DetonationChain getDetonationChain() {
        return this.backingStore.get("detonationChain");
    }
    /**
     * Gets the detonationObservables property value. All observables in the detonation tree.
     * @return a {@link DetonationObservables}
     */
    @jakarta.annotation.Nullable
    public DetonationObservables getDetonationObservables() {
        return this.backingStore.get("detonationObservables");
    }
    /**
     * Gets the detonationScreenshotUri property value. Show any screenshots that were captured during detonation. No screenshots are captured if the URL opens into a link that directly downloads a file. However, you see the downloaded file in the detonation chain.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetonationScreenshotUri() {
        return this.backingStore.get("detonationScreenshotUri");
    }
    /**
     * Gets the detonationVerdict property value. The verdict of the detonation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetonationVerdict() {
        return this.backingStore.get("detonationVerdict");
    }
    /**
     * Gets the detonationVerdictReason property value. The reason for the verdict of the detonation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetonationVerdictReason() {
        return this.backingStore.get("detonationVerdictReason");
    }
    /**
     * Gets the entityMetadata property value. Additional metadata about the entity in JSON format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEntityMetadata() {
        return this.backingStore.get("entityMetadata");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("analysisDateTime", (n) -> { this.setAnalysisDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("compromiseIndicators", (n) -> { this.setCompromiseIndicators(n.getCollectionOfObjectValues(CompromiseIndicator::createFromDiscriminatorValue)); });
        deserializerMap.put("detonationBehaviourDetails", (n) -> { this.setDetonationBehaviourDetails(n.getObjectValue(DetonationBehaviourDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("detonationBehaviourDetailsV2", (n) -> { this.setDetonationBehaviourDetailsV2(n.getStringValue()); });
        deserializerMap.put("detonationChain", (n) -> { this.setDetonationChain(n.getObjectValue(DetonationChain::createFromDiscriminatorValue)); });
        deserializerMap.put("detonationObservables", (n) -> { this.setDetonationObservables(n.getObjectValue(DetonationObservables::createFromDiscriminatorValue)); });
        deserializerMap.put("detonationScreenshotUri", (n) -> { this.setDetonationScreenshotUri(n.getStringValue()); });
        deserializerMap.put("detonationVerdict", (n) -> { this.setDetonationVerdict(n.getStringValue()); });
        deserializerMap.put("detonationVerdictReason", (n) -> { this.setDetonationVerdictReason(n.getStringValue()); });
        deserializerMap.put("entityMetadata", (n) -> { this.setEntityMetadata(n.getStringValue()); });
        deserializerMap.put("mitreTechniques", (n) -> { this.setMitreTechniques(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("staticAnalysis", (n) -> { this.setStaticAnalysis(n.getStringValue()); });
        deserializerMap.put("submissionSource", (n) -> { this.setSubmissionSource(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mitreTechniques property value. The attack techniques, as aligned with the MITRE ATT&amp;CK framework.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMitreTechniques() {
        return this.backingStore.get("mitreTechniques");
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
     * Gets the staticAnalysis property value. The results of static analysis performed on the file or URL.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStaticAnalysis() {
        return this.backingStore.get("staticAnalysis");
    }
    /**
     * Gets the submissionSource property value. The source of the submission.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubmissionSource() {
        return this.backingStore.get("submissionSource");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("analysisDateTime", this.getAnalysisDateTime());
        writer.writeCollectionOfObjectValues("compromiseIndicators", this.getCompromiseIndicators());
        writer.writeObjectValue("detonationBehaviourDetails", this.getDetonationBehaviourDetails());
        writer.writeStringValue("detonationBehaviourDetailsV2", this.getDetonationBehaviourDetailsV2());
        writer.writeObjectValue("detonationChain", this.getDetonationChain());
        writer.writeObjectValue("detonationObservables", this.getDetonationObservables());
        writer.writeStringValue("detonationScreenshotUri", this.getDetonationScreenshotUri());
        writer.writeStringValue("detonationVerdict", this.getDetonationVerdict());
        writer.writeStringValue("detonationVerdictReason", this.getDetonationVerdictReason());
        writer.writeStringValue("entityMetadata", this.getEntityMetadata());
        writer.writeStringValue("mitreTechniques", this.getMitreTechniques());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("staticAnalysis", this.getStaticAnalysis());
        writer.writeStringValue("submissionSource", this.getSubmissionSource());
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
     * Sets the analysisDateTime property value. The time of detonation.
     * @param value Value to set for the analysisDateTime property.
     */
    public void setAnalysisDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("analysisDateTime", value);
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
     * Sets the compromiseIndicators property value. Represents indicators and its associated verdict that suggests whether an email is compromised.
     * @param value Value to set for the compromiseIndicators property.
     */
    public void setCompromiseIndicators(@jakarta.annotation.Nullable final java.util.List<CompromiseIndicator> value) {
        this.backingStore.set("compromiseIndicators", value);
    }
    /**
     * Sets the detonationBehaviourDetails property value. Shows the exact events that took place during detonation, and problematic or benign observations that contain URLs, IPs, domains, and files that were found during detonation. This property is deprecated and still stop returning data in March 2026. Use the detonationBehaviourDetailsV2 property instead.
     * @param value Value to set for the detonationBehaviourDetails property.
     */
    public void setDetonationBehaviourDetails(@jakarta.annotation.Nullable final DetonationBehaviourDetails value) {
        this.backingStore.set("detonationBehaviourDetails", value);
    }
    /**
     * Sets the detonationBehaviourDetailsV2 property value. Shows the exact events that took place during detonation, and problematic or benign observations that contain URLs, IPs, domains, and files that were found during detonation in a JSON format.
     * @param value Value to set for the detonationBehaviourDetailsV2 property.
     */
    public void setDetonationBehaviourDetailsV2(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("detonationBehaviourDetailsV2", value);
    }
    /**
     * Sets the detonationChain property value. The chain of detonation.
     * @param value Value to set for the detonationChain property.
     */
    public void setDetonationChain(@jakarta.annotation.Nullable final DetonationChain value) {
        this.backingStore.set("detonationChain", value);
    }
    /**
     * Sets the detonationObservables property value. All observables in the detonation tree.
     * @param value Value to set for the detonationObservables property.
     */
    public void setDetonationObservables(@jakarta.annotation.Nullable final DetonationObservables value) {
        this.backingStore.set("detonationObservables", value);
    }
    /**
     * Sets the detonationScreenshotUri property value. Show any screenshots that were captured during detonation. No screenshots are captured if the URL opens into a link that directly downloads a file. However, you see the downloaded file in the detonation chain.
     * @param value Value to set for the detonationScreenshotUri property.
     */
    public void setDetonationScreenshotUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("detonationScreenshotUri", value);
    }
    /**
     * Sets the detonationVerdict property value. The verdict of the detonation.
     * @param value Value to set for the detonationVerdict property.
     */
    public void setDetonationVerdict(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("detonationVerdict", value);
    }
    /**
     * Sets the detonationVerdictReason property value. The reason for the verdict of the detonation.
     * @param value Value to set for the detonationVerdictReason property.
     */
    public void setDetonationVerdictReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("detonationVerdictReason", value);
    }
    /**
     * Sets the entityMetadata property value. Additional metadata about the entity in JSON format.
     * @param value Value to set for the entityMetadata property.
     */
    public void setEntityMetadata(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("entityMetadata", value);
    }
    /**
     * Sets the mitreTechniques property value. The attack techniques, as aligned with the MITRE ATT&amp;CK framework.
     * @param value Value to set for the mitreTechniques property.
     */
    public void setMitreTechniques(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mitreTechniques", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the staticAnalysis property value. The results of static analysis performed on the file or URL.
     * @param value Value to set for the staticAnalysis property.
     */
    public void setStaticAnalysis(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("staticAnalysis", value);
    }
    /**
     * Sets the submissionSource property value. The source of the submission.
     * @param value Value to set for the submissionSource property.
     */
    public void setSubmissionSource(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("submissionSource", value);
    }
}
