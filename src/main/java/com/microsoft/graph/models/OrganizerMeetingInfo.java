package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OrganizerMeetingInfo extends MeetingInfo implements Parsable {
    /**
     * The organizer property
     */
    private IdentitySet organizer;
    /**
     * Instantiates a new organizerMeetingInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizerMeetingInfo() {
        super();
        this.setOdataType("#microsoft.graph.organizerMeetingInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizerMeetingInfo
     */
    @javax.annotation.Nonnull
    public static OrganizerMeetingInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizerMeetingInfo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("organizer", (n) -> { this.setOrganizer(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the organizer property value. The organizer property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getOrganizer() {
        return this.organizer;
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
        writer.writeObjectValue("organizer", this.getOrganizer());
    }
    /**
     * Sets the organizer property value. The organizer property
     * @param value Value to set for the organizer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizer(@javax.annotation.Nullable final IdentitySet value) {
        this.organizer = value;
    }
}
