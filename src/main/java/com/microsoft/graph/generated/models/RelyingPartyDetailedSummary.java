package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelyingPartyDetailedSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RelyingPartyDetailedSummary} and sets the default values.
     */
    public RelyingPartyDetailedSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelyingPartyDetailedSummary}
     */
    @jakarta.annotation.Nonnull
    public static RelyingPartyDetailedSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelyingPartyDetailedSummary();
    }
    /**
     * Gets the failedSignInCount property value. Number of failed sign ins on AD FS in the period specified. Supports $orderby, $filter (eq).
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getFailedSignInCount() {
        return this.backingStore.get("failedSignInCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("failedSignInCount", (n) -> { this.setFailedSignInCount(n.getLongValue()); });
        deserializerMap.put("migrationStatus", (n) -> { this.setMigrationStatus(n.getEnumValue(MigrationStatus::forValue)); });
        deserializerMap.put("migrationValidationDetails", (n) -> { this.setMigrationValidationDetails(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("relyingPartyId", (n) -> { this.setRelyingPartyId(n.getStringValue()); });
        deserializerMap.put("relyingPartyName", (n) -> { this.setRelyingPartyName(n.getStringValue()); });
        deserializerMap.put("replyUrls", (n) -> { this.setReplyUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("serviceId", (n) -> { this.setServiceId(n.getStringValue()); });
        deserializerMap.put("signInSuccessRate", (n) -> { this.setSignInSuccessRate(n.getObjectValue(RelyingPartyDetailedSummarySignInSuccessRate::createFromDiscriminatorValue)); });
        deserializerMap.put("successfulSignInCount", (n) -> { this.setSuccessfulSignInCount(n.getLongValue()); });
        deserializerMap.put("totalSignInCount", (n) -> { this.setTotalSignInCount(n.getLongValue()); });
        deserializerMap.put("uniqueUserCount", (n) -> { this.setUniqueUserCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the migrationStatus property value. The migrationStatus property
     * @return a {@link MigrationStatus}
     */
    @jakarta.annotation.Nullable
    public MigrationStatus getMigrationStatus() {
        return this.backingStore.get("migrationStatus");
    }
    /**
     * Gets the migrationValidationDetails property value. Specifies all the validations checks done on applications config details.
     * @return a {@link java.util.List<KeyValuePair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getMigrationValidationDetails() {
        return this.backingStore.get("migrationValidationDetails");
    }
    /**
     * Gets the relyingPartyId property value. Identifies the relying party to this federation service. It's used when issuing claims to the relying party. Supports $orderby, $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRelyingPartyId() {
        return this.backingStore.get("relyingPartyId");
    }
    /**
     * Gets the relyingPartyName property value. Name of the relying party's website or other entity on the Internet that uses an identity provider to authenticate a user who wants to log in. Supports $orderby, $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRelyingPartyName() {
        return this.backingStore.get("relyingPartyName");
    }
    /**
     * Gets the replyUrls property value. Specifies where the relying party expects to receive the token.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getReplyUrls() {
        return this.backingStore.get("replyUrls");
    }
    /**
     * Gets the serviceId property value. Uniquely identifies the Active Directory forest. Supports $orderby, $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceId() {
        return this.backingStore.get("serviceId");
    }
    /**
     * Gets the signInSuccessRate property value. Calculated as Number of successful / (Number of successful + Number of failed sign ins) or successfulSignInCount / totalSignInCount on AD FS in the period specified. Supports $orderby, $filter (eq).
     * @return a {@link RelyingPartyDetailedSummarySignInSuccessRate}
     */
    @jakarta.annotation.Nullable
    public RelyingPartyDetailedSummarySignInSuccessRate getSignInSuccessRate() {
        return this.backingStore.get("signInSuccessRate");
    }
    /**
     * Gets the successfulSignInCount property value. Number of successful sign ins on AD FS. Supports $orderby, $filter (eq).
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSuccessfulSignInCount() {
        return this.backingStore.get("successfulSignInCount");
    }
    /**
     * Gets the totalSignInCount property value. Number of successful + failed sign ins on AD FS in the period specified. Supports $orderby, $filter (eq).
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalSignInCount() {
        return this.backingStore.get("totalSignInCount");
    }
    /**
     * Gets the uniqueUserCount property value. Number of unique users that signed into the application. Supports $orderby, $filter (eq).
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getUniqueUserCount() {
        return this.backingStore.get("uniqueUserCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("failedSignInCount", this.getFailedSignInCount());
        writer.writeEnumValue("migrationStatus", this.getMigrationStatus());
        writer.writeCollectionOfObjectValues("migrationValidationDetails", this.getMigrationValidationDetails());
        writer.writeStringValue("relyingPartyId", this.getRelyingPartyId());
        writer.writeStringValue("relyingPartyName", this.getRelyingPartyName());
        writer.writeCollectionOfPrimitiveValues("replyUrls", this.getReplyUrls());
        writer.writeStringValue("serviceId", this.getServiceId());
        writer.writeObjectValue("signInSuccessRate", this.getSignInSuccessRate());
        writer.writeLongValue("successfulSignInCount", this.getSuccessfulSignInCount());
        writer.writeLongValue("totalSignInCount", this.getTotalSignInCount());
        writer.writeLongValue("uniqueUserCount", this.getUniqueUserCount());
    }
    /**
     * Sets the failedSignInCount property value. Number of failed sign ins on AD FS in the period specified. Supports $orderby, $filter (eq).
     * @param value Value to set for the failedSignInCount property.
     */
    public void setFailedSignInCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("failedSignInCount", value);
    }
    /**
     * Sets the migrationStatus property value. The migrationStatus property
     * @param value Value to set for the migrationStatus property.
     */
    public void setMigrationStatus(@jakarta.annotation.Nullable final MigrationStatus value) {
        this.backingStore.set("migrationStatus", value);
    }
    /**
     * Sets the migrationValidationDetails property value. Specifies all the validations checks done on applications config details.
     * @param value Value to set for the migrationValidationDetails property.
     */
    public void setMigrationValidationDetails(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("migrationValidationDetails", value);
    }
    /**
     * Sets the relyingPartyId property value. Identifies the relying party to this federation service. It's used when issuing claims to the relying party. Supports $orderby, $filter (eq).
     * @param value Value to set for the relyingPartyId property.
     */
    public void setRelyingPartyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("relyingPartyId", value);
    }
    /**
     * Sets the relyingPartyName property value. Name of the relying party's website or other entity on the Internet that uses an identity provider to authenticate a user who wants to log in. Supports $orderby, $filter (eq).
     * @param value Value to set for the relyingPartyName property.
     */
    public void setRelyingPartyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("relyingPartyName", value);
    }
    /**
     * Sets the replyUrls property value. Specifies where the relying party expects to receive the token.
     * @param value Value to set for the replyUrls property.
     */
    public void setReplyUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("replyUrls", value);
    }
    /**
     * Sets the serviceId property value. Uniquely identifies the Active Directory forest. Supports $orderby, $filter (eq).
     * @param value Value to set for the serviceId property.
     */
    public void setServiceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceId", value);
    }
    /**
     * Sets the signInSuccessRate property value. Calculated as Number of successful / (Number of successful + Number of failed sign ins) or successfulSignInCount / totalSignInCount on AD FS in the period specified. Supports $orderby, $filter (eq).
     * @param value Value to set for the signInSuccessRate property.
     */
    public void setSignInSuccessRate(@jakarta.annotation.Nullable final RelyingPartyDetailedSummarySignInSuccessRate value) {
        this.backingStore.set("signInSuccessRate", value);
    }
    /**
     * Sets the successfulSignInCount property value. Number of successful sign ins on AD FS. Supports $orderby, $filter (eq).
     * @param value Value to set for the successfulSignInCount property.
     */
    public void setSuccessfulSignInCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("successfulSignInCount", value);
    }
    /**
     * Sets the totalSignInCount property value. Number of successful + failed sign ins on AD FS in the period specified. Supports $orderby, $filter (eq).
     * @param value Value to set for the totalSignInCount property.
     */
    public void setTotalSignInCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalSignInCount", value);
    }
    /**
     * Sets the uniqueUserCount property value. Number of unique users that signed into the application. Supports $orderby, $filter (eq).
     * @param value Value to set for the uniqueUserCount property.
     */
    public void setUniqueUserCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("uniqueUserCount", value);
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class RelyingPartyDetailedSummarySignInSuccessRate implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link RelyingPartyDetailedSummarySignInSuccessRate} and sets the default values.
         */
        public RelyingPartyDetailedSummarySignInSuccessRate() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link RelyingPartyDetailedSummarySignInSuccessRate}
         */
        @jakarta.annotation.Nonnull
        public static RelyingPartyDetailedSummarySignInSuccessRate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final RelyingPartyDetailedSummarySignInSuccessRate result = new RelyingPartyDetailedSummarySignInSuccessRate();
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
