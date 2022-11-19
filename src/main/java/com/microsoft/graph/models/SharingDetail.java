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
public class SharingDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The user who shared the document. */
    private InsightIdentity _sharedBy;
    /** The date and time the file was last shared. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _sharedDateTime;
    /** The sharingReference property */
    private ResourceReference _sharingReference;
    /** The subject with which the document was shared. */
    private String _sharingSubject;
    /** Determines the way the document was shared, can be by a 'Link', 'Attachment', 'Group', 'Site'. */
    private String _sharingType;
    /**
     * Instantiates a new sharingDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SharingDetail() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.sharingDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharingDetail
     */
    @javax.annotation.Nonnull
    public static SharingDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharingDetail();
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
        final SharingDetail currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("sharedBy", (n) -> { currentObject.setSharedBy(n.getObjectValue(InsightIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedDateTime", (n) -> { currentObject.setSharedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sharingReference", (n) -> { currentObject.setSharingReference(n.getObjectValue(ResourceReference::createFromDiscriminatorValue)); });
        deserializerMap.put("sharingSubject", (n) -> { currentObject.setSharingSubject(n.getStringValue()); });
        deserializerMap.put("sharingType", (n) -> { currentObject.setSharingType(n.getStringValue()); });
        return deserializerMap
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
     * Gets the sharedBy property value. The user who shared the document.
     * @return a insightIdentity
     */
    @javax.annotation.Nullable
    public InsightIdentity getSharedBy() {
        return this._sharedBy;
    }
    /**
     * Gets the sharedDateTime property value. The date and time the file was last shared. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSharedDateTime() {
        return this._sharedDateTime;
    }
    /**
     * Gets the sharingReference property value. The sharingReference property
     * @return a resourceReference
     */
    @javax.annotation.Nullable
    public ResourceReference getSharingReference() {
        return this._sharingReference;
    }
    /**
     * Gets the sharingSubject property value. The subject with which the document was shared.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSharingSubject() {
        return this._sharingSubject;
    }
    /**
     * Gets the sharingType property value. Determines the way the document was shared, can be by a 'Link', 'Attachment', 'Group', 'Site'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSharingType() {
        return this._sharingType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("sharedBy", this.getSharedBy());
        writer.writeOffsetDateTimeValue("sharedDateTime", this.getSharedDateTime());
        writer.writeStringValue("sharingSubject", this.getSharingSubject());
        writer.writeStringValue("sharingType", this.getSharingType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the sharedBy property value. The user who shared the document.
     * @param value Value to set for the sharedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedBy(@javax.annotation.Nullable final InsightIdentity value) {
        this._sharedBy = value;
    }
    /**
     * Sets the sharedDateTime property value. The date and time the file was last shared. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the sharedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._sharedDateTime = value;
    }
    /**
     * Sets the sharingReference property value. The sharingReference property
     * @param value Value to set for the sharingReference property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharingReference(@javax.annotation.Nullable final ResourceReference value) {
        this._sharingReference = value;
    }
    /**
     * Sets the sharingSubject property value. The subject with which the document was shared.
     * @param value Value to set for the sharingSubject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharingSubject(@javax.annotation.Nullable final String value) {
        this._sharingSubject = value;
    }
    /**
     * Sets the sharingType property value. Determines the way the document was shared, can be by a 'Link', 'Attachment', 'Group', 'Site'.
     * @param value Value to set for the sharingType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharingType(@javax.annotation.Nullable final String value) {
        this._sharingType = value;
    }
}
