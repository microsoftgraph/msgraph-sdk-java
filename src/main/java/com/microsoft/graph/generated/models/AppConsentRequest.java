package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppConsentRequest extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AppConsentRequest} and sets the default values.
     */
    public AppConsentRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppConsentRequest}
     */
    @jakarta.annotation.Nonnull
    public static AppConsentRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppConsentRequest();
    }
    /**
     * Gets the appDisplayName property value. The display name of the app for which consent is requested. Required. Supports $filter (eq only) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.backingStore.get("appDisplayName");
    }
    /**
     * Gets the appId property value. The identifier of the application. Required. Supports $filter (eq only) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link java.util.List<AppConsentRequestScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppConsentRequestScope> getPendingScopes() {
        return this.backingStore.get("pendingScopes");
    }
    /**
     * Gets the userConsentRequests property value. A list of pending user consent requests. Supports $filter (eq).
     * @return a {@link java.util.List<UserConsentRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserConsentRequest> getUserConsentRequests() {
        return this.backingStore.get("userConsentRequests");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appDisplayName", value);
    }
    /**
     * Sets the appId property value. The identifier of the application. Required. Supports $filter (eq only) and $orderby.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the pendingScopes property value. A list of pending scopes waiting for approval. Required.
     * @param value Value to set for the pendingScopes property.
     */
    public void setPendingScopes(@jakarta.annotation.Nullable final java.util.List<AppConsentRequestScope> value) {
        this.backingStore.set("pendingScopes", value);
    }
    /**
     * Sets the userConsentRequests property value. A list of pending user consent requests. Supports $filter (eq).
     * @param value Value to set for the userConsentRequests property.
     */
    public void setUserConsentRequests(@jakarta.annotation.Nullable final java.util.List<UserConsentRequest> value) {
        this.backingStore.set("userConsentRequests", value);
    }
}
