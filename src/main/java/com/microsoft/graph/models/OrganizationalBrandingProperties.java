package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OrganizationalBrandingProperties extends Entity implements Parsable {
    /**
     * Color that will appear in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF.
     */
    private String backgroundColor;
    /**
     * Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920  1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster.
     */
    private byte[] backgroundImage;
    /**
     * A relative URL for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     */
    private String backgroundImageRelativeUrl;
    /**
     * A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG no larger than 36  245 pixels. We recommend using a transparent image with no padding around the logo.
     */
    private byte[] bannerLogo;
    /**
     * A relative url for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     */
    private String bannerLogoRelativeUrl;
    /**
     * A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN providers are used at the same time for high availability of read requests. Read-only.
     */
    private java.util.List<String> cdnList;
    /**
     * The customAccountResetCredentialsUrl property
     */
    private String customAccountResetCredentialsUrl;
    /**
     * The customCannotAccessYourAccountText property
     */
    private String customCannotAccessYourAccountText;
    /**
     * The customCannotAccessYourAccountUrl property
     */
    private String customCannotAccessYourAccountUrl;
    /**
     * The customCSS property
     */
    private byte[] customCSS;
    /**
     * The customCSSRelativeUrl property
     */
    private String customCSSRelativeUrl;
    /**
     * The customForgotMyPasswordText property
     */
    private String customForgotMyPasswordText;
    /**
     * The customPrivacyAndCookiesText property
     */
    private String customPrivacyAndCookiesText;
    /**
     * The customPrivacyAndCookiesUrl property
     */
    private String customPrivacyAndCookiesUrl;
    /**
     * The customResetItNowText property
     */
    private String customResetItNowText;
    /**
     * The customTermsOfUseText property
     */
    private String customTermsOfUseText;
    /**
     * The customTermsOfUseUrl property
     */
    private String customTermsOfUseUrl;
    /**
     * The favicon property
     */
    private byte[] favicon;
    /**
     * The faviconRelativeUrl property
     */
    private String faviconRelativeUrl;
    /**
     * The headerBackgroundColor property
     */
    private String headerBackgroundColor;
    /**
     * The headerLogo property
     */
    private byte[] headerLogo;
    /**
     * The headerLogoRelativeUrl property
     */
    private String headerLogoRelativeUrl;
    /**
     * The loginPageLayoutConfiguration property
     */
    private LoginPageLayoutConfiguration loginPageLayoutConfiguration;
    /**
     * The loginPageTextVisibilitySettings property
     */
    private LoginPageTextVisibilitySettings loginPageTextVisibilitySettings;
    /**
     * Text that appears at the bottom of the sign-in box. You can use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be Unicode and not exceed 1024 characters.
     */
    private String signInPageText;
    /**
     * A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG no larger than 240 x 240 pixels and no more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     */
    private byte[] squareLogo;
    /**
     * The squareLogoDark property
     */
    private byte[] squareLogoDark;
    /**
     * The squareLogoDarkRelativeUrl property
     */
    private String squareLogoDarkRelativeUrl;
    /**
     * A relative url for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     */
    private String squareLogoRelativeUrl;
    /**
     * String that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links or code, and can't exceed 64 characters.
     */
    private String usernameHintText;
    /**
     * Instantiates a new organizationalBrandingProperties and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationalBrandingProperties() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalBrandingProperties
     */
    @javax.annotation.Nonnull
    public static OrganizationalBrandingProperties createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.organizationalBranding": return new OrganizationalBranding();
                case "#microsoft.graph.organizationalBrandingLocalization": return new OrganizationalBrandingLocalization();
            }
        }
        return new OrganizationalBrandingProperties();
    }
    /**
     * Gets the backgroundColor property value. Color that will appear in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBackgroundColor() {
        return this.backgroundColor;
    }
    /**
     * Gets the backgroundImage property value. Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920  1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getBackgroundImage() {
        return this.backgroundImage;
    }
    /**
     * Gets the backgroundImageRelativeUrl property value. A relative URL for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBackgroundImageRelativeUrl() {
        return this.backgroundImageRelativeUrl;
    }
    /**
     * Gets the bannerLogo property value. A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG no larger than 36  245 pixels. We recommend using a transparent image with no padding around the logo.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getBannerLogo() {
        return this.bannerLogo;
    }
    /**
     * Gets the bannerLogoRelativeUrl property value. A relative url for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBannerLogoRelativeUrl() {
        return this.bannerLogoRelativeUrl;
    }
    /**
     * Gets the cdnList property value. A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN providers are used at the same time for high availability of read requests. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCdnList() {
        return this.cdnList;
    }
    /**
     * Gets the customAccountResetCredentialsUrl property value. The customAccountResetCredentialsUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomAccountResetCredentialsUrl() {
        return this.customAccountResetCredentialsUrl;
    }
    /**
     * Gets the customCannotAccessYourAccountText property value. The customCannotAccessYourAccountText property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCannotAccessYourAccountText() {
        return this.customCannotAccessYourAccountText;
    }
    /**
     * Gets the customCannotAccessYourAccountUrl property value. The customCannotAccessYourAccountUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCannotAccessYourAccountUrl() {
        return this.customCannotAccessYourAccountUrl;
    }
    /**
     * Gets the customCSS property value. The customCSS property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getCustomCSS() {
        return this.customCSS;
    }
    /**
     * Gets the customCSSRelativeUrl property value. The customCSSRelativeUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCSSRelativeUrl() {
        return this.customCSSRelativeUrl;
    }
    /**
     * Gets the customForgotMyPasswordText property value. The customForgotMyPasswordText property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomForgotMyPasswordText() {
        return this.customForgotMyPasswordText;
    }
    /**
     * Gets the customPrivacyAndCookiesText property value. The customPrivacyAndCookiesText property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomPrivacyAndCookiesText() {
        return this.customPrivacyAndCookiesText;
    }
    /**
     * Gets the customPrivacyAndCookiesUrl property value. The customPrivacyAndCookiesUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomPrivacyAndCookiesUrl() {
        return this.customPrivacyAndCookiesUrl;
    }
    /**
     * Gets the customResetItNowText property value. The customResetItNowText property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomResetItNowText() {
        return this.customResetItNowText;
    }
    /**
     * Gets the customTermsOfUseText property value. The customTermsOfUseText property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomTermsOfUseText() {
        return this.customTermsOfUseText;
    }
    /**
     * Gets the customTermsOfUseUrl property value. The customTermsOfUseUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomTermsOfUseUrl() {
        return this.customTermsOfUseUrl;
    }
    /**
     * Gets the favicon property value. The favicon property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getFavicon() {
        return this.favicon;
    }
    /**
     * Gets the faviconRelativeUrl property value. The faviconRelativeUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFaviconRelativeUrl() {
        return this.faviconRelativeUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("backgroundColor", (n) -> { this.setBackgroundColor(n.getStringValue()); });
        deserializerMap.put("backgroundImage", (n) -> { this.setBackgroundImage(n.getByteArrayValue()); });
        deserializerMap.put("backgroundImageRelativeUrl", (n) -> { this.setBackgroundImageRelativeUrl(n.getStringValue()); });
        deserializerMap.put("bannerLogo", (n) -> { this.setBannerLogo(n.getByteArrayValue()); });
        deserializerMap.put("bannerLogoRelativeUrl", (n) -> { this.setBannerLogoRelativeUrl(n.getStringValue()); });
        deserializerMap.put("cdnList", (n) -> { this.setCdnList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("customAccountResetCredentialsUrl", (n) -> { this.setCustomAccountResetCredentialsUrl(n.getStringValue()); });
        deserializerMap.put("customCannotAccessYourAccountText", (n) -> { this.setCustomCannotAccessYourAccountText(n.getStringValue()); });
        deserializerMap.put("customCannotAccessYourAccountUrl", (n) -> { this.setCustomCannotAccessYourAccountUrl(n.getStringValue()); });
        deserializerMap.put("customCSS", (n) -> { this.setCustomCSS(n.getByteArrayValue()); });
        deserializerMap.put("customCSSRelativeUrl", (n) -> { this.setCustomCSSRelativeUrl(n.getStringValue()); });
        deserializerMap.put("customForgotMyPasswordText", (n) -> { this.setCustomForgotMyPasswordText(n.getStringValue()); });
        deserializerMap.put("customPrivacyAndCookiesText", (n) -> { this.setCustomPrivacyAndCookiesText(n.getStringValue()); });
        deserializerMap.put("customPrivacyAndCookiesUrl", (n) -> { this.setCustomPrivacyAndCookiesUrl(n.getStringValue()); });
        deserializerMap.put("customResetItNowText", (n) -> { this.setCustomResetItNowText(n.getStringValue()); });
        deserializerMap.put("customTermsOfUseText", (n) -> { this.setCustomTermsOfUseText(n.getStringValue()); });
        deserializerMap.put("customTermsOfUseUrl", (n) -> { this.setCustomTermsOfUseUrl(n.getStringValue()); });
        deserializerMap.put("favicon", (n) -> { this.setFavicon(n.getByteArrayValue()); });
        deserializerMap.put("faviconRelativeUrl", (n) -> { this.setFaviconRelativeUrl(n.getStringValue()); });
        deserializerMap.put("headerBackgroundColor", (n) -> { this.setHeaderBackgroundColor(n.getStringValue()); });
        deserializerMap.put("headerLogo", (n) -> { this.setHeaderLogo(n.getByteArrayValue()); });
        deserializerMap.put("headerLogoRelativeUrl", (n) -> { this.setHeaderLogoRelativeUrl(n.getStringValue()); });
        deserializerMap.put("loginPageLayoutConfiguration", (n) -> { this.setLoginPageLayoutConfiguration(n.getObjectValue(LoginPageLayoutConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("loginPageTextVisibilitySettings", (n) -> { this.setLoginPageTextVisibilitySettings(n.getObjectValue(LoginPageTextVisibilitySettings::createFromDiscriminatorValue)); });
        deserializerMap.put("signInPageText", (n) -> { this.setSignInPageText(n.getStringValue()); });
        deserializerMap.put("squareLogo", (n) -> { this.setSquareLogo(n.getByteArrayValue()); });
        deserializerMap.put("squareLogoDark", (n) -> { this.setSquareLogoDark(n.getByteArrayValue()); });
        deserializerMap.put("squareLogoDarkRelativeUrl", (n) -> { this.setSquareLogoDarkRelativeUrl(n.getStringValue()); });
        deserializerMap.put("squareLogoRelativeUrl", (n) -> { this.setSquareLogoRelativeUrl(n.getStringValue()); });
        deserializerMap.put("usernameHintText", (n) -> { this.setUsernameHintText(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the headerBackgroundColor property value. The headerBackgroundColor property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHeaderBackgroundColor() {
        return this.headerBackgroundColor;
    }
    /**
     * Gets the headerLogo property value. The headerLogo property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getHeaderLogo() {
        return this.headerLogo;
    }
    /**
     * Gets the headerLogoRelativeUrl property value. The headerLogoRelativeUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHeaderLogoRelativeUrl() {
        return this.headerLogoRelativeUrl;
    }
    /**
     * Gets the loginPageLayoutConfiguration property value. The loginPageLayoutConfiguration property
     * @return a loginPageLayoutConfiguration
     */
    @javax.annotation.Nullable
    public LoginPageLayoutConfiguration getLoginPageLayoutConfiguration() {
        return this.loginPageLayoutConfiguration;
    }
    /**
     * Gets the loginPageTextVisibilitySettings property value. The loginPageTextVisibilitySettings property
     * @return a loginPageTextVisibilitySettings
     */
    @javax.annotation.Nullable
    public LoginPageTextVisibilitySettings getLoginPageTextVisibilitySettings() {
        return this.loginPageTextVisibilitySettings;
    }
    /**
     * Gets the signInPageText property value. Text that appears at the bottom of the sign-in box. You can use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be Unicode and not exceed 1024 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignInPageText() {
        return this.signInPageText;
    }
    /**
     * Gets the squareLogo property value. A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG no larger than 240 x 240 pixels and no more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getSquareLogo() {
        return this.squareLogo;
    }
    /**
     * Gets the squareLogoDark property value. The squareLogoDark property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getSquareLogoDark() {
        return this.squareLogoDark;
    }
    /**
     * Gets the squareLogoDarkRelativeUrl property value. The squareLogoDarkRelativeUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSquareLogoDarkRelativeUrl() {
        return this.squareLogoDarkRelativeUrl;
    }
    /**
     * Gets the squareLogoRelativeUrl property value. A relative url for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSquareLogoRelativeUrl() {
        return this.squareLogoRelativeUrl;
    }
    /**
     * Gets the usernameHintText property value. String that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links or code, and can't exceed 64 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsernameHintText() {
        return this.usernameHintText;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("backgroundColor", this.getBackgroundColor());
        writer.writeByteArrayValue("backgroundImage", this.getBackgroundImage());
        writer.writeStringValue("backgroundImageRelativeUrl", this.getBackgroundImageRelativeUrl());
        writer.writeByteArrayValue("bannerLogo", this.getBannerLogo());
        writer.writeStringValue("bannerLogoRelativeUrl", this.getBannerLogoRelativeUrl());
        writer.writeCollectionOfPrimitiveValues("cdnList", this.getCdnList());
        writer.writeStringValue("customAccountResetCredentialsUrl", this.getCustomAccountResetCredentialsUrl());
        writer.writeStringValue("customCannotAccessYourAccountText", this.getCustomCannotAccessYourAccountText());
        writer.writeStringValue("customCannotAccessYourAccountUrl", this.getCustomCannotAccessYourAccountUrl());
        writer.writeByteArrayValue("customCSS", this.getCustomCSS());
        writer.writeStringValue("customCSSRelativeUrl", this.getCustomCSSRelativeUrl());
        writer.writeStringValue("customForgotMyPasswordText", this.getCustomForgotMyPasswordText());
        writer.writeStringValue("customPrivacyAndCookiesText", this.getCustomPrivacyAndCookiesText());
        writer.writeStringValue("customPrivacyAndCookiesUrl", this.getCustomPrivacyAndCookiesUrl());
        writer.writeStringValue("customResetItNowText", this.getCustomResetItNowText());
        writer.writeStringValue("customTermsOfUseText", this.getCustomTermsOfUseText());
        writer.writeStringValue("customTermsOfUseUrl", this.getCustomTermsOfUseUrl());
        writer.writeByteArrayValue("favicon", this.getFavicon());
        writer.writeStringValue("faviconRelativeUrl", this.getFaviconRelativeUrl());
        writer.writeStringValue("headerBackgroundColor", this.getHeaderBackgroundColor());
        writer.writeByteArrayValue("headerLogo", this.getHeaderLogo());
        writer.writeStringValue("headerLogoRelativeUrl", this.getHeaderLogoRelativeUrl());
        writer.writeObjectValue("loginPageLayoutConfiguration", this.getLoginPageLayoutConfiguration());
        writer.writeObjectValue("loginPageTextVisibilitySettings", this.getLoginPageTextVisibilitySettings());
        writer.writeStringValue("signInPageText", this.getSignInPageText());
        writer.writeByteArrayValue("squareLogo", this.getSquareLogo());
        writer.writeByteArrayValue("squareLogoDark", this.getSquareLogoDark());
        writer.writeStringValue("squareLogoDarkRelativeUrl", this.getSquareLogoDarkRelativeUrl());
        writer.writeStringValue("squareLogoRelativeUrl", this.getSquareLogoRelativeUrl());
        writer.writeStringValue("usernameHintText", this.getUsernameHintText());
    }
    /**
     * Sets the backgroundColor property value. Color that will appear in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF.
     * @param value Value to set for the backgroundColor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackgroundColor(@javax.annotation.Nullable final String value) {
        this.backgroundColor = value;
    }
    /**
     * Sets the backgroundImage property value. Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920  1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster.
     * @param value Value to set for the backgroundImage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackgroundImage(@javax.annotation.Nullable final byte[] value) {
        this.backgroundImage = value;
    }
    /**
     * Sets the backgroundImageRelativeUrl property value. A relative URL for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the backgroundImageRelativeUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackgroundImageRelativeUrl(@javax.annotation.Nullable final String value) {
        this.backgroundImageRelativeUrl = value;
    }
    /**
     * Sets the bannerLogo property value. A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG no larger than 36  245 pixels. We recommend using a transparent image with no padding around the logo.
     * @param value Value to set for the bannerLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBannerLogo(@javax.annotation.Nullable final byte[] value) {
        this.bannerLogo = value;
    }
    /**
     * Sets the bannerLogoRelativeUrl property value. A relative url for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     * @param value Value to set for the bannerLogoRelativeUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBannerLogoRelativeUrl(@javax.annotation.Nullable final String value) {
        this.bannerLogoRelativeUrl = value;
    }
    /**
     * Sets the cdnList property value. A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN providers are used at the same time for high availability of read requests. Read-only.
     * @param value Value to set for the cdnList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCdnList(@javax.annotation.Nullable final java.util.List<String> value) {
        this.cdnList = value;
    }
    /**
     * Sets the customAccountResetCredentialsUrl property value. The customAccountResetCredentialsUrl property
     * @param value Value to set for the customAccountResetCredentialsUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomAccountResetCredentialsUrl(@javax.annotation.Nullable final String value) {
        this.customAccountResetCredentialsUrl = value;
    }
    /**
     * Sets the customCannotAccessYourAccountText property value. The customCannotAccessYourAccountText property
     * @param value Value to set for the customCannotAccessYourAccountText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomCannotAccessYourAccountText(@javax.annotation.Nullable final String value) {
        this.customCannotAccessYourAccountText = value;
    }
    /**
     * Sets the customCannotAccessYourAccountUrl property value. The customCannotAccessYourAccountUrl property
     * @param value Value to set for the customCannotAccessYourAccountUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomCannotAccessYourAccountUrl(@javax.annotation.Nullable final String value) {
        this.customCannotAccessYourAccountUrl = value;
    }
    /**
     * Sets the customCSS property value. The customCSS property
     * @param value Value to set for the customCSS property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomCSS(@javax.annotation.Nullable final byte[] value) {
        this.customCSS = value;
    }
    /**
     * Sets the customCSSRelativeUrl property value. The customCSSRelativeUrl property
     * @param value Value to set for the customCSSRelativeUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomCSSRelativeUrl(@javax.annotation.Nullable final String value) {
        this.customCSSRelativeUrl = value;
    }
    /**
     * Sets the customForgotMyPasswordText property value. The customForgotMyPasswordText property
     * @param value Value to set for the customForgotMyPasswordText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomForgotMyPasswordText(@javax.annotation.Nullable final String value) {
        this.customForgotMyPasswordText = value;
    }
    /**
     * Sets the customPrivacyAndCookiesText property value. The customPrivacyAndCookiesText property
     * @param value Value to set for the customPrivacyAndCookiesText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomPrivacyAndCookiesText(@javax.annotation.Nullable final String value) {
        this.customPrivacyAndCookiesText = value;
    }
    /**
     * Sets the customPrivacyAndCookiesUrl property value. The customPrivacyAndCookiesUrl property
     * @param value Value to set for the customPrivacyAndCookiesUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomPrivacyAndCookiesUrl(@javax.annotation.Nullable final String value) {
        this.customPrivacyAndCookiesUrl = value;
    }
    /**
     * Sets the customResetItNowText property value. The customResetItNowText property
     * @param value Value to set for the customResetItNowText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomResetItNowText(@javax.annotation.Nullable final String value) {
        this.customResetItNowText = value;
    }
    /**
     * Sets the customTermsOfUseText property value. The customTermsOfUseText property
     * @param value Value to set for the customTermsOfUseText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomTermsOfUseText(@javax.annotation.Nullable final String value) {
        this.customTermsOfUseText = value;
    }
    /**
     * Sets the customTermsOfUseUrl property value. The customTermsOfUseUrl property
     * @param value Value to set for the customTermsOfUseUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomTermsOfUseUrl(@javax.annotation.Nullable final String value) {
        this.customTermsOfUseUrl = value;
    }
    /**
     * Sets the favicon property value. The favicon property
     * @param value Value to set for the favicon property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFavicon(@javax.annotation.Nullable final byte[] value) {
        this.favicon = value;
    }
    /**
     * Sets the faviconRelativeUrl property value. The faviconRelativeUrl property
     * @param value Value to set for the faviconRelativeUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFaviconRelativeUrl(@javax.annotation.Nullable final String value) {
        this.faviconRelativeUrl = value;
    }
    /**
     * Sets the headerBackgroundColor property value. The headerBackgroundColor property
     * @param value Value to set for the headerBackgroundColor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHeaderBackgroundColor(@javax.annotation.Nullable final String value) {
        this.headerBackgroundColor = value;
    }
    /**
     * Sets the headerLogo property value. The headerLogo property
     * @param value Value to set for the headerLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHeaderLogo(@javax.annotation.Nullable final byte[] value) {
        this.headerLogo = value;
    }
    /**
     * Sets the headerLogoRelativeUrl property value. The headerLogoRelativeUrl property
     * @param value Value to set for the headerLogoRelativeUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHeaderLogoRelativeUrl(@javax.annotation.Nullable final String value) {
        this.headerLogoRelativeUrl = value;
    }
    /**
     * Sets the loginPageLayoutConfiguration property value. The loginPageLayoutConfiguration property
     * @param value Value to set for the loginPageLayoutConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLoginPageLayoutConfiguration(@javax.annotation.Nullable final LoginPageLayoutConfiguration value) {
        this.loginPageLayoutConfiguration = value;
    }
    /**
     * Sets the loginPageTextVisibilitySettings property value. The loginPageTextVisibilitySettings property
     * @param value Value to set for the loginPageTextVisibilitySettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLoginPageTextVisibilitySettings(@javax.annotation.Nullable final LoginPageTextVisibilitySettings value) {
        this.loginPageTextVisibilitySettings = value;
    }
    /**
     * Sets the signInPageText property value. Text that appears at the bottom of the sign-in box. You can use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be Unicode and not exceed 1024 characters.
     * @param value Value to set for the signInPageText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignInPageText(@javax.annotation.Nullable final String value) {
        this.signInPageText = value;
    }
    /**
     * Sets the squareLogo property value. A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG no larger than 240 x 240 pixels and no more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     * @param value Value to set for the squareLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSquareLogo(@javax.annotation.Nullable final byte[] value) {
        this.squareLogo = value;
    }
    /**
     * Sets the squareLogoDark property value. The squareLogoDark property
     * @param value Value to set for the squareLogoDark property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSquareLogoDark(@javax.annotation.Nullable final byte[] value) {
        this.squareLogoDark = value;
    }
    /**
     * Sets the squareLogoDarkRelativeUrl property value. The squareLogoDarkRelativeUrl property
     * @param value Value to set for the squareLogoDarkRelativeUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSquareLogoDarkRelativeUrl(@javax.annotation.Nullable final String value) {
        this.squareLogoDarkRelativeUrl = value;
    }
    /**
     * Sets the squareLogoRelativeUrl property value. A relative url for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the squareLogoRelativeUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSquareLogoRelativeUrl(@javax.annotation.Nullable final String value) {
        this.squareLogoRelativeUrl = value;
    }
    /**
     * Sets the usernameHintText property value. String that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links or code, and can't exceed 64 characters.
     * @param value Value to set for the usernameHintText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsernameHintText(@javax.annotation.Nullable final String value) {
        this.usernameHintText = value;
    }
}
