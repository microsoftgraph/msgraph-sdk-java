package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The history for the site modifications
 */
public class BrowserSiteHistory implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Boolean attribute that controls the behavior of redirected sites */
    private Boolean allowRedirect;
    /** The content for the site */
    private String comment;
    /** Controls what compatibility setting is used for specific sites or domains */
    private BrowserSiteCompatibilityMode compatibilityMode;
    /** The user who modified the site */
    private IdentitySet lastModifiedBy;
    /** The merge type of the site */
    private BrowserSiteMergeType mergeType;
    /** The OdataType property */
    private String odataType;
    /** The time the site was last published */
    private OffsetDateTime publishedDateTime;
    /** The render mode in Edge client that the site is supposed to open in */
    private BrowserSiteTargetEnvironment targetEnvironment;
    /**
     * Instantiates a new browserSiteHistory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BrowserSiteHistory() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a browserSiteHistory
     */
    @javax.annotation.Nonnull
    public static BrowserSiteHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSiteHistory();
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
     * Gets the allowRedirect property value. Boolean attribute that controls the behavior of redirected sites
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowRedirect() {
        return this.allowRedirect;
    }
    /**
     * Gets the comment property value. The content for the site
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this.comment;
    }
    /**
     * Gets the compatibilityMode property value. Controls what compatibility setting is used for specific sites or domains
     * @return a browserSiteCompatibilityMode
     */
    @javax.annotation.Nullable
    public BrowserSiteCompatibilityMode getCompatibilityMode() {
        return this.compatibilityMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("allowRedirect", (n) -> { this.setAllowRedirect(n.getBooleanValue()); });
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("compatibilityMode", (n) -> { this.setCompatibilityMode(n.getEnumValue(BrowserSiteCompatibilityMode.class)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("mergeType", (n) -> { this.setMergeType(n.getEnumValue(BrowserSiteMergeType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("publishedDateTime", (n) -> { this.setPublishedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("targetEnvironment", (n) -> { this.setTargetEnvironment(n.getEnumValue(BrowserSiteTargetEnvironment.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The user who modified the site
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the mergeType property value. The merge type of the site
     * @return a browserSiteMergeType
     */
    @javax.annotation.Nullable
    public BrowserSiteMergeType getMergeType() {
        return this.mergeType;
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
     * Gets the publishedDateTime property value. The time the site was last published
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this.publishedDateTime;
    }
    /**
     * Gets the targetEnvironment property value. The render mode in Edge client that the site is supposed to open in
     * @return a browserSiteTargetEnvironment
     */
    @javax.annotation.Nullable
    public BrowserSiteTargetEnvironment getTargetEnvironment() {
        return this.targetEnvironment;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowRedirect", this.getAllowRedirect());
        writer.writeStringValue("comment", this.getComment());
        writer.writeEnumValue("compatibilityMode", this.getCompatibilityMode());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeEnumValue("mergeType", this.getMergeType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("publishedDateTime", this.getPublishedDateTime());
        writer.writeEnumValue("targetEnvironment", this.getTargetEnvironment());
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
     * Sets the allowRedirect property value. Boolean attribute that controls the behavior of redirected sites
     * @param value Value to set for the allowRedirect property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowRedirect(@javax.annotation.Nullable final Boolean value) {
        this.allowRedirect = value;
    }
    /**
     * Sets the comment property value. The content for the site
     * @param value Value to set for the comment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComment(@javax.annotation.Nullable final String value) {
        this.comment = value;
    }
    /**
     * Sets the compatibilityMode property value. Controls what compatibility setting is used for specific sites or domains
     * @param value Value to set for the compatibilityMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompatibilityMode(@javax.annotation.Nullable final BrowserSiteCompatibilityMode value) {
        this.compatibilityMode = value;
    }
    /**
     * Sets the lastModifiedBy property value. The user who modified the site
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the mergeType property value. The merge type of the site
     * @param value Value to set for the mergeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMergeType(@javax.annotation.Nullable final BrowserSiteMergeType value) {
        this.mergeType = value;
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
     * Sets the publishedDateTime property value. The time the site was last published
     * @param value Value to set for the publishedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.publishedDateTime = value;
    }
    /**
     * Sets the targetEnvironment property value. The render mode in Edge client that the site is supposed to open in
     * @param value Value to set for the targetEnvironment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetEnvironment(@javax.annotation.Nullable final BrowserSiteTargetEnvironment value) {
        this.targetEnvironment = value;
    }
}
