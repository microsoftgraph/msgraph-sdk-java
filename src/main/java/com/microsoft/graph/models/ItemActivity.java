package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemActivity extends Entity implements Parsable {
    /** An item was accessed.  */
    private AccessAction _access;
    /** Details about when the activity took place. Read-only.  */
    private OffsetDateTime _activityDateTime;
    /** Identity of who performed the action. Read-only.  */
    private IdentitySet _actor;
    /** Exposes the driveItem that was the target of this activity.  */
    private DriveItem _driveItem;
    /**
     * Instantiates a new itemActivity and sets the default values.
     * @return a void
     */
    public ItemActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemActivity
     */
    @javax.annotation.Nonnull
    public static ItemActivity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActivity();
    }
    /**
     * Gets the access property value. An item was accessed.
     * @return a accessAction
     */
    @javax.annotation.Nullable
    public AccessAction getAccess() {
        return this._access;
    }
    /**
     * Gets the activityDateTime property value. Details about when the activity took place. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this._activityDateTime;
    }
    /**
     * Gets the actor property value. Identity of who performed the action. Read-only.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getActor() {
        return this._actor;
    }
    /**
     * Gets the driveItem property value. Exposes the driveItem that was the target of this activity.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public DriveItem getDriveItem() {
        return this._driveItem;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ItemActivity currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("access", (n) -> { currentObject.setAccess(n.getObjectValue(AccessAction::createFromDiscriminatorValue)); });
            this.put("activityDateTime", (n) -> { currentObject.setActivityDateTime(n.getOffsetDateTimeValue()); });
            this.put("actor", (n) -> { currentObject.setActor(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("driveItem", (n) -> { currentObject.setDriveItem(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
        }};
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
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeObjectValue("actor", this.getActor());
        writer.writeObjectValue("driveItem", this.getDriveItem());
    }
    /**
     * Sets the access property value. An item was accessed.
     * @param value Value to set for the access property.
     * @return a void
     */
    public void setAccess(@javax.annotation.Nullable final AccessAction value) {
        this._access = value;
    }
    /**
     * Sets the activityDateTime property value. Details about when the activity took place. Read-only.
     * @param value Value to set for the activityDateTime property.
     * @return a void
     */
    public void setActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._activityDateTime = value;
    }
    /**
     * Sets the actor property value. Identity of who performed the action. Read-only.
     * @param value Value to set for the actor property.
     * @return a void
     */
    public void setActor(@javax.annotation.Nullable final IdentitySet value) {
        this._actor = value;
    }
    /**
     * Sets the driveItem property value. Exposes the driveItem that was the target of this activity.
     * @param value Value to set for the driveItem property.
     * @return a void
     */
    public void setDriveItem(@javax.annotation.Nullable final DriveItem value) {
        this._driveItem = value;
    }
}
