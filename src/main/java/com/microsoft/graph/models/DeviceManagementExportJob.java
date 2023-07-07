package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity representing a job to export a report
 */
public class DeviceManagementExportJob extends Entity implements Parsable {
    /**
     * Time that the exported report expires
     */
    private OffsetDateTime expirationDateTime;
    /**
     * Filters applied on the report
     */
    private String filter;
    /**
     * Possible values for the file format of a report
     */
    private DeviceManagementReportFileFormat format;
    /**
     * Configures how the requested export job is localized
     */
    private DeviceManagementExportJobLocalizationType localizationType;
    /**
     * Name of the report
     */
    private String reportName;
    /**
     * Time that the exported report was requested
     */
    private OffsetDateTime requestDateTime;
    /**
     * Columns selected from the report
     */
    private java.util.List<String> select;
    /**
     * A snapshot is an identifiable subset of the dataset represented by the ReportName. A sessionId or CachedReportConfiguration id can be used here. If a sessionId is specified, Filter, Select, and OrderBy are applied to the data represented by the sessionId. Filter, Select, and OrderBy cannot be specified together with a CachedReportConfiguration id.
     */
    private String snapshotId;
    /**
     * Possible statuses associated with a generated report
     */
    private DeviceManagementReportStatus status;
    /**
     * Temporary location of the exported report
     */
    private String url;
    /**
     * Instantiates a new deviceManagementExportJob and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementExportJob() {
        super();
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
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("filter", (n) -> { this.setFilter(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getEnumValue(DeviceManagementReportFileFormat.class)); });
        deserializerMap.put("localizationType", (n) -> { this.setLocalizationType(n.getEnumValue(DeviceManagementExportJobLocalizationType.class)); });
        deserializerMap.put("reportName", (n) -> { this.setReportName(n.getStringValue()); });
        deserializerMap.put("requestDateTime", (n) -> { this.setRequestDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("select", (n) -> { this.setSelect(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("snapshotId", (n) -> { this.setSnapshotId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DeviceManagementReportStatus.class)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filter property value. Filters applied on the report
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilter() {
        return this.filter;
    }
    /**
     * Gets the format property value. Possible values for the file format of a report
     * @return a DeviceManagementReportFileFormat
     */
    @javax.annotation.Nullable
    public DeviceManagementReportFileFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the localizationType property value. Configures how the requested export job is localized
     * @return a DeviceManagementExportJobLocalizationType
     */
    @javax.annotation.Nullable
    public DeviceManagementExportJobLocalizationType getLocalizationType() {
        return this.localizationType;
    }
    /**
     * Gets the reportName property value. Name of the report
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReportName() {
        return this.reportName;
    }
    /**
     * Gets the requestDateTime property value. Time that the exported report was requested
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this.requestDateTime;
    }
    /**
     * Gets the select property value. Columns selected from the report
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSelect() {
        return this.select;
    }
    /**
     * Gets the snapshotId property value. A snapshot is an identifiable subset of the dataset represented by the ReportName. A sessionId or CachedReportConfiguration id can be used here. If a sessionId is specified, Filter, Select, and OrderBy are applied to the data represented by the sessionId. Filter, Select, and OrderBy cannot be specified together with a CachedReportConfiguration id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSnapshotId() {
        return this.snapshotId;
    }
    /**
     * Gets the status property value. Possible statuses associated with a generated report
     * @return a DeviceManagementReportStatus
     */
    @javax.annotation.Nullable
    public DeviceManagementReportStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the url property value. Temporary location of the exported report
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this.url;
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
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the filter property value. Filters applied on the report
     * @param value Value to set for the filter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilter(@javax.annotation.Nullable final String value) {
        this.filter = value;
    }
    /**
     * Sets the format property value. Possible values for the file format of a report
     * @param value Value to set for the format property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final DeviceManagementReportFileFormat value) {
        this.format = value;
    }
    /**
     * Sets the localizationType property value. Configures how the requested export job is localized
     * @param value Value to set for the localizationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalizationType(@javax.annotation.Nullable final DeviceManagementExportJobLocalizationType value) {
        this.localizationType = value;
    }
    /**
     * Sets the reportName property value. Name of the report
     * @param value Value to set for the reportName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportName(@javax.annotation.Nullable final String value) {
        this.reportName = value;
    }
    /**
     * Sets the requestDateTime property value. Time that the exported report was requested
     * @param value Value to set for the requestDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.requestDateTime = value;
    }
    /**
     * Sets the select property value. Columns selected from the report
     * @param value Value to set for the select property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSelect(@javax.annotation.Nullable final java.util.List<String> value) {
        this.select = value;
    }
    /**
     * Sets the snapshotId property value. A snapshot is an identifiable subset of the dataset represented by the ReportName. A sessionId or CachedReportConfiguration id can be used here. If a sessionId is specified, Filter, Select, and OrderBy are applied to the data represented by the sessionId. Filter, Select, and OrderBy cannot be specified together with a CachedReportConfiguration id.
     * @param value Value to set for the snapshotId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSnapshotId(@javax.annotation.Nullable final String value) {
        this.snapshotId = value;
    }
    /**
     * Sets the status property value. Possible statuses associated with a generated report
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final DeviceManagementReportStatus value) {
        this.status = value;
    }
    /**
     * Sets the url property value. Temporary location of the exported report
     * @param value Value to set for the url property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrl(@javax.annotation.Nullable final String value) {
        this.url = value;
    }
}
