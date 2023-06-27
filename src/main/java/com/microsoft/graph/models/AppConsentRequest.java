package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppConsentRequest extends Entity implements Parsable {
    /**
     * The display name of the app for which consent is requested. Required. Supports $filter (eq only) and $orderby.
     */
    private String appDisplayName;
    /**
     * The identifier of the application. Required. Supports $filter (eq only) and $orderby.
     */
    private String appId;
    /**
     * A list of pending scopes waiting for approval. Required.
     */
    private java.util.List<AppConsentRequestScope> pendingScopes;
    /**
     * A list of pending user consent requests. Supports $filter (eq).
     */
    private java.util.List<UserConsentRequest> userConsentRequests;
    /**
     * Instantiates a new appConsentRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.appDisplayName;
    }
    /**
     * Gets the appId property value. The identifier of the application. Required. Supports $filter (eq only) and $orderby.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("pendingScopes", (n) -> { this.setPendingScopes(n.getCollectionOfObjectValues(AppConsentRequestScope::createFromDiscriminatorValue)); });
        deserializerMap.put("userConsentRequests", (n) -> { this.setUserConsentRequests(n.getCollectionOfObjectValues(UserConsentRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pendingScopes property value. A list of pending scopes waiting for approval. Required.
     * @return a appConsentRequestScope
     */
    @javax.annotation.Nullable
    public java.util.List<AppConsentRequestScope> getPendingScopes() {
        return this.pendingScopes;
    }
    /**
     * Gets the userConsentRequests property value. A list of pending user consent requests. Supports $filter (eq).
     * @return a userConsentRequest
     */
    @javax.annotation.Nullable
    public java.util.List<UserConsentRequest> getUserConsentRequests() {
        return this.userConsentRequests;
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
    @javax.annotation.Nonnull
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this.appDisplayName = value;
    }
    /**
     * Sets the appId property value. The identifier of the application. Required. Supports $filter (eq only) and $orderby.
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the pendingScopes property value. A list of pending scopes waiting for approval. Required.
     * @param value Value to set for the pendingScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPendingScopes(@javax.annotation.Nullable final java.util.List<AppConsentRequestScope> value) {
        this.pendingScopes = value;
    }
    /**
     * Sets the userConsentRequests property value. A list of pending user consent requests. Supports $filter (eq).
     * @param value Value to set for the userConsentRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserConsentRequests(@javax.annotation.Nullable final java.util.List<UserConsentRequest> value) {
        this.userConsentRequests = value;
    }
}
