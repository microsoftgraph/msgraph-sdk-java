package com.microsoft.graph.models;

import com.microsoft.graph.models.ExclusionGroupAssignmentTarget;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupAssignmentTarget extends DeviceAndAppManagementAssignmentTarget implements Parsable {
    /** The group Id that is the target of the assignment. */
    private String _groupId;
    /**
     * Instantiates a new GroupAssignmentTarget and sets the default values.
     * @return a void
     */
    public GroupAssignmentTarget() {
        super();
        this.setOdataType("#microsoft.graph.groupAssignmentTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupAssignmentTarget
     */
    @javax.annotation.Nonnull
    public static GroupAssignmentTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.exclusionGroupAssignmentTarget": return new ExclusionGroupAssignmentTarget();
            }
        }
        return new GroupAssignmentTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupAssignmentTarget currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("groupId", (n) -> { currentObject.setGroupId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the groupId property value. The group Id that is the target of the assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupId() {
        return this._groupId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("groupId", this.getGroupId());
    }
    /**
     * Sets the groupId property value. The group Id that is the target of the assignment.
     * @param value Value to set for the groupId property.
     * @return a void
     */
    public void setGroupId(@javax.annotation.Nullable final String value) {
        this._groupId = value;
    }
}
