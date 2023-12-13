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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedEBook extends Entity implements Parsable {
    /**
     * Instantiates a new ManagedEBook and sets the default values.
     */
    public ManagedEBook() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedEBook
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
     * @return a java.util.List<ManagedEBookAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedEBookAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the eBook file was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Description.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the deviceStates property value. The list of installation states for this eBook.
     * @return a java.util.List<DeviceInstallState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceInstallState> getDeviceStates() {
        return this.backingStore.get("deviceStates");
    }
    /**
     * Gets the displayName property value. Name of the eBook.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInformationUrl() {
        return this.backingStore.get("informationUrl");
    }
    /**
     * Gets the installSummary property value. Mobile App Install Summary.
     * @return a EBookInstallSummary
     */
    @jakarta.annotation.Nullable
    public EBookInstallSummary getInstallSummary() {
        return this.backingStore.get("installSummary");
    }
    /**
     * Gets the largeCover property value. Book cover.
     * @return a MimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getLargeCover() {
        return this.backingStore.get("largeCover");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the eBook was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the privacyInformationUrl property value. The privacy statement Url.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrivacyInformationUrl() {
        return this.backingStore.get("privacyInformationUrl");
    }
    /**
     * Gets the publishedDateTime property value. The date and time when the eBook was published.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this.backingStore.get("publishedDateTime");
    }
    /**
     * Gets the publisher property value. Publisher.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.backingStore.get("publisher");
    }
    /**
     * Gets the userStateSummary property value. The list of installation states for this eBook.
     * @return a java.util.List<UserInstallStateSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserInstallStateSummary> getUserStateSummary() {
        return this.backingStore.get("userStateSummary");
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
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the eBook file was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Description.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the deviceStates property value. The list of installation states for this eBook.
     * @param value Value to set for the deviceStates property.
     */
    public void setDeviceStates(@jakarta.annotation.Nullable final java.util.List<DeviceInstallState> value) {
        this.backingStore.set("deviceStates", value);
    }
    /**
     * Sets the displayName property value. Name of the eBook.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the informationUrl property value. The more information Url.
     * @param value Value to set for the informationUrl property.
     */
    public void setInformationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("informationUrl", value);
    }
    /**
     * Sets the installSummary property value. Mobile App Install Summary.
     * @param value Value to set for the installSummary property.
     */
    public void setInstallSummary(@jakarta.annotation.Nullable final EBookInstallSummary value) {
        this.backingStore.set("installSummary", value);
    }
    /**
     * Sets the largeCover property value. Book cover.
     * @param value Value to set for the largeCover property.
     */
    public void setLargeCover(@jakarta.annotation.Nullable final MimeContent value) {
        this.backingStore.set("largeCover", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the eBook was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the privacyInformationUrl property value. The privacy statement Url.
     * @param value Value to set for the privacyInformationUrl property.
     */
    public void setPrivacyInformationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("privacyInformationUrl", value);
    }
    /**
     * Sets the publishedDateTime property value. The date and time when the eBook was published.
     * @param value Value to set for the publishedDateTime property.
     */
    public void setPublishedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("publishedDateTime", value);
    }
    /**
     * Sets the publisher property value. Publisher.
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisher", value);
    }
    /**
     * Sets the userStateSummary property value. The list of installation states for this eBook.
     * @param value Value to set for the userStateSummary property.
     */
    public void setUserStateSummary(@jakarta.annotation.Nullable final java.util.List<UserInstallStateSummary> value) {
        this.backingStore.set("userStateSummary", value);
    }
}
