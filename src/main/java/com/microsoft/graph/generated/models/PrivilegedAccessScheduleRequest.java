package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccessScheduleRequest extends Request implements Parsable {
    /**
     * Instantiates a new PrivilegedAccessScheduleRequest and sets the default values.
     */
    public PrivilegedAccessScheduleRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegedAccessScheduleRequest
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedAccessScheduleRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.privilegedAccessGroupAssignmentScheduleRequest": return new PrivilegedAccessGroupAssignmentScheduleRequest();
                case "#microsoft.graph.privilegedAccessGroupEligibilityScheduleRequest": return new PrivilegedAccessGroupEligibilityScheduleRequest();
            }
        }
        return new PrivilegedAccessScheduleRequest();
    }
    /**
     * Gets the action property value. Represents the type of operation on the group membership or ownership assignment request. The possible values are: adminAssign, adminUpdate, adminRemove, selfActivate, selfDeactivate, adminExtend, adminRenew. adminAssign: For administrators to assign group membership or ownership to principals.adminRemove: For administrators to remove principals from group membership or ownership. adminUpdate: For administrators to change existing group membership or ownership assignments.adminExtend: For administrators to extend expiring assignments.adminRenew: For administrators to renew expired assignments.selfActivate: For principals to activate their assignments.selfDeactivate: For principals to deactivate their active assignments.
     * @return a ScheduleRequestActions
     */
    @jakarta.annotation.Nullable
    public ScheduleRequestActions getAction() {
        return this.backingStore.get("action");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(ScheduleRequestActions::forValue)); });
        deserializerMap.put("isValidationOnly", (n) -> { this.setIsValidationOnly(n.getBooleanValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("scheduleInfo", (n) -> { this.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("ticketInfo", (n) -> { this.setTicketInfo(n.getObjectValue(TicketInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isValidationOnly property value. Determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsValidationOnly() {
        return this.backingStore.get("isValidationOnly");
    }
    /**
     * Gets the justification property value. A message provided by users and administrators when create they create the privilegedAccessGroupAssignmentScheduleRequest object.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.backingStore.get("justification");
    }
    /**
     * Gets the scheduleInfo property value. The period of the group membership or ownership assignment. Recurring schedules are currently unsupported.
     * @return a RequestSchedule
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this.backingStore.get("scheduleInfo");
    }
    /**
     * Gets the ticketInfo property value. Ticket details linked to the group membership or ownership assignment request including details of the ticket number and ticket system.
     * @return a TicketInfo
     */
    @jakarta.annotation.Nullable
    public TicketInfo getTicketInfo() {
        return this.backingStore.get("ticketInfo");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeBooleanValue("isValidationOnly", this.getIsValidationOnly());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
        writer.writeObjectValue("ticketInfo", this.getTicketInfo());
    }
    /**
     * Sets the action property value. Represents the type of operation on the group membership or ownership assignment request. The possible values are: adminAssign, adminUpdate, adminRemove, selfActivate, selfDeactivate, adminExtend, adminRenew. adminAssign: For administrators to assign group membership or ownership to principals.adminRemove: For administrators to remove principals from group membership or ownership. adminUpdate: For administrators to change existing group membership or ownership assignments.adminExtend: For administrators to extend expiring assignments.adminRenew: For administrators to renew expired assignments.selfActivate: For principals to activate their assignments.selfDeactivate: For principals to deactivate their active assignments.
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final ScheduleRequestActions value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the isValidationOnly property value. Determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request.
     * @param value Value to set for the isValidationOnly property.
     */
    public void setIsValidationOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isValidationOnly", value);
    }
    /**
     * Sets the justification property value. A message provided by users and administrators when create they create the privilegedAccessGroupAssignmentScheduleRequest object.
     * @param value Value to set for the justification property.
     */
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("justification", value);
    }
    /**
     * Sets the scheduleInfo property value. The period of the group membership or ownership assignment. Recurring schedules are currently unsupported.
     * @param value Value to set for the scheduleInfo property.
     */
    public void setScheduleInfo(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.backingStore.set("scheduleInfo", value);
    }
    /**
     * Sets the ticketInfo property value. Ticket details linked to the group membership or ownership assignment request including details of the ticket number and ticket system.
     * @param value Value to set for the ticketInfo property.
     */
    public void setTicketInfo(@jakarta.annotation.Nullable final TicketInfo value) {
        this.backingStore.set("ticketInfo", value);
    }
}
