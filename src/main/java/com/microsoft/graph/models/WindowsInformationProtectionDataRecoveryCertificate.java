package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Windows Information Protection DataRecoveryCertificate */
public class WindowsInformationProtectionDataRecoveryCertificate implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Data recovery Certificate */
    private byte[] _certificate;
    /** Data recovery Certificate description */
    private String _description;
    /** Data recovery Certificate expiration datetime */
    private OffsetDateTime _expirationDateTime;
    /** The OdataType property */
    private String _odataType;
    /** Data recovery Certificate subject name */
    private String _subjectName;
    /**
     * Instantiates a new windowsInformationProtectionDataRecoveryCertificate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsInformationProtectionDataRecoveryCertificate() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windowsInformationProtectionDataRecoveryCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionDataRecoveryCertificate
     */
    @javax.annotation.Nonnull
    public static WindowsInformationProtectionDataRecoveryCertificate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionDataRecoveryCertificate();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the certificate property value. Data recovery Certificate
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getCertificate() {
        return this._certificate;
    }
    /**
     * Gets the description property value. Data recovery Certificate description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the expirationDateTime property value. Data recovery Certificate expiration datetime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsInformationProtectionDataRecoveryCertificate currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("certificate", (n) -> { currentObject.setCertificate(n.getByteArrayValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("subjectName", (n) -> { currentObject.setSubjectName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the subjectName property value. Data recovery Certificate subject name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectName() {
        return this._subjectName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the certificate property value. Data recovery Certificate
     * @param value Value to set for the certificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificate(@javax.annotation.Nullable final byte[] value) {
        this._certificate = value;
    }
    /**
     * Sets the description property value. Data recovery Certificate description
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the expirationDateTime property value. Data recovery Certificate expiration datetime
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the subjectName property value. Data recovery Certificate subject name
     * @param value Value to set for the subjectName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectName(@javax.annotation.Nullable final String value) {
        this._subjectName = value;
    }
}
