package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedEBook extends Entity implements Parsable {
    /** The list of assignments for this eBook. */
    private java.util.List<ManagedEBookAssignment> _assignments;
    /** The date and time when the eBook file was created. */
    private OffsetDateTime _createdDateTime;
    /** Description. */
    private String _description;
    /** The list of installation states for this eBook. */
    private java.util.List<DeviceInstallState> _deviceStates;
    /** Name of the eBook. */
    private String _displayName;
    /** The more information Url. */
    private String _informationUrl;
    /** Mobile App Install Summary. */
    private EBookInstallSummary _installSummary;
    /** Book cover. */
    private MimeContent _largeCover;
    /** The date and time when the eBook was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The privacy statement Url. */
    private String _privacyInformationUrl;
    /** The date and time when the eBook was published. */
    private OffsetDateTime _publishedDateTime;
    /** Publisher. */
    private String _publisher;
    /** The list of installation states for this eBook. */
    private java.util.List<UserInstallStateSummary> _userStateSummary;
    /**
     * Instantiates a new managedEBook and sets the default values.
     * @return a void
     */
    public ManagedEBook() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedEBook
     */
    @javax.annotation.Nonnull
    public static ManagedEBook createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedEBook();
    }
    /**
     * Gets the assignments property value. The list of assignments for this eBook.
     * @return a managedEBookAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedEBookAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the eBook file was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceStates property value. The list of installation states for this eBook.
     * @return a deviceInstallState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceInstallState> getDeviceStates() {
        return this._deviceStates;
    }
    /**
     * Gets the displayName property value. Name of the eBook.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedEBook currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(ManagedEBookAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceStates", (n) -> { currentObject.setDeviceStates(n.getCollectionOfObjectValues(DeviceInstallState::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("informationUrl", (n) -> { currentObject.setInformationUrl(n.getStringValue()); });
            this.put("installSummary", (n) -> { currentObject.setInstallSummary(n.getObjectValue(EBookInstallSummary::createFromDiscriminatorValue)); });
            this.put("largeCover", (n) -> { currentObject.setLargeCover(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("privacyInformationUrl", (n) -> { currentObject.setPrivacyInformationUrl(n.getStringValue()); });
            this.put("publishedDateTime", (n) -> { currentObject.setPublishedDateTime(n.getOffsetDateTimeValue()); });
            this.put("publisher", (n) -> { currentObject.setPublisher(n.getStringValue()); });
            this.put("userStateSummary", (n) -> { currentObject.setUserStateSummary(n.getCollectionOfObjectValues(UserInstallStateSummary::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the informationUrl property value. The more information Url.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInformationUrl() {
        return this._informationUrl;
    }
    /**
     * Gets the installSummary property value. Mobile App Install Summary.
     * @return a eBookInstallSummary
     */
    @javax.annotation.Nullable
    public EBookInstallSummary getInstallSummary() {
        return this._installSummary;
    }
    /**
     * Gets the largeCover property value. Book cover.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getLargeCover() {
        return this._largeCover;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the eBook was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the privacyInformationUrl property value. The privacy statement Url.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivacyInformationUrl() {
        return this._privacyInformationUrl;
    }
    /**
     * Gets the publishedDateTime property value. The date and time when the eBook was published.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this._publishedDateTime;
    }
    /**
     * Gets the publisher property value. Publisher.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the userStateSummary property value. The list of installation states for this eBook.
     * @return a userInstallStateSummary
     */
    @javax.annotation.Nullable
    public java.util.List<UserInstallStateSummary> getUserStateSummary() {
        return this._userStateSummary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("deviceStates", this.getDeviceStates());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("informationUrl", this.getInformationUrl());
        writer.writeObjectValue("installSummary", this.getInstallSummary());
        writer.writeObjectValue("largeCover", this.getLargeCover());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("privacyInformationUrl", this.getPrivacyInformationUrl());
        writer.writeOffsetDateTimeValue("publishedDateTime", this.getPublishedDateTime());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeCollectionOfObjectValues("userStateSummary", this.getUserStateSummary());
    }
    /**
     * Sets the assignments property value. The list of assignments for this eBook.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<ManagedEBookAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the eBook file was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Description.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceStates property value. The list of installation states for this eBook.
     * @param value Value to set for the deviceStates property.
     * @return a void
     */
    public void setDeviceStates(@javax.annotation.Nullable final java.util.List<DeviceInstallState> value) {
        this._deviceStates = value;
    }
    /**
     * Sets the displayName property value. Name of the eBook.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the informationUrl property value. The more information Url.
     * @param value Value to set for the informationUrl property.
     * @return a void
     */
    public void setInformationUrl(@javax.annotation.Nullable final String value) {
        this._informationUrl = value;
    }
    /**
     * Sets the installSummary property value. Mobile App Install Summary.
     * @param value Value to set for the installSummary property.
     * @return a void
     */
    public void setInstallSummary(@javax.annotation.Nullable final EBookInstallSummary value) {
        this._installSummary = value;
    }
    /**
     * Sets the largeCover property value. Book cover.
     * @param value Value to set for the largeCover property.
     * @return a void
     */
    public void setLargeCover(@javax.annotation.Nullable final MimeContent value) {
        this._largeCover = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the eBook was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the privacyInformationUrl property value. The privacy statement Url.
     * @param value Value to set for the privacyInformationUrl property.
     * @return a void
     */
    public void setPrivacyInformationUrl(@javax.annotation.Nullable final String value) {
        this._privacyInformationUrl = value;
    }
    /**
     * Sets the publishedDateTime property value. The date and time when the eBook was published.
     * @param value Value to set for the publishedDateTime property.
     * @return a void
     */
    public void setPublishedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._publishedDateTime = value;
    }
    /**
     * Sets the publisher property value. Publisher.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
    /**
     * Sets the userStateSummary property value. The list of installation states for this eBook.
     * @param value Value to set for the userStateSummary property.
     * @return a void
     */
    public void setUserStateSummary(@javax.annotation.Nullable final java.util.List<UserInstallStateSummary> value) {
        this._userStateSummary = value;
    }
}
