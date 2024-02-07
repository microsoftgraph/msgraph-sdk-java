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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementExportJob extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementExportJob and sets the default values.
     */
    public DeviceManagementExportJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementExportJob
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementExportJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementExportJob();
    }
    /**
     * Gets the expirationDateTime property value. Time that the exported report expires
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("filter", (n) -> { this.setFilter(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getEnumValue(DeviceManagementReportFileFormat::forValue)); });
        deserializerMap.put("localizationType", (n) -> { this.setLocalizationType(n.getEnumValue(DeviceManagementExportJobLocalizationType::forValue)); });
        deserializerMap.put("reportName", (n) -> { this.setReportName(n.getStringValue()); });
        deserializerMap.put("requestDateTime", (n) -> { this.setRequestDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("select", (n) -> { this.setSelect(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("snapshotId", (n) -> { this.setSnapshotId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DeviceManagementReportStatus::forValue)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filter property value. Filters applied on the report
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFilter() {
        return this.backingStore.get("filter");
    }
    /**
     * Gets the format property value. Possible values for the file format of a report
     * @return a DeviceManagementReportFileFormat
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReportFileFormat getFormat() {
        return this.backingStore.get("format");
    }
    /**
     * Gets the localizationType property value. Configures how the requested export job is localized
     * @return a DeviceManagementExportJobLocalizationType
     */
    @jakarta.annotation.Nullable
    public DeviceManagementExportJobLocalizationType getLocalizationType() {
        return this.backingStore.get("localizationType");
    }
    /**
     * Gets the reportName property value. Name of the report
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReportName() {
        return this.backingStore.get("reportName");
    }
    /**
     * Gets the requestDateTime property value. Time that the exported report was requested
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this.backingStore.get("requestDateTime");
    }
    /**
     * Gets the select property value. Columns selected from the report
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSelect() {
        return this.backingStore.get("select");
    }
    /**
     * Gets the snapshotId property value. A snapshot is an identifiable subset of the dataset represented by the ReportName. A sessionId or CachedReportConfiguration id can be used here. If a sessionId is specified, Filter, Select, and OrderBy are applied to the data represented by the sessionId. Filter, Select, and OrderBy cannot be specified together with a CachedReportConfiguration id.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSnapshotId() {
        return this.backingStore.get("snapshotId");
    }
    /**
     * Gets the status property value. Possible statuses associated with a generated report
     * @return a DeviceManagementReportStatus
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReportStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the url property value. Temporary location of the exported report
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.backingStore.get("url");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the filter property value. Filters applied on the report
     * @param value Value to set for the filter property.
     */
    public void setFilter(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filter", value);
    }
    /**
     * Sets the format property value. Possible values for the file format of a report
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final DeviceManagementReportFileFormat value) {
        this.backingStore.set("format", value);
    }
    /**
     * Sets the localizationType property value. Configures how the requested export job is localized
     * @param value Value to set for the localizationType property.
     */
    public void setLocalizationType(@jakarta.annotation.Nullable final DeviceManagementExportJobLocalizationType value) {
        this.backingStore.set("localizationType", value);
    }
    /**
     * Sets the reportName property value. Name of the report
     * @param value Value to set for the reportName property.
     */
    public void setReportName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reportName", value);
    }
    /**
     * Sets the requestDateTime property value. Time that the exported report was requested
     * @param value Value to set for the requestDateTime property.
     */
    public void setRequestDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestDateTime", value);
    }
    /**
     * Sets the select property value. Columns selected from the report
     * @param value Value to set for the select property.
     */
    public void setSelect(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("select", value);
    }
    /**
     * Sets the snapshotId property value. A snapshot is an identifiable subset of the dataset represented by the ReportName. A sessionId or CachedReportConfiguration id can be used here. If a sessionId is specified, Filter, Select, and OrderBy are applied to the data represented by the sessionId. Filter, Select, and OrderBy cannot be specified together with a CachedReportConfiguration id.
     * @param value Value to set for the snapshotId property.
     */
    public void setSnapshotId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("snapshotId", value);
    }
    /**
     * Sets the status property value. Possible statuses associated with a generated report
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DeviceManagementReportStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the url property value. Temporary location of the exported report
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("url", value);
    }
}
