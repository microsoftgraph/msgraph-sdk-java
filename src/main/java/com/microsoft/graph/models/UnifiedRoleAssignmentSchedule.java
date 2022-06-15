package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleAssignmentSchedule extends UnifiedRoleScheduleBase implements Parsable {
    /** If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand. */
    private UnifiedRoleEligibilitySchedule _activatedUsing;
    /** Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne). */
    private String _assignmentType;
    /** How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne). */
    private String _memberType;
    /** The period of the role assignment. It can represent a single occurrence or multiple recurrences. */
    private RequestSchedule _scheduleInfo;
    /**
     * Instantiates a new UnifiedRoleAssignmentSchedule and sets the default values.
     * @return a void
     */
    public UnifiedRoleAssignmentSchedule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleAssignmentSchedule
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleAssignmentSchedule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleAssignmentSchedule();
    }
    /**
     * Gets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand.
     * @return a unifiedRoleEligibilitySchedule
     */
    @javax.annotation.Nullable
    public UnifiedRoleEligibilitySchedule getActivatedUsing() {
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleAssignmentSchedule currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activatedUsing", (n) -> { currentObject.setActivatedUsing(n.getObjectValue(UnifiedRoleEligibilitySchedule::createFromDiscriminatorValue)); });
            this.put("assignmentType", (n) -> { currentObject.setAssignmentType(n.getStringValue()); });
            this.put("memberType", (n) -> { currentObject.setMemberType(n.getStringValue()); });
            this.put("scheduleInfo", (n) -> { currentObject.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
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
     * Gets the scheduleInfo property value. The period of the role assignment. It can represent a single occurrence or multiple recurrences.
     * @return a requestSchedule
     */
    @javax.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this._scheduleInfo;
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
        writer.writeStringValue("memberType", this.getMemberType());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
    }
    /**
     * Sets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand.
     * @param value Value to set for the activatedUsing property.
     * @return a void
     */
    public void setActivatedUsing(@javax.annotation.Nullable final UnifiedRoleEligibilitySchedule value) {
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
     * Sets the memberType property value. How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
     * @param value Value to set for the memberType property.
     * @return a void
     */
    public void setMemberType(@javax.annotation.Nullable final String value) {
        this._memberType = value;
    }
    /**
     * Sets the scheduleInfo property value. The period of the role assignment. It can represent a single occurrence or multiple recurrences.
     * @param value Value to set for the scheduleInfo property.
     * @return a void
     */
    public void setScheduleInfo(@javax.annotation.Nullable final RequestSchedule value) {
        this._scheduleInfo = value;
    }
}
