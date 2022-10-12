package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Schedule extends Entity implements Parsable {
    /** Indicates whether the schedule is enabled for the team. Required. */
    private Boolean _enabled;
    /** The offerShiftRequests property */
    private java.util.List<OfferShiftRequest> _offerShiftRequests;
    /** Indicates whether offer shift requests are enabled for the schedule. */
    private Boolean _offerShiftRequestsEnabled;
    /** The openShiftChangeRequests property */
    private java.util.List<OpenShiftChangeRequest> _openShiftChangeRequests;
    /** The openShifts property */
    private java.util.List<OpenShift> _openShifts;
    /** Indicates whether open shifts are enabled for the schedule. */
    private Boolean _openShiftsEnabled;
    /** The provisionStatus property */
    private OperationStatus _provisionStatus;
    /** Additional information about why schedule provisioning failed. */
    private String _provisionStatusCode;
    /** The logical grouping of users in the schedule (usually by role). */
    private java.util.List<SchedulingGroup> _schedulingGroups;
    /** The shifts in the schedule. */
    private java.util.List<Shift> _shifts;
    /** The swapShiftsChangeRequests property */
    private java.util.List<SwapShiftsChangeRequest> _swapShiftsChangeRequests;
    /** Indicates whether swap shifts requests are enabled for the schedule. */
    private Boolean _swapShiftsRequestsEnabled;
    /** Indicates whether time clock is enabled for the schedule. */
    private Boolean _timeClockEnabled;
    /** The set of reasons for a time off in the schedule. */
    private java.util.List<TimeOffReason> _timeOffReasons;
    /** The timeOffRequests property */
    private java.util.List<TimeOffRequest> _timeOffRequests;
    /** Indicates whether time off requests are enabled for the schedule. */
    private Boolean _timeOffRequestsEnabled;
    /** The instances of times off in the schedule. */
    private java.util.List<TimeOff> _timesOff;
    /** Indicates the time zone of the schedule team using tz database format. Required. */
    private String _timeZone;
    /** The workforceIntegrationIds property */
    private java.util.List<String> _workforceIntegrationIds;
    /**
     * Instantiates a new schedule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Schedule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a schedule
     */
    @javax.annotation.Nonnull
    public static Schedule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Schedule();
    }
    /**
     * Gets the enabled property value. Indicates whether the schedule is enabled for the team. Required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this._enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Schedule currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("enabled", (n) -> { currentObject.setEnabled(n.getBooleanValue()); });
            this.put("offerShiftRequests", (n) -> { currentObject.setOfferShiftRequests(n.getCollectionOfObjectValues(OfferShiftRequest::createFromDiscriminatorValue)); });
            this.put("offerShiftRequestsEnabled", (n) -> { currentObject.setOfferShiftRequestsEnabled(n.getBooleanValue()); });
            this.put("openShiftChangeRequests", (n) -> { currentObject.setOpenShiftChangeRequests(n.getCollectionOfObjectValues(OpenShiftChangeRequest::createFromDiscriminatorValue)); });
            this.put("openShifts", (n) -> { currentObject.setOpenShifts(n.getCollectionOfObjectValues(OpenShift::createFromDiscriminatorValue)); });
            this.put("openShiftsEnabled", (n) -> { currentObject.setOpenShiftsEnabled(n.getBooleanValue()); });
            this.put("provisionStatus", (n) -> { currentObject.setProvisionStatus(n.getEnumValue(OperationStatus.class)); });
            this.put("provisionStatusCode", (n) -> { currentObject.setProvisionStatusCode(n.getStringValue()); });
            this.put("schedulingGroups", (n) -> { currentObject.setSchedulingGroups(n.getCollectionOfObjectValues(SchedulingGroup::createFromDiscriminatorValue)); });
            this.put("shifts", (n) -> { currentObject.setShifts(n.getCollectionOfObjectValues(Shift::createFromDiscriminatorValue)); });
            this.put("swapShiftsChangeRequests", (n) -> { currentObject.setSwapShiftsChangeRequests(n.getCollectionOfObjectValues(SwapShiftsChangeRequest::createFromDiscriminatorValue)); });
            this.put("swapShiftsRequestsEnabled", (n) -> { currentObject.setSwapShiftsRequestsEnabled(n.getBooleanValue()); });
            this.put("timeClockEnabled", (n) -> { currentObject.setTimeClockEnabled(n.getBooleanValue()); });
            this.put("timeOffReasons", (n) -> { currentObject.setTimeOffReasons(n.getCollectionOfObjectValues(TimeOffReason::createFromDiscriminatorValue)); });
            this.put("timeOffRequests", (n) -> { currentObject.setTimeOffRequests(n.getCollectionOfObjectValues(TimeOffRequest::createFromDiscriminatorValue)); });
            this.put("timeOffRequestsEnabled", (n) -> { currentObject.setTimeOffRequestsEnabled(n.getBooleanValue()); });
            this.put("timesOff", (n) -> { currentObject.setTimesOff(n.getCollectionOfObjectValues(TimeOff::createFromDiscriminatorValue)); });
            this.put("timeZone", (n) -> { currentObject.setTimeZone(n.getStringValue()); });
            this.put("workforceIntegrationIds", (n) -> { currentObject.setWorkforceIntegrationIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the offerShiftRequests property value. The offerShiftRequests property
     * @return a offerShiftRequest
     */
    @javax.annotation.Nullable
    public java.util.List<OfferShiftRequest> getOfferShiftRequests() {
        return this._offerShiftRequests;
    }
    /**
     * Gets the offerShiftRequestsEnabled property value. Indicates whether offer shift requests are enabled for the schedule.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOfferShiftRequestsEnabled() {
        return this._offerShiftRequestsEnabled;
    }
    /**
     * Gets the openShiftChangeRequests property value. The openShiftChangeRequests property
     * @return a openShiftChangeRequest
     */
    @javax.annotation.Nullable
    public java.util.List<OpenShiftChangeRequest> getOpenShiftChangeRequests() {
        return this._openShiftChangeRequests;
    }
    /**
     * Gets the openShifts property value. The openShifts property
     * @return a openShift
     */
    @javax.annotation.Nullable
    public java.util.List<OpenShift> getOpenShifts() {
        return this._openShifts;
    }
    /**
     * Gets the openShiftsEnabled property value. Indicates whether open shifts are enabled for the schedule.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOpenShiftsEnabled() {
        return this._openShiftsEnabled;
    }
    /**
     * Gets the provisionStatus property value. The provisionStatus property
     * @return a operationStatus
     */
    @javax.annotation.Nullable
    public OperationStatus getProvisionStatus() {
        return this._provisionStatus;
    }
    /**
     * Gets the provisionStatusCode property value. Additional information about why schedule provisioning failed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvisionStatusCode() {
        return this._provisionStatusCode;
    }
    /**
     * Gets the schedulingGroups property value. The logical grouping of users in the schedule (usually by role).
     * @return a schedulingGroup
     */
    @javax.annotation.Nullable
    public java.util.List<SchedulingGroup> getSchedulingGroups() {
        return this._schedulingGroups;
    }
    /**
     * Gets the shifts property value. The shifts in the schedule.
     * @return a shift
     */
    @javax.annotation.Nullable
    public java.util.List<Shift> getShifts() {
        return this._shifts;
    }
    /**
     * Gets the swapShiftsChangeRequests property value. The swapShiftsChangeRequests property
     * @return a swapShiftsChangeRequest
     */
    @javax.annotation.Nullable
    public java.util.List<SwapShiftsChangeRequest> getSwapShiftsChangeRequests() {
        return this._swapShiftsChangeRequests;
    }
    /**
     * Gets the swapShiftsRequestsEnabled property value. Indicates whether swap shifts requests are enabled for the schedule.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSwapShiftsRequestsEnabled() {
        return this._swapShiftsRequestsEnabled;
    }
    /**
     * Gets the timeClockEnabled property value. Indicates whether time clock is enabled for the schedule.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTimeClockEnabled() {
        return this._timeClockEnabled;
    }
    /**
     * Gets the timeOffReasons property value. The set of reasons for a time off in the schedule.
     * @return a timeOffReason
     */
    @javax.annotation.Nullable
    public java.util.List<TimeOffReason> getTimeOffReasons() {
        return this._timeOffReasons;
    }
    /**
     * Gets the timeOffRequests property value. The timeOffRequests property
     * @return a timeOffRequest
     */
    @javax.annotation.Nullable
    public java.util.List<TimeOffRequest> getTimeOffRequests() {
        return this._timeOffRequests;
    }
    /**
     * Gets the timeOffRequestsEnabled property value. Indicates whether time off requests are enabled for the schedule.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTimeOffRequestsEnabled() {
        return this._timeOffRequestsEnabled;
    }
    /**
     * Gets the timesOff property value. The instances of times off in the schedule.
     * @return a timeOff
     */
    @javax.annotation.Nullable
    public java.util.List<TimeOff> getTimesOff() {
        return this._timesOff;
    }
    /**
     * Gets the timeZone property value. Indicates the time zone of the schedule team using tz database format. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeZone() {
        return this._timeZone;
    }
    /**
     * Gets the workforceIntegrationIds property value. The workforceIntegrationIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getWorkforceIntegrationIds() {
        return this._workforceIntegrationIds;
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
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeCollectionOfObjectValues("offerShiftRequests", this.getOfferShiftRequests());
        writer.writeBooleanValue("offerShiftRequestsEnabled", this.getOfferShiftRequestsEnabled());
        writer.writeCollectionOfObjectValues("openShiftChangeRequests", this.getOpenShiftChangeRequests());
        writer.writeCollectionOfObjectValues("openShifts", this.getOpenShifts());
        writer.writeBooleanValue("openShiftsEnabled", this.getOpenShiftsEnabled());
        writer.writeEnumValue("provisionStatus", this.getProvisionStatus());
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enabled = value;
    }
    /**
     * Sets the offerShiftRequests property value. The offerShiftRequests property
     * @param value Value to set for the offerShiftRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfferShiftRequests(@javax.annotation.Nullable final java.util.List<OfferShiftRequest> value) {
        this._offerShiftRequests = value;
    }
    /**
     * Sets the offerShiftRequestsEnabled property value. Indicates whether offer shift requests are enabled for the schedule.
     * @param value Value to set for the offerShiftRequestsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfferShiftRequestsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._offerShiftRequestsEnabled = value;
    }
    /**
     * Sets the openShiftChangeRequests property value. The openShiftChangeRequests property
     * @param value Value to set for the openShiftChangeRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOpenShiftChangeRequests(@javax.annotation.Nullable final java.util.List<OpenShiftChangeRequest> value) {
        this._openShiftChangeRequests = value;
    }
    /**
     * Sets the openShifts property value. The openShifts property
     * @param value Value to set for the openShifts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOpenShifts(@javax.annotation.Nullable final java.util.List<OpenShift> value) {
        this._openShifts = value;
    }
    /**
     * Sets the openShiftsEnabled property value. Indicates whether open shifts are enabled for the schedule.
     * @param value Value to set for the openShiftsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOpenShiftsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._openShiftsEnabled = value;
    }
    /**
     * Sets the provisionStatus property value. The provisionStatus property
     * @param value Value to set for the provisionStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisionStatus(@javax.annotation.Nullable final OperationStatus value) {
        this._provisionStatus = value;
    }
    /**
     * Sets the provisionStatusCode property value. Additional information about why schedule provisioning failed.
     * @param value Value to set for the provisionStatusCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisionStatusCode(@javax.annotation.Nullable final String value) {
        this._provisionStatusCode = value;
    }
    /**
     * Sets the schedulingGroups property value. The logical grouping of users in the schedule (usually by role).
     * @param value Value to set for the schedulingGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchedulingGroups(@javax.annotation.Nullable final java.util.List<SchedulingGroup> value) {
        this._schedulingGroups = value;
    }
    /**
     * Sets the shifts property value. The shifts in the schedule.
     * @param value Value to set for the shifts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShifts(@javax.annotation.Nullable final java.util.List<Shift> value) {
        this._shifts = value;
    }
    /**
     * Sets the swapShiftsChangeRequests property value. The swapShiftsChangeRequests property
     * @param value Value to set for the swapShiftsChangeRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSwapShiftsChangeRequests(@javax.annotation.Nullable final java.util.List<SwapShiftsChangeRequest> value) {
        this._swapShiftsChangeRequests = value;
    }
    /**
     * Sets the swapShiftsRequestsEnabled property value. Indicates whether swap shifts requests are enabled for the schedule.
     * @param value Value to set for the swapShiftsRequestsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSwapShiftsRequestsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._swapShiftsRequestsEnabled = value;
    }
    /**
     * Sets the timeClockEnabled property value. Indicates whether time clock is enabled for the schedule.
     * @param value Value to set for the timeClockEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeClockEnabled(@javax.annotation.Nullable final Boolean value) {
        this._timeClockEnabled = value;
    }
    /**
     * Sets the timeOffReasons property value. The set of reasons for a time off in the schedule.
     * @param value Value to set for the timeOffReasons property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeOffReasons(@javax.annotation.Nullable final java.util.List<TimeOffReason> value) {
        this._timeOffReasons = value;
    }
    /**
     * Sets the timeOffRequests property value. The timeOffRequests property
     * @param value Value to set for the timeOffRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeOffRequests(@javax.annotation.Nullable final java.util.List<TimeOffRequest> value) {
        this._timeOffRequests = value;
    }
    /**
     * Sets the timeOffRequestsEnabled property value. Indicates whether time off requests are enabled for the schedule.
     * @param value Value to set for the timeOffRequestsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeOffRequestsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._timeOffRequestsEnabled = value;
    }
    /**
     * Sets the timesOff property value. The instances of times off in the schedule.
     * @param value Value to set for the timesOff property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimesOff(@javax.annotation.Nullable final java.util.List<TimeOff> value) {
        this._timesOff = value;
    }
    /**
     * Sets the timeZone property value. Indicates the time zone of the schedule team using tz database format. Required.
     * @param value Value to set for the timeZone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeZone(@javax.annotation.Nullable final String value) {
        this._timeZone = value;
    }
    /**
     * Sets the workforceIntegrationIds property value. The workforceIntegrationIds property
     * @param value Value to set for the workforceIntegrationIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkforceIntegrationIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._workforceIntegrationIds = value;
    }
}
