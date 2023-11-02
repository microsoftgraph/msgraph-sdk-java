package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrintJob extends Entity implements Parsable {
    /**
     * Instantiates a new PrintJob and sets the default values.
     */
    public PrintJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrintJob
     */
    @jakarta.annotation.Nonnull
    public static PrintJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintJob();
    }
    /**
     * Gets the configuration property value. The configuration property
     * @return a PrintJobConfiguration
     */
    @jakarta.annotation.Nullable
    public PrintJobConfiguration getConfiguration() {
        return this.getBackingStore().get("configuration");
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a UserIdentity
     */
    @jakarta.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this.getBackingStore().get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The DateTimeOffset when the job was created. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.getBackingStore().get("createdDateTime");
    }
    /**
     * Gets the documents property value. The documents property
     * @return a java.util.List<PrintDocument>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintDocument> getDocuments() {
        return this.getBackingStore().get("documents");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(PrintJobConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("documents", (n) -> { this.setDocuments(n.getCollectionOfObjectValues(PrintDocument::createFromDiscriminatorValue)); });
        deserializerMap.put("isFetchable", (n) -> { this.setIsFetchable(n.getBooleanValue()); });
        deserializerMap.put("redirectedFrom", (n) -> { this.setRedirectedFrom(n.getStringValue()); });
        deserializerMap.put("redirectedTo", (n) -> { this.setRedirectedTo(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(PrintJobStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(PrintTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isFetchable property value. If true, document can be fetched by printer.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFetchable() {
        return this.getBackingStore().get("isFetchable");
    }
    /**
     * Gets the redirectedFrom property value. Contains the source job URL, if the job has been redirected from another printer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRedirectedFrom() {
        return this.getBackingStore().get("redirectedFrom");
    }
    /**
     * Gets the redirectedTo property value. Contains the destination job URL, if the job has been redirected to another printer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRedirectedTo() {
        return this.getBackingStore().get("redirectedTo");
    }
    /**
     * Gets the status property value. The status property
     * @return a PrintJobStatus
     */
    @jakarta.annotation.Nullable
    public PrintJobStatus getStatus() {
        return this.getBackingStore().get("status");
    }
    /**
     * Gets the tasks property value. A list of printTasks that were triggered by this print job.
     * @return a java.util.List<PrintTask>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintTask> getTasks() {
        return this.getBackingStore().get("tasks");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("documents", this.getDocuments());
        writer.writeBooleanValue("isFetchable", this.getIsFetchable());
        writer.writeStringValue("redirectedFrom", this.getRedirectedFrom());
        writer.writeStringValue("redirectedTo", this.getRedirectedTo());
        writer.writeObjectValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the configuration property value. The configuration property
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final PrintJobConfiguration value) {
        this.getBackingStore().set("configuration", value);
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final UserIdentity value) {
        this.getBackingStore().set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The DateTimeOffset when the job was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("createdDateTime", value);
    }
    /**
     * Sets the documents property value. The documents property
     * @param value Value to set for the documents property.
     */
    public void setDocuments(@jakarta.annotation.Nullable final java.util.List<PrintDocument> value) {
        this.getBackingStore().set("documents", value);
    }
    /**
     * Sets the isFetchable property value. If true, document can be fetched by printer.
     * @param value Value to set for the isFetchable property.
     */
    public void setIsFetchable(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("isFetchable", value);
    }
    /**
     * Sets the redirectedFrom property value. Contains the source job URL, if the job has been redirected from another printer.
     * @param value Value to set for the redirectedFrom property.
     */
    public void setRedirectedFrom(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("redirectedFrom", value);
    }
    /**
     * Sets the redirectedTo property value. Contains the destination job URL, if the job has been redirected to another printer.
     * @param value Value to set for the redirectedTo property.
     */
    public void setRedirectedTo(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("redirectedTo", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PrintJobStatus value) {
        this.getBackingStore().set("status", value);
    }
    /**
     * Sets the tasks property value. A list of printTasks that were triggered by this print job.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<PrintTask> value) {
        this.getBackingStore().set("tasks", value);
    }
}
