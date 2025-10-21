package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementReports extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementReports} and sets the default values.
     */
    public DeviceManagementReports() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementReports}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementReports createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementReports();
    }
    /**
     * Gets the exportJobs property value. Entity representing a job to export a report.
     * @return a {@link java.util.List<DeviceManagementExportJob>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementExportJob> getExportJobs() {
        return this.backingStore.get("exportJobs");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exportJobs", (n) -> { this.setExportJobs(n.getCollectionOfObjectValues(DeviceManagementExportJob::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("exportJobs", this.getExportJobs());
    }
    /**
     * Sets the exportJobs property value. Entity representing a job to export a report.
     * @param value Value to set for the exportJobs property.
     */
    public void setExportJobs(@jakarta.annotation.Nullable final java.util.List<DeviceManagementExportJob> value) {
        this.backingStore.set("exportJobs", value);
    }
}
