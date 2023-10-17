package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Schedule extends Entity implements Parsable {
    /**
     * Indicates whether the schedule is enabled for the team. Required.
     */
    private Boolean enabled;
    /**
     * The offer requests for shifts in the schedule.
     */
    private java.util.List<OfferShiftRequest> offerShiftRequests;
    /**
     * Indicates whether offer shift requests are enabled for the schedule.
     */
    private Boolean offerShiftRequestsEnabled;
    /**
     * The open shift requests in the schedule.
     */
    private java.util.List<OpenShiftChangeRequest> openShiftChangeRequests;
    /**
     * The set of open shifts in a scheduling group in the schedule.
     */
    private java.util.List<OpenShift> openShifts;
    /**
     * Indicates whether open shifts are enabled for the schedule.
     */
    private Boolean openShiftsEnabled;
    /**
     * The status of the schedule provisioning. The possible values are notStarted, running, completed, failed.
     */
    private OperationStatus provisionStatus;
    /**
     * Additional information about why schedule provisioning failed.
     */
    private String provisionStatusCode;
    /**
     * The logical grouping of users in the schedule (usually by role).
     */
    private java.util.List<SchedulingGroup> schedulingGroups;
    /**
     * The shifts in the schedule.
     */
    private java.util.List<Shift> shifts;
    /**
     * The swap requests for shifts in the schedule.
     */
    private java.util.List<SwapShiftsChangeRequest> swapShiftsChangeRequests;
    /**
     * Indicates whether swap shifts requests are enabled for the schedule.
     */
    private Boolean swapShiftsRequestsEnabled;
    /**
     * Indicates whether time clock is enabled for the schedule.
     */
    private Boolean timeClockEnabled;
    /**
     * The set of reasons for a time off in the schedule.
     */
    private java.util.List<TimeOffReason> timeOffReasons;
    /**
     * The time off requests in the schedule.
     */
    private java.util.List<TimeOffRequest> timeOffRequests;
    /**
     * Indicates whether time off requests are enabled for the schedule.
     */
    private Boolean timeOffRequestsEnabled;
    /**
     * The instances of times off in the schedule.
     */
    private java.util.List<TimeOff> timesOff;
    /**
     * Indicates the time zone of the schedule team using tz database format. Required.
     */
    private String timeZone;
    /**
     * The workforceIntegrationIds property
     */
    private java.util.List<String> workforceIntegrationIds;
    /**
     * Instantiates a new Schedule and sets the default values.
     */
    public Schedule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Schedule
     */
    @jakarta.annotation.Nonnull
    public static Schedule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Schedule();
    }
    /**
     * Gets the enabled property value. Indicates whether the schedule is enabled for the team. Required.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("offerShiftRequests", (n) -> { this.setOfferShiftRequests(n.getCollectionOfObjectValues(OfferShiftRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("offerShiftRequestsEnabled", (n) -> { this.setOfferShiftRequestsEnabled(n.getBooleanValue()); });
        deserializerMap.put("openShiftChangeRequests", (n) -> { this.setOpenShiftChangeRequests(n.getCollectionOfObjectValues(OpenShiftChangeRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("openShifts", (n) -> { this.setOpenShifts(n.getCollectionOfObjectValues(OpenShift::createFromDiscriminatorValue)); });
        deserializerMap.put("openShiftsEnabled", (n) -> { this.setOpenShiftsEnabled(n.getBooleanValue()); });
        deserializerMap.put("provisionStatus", (n) -> { this.setProvisionStatus(n.getEnumValue(OperationStatus.class)); });
        deserializerMap.put("provisionStatusCode", (n) -> { this.setProvisionStatusCode(n.getStringValue()); });
        deserializerMap.put("schedulingGroups", (n) -> { this.setSchedulingGroups(n.getCollectionOfObjectValues(SchedulingGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("shifts", (n) -> { this.setShifts(n.getCollectionOfObjectValues(Shift::createFromDiscriminatorValue)); });
        deserializerMap.put("swapShiftsChangeRequests", (n) -> { this.setSwapShiftsChangeRequests(n.getCollectionOfObjectValues(SwapShiftsChangeRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("swapShiftsRequestsEnabled", (n) -> { this.setSwapShiftsRequestsEnabled(n.getBooleanValue()); });
        deserializerMap.put("timeClockEnabled", (n) -> { this.setTimeClockEnabled(n.getBooleanValue()); });
        deserializerMap.put("timeOffReasons", (n) -> { this.setTimeOffReasons(n.getCollectionOfObjectValues(TimeOffReason::createFromDiscriminatorValue)); });
        deserializerMap.put("timeOffRequests", (n) -> { this.setTimeOffRequests(n.getCollectionOfObjectValues(TimeOffRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("timeOffRequestsEnabled", (n) -> { this.setTimeOffRequestsEnabled(n.getBooleanValue()); });
        deserializerMap.put("timesOff", (n) -> { this.setTimesOff(n.getCollectionOfObjectValues(TimeOff::createFromDiscriminatorValue)); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getStringValue()); });
        deserializerMap.put("workforceIntegrationIds", (n) -> { this.setWorkforceIntegrationIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the offerShiftRequests property value. The offer requests for shifts in the schedule.
     * @return a java.util.List<OfferShiftRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OfferShiftRequest> getOfferShiftRequests() {
        return this.offerShiftRequests;
    }
    /**
     * Gets the offerShiftRequestsEnabled property value. Indicates whether offer shift requests are enabled for the schedule.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOfferShiftRequestsEnabled() {
        return this.offerShiftRequestsEnabled;
    }
    /**
     * Gets the openShiftChangeRequests property value. The open shift requests in the schedule.
     * @return a java.util.List<OpenShiftChangeRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OpenShiftChangeRequest> getOpenShiftChangeRequests() {
        return this.openShiftChangeRequests;
    }
    /**
     * Gets the openShifts property value. The set of open shifts in a scheduling group in the schedule.
     * @return a java.util.List<OpenShift>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OpenShift> getOpenShifts() {
        return this.openShifts;
    }
    /**
     * Gets the openShiftsEnabled property value. Indicates whether open shifts are enabled for the schedule.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOpenShiftsEnabled() {
        return this.openShiftsEnabled;
    }
    /**
     * Gets the provisionStatus property value. The status of the schedule provisioning. The possible values are notStarted, running, completed, failed.
     * @return a OperationStatus
     */
    @jakarta.annotation.Nullable
    public OperationStatus getProvisionStatus() {
        return this.provisionStatus;
    }
    /**
     * Gets the provisionStatusCode property value. Additional information about why schedule provisioning failed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProvisionStatusCode() {
        return this.provisionStatusCode;
    }
    /**
     * Gets the schedulingGroups property value. The logical grouping of users in the schedule (usually by role).
     * @return a java.util.List<SchedulingGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SchedulingGroup> getSchedulingGroups() {
        return this.schedulingGroups;
    }
    /**
     * Gets the shifts property value. The shifts in the schedule.
     * @return a java.util.List<Shift>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Shift> getShifts() {
        return this.shifts;
    }
    /**
     * Gets the swapShiftsChangeRequests property value. The swap requests for shifts in the schedule.
     * @return a java.util.List<SwapShiftsChangeRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SwapShiftsChangeRequest> getSwapShiftsChangeRequests() {
        return this.swapShiftsChangeRequests;
    }
    /**
     * Gets the swapShiftsRequestsEnabled property value. Indicates whether swap shifts requests are enabled for the schedule.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSwapShiftsRequestsEnabled() {
        return this.swapShiftsRequestsEnabled;
    }
    /**
     * Gets the timeClockEnabled property value. Indicates whether time clock is enabled for the schedule.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTimeClockEnabled() {
        return this.timeClockEnabled;
    }
    /**
     * Gets the timeOffReasons property value. The set of reasons for a time off in the schedule.
     * @return a java.util.List<TimeOffReason>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TimeOffReason> getTimeOffReasons() {
        return this.timeOffReasons;
    }
    /**
     * Gets the timeOffRequests property value. The time off requests in the schedule.
     * @return a java.util.List<TimeOffRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TimeOffRequest> getTimeOffRequests() {
        return this.timeOffRequests;
    }
    /**
     * Gets the timeOffRequestsEnabled property value. Indicates whether time off requests are enabled for the schedule.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTimeOffRequestsEnabled() {
        return this.timeOffRequestsEnabled;
    }
    /**
     * Gets the timesOff property value. The instances of times off in the schedule.
     * @return a java.util.List<TimeOff>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TimeOff> getTimesOff() {
        return this.timesOff;
    }
    /**
     * Gets the timeZone property value. Indicates the time zone of the schedule team using tz database format. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTimeZone() {
        return this.timeZone;
    }
    /**
     * Gets the workforceIntegrationIds property value. The workforceIntegrationIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWorkforceIntegrationIds() {
        return this.workforceIntegrationIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeCollectionOfObjectValues("offerShiftRequests", this.getOfferShiftRequests());
        writer.writeBooleanValue("offerShiftRequestsEnabled", this.getOfferShiftRequestsEnabled());
        writer.writeCollectionOfObjectValues("openShiftChangeRequests", this.getOpenShiftChangeRequests());
        writer.writeCollectionOfObjectValues("openShifts", this.getOpenShifts());
        writer.writeBooleanValue("openShiftsEnabled", this.getOpenShiftsEnabled());
        writer.writeCollectionOfObjectValues("schedulingGroups", this.getSchedulingGroups());
        writer.writeCollectionOfObjectValues("shifts", this.getShifts());
        writer.writeCollectionOfObjectValues("swapShiftsChangeRequests", this.getSwapShiftsChangeRequests());
        writer.writeBooleanValue("swapShiftsRequestsEnabled", this.getSwapShiftsRequestsEnabled());
        writer.writeBooleanValue("timeClockEnabled", this.getTimeClockEnabled());
        writer.writeCollectionOfObjectValues("timeOffReasons", this.getTimeOffReasons());
        writer.writeCollectionOfObjectValues("timeOffRequests", this.getTimeOffRequests());
        writer.writeBooleanValue("timeOffRequestsEnabled", this.getTimeOffRequestsEnabled());
        writer.writeCollectionOfObjectValues("timesOff", this.getTimesOff());
        writer.writeStringValue("timeZone", this.getTimeZone());
        writer.writeCollectionOfPrimitiveValues("workforceIntegrationIds", this.getWorkforceIntegrationIds());
    }
    /**
     * Sets the enabled property value. Indicates whether the schedule is enabled for the team. Required.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the offerShiftRequests property value. The offer requests for shifts in the schedule.
     * @param value Value to set for the offerShiftRequests property.
     */
    public void setOfferShiftRequests(@jakarta.annotation.Nullable final java.util.List<OfferShiftRequest> value) {
        this.offerShiftRequests = value;
    }
    /**
     * Sets the offerShiftRequestsEnabled property value. Indicates whether offer shift requests are enabled for the schedule.
     * @param value Value to set for the offerShiftRequestsEnabled property.
     */
    public void setOfferShiftRequestsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.offerShiftRequestsEnabled = value;
    }
    /**
     * Sets the openShiftChangeRequests property value. The open shift requests in the schedule.
     * @param value Value to set for the openShiftChangeRequests property.
     */
    public void setOpenShiftChangeRequests(@jakarta.annotation.Nullable final java.util.List<OpenShiftChangeRequest> value) {
        this.openShiftChangeRequests = value;
    }
    /**
     * Sets the openShifts property value. The set of open shifts in a scheduling group in the schedule.
     * @param value Value to set for the openShifts property.
     */
    public void setOpenShifts(@jakarta.annotation.Nullable final java.util.List<OpenShift> value) {
        this.openShifts = value;
    }
    /**
     * Sets the openShiftsEnabled property value. Indicates whether open shifts are enabled for the schedule.
     * @param value Value to set for the openShiftsEnabled property.
     */
    public void setOpenShiftsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.openShiftsEnabled = value;
    }
    /**
     * Sets the provisionStatus property value. The status of the schedule provisioning. The possible values are notStarted, running, completed, failed.
     * @param value Value to set for the provisionStatus property.
     */
    public void setProvisionStatus(@jakarta.annotation.Nullable final OperationStatus value) {
        this.provisionStatus = value;
    }
    /**
     * Sets the provisionStatusCode property value. Additional information about why schedule provisioning failed.
     * @param value Value to set for the provisionStatusCode property.
     */
    public void setProvisionStatusCode(@jakarta.annotation.Nullable final String value) {
        this.provisionStatusCode = value;
    }
    /**
     * Sets the schedulingGroups property value. The logical grouping of users in the schedule (usually by role).
     * @param value Value to set for the schedulingGroups property.
     */
    public void setSchedulingGroups(@jakarta.annotation.Nullable final java.util.List<SchedulingGroup> value) {
        this.schedulingGroups = value;
    }
    /**
     * Sets the shifts property value. The shifts in the schedule.
     * @param value Value to set for the shifts property.
     */
    public void setShifts(@jakarta.annotation.Nullable final java.util.List<Shift> value) {
        this.shifts = value;
    }
    /**
     * Sets the swapShiftsChangeRequests property value. The swap requests for shifts in the schedule.
     * @param value Value to set for the swapShiftsChangeRequests property.
     */
    public void setSwapShiftsChangeRequests(@jakarta.annotation.Nullable final java.util.List<SwapShiftsChangeRequest> value) {
        this.swapShiftsChangeRequests = value;
    }
    /**
     * Sets the swapShiftsRequestsEnabled property value. Indicates whether swap shifts requests are enabled for the schedule.
     * @param value Value to set for the swapShiftsRequestsEnabled property.
     */
    public void setSwapShiftsRequestsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.swapShiftsRequestsEnabled = value;
    }
    /**
     * Sets the timeClockEnabled property value. Indicates whether time clock is enabled for the schedule.
     * @param value Value to set for the timeClockEnabled property.
     */
    public void setTimeClockEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.timeClockEnabled = value;
    }
    /**
     * Sets the timeOffReasons property value. The set of reasons for a time off in the schedule.
     * @param value Value to set for the timeOffReasons property.
     */
    public void setTimeOffReasons(@jakarta.annotation.Nullable final java.util.List<TimeOffReason> value) {
        this.timeOffReasons = value;
    }
    /**
     * Sets the timeOffRequests property value. The time off requests in the schedule.
     * @param value Value to set for the timeOffRequests property.
     */
    public void setTimeOffRequests(@jakarta.annotation.Nullable final java.util.List<TimeOffRequest> value) {
        this.timeOffRequests = value;
    }
    /**
     * Sets the timeOffRequestsEnabled property value. Indicates whether time off requests are enabled for the schedule.
     * @param value Value to set for the timeOffRequestsEnabled property.
     */
    public void setTimeOffRequestsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.timeOffRequestsEnabled = value;
    }
    /**
     * Sets the timesOff property value. The instances of times off in the schedule.
     * @param value Value to set for the timesOff property.
     */
    public void setTimesOff(@jakarta.annotation.Nullable final java.util.List<TimeOff> value) {
        this.timesOff = value;
    }
    /**
     * Sets the timeZone property value. Indicates the time zone of the schedule team using tz database format. Required.
     * @param value Value to set for the timeZone property.
     */
    public void setTimeZone(@jakarta.annotation.Nullable final String value) {
        this.timeZone = value;
    }
    /**
     * Sets the workforceIntegrationIds property value. The workforceIntegrationIds property
     * @param value Value to set for the workforceIntegrationIds property.
     */
    public void setWorkforceIntegrationIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.workforceIntegrationIds = value;
    }
}
