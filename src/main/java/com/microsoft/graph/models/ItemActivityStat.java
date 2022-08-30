package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemActivityStat extends Entity implements Parsable {
    /** Statistics about the access actions in this interval. Read-only. */
    private ItemActionStat _access;
    /** Exposes the itemActivities represented in this itemActivityStat resource. */
    private java.util.List<ItemActivity> _activities;
    /** Statistics about the create actions in this interval. Read-only. */
    private ItemActionStat _create;
    /** Statistics about the delete actions in this interval. Read-only. */
    private ItemActionStat _delete;
    /** Statistics about the edit actions in this interval. Read-only. */
    private ItemActionStat _edit;
    /** When the interval ends. Read-only. */
    private OffsetDateTime _endDateTime;
    /** Indicates that the statistics in this interval are based on incomplete data. Read-only. */
    private IncompleteData _incompleteData;
    /** Indicates whether the item is 'trending.' Read-only. */
    private Boolean _isTrending;
    /** Statistics about the move actions in this interval. Read-only. */
    private ItemActionStat _move;
    /** When the interval starts. Read-only. */
    private OffsetDateTime _startDateTime;
    /**
     * Instantiates a new itemActivityStat and sets the default values.
     * @return a void
     */
    public ItemActivityStat() {
        super();
        this.setOdataType("#microsoft.graph.itemActivityStat");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemActivityStat
     */
    @javax.annotation.Nonnull
    public static ItemActivityStat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActivityStat();
    }
    /**
     * Gets the access property value. Statistics about the access actions in this interval. Read-only.
     * @return a itemActionStat
     */
    @javax.annotation.Nullable
    public ItemActionStat getAccess() {
        return this._access;
    }
    /**
     * Gets the activities property value. Exposes the itemActivities represented in this itemActivityStat resource.
     * @return a itemActivity
     */
    @javax.annotation.Nullable
    public java.util.List<ItemActivity> getActivities() {
        return this._activities;
    }
    /**
     * Gets the create property value. Statistics about the create actions in this interval. Read-only.
     * @return a itemActionStat
     */
    @javax.annotation.Nullable
    public ItemActionStat getCreate() {
        return this._create;
    }
    /**
     * Gets the delete property value. Statistics about the delete actions in this interval. Read-only.
     * @return a itemActionStat
     */
    @javax.annotation.Nullable
    public ItemActionStat getDelete() {
        return this._delete;
    }
    /**
     * Gets the edit property value. Statistics about the edit actions in this interval. Read-only.
     * @return a itemActionStat
     */
    @javax.annotation.Nullable
    public ItemActionStat getEdit() {
        return this._edit;
    }
    /**
     * Gets the endDateTime property value. When the interval ends. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ItemActivityStat currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("access", (n) -> { currentObject.setAccess(n.getObjectValue(ItemActionStat::createFromDiscriminatorValue)); });
            this.put("activities", (n) -> { currentObject.setActivities(n.getCollectionOfObjectValues(ItemActivity::createFromDiscriminatorValue)); });
            this.put("create", (n) -> { currentObject.setCreate(n.getObjectValue(ItemActionStat::createFromDiscriminatorValue)); });
            this.put("delete", (n) -> { currentObject.setDelete(n.getObjectValue(ItemActionStat::createFromDiscriminatorValue)); });
            this.put("edit", (n) -> { currentObject.setEdit(n.getObjectValue(ItemActionStat::createFromDiscriminatorValue)); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("incompleteData", (n) -> { currentObject.setIncompleteData(n.getObjectValue(IncompleteData::createFromDiscriminatorValue)); });
            this.put("isTrending", (n) -> { currentObject.setIsTrending(n.getBooleanValue()); });
            this.put("move", (n) -> { currentObject.setMove(n.getObjectValue(ItemActionStat::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the incompleteData property value. Indicates that the statistics in this interval are based on incomplete data. Read-only.
     * @return a incompleteData
     */
    @javax.annotation.Nullable
    public IncompleteData getIncompleteData() {
        return this._incompleteData;
    }
    /**
     * Gets the isTrending property value. Indicates whether the item is 'trending.' Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTrending() {
        return this._isTrending;
    }
    /**
     * Gets the move property value. Statistics about the move actions in this interval. Read-only.
     * @return a itemActionStat
     */
    @javax.annotation.Nullable
    public ItemActionStat getMove() {
        return this._move;
    }
    /**
     * Gets the startDateTime property value. When the interval starts. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAccess(@javax.annotation.Nullable final ItemActionStat value) {
        this._access = value;
    }
    /**
     * Sets the activities property value. Exposes the itemActivities represented in this itemActivityStat resource.
     * @param value Value to set for the activities property.
     * @return a void
     */
    public void setActivities(@javax.annotation.Nullable final java.util.List<ItemActivity> value) {
        this._activities = value;
    }
    /**
     * Sets the create property value. Statistics about the create actions in this interval. Read-only.
     * @param value Value to set for the create property.
     * @return a void
     */
    public void setCreate(@javax.annotation.Nullable final ItemActionStat value) {
        this._create = value;
    }
    /**
     * Sets the delete property value. Statistics about the delete actions in this interval. Read-only.
     * @param value Value to set for the delete property.
     * @return a void
     */
    public void setDelete(@javax.annotation.Nullable final ItemActionStat value) {
        this._delete = value;
    }
    /**
     * Sets the edit property value. Statistics about the edit actions in this interval. Read-only.
     * @param value Value to set for the edit property.
     * @return a void
     */
    public void setEdit(@javax.annotation.Nullable final ItemActionStat value) {
        this._edit = value;
    }
    /**
     * Sets the endDateTime property value. When the interval ends. Read-only.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the incompleteData property value. Indicates that the statistics in this interval are based on incomplete data. Read-only.
     * @param value Value to set for the incompleteData property.
     * @return a void
     */
    public void setIncompleteData(@javax.annotation.Nullable final IncompleteData value) {
        this._incompleteData = value;
    }
    /**
     * Sets the isTrending property value. Indicates whether the item is 'trending.' Read-only.
     * @param value Value to set for the isTrending property.
     * @return a void
     */
    public void setIsTrending(@javax.annotation.Nullable final Boolean value) {
        this._isTrending = value;
    }
    /**
     * Sets the move property value. Statistics about the move actions in this interval. Read-only.
     * @param value Value to set for the move property.
     * @return a void
     */
    public void setMove(@javax.annotation.Nullable final ItemActionStat value) {
        this._move = value;
    }
    /**
     * Sets the startDateTime property value. When the interval starts. Read-only.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
}
