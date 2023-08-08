package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.User;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkflowBase implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The category property
     */
    private LifecycleWorkflowCategory category;
    /**
     * The user who created the workflow.
     */
    private User createdBy;
    /**
     * When a workflow was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * A string that describes the purpose of the workflow.
     */
    private String description;
    /**
     * A string to identify the workflow.
     */
    private String displayName;
    /**
     * Defines when and for who the workflow will run.
     */
    private WorkflowExecutionConditions executionConditions;
    /**
     * Whether the workflow is enabled or disabled. If this setting is true, the workflow can be run on demand or on schedule when isSchedulingEnabled is true.
     */
    private Boolean isEnabled;
    /**
     * If true, the Lifecycle Workflow engine executes the workflow based on the schedule defined by tenant settings. Cannot be true for a disabled workflow (where isEnabled is false).
     */
    private Boolean isSchedulingEnabled;
    /**
     * The unique identifier of the AAD identity that last modified the workflow.
     */
    private User lastModifiedBy;
    /**
     * When the workflow was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The tasks in the workflow.
     */
    private java.util.List<Task> tasks;
    /**
     * Instantiates a new workflowBase and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WorkflowBase() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workflowBase
     */
    @jakarta.annotation.Nonnull
    public static WorkflowBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.identityGovernance.workflow": return new Workflow();
                case "#microsoft.graph.identityGovernance.workflowVersion": return new WorkflowVersion();
            }
        }
        return new WorkflowBase();
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
     * Gets the category property value. The category property
     * @return a lifecycleWorkflowCategory
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the createdBy property value. The user who created the workflow.
     * @return a user
     */
    @jakarta.annotation.Nullable
    public User getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. When a workflow was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. A string that describes the purpose of the workflow.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. A string to identify the workflow.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the executionConditions property value. Defines when and for who the workflow will run.
     * @return a workflowExecutionConditions
     */
    @jakarta.annotation.Nullable
    public WorkflowExecutionConditions getExecutionConditions() {
        return this.executionConditions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(LifecycleWorkflowCategory.class)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("executionConditions", (n) -> { this.setExecutionConditions(n.getObjectValue(WorkflowExecutionConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSchedulingEnabled", (n) -> { this.setIsSchedulingEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(Task::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Whether the workflow is enabled or disabled. If this setting is true, the workflow can be run on demand or on schedule when isSchedulingEnabled is true.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the isSchedulingEnabled property value. If true, the Lifecycle Workflow engine executes the workflow based on the schedule defined by tenant settings. Cannot be true for a disabled workflow (where isEnabled is false).
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSchedulingEnabled() {
        return this.isSchedulingEnabled;
    }
    /**
     * Gets the lastModifiedBy property value. The unique identifier of the AAD identity that last modified the workflow.
     * @return a user
     */
    @jakarta.annotation.Nullable
    public User getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. When the workflow was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
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
     * Gets the tasks property value. The tasks in the workflow.
     * @return a task
     */
    @jakarta.annotation.Nullable
    public java.util.List<Task> getTasks() {
        return this.tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("executionConditions", this.getExecutionConditions());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeBooleanValue("isSchedulingEnabled", this.getIsSchedulingEnabled());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCategory(@jakarta.annotation.Nullable final LifecycleWorkflowCategory value) {
        this.category = value;
    }
    /**
     * Sets the createdBy property value. The user who created the workflow.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedBy(@jakarta.annotation.Nullable final User value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. When a workflow was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. A string that describes the purpose of the workflow.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. A string to identify the workflow.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the executionConditions property value. Defines when and for who the workflow will run.
     * @param value Value to set for the executionConditions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setExecutionConditions(@jakarta.annotation.Nullable final WorkflowExecutionConditions value) {
        this.executionConditions = value;
    }
    /**
     * Sets the isEnabled property value. Whether the workflow is enabled or disabled. If this setting is true, the workflow can be run on demand or on schedule when isSchedulingEnabled is true.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the isSchedulingEnabled property value. If true, the Lifecycle Workflow engine executes the workflow based on the schedule defined by tenant settings. Cannot be true for a disabled workflow (where isEnabled is false).
     * @param value Value to set for the isSchedulingEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsSchedulingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isSchedulingEnabled = value;
    }
    /**
     * Sets the lastModifiedBy property value. The unique identifier of the AAD identity that last modified the workflow.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedBy(@jakarta.annotation.Nullable final User value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. When the workflow was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the tasks property value. The tasks in the workflow.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<Task> value) {
        this.tasks = value;
    }
}
