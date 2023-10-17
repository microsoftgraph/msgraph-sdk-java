package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationalBrandingProperties extends Entity implements Parsable {
    /**
     * Color that appears in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF.
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
     * A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG not larger than 36  245 pixels. We recommend using a transparent image with no padding around the logo.
     */
    private byte[] bannerLogo;
    /**
     * A relative URL for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     */
    private String bannerLogoRelativeUrl;
    /**
     * A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN providers are used at the same time for high availability of read requests. Read-only.
     */
    private java.util.List<String> cdnList;
    /**
     * A custom URL for resetting account credentials. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters.
     */
    private String customAccountResetCredentialsUrl;
    /**
     * A string to replace the default 'Can't access your account?' self-service password reset (SSPR) hyperlink text on the sign-in page. This text must be in Unicode format and not exceed 256 characters.
     */
    private String customCannotAccessYourAccountText;
    /**
     * A custom URL to replace the default URL of the self-service password reset (SSPR) 'Can't access your account?' hyperlink on the sign-in page. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters. DO NOT USE. Use customAccountResetCredentialsUrl instead.
     */
    private String customCannotAccessYourAccountUrl;
    /**
     * CSS styling that appears on the sign-in page. The allowed format is .css format only and not larger than 25 KB.
     */
    private byte[] customCSS;
    /**
     * A relative URL for the customCSS property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     */
    private String customCSSRelativeUrl;
    /**
     * A string to replace the default 'Forgot my password' hyperlink text on the sign-in form. This text must be in Unicode format and not exceed 256 characters.
     */
    private String customForgotMyPasswordText;
    /**
     * A string to replace the default 'Privacy and Cookies' hyperlink text in the footer. This text must be in Unicode format and not exceed 256 characters.
     */
    private String customPrivacyAndCookiesText;
    /**
     * A custom URL to replace the default URL of the 'Privacy and Cookies' hyperlink in the footer. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters.
     */
    private String customPrivacyAndCookiesUrl;
    /**
     * A string to replace the default 'reset it now' hyperlink text on the sign-in form. This text must be in Unicode format and not exceed 256 characters. DO NOT USE: Customization of the 'reset it now' hyperlink text is currently not supported.
     */
    private String customResetItNowText;
    /**
     * A string to replace the the default 'Terms of Use' hyperlink text in the footer. This text must be in Unicode format and not exceed 256 characters.
     */
    private String customTermsOfUseText;
    /**
     * A custom URL to replace the default URL of the 'Terms of Use' hyperlink in the footer. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128characters.
     */
    private String customTermsOfUseUrl;
    /**
     * A custom icon (favicon) to replace a default Microsoft product favicon on an Azure AD tenant.
     */
    private byte[] favicon;
    /**
     * A relative url for the favicon above that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     */
    private String faviconRelativeUrl;
    /**
     * The RGB color to apply to customize the color of the header.
     */
    private String headerBackgroundColor;
    /**
     * A company logo that appears in the header of the sign-in page. The allowed types are PNG or JPEG not larger than 36  245 pixels. We recommend using a transparent image with no padding around the logo.
     */
    private byte[] headerLogo;
    /**
     * A relative URL for the headerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     */
    private String headerLogoRelativeUrl;
    /**
     * Represents the layout configuration to be displayed on the login page for a tenant.
     */
    private LoginPageLayoutConfiguration loginPageLayoutConfiguration;
    /**
     * Represents the various texts that can be hidden on the login page for a tenant.
     */
    private LoginPageTextVisibilitySettings loginPageTextVisibilitySettings;
    /**
     * Text that appears at the bottom of the sign-in box. Use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be in Unicode format and not exceed 1024 characters.
     */
    private String signInPageText;
    /**
     * A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     */
    private byte[] squareLogo;
    /**
     * A square dark version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     */
    private byte[] squareLogoDark;
    /**
     * A relative URL for the squareLogoDark property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     */
    private String squareLogoDarkRelativeUrl;
    /**
     * A relative URL for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     */
    private String squareLogoRelativeUrl;
    /**
     * A string that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links or code, and can't exceed 64 characters.
     */
    private String usernameHintText;
    /**
     * Instantiates a new OrganizationalBrandingProperties and sets the default values.
     */
    public OrganizationalBrandingProperties() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationalBrandingProperties
     */
    @jakarta.annotation.Nonnull
    public static OrganizationalBrandingProperties createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * Gets the backgroundColor property value. Color that appears in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBackgroundColor() {
        return this.backgroundColor;
    }
    /**
     * Gets the backgroundImage property value. Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920  1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getBackgroundImage() {
        return this.backgroundImage;
    }
    /**
     * Gets the backgroundImageRelativeUrl property value. A relative URL for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBackgroundImageRelativeUrl() {
        return this.backgroundImageRelativeUrl;
    }
    /**
     * Gets the bannerLogo property value. A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG not larger than 36  245 pixels. We recommend using a transparent image with no padding around the logo.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getBannerLogo() {
        return this.bannerLogo;
    }
    /**
     * Gets the bannerLogoRelativeUrl property value. A relative URL for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBannerLogoRelativeUrl() {
        return this.bannerLogoRelativeUrl;
    }
    /**
     * Gets the cdnList property value. A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN providers are used at the same time for high availability of read requests. Read-only.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCdnList() {
        return this.cdnList;
    }
    /**
     * Gets the customAccountResetCredentialsUrl property value. A custom URL for resetting account credentials. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomAccountResetCredentialsUrl() {
        return this.customAccountResetCredentialsUrl;
    }
    /**
     * Gets the customCannotAccessYourAccountText property value. A string to replace the default 'Can't access your account?' self-service password reset (SSPR) hyperlink text on the sign-in page. This text must be in Unicode format and not exceed 256 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomCannotAccessYourAccountText() {
        return this.customCannotAccessYourAccountText;
    }
    /**
     * Gets the customCannotAccessYourAccountUrl property value. A custom URL to replace the default URL of the self-service password reset (SSPR) 'Can't access your account?' hyperlink on the sign-in page. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters. DO NOT USE. Use customAccountResetCredentialsUrl instead.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomCannotAccessYourAccountUrl() {
        return this.customCannotAccessYourAccountUrl;
    }
    /**
     * Gets the customCSS property value. CSS styling that appears on the sign-in page. The allowed format is .css format only and not larger than 25 KB.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getCustomCSS() {
        return this.customCSS;
    }
    /**
     * Gets the customCSSRelativeUrl property value. A relative URL for the customCSS property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomCSSRelativeUrl() {
        return this.customCSSRelativeUrl;
    }
    /**
     * Gets the customForgotMyPasswordText property value. A string to replace the default 'Forgot my password' hyperlink text on the sign-in form. This text must be in Unicode format and not exceed 256 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomForgotMyPasswordText() {
        return this.customForgotMyPasswordText;
    }
    /**
     * Gets the customPrivacyAndCookiesText property value. A string to replace the default 'Privacy and Cookies' hyperlink text in the footer. This text must be in Unicode format and not exceed 256 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomPrivacyAndCookiesText() {
        return this.customPrivacyAndCookiesText;
    }
    /**
     * Gets the customPrivacyAndCookiesUrl property value. A custom URL to replace the default URL of the 'Privacy and Cookies' hyperlink in the footer. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomPrivacyAndCookiesUrl() {
        return this.customPrivacyAndCookiesUrl;
    }
    /**
     * Gets the customResetItNowText property value. A string to replace the default 'reset it now' hyperlink text on the sign-in form. This text must be in Unicode format and not exceed 256 characters. DO NOT USE: Customization of the 'reset it now' hyperlink text is currently not supported.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomResetItNowText() {
        return this.customResetItNowText;
    }
    /**
     * Gets the customTermsOfUseText property value. A string to replace the the default 'Terms of Use' hyperlink text in the footer. This text must be in Unicode format and not exceed 256 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomTermsOfUseText() {
        return this.customTermsOfUseText;
    }
    /**
     * Gets the customTermsOfUseUrl property value. A custom URL to replace the default URL of the 'Terms of Use' hyperlink in the footer. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomTermsOfUseUrl() {
        return this.customTermsOfUseUrl;
    }
    /**
     * Gets the favicon property value. A custom icon (favicon) to replace a default Microsoft product favicon on an Azure AD tenant.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getFavicon() {
        return this.favicon;
    }
    /**
     * Gets the faviconRelativeUrl property value. A relative url for the favicon above that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFaviconRelativeUrl() {
        return this.faviconRelativeUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * Gets the headerBackgroundColor property value. The RGB color to apply to customize the color of the header.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHeaderBackgroundColor() {
        return this.headerBackgroundColor;
    }
    /**
     * Gets the headerLogo property value. A company logo that appears in the header of the sign-in page. The allowed types are PNG or JPEG not larger than 36  245 pixels. We recommend using a transparent image with no padding around the logo.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getHeaderLogo() {
        return this.headerLogo;
    }
    /**
     * Gets the headerLogoRelativeUrl property value. A relative URL for the headerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHeaderLogoRelativeUrl() {
        return this.headerLogoRelativeUrl;
    }
    /**
     * Gets the loginPageLayoutConfiguration property value. Represents the layout configuration to be displayed on the login page for a tenant.
     * @return a LoginPageLayoutConfiguration
     */
    @jakarta.annotation.Nullable
    public LoginPageLayoutConfiguration getLoginPageLayoutConfiguration() {
        return this.loginPageLayoutConfiguration;
    }
    /**
     * Gets the loginPageTextVisibilitySettings property value. Represents the various texts that can be hidden on the login page for a tenant.
     * @return a LoginPageTextVisibilitySettings
     */
    @jakarta.annotation.Nullable
    public LoginPageTextVisibilitySettings getLoginPageTextVisibilitySettings() {
        return this.loginPageTextVisibilitySettings;
    }
    /**
     * Gets the signInPageText property value. Text that appears at the bottom of the sign-in box. Use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be in Unicode format and not exceed 1024 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSignInPageText() {
        return this.signInPageText;
    }
    /**
     * Gets the squareLogo property value. A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getSquareLogo() {
        return this.squareLogo;
    }
    /**
     * Gets the squareLogoDark property value. A square dark version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getSquareLogoDark() {
        return this.squareLogoDark;
    }
    /**
     * Gets the squareLogoDarkRelativeUrl property value. A relative URL for the squareLogoDark property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSquareLogoDarkRelativeUrl() {
        return this.squareLogoDarkRelativeUrl;
    }
    /**
     * Gets the squareLogoRelativeUrl property value. A relative URL for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSquareLogoRelativeUrl() {
        return this.squareLogoRelativeUrl;
    }
    /**
     * Gets the usernameHintText property value. A string that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links or code, and can't exceed 64 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsernameHintText() {
        return this.usernameHintText;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the backgroundColor property value. Color that appears in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF.
     * @param value Value to set for the backgroundColor property.
     */
    public void setBackgroundColor(@jakarta.annotation.Nullable final String value) {
        this.backgroundColor = value;
    }
    /**
     * Sets the backgroundImage property value. Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920  1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster.
     * @param value Value to set for the backgroundImage property.
     */
    public void setBackgroundImage(@jakarta.annotation.Nullable final byte[] value) {
        this.backgroundImage = value;
    }
    /**
     * Sets the backgroundImageRelativeUrl property value. A relative URL for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the backgroundImageRelativeUrl property.
     */
    public void setBackgroundImageRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.backgroundImageRelativeUrl = value;
    }
    /**
     * Sets the bannerLogo property value. A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG not larger than 36  245 pixels. We recommend using a transparent image with no padding around the logo.
     * @param value Value to set for the bannerLogo property.
     */
    public void setBannerLogo(@jakarta.annotation.Nullable final byte[] value) {
        this.bannerLogo = value;
    }
    /**
     * Sets the bannerLogoRelativeUrl property value. A relative URL for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     * @param value Value to set for the bannerLogoRelativeUrl property.
     */
    public void setBannerLogoRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.bannerLogoRelativeUrl = value;
    }
    /**
     * Sets the cdnList property value. A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN providers are used at the same time for high availability of read requests. Read-only.
     * @param value Value to set for the cdnList property.
     */
    public void setCdnList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.cdnList = value;
    }
    /**
     * Sets the customAccountResetCredentialsUrl property value. A custom URL for resetting account credentials. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters.
     * @param value Value to set for the customAccountResetCredentialsUrl property.
     */
    public void setCustomAccountResetCredentialsUrl(@jakarta.annotation.Nullable final String value) {
        this.customAccountResetCredentialsUrl = value;
    }
    /**
     * Sets the customCannotAccessYourAccountText property value. A string to replace the default 'Can't access your account?' self-service password reset (SSPR) hyperlink text on the sign-in page. This text must be in Unicode format and not exceed 256 characters.
     * @param value Value to set for the customCannotAccessYourAccountText property.
     */
    public void setCustomCannotAccessYourAccountText(@jakarta.annotation.Nullable final String value) {
        this.customCannotAccessYourAccountText = value;
    }
    /**
     * Sets the customCannotAccessYourAccountUrl property value. A custom URL to replace the default URL of the self-service password reset (SSPR) 'Can't access your account?' hyperlink on the sign-in page. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters. DO NOT USE. Use customAccountResetCredentialsUrl instead.
     * @param value Value to set for the customCannotAccessYourAccountUrl property.
     */
    public void setCustomCannotAccessYourAccountUrl(@jakarta.annotation.Nullable final String value) {
        this.customCannotAccessYourAccountUrl = value;
    }
    /**
     * Sets the customCSS property value. CSS styling that appears on the sign-in page. The allowed format is .css format only and not larger than 25 KB.
     * @param value Value to set for the customCSS property.
     */
    public void setCustomCSS(@jakarta.annotation.Nullable final byte[] value) {
        this.customCSS = value;
    }
    /**
     * Sets the customCSSRelativeUrl property value. A relative URL for the customCSS property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the customCSSRelativeUrl property.
     */
    public void setCustomCSSRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.customCSSRelativeUrl = value;
    }
    /**
     * Sets the customForgotMyPasswordText property value. A string to replace the default 'Forgot my password' hyperlink text on the sign-in form. This text must be in Unicode format and not exceed 256 characters.
     * @param value Value to set for the customForgotMyPasswordText property.
     */
    public void setCustomForgotMyPasswordText(@jakarta.annotation.Nullable final String value) {
        this.customForgotMyPasswordText = value;
    }
    /**
     * Sets the customPrivacyAndCookiesText property value. A string to replace the default 'Privacy and Cookies' hyperlink text in the footer. This text must be in Unicode format and not exceed 256 characters.
     * @param value Value to set for the customPrivacyAndCookiesText property.
     */
    public void setCustomPrivacyAndCookiesText(@jakarta.annotation.Nullable final String value) {
        this.customPrivacyAndCookiesText = value;
    }
    /**
     * Sets the customPrivacyAndCookiesUrl property value. A custom URL to replace the default URL of the 'Privacy and Cookies' hyperlink in the footer. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters.
     * @param value Value to set for the customPrivacyAndCookiesUrl property.
     */
    public void setCustomPrivacyAndCookiesUrl(@jakarta.annotation.Nullable final String value) {
        this.customPrivacyAndCookiesUrl = value;
    }
    /**
     * Sets the customResetItNowText property value. A string to replace the default 'reset it now' hyperlink text on the sign-in form. This text must be in Unicode format and not exceed 256 characters. DO NOT USE: Customization of the 'reset it now' hyperlink text is currently not supported.
     * @param value Value to set for the customResetItNowText property.
     */
    public void setCustomResetItNowText(@jakarta.annotation.Nullable final String value) {
        this.customResetItNowText = value;
    }
    /**
     * Sets the customTermsOfUseText property value. A string to replace the the default 'Terms of Use' hyperlink text in the footer. This text must be in Unicode format and not exceed 256 characters.
     * @param value Value to set for the customTermsOfUseText property.
     */
    public void setCustomTermsOfUseText(@jakarta.annotation.Nullable final String value) {
        this.customTermsOfUseText = value;
    }
    /**
     * Sets the customTermsOfUseUrl property value. A custom URL to replace the default URL of the 'Terms of Use' hyperlink in the footer. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128characters.
     * @param value Value to set for the customTermsOfUseUrl property.
     */
    public void setCustomTermsOfUseUrl(@jakarta.annotation.Nullable final String value) {
        this.customTermsOfUseUrl = value;
    }
    /**
     * Sets the favicon property value. A custom icon (favicon) to replace a default Microsoft product favicon on an Azure AD tenant.
     * @param value Value to set for the favicon property.
     */
    public void setFavicon(@jakarta.annotation.Nullable final byte[] value) {
        this.favicon = value;
    }
    /**
     * Sets the faviconRelativeUrl property value. A relative url for the favicon above that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the faviconRelativeUrl property.
     */
    public void setFaviconRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.faviconRelativeUrl = value;
    }
    /**
     * Sets the headerBackgroundColor property value. The RGB color to apply to customize the color of the header.
     * @param value Value to set for the headerBackgroundColor property.
     */
    public void setHeaderBackgroundColor(@jakarta.annotation.Nullable final String value) {
        this.headerBackgroundColor = value;
    }
    /**
     * Sets the headerLogo property value. A company logo that appears in the header of the sign-in page. The allowed types are PNG or JPEG not larger than 36  245 pixels. We recommend using a transparent image with no padding around the logo.
     * @param value Value to set for the headerLogo property.
     */
    public void setHeaderLogo(@jakarta.annotation.Nullable final byte[] value) {
        this.headerLogo = value;
    }
    /**
     * Sets the headerLogoRelativeUrl property value. A relative URL for the headerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     * @param value Value to set for the headerLogoRelativeUrl property.
     */
    public void setHeaderLogoRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.headerLogoRelativeUrl = value;
    }
    /**
     * Sets the loginPageLayoutConfiguration property value. Represents the layout configuration to be displayed on the login page for a tenant.
     * @param value Value to set for the loginPageLayoutConfiguration property.
     */
    public void setLoginPageLayoutConfiguration(@jakarta.annotation.Nullable final LoginPageLayoutConfiguration value) {
        this.loginPageLayoutConfiguration = value;
    }
    /**
     * Sets the loginPageTextVisibilitySettings property value. Represents the various texts that can be hidden on the login page for a tenant.
     * @param value Value to set for the loginPageTextVisibilitySettings property.
     */
    public void setLoginPageTextVisibilitySettings(@jakarta.annotation.Nullable final LoginPageTextVisibilitySettings value) {
        this.loginPageTextVisibilitySettings = value;
    }
    /**
     * Sets the signInPageText property value. Text that appears at the bottom of the sign-in box. Use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be in Unicode format and not exceed 1024 characters.
     * @param value Value to set for the signInPageText property.
     */
    public void setSignInPageText(@jakarta.annotation.Nullable final String value) {
        this.signInPageText = value;
    }
    /**
     * Sets the squareLogo property value. A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     * @param value Value to set for the squareLogo property.
     */
    public void setSquareLogo(@jakarta.annotation.Nullable final byte[] value) {
        this.squareLogo = value;
    }
    /**
     * Sets the squareLogoDark property value. A square dark version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     * @param value Value to set for the squareLogoDark property.
     */
    public void setSquareLogoDark(@jakarta.annotation.Nullable final byte[] value) {
        this.squareLogoDark = value;
    }
    /**
     * Sets the squareLogoDarkRelativeUrl property value. A relative URL for the squareLogoDark property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the squareLogoDarkRelativeUrl property.
     */
    public void setSquareLogoDarkRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.squareLogoDarkRelativeUrl = value;
    }
    /**
     * Sets the squareLogoRelativeUrl property value. A relative URL for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the squareLogoRelativeUrl property.
     */
    public void setSquareLogoRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.squareLogoRelativeUrl = value;
    }
    /**
     * Sets the usernameHintText property value. A string that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links or code, and can't exceed 64 characters.
     * @param value Value to set for the usernameHintText property.
     */
    public void setUsernameHintText(@jakarta.annotation.Nullable final String value) {
        this.usernameHintText = value;
    }
}
