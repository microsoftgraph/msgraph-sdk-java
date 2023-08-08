package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkflowVersion extends WorkflowBase implements Parsable {
    /**
     * The version of the workflow.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private Integer versionNumber;
    /**
     * Instantiates a new workflowVersion and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WorkflowVersion() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.workflowVersion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workflowVersion
     */
    @jakarta.annotation.Nonnull
    public static WorkflowVersion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkflowVersion();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("versionNumber", (n) -> { this.setVersionNumber(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the versionNumber property value. The version of the workflow.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersionNumber() {
        return this.versionNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("versionNumber", this.getVersionNumber());
    }
    /**
     * Sets the versionNumber property value. The version of the workflow.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the versionNumber property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersionNumber(@jakarta.annotation.Nullable final Integer value) {
        this.versionNumber = value;
    }
}
