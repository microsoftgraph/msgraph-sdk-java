package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SigningCertificateUpdateStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Status of the last certificate update. Read-only. For a list of statuses, see certificateUpdateResult status.  */
    private String _certificateUpdateResult;
    /** Date and time in ISO 8601 format and in UTC time when the certificate was last updated. Read-only.  */
    private OffsetDateTime _lastRunDateTime;
    /**
     * Instantiates a new signingCertificateUpdateStatus and sets the default values.
     * @return a void
     */
    public SigningCertificateUpdateStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a signingCertificateUpdateStatus
     */
    @javax.annotation.Nonnull
    public static SigningCertificateUpdateStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SigningCertificateUpdateStatus();
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
     * Gets the certificateUpdateResult property value. Status of the last certificate update. Read-only. For a list of statuses, see certificateUpdateResult status.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateUpdateResult() {
        return this._certificateUpdateResult;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SigningCertificateUpdateStatus currentObject = this;
        return new HashMap<>(2) {{
            this.put("certificateUpdateResult", (n) -> { currentObject.setCertificateUpdateResult(n.getStringValue()); });
            this.put("lastRunDateTime", (n) -> { currentObject.setLastRunDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the lastRunDateTime property value. Date and time in ISO 8601 format and in UTC time when the certificate was last updated. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRunDateTime() {
        return this._lastRunDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("certificateUpdateResult", this.getCertificateUpdateResult());
        writer.writeOffsetDateTimeValue("lastRunDateTime", this.getLastRunDateTime());
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
     * Sets the certificateUpdateResult property value. Status of the last certificate update. Read-only. For a list of statuses, see certificateUpdateResult status.
     * @param value Value to set for the certificateUpdateResult property.
     * @return a void
     */
    public void setCertificateUpdateResult(@javax.annotation.Nullable final String value) {
        this._certificateUpdateResult = value;
    }
    /**
     * Sets the lastRunDateTime property value. Date and time in ISO 8601 format and in UTC time when the certificate was last updated. Read-only.
     * @param value Value to set for the lastRunDateTime property.
     * @return a void
     */
    public void setLastRunDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRunDateTime = value;
    }
}
