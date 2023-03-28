package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class ChangeNotification implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The changeType property */
    private ChangeType changeType;
    /** Value of the clientState property sent in the subscription request (if any). The maximum length is 255 characters. The client can check whether the change notification came from the service by comparing the values of the clientState property. The value of the clientState property sent with the subscription is compared with the value of the clientState property received with each change notification. Optional. */
    private String clientState;
    /** (Preview) Encrypted content attached with the change notification. Only provided if encryptionCertificate and includeResourceData were defined during the subscription request and if the resource supports it. Optional. */
    private ChangeNotificationEncryptedContent encryptedContent;
    /** Unique ID for the notification. Optional. */
    private String id;
    /** The type of lifecycle notification if the current notification is a lifecycle notification. Optional. Supported values are missed, subscriptionRemoved, reauthorizationRequired. Optional. */
    private LifecycleEventType lifecycleEvent;
    /** The OdataType property */
    private String odataType;
    /** The URI of the resource that emitted the change notification relative to https://graph.microsoft.com. Required. */
    private String resource;
    /** The content of this property depends on the type of resource being subscribed to. Optional. */
    private ResourceData resourceData;
    /** The expiration time for the subscription. Required. */
    private OffsetDateTime subscriptionExpirationDateTime;
    /** The unique identifier of the subscription that generated the notification.Required. */
    private UUID subscriptionId;
    /** The unique identifier of the tenant from which the change notification originated. Required. */
    private UUID tenantId;
    /**
     * Instantiates a new changeNotification and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChangeNotification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a changeNotification
     */
    @javax.annotation.Nonnull
    public static ChangeNotification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangeNotification();
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
     * Gets the changeType property value. The changeType property
     * @return a changeType
     */
    @javax.annotation.Nullable
    public ChangeType getChangeType() {
        return this.changeType;
    }
    /**
     * Gets the clientState property value. Value of the clientState property sent in the subscription request (if any). The maximum length is 255 characters. The client can check whether the change notification came from the service by comparing the values of the clientState property. The value of the clientState property sent with the subscription is compared with the value of the clientState property received with each change notification. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientState() {
        return this.clientState;
    }
    /**
     * Gets the encryptedContent property value. (Preview) Encrypted content attached with the change notification. Only provided if encryptionCertificate and includeResourceData were defined during the subscription request and if the resource supports it. Optional.
     * @return a changeNotificationEncryptedContent
     */
    @javax.annotation.Nullable
    public ChangeNotificationEncryptedContent getEncryptedContent() {
        return this.encryptedContent;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("changeType", (n) -> { this.setChangeType(n.getEnumValue(ChangeType.class)); });
        deserializerMap.put("clientState", (n) -> { this.setClientState(n.getStringValue()); });
        deserializerMap.put("encryptedContent", (n) -> { this.setEncryptedContent(n.getObjectValue(ChangeNotificationEncryptedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("lifecycleEvent", (n) -> { this.setLifecycleEvent(n.getEnumValue(LifecycleEventType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getStringValue()); });
        deserializerMap.put("resourceData", (n) -> { this.setResourceData(n.getObjectValue(ResourceData::createFromDiscriminatorValue)); });
        deserializerMap.put("subscriptionExpirationDateTime", (n) -> { this.setSubscriptionExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getUUIDValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique ID for the notification. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the lifecycleEvent property value. The type of lifecycle notification if the current notification is a lifecycle notification. Optional. Supported values are missed, subscriptionRemoved, reauthorizationRequired. Optional.
     * @return a lifecycleEventType
     */
    @javax.annotation.Nullable
    public LifecycleEventType getLifecycleEvent() {
        return this.lifecycleEvent;
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
     * Gets the resource property value. The URI of the resource that emitted the change notification relative to https://graph.microsoft.com. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResource() {
        return this.resource;
    }
    /**
     * Gets the resourceData property value. The content of this property depends on the type of resource being subscribed to. Optional.
     * @return a resourceData
     */
    @javax.annotation.Nullable
    public ResourceData getResourceData() {
        return this.resourceData;
    }
    /**
     * Gets the subscriptionExpirationDateTime property value. The expiration time for the subscription. Required.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSubscriptionExpirationDateTime() {
        return this.subscriptionExpirationDateTime;
    }
    /**
     * Gets the subscriptionId property value. The unique identifier of the subscription that generated the notification.Required.
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Gets the tenantId property value. The unique identifier of the tenant from which the change notification originated. Required.
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getTenantId() {
        return this.tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("changeType", this.getChangeType());
        writer.writeStringValue("clientState", this.getClientState());
        writer.writeObjectValue("encryptedContent", this.getEncryptedContent());
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("lifecycleEvent", this.getLifecycleEvent());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("resource", this.getResource());
        writer.writeObjectValue("resourceData", this.getResourceData());
        writer.writeOffsetDateTimeValue("subscriptionExpirationDateTime", this.getSubscriptionExpirationDateTime());
        writer.writeUUIDValue("subscriptionId", this.getSubscriptionId());
        writer.writeUUIDValue("tenantId", this.getTenantId());
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
     * Sets the changeType property value. The changeType property
     * @param value Value to set for the changeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChangeType(@javax.annotation.Nullable final ChangeType value) {
        this.changeType = value;
    }
    /**
     * Sets the clientState property value. Value of the clientState property sent in the subscription request (if any). The maximum length is 255 characters. The client can check whether the change notification came from the service by comparing the values of the clientState property. The value of the clientState property sent with the subscription is compared with the value of the clientState property received with each change notification. Optional.
     * @param value Value to set for the clientState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientState(@javax.annotation.Nullable final String value) {
        this.clientState = value;
    }
    /**
     * Sets the encryptedContent property value. (Preview) Encrypted content attached with the change notification. Only provided if encryptionCertificate and includeResourceData were defined during the subscription request and if the resource supports it. Optional.
     * @param value Value to set for the encryptedContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEncryptedContent(@javax.annotation.Nullable final ChangeNotificationEncryptedContent value) {
        this.encryptedContent = value;
    }
    /**
     * Sets the id property value. Unique ID for the notification. Optional.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the lifecycleEvent property value. The type of lifecycle notification if the current notification is a lifecycle notification. Optional. Supported values are missed, subscriptionRemoved, reauthorizationRequired. Optional.
     * @param value Value to set for the lifecycleEvent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLifecycleEvent(@javax.annotation.Nullable final LifecycleEventType value) {
        this.lifecycleEvent = value;
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
     * Sets the resource property value. The URI of the resource that emitted the change notification relative to https://graph.microsoft.com. Required.
     * @param value Value to set for the resource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResource(@javax.annotation.Nullable final String value) {
        this.resource = value;
    }
    /**
     * Sets the resourceData property value. The content of this property depends on the type of resource being subscribed to. Optional.
     * @param value Value to set for the resourceData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceData(@javax.annotation.Nullable final ResourceData value) {
        this.resourceData = value;
    }
    /**
     * Sets the subscriptionExpirationDateTime property value. The expiration time for the subscription. Required.
     * @param value Value to set for the subscriptionExpirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.subscriptionExpirationDateTime = value;
    }
    /**
     * Sets the subscriptionId property value. The unique identifier of the subscription that generated the notification.Required.
     * @param value Value to set for the subscriptionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionId(@javax.annotation.Nullable final UUID value) {
        this.subscriptionId = value;
    }
    /**
     * Sets the tenantId property value. The unique identifier of the tenant from which the change notification originated. Required.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final UUID value) {
        this.tenantId = value;
    }
}
