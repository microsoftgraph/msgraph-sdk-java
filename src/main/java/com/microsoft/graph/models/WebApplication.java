package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WebApplication implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Home page or landing page of the application. */
    private String homePageUrl;
    /** Specifies whether this web application can request tokens using the OAuth 2.0 implicit flow. */
    private ImplicitGrantSettings implicitGrantSettings;
    /** Specifies the URL that will be used by Microsoft's authorization service to logout an user using front-channel, back-channel or SAML logout protocols. */
    private String logoutUrl;
    /** The OdataType property */
    private String odataType;
    /** Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent. */
    private java.util.List<String> redirectUris;
    /** The redirectUriSettings property */
    private java.util.List<RedirectUriSettings> redirectUriSettings;
    /**
     * Instantiates a new webApplication and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WebApplication() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("homePageUrl", (n) -> { this.setHomePageUrl(n.getStringValue()); });
        deserializerMap.put("implicitGrantSettings", (n) -> { this.setImplicitGrantSettings(n.getObjectValue(ImplicitGrantSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("logoutUrl", (n) -> { this.setLogoutUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("redirectUris", (n) -> { this.setRedirectUris(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("redirectUriSettings", (n) -> { this.setRedirectUriSettings(n.getCollectionOfObjectValues(RedirectUriSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the homePageUrl property value. Home page or landing page of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomePageUrl() {
        return this.homePageUrl;
    }
    /**
     * Gets the implicitGrantSettings property value. Specifies whether this web application can request tokens using the OAuth 2.0 implicit flow.
     * @return a implicitGrantSettings
     */
    @javax.annotation.Nullable
    public ImplicitGrantSettings getImplicitGrantSettings() {
        return this.implicitGrantSettings;
    }
    /**
     * Gets the logoutUrl property value. Specifies the URL that will be used by Microsoft's authorization service to logout an user using front-channel, back-channel or SAML logout protocols.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogoutUrl() {
        return this.logoutUrl;
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
     * Gets the redirectUris property value. Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRedirectUris() {
        return this.redirectUris;
    }
    /**
     * Gets the redirectUriSettings property value. The redirectUriSettings property
     * @return a RedirectUriSettings
     */
    @javax.annotation.Nullable
    public java.util.List<RedirectUriSettings> getRedirectUriSettings() {
        return this.redirectUriSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the homePageUrl property value. Home page or landing page of the application.
     * @param value Value to set for the homePageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomePageUrl(@javax.annotation.Nullable final String value) {
        this.homePageUrl = value;
    }
    /**
     * Sets the implicitGrantSettings property value. Specifies whether this web application can request tokens using the OAuth 2.0 implicit flow.
     * @param value Value to set for the implicitGrantSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImplicitGrantSettings(@javax.annotation.Nullable final ImplicitGrantSettings value) {
        this.implicitGrantSettings = value;
    }
    /**
     * Sets the logoutUrl property value. Specifies the URL that will be used by Microsoft's authorization service to logout an user using front-channel, back-channel or SAML logout protocols.
     * @param value Value to set for the logoutUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogoutUrl(@javax.annotation.Nullable final String value) {
        this.logoutUrl = value;
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
     * Sets the redirectUris property value. Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent.
     * @param value Value to set for the redirectUris property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectUris(@javax.annotation.Nullable final java.util.List<String> value) {
        this.redirectUris = value;
    }
    /**
     * Sets the redirectUriSettings property value. The redirectUriSettings property
     * @param value Value to set for the redirectUriSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectUriSettings(@javax.annotation.Nullable final java.util.List<RedirectUriSettings> value) {
        this.redirectUriSettings = value;
    }
}
