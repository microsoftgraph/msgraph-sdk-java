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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WebApplication implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WebApplication} and sets the default values.
     */
    public WebApplication() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WebApplication}
     */
    @jakarta.annotation.Nonnull
    public static WebApplication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebApplication();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHomePageUrl() {
        return this.backingStore.get("homePageUrl");
    }
    /**
     * Gets the implicitGrantSettings property value. Specifies whether this web application can request tokens using the OAuth 2.0 implicit flow.
     * @return a {@link ImplicitGrantSettings}
     */
    @jakarta.annotation.Nullable
    public ImplicitGrantSettings getImplicitGrantSettings() {
        return this.backingStore.get("implicitGrantSettings");
    }
    /**
     * Gets the logoutUrl property value. Specifies the URL that is used by Microsoft's authorization service to log out a user using front-channel, back-channel or SAML logout protocols.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLogoutUrl() {
        return this.backingStore.get("logoutUrl");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the redirectUris property value. Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRedirectUris() {
        return this.backingStore.get("redirectUris");
    }
    /**
     * Gets the redirectUriSettings property value. The redirectUriSettings property
     * @return a {@link java.util.List<RedirectUriSettings>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RedirectUriSettings> getRedirectUriSettings() {
        return this.backingStore.get("redirectUriSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the homePageUrl property value. Home page or landing page of the application.
     * @param value Value to set for the homePageUrl property.
     */
    public void setHomePageUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("homePageUrl", value);
    }
    /**
     * Sets the implicitGrantSettings property value. Specifies whether this web application can request tokens using the OAuth 2.0 implicit flow.
     * @param value Value to set for the implicitGrantSettings property.
     */
    public void setImplicitGrantSettings(@jakarta.annotation.Nullable final ImplicitGrantSettings value) {
        this.backingStore.set("implicitGrantSettings", value);
    }
    /**
     * Sets the logoutUrl property value. Specifies the URL that is used by Microsoft's authorization service to log out a user using front-channel, back-channel or SAML logout protocols.
     * @param value Value to set for the logoutUrl property.
     */
    public void setLogoutUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("logoutUrl", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the redirectUris property value. Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent.
     * @param value Value to set for the redirectUris property.
     */
    public void setRedirectUris(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("redirectUris", value);
    }
    /**
     * Sets the redirectUriSettings property value. The redirectUriSettings property
     * @param value Value to set for the redirectUriSettings property.
     */
    public void setRedirectUriSettings(@jakarta.annotation.Nullable final java.util.List<RedirectUriSettings> value) {
        this.backingStore.set("redirectUriSettings", value);
    }
}
