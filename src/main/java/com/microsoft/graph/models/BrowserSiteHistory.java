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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BrowserSiteHistory implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain.
     */
    private Boolean allowRedirect;
    /**
     * The comment for the site.
     */
    private String comment;
    /**
     * Controls what compatibility setting is used for specific sites or domains. The possible values are: default, internetExplorer8Enterprise, internetExplorer7Enterprise, internetExplorer11, internetExplorer10, internetExplorer9, internetExplorer8, internetExplorer7, internetExplorer5, unknownFutureValue.
     */
    private BrowserSiteCompatibilityMode compatibilityMode;
    /**
     * The user who last modified the site.
     */
    private IdentitySet lastModifiedBy;
    /**
     * The merge type of the site. The possible values are: noMerge, default, unknownFutureValue.
     */
    private BrowserSiteMergeType mergeType;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The date and time when the site was last published.
     */
    private OffsetDateTime publishedDateTime;
    /**
     * The target environment that the site should open in. The possible values are: internetExplorerMode, internetExplorer11, microsoftEdge, configurable, none, unknownFutureValue.Prior to June 15, 2022, the internetExplorer11 option would allow opening a site in the Internet Explorer 11 (IE11) desktop application. Following the retirement of IE11 on June 15, 2022, the internetExplorer11 option will no longer open an IE11 window and will instead behave the same as the internetExplorerMode option.
     */
    private BrowserSiteTargetEnvironment targetEnvironment;
    /**
     * Instantiates a new browserSiteHistory and sets the default values.
     */
    public BrowserSiteHistory() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a browserSiteHistory
     */
    @jakarta.annotation.Nonnull
    public static BrowserSiteHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSiteHistory();
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
     * Gets the allowRedirect property value. Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowRedirect() {
        return this.allowRedirect;
    }
    /**
     * Gets the comment property value. The comment for the site.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.comment;
    }
    /**
     * Gets the compatibilityMode property value. Controls what compatibility setting is used for specific sites or domains. The possible values are: default, internetExplorer8Enterprise, internetExplorer7Enterprise, internetExplorer11, internetExplorer10, internetExplorer9, internetExplorer8, internetExplorer7, internetExplorer5, unknownFutureValue.
     * @return a browserSiteCompatibilityMode
     */
    @jakarta.annotation.Nullable
    public BrowserSiteCompatibilityMode getCompatibilityMode() {
        return this.compatibilityMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * Gets the lastModifiedBy property value. The user who last modified the site.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the mergeType property value. The merge type of the site. The possible values are: noMerge, default, unknownFutureValue.
     * @return a browserSiteMergeType
     */
    @jakarta.annotation.Nullable
    public BrowserSiteMergeType getMergeType() {
        return this.mergeType;
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
     * Gets the publishedDateTime property value. The date and time when the site was last published.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this.publishedDateTime;
    }
    /**
     * Gets the targetEnvironment property value. The target environment that the site should open in. The possible values are: internetExplorerMode, internetExplorer11, microsoftEdge, configurable, none, unknownFutureValue.Prior to June 15, 2022, the internetExplorer11 option would allow opening a site in the Internet Explorer 11 (IE11) desktop application. Following the retirement of IE11 on June 15, 2022, the internetExplorer11 option will no longer open an IE11 window and will instead behave the same as the internetExplorerMode option.
     * @return a browserSiteTargetEnvironment
     */
    @jakarta.annotation.Nullable
    public BrowserSiteTargetEnvironment getTargetEnvironment() {
        return this.targetEnvironment;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowRedirect property value. Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain.
     * @param value Value to set for the allowRedirect property.
     */
    public void setAllowRedirect(@jakarta.annotation.Nullable final Boolean value) {
        this.allowRedirect = value;
    }
    /**
     * Sets the comment property value. The comment for the site.
     * @param value Value to set for the comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.comment = value;
    }
    /**
     * Sets the compatibilityMode property value. Controls what compatibility setting is used for specific sites or domains. The possible values are: default, internetExplorer8Enterprise, internetExplorer7Enterprise, internetExplorer11, internetExplorer10, internetExplorer9, internetExplorer8, internetExplorer7, internetExplorer5, unknownFutureValue.
     * @param value Value to set for the compatibilityMode property.
     */
    public void setCompatibilityMode(@jakarta.annotation.Nullable final BrowserSiteCompatibilityMode value) {
        this.compatibilityMode = value;
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the site.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the mergeType property value. The merge type of the site. The possible values are: noMerge, default, unknownFutureValue.
     * @param value Value to set for the mergeType property.
     */
    public void setMergeType(@jakarta.annotation.Nullable final BrowserSiteMergeType value) {
        this.mergeType = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the publishedDateTime property value. The date and time when the site was last published.
     * @param value Value to set for the publishedDateTime property.
     */
    public void setPublishedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.publishedDateTime = value;
    }
    /**
     * Sets the targetEnvironment property value. The target environment that the site should open in. The possible values are: internetExplorerMode, internetExplorer11, microsoftEdge, configurable, none, unknownFutureValue.Prior to June 15, 2022, the internetExplorer11 option would allow opening a site in the Internet Explorer 11 (IE11) desktop application. Following the retirement of IE11 on June 15, 2022, the internetExplorer11 option will no longer open an IE11 window and will instead behave the same as the internetExplorerMode option.
     * @param value Value to set for the targetEnvironment property.
     */
    public void setTargetEnvironment(@jakarta.annotation.Nullable final BrowserSiteTargetEnvironment value) {
        this.targetEnvironment = value;
    }
}
