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
public class SelfSignedCertificate implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Custom key identifier.  */
    private byte[] _customKeyIdentifier;
    /** The friendly name for the key.  */
    private String _displayName;
    /** The date and time at which the credential expires. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  */
    private OffsetDateTime _endDateTime;
    /** The value for the key credential. Should be a base-64 encoded value.  */
    private byte[] _key;
    /** The unique identifier (GUID) for the key.  */
    private String _keyId;
    /** The date and time at which the credential becomes valid. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  */
    private OffsetDateTime _startDateTime;
    /** The thumbprint value for the key.  */
    private String _thumbprint;
    /** The type of key credential. 'AsymmetricX509Cert'.  */
    private String _type;
    /** A string that describes the purpose for which the key can be used. For example, 'Verify'.  */
    private String _usage;
    /**
     * Instantiates a new SelfSignedCertificate and sets the default values.
     * @return a void
     */
    public SelfSignedCertificate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SelfSignedCertificate
     */
    @javax.annotation.Nonnull
    public static SelfSignedCertificate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelfSignedCertificate();
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
     * Gets the customKeyIdentifier property value. Custom key identifier.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getCustomKeyIdentifier() {
        return this._customKeyIdentifier;
    }
    /**
     * Gets the displayName property value. The friendly name for the key.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the endDateTime property value. The date and time at which the credential expires. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SelfSignedCertificate currentObject = this;
        return new HashMap<>(9) {{
            this.put("customKeyIdentifier", (n) -> { currentObject.setCustomKeyIdentifier(n.getByteArrayValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("key", (n) -> { currentObject.setKey(n.getByteArrayValue()); });
            this.put("keyId", (n) -> { currentObject.setKeyId(n.getStringValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("thumbprint", (n) -> { currentObject.setThumbprint(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
            this.put("usage", (n) -> { currentObject.setUsage(n.getStringValue()); });
        }};
    }
    /**
     * Gets the key property value. The value for the key credential. Should be a base-64 encoded value.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getKey() {
        return this._key;
    }
    /**
     * Gets the keyId property value. The unique identifier (GUID) for the key.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKeyId() {
        return this._keyId;
    }
    /**
     * Gets the startDateTime property value. The date and time at which the credential becomes valid. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the thumbprint property value. The thumbprint value for the key.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbprint() {
        return this._thumbprint;
    }
    /**
     * Gets the type property value. The type of key credential. 'AsymmetricX509Cert'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Gets the usage property value. A string that describes the purpose for which the key can be used. For example, 'Verify'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsage() {
        return this._usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("customKeyIdentifier", this.getCustomKeyIdentifier());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeByteArrayValue("key", this.getKey());
        writer.writeStringValue("keyId", this.getKeyId());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("thumbprint", this.getThumbprint());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("usage", this.getUsage());
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
     * Sets the customKeyIdentifier property value. Custom key identifier.
     * @param value Value to set for the customKeyIdentifier property.
     * @return a void
     */
    public void setCustomKeyIdentifier(@javax.annotation.Nullable final byte[] value) {
        this._customKeyIdentifier = value;
    }
    /**
     * Sets the displayName property value. The friendly name for the key.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the endDateTime property value. The date and time at which the credential expires. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the key property value. The value for the key credential. Should be a base-64 encoded value.
     * @param value Value to set for the key property.
     * @return a void
     */
    public void setKey(@javax.annotation.Nullable final byte[] value) {
        this._key = value;
    }
    /**
     * Sets the keyId property value. The unique identifier (GUID) for the key.
     * @param value Value to set for the keyId property.
     * @return a void
     */
    public void setKeyId(@javax.annotation.Nullable final String value) {
        this._keyId = value;
    }
    /**
     * Sets the startDateTime property value. The date and time at which the credential becomes valid. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the thumbprint property value. The thumbprint value for the key.
     * @param value Value to set for the thumbprint property.
     * @return a void
     */
    public void setThumbprint(@javax.annotation.Nullable final String value) {
        this._thumbprint = value;
    }
    /**
     * Sets the type property value. The type of key credential. 'AsymmetricX509Cert'.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
    /**
     * Sets the usage property value. A string that describes the purpose for which the key can be used. For example, 'Verify'.
     * @param value Value to set for the usage property.
     * @return a void
     */
    public void setUsage(@javax.annotation.Nullable final String value) {
        this._usage = value;
    }
}
