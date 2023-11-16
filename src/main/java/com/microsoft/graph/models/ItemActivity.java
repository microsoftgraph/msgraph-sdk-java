package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemActivity extends Entity implements Parsable {
    /**
     * Instantiates a new ItemActivity and sets the default values.
     */
    public ItemActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ItemActivity
     */
    @jakarta.annotation.Nonnull
    public static ItemActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActivity();
    }
    /**
     * Gets the access property value. An item was accessed.
     * @return a AccessAction
     */
    @jakarta.annotation.Nullable
    public AccessAction getAccess() {
        return this.BackingStore.get("access");
    }
    /**
     * Gets the activityDateTime property value. Details about when the activity took place. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.BackingStore.get("activityDateTime");
    }
    /**
     * Gets the actor property value. Identity of who performed the action. Read-only.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getActor() {
        return this.BackingStore.get("actor");
    }
    /**
     * Gets the driveItem property value. Exposes the driveItem that was the target of this activity.
     * @return a DriveItem
     */
    @jakarta.annotation.Nullable
    public DriveItem getDriveItem() {
        return this.BackingStore.get("driveItem");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("access", (n) -> { this.setAccess(n.getObjectValue(AccessAction::createFromDiscriminatorValue)); });
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("actor", (n) -> { this.setActor(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("driveItem", (n) -> { this.setDriveItem(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("access", this.getAccess());
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeObjectValue("actor", this.getActor());
        writer.writeObjectValue("driveItem", this.getDriveItem());
    }
    /**
     * Sets the access property value. An item was accessed.
     * @param value Value to set for the access property.
     */
    public void setAccess(@jakarta.annotation.Nullable final AccessAction value) {
        this.BackingStore.set("access", value);
    }
    /**
     * Sets the activityDateTime property value. Details about when the activity took place. Read-only.
     * @param value Value to set for the activityDateTime property.
     */
    public void setActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("activityDateTime", value);
    }
    /**
     * Sets the actor property value. Identity of who performed the action. Read-only.
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final IdentitySet value) {
        this.BackingStore.set("actor", value);
    }
    /**
     * Sets the driveItem property value. Exposes the driveItem that was the target of this activity.
     * @param value Value to set for the driveItem property.
     */
    public void setDriveItem(@jakarta.annotation.Nullable final DriveItem value) {
        this.BackingStore.set("driveItem", value);
    }
}
