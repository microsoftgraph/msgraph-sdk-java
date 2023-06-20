package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An abstract class containing the base properties for Intune mobile apps.
 */
public class MobileApp extends Entity implements Parsable {
    /** The list of group assignments for this mobile app. */
    private java.util.List<MobileAppAssignment> assignments;
    /** The list of categories for this app. */
    private java.util.List<MobileAppCategory> categories;
    /** The date and time the app was created. */
    private OffsetDateTime createdDateTime;
    /** The description of the app. */
    private String description;
    /** The developer of the app. */
    private String developer;
    /** The admin provided or imported title of the app. */
    private String displayName;
    /** The more information Url. */
    private String informationUrl;
    /** The value indicating whether the app is marked as featured by the admin. */
    private Boolean isFeatured;
    /** The large icon, to be displayed in the app details and used for upload of the icon. */
    private MimeContent largeIcon;
    /** The date and time the app was last modified. */
    private OffsetDateTime lastModifiedDateTime;
    /** Notes for the app. */
    private String notes;
    /** The owner of the app. */
    private String owner;
    /** The privacy statement Url. */
    private String privacyInformationUrl;
    /** The publisher of the app. */
    private String publisher;
    /** Indicates the publishing state of an app. */
    private MobileAppPublishingState publishingState;
    /**
     * Instantiates a new mobileApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileApp
     */
    @javax.annotation.Nonnull
    public static MobileApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidLobApp": return new AndroidLobApp();
                case "#microsoft.graph.androidStoreApp": return new AndroidStoreApp();
                case "#microsoft.graph.iosiPadOSWebClip": return new IosiPadOSWebClip();
                case "#microsoft.graph.iosLobApp": return new IosLobApp();
                case "#microsoft.graph.iosStoreApp": return new IosStoreApp();
                case "#microsoft.graph.iosVppApp": return new IosVppApp();
                case "#microsoft.graph.macOSLobApp": return new MacOSLobApp();
                case "#microsoft.graph.macOSMicrosoftEdgeApp": return new MacOSMicrosoftEdgeApp();
                case "#microsoft.graph.macOSOfficeSuiteApp": return new MacOSOfficeSuiteApp();
                case "#microsoft.graph.managedAndroidLobApp": return new ManagedAndroidLobApp();
                case "#microsoft.graph.managedAndroidStoreApp": return new ManagedAndroidStoreApp();
                case "#microsoft.graph.managedApp": return new ManagedApp();
                case "#microsoft.graph.managedIOSLobApp": return new ManagedIOSLobApp();
                case "#microsoft.graph.managedIOSStoreApp": return new ManagedIOSStoreApp();
                case "#microsoft.graph.managedMobileLobApp": return new ManagedMobileLobApp();
                case "#microsoft.graph.microsoftStoreForBusinessApp": return new MicrosoftStoreForBusinessApp();
                case "#microsoft.graph.mobileLobApp": return new MobileLobApp();
                case "#microsoft.graph.webApp": return new WebApp();
                case "#microsoft.graph.win32LobApp": return new Win32LobApp();
                case "#microsoft.graph.windowsAppX": return new WindowsAppX();
                case "#microsoft.graph.windowsMicrosoftEdgeApp": return new WindowsMicrosoftEdgeApp();
                case "#microsoft.graph.windowsMobileMSI": return new WindowsMobileMSI();
                case "#microsoft.graph.windowsUniversalAppX": return new WindowsUniversalAppX();
                case "#microsoft.graph.windowsWebApp": return new WindowsWebApp();
            }
        }
        return new MobileApp();
    }
    /**
     * Gets the assignments property value. The list of group assignments for this mobile app.
     * @return a mobileAppAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the categories property value. The list of categories for this app.
     * @return a mobileAppCategory
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppCategory> getCategories() {
        return this.categories;
    }
    /**
     * Gets the createdDateTime property value. The date and time the app was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the developer property value. The developer of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeveloper() {
        return this.developer;
    }
    /**
     * Gets the displayName property value. The admin provided or imported title of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(MobileAppAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfObjectValues(MobileAppCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("developer", (n) -> { this.setDeveloper(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("informationUrl", (n) -> { this.setInformationUrl(n.getStringValue()); });
        deserializerMap.put("isFeatured", (n) -> { this.setIsFeatured(n.getBooleanValue()); });
        deserializerMap.put("largeIcon", (n) -> { this.setLargeIcon(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("privacyInformationUrl", (n) -> { this.setPrivacyInformationUrl(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("publishingState", (n) -> { this.setPublishingState(n.getEnumValue(MobileAppPublishingState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the informationUrl property value. The more information Url.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInformationUrl() {
        return this.informationUrl;
    }
    /**
     * Gets the isFeatured property value. The value indicating whether the app is marked as featured by the admin.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFeatured() {
        return this.isFeatured;
    }
    /**
     * Gets the largeIcon property value. The large icon, to be displayed in the app details and used for upload of the icon.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getLargeIcon() {
        return this.largeIcon;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the app was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the notes property value. Notes for the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the owner property value. The owner of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwner() {
        return this.owner;
    }
    /**
     * Gets the privacyInformationUrl property value. The privacy statement Url.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivacyInformationUrl() {
        return this.privacyInformationUrl;
    }
    /**
     * Gets the publisher property value. The publisher of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * Gets the publishingState property value. Indicates the publishing state of an app.
     * @return a MobileAppPublishingState
     */
    @javax.annotation.Nullable
    public MobileAppPublishingState getPublishingState() {
        return this.publishingState;
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
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("developer", this.getDeveloper());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("informationUrl", this.getInformationUrl());
        writer.writeBooleanValue("isFeatured", this.getIsFeatured());
        writer.writeObjectValue("largeIcon", this.getLargeIcon());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeStringValue("privacyInformationUrl", this.getPrivacyInformationUrl());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeEnumValue("publishingState", this.getPublishingState());
    }
    /**
     * Sets the assignments property value. The list of group assignments for this mobile app.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<MobileAppAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the categories property value. The list of categories for this app.
     * @param value Value to set for the categories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategories(@javax.annotation.Nullable final java.util.List<MobileAppCategory> value) {
        this.categories = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the app was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the app.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the developer property value. The developer of the app.
     * @param value Value to set for the developer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeveloper(@javax.annotation.Nullable final String value) {
        this.developer = value;
    }
    /**
     * Sets the displayName property value. The admin provided or imported title of the app.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the informationUrl property value. The more information Url.
     * @param value Value to set for the informationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInformationUrl(@javax.annotation.Nullable final String value) {
        this.informationUrl = value;
    }
    /**
     * Sets the isFeatured property value. The value indicating whether the app is marked as featured by the admin.
     * @param value Value to set for the isFeatured property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsFeatured(@javax.annotation.Nullable final Boolean value) {
        this.isFeatured = value;
    }
    /**
     * Sets the largeIcon property value. The large icon, to be displayed in the app details and used for upload of the icon.
     * @param value Value to set for the largeIcon property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLargeIcon(@javax.annotation.Nullable final MimeContent value) {
        this.largeIcon = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the app was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the notes property value. Notes for the app.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the owner property value. The owner of the app.
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final String value) {
        this.owner = value;
    }
    /**
     * Sets the privacyInformationUrl property value. The privacy statement Url.
     * @param value Value to set for the privacyInformationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyInformationUrl(@javax.annotation.Nullable final String value) {
        this.privacyInformationUrl = value;
    }
    /**
     * Sets the publisher property value. The publisher of the app.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this.publisher = value;
    }
    /**
     * Sets the publishingState property value. Indicates the publishing state of an app.
     * @param value Value to set for the publishingState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishingState(@javax.annotation.Nullable final MobileAppPublishingState value) {
        this.publishingState = value;
    }
}
