package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Pkcs12CertificateInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Represents whether the certificate is the active certificate to be used for calling the API connector. The active certificate is the most recently uploaded certificate which is not yet expired but whose notBefore time is in the past. */
    private Boolean _isActive;
    /** The certificate's expiry. This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.) */
    private Long _notAfter;
    /** The certificate's issue time (not before). This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.) */
    private Long _notBefore;
    /** The certificate thumbprint. */
    private String _thumbprint;
    /**
     * Instantiates a new pkcs12CertificateInformation and sets the default values.
     * @return a void
     */
    public Pkcs12CertificateInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a pkcs12CertificateInformation
     */
    @javax.annotation.Nonnull
    public static Pkcs12CertificateInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Pkcs12CertificateInformation();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Pkcs12CertificateInformation currentObject = this;
        return new HashMap<>(4) {{
            this.put("isActive", (n) -> { currentObject.setIsActive(n.getBooleanValue()); });
            this.put("notAfter", (n) -> { currentObject.setNotAfter(n.getLongValue()); });
            this.put("notBefore", (n) -> { currentObject.setNotBefore(n.getLongValue()); });
            this.put("thumbprint", (n) -> { currentObject.setThumbprint(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isActive property value. Represents whether the certificate is the active certificate to be used for calling the API connector. The active certificate is the most recently uploaded certificate which is not yet expired but whose notBefore time is in the past.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsActive() {
        return this._isActive;
    }
    /**
     * Gets the notAfter property value. The certificate's expiry. This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getNotAfter() {
        return this._notAfter;
    }
    /**
     * Gets the notBefore property value. The certificate's issue time (not before). This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getNotBefore() {
        return this._notBefore;
    }
    /**
     * Gets the thumbprint property value. The certificate thumbprint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbprint() {
        return this._thumbprint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeLongValue("notAfter", this.getNotAfter());
        writer.writeLongValue("notBefore", this.getNotBefore());
        writer.writeStringValue("thumbprint", this.getThumbprint());
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
     * Sets the isActive property value. Represents whether the certificate is the active certificate to be used for calling the API connector. The active certificate is the most recently uploaded certificate which is not yet expired but whose notBefore time is in the past.
     * @param value Value to set for the isActive property.
     * @return a void
     */
    public void setIsActive(@javax.annotation.Nullable final Boolean value) {
        this._isActive = value;
    }
    /**
     * Sets the notAfter property value. The certificate's expiry. This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
     * @param value Value to set for the notAfter property.
     * @return a void
     */
    public void setNotAfter(@javax.annotation.Nullable final Long value) {
        this._notAfter = value;
    }
    /**
     * Sets the notBefore property value. The certificate's issue time (not before). This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
     * @param value Value to set for the notBefore property.
     * @return a void
     */
    public void setNotBefore(@javax.annotation.Nullable final Long value) {
        this._notBefore = value;
    }
    /**
     * Sets the thumbprint property value. The certificate thumbprint.
     * @param value Value to set for the thumbprint property.
     * @return a void
     */
    public void setThumbprint(@javax.annotation.Nullable final String value) {
        this._thumbprint = value;
    }
}
