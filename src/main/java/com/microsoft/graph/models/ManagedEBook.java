package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An abstract class containing the base properties for Managed eBook.
 */
public class ManagedEBook extends Entity implements Parsable {
    /**
     * The list of assignments for this eBook.
     */
    private java.util.List<ManagedEBookAssignment> assignments;
    /**
     * The date and time when the eBook file was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Description.
     */
    private String description;
    /**
     * The list of installation states for this eBook.
     */
    private java.util.List<DeviceInstallState> deviceStates;
    /**
     * Name of the eBook.
     */
    private String displayName;
    /**
     * The more information Url.
     */
    private String informationUrl;
    /**
     * Mobile App Install Summary.
     */
    private EBookInstallSummary installSummary;
    /**
     * Book cover.
     */
    private MimeContent largeCover;
    /**
     * The date and time when the eBook was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The privacy statement Url.
     */
    private String privacyInformationUrl;
    /**
     * The date and time when the eBook was published.
     */
    private OffsetDateTime publishedDateTime;
    /**
     * Publisher.
     */
    private String publisher;
    /**
     * The list of installation states for this eBook.
     */
    private java.util.List<UserInstallStateSummary> userStateSummary;
    /**
     * Instantiates a new managedEBook and sets the default values.
     */
    public ManagedEBook() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedEBook
     */
    @jakarta.annotation.Nonnull
    public static ManagedEBook createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.iosVppEBook": return new IosVppEBook();
            }
        }
        return new ManagedEBook();
    }
    /**
     * Gets the assignments property value. The list of assignments for this eBook.
     * @return a managedEBookAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedEBookAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the eBook file was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Description.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the deviceStates property value. The list of installation states for this eBook.
     * @return a deviceInstallState
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceInstallState> getDeviceStates() {
        return this.deviceStates;
    }
    /**
     * Gets the displayName property value. Name of the eBook.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(ManagedEBookAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceStates", (n) -> { this.setDeviceStates(n.getCollectionOfObjectValues(DeviceInstallState::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("informationUrl", (n) -> { this.setInformationUrl(n.getStringValue()); });
        deserializerMap.put("installSummary", (n) -> { this.setInstallSummary(n.getObjectValue(EBookInstallSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("largeCover", (n) -> { this.setLargeCover(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("privacyInformationUrl", (n) -> { this.setPrivacyInformationUrl(n.getStringValue()); });
        deserializerMap.put("publishedDateTime", (n) -> { this.setPublishedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("userStateSummary", (n) -> { this.setUserStateSummary(n.getCollectionOfObjectValues(UserInstallStateSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the informationUrl property value. The more information Url.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInformationUrl() {
        return this.informationUrl;
    }
    /**
     * Gets the installSummary property value. Mobile App Install Summary.
     * @return a eBookInstallSummary
     */
    @jakarta.annotation.Nullable
    public EBookInstallSummary getInstallSummary() {
        return this.installSummary;
    }
    /**
     * Gets the largeCover property value. Book cover.
     * @return a mimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getLargeCover() {
        return this.largeCover;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the eBook was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the privacyInformationUrl property value. The privacy statement Url.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrivacyInformationUrl() {
        return this.privacyInformationUrl;
    }
    /**
     * Gets the publishedDateTime property value. The date and time when the eBook was published.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this.publishedDateTime;
    }
    /**
     * Gets the publisher property value. Publisher.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * Gets the userStateSummary property value. The list of installation states for this eBook.
     * @return a userInstallStateSummary
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserInstallStateSummary> getUserStateSummary() {
        return this.userStateSummary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<ManagedEBookAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the eBook file was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Description.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the deviceStates property value. The list of installation states for this eBook.
     * @param value Value to set for the deviceStates property.
     */
    public void setDeviceStates(@jakarta.annotation.Nullable final java.util.List<DeviceInstallState> value) {
        this.deviceStates = value;
    }
    /**
     * Sets the displayName property value. Name of the eBook.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the informationUrl property value. The more information Url.
     * @param value Value to set for the informationUrl property.
     */
    public void setInformationUrl(@jakarta.annotation.Nullable final String value) {
        this.informationUrl = value;
    }
    /**
     * Sets the installSummary property value. Mobile App Install Summary.
     * @param value Value to set for the installSummary property.
     */
    public void setInstallSummary(@jakarta.annotation.Nullable final EBookInstallSummary value) {
        this.installSummary = value;
    }
    /**
     * Sets the largeCover property value. Book cover.
     * @param value Value to set for the largeCover property.
     */
    public void setLargeCover(@jakarta.annotation.Nullable final MimeContent value) {
        this.largeCover = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the eBook was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the privacyInformationUrl property value. The privacy statement Url.
     * @param value Value to set for the privacyInformationUrl property.
     */
    public void setPrivacyInformationUrl(@jakarta.annotation.Nullable final String value) {
        this.privacyInformationUrl = value;
    }
    /**
     * Sets the publishedDateTime property value. The date and time when the eBook was published.
     * @param value Value to set for the publishedDateTime property.
     */
    public void setPublishedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.publishedDateTime = value;
    }
    /**
     * Sets the publisher property value. Publisher.
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.publisher = value;
    }
    /**
     * Sets the userStateSummary property value. The list of installation states for this eBook.
     * @param value Value to set for the userStateSummary property.
     */
    public void setUserStateSummary(@jakarta.annotation.Nullable final java.util.List<UserInstallStateSummary> value) {
        this.userStateSummary = value;
    }
}
