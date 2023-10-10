package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ScheduleChangeRequest extends ChangeTrackedEntity implements Parsable {
    /**
     * The assignedTo property
     */
    private ScheduleChangeRequestActor assignedTo;
    /**
     * The managerActionDateTime property
     */
    private OffsetDateTime managerActionDateTime;
    /**
     * The managerActionMessage property
     */
    private String managerActionMessage;
    /**
     * The managerUserId property
     */
    private String managerUserId;
    /**
     * The senderDateTime property
     */
    private OffsetDateTime senderDateTime;
    /**
     * The senderMessage property
     */
    private String senderMessage;
    /**
     * The senderUserId property
     */
    private String senderUserId;
    /**
     * The state property
     */
    private ScheduleChangeState state;
    /**
     * Instantiates a new ScheduleChangeRequest and sets the default values.
     */
    public ScheduleChangeRequest() {
        super();
        this.setOdataType("#microsoft.graph.scheduleChangeRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ScheduleChangeRequest
     */
    @jakarta.annotation.Nonnull
    public static ScheduleChangeRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.offerShiftRequest": return new OfferShiftRequest();
                case "#microsoft.graph.openShiftChangeRequest": return new OpenShiftChangeRequest();
                case "#microsoft.graph.swapShiftsChangeRequest": return new SwapShiftsChangeRequest();
                case "#microsoft.graph.timeOffRequest": return new TimeOffRequest();
            }
        }
        return new ScheduleChangeRequest();
    }
    /**
     * Gets the assignedTo property value. The assignedTo property
     * @return a ScheduleChangeRequestActor
     */
    @jakarta.annotation.Nullable
    public ScheduleChangeRequestActor getAssignedTo() {
        return this.assignedTo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getEnumValue(ScheduleChangeRequestActor.class)); });
        deserializerMap.put("managerActionDateTime", (n) -> { this.setManagerActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managerActionMessage", (n) -> { this.setManagerActionMessage(n.getStringValue()); });
        deserializerMap.put("managerUserId", (n) -> { this.setManagerUserId(n.getStringValue()); });
        deserializerMap.put("senderDateTime", (n) -> { this.setSenderDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("senderMessage", (n) -> { this.setSenderMessage(n.getStringValue()); });
        deserializerMap.put("senderUserId", (n) -> { this.setSenderUserId(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ScheduleChangeState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the managerActionDateTime property value. The managerActionDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getManagerActionDateTime() {
        return this.managerActionDateTime;
    }
    /**
     * Gets the managerActionMessage property value. The managerActionMessage property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagerActionMessage() {
        return this.managerActionMessage;
    }
    /**
     * Gets the managerUserId property value. The managerUserId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagerUserId() {
        return this.managerUserId;
    }
    /**
     * Gets the senderDateTime property value. The senderDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSenderDateTime() {
        return this.senderDateTime;
    }
    /**
     * Gets the senderMessage property value. The senderMessage property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSenderMessage() {
        return this.senderMessage;
    }
    /**
     * Gets the senderUserId property value. The senderUserId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSenderUserId() {
        return this.senderUserId;
    }
    /**
     * Gets the state property value. The state property
     * @return a ScheduleChangeState
     */
    @jakarta.annotation.Nullable
    public ScheduleChangeState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("assignedTo", this.getAssignedTo());
        writer.writeStringValue("managerActionMessage", this.getManagerActionMessage());
        writer.writeStringValue("senderMessage", this.getSenderMessage());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the assignedTo property value. The assignedTo property
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final ScheduleChangeRequestActor value) {
        this.assignedTo = value;
    }
    /**
     * Sets the managerActionDateTime property value. The managerActionDateTime property
     * @param value Value to set for the managerActionDateTime property.
     */
    public void setManagerActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.managerActionDateTime = value;
    }
    /**
     * Sets the managerActionMessage property value. The managerActionMessage property
     * @param value Value to set for the managerActionMessage property.
     */
    public void setManagerActionMessage(@jakarta.annotation.Nullable final String value) {
        this.managerActionMessage = value;
    }
    /**
     * Sets the managerUserId property value. The managerUserId property
     * @param value Value to set for the managerUserId property.
     */
    public void setManagerUserId(@jakarta.annotation.Nullable final String value) {
        this.managerUserId = value;
    }
    /**
     * Sets the senderDateTime property value. The senderDateTime property
     * @param value Value to set for the senderDateTime property.
     */
    public void setSenderDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.senderDateTime = value;
    }
    /**
     * Sets the senderMessage property value. The senderMessage property
     * @param value Value to set for the senderMessage property.
     */
    public void setSenderMessage(@jakarta.annotation.Nullable final String value) {
        this.senderMessage = value;
    }
    /**
     * Sets the senderUserId property value. The senderUserId property
     * @param value Value to set for the senderUserId property.
     */
    public void setSenderUserId(@jakarta.annotation.Nullable final String value) {
        this.senderUserId = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ScheduleChangeState value) {
        this.state = value;
    }
}
