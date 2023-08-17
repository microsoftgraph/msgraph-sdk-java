package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
 */
public class IntuneBrand implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Email address of the person/organization responsible for IT support.
     */
    private String contactITEmailAddress;
    /**
     * Name of the person/organization responsible for IT support.
     */
    private String contactITName;
    /**
     * Text comments regarding the person/organization responsible for IT support.
     */
    private String contactITNotes;
    /**
     * Phone number of the person/organization responsible for IT support.
     */
    private String contactITPhoneNumber;
    /**
     * Logo image displayed in Company Portal apps which have a dark background behind the logo.
     */
    private MimeContent darkBackgroundLogo;
    /**
     * Company/organization name that is displayed to end users.
     */
    private String displayName;
    /**
     * Logo image displayed in Company Portal apps which have a light background behind the logo.
     */
    private MimeContent lightBackgroundLogo;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Display name of the company/organizations IT helpdesk site.
     */
    private String onlineSupportSiteName;
    /**
     * URL to the company/organizations IT helpdesk site.
     */
    private String onlineSupportSiteUrl;
    /**
     * URL to the company/organizations privacy policy.
     */
    private String privacyUrl;
    /**
     * Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     */
    private Boolean showDisplayNameNextToLogo;
    /**
     * Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     */
    private Boolean showLogo;
    /**
     * Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     */
    private Boolean showNameNextToLogo;
    /**
     * Primary theme color used in the Company Portal applications and web portal.
     */
    private RgbColor themeColor;
    /**
     * Instantiates a new intuneBrand and sets the default values.
     */
    public IntuneBrand() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a intuneBrand
     */
    @jakarta.annotation.Nonnull
    public static IntuneBrand createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IntuneBrand();
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
     * Gets the contactITEmailAddress property value. Email address of the person/organization responsible for IT support.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContactITEmailAddress() {
        return this.contactITEmailAddress;
    }
    /**
     * Gets the contactITName property value. Name of the person/organization responsible for IT support.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContactITName() {
        return this.contactITName;
    }
    /**
     * Gets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContactITNotes() {
        return this.contactITNotes;
    }
    /**
     * Gets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContactITPhoneNumber() {
        return this.contactITPhoneNumber;
    }
    /**
     * Gets the darkBackgroundLogo property value. Logo image displayed in Company Portal apps which have a dark background behind the logo.
     * @return a mimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getDarkBackgroundLogo() {
        return this.darkBackgroundLogo;
    }
    /**
     * Gets the displayName property value. Company/organization name that is displayed to end users.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("contactITEmailAddress", (n) -> { this.setContactITEmailAddress(n.getStringValue()); });
        deserializerMap.put("contactITName", (n) -> { this.setContactITName(n.getStringValue()); });
        deserializerMap.put("contactITNotes", (n) -> { this.setContactITNotes(n.getStringValue()); });
        deserializerMap.put("contactITPhoneNumber", (n) -> { this.setContactITPhoneNumber(n.getStringValue()); });
        deserializerMap.put("darkBackgroundLogo", (n) -> { this.setDarkBackgroundLogo(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lightBackgroundLogo", (n) -> { this.setLightBackgroundLogo(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("onlineSupportSiteName", (n) -> { this.setOnlineSupportSiteName(n.getStringValue()); });
        deserializerMap.put("onlineSupportSiteUrl", (n) -> { this.setOnlineSupportSiteUrl(n.getStringValue()); });
        deserializerMap.put("privacyUrl", (n) -> { this.setPrivacyUrl(n.getStringValue()); });
        deserializerMap.put("showDisplayNameNextToLogo", (n) -> { this.setShowDisplayNameNextToLogo(n.getBooleanValue()); });
        deserializerMap.put("showLogo", (n) -> { this.setShowLogo(n.getBooleanValue()); });
        deserializerMap.put("showNameNextToLogo", (n) -> { this.setShowNameNextToLogo(n.getBooleanValue()); });
        deserializerMap.put("themeColor", (n) -> { this.setThemeColor(n.getObjectValue(RgbColor::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo.
     * @return a mimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getLightBackgroundLogo() {
        return this.lightBackgroundLogo;
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
     * Gets the onlineSupportSiteName property value. Display name of the company/organizations IT helpdesk site.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOnlineSupportSiteName() {
        return this.onlineSupportSiteName;
    }
    /**
     * Gets the onlineSupportSiteUrl property value. URL to the company/organizations IT helpdesk site.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOnlineSupportSiteUrl() {
        return this.onlineSupportSiteUrl;
    }
    /**
     * Gets the privacyUrl property value. URL to the company/organizations privacy policy.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrivacyUrl() {
        return this.privacyUrl;
    }
    /**
     * Gets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowDisplayNameNextToLogo() {
        return this.showDisplayNameNextToLogo;
    }
    /**
     * Gets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowLogo() {
        return this.showLogo;
    }
    /**
     * Gets the showNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowNameNextToLogo() {
        return this.showNameNextToLogo;
    }
    /**
     * Gets the themeColor property value. Primary theme color used in the Company Portal applications and web portal.
     * @return a rgbColor
     */
    @jakarta.annotation.Nullable
    public RgbColor getThemeColor() {
        return this.themeColor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the contactITEmailAddress property value. Email address of the person/organization responsible for IT support.
     * @param value Value to set for the contactITEmailAddress property.
     */
    public void setContactITEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.contactITEmailAddress = value;
    }
    /**
     * Sets the contactITName property value. Name of the person/organization responsible for IT support.
     * @param value Value to set for the contactITName property.
     */
    public void setContactITName(@jakarta.annotation.Nullable final String value) {
        this.contactITName = value;
    }
    /**
     * Sets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support.
     * @param value Value to set for the contactITNotes property.
     */
    public void setContactITNotes(@jakarta.annotation.Nullable final String value) {
        this.contactITNotes = value;
    }
    /**
     * Sets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support.
     * @param value Value to set for the contactITPhoneNumber property.
     */
    public void setContactITPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.contactITPhoneNumber = value;
    }
    /**
     * Sets the darkBackgroundLogo property value. Logo image displayed in Company Portal apps which have a dark background behind the logo.
     * @param value Value to set for the darkBackgroundLogo property.
     */
    public void setDarkBackgroundLogo(@jakarta.annotation.Nullable final MimeContent value) {
        this.darkBackgroundLogo = value;
    }
    /**
     * Sets the displayName property value. Company/organization name that is displayed to end users.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo.
     * @param value Value to set for the lightBackgroundLogo property.
     */
    public void setLightBackgroundLogo(@jakarta.annotation.Nullable final MimeContent value) {
        this.lightBackgroundLogo = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the onlineSupportSiteName property value. Display name of the company/organizations IT helpdesk site.
     * @param value Value to set for the onlineSupportSiteName property.
     */
    public void setOnlineSupportSiteName(@jakarta.annotation.Nullable final String value) {
        this.onlineSupportSiteName = value;
    }
    /**
     * Sets the onlineSupportSiteUrl property value. URL to the company/organizations IT helpdesk site.
     * @param value Value to set for the onlineSupportSiteUrl property.
     */
    public void setOnlineSupportSiteUrl(@jakarta.annotation.Nullable final String value) {
        this.onlineSupportSiteUrl = value;
    }
    /**
     * Sets the privacyUrl property value. URL to the company/organizations privacy policy.
     * @param value Value to set for the privacyUrl property.
     */
    public void setPrivacyUrl(@jakarta.annotation.Nullable final String value) {
        this.privacyUrl = value;
    }
    /**
     * Sets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @param value Value to set for the showDisplayNameNextToLogo property.
     */
    public void setShowDisplayNameNextToLogo(@jakarta.annotation.Nullable final Boolean value) {
        this.showDisplayNameNextToLogo = value;
    }
    /**
     * Sets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     * @param value Value to set for the showLogo property.
     */
    public void setShowLogo(@jakarta.annotation.Nullable final Boolean value) {
        this.showLogo = value;
    }
    /**
     * Sets the showNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @param value Value to set for the showNameNextToLogo property.
     */
    public void setShowNameNextToLogo(@jakarta.annotation.Nullable final Boolean value) {
        this.showNameNextToLogo = value;
    }
    /**
     * Sets the themeColor property value. Primary theme color used in the Company Portal applications and web portal.
     * @param value Value to set for the themeColor property.
     */
    public void setThemeColor(@jakarta.annotation.Nullable final RgbColor value) {
        this.themeColor = value;
    }
}
