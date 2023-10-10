package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharingDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The user who shared the document.
     */
    private InsightIdentity sharedBy;
    /**
     * The date and time the file was last shared. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime sharedDateTime;
    /**
     * The sharingReference property
     */
    private ResourceReference sharingReference;
    /**
     * The subject with which the document was shared.
     */
    private String sharingSubject;
    /**
     * Determines the way the document was shared, can be by a 'Link', 'Attachment', 'Group', 'Site'.
     */
    private String sharingType;
    /**
     * Instantiates a new SharingDetail and sets the default values.
     */
    public SharingDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharingDetail
     */
    @jakarta.annotation.Nonnull
    public static SharingDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharingDetail();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sharedBy", (n) -> { this.setSharedBy(n.getObjectValue(InsightIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedDateTime", (n) -> { this.setSharedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sharingReference", (n) -> { this.setSharingReference(n.getObjectValue(ResourceReference::createFromDiscriminatorValue)); });
        deserializerMap.put("sharingSubject", (n) -> { this.setSharingSubject(n.getStringValue()); });
        deserializerMap.put("sharingType", (n) -> { this.setSharingType(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the sharedBy property value. The user who shared the document.
     * @return a InsightIdentity
     */
    @jakarta.annotation.Nullable
    public InsightIdentity getSharedBy() {
        return this.sharedBy;
    }
    /**
     * Gets the sharedDateTime property value. The date and time the file was last shared. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSharedDateTime() {
        return this.sharedDateTime;
    }
    /**
     * Gets the sharingReference property value. The sharingReference property
     * @return a ResourceReference
     */
    @jakarta.annotation.Nullable
    public ResourceReference getSharingReference() {
        return this.sharingReference;
    }
    /**
     * Gets the sharingSubject property value. The subject with which the document was shared.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSharingSubject() {
        return this.sharingSubject;
    }
    /**
     * Gets the sharingType property value. Determines the way the document was shared, can be by a 'Link', 'Attachment', 'Group', 'Site'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSharingType() {
        return this.sharingType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("sharedBy", this.getSharedBy());
        writer.writeOffsetDateTimeValue("sharedDateTime", this.getSharedDateTime());
        writer.writeStringValue("sharingSubject", this.getSharingSubject());
        writer.writeStringValue("sharingType", this.getSharingType());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sharedBy property value. The user who shared the document.
     * @param value Value to set for the sharedBy property.
     */
    public void setSharedBy(@jakarta.annotation.Nullable final InsightIdentity value) {
        this.sharedBy = value;
    }
    /**
     * Sets the sharedDateTime property value. The date and time the file was last shared. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the sharedDateTime property.
     */
    public void setSharedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.sharedDateTime = value;
    }
    /**
     * Sets the sharingReference property value. The sharingReference property
     * @param value Value to set for the sharingReference property.
     */
    public void setSharingReference(@jakarta.annotation.Nullable final ResourceReference value) {
        this.sharingReference = value;
    }
    /**
     * Sets the sharingSubject property value. The subject with which the document was shared.
     * @param value Value to set for the sharingSubject property.
     */
    public void setSharingSubject(@jakarta.annotation.Nullable final String value) {
        this.sharingSubject = value;
    }
    /**
     * Sets the sharingType property value. Determines the way the document was shared, can be by a 'Link', 'Attachment', 'Group', 'Site'.
     * @param value Value to set for the sharingType property.
     */
    public void setSharingType(@jakarta.annotation.Nullable final String value) {
        this.sharingType = value;
    }
}
