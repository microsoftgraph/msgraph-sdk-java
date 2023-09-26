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
     * The action property
     */
    private ScheduleRequestActions action;
    /**
     * The isValidationOnly property
     */
    private Boolean isValidationOnly;
    /**
     * The justification property
     */
    private String justification;
    /**
     * The scheduleInfo property
     */
    private RequestSchedule scheduleInfo;
    /**
     * The ticketInfo property
     */
    private TicketInfo ticketInfo;
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
     * Gets the action property value. The action property
     * @return a ScheduleRequestActions
     */
    @jakarta.annotation.Nullable
    public ScheduleRequestActions getAction() {
        return this.action;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(ScheduleRequestActions.class)); });
        deserializerMap.put("isValidationOnly", (n) -> { this.setIsValidationOnly(n.getBooleanValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("scheduleInfo", (n) -> { this.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("ticketInfo", (n) -> { this.setTicketInfo(n.getObjectValue(TicketInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isValidationOnly property value. The isValidationOnly property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsValidationOnly() {
        return this.isValidationOnly;
    }
    /**
     * Gets the justification property value. The justification property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.justification;
    }
    /**
     * Gets the scheduleInfo property value. The scheduleInfo property
     * @return a RequestSchedule
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this.scheduleInfo;
    }
    /**
     * Gets the ticketInfo property value. The ticketInfo property
     * @return a TicketInfo
     */
    @jakarta.annotation.Nullable
    public TicketInfo getTicketInfo() {
        return this.ticketInfo;
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
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final ScheduleRequestActions value) {
        this.action = value;
    }
    /**
     * Sets the isValidationOnly property value. The isValidationOnly property
     * @param value Value to set for the isValidationOnly property.
     */
    public void setIsValidationOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.isValidationOnly = value;
    }
    /**
     * Sets the justification property value. The justification property
     * @param value Value to set for the justification property.
     */
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.justification = value;
    }
    /**
     * Sets the scheduleInfo property value. The scheduleInfo property
     * @param value Value to set for the scheduleInfo property.
     */
    public void setScheduleInfo(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.scheduleInfo = value;
    }
    /**
     * Sets the ticketInfo property value. The ticketInfo property
     * @param value Value to set for the ticketInfo property.
     */
    public void setTicketInfo(@jakarta.annotation.Nullable final TicketInfo value) {
        this.ticketInfo = value;
    }
}
