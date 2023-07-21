package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ComplianceInformation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Collection of the certification controls associated with the certification.
     */
    private java.util.List<CertificationControl> certificationControls;
    /**
     * The name of the compliance certification, for example, ISO 27018:2014, GDPR, FedRAMP, and NIST 800-171.
     */
    private String certificationName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new complianceInformation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ComplianceInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a complianceInformation
     */
    @javax.annotation.Nonnull
    public static ComplianceInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComplianceInformation();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the certificationControls property value. Collection of the certification controls associated with the certification.
     * @return a certificationControl
     */
    @javax.annotation.Nullable
    public java.util.List<CertificationControl> getCertificationControls() {
        return this.certificationControls;
    }
    /**
     * Gets the certificationName property value. The name of the compliance certification, for example, ISO 27018:2014, GDPR, FedRAMP, and NIST 800-171.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationName() {
        return this.certificationName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("certificationControls", (n) -> { this.setCertificationControls(n.getCollectionOfObjectValues(CertificationControl::createFromDiscriminatorValue)); });
        deserializerMap.put("certificationName", (n) -> { this.setCertificationName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("certificationControls", this.getCertificationControls());
        writer.writeStringValue("certificationName", this.getCertificationName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the certificationControls property value. Collection of the certification controls associated with the certification.
     * @param value Value to set for the certificationControls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificationControls(@javax.annotation.Nullable final java.util.List<CertificationControl> value) {
        this.certificationControls = value;
    }
    /**
     * Sets the certificationName property value. The name of the compliance certification, for example, ISO 27018:2014, GDPR, FedRAMP, and NIST 800-171.
     * @param value Value to set for the certificationName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificationName(@javax.annotation.Nullable final String value) {
        this.certificationName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
