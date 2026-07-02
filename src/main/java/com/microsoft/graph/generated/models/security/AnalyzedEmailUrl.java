package com.microsoft.graph.models.security;

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
public class AnalyzedEmailUrl implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AnalyzedEmailUrl} and sets the default values.
     */
    public AnalyzedEmailUrl() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AnalyzedEmailUrl}
     */
    @jakarta.annotation.Nonnull
    public static AnalyzedEmailUrl createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyzedEmailUrl();
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
     * Gets the detectionMethod property value. The method used to detect threats in the URL.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetectionMethod() {
        return this.backingStore.get("detectionMethod");
    }
    /**
     * Gets the detonationDetails property value. Detonation data associated with the URL.
     * @return a {@link DetonationDetails}
     */
    @jakarta.annotation.Nullable
    public DetonationDetails getDetonationDetails() {
        return this.backingStore.get("detonationDetails");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("detectionMethod", (n) -> { this.setDetectionMethod(n.getStringValue()); });
        deserializerMap.put("detonationDetails", (n) -> { this.setDetonationDetails(n.getObjectValue(DetonationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tenantAllowBlockListDetailInfo", (n) -> { this.setTenantAllowBlockListDetailInfo(n.getStringValue()); });
        deserializerMap.put("threatType", (n) -> { this.setThreatType(n.getEnumValue(ThreatType::forValue)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the tenantAllowBlockListDetailInfo property value. Details of entries in tenant allow/block list configured by tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantAllowBlockListDetailInfo() {
        return this.backingStore.get("tenantAllowBlockListDetailInfo");
    }
    /**
     * Gets the threatType property value. The type of threat associated with the URL. The possible values are: unknown, spam, malware, phishing, none, unknownFutureValue.
     * @return a {@link ThreatType}
     */
    @jakarta.annotation.Nullable
    public ThreatType getThreatType() {
        return this.backingStore.get("threatType");
    }
    /**
     * Gets the url property value. The URL that is found in the email. This is full URL string, including query parameters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.backingStore.get("url");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("detectionMethod", this.getDetectionMethod());
        writer.writeObjectValue("detonationDetails", this.getDetonationDetails());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("tenantAllowBlockListDetailInfo", this.getTenantAllowBlockListDetailInfo());
        writer.writeEnumValue("threatType", this.getThreatType());
        writer.writeStringValue("url", this.getUrl());
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
     * Sets the detectionMethod property value. The method used to detect threats in the URL.
     * @param value Value to set for the detectionMethod property.
     */
    public void setDetectionMethod(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("detectionMethod", value);
    }
    /**
     * Sets the detonationDetails property value. Detonation data associated with the URL.
     * @param value Value to set for the detonationDetails property.
     */
    public void setDetonationDetails(@jakarta.annotation.Nullable final DetonationDetails value) {
        this.backingStore.set("detonationDetails", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the tenantAllowBlockListDetailInfo property value. Details of entries in tenant allow/block list configured by tenant.
     * @param value Value to set for the tenantAllowBlockListDetailInfo property.
     */
    public void setTenantAllowBlockListDetailInfo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantAllowBlockListDetailInfo", value);
    }
    /**
     * Sets the threatType property value. The type of threat associated with the URL. The possible values are: unknown, spam, malware, phishing, none, unknownFutureValue.
     * @param value Value to set for the threatType property.
     */
    public void setThreatType(@jakarta.annotation.Nullable final ThreatType value) {
        this.backingStore.set("threatType", value);
    }
    /**
     * Sets the url property value. The URL that is found in the email. This is full URL string, including query parameters.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("url", value);
    }
}
