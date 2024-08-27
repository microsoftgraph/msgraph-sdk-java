package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RestorePoint extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RestorePoint} and sets the default values.
     */
    public RestorePoint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RestorePoint}
     */
    @jakarta.annotation.Nonnull
    public static RestorePoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RestorePoint();
    }
    /**
     * Gets the expirationDateTime property value. Expiration date time of the restore point.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("protectionDateTime", (n) -> { this.setProtectionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("protectionUnit", (n) -> { this.setProtectionUnit(n.getObjectValue(ProtectionUnitBase::createFromDiscriminatorValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getEnumSetValue(RestorePointTags::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the protectionDateTime property value. Date time when the restore point was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProtectionDateTime() {
        return this.backingStore.get("protectionDateTime");
    }
    /**
     * Gets the protectionUnit property value. The site, drive, or mailbox units that are protected under a protection policy.
     * @return a {@link ProtectionUnitBase}
     */
    @jakarta.annotation.Nullable
    public ProtectionUnitBase getProtectionUnit() {
        return this.backingStore.get("protectionUnit");
    }
    /**
     * Gets the tags property value. The type of the restore point. The possible values are: none, fastRestore, unknownFutureValue.
     * @return a {@link EnumSet<RestorePointTags>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<RestorePointTags> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("protectionDateTime", this.getProtectionDateTime());
        writer.writeObjectValue("protectionUnit", this.getProtectionUnit());
        writer.writeEnumSetValue("tags", this.getTags());
    }
    /**
     * Sets the expirationDateTime property value. Expiration date time of the restore point.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the protectionDateTime property value. Date time when the restore point was created.
     * @param value Value to set for the protectionDateTime property.
     */
    public void setProtectionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("protectionDateTime", value);
    }
    /**
     * Sets the protectionUnit property value. The site, drive, or mailbox units that are protected under a protection policy.
     * @param value Value to set for the protectionUnit property.
     */
    public void setProtectionUnit(@jakarta.annotation.Nullable final ProtectionUnitBase value) {
        this.backingStore.set("protectionUnit", value);
    }
    /**
     * Sets the tags property value. The type of the restore point. The possible values are: none, fastRestore, unknownFutureValue.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final EnumSet<RestorePointTags> value) {
        this.backingStore.set("tags", value);
    }
}
