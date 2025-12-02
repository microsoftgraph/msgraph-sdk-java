package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointMigrationJobStartEvent extends SharePointMigrationEvent implements Parsable {
    /**
     * Instantiates a new {@link SharePointMigrationJobStartEvent} and sets the default values.
     */
    public SharePointMigrationJobStartEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMigrationJobStartEvent}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMigrationJobStartEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointMigrationJobStartEvent();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isRestarted", (n) -> { this.setIsRestarted(n.getBooleanValue()); });
        deserializerMap.put("totalRetryCount", (n) -> { this.setTotalRetryCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRestarted property value. True if the job is restarted. False if it&apos;s the initial start. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRestarted() {
        return this.backingStore.get("isRestarted");
    }
    /**
     * Gets the totalRetryCount property value. The current retry count of the job. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalRetryCount() {
        return this.backingStore.get("totalRetryCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isRestarted", this.getIsRestarted());
        writer.writeIntegerValue("totalRetryCount", this.getTotalRetryCount());
    }
    /**
     * Sets the isRestarted property value. True if the job is restarted. False if it&apos;s the initial start. Read-only.
     * @param value Value to set for the isRestarted property.
     */
    public void setIsRestarted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRestarted", value);
    }
    /**
     * Sets the totalRetryCount property value. The current retry count of the job. Read-only.
     * @param value Value to set for the totalRetryCount property.
     */
    public void setTotalRetryCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalRetryCount", value);
    }
}
