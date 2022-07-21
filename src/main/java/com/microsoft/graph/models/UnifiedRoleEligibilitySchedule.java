package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleEligibilitySchedule extends UnifiedRoleScheduleBase implements Parsable {
    /** Membership type of the eligible assignment. It can either be Inherited, Direct, or Group. Supports $filter (eq). */
    private String _memberType;
    /** The schedule object of the eligible role assignment request. */
    private RequestSchedule _scheduleInfo;
    /**
     * Instantiates a new unifiedRoleEligibilitySchedule and sets the default values.
     * @return a void
     */
    public UnifiedRoleEligibilitySchedule() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleEligibilitySchedule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleEligibilitySchedule
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleEligibilitySchedule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleEligibilitySchedule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleEligibilitySchedule currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("memberType", (n) -> { currentObject.setMemberType(n.getStringValue()); });
            this.put("scheduleInfo", (n) -> { currentObject.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the memberType property value. Membership type of the eligible assignment. It can either be Inherited, Direct, or Group. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemberType() {
        return this._memberType;
    }
    /**
     * Gets the scheduleInfo property value. The schedule object of the eligible role assignment request.
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
        writer.writeStringValue("memberType", this.getMemberType());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
    }
    /**
     * Sets the memberType property value. Membership type of the eligible assignment. It can either be Inherited, Direct, or Group. Supports $filter (eq).
     * @param value Value to set for the memberType property.
     * @return a void
     */
    public void setMemberType(@javax.annotation.Nullable final String value) {
        this._memberType = value;
    }
    /**
     * Sets the scheduleInfo property value. The schedule object of the eligible role assignment request.
     * @param value Value to set for the scheduleInfo property.
     * @return a void
     */
    public void setScheduleInfo(@javax.annotation.Nullable final RequestSchedule value) {
        this._scheduleInfo = value;
    }
}
