package com.microsoft.graph.users.item.findmeetingtimes;

import com.microsoft.graph.models.AttendeeBase;
import com.microsoft.graph.models.LocationConstraint;
import com.microsoft.graph.models.ReferenceNumeric;
import com.microsoft.graph.models.TimeConstraint;
import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
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
public class FindMeetingTimesPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link FindMeetingTimesPostRequestBody} and sets the default values.
     */
    public FindMeetingTimesPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FindMeetingTimesPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static FindMeetingTimesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FindMeetingTimesPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the attendees property value. The attendees property
     * @return a {@link java.util.List<AttendeeBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttendeeBase> getAttendees() {
        return this.backingStore.get("attendees");
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("attendees", (n) -> { this.setAttendees(n.getCollectionOfObjectValues(AttendeeBase::createFromDiscriminatorValue)); });
        deserializerMap.put("isOrganizerOptional", (n) -> { this.setIsOrganizerOptional(n.getBooleanValue()); });
        deserializerMap.put("locationConstraint", (n) -> { this.setLocationConstraint(n.getObjectValue(LocationConstraint::createFromDiscriminatorValue)); });
        deserializerMap.put("maxCandidates", (n) -> { this.setMaxCandidates(n.getIntegerValue()); });
        deserializerMap.put("meetingDuration", (n) -> { this.setMeetingDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("minimumAttendeePercentage", (n) -> { this.setMinimumAttendeePercentage(n.getObjectValue(FindMeetingTimesPostRequestBodyMinimumAttendeePercentage::createFromDiscriminatorValue)); });
        deserializerMap.put("returnSuggestionReasons", (n) -> { this.setReturnSuggestionReasons(n.getBooleanValue()); });
        deserializerMap.put("timeConstraint", (n) -> { this.setTimeConstraint(n.getObjectValue(TimeConstraint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isOrganizerOptional property value. The isOrganizerOptional property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOrganizerOptional() {
        return this.backingStore.get("isOrganizerOptional");
    }
    /**
     * Gets the locationConstraint property value. The locationConstraint property
     * @return a {@link LocationConstraint}
     */
    @jakarta.annotation.Nullable
    public LocationConstraint getLocationConstraint() {
        return this.backingStore.get("locationConstraint");
    }
    /**
     * Gets the maxCandidates property value. The maxCandidates property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxCandidates() {
        return this.backingStore.get("maxCandidates");
    }
    /**
     * Gets the meetingDuration property value. The meetingDuration property
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMeetingDuration() {
        return this.backingStore.get("meetingDuration");
    }
    /**
     * Gets the minimumAttendeePercentage property value. The minimumAttendeePercentage property
     * @return a {@link FindMeetingTimesPostRequestBodyMinimumAttendeePercentage}
     */
    @jakarta.annotation.Nullable
    public FindMeetingTimesPostRequestBodyMinimumAttendeePercentage getMinimumAttendeePercentage() {
        return this.backingStore.get("minimumAttendeePercentage");
    }
    /**
     * Gets the returnSuggestionReasons property value. The returnSuggestionReasons property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReturnSuggestionReasons() {
        return this.backingStore.get("returnSuggestionReasons");
    }
    /**
     * Gets the timeConstraint property value. The timeConstraint property
     * @return a {@link TimeConstraint}
     */
    @jakarta.annotation.Nullable
    public TimeConstraint getTimeConstraint() {
        return this.backingStore.get("timeConstraint");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attendees", this.getAttendees());
        writer.writeBooleanValue("isOrganizerOptional", this.getIsOrganizerOptional());
        writer.writeObjectValue("locationConstraint", this.getLocationConstraint());
        writer.writeIntegerValue("maxCandidates", this.getMaxCandidates());
        writer.writePeriodAndDurationValue("meetingDuration", this.getMeetingDuration());
        writer.writeObjectValue("minimumAttendeePercentage", this.getMinimumAttendeePercentage());
        writer.writeBooleanValue("returnSuggestionReasons", this.getReturnSuggestionReasons());
        writer.writeObjectValue("timeConstraint", this.getTimeConstraint());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the attendees property value. The attendees property
     * @param value Value to set for the attendees property.
     */
    public void setAttendees(@jakarta.annotation.Nullable final java.util.List<AttendeeBase> value) {
        this.backingStore.set("attendees", value);
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
     * Sets the isOrganizerOptional property value. The isOrganizerOptional property
     * @param value Value to set for the isOrganizerOptional property.
     */
    public void setIsOrganizerOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOrganizerOptional", value);
    }
    /**
     * Sets the locationConstraint property value. The locationConstraint property
     * @param value Value to set for the locationConstraint property.
     */
    public void setLocationConstraint(@jakarta.annotation.Nullable final LocationConstraint value) {
        this.backingStore.set("locationConstraint", value);
    }
    /**
     * Sets the maxCandidates property value. The maxCandidates property
     * @param value Value to set for the maxCandidates property.
     */
    public void setMaxCandidates(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maxCandidates", value);
    }
    /**
     * Sets the meetingDuration property value. The meetingDuration property
     * @param value Value to set for the meetingDuration property.
     */
    public void setMeetingDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("meetingDuration", value);
    }
    /**
     * Sets the minimumAttendeePercentage property value. The minimumAttendeePercentage property
     * @param value Value to set for the minimumAttendeePercentage property.
     */
    public void setMinimumAttendeePercentage(@jakarta.annotation.Nullable final FindMeetingTimesPostRequestBodyMinimumAttendeePercentage value) {
        this.backingStore.set("minimumAttendeePercentage", value);
    }
    /**
     * Sets the returnSuggestionReasons property value. The returnSuggestionReasons property
     * @param value Value to set for the returnSuggestionReasons property.
     */
    public void setReturnSuggestionReasons(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("returnSuggestionReasons", value);
    }
    /**
     * Sets the timeConstraint property value. The timeConstraint property
     * @param value Value to set for the timeConstraint property.
     */
    public void setTimeConstraint(@jakarta.annotation.Nullable final TimeConstraint value) {
        this.backingStore.set("timeConstraint", value);
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class FindMeetingTimesPostRequestBodyMinimumAttendeePercentage implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link FindMeetingTimesPostRequestBodyMinimumAttendeePercentage} and sets the default values.
         */
        public FindMeetingTimesPostRequestBodyMinimumAttendeePercentage() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link FindMeetingTimesPostRequestBodyMinimumAttendeePercentage}
         */
        @jakarta.annotation.Nonnull
        public static FindMeetingTimesPostRequestBodyMinimumAttendeePercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final FindMeetingTimesPostRequestBodyMinimumAttendeePercentage result = new FindMeetingTimesPostRequestBodyMinimumAttendeePercentage();
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
