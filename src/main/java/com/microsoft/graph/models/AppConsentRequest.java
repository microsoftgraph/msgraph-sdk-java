package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class AppConsentRequest extends Entity implements Parsable {
    /** The display name of the app for which consent is requested. Required. Supports $filter (eq only) and $orderby. */
    private String _appDisplayName;
    /** The identifier of the application. Required. Supports $filter (eq only) and $orderby. */
    private String _appId;
    /** A list of pending scopes waiting for approval. This is empty if the consentType is Static. Required. */
    private java.util.List<AppConsentRequestScope> _pendingScopes;
    /** A list of pending user consent requests. */
    private java.util.List<UserConsentRequest> _userConsentRequests;
    /**
     * Instantiates a new appConsentRequest and sets the default values.
     * @return a void
     */
    public AppConsentRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appConsentRequest
     */
    @javax.annotation.Nonnull
    public static AppConsentRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppConsentRequest();
    }
    /**
     * Gets the appDisplayName property value. The display name of the app for which consent is requested. Required. Supports $filter (eq only) and $orderby.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this._appDisplayName;
    }
    /**
     * Gets the appId property value. The identifier of the application. Required. Supports $filter (eq only) and $orderby.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppConsentRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appDisplayName", (n) -> { currentObject.setAppDisplayName(n.getStringValue()); });
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("pendingScopes", (n) -> { currentObject.setPendingScopes(n.getCollectionOfObjectValues(AppConsentRequestScope::createFromDiscriminatorValue)); });
            this.put("userConsentRequests", (n) -> { currentObject.setUserConsentRequests(n.getCollectionOfObjectValues(UserConsentRequest::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the pendingScopes property value. A list of pending scopes waiting for approval. This is empty if the consentType is Static. Required.
     * @return a appConsentRequestScope
     */
    @javax.annotation.Nullable
    public java.util.List<AppConsentRequestScope> getPendingScopes() {
        return this._pendingScopes;
    }
    /**
     * Gets the userConsentRequests property value. A list of pending user consent requests.
     * @return a userConsentRequest
     */
    @javax.annotation.Nullable
    public java.util.List<UserConsentRequest> getUserConsentRequests() {
        return this._userConsentRequests;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeCollectionOfObjectValues("pendingScopes", this.getPendingScopes());
        writer.writeCollectionOfObjectValues("userConsentRequests", this.getUserConsentRequests());
    }
    /**
     * Sets the appDisplayName property value. The display name of the app for which consent is requested. Required. Supports $filter (eq only) and $orderby.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this._appDisplayName = value;
    }
    /**
     * Sets the appId property value. The identifier of the application. Required. Supports $filter (eq only) and $orderby.
     * @param value Value to set for the appId property.
     * @return a void
     */
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the pendingScopes property value. A list of pending scopes waiting for approval. This is empty if the consentType is Static. Required.
     * @param value Value to set for the pendingScopes property.
     * @return a void
     */
    public void setPendingScopes(@javax.annotation.Nullable final java.util.List<AppConsentRequestScope> value) {
        this._pendingScopes = value;
    }
    /**
     * Sets the userConsentRequests property value. A list of pending user consent requests.
     * @param value Value to set for the userConsentRequests property.
     * @return a void
     */
    public void setUserConsentRequests(@javax.annotation.Nullable final java.util.List<UserConsentRequest> value) {
        this._userConsentRequests = value;
    }
}
