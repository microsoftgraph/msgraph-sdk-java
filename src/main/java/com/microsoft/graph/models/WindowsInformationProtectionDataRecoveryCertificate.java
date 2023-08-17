package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Information Protection DataRecoveryCertificate
 */
public class WindowsInformationProtectionDataRecoveryCertificate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Data recovery Certificate
     */
    private byte[] certificate;
    /**
     * Data recovery Certificate description
     */
    private String description;
    /**
     * Data recovery Certificate expiration datetime
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Data recovery Certificate subject name
     */
    private String subjectName;
    /**
     * Instantiates a new windowsInformationProtectionDataRecoveryCertificate and sets the default values.
     */
    public WindowsInformationProtectionDataRecoveryCertificate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionDataRecoveryCertificate
     */
    @jakarta.annotation.Nonnull
    public static WindowsInformationProtectionDataRecoveryCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionDataRecoveryCertificate();
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
     * Gets the certificate property value. Data recovery Certificate
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getCertificate() {
        return this.certificate;
    }
    /**
     * Gets the description property value. Data recovery Certificate description
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the expirationDateTime property value. Data recovery Certificate expiration datetime
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("certificate", (n) -> { this.setCertificate(n.getByteArrayValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("subjectName", (n) -> { this.setSubjectName(n.getStringValue()); });
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
     * Gets the subjectName property value. Data recovery Certificate subject name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubjectName() {
        return this.subjectName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("certificate", this.getCertificate());
        writer.writeStringValue("description", this.getDescription());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("subjectName", this.getSubjectName());
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
     * Sets the certificate property value. Data recovery Certificate
     * @param value Value to set for the certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final byte[] value) {
        this.certificate = value;
    }
    /**
     * Sets the description property value. Data recovery Certificate description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the expirationDateTime property value. Data recovery Certificate expiration datetime
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the subjectName property value. Data recovery Certificate subject name
     * @param value Value to set for the subjectName property.
     */
    public void setSubjectName(@jakarta.annotation.Nullable final String value) {
        this.subjectName = value;
    }
}
