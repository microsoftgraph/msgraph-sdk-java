package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UploadSession implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time in UTC that the upload session will expire. The complete file must be uploaded before this expiration time is reached.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * A collection of byte ranges that the server is missing for the file. These ranges are zero indexed and of the format 'start-end' (e.g. '0-26' to indicate the first 27 bytes of the file). When uploading files as Outlook attachments, instead of a collection of ranges, this property always indicates a single value '{start}', the location in the file where the next upload should begin.
     */
    private java.util.List<String> nextExpectedRanges;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The URL endpoint that accepts PUT requests for byte ranges of the file.
     */
    private String uploadUrl;
    /**
     * Instantiates a new uploadSession and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UploadSession() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a uploadSession
     */
    @jakarta.annotation.Nonnull
    public static UploadSession createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadSession();
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
     * Gets the expirationDateTime property value. The date and time in UTC that the upload session will expire. The complete file must be uploaded before this expiration time is reached.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("nextExpectedRanges", (n) -> { this.setNextExpectedRanges(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("uploadUrl", (n) -> { this.setUploadUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nextExpectedRanges property value. A collection of byte ranges that the server is missing for the file. These ranges are zero indexed and of the format 'start-end' (e.g. '0-26' to indicate the first 27 bytes of the file). When uploading files as Outlook attachments, instead of a collection of ranges, this property always indicates a single value '{start}', the location in the file where the next upload should begin.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNextExpectedRanges() {
        return this.nextExpectedRanges;
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
     * Gets the uploadUrl property value. The URL endpoint that accepts PUT requests for byte ranges of the file.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUploadUrl() {
        return this.uploadUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeCollectionOfPrimitiveValues("nextExpectedRanges", this.getNextExpectedRanges());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("uploadUrl", this.getUploadUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the expirationDateTime property value. The date and time in UTC that the upload session will expire. The complete file must be uploaded before this expiration time is reached.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the nextExpectedRanges property value. A collection of byte ranges that the server is missing for the file. These ranges are zero indexed and of the format 'start-end' (e.g. '0-26' to indicate the first 27 bytes of the file). When uploading files as Outlook attachments, instead of a collection of ranges, this property always indicates a single value '{start}', the location in the file where the next upload should begin.
     * @param value Value to set for the nextExpectedRanges property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNextExpectedRanges(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.nextExpectedRanges = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the uploadUrl property value. The URL endpoint that accepts PUT requests for byte ranges of the file.
     * @param value Value to set for the uploadUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUploadUrl(@jakarta.annotation.Nullable final String value) {
        this.uploadUrl = value;
    }
}
