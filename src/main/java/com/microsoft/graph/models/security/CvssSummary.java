package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CvssSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The CVSS score about this vulnerability.
     */
    private Double score;
    /**
     * The CVSS severity rating for this vulnerability. The possible values are: none, low, medium, high, critical, unknownFutureValue.
     */
    private VulnerabilitySeverity severity;
    /**
     * The CVSS vector string for this vulnerability.
     */
    private String vectorString;
    /**
     * Instantiates a new cvssSummary and sets the default values.
     */
    public CvssSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cvssSummary
     */
    @jakarta.annotation.Nonnull
    public static CvssSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CvssSummary();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("score", (n) -> { this.setScore(n.getDoubleValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(VulnerabilitySeverity.class)); });
        deserializerMap.put("vectorString", (n) -> { this.setVectorString(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the score property value. The CVSS score about this vulnerability.
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getScore() {
        return this.score;
    }
    /**
     * Gets the severity property value. The CVSS severity rating for this vulnerability. The possible values are: none, low, medium, high, critical, unknownFutureValue.
     * @return a vulnerabilitySeverity
     */
    @jakarta.annotation.Nullable
    public VulnerabilitySeverity getSeverity() {
        return this.severity;
    }
    /**
     * Gets the vectorString property value. The CVSS vector string for this vulnerability.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVectorString() {
        return this.vectorString;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeDoubleValue("score", this.getScore());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeStringValue("vectorString", this.getVectorString());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the score property value. The CVSS score about this vulnerability.
     * @param value Value to set for the score property.
     */
    public void setScore(@jakarta.annotation.Nullable final Double value) {
        this.score = value;
    }
    /**
     * Sets the severity property value. The CVSS severity rating for this vulnerability. The possible values are: none, low, medium, high, critical, unknownFutureValue.
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final VulnerabilitySeverity value) {
        this.severity = value;
    }
    /**
     * Sets the vectorString property value. The CVSS vector string for this vulnerability.
     * @param value Value to set for the vectorString property.
     */
    public void setVectorString(@jakarta.annotation.Nullable final String value) {
        this.vectorString = value;
    }
}
