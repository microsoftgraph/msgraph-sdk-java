package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IntuneBrand implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new IntuneBrand and sets the default values.
     */
    public IntuneBrand() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IntuneBrand
     */
    @jakarta.annotation.Nonnull
    public static IntuneBrand createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IntuneBrand();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the contactITEmailAddress property value. Email address of the person/organization responsible for IT support.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContactITEmailAddress() {
        return this.getBackingStore().get("contactITEmailAddress");
    }
    /**
     * Gets the contactITName property value. Name of the person/organization responsible for IT support.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContactITName() {
        return this.getBackingStore().get("contactITName");
    }
    /**
     * Gets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContactITNotes() {
        return this.getBackingStore().get("contactITNotes");
    }
    /**
     * Gets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContactITPhoneNumber() {
        return this.getBackingStore().get("contactITPhoneNumber");
    }
    /**
     * Gets the darkBackgroundLogo property value. Logo image displayed in Company Portal apps which have a dark background behind the logo.
     * @return a MimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getDarkBackgroundLogo() {
        return this.getBackingStore().get("darkBackgroundLogo");
    }
    /**
     * Gets the displayName property value. Company/organization name that is displayed to end users.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.getBackingStore().get("displayName");
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
     * @return a MimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getLightBackgroundLogo() {
        return this.getBackingStore().get("lightBackgroundLogo");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the onlineSupportSiteName property value. Display name of the company/organizations IT helpdesk site.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOnlineSupportSiteName() {
        return this.getBackingStore().get("onlineSupportSiteName");
    }
    /**
     * Gets the onlineSupportSiteUrl property value. URL to the company/organizations IT helpdesk site.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOnlineSupportSiteUrl() {
        return this.getBackingStore().get("onlineSupportSiteUrl");
    }
    /**
     * Gets the privacyUrl property value. URL to the company/organizations privacy policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrivacyUrl() {
        return this.getBackingStore().get("privacyUrl");
    }
    /**
     * Gets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowDisplayNameNextToLogo() {
        return this.getBackingStore().get("showDisplayNameNextToLogo");
    }
    /**
     * Gets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowLogo() {
        return this.getBackingStore().get("showLogo");
    }
    /**
     * Gets the showNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowNameNextToLogo() {
        return this.getBackingStore().get("showNameNextToLogo");
    }
    /**
     * Gets the themeColor property value. Primary theme color used in the Company Portal applications and web portal.
     * @return a RgbColor
     */
    @jakarta.annotation.Nullable
    public RgbColor getThemeColor() {
        return this.getBackingStore().get("themeColor");
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the contactITEmailAddress property value. Email address of the person/organization responsible for IT support.
     * @param value Value to set for the contactITEmailAddress property.
     */
    public void setContactITEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("contactITEmailAddress", value);
    }
    /**
     * Sets the contactITName property value. Name of the person/organization responsible for IT support.
     * @param value Value to set for the contactITName property.
     */
    public void setContactITName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("contactITName", value);
    }
    /**
     * Sets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support.
     * @param value Value to set for the contactITNotes property.
     */
    public void setContactITNotes(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("contactITNotes", value);
    }
    /**
     * Sets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support.
     * @param value Value to set for the contactITPhoneNumber property.
     */
    public void setContactITPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("contactITPhoneNumber", value);
    }
    /**
     * Sets the darkBackgroundLogo property value. Logo image displayed in Company Portal apps which have a dark background behind the logo.
     * @param value Value to set for the darkBackgroundLogo property.
     */
    public void setDarkBackgroundLogo(@jakarta.annotation.Nullable final MimeContent value) {
        this.getBackingStore().set("darkBackgroundLogo", value);
    }
    /**
     * Sets the displayName property value. Company/organization name that is displayed to end users.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("displayName", value);
    }
    /**
     * Sets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo.
     * @param value Value to set for the lightBackgroundLogo property.
     */
    public void setLightBackgroundLogo(@jakarta.annotation.Nullable final MimeContent value) {
        this.getBackingStore().set("lightBackgroundLogo", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the onlineSupportSiteName property value. Display name of the company/organizations IT helpdesk site.
     * @param value Value to set for the onlineSupportSiteName property.
     */
    public void setOnlineSupportSiteName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("onlineSupportSiteName", value);
    }
    /**
     * Sets the onlineSupportSiteUrl property value. URL to the company/organizations IT helpdesk site.
     * @param value Value to set for the onlineSupportSiteUrl property.
     */
    public void setOnlineSupportSiteUrl(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("onlineSupportSiteUrl", value);
    }
    /**
     * Sets the privacyUrl property value. URL to the company/organizations privacy policy.
     * @param value Value to set for the privacyUrl property.
     */
    public void setPrivacyUrl(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("privacyUrl", value);
    }
    /**
     * Sets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @param value Value to set for the showDisplayNameNextToLogo property.
     */
    public void setShowDisplayNameNextToLogo(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("showDisplayNameNextToLogo", value);
    }
    /**
     * Sets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     * @param value Value to set for the showLogo property.
     */
    public void setShowLogo(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("showLogo", value);
    }
    /**
     * Sets the showNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @param value Value to set for the showNameNextToLogo property.
     */
    public void setShowNameNextToLogo(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("showNameNextToLogo", value);
    }
    /**
     * Sets the themeColor property value. Primary theme color used in the Company Portal applications and web portal.
     * @param value Value to set for the themeColor property.
     */
    public void setThemeColor(@jakarta.annotation.Nullable final RgbColor value) {
        this.getBackingStore().set("themeColor", value);
    }
}
