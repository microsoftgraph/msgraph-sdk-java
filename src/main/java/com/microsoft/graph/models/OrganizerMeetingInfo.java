package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OrganizerMeetingInfo extends MeetingInfo implements Parsable {
    /** The organizer property */
    private IdentitySet _organizer;
    /**
     * Instantiates a new OrganizerMeetingInfo and sets the default values.
     * @return a void
     */
    public OrganizerMeetingInfo() {
        super();
        this.setOdataType("#microsoft.graph.organizerMeetingInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizerMeetingInfo
     */
    @javax.annotation.Nonnull
    public static OrganizerMeetingInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizerMeetingInfo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizerMeetingInfo currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("organizer", (n) -> { currentObject.setOrganizer(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the organizer property value. The organizer property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getOrganizer() {
        return this._organizer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("organizer", this.getOrganizer());
    }
    /**
     * Sets the organizer property value. The organizer property
     * @param value Value to set for the organizer property.
     * @return a void
     */
    public void setOrganizer(@javax.annotation.Nullable final IdentitySet value) {
        this._organizer = value;
    }
}
