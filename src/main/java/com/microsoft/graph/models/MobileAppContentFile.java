package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for a single installer file that is associated with a given mobileAppContent version. */
public class MobileAppContentFile extends Entity implements Parsable {
    /** The Azure Storage URI. */
    private String _azureStorageUri;
    /** The time the Azure storage Uri expires. */
    private OffsetDateTime _azureStorageUriExpirationDateTime;
    /** The time the file was created. */
    private OffsetDateTime _createdDateTime;
    /** A value indicating whether the file is committed. */
    private Boolean _isCommitted;
    /** The manifest information. */
    private byte[] _manifest;
    /** the file name. */
    private String _name;
    /** The size of the file prior to encryption. */
    private Long _size;
    /** The size of the file after encryption. */
    private Long _sizeEncrypted;
    /** The state of the current upload request. Possible values are: success, transientError, error, unknown, azureStorageUriRequestSuccess, azureStorageUriRequestPending, azureStorageUriRequestFailed, azureStorageUriRequestTimedOut, azureStorageUriRenewalSuccess, azureStorageUriRenewalPending, azureStorageUriRenewalFailed, azureStorageUriRenewalTimedOut, commitFileSuccess, commitFilePending, commitFileFailed, commitFileTimedOut. */
    private MobileAppContentFileUploadState _uploadState;
    /**
     * Instantiates a new mobileAppContentFile and sets the default values.
     * @return a void
     */
    public MobileAppContentFile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppContentFile
     */
    @javax.annotation.Nonnull
    public static MobileAppContentFile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppContentFile();
    }
    /**
     * Gets the azureStorageUri property value. The Azure Storage URI.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureStorageUri() {
        return this._azureStorageUri;
    }
    /**
     * Gets the azureStorageUriExpirationDateTime property value. The time the Azure storage Uri expires.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAzureStorageUriExpirationDateTime() {
        return this._azureStorageUriExpirationDateTime;
    }
    /**
     * Gets the createdDateTime property value. The time the file was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppContentFile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("azureStorageUri", (n) -> { currentObject.setAzureStorageUri(n.getStringValue()); });
            this.put("azureStorageUriExpirationDateTime", (n) -> { currentObject.setAzureStorageUriExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("isCommitted", (n) -> { currentObject.setIsCommitted(n.getBooleanValue()); });
            this.put("manifest", (n) -> { currentObject.setManifest(n.getByteArrayValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("size", (n) -> { currentObject.setSize(n.getLongValue()); });
            this.put("sizeEncrypted", (n) -> { currentObject.setSizeEncrypted(n.getLongValue()); });
            this.put("uploadState", (n) -> { currentObject.setUploadState(n.getEnumValue(MobileAppContentFileUploadState.class)); });
        }};
    }
    /**
     * Gets the isCommitted property value. A value indicating whether the file is committed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCommitted() {
        return this._isCommitted;
    }
    /**
     * Gets the manifest property value. The manifest information.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getManifest() {
        return this._manifest;
    }
    /**
     * Gets the name property value. the file name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the size property value. The size of the file prior to encryption.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSize() {
        return this._size;
    }
    /**
     * Gets the sizeEncrypted property value. The size of the file after encryption.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSizeEncrypted() {
        return this._sizeEncrypted;
    }
    /**
     * Gets the uploadState property value. The state of the current upload request. Possible values are: success, transientError, error, unknown, azureStorageUriRequestSuccess, azureStorageUriRequestPending, azureStorageUriRequestFailed, azureStorageUriRequestTimedOut, azureStorageUriRenewalSuccess, azureStorageUriRenewalPending, azureStorageUriRenewalFailed, azureStorageUriRenewalTimedOut, commitFileSuccess, commitFilePending, commitFileFailed, commitFileTimedOut.
     * @return a mobileAppContentFileUploadState
     */
    @javax.annotation.Nullable
    public MobileAppContentFileUploadState getUploadState() {
        return this._uploadState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureStorageUri", this.getAzureStorageUri());
        writer.writeOffsetDateTimeValue("azureStorageUriExpirationDateTime", this.getAzureStorageUriExpirationDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeBooleanValue("isCommitted", this.getIsCommitted());
        writer.writeByteArrayValue("manifest", this.getManifest());
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("size", this.getSize());
        writer.writeLongValue("sizeEncrypted", this.getSizeEncrypted());
        writer.writeEnumValue("uploadState", this.getUploadState());
    }
    /**
     * Sets the azureStorageUri property value. The Azure Storage URI.
     * @param value Value to set for the azureStorageUri property.
     * @return a void
     */
    public void setAzureStorageUri(@javax.annotation.Nullable final String value) {
        this._azureStorageUri = value;
    }
    /**
     * Sets the azureStorageUriExpirationDateTime property value. The time the Azure storage Uri expires.
     * @param value Value to set for the azureStorageUriExpirationDateTime property.
     * @return a void
     */
    public void setAzureStorageUriExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._azureStorageUriExpirationDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. The time the file was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the isCommitted property value. A value indicating whether the file is committed.
     * @param value Value to set for the isCommitted property.
     * @return a void
     */
    public void setIsCommitted(@javax.annotation.Nullable final Boolean value) {
        this._isCommitted = value;
    }
    /**
     * Sets the manifest property value. The manifest information.
     * @param value Value to set for the manifest property.
     * @return a void
     */
    public void setManifest(@javax.annotation.Nullable final byte[] value) {
        this._manifest = value;
    }
    /**
     * Sets the name property value. the file name.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the size property value. The size of the file prior to encryption.
     * @param value Value to set for the size property.
     * @return a void
     */
    public void setSize(@javax.annotation.Nullable final Long value) {
        this._size = value;
    }
    /**
     * Sets the sizeEncrypted property value. The size of the file after encryption.
     * @param value Value to set for the sizeEncrypted property.
     * @return a void
     */
    public void setSizeEncrypted(@javax.annotation.Nullable final Long value) {
        this._sizeEncrypted = value;
    }
    /**
     * Sets the uploadState property value. The state of the current upload request. Possible values are: success, transientError, error, unknown, azureStorageUriRequestSuccess, azureStorageUriRequestPending, azureStorageUriRequestFailed, azureStorageUriRequestTimedOut, azureStorageUriRenewalSuccess, azureStorageUriRenewalPending, azureStorageUriRenewalFailed, azureStorageUriRenewalTimedOut, commitFileSuccess, commitFilePending, commitFileFailed, commitFileTimedOut.
     * @param value Value to set for the uploadState property.
     * @return a void
     */
    public void setUploadState(@javax.annotation.Nullable final MobileAppContentFileUploadState value) {
        this._uploadState = value;
    }
}
