package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Subscription extends Entity implements Parsable {
    /** Optional. Identifier of the application used to create the subscription. Read-only. */
    private String applicationId;
    /** Required. Indicates the type of change in the subscribed resource that will raise a change notification. The supported values are: created, updated, deleted. Multiple values can be combined using a comma-separated list. Note:  Drive root item and list change notifications support only the updated changeType. User and group change notifications support updated and deleted changeType. Use updated to receive notifications when user or group is created, updated or soft deleted.  Use deleted to receive notifications when user or group is permanently deleted. */
    private String changeType;
    /** Required. Specifies the value of the clientState property sent by the service in each change notification. The maximum length is 128 characters. The client can check that the change notification came from the service by comparing the value of the clientState property sent with the subscription with the value of the clientState property received with each change notification. */
    private String clientState;
    /** Optional. Identifier of the user or service principal that created the subscription. If the app used delegated permissions to create the subscription, this field contains the id of the signed-in user the app called on behalf of. If the app used application permissions, this field contains the id of the service principal corresponding to the app. Read-only. */
    private String creatorId;
    /** Optional. A base64-encoded representation of a certificate with a public key used to encrypt resource data in change notifications. Optional but required when includeResourceData is true. */
    private String encryptionCertificate;
    /** Optional. A custom app-provided identifier to help identify the certificate needed to decrypt resource data. */
    private String encryptionCertificateId;
    /** Required. Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount of time from subscription creation that varies for the resource subscribed to. For the maximum supported subscription length of time, see the table below. */
    private OffsetDateTime expirationDateTime;
    /** Optional. When set to true, change notifications include resource data (such as content of a chat message). */
    private Boolean includeResourceData;
    /** Optional. Specifies the latest version of Transport Layer Security (TLS) that the notification endpoint, specified by notificationUrl, supports. The possible values are: v1_0, v1_1, v1_2, v1_3. For subscribers whose notification endpoint supports a version lower than the currently recommended version (TLS 1.2), specifying this property by a set timeline allows them to temporarily use their deprecated version of TLS before completing their upgrade to TLS 1.2. For these subscribers, not setting this property per the timeline would result in subscription operations failing. For subscribers whose notification endpoint already supports TLS 1.2, setting this property is optional. In such cases, Microsoft Graph defaults the property to v1_2. */
    private String latestSupportedTlsVersion;
    /** Optional. The URL of the endpoint that receives lifecycle notifications, including subscriptionRemoved, reauthorizationRequired, and missed notifications. This URL must make use of the HTTPS protocol. */
    private String lifecycleNotificationUrl;
    /** Optional. OData query options for specifying value for the targeting resource. Clients receive notifications when resource reaches the state matching the query options provided here. With this new property in the subscription creation payload along with all existing properties, Webhooks will deliver notifications whenever a resource reaches the desired state mentioned in the notificationQueryOptions property. For example, when the print job is completed or when a print job resource isFetchable property value becomes true etc.  Supported only for Universal Print Service. For more information, see Subscribe to change notifications from cloud printing APIs using Microsoft Graph. */
    private String notificationQueryOptions;
    /** Required. The URL of the endpoint that will receive the change notifications. This URL must make use of the HTTPS protocol. Any query string parameter included in the notificationUrl property will be included in the HTTP POST request when Microsoft Graph sends the change notifications. */
    private String notificationUrl;
    /** Optional. The app ID that the subscription service can use to generate the validation token. This allows the client to validate the authenticity of the notification received. */
    private String notificationUrlAppId;
    /** Required. Specifies the resource that will be monitored for changes. Do not include the base URL (https://graph.microsoft.com/v1.0/). See the possible resource path values for each supported resource. */
    private String resource;
    /**
     * Instantiates a new subscription and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Subscription() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a subscription
     */
    @javax.annotation.Nonnull
    public static Subscription createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Subscription();
    }
    /**
     * Gets the applicationId property value. Optional. Identifier of the application used to create the subscription. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationId() {
        return this.applicationId;
    }
    /**
     * Gets the changeType property value. Required. Indicates the type of change in the subscribed resource that will raise a change notification. The supported values are: created, updated, deleted. Multiple values can be combined using a comma-separated list. Note:  Drive root item and list change notifications support only the updated changeType. User and group change notifications support updated and deleted changeType. Use updated to receive notifications when user or group is created, updated or soft deleted.  Use deleted to receive notifications when user or group is permanently deleted.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChangeType() {
        return this.changeType;
    }
    /**
     * Gets the clientState property value. Required. Specifies the value of the clientState property sent by the service in each change notification. The maximum length is 128 characters. The client can check that the change notification came from the service by comparing the value of the clientState property sent with the subscription with the value of the clientState property received with each change notification.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientState() {
        return this.clientState;
    }
    /**
     * Gets the creatorId property value. Optional. Identifier of the user or service principal that created the subscription. If the app used delegated permissions to create the subscription, this field contains the id of the signed-in user the app called on behalf of. If the app used application permissions, this field contains the id of the service principal corresponding to the app. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatorId() {
        return this.creatorId;
    }
    /**
     * Gets the encryptionCertificate property value. Optional. A base64-encoded representation of a certificate with a public key used to encrypt resource data in change notifications. Optional but required when includeResourceData is true.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEncryptionCertificate() {
        return this.encryptionCertificate;
    }
    /**
     * Gets the encryptionCertificateId property value. Optional. A custom app-provided identifier to help identify the certificate needed to decrypt resource data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEncryptionCertificateId() {
        return this.encryptionCertificateId;
    }
    /**
     * Gets the expirationDateTime property value. Required. Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount of time from subscription creation that varies for the resource subscribed to. For the maximum supported subscription length of time, see the table below.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIncludeResourceData() {
        return this.includeResourceData;
    }
    /**
     * Gets the latestSupportedTlsVersion property value. Optional. Specifies the latest version of Transport Layer Security (TLS) that the notification endpoint, specified by notificationUrl, supports. The possible values are: v1_0, v1_1, v1_2, v1_3. For subscribers whose notification endpoint supports a version lower than the currently recommended version (TLS 1.2), specifying this property by a set timeline allows them to temporarily use their deprecated version of TLS before completing their upgrade to TLS 1.2. For these subscribers, not setting this property per the timeline would result in subscription operations failing. For subscribers whose notification endpoint already supports TLS 1.2, setting this property is optional. In such cases, Microsoft Graph defaults the property to v1_2.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLatestSupportedTlsVersion() {
        return this.latestSupportedTlsVersion;
    }
    /**
     * Gets the lifecycleNotificationUrl property value. Optional. The URL of the endpoint that receives lifecycle notifications, including subscriptionRemoved, reauthorizationRequired, and missed notifications. This URL must make use of the HTTPS protocol.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLifecycleNotificationUrl() {
        return this.lifecycleNotificationUrl;
    }
    /**
     * Gets the notificationQueryOptions property value. Optional. OData query options for specifying value for the targeting resource. Clients receive notifications when resource reaches the state matching the query options provided here. With this new property in the subscription creation payload along with all existing properties, Webhooks will deliver notifications whenever a resource reaches the desired state mentioned in the notificationQueryOptions property. For example, when the print job is completed or when a print job resource isFetchable property value becomes true etc.  Supported only for Universal Print Service. For more information, see Subscribe to change notifications from cloud printing APIs using Microsoft Graph.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationQueryOptions() {
        return this.notificationQueryOptions;
    }
    /**
     * Gets the notificationUrl property value. Required. The URL of the endpoint that will receive the change notifications. This URL must make use of the HTTPS protocol. Any query string parameter included in the notificationUrl property will be included in the HTTP POST request when Microsoft Graph sends the change notifications.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationUrl() {
        return this.notificationUrl;
    }
    /**
     * Gets the notificationUrlAppId property value. Optional. The app ID that the subscription service can use to generate the validation token. This allows the client to validate the authenticity of the notification received.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationUrlAppId() {
        return this.notificationUrlAppId;
    }
    /**
     * Gets the resource property value. Required. Specifies the resource that will be monitored for changes. Do not include the base URL (https://graph.microsoft.com/v1.0/). See the possible resource path values for each supported resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResource() {
        return this.resource;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationId(@javax.annotation.Nullable final String value) {
        this.applicationId = value;
    }
    /**
     * Sets the changeType property value. Required. Indicates the type of change in the subscribed resource that will raise a change notification. The supported values are: created, updated, deleted. Multiple values can be combined using a comma-separated list. Note:  Drive root item and list change notifications support only the updated changeType. User and group change notifications support updated and deleted changeType. Use updated to receive notifications when user or group is created, updated or soft deleted.  Use deleted to receive notifications when user or group is permanently deleted.
     * @param value Value to set for the changeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChangeType(@javax.annotation.Nullable final String value) {
        this.changeType = value;
    }
    /**
     * Sets the clientState property value. Required. Specifies the value of the clientState property sent by the service in each change notification. The maximum length is 128 characters. The client can check that the change notification came from the service by comparing the value of the clientState property sent with the subscription with the value of the clientState property received with each change notification.
     * @param value Value to set for the clientState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientState(@javax.annotation.Nullable final String value) {
        this.clientState = value;
    }
    /**
     * Sets the creatorId property value. Optional. Identifier of the user or service principal that created the subscription. If the app used delegated permissions to create the subscription, this field contains the id of the signed-in user the app called on behalf of. If the app used application permissions, this field contains the id of the service principal corresponding to the app. Read-only.
     * @param value Value to set for the creatorId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatorId(@javax.annotation.Nullable final String value) {
        this.creatorId = value;
    }
    /**
     * Sets the encryptionCertificate property value. Optional. A base64-encoded representation of a certificate with a public key used to encrypt resource data in change notifications. Optional but required when includeResourceData is true.
     * @param value Value to set for the encryptionCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEncryptionCertificate(@javax.annotation.Nullable final String value) {
        this.encryptionCertificate = value;
    }
    /**
     * Sets the encryptionCertificateId property value. Optional. A custom app-provided identifier to help identify the certificate needed to decrypt resource data.
     * @param value Value to set for the encryptionCertificateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEncryptionCertificateId(@javax.annotation.Nullable final String value) {
        this.encryptionCertificateId = value;
    }
    /**
     * Sets the expirationDateTime property value. Required. Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount of time from subscription creation that varies for the resource subscribed to. For the maximum supported subscription length of time, see the table below.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the includeResourceData property value. Optional. When set to true, change notifications include resource data (such as content of a chat message).
     * @param value Value to set for the includeResourceData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeResourceData(@javax.annotation.Nullable final Boolean value) {
        this.includeResourceData = value;
    }
    /**
     * Sets the latestSupportedTlsVersion property value. Optional. Specifies the latest version of Transport Layer Security (TLS) that the notification endpoint, specified by notificationUrl, supports. The possible values are: v1_0, v1_1, v1_2, v1_3. For subscribers whose notification endpoint supports a version lower than the currently recommended version (TLS 1.2), specifying this property by a set timeline allows them to temporarily use their deprecated version of TLS before completing their upgrade to TLS 1.2. For these subscribers, not setting this property per the timeline would result in subscription operations failing. For subscribers whose notification endpoint already supports TLS 1.2, setting this property is optional. In such cases, Microsoft Graph defaults the property to v1_2.
     * @param value Value to set for the latestSupportedTlsVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLatestSupportedTlsVersion(@javax.annotation.Nullable final String value) {
        this.latestSupportedTlsVersion = value;
    }
    /**
     * Sets the lifecycleNotificationUrl property value. Optional. The URL of the endpoint that receives lifecycle notifications, including subscriptionRemoved, reauthorizationRequired, and missed notifications. This URL must make use of the HTTPS protocol.
     * @param value Value to set for the lifecycleNotificationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLifecycleNotificationUrl(@javax.annotation.Nullable final String value) {
        this.lifecycleNotificationUrl = value;
    }
    /**
     * Sets the notificationQueryOptions property value. Optional. OData query options for specifying value for the targeting resource. Clients receive notifications when resource reaches the state matching the query options provided here. With this new property in the subscription creation payload along with all existing properties, Webhooks will deliver notifications whenever a resource reaches the desired state mentioned in the notificationQueryOptions property. For example, when the print job is completed or when a print job resource isFetchable property value becomes true etc.  Supported only for Universal Print Service. For more information, see Subscribe to change notifications from cloud printing APIs using Microsoft Graph.
     * @param value Value to set for the notificationQueryOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationQueryOptions(@javax.annotation.Nullable final String value) {
        this.notificationQueryOptions = value;
    }
    /**
     * Sets the notificationUrl property value. Required. The URL of the endpoint that will receive the change notifications. This URL must make use of the HTTPS protocol. Any query string parameter included in the notificationUrl property will be included in the HTTP POST request when Microsoft Graph sends the change notifications.
     * @param value Value to set for the notificationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationUrl(@javax.annotation.Nullable final String value) {
        this.notificationUrl = value;
    }
    /**
     * Sets the notificationUrlAppId property value. Optional. The app ID that the subscription service can use to generate the validation token. This allows the client to validate the authenticity of the notification received.
     * @param value Value to set for the notificationUrlAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationUrlAppId(@javax.annotation.Nullable final String value) {
        this.notificationUrlAppId = value;
    }
    /**
     * Sets the resource property value. Required. Specifies the resource that will be monitored for changes. Do not include the base URL (https://graph.microsoft.com/v1.0/). See the possible resource path values for each supported resource.
     * @param value Value to set for the resource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResource(@javax.annotation.Nullable final String value) {
        this.resource = value;
    }
}
