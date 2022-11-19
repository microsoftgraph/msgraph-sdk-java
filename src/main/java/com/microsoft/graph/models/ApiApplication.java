package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApiApplication implements AdditionalDataHolder, Parsable {
    /** When true, allows an application to use claims mapping without specifying a custom signing key. */
    private Boolean _acceptMappedClaims;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Used for bundling consent if you have a solution that contains two parts: a client app and a custom web API app. If you set the appID of the client app to this value, the user only consents once to the client app. Azure AD knows that consenting to the client means implicitly consenting to the web API and automatically provisions service principals for both APIs at the same time. Both the client and the web API app must be registered in the same tenant. */
    private java.util.List<String> _knownClientApplications;
    /** The definition of the delegated permissions exposed by the web API represented by this application registration. These delegated permissions may be requested by a client application, and may be granted by users or administrators during consent. Delegated permissions are sometimes referred to as OAuth 2.0 scopes. */
    private java.util.List<PermissionScope> _oauth2PermissionScopes;
    /** The OdataType property */
    private String _odataType;
    /** Lists the client applications that are pre-authorized with the specified delegated permissions to access this application's APIs. Users are not required to consent to any pre-authorized application (for the permissions specified). However, any additional permissions not listed in preAuthorizedApplications (requested through incremental consent for example) will require user consent. */
    private java.util.List<PreAuthorizedApplication> _preAuthorizedApplications;
    /** Specifies the access token version expected by this resource. This changes the version and format of the JWT produced independent of the endpoint or client used to request the access token.  The endpoint used, v1.0 or v2.0, is chosen by the client and only impacts the version of id_tokens. Resources need to explicitly configure requestedAccessTokenVersion to indicate the supported access token format.  Possible values for requestedAccessTokenVersion are 1, 2, or null. If the value is null, this defaults to 1, which corresponds to the v1.0 endpoint.  If signInAudience on the application is configured as AzureADandPersonalMicrosoftAccount, the value for this property must be 2 */
    private Integer _requestedAccessTokenVersion;
    /**
     * Instantiates a new apiApplication and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApiApplication() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.apiApplication");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a apiApplication
     */
    @javax.annotation.Nonnull
    public static ApiApplication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApiApplication();
    }
    /**
     * Gets the acceptMappedClaims property value. When true, allows an application to use claims mapping without specifying a custom signing key.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAcceptMappedClaims() {
        return this._acceptMappedClaims;
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
        final ApiApplication currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("acceptMappedClaims", (n) -> { currentObject.setAcceptMappedClaims(n.getBooleanValue()); });
        deserializerMap.put("knownClientApplications", (n) -> { currentObject.setKnownClientApplications(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("oauth2PermissionScopes", (n) -> { currentObject.setOauth2PermissionScopes(n.getCollectionOfObjectValues(PermissionScope::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("preAuthorizedApplications", (n) -> { currentObject.setPreAuthorizedApplications(n.getCollectionOfObjectValues(PreAuthorizedApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("requestedAccessTokenVersion", (n) -> { currentObject.setRequestedAccessTokenVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the knownClientApplications property value. Used for bundling consent if you have a solution that contains two parts: a client app and a custom web API app. If you set the appID of the client app to this value, the user only consents once to the client app. Azure AD knows that consenting to the client means implicitly consenting to the web API and automatically provisions service principals for both APIs at the same time. Both the client and the web API app must be registered in the same tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getKnownClientApplications() {
        return this._knownClientApplications;
    }
    /**
     * Gets the oauth2PermissionScopes property value. The definition of the delegated permissions exposed by the web API represented by this application registration. These delegated permissions may be requested by a client application, and may be granted by users or administrators during consent. Delegated permissions are sometimes referred to as OAuth 2.0 scopes.
     * @return a permissionScope
     */
    @javax.annotation.Nullable
    public java.util.List<PermissionScope> getOauth2PermissionScopes() {
        return this._oauth2PermissionScopes;
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
     * Gets the preAuthorizedApplications property value. Lists the client applications that are pre-authorized with the specified delegated permissions to access this application's APIs. Users are not required to consent to any pre-authorized application (for the permissions specified). However, any additional permissions not listed in preAuthorizedApplications (requested through incremental consent for example) will require user consent.
     * @return a preAuthorizedApplication
     */
    @javax.annotation.Nullable
    public java.util.List<PreAuthorizedApplication> getPreAuthorizedApplications() {
        return this._preAuthorizedApplications;
    }
    /**
     * Gets the requestedAccessTokenVersion property value. Specifies the access token version expected by this resource. This changes the version and format of the JWT produced independent of the endpoint or client used to request the access token.  The endpoint used, v1.0 or v2.0, is chosen by the client and only impacts the version of id_tokens. Resources need to explicitly configure requestedAccessTokenVersion to indicate the supported access token format.  Possible values for requestedAccessTokenVersion are 1, 2, or null. If the value is null, this defaults to 1, which corresponds to the v1.0 endpoint.  If signInAudience on the application is configured as AzureADandPersonalMicrosoftAccount, the value for this property must be 2
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRequestedAccessTokenVersion() {
        return this._requestedAccessTokenVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("acceptMappedClaims", this.getAcceptMappedClaims());
        writer.writeCollectionOfPrimitiveValues("knownClientApplications", this.getKnownClientApplications());
        writer.writeCollectionOfObjectValues("oauth2PermissionScopes", this.getOauth2PermissionScopes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("preAuthorizedApplications", this.getPreAuthorizedApplications());
        writer.writeIntegerValue("requestedAccessTokenVersion", this.getRequestedAccessTokenVersion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acceptMappedClaims property value. When true, allows an application to use claims mapping without specifying a custom signing key.
     * @param value Value to set for the acceptMappedClaims property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcceptMappedClaims(@javax.annotation.Nullable final Boolean value) {
        this._acceptMappedClaims = value;
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
     * Sets the knownClientApplications property value. Used for bundling consent if you have a solution that contains two parts: a client app and a custom web API app. If you set the appID of the client app to this value, the user only consents once to the client app. Azure AD knows that consenting to the client means implicitly consenting to the web API and automatically provisions service principals for both APIs at the same time. Both the client and the web API app must be registered in the same tenant.
     * @param value Value to set for the knownClientApplications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKnownClientApplications(@javax.annotation.Nullable final java.util.List<String> value) {
        this._knownClientApplications = value;
    }
    /**
     * Sets the oauth2PermissionScopes property value. The definition of the delegated permissions exposed by the web API represented by this application registration. These delegated permissions may be requested by a client application, and may be granted by users or administrators during consent. Delegated permissions are sometimes referred to as OAuth 2.0 scopes.
     * @param value Value to set for the oauth2PermissionScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOauth2PermissionScopes(@javax.annotation.Nullable final java.util.List<PermissionScope> value) {
        this._oauth2PermissionScopes = value;
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
     * Sets the preAuthorizedApplications property value. Lists the client applications that are pre-authorized with the specified delegated permissions to access this application's APIs. Users are not required to consent to any pre-authorized application (for the permissions specified). However, any additional permissions not listed in preAuthorizedApplications (requested through incremental consent for example) will require user consent.
     * @param value Value to set for the preAuthorizedApplications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreAuthorizedApplications(@javax.annotation.Nullable final java.util.List<PreAuthorizedApplication> value) {
        this._preAuthorizedApplications = value;
    }
    /**
     * Sets the requestedAccessTokenVersion property value. Specifies the access token version expected by this resource. This changes the version and format of the JWT produced independent of the endpoint or client used to request the access token.  The endpoint used, v1.0 or v2.0, is chosen by the client and only impacts the version of id_tokens. Resources need to explicitly configure requestedAccessTokenVersion to indicate the supported access token format.  Possible values for requestedAccessTokenVersion are 1, 2, or null. If the value is null, this defaults to 1, which corresponds to the v1.0 endpoint.  If signInAudience on the application is configured as AzureADandPersonalMicrosoftAccount, the value for this property must be 2
     * @param value Value to set for the requestedAccessTokenVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestedAccessTokenVersion(@javax.annotation.Nullable final Integer value) {
        this._requestedAccessTokenVersion = value;
    }
}
