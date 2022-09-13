package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WebApplication implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Home page or landing page of the application. */
    private String _homePageUrl;
    /** Specifies whether this web application can request tokens using the OAuth 2.0 implicit flow. */
    private ImplicitGrantSettings _implicitGrantSettings;
    /** Specifies the URL that will be used by Microsoft's authorization service to logout an user using front-channel, back-channel or SAML logout protocols. */
    private String _logoutUrl;
    /** The OdataType property */
    private String _odataType;
    /** Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent. */
    private java.util.List<String> _redirectUris;
    /** The redirectUriSettings property */
    private java.util.List<RedirectUriSettings> _redirectUriSettings;
    /**
     * Instantiates a new webApplication and sets the default values.
     * @return a void
     */
    public WebApplication() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.webApplication");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a webApplication
     */
    @javax.annotation.Nonnull
    public static WebApplication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebApplication();
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
        final WebApplication currentObject = this;
        return new HashMap<>(6) {{
            this.put("homePageUrl", (n) -> { currentObject.setHomePageUrl(n.getStringValue()); });
            this.put("implicitGrantSettings", (n) -> { currentObject.setImplicitGrantSettings(n.getObjectValue(ImplicitGrantSettings::createFromDiscriminatorValue)); });
            this.put("logoutUrl", (n) -> { currentObject.setLogoutUrl(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("redirectUris", (n) -> { currentObject.setRedirectUris(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("redirectUriSettings", (n) -> { currentObject.setRedirectUriSettings(n.getCollectionOfObjectValues(RedirectUriSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the homePageUrl property value. Home page or landing page of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomePageUrl() {
        return this._homePageUrl;
    }
    /**
     * Gets the implicitGrantSettings property value. Specifies whether this web application can request tokens using the OAuth 2.0 implicit flow.
     * @return a implicitGrantSettings
     */
    @javax.annotation.Nullable
    public ImplicitGrantSettings getImplicitGrantSettings() {
        return this._implicitGrantSettings;
    }
    /**
     * Gets the logoutUrl property value. Specifies the URL that will be used by Microsoft's authorization service to logout an user using front-channel, back-channel or SAML logout protocols.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogoutUrl() {
        return this._logoutUrl;
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
     * Gets the redirectUris property value. Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRedirectUris() {
        return this._redirectUris;
    }
    /**
     * Gets the redirectUriSettings property value. The redirectUriSettings property
     * @return a redirectUriSettings
     */
    @javax.annotation.Nullable
    public java.util.List<RedirectUriSettings> getRedirectUriSettings() {
        return this._redirectUriSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("homePageUrl", this.getHomePageUrl());
        writer.writeObjectValue("implicitGrantSettings", this.getImplicitGrantSettings());
        writer.writeStringValue("logoutUrl", this.getLogoutUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("redirectUris", this.getRedirectUris());
        writer.writeCollectionOfObjectValues("redirectUriSettings", this.getRedirectUriSettings());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the homePageUrl property value. Home page or landing page of the application.
     * @param value Value to set for the homePageUrl property.
     * @return a void
     */
    public void setHomePageUrl(@javax.annotation.Nullable final String value) {
        this._homePageUrl = value;
    }
    /**
     * Sets the implicitGrantSettings property value. Specifies whether this web application can request tokens using the OAuth 2.0 implicit flow.
     * @param value Value to set for the implicitGrantSettings property.
     * @return a void
     */
    public void setImplicitGrantSettings(@javax.annotation.Nullable final ImplicitGrantSettings value) {
        this._implicitGrantSettings = value;
    }
    /**
     * Sets the logoutUrl property value. Specifies the URL that will be used by Microsoft's authorization service to logout an user using front-channel, back-channel or SAML logout protocols.
     * @param value Value to set for the logoutUrl property.
     * @return a void
     */
    public void setLogoutUrl(@javax.annotation.Nullable final String value) {
        this._logoutUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the redirectUris property value. Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent.
     * @param value Value to set for the redirectUris property.
     * @return a void
     */
    public void setRedirectUris(@javax.annotation.Nullable final java.util.List<String> value) {
        this._redirectUris = value;
    }
    /**
     * Sets the redirectUriSettings property value. The redirectUriSettings property
     * @param value Value to set for the redirectUriSettings property.
     * @return a void
     */
    public void setRedirectUriSettings(@javax.annotation.Nullable final java.util.List<RedirectUriSettings> value) {
        this._redirectUriSettings = value;
    }
}
