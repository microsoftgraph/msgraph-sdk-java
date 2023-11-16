package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostPair extends Entity implements Parsable {
    /**
     * Instantiates a new HostPair and sets the default values.
     */
    public HostPair() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HostPair
     */
    @jakarta.annotation.Nonnull
    public static HostPair createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostPair();
    }
    /**
     * Gets the childHost property value. The childHost property
     * @return a Host
     */
    @jakarta.annotation.Nullable
    public Host getChildHost() {
        return this.BackingStore.get("childHost");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("childHost", (n) -> { this.setChildHost(n.getObjectValue(Host::createFromDiscriminatorValue)); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("linkKind", (n) -> { this.setLinkKind(n.getStringValue()); });
        deserializerMap.put("parentHost", (n) -> { this.setParentHost(n.getObjectValue(Host::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The date and time when Microsoft Defender Threat Intelligence first observed the hostPair. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.BackingStore.get("firstSeenDateTime");
    }
    /**
     * Gets the lastSeenDateTime property value. The date and time when Microsoft Defender Threat Intelligence last observed the hostPair. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.BackingStore.get("lastSeenDateTime");
    }
    /**
     * Gets the linkKind property value. The reason that two hosts are identified as hostPair.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLinkKind() {
        return this.BackingStore.get("linkKind");
    }
    /**
     * Gets the parentHost property value. The parentHost property
     * @return a Host
     */
    @jakarta.annotation.Nullable
    public Host getParentHost() {
        return this.BackingStore.get("parentHost");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("childHost", this.getChildHost());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("linkKind", this.getLinkKind());
        writer.writeObjectValue("parentHost", this.getParentHost());
    }
    /**
     * Sets the childHost property value. The childHost property
     * @param value Value to set for the childHost property.
     */
    public void setChildHost(@jakarta.annotation.Nullable final Host value) {
        this.BackingStore.set("childHost", value);
    }
    /**
     * Sets the firstSeenDateTime property value. The date and time when Microsoft Defender Threat Intelligence first observed the hostPair. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("firstSeenDateTime", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The date and time when Microsoft Defender Threat Intelligence last observed the hostPair. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastSeenDateTime", value);
    }
    /**
     * Sets the linkKind property value. The reason that two hosts are identified as hostPair.
     * @param value Value to set for the linkKind property.
     */
    public void setLinkKind(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("linkKind", value);
    }
    /**
     * Sets the parentHost property value. The parentHost property
     * @param value Value to set for the parentHost property.
     */
    public void setParentHost(@jakarta.annotation.Nullable final Host value) {
        this.BackingStore.set("parentHost", value);
    }
}
