package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeetingTimeSuggestion implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore backingStore;
    /**
     * Instantiates a new MeetingTimeSuggestion and sets the default values.
     */
    public MeetingTimeSuggestion() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MeetingTimeSuggestion
     */
    @jakarta.annotation.Nonnull
    public static MeetingTimeSuggestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingTimeSuggestion();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the attendeeAvailability property value. An array that shows the availability status of each attendee for this meeting suggestion.
     * @return a java.util.List<AttendeeAvailability>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttendeeAvailability> getAttendeeAvailability() {
        return this.backingStore.get("attendeeAvailability");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the confidence property value. A percentage that represents the likelhood of all the attendees attending.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getConfidence() {
        return this.backingStore.get("confidence");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("attendeeAvailability", (n) -> { this.setAttendeeAvailability(n.getCollectionOfObjectValues(AttendeeAvailability::createFromDiscriminatorValue)); });
        deserializerMap.put("confidence", (n) -> { this.setConfidence(n.getDoubleValue()); });
        deserializerMap.put("locations", (n) -> { this.setLocations(n.getCollectionOfObjectValues(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingTimeSlot", (n) -> { this.setMeetingTimeSlot(n.getObjectValue(TimeSlot::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("order", (n) -> { this.setOrder(n.getIntegerValue()); });
        deserializerMap.put("organizerAvailability", (n) -> { this.setOrganizerAvailability(n.getEnumValue(FreeBusyStatus.class)); });
        deserializerMap.put("suggestionReason", (n) -> { this.setSuggestionReason(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the locations property value. An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
     * @return a java.util.List<Location>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Location> getLocations() {
        return this.backingStore.get("locations");
    }
    /**
     * Gets the meetingTimeSlot property value. A time period suggested for the meeting.
     * @return a TimeSlot
     */
    @jakarta.annotation.Nullable
    public TimeSlot getMeetingTimeSlot() {
        return this.backingStore.get("meetingTimeSlot");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the order property value. Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if there are suggestions with the same confidence.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOrder() {
        return this.backingStore.get("order");
    }
    /**
     * Gets the organizerAvailability property value. Availability of the meeting organizer for this meeting suggestion. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @return a FreeBusyStatus
     */
    @jakarta.annotation.Nullable
    public FreeBusyStatus getOrganizerAvailability() {
        return this.backingStore.get("organizerAvailability");
    }
    /**
     * Gets the suggestionReason property value. Reason for suggesting the meeting time.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSuggestionReason() {
        return this.backingStore.get("suggestionReason");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attendeeAvailability", this.getAttendeeAvailability());
        writer.writeDoubleValue("confidence", this.getConfidence());
        writer.writeCollectionOfObjectValues("locations", this.getLocations());
        writer.writeObjectValue("meetingTimeSlot", this.getMeetingTimeSlot());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("order", this.getOrder());
        writer.writeEnumValue("organizerAvailability", this.getOrganizerAvailability());
        writer.writeStringValue("suggestionReason", this.getSuggestionReason());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the attendeeAvailability property value. An array that shows the availability status of each attendee for this meeting suggestion.
     * @param value Value to set for the attendeeAvailability property.
     */
    public void setAttendeeAvailability(@jakarta.annotation.Nullable final java.util.List<AttendeeAvailability> value) {
        this.backingStore.set("attendeeAvailability", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the confidence property value. A percentage that represents the likelhood of all the attendees attending.
     * @param value Value to set for the confidence property.
     */
    public void setConfidence(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("confidence", value);
    }
    /**
     * Sets the locations property value. An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
     * @param value Value to set for the locations property.
     */
    public void setLocations(@jakarta.annotation.Nullable final java.util.List<Location> value) {
        this.backingStore.set("locations", value);
    }
    /**
     * Sets the meetingTimeSlot property value. A time period suggested for the meeting.
     * @param value Value to set for the meetingTimeSlot property.
     */
    public void setMeetingTimeSlot(@jakarta.annotation.Nullable final TimeSlot value) {
        this.backingStore.set("meetingTimeSlot", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the order property value. Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if there are suggestions with the same confidence.
     * @param value Value to set for the order property.
     */
    public void setOrder(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("order", value);
    }
    /**
     * Sets the organizerAvailability property value. Availability of the meeting organizer for this meeting suggestion. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @param value Value to set for the organizerAvailability property.
     */
    public void setOrganizerAvailability(@jakarta.annotation.Nullable final FreeBusyStatus value) {
        this.backingStore.set("organizerAvailability", value);
    }
    /**
     * Sets the suggestionReason property value. Reason for suggesting the meeting time.
     * @param value Value to set for the suggestionReason property.
     */
    public void setSuggestionReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("suggestionReason", value);
    }
}
