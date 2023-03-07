package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintJob extends Entity implements Parsable {
    /** The configuration property */
    private PrintJobConfiguration configuration;
    /** The createdBy property */
    private UserIdentity createdBy;
    /** The DateTimeOffset when the job was created. Read-only. */
    private OffsetDateTime createdDateTime;
    /** The documents property */
    private java.util.List<PrintDocument> documents;
    /** If true, document can be fetched by printer. */
    private Boolean isFetchable;
    /** Contains the source job URL, if the job has been redirected from another printer. */
    private String redirectedFrom;
    /** Contains the destination job URL, if the job has been redirected to another printer. */
    private String redirectedTo;
    /** The status property */
    private PrintJobStatus status;
    /** A list of printTasks that were triggered by this print job. */
    private java.util.List<PrintTask> tasks;
    /**
     * Instantiates a new printJob and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printJob
     */
    @javax.annotation.Nonnull
    public static PrintJob createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintJob();
    }
    /**
     * Gets the configuration property value. The configuration property
     * @return a printJobConfiguration
     */
    @javax.annotation.Nullable
    public PrintJobConfiguration getConfiguration() {
        return this.configuration;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The DateTimeOffset when the job was created. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the documents property value. The documents property
     * @return a printDocument
     */
    @javax.annotation.Nullable
    public java.util.List<PrintDocument> getDocuments() {
        return this.documents;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFetchable() {
        return this.isFetchable;
    }
    /**
     * Gets the redirectedFrom property value. Contains the source job URL, if the job has been redirected from another printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRedirectedFrom() {
        return this.redirectedFrom;
    }
    /**
     * Gets the redirectedTo property value. Contains the destination job URL, if the job has been redirected to another printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRedirectedTo() {
        return this.redirectedTo;
    }
    /**
     * Gets the status property value. The status property
     * @return a printJobStatus
     */
    @javax.annotation.Nullable
    public PrintJobStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the tasks property value. A list of printTasks that were triggered by this print job.
     * @return a printTask
     */
    @javax.annotation.Nullable
    public java.util.List<PrintTask> getTasks() {
        return this.tasks;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfiguration(@javax.annotation.Nullable final PrintJobConfiguration value) {
        this.configuration = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final UserIdentity value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The DateTimeOffset when the job was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the documents property value. The documents property
     * @param value Value to set for the documents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDocuments(@javax.annotation.Nullable final java.util.List<PrintDocument> value) {
        this.documents = value;
    }
    /**
     * Sets the isFetchable property value. If true, document can be fetched by printer.
     * @param value Value to set for the isFetchable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsFetchable(@javax.annotation.Nullable final Boolean value) {
        this.isFetchable = value;
    }
    /**
     * Sets the redirectedFrom property value. Contains the source job URL, if the job has been redirected from another printer.
     * @param value Value to set for the redirectedFrom property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectedFrom(@javax.annotation.Nullable final String value) {
        this.redirectedFrom = value;
    }
    /**
     * Sets the redirectedTo property value. Contains the destination job URL, if the job has been redirected to another printer.
     * @param value Value to set for the redirectedTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectedTo(@javax.annotation.Nullable final String value) {
        this.redirectedTo = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final PrintJobStatus value) {
        this.status = value;
    }
    /**
     * Sets the tasks property value. A list of printTasks that were triggered by this print job.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTasks(@javax.annotation.Nullable final java.util.List<PrintTask> value) {
        this.tasks = value;
    }
}
