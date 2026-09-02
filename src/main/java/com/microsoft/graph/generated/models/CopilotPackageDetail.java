package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotPackageDetail extends CopilotPackage implements Parsable {
    /**
     * Instantiates a new {@link CopilotPackageDetail} and sets the default values.
     */
    public CopilotPackageDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotPackageDetail}
     */
    @jakarta.annotation.Nonnull
    public static CopilotPackageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotPackageDetail();
    }
    /**
     * Gets the acquireUsersAndGroups property value. The acquireUsersAndGroups property
     * @return a {@link java.util.List<PackageAccessEntity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PackageAccessEntity> getAcquireUsersAndGroups() {
        return this.backingStore.get("acquireUsersAndGroups");
    }
    /**
     * Gets the activeUsers property value. The number of distinct users who actively used the package during the reporting period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getActiveUsers() {
        return this.backingStore.get("activeUsers");
    }
    /**
     * Gets the allowedUsersAndGroups property value. The allowedUsersAndGroups property
     * @return a {@link java.util.List<PackageAccessEntity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PackageAccessEntity> getAllowedUsersAndGroups() {
        return this.backingStore.get("allowedUsersAndGroups");
    }
    /**
     * Gets the categories property value. The categories property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * Gets the elementDetails property value. The elementDetails property
     * @return a {@link java.util.List<PackageElementDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PackageElementDetail> getElementDetails() {
        return this.backingStore.get("elementDetails");
    }
    /**
     * Gets the exceptionRate property value. The fraction of sessions that resulted in an exception, expressed as a value between 0 and 1.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getExceptionRate() {
        return this.backingStore.get("exceptionRate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acquireUsersAndGroups", (n) -> { this.setAcquireUsersAndGroups(n.getCollectionOfObjectValues(PackageAccessEntity::createFromDiscriminatorValue)); });
        deserializerMap.put("activeUsers", (n) -> { this.setActiveUsers(n.getIntegerValue()); });
        deserializerMap.put("allowedUsersAndGroups", (n) -> { this.setAllowedUsersAndGroups(n.getCollectionOfObjectValues(PackageAccessEntity::createFromDiscriminatorValue)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("elementDetails", (n) -> { this.setElementDetails(n.getCollectionOfObjectValues(PackageElementDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("exceptionRate", (n) -> { this.setExceptionRate(n.getDoubleValue()); });
        deserializerMap.put("lastUsedDateTime", (n) -> { this.setLastUsedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("longDescription", (n) -> { this.setLongDescription(n.getStringValue()); });
        deserializerMap.put("sensitivity", (n) -> { this.setSensitivity(n.getStringValue()); });
        deserializerMap.put("sharedWithUsersAndGroups", (n) -> { this.setSharedWithUsersAndGroups(n.getCollectionOfObjectValues(PackageAccessEntity::createFromDiscriminatorValue)); });
        deserializerMap.put("totalRunTimeInHours", (n) -> { this.setTotalRunTimeInHours(n.getDoubleValue()); });
        deserializerMap.put("totalSessions", (n) -> { this.setTotalSessions(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUsedDateTime property value. The date and time when the package was last used, in ISO 8601 format and UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUsedDateTime() {
        return this.backingStore.get("lastUsedDateTime");
    }
    /**
     * Gets the longDescription property value. The longDescription property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLongDescription() {
        return this.backingStore.get("longDescription");
    }
    /**
     * Gets the sensitivity property value. The sensitivity property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSensitivity() {
        return this.backingStore.get("sensitivity");
    }
    /**
     * Gets the sharedWithUsersAndGroups property value. The sharedWithUsersAndGroups property
     * @return a {@link java.util.List<PackageAccessEntity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PackageAccessEntity> getSharedWithUsersAndGroups() {
        return this.backingStore.get("sharedWithUsersAndGroups");
    }
    /**
     * Gets the totalRunTimeInHours property value. Total hours worked by the agent.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTotalRunTimeInHours() {
        return this.backingStore.get("totalRunTimeInHours");
    }
    /**
     * Gets the totalSessions property value. The total number of sessions served by the package during the reporting period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalSessions() {
        return this.backingStore.get("totalSessions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acquireUsersAndGroups", this.getAcquireUsersAndGroups());
        writer.writeIntegerValue("activeUsers", this.getActiveUsers());
        writer.writeCollectionOfObjectValues("allowedUsersAndGroups", this.getAllowedUsersAndGroups());
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeCollectionOfObjectValues("elementDetails", this.getElementDetails());
        writer.writeDoubleValue("exceptionRate", this.getExceptionRate());
        writer.writeOffsetDateTimeValue("lastUsedDateTime", this.getLastUsedDateTime());
        writer.writeStringValue("longDescription", this.getLongDescription());
        writer.writeStringValue("sensitivity", this.getSensitivity());
        writer.writeCollectionOfObjectValues("sharedWithUsersAndGroups", this.getSharedWithUsersAndGroups());
        writer.writeDoubleValue("totalRunTimeInHours", this.getTotalRunTimeInHours());
        writer.writeIntegerValue("totalSessions", this.getTotalSessions());
    }
    /**
     * Sets the acquireUsersAndGroups property value. The acquireUsersAndGroups property
     * @param value Value to set for the acquireUsersAndGroups property.
     */
    public void setAcquireUsersAndGroups(@jakarta.annotation.Nullable final java.util.List<PackageAccessEntity> value) {
        this.backingStore.set("acquireUsersAndGroups", value);
    }
    /**
     * Sets the activeUsers property value. The number of distinct users who actively used the package during the reporting period.
     * @param value Value to set for the activeUsers property.
     */
    public void setActiveUsers(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("activeUsers", value);
    }
    /**
     * Sets the allowedUsersAndGroups property value. The allowedUsersAndGroups property
     * @param value Value to set for the allowedUsersAndGroups property.
     */
    public void setAllowedUsersAndGroups(@jakarta.annotation.Nullable final java.util.List<PackageAccessEntity> value) {
        this.backingStore.set("allowedUsersAndGroups", value);
    }
    /**
     * Sets the categories property value. The categories property
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the elementDetails property value. The elementDetails property
     * @param value Value to set for the elementDetails property.
     */
    public void setElementDetails(@jakarta.annotation.Nullable final java.util.List<PackageElementDetail> value) {
        this.backingStore.set("elementDetails", value);
    }
    /**
     * Sets the exceptionRate property value. The fraction of sessions that resulted in an exception, expressed as a value between 0 and 1.
     * @param value Value to set for the exceptionRate property.
     */
    public void setExceptionRate(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("exceptionRate", value);
    }
    /**
     * Sets the lastUsedDateTime property value. The date and time when the package was last used, in ISO 8601 format and UTC.
     * @param value Value to set for the lastUsedDateTime property.
     */
    public void setLastUsedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUsedDateTime", value);
    }
    /**
     * Sets the longDescription property value. The longDescription property
     * @param value Value to set for the longDescription property.
     */
    public void setLongDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("longDescription", value);
    }
    /**
     * Sets the sensitivity property value. The sensitivity property
     * @param value Value to set for the sensitivity property.
     */
    public void setSensitivity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sensitivity", value);
    }
    /**
     * Sets the sharedWithUsersAndGroups property value. The sharedWithUsersAndGroups property
     * @param value Value to set for the sharedWithUsersAndGroups property.
     */
    public void setSharedWithUsersAndGroups(@jakarta.annotation.Nullable final java.util.List<PackageAccessEntity> value) {
        this.backingStore.set("sharedWithUsersAndGroups", value);
    }
    /**
     * Sets the totalRunTimeInHours property value. Total hours worked by the agent.
     * @param value Value to set for the totalRunTimeInHours property.
     */
    public void setTotalRunTimeInHours(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("totalRunTimeInHours", value);
    }
    /**
     * Sets the totalSessions property value. The total number of sessions served by the package during the reporting period.
     * @param value Value to set for the totalSessions property.
     */
    public void setTotalSessions(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalSessions", value);
    }
}
