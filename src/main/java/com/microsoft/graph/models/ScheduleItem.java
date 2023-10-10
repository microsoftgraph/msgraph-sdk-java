package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ScheduleItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date, time, and time zone that the corresponding event ends.
     */
    private DateTimeTimeZone end;
    /**
     * The sensitivity of the corresponding event. True if the event is marked private, false otherwise. Optional.
     */
    private Boolean isPrivate;
    /**
     * The location where the corresponding event is held or attended from. Optional.
     */
    private String location;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The date, time, and time zone that the corresponding event starts.
     */
    private DateTimeTimeZone start;
    /**
     * The availability status of the user or resource during the corresponding event. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     */
    private FreeBusyStatus status;
    /**
     * The corresponding event's subject line. Optional.
     */
    private String subject;
    /**
     * Instantiates a new ScheduleItem and sets the default values.
     */
    public ScheduleItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ScheduleItem
     */
    @jakarta.annotation.Nonnull
    public static ScheduleItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScheduleItem();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the end property value. The date, time, and time zone that the corresponding event ends.
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getEnd() {
        return this.end;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("end", (n) -> { this.setEnd(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("isPrivate", (n) -> { this.setIsPrivate(n.getBooleanValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("start", (n) -> { this.setStart(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(FreeBusyStatus.class)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isPrivate property value. The sensitivity of the corresponding event. True if the event is marked private, false otherwise. Optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPrivate() {
        return this.isPrivate;
    }
    /**
     * Gets the location property value. The location where the corresponding event is held or attended from. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocation() {
        return this.location;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the start property value. The date, time, and time zone that the corresponding event starts.
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getStart() {
        return this.start;
    }
    /**
     * Gets the status property value. The availability status of the user or resource during the corresponding event. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @return a FreeBusyStatus
     */
    @jakarta.annotation.Nullable
    public FreeBusyStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the subject property value. The corresponding event's subject line. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("end", this.getEnd());
        writer.writeBooleanValue("isPrivate", this.getIsPrivate());
        writer.writeStringValue("location", this.getLocation());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("start", this.getStart());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the end property value. The date, time, and time zone that the corresponding event ends.
     * @param value Value to set for the end property.
     */
    public void setEnd(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.end = value;
    }
    /**
     * Sets the isPrivate property value. The sensitivity of the corresponding event. True if the event is marked private, false otherwise. Optional.
     * @param value Value to set for the isPrivate property.
     */
    public void setIsPrivate(@jakarta.annotation.Nullable final Boolean value) {
        this.isPrivate = value;
    }
    /**
     * Sets the location property value. The location where the corresponding event is held or attended from. Optional.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final String value) {
        this.location = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the start property value. The date, time, and time zone that the corresponding event starts.
     * @param value Value to set for the start property.
     */
    public void setStart(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.start = value;
    }
    /**
     * Sets the status property value. The availability status of the user or resource during the corresponding event. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final FreeBusyStatus value) {
        this.status = value;
    }
    /**
     * Sets the subject property value. The corresponding event's subject line. Optional.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
}
