package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleAssignmentScheduleInstance extends UnifiedRoleScheduleInstanceBase implements Parsable {
    /** If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand. */
    private UnifiedRoleEligibilityScheduleInstance _activatedUsing;
    /** Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne). */
    private String _assignmentType;
    /** The end date of the schedule instance. */
    private OffsetDateTime _endDateTime;
    /** How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne). */
    private String _memberType;
    /** The identifier of the role assignment in Azure AD. */
    private String _roleAssignmentOriginId;
    /** The identifier of the unifiedRoleAssignmentSchedule object from which this instance was created. */
    private String _roleAssignmentScheduleId;
    /** When this instance starts. */
    private OffsetDateTime _startDateTime;
    /**
     * Instantiates a new UnifiedRoleAssignmentScheduleInstance and sets the default values.
     * @return a void
     */
    public UnifiedRoleAssignmentScheduleInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleAssignmentScheduleInstance
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleAssignmentScheduleInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleAssignmentScheduleInstance();
    }
    /**
     * Gets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand.
     * @return a unifiedRoleEligibilityScheduleInstance
     */
    @javax.annotation.Nullable
    public UnifiedRoleEligibilityScheduleInstance getActivatedUsing() {
        return this._activatedUsing;
    }
    /**
     * Gets the assignmentType property value. Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentType() {
        return this._assignmentType;
    }
    /**
     * Gets the endDateTime property value. The end date of the schedule instance.
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
        final UnifiedRoleAssignmentScheduleInstance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activatedUsing", (n) -> { currentObject.setActivatedUsing(n.getObjectValue(UnifiedRoleEligibilityScheduleInstance::createFromDiscriminatorValue)); });
            this.put("assignmentType", (n) -> { currentObject.setAssignmentType(n.getStringValue()); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("memberType", (n) -> { currentObject.setMemberType(n.getStringValue()); });
            this.put("roleAssignmentOriginId", (n) -> { currentObject.setRoleAssignmentOriginId(n.getStringValue()); });
            this.put("roleAssignmentScheduleId", (n) -> { currentObject.setRoleAssignmentScheduleId(n.getStringValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the memberType property value. How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemberType() {
        return this._memberType;
    }
    /**
     * Gets the roleAssignmentOriginId property value. The identifier of the role assignment in Azure AD.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleAssignmentOriginId() {
        return this._roleAssignmentOriginId;
    }
    /**
     * Gets the roleAssignmentScheduleId property value. The identifier of the unifiedRoleAssignmentSchedule object from which this instance was created.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleAssignmentScheduleId() {
        return this._roleAssignmentScheduleId;
    }
    /**
     * Gets the startDateTime property value. When this instance starts.
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
        writer.writeObjectValue("activatedUsing", this.getActivatedUsing());
        writer.writeStringValue("assignmentType", this.getAssignmentType());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("memberType", this.getMemberType());
        writer.writeStringValue("roleAssignmentOriginId", this.getRoleAssignmentOriginId());
        writer.writeStringValue("roleAssignmentScheduleId", this.getRoleAssignmentScheduleId());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
    }
    /**
     * Sets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand.
     * @param value Value to set for the activatedUsing property.
     * @return a void
     */
    public void setActivatedUsing(@javax.annotation.Nullable final UnifiedRoleEligibilityScheduleInstance value) {
        this._activatedUsing = value;
    }
    /**
     * Sets the assignmentType property value. Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne).
     * @param value Value to set for the assignmentType property.
     * @return a void
     */
    public void setAssignmentType(@javax.annotation.Nullable final String value) {
        this._assignmentType = value;
    }
    /**
     * Sets the endDateTime property value. The end date of the schedule instance.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the memberType property value. How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
     * @param value Value to set for the memberType property.
     * @return a void
     */
    public void setMemberType(@javax.annotation.Nullable final String value) {
        this._memberType = value;
    }
    /**
     * Sets the roleAssignmentOriginId property value. The identifier of the role assignment in Azure AD.
     * @param value Value to set for the roleAssignmentOriginId property.
     * @return a void
     */
    public void setRoleAssignmentOriginId(@javax.annotation.Nullable final String value) {
        this._roleAssignmentOriginId = value;
    }
    /**
     * Sets the roleAssignmentScheduleId property value. The identifier of the unifiedRoleAssignmentSchedule object from which this instance was created.
     * @param value Value to set for the roleAssignmentScheduleId property.
     * @return a void
     */
    public void setRoleAssignmentScheduleId(@javax.annotation.Nullable final String value) {
        this._roleAssignmentScheduleId = value;
    }
    /**
     * Sets the startDateTime property value. When this instance starts.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
}
