package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InformationProtection implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The bitlocker property
     */
    private Bitlocker bitlocker;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The threatAssessmentRequests property
     */
    private java.util.List<ThreatAssessmentRequest> threatAssessmentRequests;
    /**
     * Instantiates a new InformationProtection and sets the default values.
     */
    public InformationProtection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InformationProtection
     */
    @jakarta.annotation.Nonnull
    public static InformationProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtection();
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
     * Gets the bitlocker property value. The bitlocker property
     * @return a Bitlocker
     */
    @jakarta.annotation.Nullable
    public Bitlocker getBitlocker() {
        return this.bitlocker;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("bitlocker", (n) -> { this.setBitlocker(n.getObjectValue(Bitlocker::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("threatAssessmentRequests", (n) -> { this.setThreatAssessmentRequests(n.getCollectionOfObjectValues(ThreatAssessmentRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the threatAssessmentRequests property value. The threatAssessmentRequests property
     * @return a java.util.List<ThreatAssessmentRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ThreatAssessmentRequest> getThreatAssessmentRequests() {
        return this.threatAssessmentRequests;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("bitlocker", this.getBitlocker());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("threatAssessmentRequests", this.getThreatAssessmentRequests());
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
     * Sets the bitlocker property value. The bitlocker property
     * @param value Value to set for the bitlocker property.
     */
    public void setBitlocker(@jakarta.annotation.Nullable final Bitlocker value) {
        this.bitlocker = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the threatAssessmentRequests property value. The threatAssessmentRequests property
     * @param value Value to set for the threatAssessmentRequests property.
     */
    public void setThreatAssessmentRequests(@jakarta.annotation.Nullable final java.util.List<ThreatAssessmentRequest> value) {
        this.threatAssessmentRequests = value;
    }
}
