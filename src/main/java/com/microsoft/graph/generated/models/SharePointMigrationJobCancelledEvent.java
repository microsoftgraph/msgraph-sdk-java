package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointMigrationJobCancelledEvent extends SharePointMigrationEvent implements Parsable {
    /**
     * Instantiates a new {@link SharePointMigrationJobCancelledEvent} and sets the default values.
     */
    public SharePointMigrationJobCancelledEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMigrationJobCancelledEvent}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMigrationJobCancelledEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointMigrationJobCancelledEvent();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isCancelledByUser", (n) -> { this.setIsCancelledByUser(n.getBooleanValue()); });
        deserializerMap.put("totalRetryCount", (n) -> { this.setTotalRetryCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCancelledByUser property value. True when a user cancels the job; otherwise, false. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCancelledByUser() {
        return this.backingStore.get("isCancelledByUser");
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
        writer.writeBooleanValue("isCancelledByUser", this.getIsCancelledByUser());
        writer.writeIntegerValue("totalRetryCount", this.getTotalRetryCount());
    }
    /**
     * Sets the isCancelledByUser property value. True when a user cancels the job; otherwise, false. Read-only.
     * @param value Value to set for the isCancelledByUser property.
     */
    public void setIsCancelledByUser(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCancelledByUser", value);
    }
    /**
     * Sets the totalRetryCount property value. The current retry count of the job. Read-only.
     * @param value Value to set for the totalRetryCount property.
     */
    public void setTotalRetryCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalRetryCount", value);
    }
}
