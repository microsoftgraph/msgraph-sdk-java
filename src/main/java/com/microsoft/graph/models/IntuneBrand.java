package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal. */
public class IntuneBrand implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Email address of the person/organization responsible for IT support. */
    private String _contactITEmailAddress;
    /** Name of the person/organization responsible for IT support. */
    private String _contactITName;
    /** Text comments regarding the person/organization responsible for IT support. */
    private String _contactITNotes;
    /** Phone number of the person/organization responsible for IT support. */
    private String _contactITPhoneNumber;
    /** Logo image displayed in Company Portal apps which have a dark background behind the logo. */
    private MimeContent _darkBackgroundLogo;
    /** Company/organization name that is displayed to end users. */
    private String _displayName;
    /** Logo image displayed in Company Portal apps which have a light background behind the logo. */
    private MimeContent _lightBackgroundLogo;
    /** The OdataType property */
    private String _odataType;
    /** Display name of the company/organizations IT helpdesk site. */
    private String _onlineSupportSiteName;
    /** URL to the company/organizations IT helpdesk site. */
    private String _onlineSupportSiteUrl;
    /** URL to the company/organizations privacy policy. */
    private String _privacyUrl;
    /** Boolean that represents whether the administrator-supplied display name will be shown next to the logo image. */
    private Boolean _showDisplayNameNextToLogo;
    /** Boolean that represents whether the administrator-supplied logo images are shown or not shown. */
    private Boolean _showLogo;
    /** Boolean that represents whether the administrator-supplied display name will be shown next to the logo image. */
    private Boolean _showNameNextToLogo;
    /** Primary theme color used in the Company Portal applications and web portal. */
    private RgbColor _themeColor;
    /**
     * Instantiates a new intuneBrand and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IntuneBrand() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.intuneBrand");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a intuneBrand
     */
    @javax.annotation.Nonnull
    public static IntuneBrand createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IntuneBrand();
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
     * Gets the contactITEmailAddress property value. Email address of the person/organization responsible for IT support.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITEmailAddress() {
        return this._contactITEmailAddress;
    }
    /**
     * Gets the contactITName property value. Name of the person/organization responsible for IT support.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITName() {
        return this._contactITName;
    }
    /**
     * Gets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITNotes() {
        return this._contactITNotes;
    }
    /**
     * Gets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITPhoneNumber() {
        return this._contactITPhoneNumber;
    }
    /**
     * Gets the darkBackgroundLogo property value. Logo image displayed in Company Portal apps which have a dark background behind the logo.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getDarkBackgroundLogo() {
        return this._darkBackgroundLogo;
    }
    /**
     * Gets the displayName property value. Company/organization name that is displayed to end users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IntuneBrand currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(15);
        deserializerMap.put("contactITEmailAddress", (n) -> { currentObject.setContactITEmailAddress(n.getStringValue()); });
        deserializerMap.put("contactITName", (n) -> { currentObject.setContactITName(n.getStringValue()); });
        deserializerMap.put("contactITNotes", (n) -> { currentObject.setContactITNotes(n.getStringValue()); });
        deserializerMap.put("contactITPhoneNumber", (n) -> { currentObject.setContactITPhoneNumber(n.getStringValue()); });
        deserializerMap.put("darkBackgroundLogo", (n) -> { currentObject.setDarkBackgroundLogo(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lightBackgroundLogo", (n) -> { currentObject.setLightBackgroundLogo(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("onlineSupportSiteName", (n) -> { currentObject.setOnlineSupportSiteName(n.getStringValue()); });
        deserializerMap.put("onlineSupportSiteUrl", (n) -> { currentObject.setOnlineSupportSiteUrl(n.getStringValue()); });
        deserializerMap.put("privacyUrl", (n) -> { currentObject.setPrivacyUrl(n.getStringValue()); });
        deserializerMap.put("showDisplayNameNextToLogo", (n) -> { currentObject.setShowDisplayNameNextToLogo(n.getBooleanValue()); });
        deserializerMap.put("showLogo", (n) -> { currentObject.setShowLogo(n.getBooleanValue()); });
        deserializerMap.put("showNameNextToLogo", (n) -> { currentObject.setShowNameNextToLogo(n.getBooleanValue()); });
        deserializerMap.put("themeColor", (n) -> { currentObject.setThemeColor(n.getObjectValue(RgbColor::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getLightBackgroundLogo() {
        return this._lightBackgroundLogo;
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
     * Gets the onlineSupportSiteName property value. Display name of the company/organizations IT helpdesk site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnlineSupportSiteName() {
        return this._onlineSupportSiteName;
    }
    /**
     * Gets the onlineSupportSiteUrl property value. URL to the company/organizations IT helpdesk site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnlineSupportSiteUrl() {
        return this._onlineSupportSiteUrl;
    }
    /**
     * Gets the privacyUrl property value. URL to the company/organizations privacy policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivacyUrl() {
        return this._privacyUrl;
    }
    /**
     * Gets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowDisplayNameNextToLogo() {
        return this._showDisplayNameNextToLogo;
    }
    /**
     * Gets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowLogo() {
        return this._showLogo;
    }
    /**
     * Gets the showNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowNameNextToLogo() {
        return this._showNameNextToLogo;
    }
    /**
     * Gets the themeColor property value. Primary theme color used in the Company Portal applications and web portal.
     * @return a rgbColor
     */
    @javax.annotation.Nullable
    public RgbColor getThemeColor() {
        return this._themeColor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contactITEmailAddress", this.getContactITEmailAddress());
        writer.writeStringValue("contactITName", this.getContactITName());
        writer.writeStringValue("contactITNotes", this.getContactITNotes());
        writer.writeStringValue("contactITPhoneNumber", this.getContactITPhoneNumber());
        writer.writeObjectValue("darkBackgroundLogo", this.getDarkBackgroundLogo());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("lightBackgroundLogo", this.getLightBackgroundLogo());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("onlineSupportSiteName", this.getOnlineSupportSiteName());
        writer.writeStringValue("onlineSupportSiteUrl", this.getOnlineSupportSiteUrl());
        writer.writeStringValue("privacyUrl", this.getPrivacyUrl());
        writer.writeBooleanValue("showDisplayNameNextToLogo", this.getShowDisplayNameNextToLogo());
        writer.writeBooleanValue("showLogo", this.getShowLogo());
        writer.writeBooleanValue("showNameNextToLogo", this.getShowNameNextToLogo());
        writer.writeObjectValue("themeColor", this.getThemeColor());
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
     * Sets the contactITEmailAddress property value. Email address of the person/organization responsible for IT support.
     * @param value Value to set for the contactITEmailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactITEmailAddress(@javax.annotation.Nullable final String value) {
        this._contactITEmailAddress = value;
    }
    /**
     * Sets the contactITName property value. Name of the person/organization responsible for IT support.
     * @param value Value to set for the contactITName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactITName(@javax.annotation.Nullable final String value) {
        this._contactITName = value;
    }
    /**
     * Sets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support.
     * @param value Value to set for the contactITNotes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactITNotes(@javax.annotation.Nullable final String value) {
        this._contactITNotes = value;
    }
    /**
     * Sets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support.
     * @param value Value to set for the contactITPhoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactITPhoneNumber(@javax.annotation.Nullable final String value) {
        this._contactITPhoneNumber = value;
    }
    /**
     * Sets the darkBackgroundLogo property value. Logo image displayed in Company Portal apps which have a dark background behind the logo.
     * @param value Value to set for the darkBackgroundLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDarkBackgroundLogo(@javax.annotation.Nullable final MimeContent value) {
        this._darkBackgroundLogo = value;
    }
    /**
     * Sets the displayName property value. Company/organization name that is displayed to end users.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo.
     * @param value Value to set for the lightBackgroundLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLightBackgroundLogo(@javax.annotation.Nullable final MimeContent value) {
        this._lightBackgroundLogo = value;
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
     * Sets the onlineSupportSiteName property value. Display name of the company/organizations IT helpdesk site.
     * @param value Value to set for the onlineSupportSiteName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineSupportSiteName(@javax.annotation.Nullable final String value) {
        this._onlineSupportSiteName = value;
    }
    /**
     * Sets the onlineSupportSiteUrl property value. URL to the company/organizations IT helpdesk site.
     * @param value Value to set for the onlineSupportSiteUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineSupportSiteUrl(@javax.annotation.Nullable final String value) {
        this._onlineSupportSiteUrl = value;
    }
    /**
     * Sets the privacyUrl property value. URL to the company/organizations privacy policy.
     * @param value Value to set for the privacyUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyUrl(@javax.annotation.Nullable final String value) {
        this._privacyUrl = value;
    }
    /**
     * Sets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @param value Value to set for the showDisplayNameNextToLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowDisplayNameNextToLogo(@javax.annotation.Nullable final Boolean value) {
        this._showDisplayNameNextToLogo = value;
    }
    /**
     * Sets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     * @param value Value to set for the showLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowLogo(@javax.annotation.Nullable final Boolean value) {
        this._showLogo = value;
    }
    /**
     * Sets the showNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @param value Value to set for the showNameNextToLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowNameNextToLogo(@javax.annotation.Nullable final Boolean value) {
        this._showNameNextToLogo = value;
    }
    /**
     * Sets the themeColor property value. Primary theme color used in the Company Portal applications and web portal.
     * @param value Value to set for the themeColor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThemeColor(@javax.annotation.Nullable final RgbColor value) {
        this._themeColor = value;
    }
}
