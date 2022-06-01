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
public class UploadSession implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The date and time in UTC that the upload session will expire. The complete file must be uploaded before this expiration time is reached. */
    private OffsetDateTime _expirationDateTime;
    /** When uploading files to document libraries, this is a collection of byte ranges that the server is missing for the file. These ranges are zero-indexed and of the format, '{start}-{end}' (e.g. '0-26' to indicate the first 27 bytes of the file). When uploading files as Outlook attachments, instead of a collection of ranges, this property always indicates a single value '{start}', the location in the file where the next upload should begin. */
    private java.util.List<String> _nextExpectedRanges;
    /** The URL endpoint that accepts PUT requests for byte ranges of the file. */
    private String _uploadUrl;
    /**
     * Instantiates a new UploadSession and sets the default values.
     * @return a void
     */
    public UploadSession() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UploadSession
     */
    @javax.annotation.Nonnull
    public static UploadSession createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadSession();
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
     * Gets the expirationDateTime property value. The date and time in UTC that the upload session will expire. The complete file must be uploaded before this expiration time is reached.
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
        final UploadSession currentObject = this;
        return new HashMap<>(3) {{
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("nextExpectedRanges", (n) -> { currentObject.setNextExpectedRanges(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("uploadUrl", (n) -> { currentObject.setUploadUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the nextExpectedRanges property value. When uploading files to document libraries, this is a collection of byte ranges that the server is missing for the file. These ranges are zero-indexed and of the format, '{start}-{end}' (e.g. '0-26' to indicate the first 27 bytes of the file). When uploading files as Outlook attachments, instead of a collection of ranges, this property always indicates a single value '{start}', the location in the file where the next upload should begin.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNextExpectedRanges() {
        return this._nextExpectedRanges;
    }
    /**
     * Gets the uploadUrl property value. The URL endpoint that accepts PUT requests for byte ranges of the file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUploadUrl() {
        return this._uploadUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeCollectionOfPrimitiveValues("nextExpectedRanges", this.getNextExpectedRanges());
        writer.writeStringValue("uploadUrl", this.getUploadUrl());
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
     * Sets the expirationDateTime property value. The date and time in UTC that the upload session will expire. The complete file must be uploaded before this expiration time is reached.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the nextExpectedRanges property value. When uploading files to document libraries, this is a collection of byte ranges that the server is missing for the file. These ranges are zero-indexed and of the format, '{start}-{end}' (e.g. '0-26' to indicate the first 27 bytes of the file). When uploading files as Outlook attachments, instead of a collection of ranges, this property always indicates a single value '{start}', the location in the file where the next upload should begin.
     * @param value Value to set for the nextExpectedRanges property.
     * @return a void
     */
    public void setNextExpectedRanges(@javax.annotation.Nullable final java.util.List<String> value) {
        this._nextExpectedRanges = value;
    }
    /**
     * Sets the uploadUrl property value. The URL endpoint that accepts PUT requests for byte ranges of the file.
     * @param value Value to set for the uploadUrl property.
     * @return a void
     */
    public void setUploadUrl(@javax.annotation.Nullable final String value) {
        this._uploadUrl = value;
    }
}
