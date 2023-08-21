package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaskReportSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of failed tasks in a report.
     */
    private Integer failedTasks;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The total number of successful tasks in a report.
     */
    private Integer successfulTasks;
    /**
     * The total number of tasks in a report.
     */
    private Integer totalTasks;
    /**
     * The number of unprocessed tasks in a report.
     */
    private Integer unprocessedTasks;
    /**
     * Instantiates a new taskReportSummary and sets the default values.
     */
    public TaskReportSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a taskReportSummary
     */
    @jakarta.annotation.Nonnull
    public static TaskReportSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskReportSummary();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the failedTasks property value. The number of failed tasks in a report.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedTasks() {
        return this.failedTasks;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("failedTasks", (n) -> { this.setFailedTasks(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("successfulTasks", (n) -> { this.setSuccessfulTasks(n.getIntegerValue()); });
        deserializerMap.put("totalTasks", (n) -> { this.setTotalTasks(n.getIntegerValue()); });
        deserializerMap.put("unprocessedTasks", (n) -> { this.setUnprocessedTasks(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the successfulTasks property value. The total number of successful tasks in a report.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulTasks() {
        return this.successfulTasks;
    }
    /**
     * Gets the totalTasks property value. The total number of tasks in a report.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalTasks() {
        return this.totalTasks;
    }
    /**
     * Gets the unprocessedTasks property value. The number of unprocessed tasks in a report.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnprocessedTasks() {
        return this.unprocessedTasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedTasks", this.getFailedTasks());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("successfulTasks", this.getSuccessfulTasks());
        writer.writeIntegerValue("totalTasks", this.getTotalTasks());
        writer.writeIntegerValue("unprocessedTasks", this.getUnprocessedTasks());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the failedTasks property value. The number of failed tasks in a report.
     * @param value Value to set for the failedTasks property.
     */
    public void setFailedTasks(@jakarta.annotation.Nullable final Integer value) {
        this.failedTasks = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the successfulTasks property value. The total number of successful tasks in a report.
     * @param value Value to set for the successfulTasks property.
     */
    public void setSuccessfulTasks(@jakarta.annotation.Nullable final Integer value) {
        this.successfulTasks = value;
    }
    /**
     * Sets the totalTasks property value. The total number of tasks in a report.
     * @param value Value to set for the totalTasks property.
     */
    public void setTotalTasks(@jakarta.annotation.Nullable final Integer value) {
        this.totalTasks = value;
    }
    /**
     * Sets the unprocessedTasks property value. The number of unprocessed tasks in a report.
     * @param value Value to set for the unprocessedTasks property.
     */
    public void setUnprocessedTasks(@jakarta.annotation.Nullable final Integer value) {
        this.unprocessedTasks = value;
    }
}
