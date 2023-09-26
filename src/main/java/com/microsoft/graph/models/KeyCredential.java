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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KeyCredential implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A 40-character binary type that can be used to identify the credential. Optional. When not provided in the payload, defaults to the thumbprint of the certificate.
     */
    private Base64url customKeyIdentifier;
    /**
     * Friendly name for the key. Optional.
     */
    private String displayName;
    /**
     * The date and time at which the credential expires. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime endDateTime;
    /**
     * The certificate's raw data in byte array converted to Base64 string. Returned only on $select for a single object, that is, GET applications/{applicationId}?$select=keyCredentials or GET servicePrincipals/{servicePrincipalId}?$select=keyCredentials; otherwise, it is always null.  From a .cer certificate, you can read the key using the Convert.ToBase64String() method. For more information, see Get the certificate key.
     */
    private Base64url key;
    /**
     * The unique identifier (GUID) for the key.
     */
    private UUID keyId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The date and time at which the credential becomes valid.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime startDateTime;
    /**
     * The type of key credential; for example, Symmetric, AsymmetricX509Cert.
     */
    private String type;
    /**
     * A string that describes the purpose for which the key can be used; for example, Verify.
     */
    private String usage;
    /**
     * Instantiates a new KeyCredential and sets the default values.
     */
    public KeyCredential() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KeyCredential
     */
    @jakarta.annotation.Nonnull
    public static KeyCredential createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KeyCredential();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the customKeyIdentifier property value. A 40-character binary type that can be used to identify the credential. Optional. When not provided in the payload, defaults to the thumbprint of the certificate.
     * @return a Base64url
     */
    @jakarta.annotation.Nullable
    public Base64url getCustomKeyIdentifier() {
        return this.customKeyIdentifier;
    }
    /**
     * Gets the displayName property value. Friendly name for the key. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endDateTime property value. The date and time at which the credential expires. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("customKeyIdentifier", (n) -> { this.setCustomKeyIdentifier(n.getObjectValue(Base64url::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("key", (n) -> { this.setKey(n.getObjectValue(Base64url::createFromDiscriminatorValue)); });
        deserializerMap.put("keyId", (n) -> { this.setKeyId(n.getUUIDValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. The certificate's raw data in byte array converted to Base64 string. Returned only on $select for a single object, that is, GET applications/{applicationId}?$select=keyCredentials or GET servicePrincipals/{servicePrincipalId}?$select=keyCredentials; otherwise, it is always null.  From a .cer certificate, you can read the key using the Convert.ToBase64String() method. For more information, see Get the certificate key.
     * @return a Base64url
     */
    @jakarta.annotation.Nullable
    public Base64url getKey() {
        return this.key;
    }
    /**
     * Gets the keyId property value. The unique identifier (GUID) for the key.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getKeyId() {
        return this.keyId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the startDateTime property value. The date and time at which the credential becomes valid.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the type property value. The type of key credential; for example, Symmetric, AsymmetricX509Cert.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the usage property value. A string that describes the purpose for which the key can be used; for example, Verify.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("customKeyIdentifier", this.getCustomKeyIdentifier());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeObjectValue("key", this.getKey());
        writer.writeUUIDValue("keyId", this.getKeyId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("usage", this.getUsage());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the customKeyIdentifier property value. A 40-character binary type that can be used to identify the credential. Optional. When not provided in the payload, defaults to the thumbprint of the certificate.
     * @param value Value to set for the customKeyIdentifier property.
     */
    public void setCustomKeyIdentifier(@jakarta.annotation.Nullable final Base64url value) {
        this.customKeyIdentifier = value;
    }
    /**
     * Sets the displayName property value. Friendly name for the key. Optional.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endDateTime property value. The date and time at which the credential expires. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the key property value. The certificate's raw data in byte array converted to Base64 string. Returned only on $select for a single object, that is, GET applications/{applicationId}?$select=keyCredentials or GET servicePrincipals/{servicePrincipalId}?$select=keyCredentials; otherwise, it is always null.  From a .cer certificate, you can read the key using the Convert.ToBase64String() method. For more information, see Get the certificate key.
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final Base64url value) {
        this.key = value;
    }
    /**
     * Sets the keyId property value. The unique identifier (GUID) for the key.
     * @param value Value to set for the keyId property.
     */
    public void setKeyId(@jakarta.annotation.Nullable final UUID value) {
        this.keyId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the startDateTime property value. The date and time at which the credential becomes valid.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the type property value. The type of key credential; for example, Symmetric, AsymmetricX509Cert.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the usage property value. A string that describes the purpose for which the key can be used; for example, Verify.
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final String value) {
        this.usage = value;
    }
}
