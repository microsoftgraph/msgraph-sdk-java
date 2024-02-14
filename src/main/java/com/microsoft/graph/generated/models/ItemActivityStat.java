package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemActivityStat extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ItemActivityStat} and sets the default values.
     */
    public ItemActivityStat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemActivityStat}
     */
    @jakarta.annotation.Nonnull
    public static ItemActivityStat createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActivityStat();
    }
    /**
     * Gets the access property value. Statistics about the access actions in this interval. Read-only.
     * @return a {@link ItemActionStat}
     */
    @jakarta.annotation.Nullable
    public ItemActionStat getAccess() {
        return this.backingStore.get("access");
    }
    /**
     * Gets the activities property value. Exposes the itemActivities represented in this itemActivityStat resource.
     * @return a {@link java.util.List<ItemActivity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemActivity> getActivities() {
        return this.backingStore.get("activities");
    }
    /**
     * Gets the create property value. Statistics about the create actions in this interval. Read-only.
     * @return a {@link ItemActionStat}
     */
    @jakarta.annotation.Nullable
    public ItemActionStat getCreate() {
        return this.backingStore.get("create");
    }
    /**
     * Gets the delete property value. Statistics about the delete actions in this interval. Read-only.
     * @return a {@link ItemActionStat}
     */
    @jakarta.annotation.Nullable
    public ItemActionStat getDelete() {
        return this.backingStore.get("delete");
    }
    /**
     * Gets the edit property value. Statistics about the edit actions in this interval. Read-only.
     * @return a {@link ItemActionStat}
     */
    @jakarta.annotation.Nullable
    public ItemActionStat getEdit() {
        return this.backingStore.get("edit");
    }
    /**
     * Gets the endDateTime property value. When the interval ends. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("access", (n) -> { this.setAccess(n.getObjectValue(ItemActionStat::createFromDiscriminatorValue)); });
        deserializerMap.put("activities", (n) -> { this.setActivities(n.getCollectionOfObjectValues(ItemActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("create", (n) -> { this.setCreate(n.getObjectValue(ItemActionStat::createFromDiscriminatorValue)); });
        deserializerMap.put("delete", (n) -> { this.setDelete(n.getObjectValue(ItemActionStat::createFromDiscriminatorValue)); });
        deserializerMap.put("edit", (n) -> { this.setEdit(n.getObjectValue(ItemActionStat::createFromDiscriminatorValue)); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("incompleteData", (n) -> { this.setIncompleteData(n.getObjectValue(IncompleteData::createFromDiscriminatorValue)); });
        deserializerMap.put("isTrending", (n) -> { this.setIsTrending(n.getBooleanValue()); });
        deserializerMap.put("move", (n) -> { this.setMove(n.getObjectValue(ItemActionStat::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incompleteData property value. Indicates that the statistics in this interval are based on incomplete data. Read-only.
     * @return a {@link IncompleteData}
     */
    @jakarta.annotation.Nullable
    public IncompleteData getIncompleteData() {
        return this.backingStore.get("incompleteData");
    }
    /**
     * Gets the isTrending property value. Indicates whether the item is 'trending.' Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTrending() {
        return this.backingStore.get("isTrending");
    }
    /**
     * Gets the move property value. Statistics about the move actions in this interval. Read-only.
     * @return a {@link ItemActionStat}
     */
    @jakarta.annotation.Nullable
    public ItemActionStat getMove() {
        return this.backingStore.get("move");
    }
    /**
     * Gets the startDateTime property value. When the interval starts. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("access", this.getAccess());
        writer.writeCollectionOfObjectValues("activities", this.getActivities());
        writer.writeObjectValue("create", this.getCreate());
        writer.writeObjectValue("delete", this.getDelete());
        writer.writeObjectValue("edit", this.getEdit());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeObjectValue("incompleteData", this.getIncompleteData());
        writer.writeBooleanValue("isTrending", this.getIsTrending());
        writer.writeObjectValue("move", this.getMove());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
    }
    /**
     * Sets the access property value. Statistics about the access actions in this interval. Read-only.
     * @param value Value to set for the access property.
     */
    public void setAccess(@jakarta.annotation.Nullable final ItemActionStat value) {
        this.backingStore.set("access", value);
    }
    /**
     * Sets the activities property value. Exposes the itemActivities represented in this itemActivityStat resource.
     * @param value Value to set for the activities property.
     */
    public void setActivities(@jakarta.annotation.Nullable final java.util.List<ItemActivity> value) {
        this.backingStore.set("activities", value);
    }
    /**
     * Sets the create property value. Statistics about the create actions in this interval. Read-only.
     * @param value Value to set for the create property.
     */
    public void setCreate(@jakarta.annotation.Nullable final ItemActionStat value) {
        this.backingStore.set("create", value);
    }
    /**
     * Sets the delete property value. Statistics about the delete actions in this interval. Read-only.
     * @param value Value to set for the delete property.
     */
    public void setDelete(@jakarta.annotation.Nullable final ItemActionStat value) {
        this.backingStore.set("delete", value);
    }
    /**
     * Sets the edit property value. Statistics about the edit actions in this interval. Read-only.
     * @param value Value to set for the edit property.
     */
    public void setEdit(@jakarta.annotation.Nullable final ItemActionStat value) {
        this.backingStore.set("edit", value);
    }
    /**
     * Sets the endDateTime property value. When the interval ends. Read-only.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the incompleteData property value. Indicates that the statistics in this interval are based on incomplete data. Read-only.
     * @param value Value to set for the incompleteData property.
     */
    public void setIncompleteData(@jakarta.annotation.Nullable final IncompleteData value) {
        this.backingStore.set("incompleteData", value);
    }
    /**
     * Sets the isTrending property value. Indicates whether the item is 'trending.' Read-only.
     * @param value Value to set for the isTrending property.
     */
    public void setIsTrending(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTrending", value);
    }
    /**
     * Sets the move property value. Statistics about the move actions in this interval. Read-only.
     * @param value Value to set for the move property.
     */
    public void setMove(@jakarta.annotation.Nullable final ItemActionStat value) {
        this.backingStore.set("move", value);
    }
    /**
     * Sets the startDateTime property value. When the interval starts. Read-only.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
}
