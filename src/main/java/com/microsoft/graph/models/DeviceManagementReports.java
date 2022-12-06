package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementReports extends Entity implements Parsable {
    /** Entity representing a job to export a report */
    private java.util.List<DeviceManagementExportJob> _exportJobs;
    /**
     * Instantiates a new deviceManagementReports and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementReports() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementReports
     */
    @javax.annotation.Nonnull
    public static DeviceManagementReports createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementReports();
    }
    /**
     * Gets the exportJobs property value. Entity representing a job to export a report
     * @return a deviceManagementExportJob
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementExportJob> getExportJobs() {
        return this._exportJobs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exportJobs", (n) -> { this.setExportJobs(n.getCollectionOfObjectValues(DeviceManagementExportJob::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeCollectionOfObjectValues("exportJobs", this.getExportJobs());
    }
    /**
     * Sets the exportJobs property value. Entity representing a job to export a report
     * @param value Value to set for the exportJobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExportJobs(@javax.annotation.Nullable final java.util.List<DeviceManagementExportJob> value) {
        this._exportJobs = value;
    }
}
