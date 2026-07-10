package com.microsoft.graph.models.entrarecoveryservices;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecoveryJobBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RecoveryJobBase} and sets the default values.
     */
    public RecoveryJobBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RecoveryJobBase}
     */
    @jakarta.annotation.Nonnull
    public static RecoveryJobBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.entraRecoveryServices.recoveryJob": return new RecoveryJob();
                case "#microsoft.graph.entraRecoveryServices.recoveryPreviewJob": return new RecoveryPreviewJob();
            }
        }
        return new RecoveryJobBase();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("filteringCriteria", (n) -> { this.setFilteringCriteria(n.getObjectValue(RecoveryJobFilteringCriteriaBase::createFromDiscriminatorValue)); });
        deserializerMap.put("jobCompletionDateTime", (n) -> { this.setJobCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("jobStartDateTime", (n) -> { this.setJobStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RecoveryStatus::forValue)); });
        deserializerMap.put("targetStateDateTime", (n) -> { this.setTargetStateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("totalChangedLinksCalculated", (n) -> { this.setTotalChangedLinksCalculated(n.getIntegerValue()); });
        deserializerMap.put("totalChangedObjectsCalculated", (n) -> { this.setTotalChangedObjectsCalculated(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filteringCriteria property value. The filteringCriteria property
     * @return a {@link RecoveryJobFilteringCriteriaBase}
     */
    @jakarta.annotation.Nullable
    public RecoveryJobFilteringCriteriaBase getFilteringCriteria() {
        return this.backingStore.get("filteringCriteria");
    }
    /**
     * Gets the jobCompletionDateTime property value. The jobCompletionDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getJobCompletionDateTime() {
        return this.backingStore.get("jobCompletionDateTime");
    }
    /**
     * Gets the jobStartDateTime property value. The jobStartDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getJobStartDateTime() {
        return this.backingStore.get("jobStartDateTime");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link RecoveryStatus}
     */
    @jakarta.annotation.Nullable
    public RecoveryStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the targetStateDateTime property value. The targetStateDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTargetStateDateTime() {
        return this.backingStore.get("targetStateDateTime");
    }
    /**
     * Gets the totalChangedLinksCalculated property value. The totalChangedLinksCalculated property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalChangedLinksCalculated() {
        return this.backingStore.get("totalChangedLinksCalculated");
    }
    /**
     * Gets the totalChangedObjectsCalculated property value. The totalChangedObjectsCalculated property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalChangedObjectsCalculated() {
        return this.backingStore.get("totalChangedObjectsCalculated");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("filteringCriteria", this.getFilteringCriteria());
        writer.writeOffsetDateTimeValue("jobCompletionDateTime", this.getJobCompletionDateTime());
        writer.writeOffsetDateTimeValue("jobStartDateTime", this.getJobStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("targetStateDateTime", this.getTargetStateDateTime());
        writer.writeIntegerValue("totalChangedLinksCalculated", this.getTotalChangedLinksCalculated());
        writer.writeIntegerValue("totalChangedObjectsCalculated", this.getTotalChangedObjectsCalculated());
    }
    /**
     * Sets the filteringCriteria property value. The filteringCriteria property
     * @param value Value to set for the filteringCriteria property.
     */
    public void setFilteringCriteria(@jakarta.annotation.Nullable final RecoveryJobFilteringCriteriaBase value) {
        this.backingStore.set("filteringCriteria", value);
    }
    /**
     * Sets the jobCompletionDateTime property value. The jobCompletionDateTime property
     * @param value Value to set for the jobCompletionDateTime property.
     */
    public void setJobCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("jobCompletionDateTime", value);
    }
    /**
     * Sets the jobStartDateTime property value. The jobStartDateTime property
     * @param value Value to set for the jobStartDateTime property.
     */
    public void setJobStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("jobStartDateTime", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final RecoveryStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the targetStateDateTime property value. The targetStateDateTime property
     * @param value Value to set for the targetStateDateTime property.
     */
    public void setTargetStateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("targetStateDateTime", value);
    }
    /**
     * Sets the totalChangedLinksCalculated property value. The totalChangedLinksCalculated property
     * @param value Value to set for the totalChangedLinksCalculated property.
     */
    public void setTotalChangedLinksCalculated(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalChangedLinksCalculated", value);
    }
    /**
     * Sets the totalChangedObjectsCalculated property value. The totalChangedObjectsCalculated property
     * @param value Value to set for the totalChangedObjectsCalculated property.
     */
    public void setTotalChangedObjectsCalculated(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalChangedObjectsCalculated", value);
    }
}
