package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DataPolicyOperation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DataPolicyOperation} and sets the default values.
     */
    public DataPolicyOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DataPolicyOperation}
     */
    @jakarta.annotation.Nonnull
    public static DataPolicyOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataPolicyOperation();
    }
    /**
     * Gets the completedDateTime property value. Represents when the request for this data policy operation was completed, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Null until the operation completes.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("progress", (n) -> { this.setProgress(n.getObjectValue(DataPolicyOperationProgress::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DataPolicyOperationStatus::forValue)); });
        deserializerMap.put("storageLocation", (n) -> { this.setStorageLocation(n.getStringValue()); });
        deserializerMap.put("submittedDateTime", (n) -> { this.setSubmittedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the progress property value. Specifies the progress of an operation.
     * @return a {@link DataPolicyOperationProgress}
     */
    @jakarta.annotation.Nullable
    public DataPolicyOperationProgress getProgress() {
        return this.backingStore.get("progress");
    }
    /**
     * Gets the status property value. Possible values are: notStarted, running, complete, failed, unknownFutureValue.
     * @return a {@link DataPolicyOperationStatus}
     */
    @jakarta.annotation.Nullable
    public DataPolicyOperationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the storageLocation property value. The URL location to where data is being exported for export requests.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStorageLocation() {
        return this.backingStore.get("storageLocation");
    }
    /**
     * Gets the submittedDateTime property value. Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubmittedDateTime() {
        return this.backingStore.get("submittedDateTime");
    }
    /**
     * Gets the userId property value. The id for the user on whom the operation is performed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeObjectValue("progress", this.getProgress());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("storageLocation", this.getStorageLocation());
        writer.writeOffsetDateTimeValue("submittedDateTime", this.getSubmittedDateTime());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the completedDateTime property value. Represents when the request for this data policy operation was completed, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Null until the operation completes.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the progress property value. Specifies the progress of an operation.
     * @param value Value to set for the progress property.
     */
    public void setProgress(@jakarta.annotation.Nullable final DataPolicyOperationProgress value) {
        this.backingStore.set("progress", value);
    }
    /**
     * Sets the status property value. Possible values are: notStarted, running, complete, failed, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DataPolicyOperationStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the storageLocation property value. The URL location to where data is being exported for export requests.
     * @param value Value to set for the storageLocation property.
     */
    public void setStorageLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("storageLocation", value);
    }
    /**
     * Sets the submittedDateTime property value. Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the submittedDateTime property.
     */
    public void setSubmittedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("submittedDateTime", value);
    }
    /**
     * Sets the userId property value. The id for the user on whom the operation is performed.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class DataPolicyOperationProgress implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link DataPolicyOperationProgress} and sets the default values.
         */
        public DataPolicyOperationProgress() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link DataPolicyOperationProgress}
         */
        @jakarta.annotation.Nonnull
        public static DataPolicyOperationProgress createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final DataPolicyOperationProgress result = new DataPolicyOperationProgress();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
}
