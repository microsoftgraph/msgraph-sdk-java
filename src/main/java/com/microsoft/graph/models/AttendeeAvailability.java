package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttendeeAvailability implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The email address and type of attendee - whether it's a person or a resource, and whether required or optional if it's a person. */
    private AttendeeBase _attendee;
    /** The availability status of the attendee. Possible values are: free, tentative, busy, oof, workingElsewhere, unknown. */
    private FreeBusyStatus _availability;
    /**
     * Instantiates a new attendeeAvailability and sets the default values.
     * @return a void
     */
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
        return this._additionalData;
    }
    /**
     * Gets the attendee property value. The email address and type of attendee - whether it's a person or a resource, and whether required or optional if it's a person.
     * @return a attendeeBase
     */
    @javax.annotation.Nullable
    public AttendeeBase getAttendee() {
        return this._attendee;
    }
    /**
     * Gets the availability property value. The availability status of the attendee. Possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @return a freeBusyStatus
     */
    @javax.annotation.Nullable
    public FreeBusyStatus getAvailability() {
        return this._availability;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttendeeAvailability currentObject = this;
        return new HashMap<>(2) {{
            this.put("attendee", (n) -> { currentObject.setAttendee(n.getObjectValue(AttendeeBase::createFromDiscriminatorValue)); });
            this.put("availability", (n) -> { currentObject.setAvailability(n.getEnumValue(FreeBusyStatus.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("attendee", this.getAttendee());
        writer.writeEnumValue("availability", this.getAvailability());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the attendee property value. The email address and type of attendee - whether it's a person or a resource, and whether required or optional if it's a person.
     * @param value Value to set for the attendee property.
     * @return a void
     */
    public void setAttendee(@javax.annotation.Nullable final AttendeeBase value) {
        this._attendee = value;
    }
    /**
     * Sets the availability property value. The availability status of the attendee. Possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @param value Value to set for the availability property.
     * @return a void
     */
    public void setAvailability(@javax.annotation.Nullable final FreeBusyStatus value) {
        this._availability = value;
    }
}
