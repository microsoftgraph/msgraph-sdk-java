package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceUpdateMessage extends ServiceAnnouncementBase implements Parsable {
    /** The expected deadline of the action for the message. */
    private OffsetDateTime _actionRequiredByDateTime;
    /** A collection of serviceAnnouncementAttachments. */
    private java.util.List<ServiceAnnouncementAttachment> _attachments;
    /** The zip file of all attachments for a message. */
    private byte[] _attachmentsArchive;
    /** The body property */
    private ItemBody _body;
    /** The service message category. Possible values are: preventOrFixIssue, planForChange, stayInformed, unknownFutureValue. */
    private ServiceUpdateCategory _category;
    /** Indicates whether the message has any attachment. */
    private Boolean _hasAttachments;
    /** Indicates whether the message describes a major update for the service. */
    private Boolean _isMajorChange;
    /** The affected services by the service message. */
    private java.util.List<String> _services;
    /** The severity of the service message. Possible values are: normal, high, critical, unknownFutureValue. */
    private ServiceUpdateSeverity _severity;
    /** A collection of tags for the service message. Tags are provided by the service team/support team who post the message to tell whether this message contains privacy data, or whether this message is for a service new feature update, and so on. */
    private java.util.List<String> _tags;
    /** Represents user viewpoints data of the service message. This data includes message status such as whether the user has archived, read, or marked the message as favorite. This property is null when accessed with application permissions. */
    private ServiceUpdateMessageViewpoint _viewPoint;
    /**
     * Instantiates a new ServiceUpdateMessage and sets the default values.
     * @return a void
     */
    public ServiceUpdateMessage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUpdateMessage
     */
    @javax.annotation.Nonnull
    public static ServiceUpdateMessage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUpdateMessage();
    }
    /**
     * Gets the actionRequiredByDateTime property value. The expected deadline of the action for the message.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActionRequiredByDateTime() {
        return this._actionRequiredByDateTime;
    }
    /**
     * Gets the attachments property value. A collection of serviceAnnouncementAttachments.
     * @return a serviceAnnouncementAttachment
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceAnnouncementAttachment> getAttachments() {
        return this._attachments;
    }
    /**
     * Gets the attachmentsArchive property value. The zip file of all attachments for a message.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getAttachmentsArchive() {
        return this._attachmentsArchive;
    }
    /**
     * Gets the body property value. The body property
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBody() {
        return this._body;
    }
    /**
     * Gets the category property value. The service message category. Possible values are: preventOrFixIssue, planForChange, stayInformed, unknownFutureValue.
     * @return a serviceUpdateCategory
     */
    @javax.annotation.Nullable
    public ServiceUpdateCategory getCategory() {
        return this._category;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ServiceUpdateMessage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("actionRequiredByDateTime", (n) -> { currentObject.setActionRequiredByDateTime(n.getOffsetDateTimeValue()); });
            this.put("attachments", (n) -> { currentObject.setAttachments(n.getCollectionOfObjectValues(ServiceAnnouncementAttachment::createFromDiscriminatorValue)); });
            this.put("attachmentsArchive", (n) -> { currentObject.setAttachmentsArchive(n.getByteArrayValue()); });
            this.put("body", (n) -> { currentObject.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(ServiceUpdateCategory.class)); });
            this.put("hasAttachments", (n) -> { currentObject.setHasAttachments(n.getBooleanValue()); });
            this.put("isMajorChange", (n) -> { currentObject.setIsMajorChange(n.getBooleanValue()); });
            this.put("services", (n) -> { currentObject.setServices(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("severity", (n) -> { currentObject.setSeverity(n.getEnumValue(ServiceUpdateSeverity.class)); });
            this.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("viewPoint", (n) -> { currentObject.setViewPoint(n.getObjectValue(ServiceUpdateMessageViewpoint::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the hasAttachments property value. Indicates whether the message has any attachment.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasAttachments() {
        return this._hasAttachments;
    }
    /**
     * Gets the isMajorChange property value. Indicates whether the message describes a major update for the service.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMajorChange() {
        return this._isMajorChange;
    }
    /**
     * Gets the services property value. The affected services by the service message.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getServices() {
        return this._services;
    }
    /**
     * Gets the severity property value. The severity of the service message. Possible values are: normal, high, critical, unknownFutureValue.
     * @return a serviceUpdateSeverity
     */
    @javax.annotation.Nullable
    public ServiceUpdateSeverity getSeverity() {
        return this._severity;
    }
    /**
     * Gets the tags property value. A collection of tags for the service message. Tags are provided by the service team/support team who post the message to tell whether this message contains privacy data, or whether this message is for a service new feature update, and so on.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this._tags;
    }
    /**
     * Gets the viewPoint property value. Represents user viewpoints data of the service message. This data includes message status such as whether the user has archived, read, or marked the message as favorite. This property is null when accessed with application permissions.
     * @return a serviceUpdateMessageViewpoint
     */
    @javax.annotation.Nullable
    public ServiceUpdateMessageViewpoint getViewPoint() {
        return this._viewPoint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setActionRequiredByDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._actionRequiredByDateTime = value;
    }
    /**
     * Sets the attachments property value. A collection of serviceAnnouncementAttachments.
     * @param value Value to set for the attachments property.
     * @return a void
     */
    public void setAttachments(@javax.annotation.Nullable final java.util.List<ServiceAnnouncementAttachment> value) {
        this._attachments = value;
    }
    /**
     * Sets the attachmentsArchive property value. The zip file of all attachments for a message.
     * @param value Value to set for the attachmentsArchive property.
     * @return a void
     */
    public void setAttachmentsArchive(@javax.annotation.Nullable final byte[] value) {
        this._attachmentsArchive = value;
    }
    /**
     * Sets the body property value. The body property
     * @param value Value to set for the body property.
     * @return a void
     */
    public void setBody(@javax.annotation.Nullable final ItemBody value) {
        this._body = value;
    }
    /**
     * Sets the category property value. The service message category. Possible values are: preventOrFixIssue, planForChange, stayInformed, unknownFutureValue.
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final ServiceUpdateCategory value) {
        this._category = value;
    }
    /**
     * Sets the hasAttachments property value. Indicates whether the message has any attachment.
     * @param value Value to set for the hasAttachments property.
     * @return a void
     */
    public void setHasAttachments(@javax.annotation.Nullable final Boolean value) {
        this._hasAttachments = value;
    }
    /**
     * Sets the isMajorChange property value. Indicates whether the message describes a major update for the service.
     * @param value Value to set for the isMajorChange property.
     * @return a void
     */
    public void setIsMajorChange(@javax.annotation.Nullable final Boolean value) {
        this._isMajorChange = value;
    }
    /**
     * Sets the services property value. The affected services by the service message.
     * @param value Value to set for the services property.
     * @return a void
     */
    public void setServices(@javax.annotation.Nullable final java.util.List<String> value) {
        this._services = value;
    }
    /**
     * Sets the severity property value. The severity of the service message. Possible values are: normal, high, critical, unknownFutureValue.
     * @param value Value to set for the severity property.
     * @return a void
     */
    public void setSeverity(@javax.annotation.Nullable final ServiceUpdateSeverity value) {
        this._severity = value;
    }
    /**
     * Sets the tags property value. A collection of tags for the service message. Tags are provided by the service team/support team who post the message to tell whether this message contains privacy data, or whether this message is for a service new feature update, and so on.
     * @param value Value to set for the tags property.
     * @return a void
     */
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tags = value;
    }
    /**
     * Sets the viewPoint property value. Represents user viewpoints data of the service message. This data includes message status such as whether the user has archived, read, or marked the message as favorite. This property is null when accessed with application permissions.
     * @param value Value to set for the viewPoint property.
     * @return a void
     */
    public void setViewPoint(@javax.annotation.Nullable final ServiceUpdateMessageViewpoint value) {
        this._viewPoint = value;
    }
}
