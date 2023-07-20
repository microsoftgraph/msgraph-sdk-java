package com.microsoft.graph.drives.item.items.item.assignsensitivitylabel;

import com.microsoft.graph.models.SensitivityLabelAssignmentMethod;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AssignSensitivityLabelPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The assignmentMethod property
     */
    private SensitivityLabelAssignmentMethod assignmentMethod;
    /**
     * The justificationText property
     */
    private String justificationText;
    /**
     * The sensitivityLabelId property
     */
    private String sensitivityLabelId;
    /**
     * Instantiates a new assignSensitivityLabelPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AssignSensitivityLabelPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignSensitivityLabelPostRequestBody
     */
    @javax.annotation.Nonnull
    public static AssignSensitivityLabelPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignSensitivityLabelPostRequestBody();
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
     * Gets the assignmentMethod property value. The assignmentMethod property
     * @return a sensitivityLabelAssignmentMethod
     */
    @javax.annotation.Nullable
    public SensitivityLabelAssignmentMethod getAssignmentMethod() {
        return this.assignmentMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("assignmentMethod", (n) -> { this.setAssignmentMethod(n.getEnumValue(SensitivityLabelAssignmentMethod.class)); });
        deserializerMap.put("justificationText", (n) -> { this.setJustificationText(n.getStringValue()); });
        deserializerMap.put("sensitivityLabelId", (n) -> { this.setSensitivityLabelId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the justificationText property value. The justificationText property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustificationText() {
        return this.justificationText;
    }
    /**
     * Gets the sensitivityLabelId property value. The sensitivityLabelId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSensitivityLabelId() {
        return this.sensitivityLabelId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentMethod", this.getAssignmentMethod());
        writer.writeStringValue("justificationText", this.getJustificationText());
        writer.writeStringValue("sensitivityLabelId", this.getSensitivityLabelId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the assignmentMethod property value. The assignmentMethod property
     * @param value Value to set for the assignmentMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentMethod(@javax.annotation.Nullable final SensitivityLabelAssignmentMethod value) {
        this.assignmentMethod = value;
    }
    /**
     * Sets the justificationText property value. The justificationText property
     * @param value Value to set for the justificationText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJustificationText(@javax.annotation.Nullable final String value) {
        this.justificationText = value;
    }
    /**
     * Sets the sensitivityLabelId property value. The sensitivityLabelId property
     * @param value Value to set for the sensitivityLabelId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitivityLabelId(@javax.annotation.Nullable final String value) {
        this.sensitivityLabelId = value;
    }
}
