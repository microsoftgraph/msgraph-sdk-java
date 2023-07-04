package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttendeeAvailability implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The email address and type of attendee - whether it's a person or a resource, and whether required or optional if it's a person.
     */
    private AttendeeBase attendee;
    /**
     * The availability status of the attendee. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     */
    private FreeBusyStatus availability;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new attendeeAvailability and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AttendeeAvailability() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attendeeAvailability
     */
    @javax.annotation.Nonnull
    public static AttendeeAvailability createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttendeeAvailability();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the attendee property value. The email address and type of attendee - whether it's a person or a resource, and whether required or optional if it's a person.
     * @return a attendeeBase
     */
    @javax.annotation.Nullable
    public AttendeeBase getAttendee() {
        return this.attendee;
    }
    /**
     * Gets the availability property value. The availability status of the attendee. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @return a freeBusyStatus
     */
    @javax.annotation.Nullable
    public FreeBusyStatus getAvailability() {
        return this.availability;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("attendee", (n) -> { this.setAttendee(n.getObjectValue(AttendeeBase::createFromDiscriminatorValue)); });
        deserializerMap.put("availability", (n) -> { this.setAvailability(n.getEnumValue(FreeBusyStatus.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("attendee", this.getAttendee());
        writer.writeEnumValue("availability", this.getAvailability());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attendee property value. The email address and type of attendee - whether it's a person or a resource, and whether required or optional if it's a person.
     * @param value Value to set for the attendee property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttendee(@javax.annotation.Nullable final AttendeeBase value) {
        this.attendee = value;
    }
    /**
     * Sets the availability property value. The availability status of the attendee. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @param value Value to set for the availability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailability(@javax.annotation.Nullable final FreeBusyStatus value) {
        this.availability = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
