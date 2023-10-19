package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceUpdateMessage extends ServiceAnnouncementBase implements Parsable {
    /**
     * The expected deadline of the action for the message.
     */
    private OffsetDateTime actionRequiredByDateTime;
    /**
     * A collection of serviceAnnouncementAttachments.
     */
    private java.util.List<ServiceAnnouncementAttachment> attachments;
    /**
     * The zip file that contains all attachments for a message.
     */
    private byte[] attachmentsArchive;
    /**
     * The body property
     */
    private ItemBody body;
    /**
     * The category property
     */
    private ServiceUpdateCategory category;
    /**
     * Indicates whether the message has any attachment.
     */
    private Boolean hasAttachments;
    /**
     * Indicates whether the message describes a major update for the service.
     */
    private Boolean isMajorChange;
    /**
     * The affected services by the service message.
     */
    private java.util.List<String> services;
    /**
     * The severity property
     */
    private ServiceUpdateSeverity severity;
    /**
     * A collection of tags for the service message. Tags are provided by the service team/support team who post the message to tell whether this message contains privacy data, or whether this message is for a service new feature update, and so on.
     */
    private java.util.List<String> tags;
    /**
     * Represents user viewpoints data of the service message. This data includes message status such as whether the user has archived, read, or marked the message as favorite. This property is null when accessed with application permissions.
     */
    private ServiceUpdateMessageViewpoint viewPoint;
    /**
     * Instantiates a new ServiceUpdateMessage and sets the default values.
     */
    public ServiceUpdateMessage() {
        super();
        this.setOdataType("#microsoft.graph.serviceUpdateMessage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUpdateMessage
     */
    @jakarta.annotation.Nonnull
    public static ServiceUpdateMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUpdateMessage();
    }
    /**
     * Gets the actionRequiredByDateTime property value. The expected deadline of the action for the message.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActionRequiredByDateTime() {
        return this.actionRequiredByDateTime;
    }
    /**
     * Gets the attachments property value. A collection of serviceAnnouncementAttachments.
     * @return a java.util.List<ServiceAnnouncementAttachment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceAnnouncementAttachment> getAttachments() {
        return this.attachments;
    }
    /**
     * Gets the attachmentsArchive property value. The zip file that contains all attachments for a message.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getAttachmentsArchive() {
        return this.attachmentsArchive;
    }
    /**
     * Gets the body property value. The body property
     * @return a ItemBody
     */
    @jakarta.annotation.Nullable
    public ItemBody getBody() {
        return this.body;
    }
    /**
     * Gets the category property value. The category property
     * @return a ServiceUpdateCategory
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateCategory getCategory() {
        return this.category;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionRequiredByDateTime", (n) -> { this.setActionRequiredByDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("attachments", (n) -> { this.setAttachments(n.getCollectionOfObjectValues(ServiceAnnouncementAttachment::createFromDiscriminatorValue)); });
        deserializerMap.put("attachmentsArchive", (n) -> { this.setAttachmentsArchive(n.getByteArrayValue()); });
        deserializerMap.put("body", (n) -> { this.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(ServiceUpdateCategory.class)); });
        deserializerMap.put("hasAttachments", (n) -> { this.setHasAttachments(n.getBooleanValue()); });
        deserializerMap.put("isMajorChange", (n) -> { this.setIsMajorChange(n.getBooleanValue()); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(ServiceUpdateSeverity.class)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("viewPoint", (n) -> { this.setViewPoint(n.getObjectValue(ServiceUpdateMessageViewpoint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hasAttachments property value. Indicates whether the message has any attachment.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.hasAttachments;
    }
    /**
     * Gets the isMajorChange property value. Indicates whether the message describes a major update for the service.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMajorChange() {
        return this.isMajorChange;
    }
    /**
     * Gets the services property value. The affected services by the service message.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getServices() {
        return this.services;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a ServiceUpdateSeverity
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateSeverity getSeverity() {
        return this.severity;
    }
    /**
     * Gets the tags property value. A collection of tags for the service message. Tags are provided by the service team/support team who post the message to tell whether this message contains privacy data, or whether this message is for a service new feature update, and so on.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }
    /**
     * Gets the viewPoint property value. Represents user viewpoints data of the service message. This data includes message status such as whether the user has archived, read, or marked the message as favorite. This property is null when accessed with application permissions.
     * @return a ServiceUpdateMessageViewpoint
     */
    @jakarta.annotation.Nullable
    public ServiceUpdateMessageViewpoint getViewPoint() {
        return this.viewPoint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("actionRequiredByDateTime", this.getActionRequiredByDateTime());
        writer.writeCollectionOfObjectValues("attachments", this.getAttachments());
        writer.writeByteArrayValue("attachmentsArchive", this.getAttachmentsArchive());
        writer.writeObjectValue("body", this.getBody());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeBooleanValue("hasAttachments", this.getHasAttachments());
        writer.writeBooleanValue("isMajorChange", this.getIsMajorChange());
        writer.writeCollectionOfPrimitiveValues("services", this.getServices());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeObjectValue("viewPoint", this.getViewPoint());
    }
    /**
     * Sets the actionRequiredByDateTime property value. The expected deadline of the action for the message.
     * @param value Value to set for the actionRequiredByDateTime property.
     */
    public void setActionRequiredByDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.actionRequiredByDateTime = value;
    }
    /**
     * Sets the attachments property value. A collection of serviceAnnouncementAttachments.
     * @param value Value to set for the attachments property.
     */
    public void setAttachments(@jakarta.annotation.Nullable final java.util.List<ServiceAnnouncementAttachment> value) {
        this.attachments = value;
    }
    /**
     * Sets the attachmentsArchive property value. The zip file that contains all attachments for a message.
     * @param value Value to set for the attachmentsArchive property.
     */
    public void setAttachmentsArchive(@jakarta.annotation.Nullable final byte[] value) {
        this.attachmentsArchive = value;
    }
    /**
     * Sets the body property value. The body property
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final ItemBody value) {
        this.body = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final ServiceUpdateCategory value) {
        this.category = value;
    }
    /**
     * Sets the hasAttachments property value. Indicates whether the message has any attachment.
     * @param value Value to set for the hasAttachments property.
     */
    public void setHasAttachments(@jakarta.annotation.Nullable final Boolean value) {
        this.hasAttachments = value;
    }
    /**
     * Sets the isMajorChange property value. Indicates whether the message describes a major update for the service.
     * @param value Value to set for the isMajorChange property.
     */
    public void setIsMajorChange(@jakarta.annotation.Nullable final Boolean value) {
        this.isMajorChange = value;
    }
    /**
     * Sets the services property value. The affected services by the service message.
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.services = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final ServiceUpdateSeverity value) {
        this.severity = value;
    }
    /**
     * Sets the tags property value. A collection of tags for the service message. Tags are provided by the service team/support team who post the message to tell whether this message contains privacy data, or whether this message is for a service new feature update, and so on.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tags = value;
    }
    /**
     * Sets the viewPoint property value. Represents user viewpoints data of the service message. This data includes message status such as whether the user has archived, read, or marked the message as favorite. This property is null when accessed with application permissions.
     * @param value Value to set for the viewPoint property.
     */
    public void setViewPoint(@jakarta.annotation.Nullable final ServiceUpdateMessageViewpoint value) {
        this.viewPoint = value;
    }
}
