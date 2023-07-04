package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RunSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of failed workflow runs.
     */
    private Integer failedRuns;
    /**
     * The number of failed tasks of a workflow.
     */
    private Integer failedTasks;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The number of successful workflow runs.
     */
    private Integer successfulRuns;
    /**
     * The total number of runs for a workflow.
     */
    private Integer totalRuns;
    /**
     * The total number of tasks processed by a workflow.
     */
    private Integer totalTasks;
    /**
     * The total number of users processed by a workflow.
     */
    private Integer totalUsers;
    /**
     * Instantiates a new runSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RunSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a runSummary
     */
    @javax.annotation.Nonnull
    public static RunSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunSummary();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the failedRuns property value. The number of failed workflow runs.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedRuns() {
        return this.failedRuns;
    }
    /**
     * Gets the failedTasks property value. The number of failed tasks of a workflow.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedTasks() {
        return this.failedTasks;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("failedRuns", (n) -> { this.setFailedRuns(n.getIntegerValue()); });
        deserializerMap.put("failedTasks", (n) -> { this.setFailedTasks(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("successfulRuns", (n) -> { this.setSuccessfulRuns(n.getIntegerValue()); });
        deserializerMap.put("totalRuns", (n) -> { this.setTotalRuns(n.getIntegerValue()); });
        deserializerMap.put("totalTasks", (n) -> { this.setTotalTasks(n.getIntegerValue()); });
        deserializerMap.put("totalUsers", (n) -> { this.setTotalUsers(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the successfulRuns property value. The number of successful workflow runs.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessfulRuns() {
        return this.successfulRuns;
    }
    /**
     * Gets the totalRuns property value. The total number of runs for a workflow.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalRuns() {
        return this.totalRuns;
    }
    /**
     * Gets the totalTasks property value. The total number of tasks processed by a workflow.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalTasks() {
        return this.totalTasks;
    }
    /**
     * Gets the totalUsers property value. The total number of users processed by a workflow.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUsers() {
        return this.totalUsers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedRuns", this.getFailedRuns());
        writer.writeIntegerValue("failedTasks", this.getFailedTasks());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("successfulRuns", this.getSuccessfulRuns());
        writer.writeIntegerValue("totalRuns", this.getTotalRuns());
        writer.writeIntegerValue("totalTasks", this.getTotalTasks());
        writer.writeIntegerValue("totalUsers", this.getTotalUsers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the failedRuns property value. The number of failed workflow runs.
     * @param value Value to set for the failedRuns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedRuns(@javax.annotation.Nullable final Integer value) {
        this.failedRuns = value;
    }
    /**
     * Sets the failedTasks property value. The number of failed tasks of a workflow.
     * @param value Value to set for the failedTasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedTasks(@javax.annotation.Nullable final Integer value) {
        this.failedTasks = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the successfulRuns property value. The number of successful workflow runs.
     * @param value Value to set for the successfulRuns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuccessfulRuns(@javax.annotation.Nullable final Integer value) {
        this.successfulRuns = value;
    }
    /**
     * Sets the totalRuns property value. The total number of runs for a workflow.
     * @param value Value to set for the totalRuns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalRuns(@javax.annotation.Nullable final Integer value) {
        this.totalRuns = value;
    }
    /**
     * Sets the totalTasks property value. The total number of tasks processed by a workflow.
     * @param value Value to set for the totalTasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalTasks(@javax.annotation.Nullable final Integer value) {
        this.totalTasks = value;
    }
    /**
     * Sets the totalUsers property value. The total number of users processed by a workflow.
     * @param value Value to set for the totalUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalUsers(@javax.annotation.Nullable final Integer value) {
        this.totalUsers = value;
    }
}
