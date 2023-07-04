package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationJob extends Entity implements Parsable {
    /**
     * The schedule property
     */
    private SynchronizationSchedule schedule;
    /**
     * The schema property
     */
    private SynchronizationSchema schema;
    /**
     * The status property
     */
    private SynchronizationStatus status;
    /**
     * The synchronizationJobSettings property
     */
    private java.util.List<KeyValuePair> synchronizationJobSettings;
    /**
     * The templateId property
     */
    private String templateId;
    /**
     * Instantiates a new synchronizationJob and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SynchronizationJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationJob
     */
    @javax.annotation.Nonnull
    public static SynchronizationJob createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationJob();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(SynchronizationSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("schema", (n) -> { this.setSchema(n.getObjectValue(SynchronizationSchema::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(SynchronizationStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("synchronizationJobSettings", (n) -> { this.setSynchronizationJobSettings(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the schedule property value. The schedule property
     * @return a synchronizationSchedule
     */
    @javax.annotation.Nullable
    public SynchronizationSchedule getSchedule() {
        return this.schedule;
    }
    /**
     * Gets the schema property value. The schema property
     * @return a synchronizationSchema
     */
    @javax.annotation.Nullable
    public SynchronizationSchema getSchema() {
        return this.schema;
    }
    /**
     * Gets the status property value. The status property
     * @return a synchronizationStatus
     */
    @javax.annotation.Nullable
    public SynchronizationStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the synchronizationJobSettings property value. The synchronizationJobSettings property
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getSynchronizationJobSettings() {
        return this.synchronizationJobSettings;
    }
    /**
     * Gets the templateId property value. The templateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this.templateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeObjectValue("schema", this.getSchema());
        writer.writeObjectValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("synchronizationJobSettings", this.getSynchronizationJobSettings());
        writer.writeStringValue("templateId", this.getTemplateId());
    }
    /**
     * Sets the schedule property value. The schedule property
     * @param value Value to set for the schedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchedule(@javax.annotation.Nullable final SynchronizationSchedule value) {
        this.schedule = value;
    }
    /**
     * Sets the schema property value. The schema property
     * @param value Value to set for the schema property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchema(@javax.annotation.Nullable final SynchronizationSchema value) {
        this.schema = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final SynchronizationStatus value) {
        this.status = value;
    }
    /**
     * Sets the synchronizationJobSettings property value. The synchronizationJobSettings property
     * @param value Value to set for the synchronizationJobSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSynchronizationJobSettings(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.synchronizationJobSettings = value;
    }
    /**
     * Sets the templateId property value. The templateId property
     * @param value Value to set for the templateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this.templateId = value;
    }
}
