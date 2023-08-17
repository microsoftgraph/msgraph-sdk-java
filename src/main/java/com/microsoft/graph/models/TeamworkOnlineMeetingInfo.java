package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkOnlineMeetingInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The identifier of the calendar event associated with the meeting.
     */
    private String calendarEventId;
    /**
     * The URL that users click to join or uniquely identify the meeting.
     */
    private String joinWebUrl;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The organizer of the meeting.
     */
    private TeamworkUserIdentity organizer;
    /**
     * Instantiates a new teamworkOnlineMeetingInfo and sets the default values.
     */
    public TeamworkOnlineMeetingInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkOnlineMeetingInfo
     */
    @jakarta.annotation.Nonnull
    public static TeamworkOnlineMeetingInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkOnlineMeetingInfo();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the calendarEventId property value. The identifier of the calendar event associated with the meeting.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCalendarEventId() {
        return this.calendarEventId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("calendarEventId", (n) -> { this.setCalendarEventId(n.getStringValue()); });
        deserializerMap.put("joinWebUrl", (n) -> { this.setJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organizer", (n) -> { this.setOrganizer(n.getObjectValue(TeamworkUserIdentity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the joinWebUrl property value. The URL that users click to join or uniquely identify the meeting.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJoinWebUrl() {
        return this.joinWebUrl;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the organizer property value. The organizer of the meeting.
     * @return a teamworkUserIdentity
     */
    @jakarta.annotation.Nullable
    public TeamworkUserIdentity getOrganizer() {
        return this.organizer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("calendarEventId", this.getCalendarEventId());
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("organizer", this.getOrganizer());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the calendarEventId property value. The identifier of the calendar event associated with the meeting.
     * @param value Value to set for the calendarEventId property.
     */
    public void setCalendarEventId(@jakarta.annotation.Nullable final String value) {
        this.calendarEventId = value;
    }
    /**
     * Sets the joinWebUrl property value. The URL that users click to join or uniquely identify the meeting.
     * @param value Value to set for the joinWebUrl property.
     */
    public void setJoinWebUrl(@jakarta.annotation.Nullable final String value) {
        this.joinWebUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the organizer property value. The organizer of the meeting.
     * @param value Value to set for the organizer property.
     */
    public void setOrganizer(@jakarta.annotation.Nullable final TeamworkUserIdentity value) {
        this.organizer = value;
    }
}
