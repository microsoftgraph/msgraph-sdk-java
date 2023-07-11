package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class SelfSignedCertificate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The customKeyIdentifier property
     */
    private byte[] customKeyIdentifier;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The endDateTime property
     */
    private OffsetDateTime endDateTime;
    /**
     * The key property
     */
    private byte[] key;
    /**
     * The keyId property
     */
    private UUID keyId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The startDateTime property
     */
    private OffsetDateTime startDateTime;
    /**
     * The thumbprint property
     */
    private String thumbprint;
    /**
     * The type property
     */
    private String type;
    /**
     * The usage property
     */
    private String usage;
    /**
     * Instantiates a new selfSignedCertificate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SelfSignedCertificate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a selfSignedCertificate
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
        return this.additionalData;
    }
    /**
     * Gets the customKeyIdentifier property value. The customKeyIdentifier property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getCustomKeyIdentifier() {
        return this.customKeyIdentifier;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endDateTime property value. The endDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("customKeyIdentifier", (n) -> { this.setCustomKeyIdentifier(n.getByteArrayValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("key", (n) -> { this.setKey(n.getByteArrayValue()); });
        deserializerMap.put("keyId", (n) -> { this.setKeyId(n.getUUIDValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("thumbprint", (n) -> { this.setThumbprint(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. The key property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getKey() {
        return this.key;
    }
    /**
     * Gets the keyId property value. The keyId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getKeyId() {
        return this.keyId;
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
     * Gets the startDateTime property value. The startDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the thumbprint property value. The thumbprint property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbprint() {
        return this.thumbprint;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the usage property value. The usage property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("customKeyIdentifier", this.getCustomKeyIdentifier());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeByteArrayValue("key", this.getKey());
        writer.writeUUIDValue("keyId", this.getKeyId());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the customKeyIdentifier property value. The customKeyIdentifier property
     * @param value Value to set for the customKeyIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomKeyIdentifier(@javax.annotation.Nullable final byte[] value) {
        this.customKeyIdentifier = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the key property value. The key property
     * @param value Value to set for the key property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKey(@javax.annotation.Nullable final byte[] value) {
        this.key = value;
    }
    /**
     * Sets the keyId property value. The keyId property
     * @param value Value to set for the keyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyId(@javax.annotation.Nullable final UUID value) {
        this.keyId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the thumbprint property value. The thumbprint property
     * @param value Value to set for the thumbprint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThumbprint(@javax.annotation.Nullable final String value) {
        this.thumbprint = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the usage property value. The usage property
     * @param value Value to set for the usage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsage(@javax.annotation.Nullable final String value) {
        this.usage = value;
    }
}
