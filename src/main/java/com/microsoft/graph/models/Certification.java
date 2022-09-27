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
public class Certification implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** URL that shows certification details for the application. */
    private final String _certificationDetailsUrl;
    /** The timestamp when the current certification for the application will expire. */
    private OffsetDateTime _certificationExpirationDateTime;
    /** Indicates whether the application is certified by Microsoft. */
    private final Boolean _isCertifiedByMicrosoft;
    /** Indicates whether the application has been self-attested by the application developer or the publisher. */
    private Boolean _isPublisherAttested;
    /** The timestamp when the certification for the application was most recently added or updated. */
    private OffsetDateTime _lastCertificationDateTime;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new certification and sets the default values.
     * @return a void
     */
    public Certification() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.certification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a certification
     */
    @javax.annotation.Nonnull
    public static Certification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Certification();
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
     * Gets the certificationDetailsUrl property value. URL that shows certification details for the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationDetailsUrl() {
        return this._certificationDetailsUrl;
    }
    /**
     * Gets the certificationExpirationDateTime property value. The timestamp when the current certification for the application will expire.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCertificationExpirationDateTime() {
        return this._certificationExpirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Certification currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("certificationDetailsUrl", (n) -> { currentObject.setCertificationDetailsUrl(n.getStringValue()); });
            this.put("certificationExpirationDateTime", (n) -> { currentObject.setCertificationExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("isCertifiedByMicrosoft", (n) -> { currentObject.setIsCertifiedByMicrosoft(n.getBooleanValue()); });
            this.put("isPublisherAttested", (n) -> { currentObject.setIsPublisherAttested(n.getBooleanValue()); });
            this.put("lastCertificationDateTime", (n) -> { currentObject.setLastCertificationDateTime(n.getOffsetDateTimeValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isCertifiedByMicrosoft property value. Indicates whether the application is certified by Microsoft.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCertifiedByMicrosoft() {
        return this._isCertifiedByMicrosoft;
    }
    /**
     * Gets the isPublisherAttested property value. Indicates whether the application has been self-attested by the application developer or the publisher.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPublisherAttested() {
        return this._isPublisherAttested;
    }
    /**
     * Gets the lastCertificationDateTime property value. The timestamp when the certification for the application was most recently added or updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastCertificationDateTime() {
        return this._lastCertificationDateTime;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("certificationExpirationDateTime", this.getCertificationExpirationDateTime());
        writer.writeBooleanValue("isPublisherAttested", this.getIsPublisherAttested());
        writer.writeOffsetDateTimeValue("lastCertificationDateTime", this.getLastCertificationDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the certificationDetailsUrl property value. URL that shows certification details for the application.
     * @param value Value to set for the certificationDetailsUrl property.
     * @return a void
     */
    public void setCertificationDetailsUrl(@javax.annotation.Nullable final String value) {
        this._certificationDetailsUrl = value;
    }
    /**
     * Sets the certificationExpirationDateTime property value. The timestamp when the current certification for the application will expire.
     * @param value Value to set for the certificationExpirationDateTime property.
     * @return a void
     */
    public void setCertificationExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._certificationExpirationDateTime = value;
    }
    /**
     * Sets the isCertifiedByMicrosoft property value. Indicates whether the application is certified by Microsoft.
     * @param value Value to set for the isCertifiedByMicrosoft property.
     * @return a void
     */
    public void setIsCertifiedByMicrosoft(@javax.annotation.Nullable final Boolean value) {
        this._isCertifiedByMicrosoft = value;
    }
    /**
     * Sets the isPublisherAttested property value. Indicates whether the application has been self-attested by the application developer or the publisher.
     * @param value Value to set for the isPublisherAttested property.
     * @return a void
     */
    public void setIsPublisherAttested(@javax.annotation.Nullable final Boolean value) {
        this._isPublisherAttested = value;
    }
    /**
     * Sets the lastCertificationDateTime property value. The timestamp when the certification for the application was most recently added or updated.
     * @param value Value to set for the lastCertificationDateTime property.
     * @return a void
     */
    public void setLastCertificationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastCertificationDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
