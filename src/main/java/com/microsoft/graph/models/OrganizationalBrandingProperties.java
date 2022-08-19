package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the organizationalBranding singleton. */
public class OrganizationalBrandingProperties extends Entity implements Parsable {
    /** Color that will appear in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF. */
    private String _backgroundColor;
    /** Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920 × 1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster. */
    private byte[] _backgroundImage;
    /** A relative URL for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. */
    private String _backgroundImageRelativeUrl;
    /** A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG no larger than 36 × 245 pixels. We recommend using a transparent image with no padding around the logo. */
    private byte[] _bannerLogo;
    /** A relative url for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only. */
    private String _bannerLogoRelativeUrl;
    /** A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN providers are used at the same time for high availability of read requests. Read-only. */
    private java.util.List<String> _cdnList;
    /** Text that appears at the bottom of the sign-in box. You can use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be Unicode and not exceed 1024 characters. */
    private String _signInPageText;
    /** A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG no larger than 240 x 240 pixels and no more than 10 KB in size. We recommend using a transparent image with no padding around the logo. */
    private byte[] _squareLogo;
    /** A relative url for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. */
    private String _squareLogoRelativeUrl;
    /** String that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links or code, and can't exceed 64 characters. */
    private String _usernameHintText;
    /**
     * Instantiates a new organizationalBrandingProperties and sets the default values.
     * @return a void
     */
    public OrganizationalBrandingProperties() {
        super();
        this.setOdataType("#microsoft.graph.organizationalBrandingProperties");
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
        return this._backgroundColor;
    }
    /**
     * Gets the backgroundImage property value. Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920 × 1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getBackgroundImage() {
        return this._backgroundImage;
    }
    /**
     * Gets the backgroundImageRelativeUrl property value. A relative URL for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBackgroundImageRelativeUrl() {
        return this._backgroundImageRelativeUrl;
    }
    /**
     * Gets the bannerLogo property value. A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG no larger than 36 × 245 pixels. We recommend using a transparent image with no padding around the logo.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getBannerLogo() {
        return this._bannerLogo;
    }
    /**
     * Gets the bannerLogoRelativeUrl property value. A relative url for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBannerLogoRelativeUrl() {
        return this._bannerLogoRelativeUrl;
    }
    /**
     * Gets the cdnList property value. A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN providers are used at the same time for high availability of read requests. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCdnList() {
        return this._cdnList;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizationalBrandingProperties currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("backgroundColor", (n) -> { currentObject.setBackgroundColor(n.getStringValue()); });
            this.put("backgroundImage", (n) -> { currentObject.setBackgroundImage(n.getByteArrayValue()); });
            this.put("backgroundImageRelativeUrl", (n) -> { currentObject.setBackgroundImageRelativeUrl(n.getStringValue()); });
            this.put("bannerLogo", (n) -> { currentObject.setBannerLogo(n.getByteArrayValue()); });
            this.put("bannerLogoRelativeUrl", (n) -> { currentObject.setBannerLogoRelativeUrl(n.getStringValue()); });
            this.put("cdnList", (n) -> { currentObject.setCdnList(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("signInPageText", (n) -> { currentObject.setSignInPageText(n.getStringValue()); });
            this.put("squareLogo", (n) -> { currentObject.setSquareLogo(n.getByteArrayValue()); });
            this.put("squareLogoRelativeUrl", (n) -> { currentObject.setSquareLogoRelativeUrl(n.getStringValue()); });
            this.put("usernameHintText", (n) -> { currentObject.setUsernameHintText(n.getStringValue()); });
        }};
    }
    /**
     * Gets the signInPageText property value. Text that appears at the bottom of the sign-in box. You can use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be Unicode and not exceed 1024 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignInPageText() {
        return this._signInPageText;
    }
    /**
     * Gets the squareLogo property value. A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG no larger than 240 x 240 pixels and no more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getSquareLogo() {
        return this._squareLogo;
    }
    /**
     * Gets the squareLogoRelativeUrl property value. A relative url for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSquareLogoRelativeUrl() {
        return this._squareLogoRelativeUrl;
    }
    /**
     * Gets the usernameHintText property value. String that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links or code, and can't exceed 64 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsernameHintText() {
        return this._usernameHintText;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("backgroundColor", this.getBackgroundColor());
        writer.writeByteArrayValue("backgroundImage", this.getBackgroundImage());
        writer.writeStringValue("backgroundImageRelativeUrl", this.getBackgroundImageRelativeUrl());
        writer.writeByteArrayValue("bannerLogo", this.getBannerLogo());
        writer.writeStringValue("bannerLogoRelativeUrl", this.getBannerLogoRelativeUrl());
        writer.writeCollectionOfPrimitiveValues("cdnList", this.getCdnList());
        writer.writeStringValue("signInPageText", this.getSignInPageText());
        writer.writeByteArrayValue("squareLogo", this.getSquareLogo());
        writer.writeStringValue("squareLogoRelativeUrl", this.getSquareLogoRelativeUrl());
        writer.writeStringValue("usernameHintText", this.getUsernameHintText());
    }
    /**
     * Sets the backgroundColor property value. Color that will appear in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF.
     * @param value Value to set for the backgroundColor property.
     * @return a void
     */
    public void setBackgroundColor(@javax.annotation.Nullable final String value) {
        this._backgroundColor = value;
    }
    /**
     * Sets the backgroundImage property value. Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920 × 1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster.
     * @param value Value to set for the backgroundImage property.
     * @return a void
     */
    public void setBackgroundImage(@javax.annotation.Nullable final byte[] value) {
        this._backgroundImage = value;
    }
    /**
     * Sets the backgroundImageRelativeUrl property value. A relative URL for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the backgroundImageRelativeUrl property.
     * @return a void
     */
    public void setBackgroundImageRelativeUrl(@javax.annotation.Nullable final String value) {
        this._backgroundImageRelativeUrl = value;
    }
    /**
     * Sets the bannerLogo property value. A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG no larger than 36 × 245 pixels. We recommend using a transparent image with no padding around the logo.
     * @param value Value to set for the bannerLogo property.
     * @return a void
     */
    public void setBannerLogo(@javax.annotation.Nullable final byte[] value) {
        this._bannerLogo = value;
    }
    /**
     * Sets the bannerLogoRelativeUrl property value. A relative url for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     * @param value Value to set for the bannerLogoRelativeUrl property.
     * @return a void
     */
    public void setBannerLogoRelativeUrl(@javax.annotation.Nullable final String value) {
        this._bannerLogoRelativeUrl = value;
    }
    /**
     * Sets the cdnList property value. A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN providers are used at the same time for high availability of read requests. Read-only.
     * @param value Value to set for the cdnList property.
     * @return a void
     */
    public void setCdnList(@javax.annotation.Nullable final java.util.List<String> value) {
        this._cdnList = value;
    }
    /**
     * Sets the signInPageText property value. Text that appears at the bottom of the sign-in box. You can use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be Unicode and not exceed 1024 characters.
     * @param value Value to set for the signInPageText property.
     * @return a void
     */
    public void setSignInPageText(@javax.annotation.Nullable final String value) {
        this._signInPageText = value;
    }
    /**
     * Sets the squareLogo property value. A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG no larger than 240 x 240 pixels and no more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     * @param value Value to set for the squareLogo property.
     * @return a void
     */
    public void setSquareLogo(@javax.annotation.Nullable final byte[] value) {
        this._squareLogo = value;
    }
    /**
     * Sets the squareLogoRelativeUrl property value. A relative url for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the squareLogoRelativeUrl property.
     * @return a void
     */
    public void setSquareLogoRelativeUrl(@javax.annotation.Nullable final String value) {
        this._squareLogoRelativeUrl = value;
    }
    /**
     * Sets the usernameHintText property value. String that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links or code, and can't exceed 64 characters.
     * @param value Value to set for the usernameHintText property.
     * @return a void
     */
    public void setUsernameHintText(@javax.annotation.Nullable final String value) {
        this._usernameHintText = value;
    }
}
