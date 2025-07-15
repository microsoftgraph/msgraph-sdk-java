package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventSession extends OnlineMeetingBase implements Parsable {
    /**
     * Instantiates a new {@link VirtualEventSession} and sets the default values.
     */
    public VirtualEventSession() {
        super();
        this.setOdataType("#microsoft.graph.virtualEventSession");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventSession}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventSession createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventSession();
    }
    /**
     * Gets the endDateTime property value. The virtual event session end time.
     * @return a {@link DateTimeTimeZone}
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("videoOnDemandWebUrl", (n) -> { this.setVideoOnDemandWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the startDateTime property value. The virtual event session start time.
     * @return a {@link DateTimeTimeZone}
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the videoOnDemandWebUrl property value. The URL of the video on demand (VOD) for Microsoft Teams events that allows webinar and town hall organizers to quickly publish and share event recordings.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoOnDemandWebUrl() {
        return this.backingStore.get("videoOnDemandWebUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("endDateTime", this.getEndDateTime());
        writer.writeObjectValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("videoOnDemandWebUrl", this.getVideoOnDemandWebUrl());
    }
    /**
     * Sets the endDateTime property value. The virtual event session end time.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the startDateTime property value. The virtual event session start time.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the videoOnDemandWebUrl property value. The URL of the video on demand (VOD) for Microsoft Teams events that allows webinar and town hall organizers to quickly publish and share event recordings.
     * @param value Value to set for the videoOnDemandWebUrl property.
     */
    public void setVideoOnDemandWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("videoOnDemandWebUrl", value);
    }
}
