package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcUserSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcUserSetting} and sets the default values.
     */
    public CloudPcUserSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcUserSetting}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcUserSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcUserSetting();
    }
    /**
     * Gets the assignments property value. The assignments property
     * @return a {@link java.util.List<CloudPcUserSettingAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcUserSettingAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(CloudPcUserSettingAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("localAdminEnabled", (n) -> { this.setLocalAdminEnabled(n.getBooleanValue()); });
        deserializerMap.put("resetEnabled", (n) -> { this.setResetEnabled(n.getBooleanValue()); });
        deserializerMap.put("restorePointSetting", (n) -> { this.setRestorePointSetting(n.getObjectValue(CloudPcRestorePointSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the localAdminEnabled property value. The localAdminEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalAdminEnabled() {
        return this.backingStore.get("localAdminEnabled");
    }
    /**
     * Gets the resetEnabled property value. The resetEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getResetEnabled() {
        return this.backingStore.get("resetEnabled");
    }
    /**
     * Gets the restorePointSetting property value. The restorePointSetting property
     * @return a {@link CloudPcRestorePointSetting}
     */
    @jakarta.annotation.Nullable
    public CloudPcRestorePointSetting getRestorePointSetting() {
        return this.backingStore.get("restorePointSetting");
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeBooleanValue("localAdminEnabled", this.getLocalAdminEnabled());
        writer.writeBooleanValue("resetEnabled", this.getResetEnabled());
        writer.writeObjectValue("restorePointSetting", this.getRestorePointSetting());
    }
    /**
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<CloudPcUserSettingAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the localAdminEnabled property value. The localAdminEnabled property
     * @param value Value to set for the localAdminEnabled property.
     */
    public void setLocalAdminEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localAdminEnabled", value);
    }
    /**
     * Sets the resetEnabled property value. The resetEnabled property
     * @param value Value to set for the resetEnabled property.
     */
    public void setResetEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("resetEnabled", value);
    }
    /**
     * Sets the restorePointSetting property value. The restorePointSetting property
     * @param value Value to set for the restorePointSetting property.
     */
    public void setRestorePointSetting(@jakarta.annotation.Nullable final CloudPcRestorePointSetting value) {
        this.backingStore.set("restorePointSetting", value);
    }
}
