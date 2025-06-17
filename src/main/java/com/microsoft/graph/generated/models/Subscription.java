package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Subscription extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Subscription} and sets the default values.
     */
    public Subscription() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Subscription}
     */
    @jakarta.annotation.Nonnull
    public static Subscription createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Subscription();
    }
    /**
     * Gets the applicationId property value. Optional. Identifier of the application used to create the subscription. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationId() {
        return this.backingStore.get("applicationId");
    }
    /**
     * Gets the changeType property value. Required. Indicates the type of change in the subscribed resource that raises a change notification. The supported values are: created, updated, deleted. Multiple values can be combined using a comma-separated list. Note:  Drive root item and list change notifications support only the updated changeType. User and group change notifications support updated and deleted changeType. Use updated to receive notifications when user or group is created, updated, or soft deleted. Use deleted to receive notifications when user or group is permanently deleted.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChangeType() {
        return this.backingStore.get("changeType");
    }
    /**
     * Gets the clientState property value. Optional. Specifies the value of the clientState property sent by the service in each change notification. The maximum length is 128 characters. The client can check that the change notification came from the service by comparing the value of the clientState property sent with the subscription with the value of the clientState property received with each change notification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientState() {
        return this.backingStore.get("clientState");
    }
    /**
     * Gets the creatorId property value. Optional. Identifier of the user or service principal that created the subscription. If the app used delegated permissions to create the subscription, this field contains the ID of the signed-in user the app called on behalf of. If the app used application permissions, this field contains the ID of the service principal corresponding to the app. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatorId() {
        return this.backingStore.get("creatorId");
    }
    /**
     * Gets the encryptionCertificate property value. Optional. A base64-encoded representation of a certificate with a public key used to encrypt resource data in change notifications. Optional but required when includeResourceData is true.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEncryptionCertificate() {
        return this.backingStore.get("encryptionCertificate");
    }
    /**
     * Gets the encryptionCertificateId property value. Optional. A custom app-provided identifier to help identify the certificate needed to decrypt resource data.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEncryptionCertificateId() {
        return this.backingStore.get("encryptionCertificateId");
    }
    /**
     * Gets the expirationDateTime property value. Required. Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount of time from subscription creation that varies for the resource subscribed to. Any value under 45 minutes after the time of the request is automatically set to 45 minutes after the request time. For the maximum supported subscription length of time, see Subscription lifetime.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationId", (n) -> { this.setApplicationId(n.getStringValue()); });
        deserializerMap.put("changeType", (n) -> { this.setChangeType(n.getStringValue()); });
        deserializerMap.put("clientState", (n) -> { this.setClientState(n.getStringValue()); });
        deserializerMap.put("creatorId", (n) -> { this.setCreatorId(n.getStringValue()); });
        deserializerMap.put("encryptionCertificate", (n) -> { this.setEncryptionCertificate(n.getStringValue()); });
        deserializerMap.put("encryptionCertificateId", (n) -> { this.setEncryptionCertificateId(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("includeResourceData", (n) -> { this.setIncludeResourceData(n.getBooleanValue()); });
        deserializerMap.put("latestSupportedTlsVersion", (n) -> { this.setLatestSupportedTlsVersion(n.getStringValue()); });
        deserializerMap.put("lifecycleNotificationUrl", (n) -> { this.setLifecycleNotificationUrl(n.getStringValue()); });
        deserializerMap.put("notificationQueryOptions", (n) -> { this.setNotificationQueryOptions(n.getStringValue()); });
        deserializerMap.put("notificationUrl", (n) -> { this.setNotificationUrl(n.getStringValue()); });
        deserializerMap.put("notificationUrlAppId", (n) -> { this.setNotificationUrlAppId(n.getStringValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeResourceData property value. Optional. When set to true, change notifications include resource data (such as content of a chat message).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeResourceData() {
        return this.backingStore.get("includeResourceData");
    }
    /**
     * Gets the latestSupportedTlsVersion property value. Optional. Specifies the latest version of Transport Layer Security (TLS) that the notification endpoint, specified by notificationUrl, supports. The possible values are: v10, v11, v12, v13. For subscribers whose notification endpoint supports a version lower than the currently recommended version (TLS 1.2), specifying this property by a set timeline allows them to temporarily use their deprecated version of TLS before completing their upgrade to TLS 1.2. For these subscribers, not setting this property per the timeline would result in subscription operations failing. For subscribers whose notification endpoint already supports TLS 1.2, setting this property is optional. In such cases, Microsoft Graph defaults the property to v1_2.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLatestSupportedTlsVersion() {
        return this.backingStore.get("latestSupportedTlsVersion");
    }
    /**
     * Gets the lifecycleNotificationUrl property value. Required for Teams resources if  the expirationDateTime value is more than 1 hour from now; optional otherwise. The URL of the endpoint that receives lifecycle notifications, including subscriptionRemoved, reauthorizationRequired, and missed notifications. This URL must make use of the HTTPS protocol. For more information, see Reduce missing subscriptions and change notifications.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLifecycleNotificationUrl() {
        return this.backingStore.get("lifecycleNotificationUrl");
    }
    /**
     * Gets the notificationQueryOptions property value. Optional. OData query options for specifying value for the targeting resource. Clients receive notifications when resource reaches the state matching the query options provided here. With this new property in the subscription creation payload along with all existing properties, Webhooks deliver notifications whenever a resource reaches the desired state mentioned in the notificationQueryOptions property. For example, when the print job is completed or when a print job resource isFetchable property value becomes true etc.  Supported only for Universal Print Service. For more information, see Subscribe to change notifications from cloud printing APIs using Microsoft Graph.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotificationQueryOptions() {
        return this.backingStore.get("notificationQueryOptions");
    }
    /**
     * Gets the notificationUrl property value. Required. The URL of the endpoint that receives the change notifications. This URL must make use of the HTTPS protocol. Any query string parameter included in the notificationUrl property is included in the HTTP POST request when Microsoft Graph sends the change notifications.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotificationUrl() {
        return this.backingStore.get("notificationUrl");
    }
    /**
     * Gets the notificationUrlAppId property value. Optional. The app ID that the subscription service can use to generate the validation token. The value allows the client to validate the authenticity of the notification received.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotificationUrlAppId() {
        return this.backingStore.get("notificationUrlAppId");
    }
    /**
     * Gets the resource property value. Required. Specifies the resource that is monitored for changes. Don&apos;t include the base URL (https://graph.microsoft.com/v1.0/). See the possible resource path values for each supported resource.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResource() {
        return this.backingStore.get("resource");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("applicationId", this.getApplicationId());
        writer.writeStringValue("changeType", this.getChangeType());
        writer.writeStringValue("clientState", this.getClientState());
        writer.writeStringValue("creatorId", this.getCreatorId());
        writer.writeStringValue("encryptionCertificate", this.getEncryptionCertificate());
        writer.writeStringValue("encryptionCertificateId", this.getEncryptionCertificateId());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeBooleanValue("includeResourceData", this.getIncludeResourceData());
        writer.writeStringValue("latestSupportedTlsVersion", this.getLatestSupportedTlsVersion());
        writer.writeStringValue("lifecycleNotificationUrl", this.getLifecycleNotificationUrl());
        writer.writeStringValue("notificationQueryOptions", this.getNotificationQueryOptions());
        writer.writeStringValue("notificationUrl", this.getNotificationUrl());
        writer.writeStringValue("notificationUrlAppId", this.getNotificationUrlAppId());
        writer.writeStringValue("resource", this.getResource());
    }
    /**
     * Sets the applicationId property value. Optional. Identifier of the application used to create the subscription. Read-only.
     * @param value Value to set for the applicationId property.
     */
    public void setApplicationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationId", value);
    }
    /**
     * Sets the changeType property value. Required. Indicates the type of change in the subscribed resource that raises a change notification. The supported values are: created, updated, deleted. Multiple values can be combined using a comma-separated list. Note:  Drive root item and list change notifications support only the updated changeType. User and group change notifications support updated and deleted changeType. Use updated to receive notifications when user or group is created, updated, or soft deleted. Use deleted to receive notifications when user or group is permanently deleted.
     * @param value Value to set for the changeType property.
     */
    public void setChangeType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("changeType", value);
    }
    /**
     * Sets the clientState property value. Optional. Specifies the value of the clientState property sent by the service in each change notification. The maximum length is 128 characters. The client can check that the change notification came from the service by comparing the value of the clientState property sent with the subscription with the value of the clientState property received with each change notification.
     * @param value Value to set for the clientState property.
     */
    public void setClientState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientState", value);
    }
    /**
     * Sets the creatorId property value. Optional. Identifier of the user or service principal that created the subscription. If the app used delegated permissions to create the subscription, this field contains the ID of the signed-in user the app called on behalf of. If the app used application permissions, this field contains the ID of the service principal corresponding to the app. Read-only.
     * @param value Value to set for the creatorId property.
     */
    public void setCreatorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("creatorId", value);
    }
    /**
     * Sets the encryptionCertificate property value. Optional. A base64-encoded representation of a certificate with a public key used to encrypt resource data in change notifications. Optional but required when includeResourceData is true.
     * @param value Value to set for the encryptionCertificate property.
     */
    public void setEncryptionCertificate(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("encryptionCertificate", value);
    }
    /**
     * Sets the encryptionCertificateId property value. Optional. A custom app-provided identifier to help identify the certificate needed to decrypt resource data.
     * @param value Value to set for the encryptionCertificateId property.
     */
    public void setEncryptionCertificateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("encryptionCertificateId", value);
    }
    /**
     * Sets the expirationDateTime property value. Required. Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount of time from subscription creation that varies for the resource subscribed to. Any value under 45 minutes after the time of the request is automatically set to 45 minutes after the request time. For the maximum supported subscription length of time, see Subscription lifetime.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the includeResourceData property value. Optional. When set to true, change notifications include resource data (such as content of a chat message).
     * @param value Value to set for the includeResourceData property.
     */
    public void setIncludeResourceData(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("includeResourceData", value);
    }
    /**
     * Sets the latestSupportedTlsVersion property value. Optional. Specifies the latest version of Transport Layer Security (TLS) that the notification endpoint, specified by notificationUrl, supports. The possible values are: v10, v11, v12, v13. For subscribers whose notification endpoint supports a version lower than the currently recommended version (TLS 1.2), specifying this property by a set timeline allows them to temporarily use their deprecated version of TLS before completing their upgrade to TLS 1.2. For these subscribers, not setting this property per the timeline would result in subscription operations failing. For subscribers whose notification endpoint already supports TLS 1.2, setting this property is optional. In such cases, Microsoft Graph defaults the property to v1_2.
     * @param value Value to set for the latestSupportedTlsVersion property.
     */
    public void setLatestSupportedTlsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("latestSupportedTlsVersion", value);
    }
    /**
     * Sets the lifecycleNotificationUrl property value. Required for Teams resources if  the expirationDateTime value is more than 1 hour from now; optional otherwise. The URL of the endpoint that receives lifecycle notifications, including subscriptionRemoved, reauthorizationRequired, and missed notifications. This URL must make use of the HTTPS protocol. For more information, see Reduce missing subscriptions and change notifications.
     * @param value Value to set for the lifecycleNotificationUrl property.
     */
    public void setLifecycleNotificationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lifecycleNotificationUrl", value);
    }
    /**
     * Sets the notificationQueryOptions property value. Optional. OData query options for specifying value for the targeting resource. Clients receive notifications when resource reaches the state matching the query options provided here. With this new property in the subscription creation payload along with all existing properties, Webhooks deliver notifications whenever a resource reaches the desired state mentioned in the notificationQueryOptions property. For example, when the print job is completed or when a print job resource isFetchable property value becomes true etc.  Supported only for Universal Print Service. For more information, see Subscribe to change notifications from cloud printing APIs using Microsoft Graph.
     * @param value Value to set for the notificationQueryOptions property.
     */
    public void setNotificationQueryOptions(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notificationQueryOptions", value);
    }
    /**
     * Sets the notificationUrl property value. Required. The URL of the endpoint that receives the change notifications. This URL must make use of the HTTPS protocol. Any query string parameter included in the notificationUrl property is included in the HTTP POST request when Microsoft Graph sends the change notifications.
     * @param value Value to set for the notificationUrl property.
     */
    public void setNotificationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notificationUrl", value);
    }
    /**
     * Sets the notificationUrlAppId property value. Optional. The app ID that the subscription service can use to generate the validation token. The value allows the client to validate the authenticity of the notification received.
     * @param value Value to set for the notificationUrlAppId property.
     */
    public void setNotificationUrlAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notificationUrlAppId", value);
    }
    /**
     * Sets the resource property value. Required. Specifies the resource that is monitored for changes. Don&apos;t include the base URL (https://graph.microsoft.com/v1.0/). See the possible resource path values for each supported resource.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resource", value);
    }
}
