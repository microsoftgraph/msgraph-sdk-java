package com.microsoft.graph.models;

import com.microsoft.graph.models.OfferShiftRequest;
import com.microsoft.graph.models.OpenShiftChangeRequest;
import com.microsoft.graph.models.SwapShiftsChangeRequest;
import com.microsoft.graph.models.TimeOffRequest;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ScheduleChangeRequest extends ChangeTrackedEntity implements Parsable {
    /** The assignedTo property */
    private ScheduleChangeRequestActor _assignedTo;
    /** The managerActionDateTime property */
    private OffsetDateTime _managerActionDateTime;
    /** The managerActionMessage property */
    private String _managerActionMessage;
    /** The managerUserId property */
    private String _managerUserId;
    /** The senderDateTime property */
    private OffsetDateTime _senderDateTime;
    /** The senderMessage property */
    private String _senderMessage;
    /** The senderUserId property */
    private String _senderUserId;
    /** The state property */
    private ScheduleChangeState _state;
    /**
     * Instantiates a new ScheduleChangeRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ScheduleChangeRequest() {
        super();
        this.setOdataType("#microsoft.graph.scheduleChangeRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ScheduleChangeRequest
     */
    @javax.annotation.Nonnull
    public static ScheduleChangeRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a scheduleChangeRequestActor
     */
    @javax.annotation.Nullable
    public ScheduleChangeRequestActor getAssignedTo() {
        return this._assignedTo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
    @javax.annotation.Nullable
    public OffsetDateTime getManagerActionDateTime() {
        return this._managerActionDateTime;
    }
    /**
     * Gets the managerActionMessage property value. The managerActionMessage property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagerActionMessage() {
        return this._managerActionMessage;
    }
    /**
     * Gets the managerUserId property value. The managerUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagerUserId() {
        return this._managerUserId;
    }
    /**
     * Gets the senderDateTime property value. The senderDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSenderDateTime() {
        return this._senderDateTime;
    }
    /**
     * Gets the senderMessage property value. The senderMessage property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSenderMessage() {
        return this._senderMessage;
    }
    /**
     * Gets the senderUserId property value. The senderUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSenderUserId() {
        return this._senderUserId;
    }
    /**
     * Gets the state property value. The state property
     * @return a scheduleChangeState
     */
    @javax.annotation.Nullable
    public ScheduleChangeState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedTo(@javax.annotation.Nullable final ScheduleChangeRequestActor value) {
        this._assignedTo = value;
    }
    /**
     * Sets the managerActionDateTime property value. The managerActionDateTime property
     * @param value Value to set for the managerActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagerActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._managerActionDateTime = value;
    }
    /**
     * Sets the managerActionMessage property value. The managerActionMessage property
     * @param value Value to set for the managerActionMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagerActionMessage(@javax.annotation.Nullable final String value) {
        this._managerActionMessage = value;
    }
    /**
     * Sets the managerUserId property value. The managerUserId property
     * @param value Value to set for the managerUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagerUserId(@javax.annotation.Nullable final String value) {
        this._managerUserId = value;
    }
    /**
     * Sets the senderDateTime property value. The senderDateTime property
     * @param value Value to set for the senderDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSenderDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._senderDateTime = value;
    }
    /**
     * Sets the senderMessage property value. The senderMessage property
     * @param value Value to set for the senderMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSenderMessage(@javax.annotation.Nullable final String value) {
        this._senderMessage = value;
    }
    /**
     * Sets the senderUserId property value. The senderUserId property
     * @param value Value to set for the senderUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSenderUserId(@javax.annotation.Nullable final String value) {
        this._senderUserId = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ScheduleChangeState value) {
        this._state = value;
    }
}
