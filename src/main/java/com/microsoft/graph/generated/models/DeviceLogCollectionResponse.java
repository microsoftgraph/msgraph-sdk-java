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
import java.util.UUID;
/**
 * Windows Log Collection request entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceLogCollectionResponse extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceLogCollectionResponse} and sets the default values.
     */
    public DeviceLogCollectionResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceLogCollectionResponse}
     */
    @jakarta.annotation.Nonnull
    public static DeviceLogCollectionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceLogCollectionResponse();
    }
    /**
     * Gets the enrolledByUser property value. The User Principal Name (UPN) of the user that enrolled the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEnrolledByUser() {
        return this.backingStore.get("enrolledByUser");
    }
    /**
     * Gets the expirationDateTimeUTC property value. The DateTime of the expiration of the logs.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTimeUTC() {
        return this.backingStore.get("expirationDateTimeUTC");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enrolledByUser", (n) -> { this.setEnrolledByUser(n.getStringValue()); });
        deserializerMap.put("expirationDateTimeUTC", (n) -> { this.setExpirationDateTimeUTC(n.getOffsetDateTimeValue()); });
        deserializerMap.put("initiatedByUserPrincipalName", (n) -> { this.setInitiatedByUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getUUIDValue()); });
        deserializerMap.put("receivedDateTimeUTC", (n) -> { this.setReceivedDateTimeUTC(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestedDateTimeUTC", (n) -> { this.setRequestedDateTimeUTC(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sizeInKB", (n) -> { this.setSizeInKB(n.getObjectValue(DeviceLogCollectionResponseSizeInKB::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AppLogUploadState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initiatedByUserPrincipalName property value. The UPN for who initiated the request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInitiatedByUserPrincipalName() {
        return this.backingStore.get("initiatedByUserPrincipalName");
    }
    /**
     * Gets the managedDeviceId property value. Indicates Intune device unique identifier.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Gets the receivedDateTimeUTC property value. The DateTime the request was received.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReceivedDateTimeUTC() {
        return this.backingStore.get("receivedDateTimeUTC");
    }
    /**
     * Gets the requestedDateTimeUTC property value. The DateTime of the request.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestedDateTimeUTC() {
        return this.backingStore.get("requestedDateTimeUTC");
    }
    /**
     * Gets the sizeInKB property value. The size of the logs in KB. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link DeviceLogCollectionResponseSizeInKB}
     */
    @jakarta.annotation.Nullable
    public DeviceLogCollectionResponseSizeInKB getSizeInKB() {
        return this.backingStore.get("sizeInKB");
    }
    /**
     * Gets the status property value. AppLogUploadStatus
     * @return a {@link AppLogUploadState}
     */
    @jakarta.annotation.Nullable
    public AppLogUploadState getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("enrolledByUser", this.getEnrolledByUser());
        writer.writeOffsetDateTimeValue("expirationDateTimeUTC", this.getExpirationDateTimeUTC());
        writer.writeStringValue("initiatedByUserPrincipalName", this.getInitiatedByUserPrincipalName());
        writer.writeUUIDValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeOffsetDateTimeValue("receivedDateTimeUTC", this.getReceivedDateTimeUTC());
        writer.writeOffsetDateTimeValue("requestedDateTimeUTC", this.getRequestedDateTimeUTC());
        writer.writeObjectValue("sizeInKB", this.getSizeInKB());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the enrolledByUser property value. The User Principal Name (UPN) of the user that enrolled the device.
     * @param value Value to set for the enrolledByUser property.
     */
    public void setEnrolledByUser(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enrolledByUser", value);
    }
    /**
     * Sets the expirationDateTimeUTC property value. The DateTime of the expiration of the logs.
     * @param value Value to set for the expirationDateTimeUTC property.
     */
    public void setExpirationDateTimeUTC(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTimeUTC", value);
    }
    /**
     * Sets the initiatedByUserPrincipalName property value. The UPN for who initiated the request.
     * @param value Value to set for the initiatedByUserPrincipalName property.
     */
    public void setInitiatedByUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("initiatedByUserPrincipalName", value);
    }
    /**
     * Sets the managedDeviceId property value. Indicates Intune device unique identifier.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the receivedDateTimeUTC property value. The DateTime the request was received.
     * @param value Value to set for the receivedDateTimeUTC property.
     */
    public void setReceivedDateTimeUTC(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("receivedDateTimeUTC", value);
    }
    /**
     * Sets the requestedDateTimeUTC property value. The DateTime of the request.
     * @param value Value to set for the requestedDateTimeUTC property.
     */
    public void setRequestedDateTimeUTC(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestedDateTimeUTC", value);
    }
    /**
     * Sets the sizeInKB property value. The size of the logs in KB. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the sizeInKB property.
     */
    public void setSizeInKB(@jakarta.annotation.Nullable final DeviceLogCollectionResponseSizeInKB value) {
        this.backingStore.set("sizeInKB", value);
    }
    /**
     * Sets the status property value. AppLogUploadStatus
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AppLogUploadState value) {
        this.backingStore.set("status", value);
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class DeviceLogCollectionResponseSizeInKB implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link DeviceLogCollectionResponseSizeInKB} and sets the default values.
         */
        public DeviceLogCollectionResponseSizeInKB() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link DeviceLogCollectionResponseSizeInKB}
         */
        @jakarta.annotation.Nonnull
        public static DeviceLogCollectionResponseSizeInKB createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final DeviceLogCollectionResponseSizeInKB result = new DeviceLogCollectionResponseSizeInKB();
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
