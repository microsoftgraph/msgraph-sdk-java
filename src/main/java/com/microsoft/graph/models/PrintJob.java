package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class PrintJob extends Entity implements Parsable {
    /** The configuration property */
    private PrintJobConfiguration _configuration;
    /** The createdBy property */
    private UserIdentity _createdBy;
    /** The DateTimeOffset when the job was created. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The documents property */
    private java.util.List<PrintDocument> _documents;
    /** If true, document can be fetched by printer. */
    private Boolean _isFetchable;
    /** Contains the source job URL, if the job has been redirected from another printer. */
    private String _redirectedFrom;
    /** Contains the destination job URL, if the job has been redirected to another printer. */
    private String _redirectedTo;
    /** The status property */
    private PrintJobStatus _status;
    /** A list of printTasks that were triggered by this print job. */
    private java.util.List<PrintTask> _tasks;
    /**
     * Instantiates a new printJob and sets the default values.
     * @return a void
     */
    public PrintJob() {
        super();
        this.setOdataType("#microsoft.graph.printJob");
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
        return this._configuration;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The DateTimeOffset when the job was created. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the documents property value. The documents property
     * @return a printDocument
     */
    @javax.annotation.Nullable
    public java.util.List<PrintDocument> getDocuments() {
        return this._documents;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrintJob currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("configuration", (n) -> { currentObject.setConfiguration(n.getObjectValue(PrintJobConfiguration::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("documents", (n) -> { currentObject.setDocuments(n.getCollectionOfObjectValues(PrintDocument::createFromDiscriminatorValue)); });
            this.put("isFetchable", (n) -> { currentObject.setIsFetchable(n.getBooleanValue()); });
            this.put("redirectedFrom", (n) -> { currentObject.setRedirectedFrom(n.getStringValue()); });
            this.put("redirectedTo", (n) -> { currentObject.setRedirectedTo(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getObjectValue(PrintJobStatus::createFromDiscriminatorValue)); });
            this.put("tasks", (n) -> { currentObject.setTasks(n.getCollectionOfObjectValues(PrintTask::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isFetchable property value. If true, document can be fetched by printer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFetchable() {
        return this._isFetchable;
    }
    /**
     * Gets the redirectedFrom property value. Contains the source job URL, if the job has been redirected from another printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRedirectedFrom() {
        return this._redirectedFrom;
    }
    /**
     * Gets the redirectedTo property value. Contains the destination job URL, if the job has been redirected to another printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRedirectedTo() {
        return this._redirectedTo;
    }
    /**
     * Gets the status property value. The status property
     * @return a printJobStatus
     */
    @javax.annotation.Nullable
    public PrintJobStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the tasks property value. A list of printTasks that were triggered by this print job.
     * @return a printTask
     */
    @javax.annotation.Nullable
    public java.util.List<PrintTask> getTasks() {
        return this._tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setConfiguration(@javax.annotation.Nullable final PrintJobConfiguration value) {
        this._configuration = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final UserIdentity value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The DateTimeOffset when the job was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the documents property value. The documents property
     * @param value Value to set for the documents property.
     * @return a void
     */
    public void setDocuments(@javax.annotation.Nullable final java.util.List<PrintDocument> value) {
        this._documents = value;
    }
    /**
     * Sets the isFetchable property value. If true, document can be fetched by printer.
     * @param value Value to set for the isFetchable property.
     * @return a void
     */
    public void setIsFetchable(@javax.annotation.Nullable final Boolean value) {
        this._isFetchable = value;
    }
    /**
     * Sets the redirectedFrom property value. Contains the source job URL, if the job has been redirected from another printer.
     * @param value Value to set for the redirectedFrom property.
     * @return a void
     */
    public void setRedirectedFrom(@javax.annotation.Nullable final String value) {
        this._redirectedFrom = value;
    }
    /**
     * Sets the redirectedTo property value. Contains the destination job URL, if the job has been redirected to another printer.
     * @param value Value to set for the redirectedTo property.
     * @return a void
     */
    public void setRedirectedTo(@javax.annotation.Nullable final String value) {
        this._redirectedTo = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final PrintJobStatus value) {
        this._status = value;
    }
    /**
     * Sets the tasks property value. A list of printTasks that were triggered by this print job.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    public void setTasks(@javax.annotation.Nullable final java.util.List<PrintTask> value) {
        this._tasks = value;
    }
}
