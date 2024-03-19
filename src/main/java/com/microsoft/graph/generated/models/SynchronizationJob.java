package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SynchronizationJob extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SynchronizationJob} and sets the default values.
     */
    public SynchronizationJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SynchronizationJob}
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationJob();
    }
    /**
     * Gets the bulkUpload property value. The bulk upload operation for the job.
     * @return a {@link BulkUpload}
     */
    @jakarta.annotation.Nullable
    public BulkUpload getBulkUpload() {
        return this.backingStore.get("bulkUpload");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bulkUpload", (n) -> { this.setBulkUpload(n.getObjectValue(BulkUpload::createFromDiscriminatorValue)); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(SynchronizationSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("schema", (n) -> { this.setSchema(n.getObjectValue(SynchronizationSchema::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(SynchronizationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("synchronizationJobSettings", (n) -> { this.setSynchronizationJobSettings(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the schedule property value. Schedule used to run the job. Read-only.
     * @return a {@link SynchronizationSchedule}
     */
    @jakarta.annotation.Nullable
    public SynchronizationSchedule getSchedule() {
        return this.backingStore.get("schedule");
    }
    /**
     * Gets the schema property value. The synchronization schema configured for the job.
     * @return a {@link SynchronizationSchema}
     */
    @jakarta.annotation.Nullable
    public SynchronizationSchema getSchema() {
        return this.backingStore.get("schema");
    }
    /**
     * Gets the status property value. Status of the job, which includes when the job was last run, current job state, and errors.
     * @return a {@link SynchronizationStatus}
     */
    @jakarta.annotation.Nullable
    public SynchronizationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the synchronizationJobSettings property value. Settings associated with the job. Some settings are inherited from the template.
     * @return a {@link java.util.List<KeyValuePair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getSynchronizationJobSettings() {
        return this.backingStore.get("synchronizationJobSettings");
    }
    /**
     * Gets the templateId property value. Identifier of the synchronization template this job is based on.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTemplateId() {
        return this.backingStore.get("templateId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("bulkUpload", this.getBulkUpload());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeObjectValue("schema", this.getSchema());
        writer.writeObjectValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("synchronizationJobSettings", this.getSynchronizationJobSettings());
        writer.writeStringValue("templateId", this.getTemplateId());
    }
    /**
     * Sets the bulkUpload property value. The bulk upload operation for the job.
     * @param value Value to set for the bulkUpload property.
     */
    public void setBulkUpload(@jakarta.annotation.Nullable final BulkUpload value) {
        this.backingStore.set("bulkUpload", value);
    }
    /**
     * Sets the schedule property value. Schedule used to run the job. Read-only.
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final SynchronizationSchedule value) {
        this.backingStore.set("schedule", value);
    }
    /**
     * Sets the schema property value. The synchronization schema configured for the job.
     * @param value Value to set for the schema property.
     */
    public void setSchema(@jakarta.annotation.Nullable final SynchronizationSchema value) {
        this.backingStore.set("schema", value);
    }
    /**
     * Sets the status property value. Status of the job, which includes when the job was last run, current job state, and errors.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SynchronizationStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the synchronizationJobSettings property value. Settings associated with the job. Some settings are inherited from the template.
     * @param value Value to set for the synchronizationJobSettings property.
     */
    public void setSynchronizationJobSettings(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("synchronizationJobSettings", value);
    }
    /**
     * Sets the templateId property value. Identifier of the synchronization template this job is based on.
     * @param value Value to set for the templateId property.
     */
    public void setTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("templateId", value);
    }
}
