package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity representing a job to export a report */
public class DeviceManagementExportJob extends Entity implements Parsable {
    /** Time that the exported report expires */
    private OffsetDateTime _expirationDateTime;
    /** Filters applied on the report */
    private String _filter;
    /** Possible values for the file format of a report */
    private DeviceManagementReportFileFormat _format;
    /** Configures how the requested export job is localized */
    private DeviceManagementExportJobLocalizationType _localizationType;
    /** Name of the report */
    private String _reportName;
    /** Time that the exported report was requested */
    private OffsetDateTime _requestDateTime;
    /** Columns selected from the report */
    private java.util.List<String> _select;
    /** A snapshot is an identifiable subset of the dataset represented by the ReportName. A sessionId or CachedReportConfiguration id can be used here. If a sessionId is specified, Filter, Select, and OrderBy are applied to the data represented by the sessionId. Filter, Select, and OrderBy cannot be specified together with a CachedReportConfiguration id. */
    private String _snapshotId;
    /** Possible statuses associated with a generated report */
    private DeviceManagementReportStatus _status;
    /** Temporary location of the exported report */
    private String _url;
    /**
     * Instantiates a new deviceManagementExportJob and sets the default values.
     * @return a void
     */
    public DeviceManagementExportJob() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementExportJob");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementExportJob
     */
    @javax.annotation.Nonnull
    public static DeviceManagementExportJob createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementExportJob();
    }
    /**
     * Gets the expirationDateTime property value. Time that the exported report expires
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementExportJob currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("filter", (n) -> { currentObject.setFilter(n.getStringValue()); });
            this.put("format", (n) -> { currentObject.setFormat(n.getEnumValue(DeviceManagementReportFileFormat.class)); });
            this.put("localizationType", (n) -> { currentObject.setLocalizationType(n.getEnumValue(DeviceManagementExportJobLocalizationType.class)); });
            this.put("reportName", (n) -> { currentObject.setReportName(n.getStringValue()); });
            this.put("requestDateTime", (n) -> { currentObject.setRequestDateTime(n.getOffsetDateTimeValue()); });
            this.put("select", (n) -> { currentObject.setSelect(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("snapshotId", (n) -> { currentObject.setSnapshotId(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(DeviceManagementReportStatus.class)); });
            this.put("url", (n) -> { currentObject.setUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the filter property value. Filters applied on the report
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilter() {
        return this._filter;
    }
    /**
     * Gets the format property value. Possible values for the file format of a report
     * @return a deviceManagementReportFileFormat
     */
    @javax.annotation.Nullable
    public DeviceManagementReportFileFormat getFormat() {
        return this._format;
    }
    /**
     * Gets the localizationType property value. Configures how the requested export job is localized
     * @return a deviceManagementExportJobLocalizationType
     */
    @javax.annotation.Nullable
    public DeviceManagementExportJobLocalizationType getLocalizationType() {
        return this._localizationType;
    }
    /**
     * Gets the reportName property value. Name of the report
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReportName() {
        return this._reportName;
    }
    /**
     * Gets the requestDateTime property value. Time that the exported report was requested
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this._requestDateTime;
    }
    /**
     * Gets the select property value. Columns selected from the report
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSelect() {
        return this._select;
    }
    /**
     * Gets the snapshotId property value. A snapshot is an identifiable subset of the dataset represented by the ReportName. A sessionId or CachedReportConfiguration id can be used here. If a sessionId is specified, Filter, Select, and OrderBy are applied to the data represented by the sessionId. Filter, Select, and OrderBy cannot be specified together with a CachedReportConfiguration id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSnapshotId() {
        return this._snapshotId;
    }
    /**
     * Gets the status property value. Possible statuses associated with a generated report
     * @return a deviceManagementReportStatus
     */
    @javax.annotation.Nullable
    public DeviceManagementReportStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the url property value. Temporary location of the exported report
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this._url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("filter", this.getFilter());
        writer.writeEnumValue("format", this.getFormat());
        writer.writeEnumValue("localizationType", this.getLocalizationType());
        writer.writeStringValue("reportName", this.getReportName());
        writer.writeOffsetDateTimeValue("requestDateTime", this.getRequestDateTime());
        writer.writeCollectionOfPrimitiveValues("select", this.getSelect());
        writer.writeStringValue("snapshotId", this.getSnapshotId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the expirationDateTime property value. Time that the exported report expires
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the filter property value. Filters applied on the report
     * @param value Value to set for the filter property.
     * @return a void
     */
    public void setFilter(@javax.annotation.Nullable final String value) {
        this._filter = value;
    }
    /**
     * Sets the format property value. Possible values for the file format of a report
     * @param value Value to set for the format property.
     * @return a void
     */
    public void setFormat(@javax.annotation.Nullable final DeviceManagementReportFileFormat value) {
        this._format = value;
    }
    /**
     * Sets the localizationType property value. Configures how the requested export job is localized
     * @param value Value to set for the localizationType property.
     * @return a void
     */
    public void setLocalizationType(@javax.annotation.Nullable final DeviceManagementExportJobLocalizationType value) {
        this._localizationType = value;
    }
    /**
     * Sets the reportName property value. Name of the report
     * @param value Value to set for the reportName property.
     * @return a void
     */
    public void setReportName(@javax.annotation.Nullable final String value) {
        this._reportName = value;
    }
    /**
     * Sets the requestDateTime property value. Time that the exported report was requested
     * @param value Value to set for the requestDateTime property.
     * @return a void
     */
    public void setRequestDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._requestDateTime = value;
    }
    /**
     * Sets the select property value. Columns selected from the report
     * @param value Value to set for the select property.
     * @return a void
     */
    public void setSelect(@javax.annotation.Nullable final java.util.List<String> value) {
        this._select = value;
    }
    /**
     * Sets the snapshotId property value. A snapshot is an identifiable subset of the dataset represented by the ReportName. A sessionId or CachedReportConfiguration id can be used here. If a sessionId is specified, Filter, Select, and OrderBy are applied to the data represented by the sessionId. Filter, Select, and OrderBy cannot be specified together with a CachedReportConfiguration id.
     * @param value Value to set for the snapshotId property.
     * @return a void
     */
    public void setSnapshotId(@javax.annotation.Nullable final String value) {
        this._snapshotId = value;
    }
    /**
     * Sets the status property value. Possible statuses associated with a generated report
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final DeviceManagementReportStatus value) {
        this._status = value;
    }
    /**
     * Sets the url property value. Temporary location of the exported report
     * @param value Value to set for the url property.
     * @return a void
     */
    public void setUrl(@javax.annotation.Nullable final String value) {
        this._url = value;
    }
}
