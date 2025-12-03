package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointMigrationJobErrorEvent extends SharePointMigrationEvent implements Parsable {
    /**
     * Instantiates a new {@link SharePointMigrationJobErrorEvent} and sets the default values.
     */
    public SharePointMigrationJobErrorEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMigrationJobErrorEvent}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMigrationJobErrorEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointMigrationJobErrorEvent();
    }
    /**
     * Gets the error property value. The error property
     * @return a {@link PublicError}
     */
    @jakarta.annotation.Nullable
    public PublicError getError() {
        return this.backingStore.get("error");
    }
    /**
     * Gets the errorLevel property value. The errorLevel property
     * @return a {@link SharePointMigrationJobErrorLevel}
     */
    @jakarta.annotation.Nullable
    public SharePointMigrationJobErrorLevel getErrorLevel() {
        return this.backingStore.get("errorLevel");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("errorLevel", (n) -> { this.setErrorLevel(n.getEnumValue(SharePointMigrationJobErrorLevel::forValue)); });
        deserializerMap.put("objectId", (n) -> { this.setObjectId(n.getStringValue()); });
        deserializerMap.put("objectType", (n) -> { this.setObjectType(n.getEnumValue(SharePointMigrationObjectType::forValue)); });
        deserializerMap.put("objectUrl", (n) -> { this.setObjectUrl(n.getStringValue()); });
        deserializerMap.put("totalRetryCount", (n) -> { this.setTotalRetryCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the objectId property value. The object ID. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObjectId() {
        return this.backingStore.get("objectId");
    }
    /**
     * Gets the objectType property value. The objectType property
     * @return a {@link SharePointMigrationObjectType}
     */
    @jakarta.annotation.Nullable
    public SharePointMigrationObjectType getObjectType() {
        return this.backingStore.get("objectType");
    }
    /**
     * Gets the objectUrl property value. The object URL. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObjectUrl() {
        return this.backingStore.get("objectUrl");
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
        writer.writeObjectValue("error", this.getError());
        writer.writeEnumValue("errorLevel", this.getErrorLevel());
        writer.writeStringValue("objectId", this.getObjectId());
        writer.writeEnumValue("objectType", this.getObjectType());
        writer.writeStringValue("objectUrl", this.getObjectUrl());
        writer.writeIntegerValue("totalRetryCount", this.getTotalRetryCount());
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the errorLevel property value. The errorLevel property
     * @param value Value to set for the errorLevel property.
     */
    public void setErrorLevel(@jakarta.annotation.Nullable final SharePointMigrationJobErrorLevel value) {
        this.backingStore.set("errorLevel", value);
    }
    /**
     * Sets the objectId property value. The object ID. Read-only.
     * @param value Value to set for the objectId property.
     */
    public void setObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("objectId", value);
    }
    /**
     * Sets the objectType property value. The objectType property
     * @param value Value to set for the objectType property.
     */
    public void setObjectType(@jakarta.annotation.Nullable final SharePointMigrationObjectType value) {
        this.backingStore.set("objectType", value);
    }
    /**
     * Sets the objectUrl property value. The object URL. Read-only.
     * @param value Value to set for the objectUrl property.
     */
    public void setObjectUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("objectUrl", value);
    }
    /**
     * Sets the totalRetryCount property value. The current retry count of the job. Read-only.
     * @param value Value to set for the totalRetryCount property.
     */
    public void setTotalRetryCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalRetryCount", value);
    }
}
