package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SensitivityLabelAssignment implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The assignmentMethod property
     */
    private SensitivityLabelAssignmentMethod assignmentMethod;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The unique identifier for the sensitivity label assigned to the file.
     */
    private String sensitivityLabelId;
    /**
     * The unique identifier for the tenant that hosts the file when this label is applied.
     */
    private String tenantId;
    /**
     * Instantiates a new sensitivityLabelAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SensitivityLabelAssignment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sensitivityLabelAssignment
     */
    @javax.annotation.Nonnull
    public static SensitivityLabelAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitivityLabelAssignment();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("assignmentMethod", (n) -> { this.setAssignmentMethod(n.getEnumValue(SensitivityLabelAssignmentMethod.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sensitivityLabelId", (n) -> { this.setSensitivityLabelId(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
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
     * Gets the sensitivityLabelId property value. The unique identifier for the sensitivity label assigned to the file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSensitivityLabelId() {
        return this.sensitivityLabelId;
    }
    /**
     * Gets the tenantId property value. The unique identifier for the tenant that hosts the file when this label is applied.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
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
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sensitivityLabelId", this.getSensitivityLabelId());
        writer.writeStringValue("tenantId", this.getTenantId());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sensitivityLabelId property value. The unique identifier for the sensitivity label assigned to the file.
     * @param value Value to set for the sensitivityLabelId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitivityLabelId(@javax.annotation.Nullable final String value) {
        this.sensitivityLabelId = value;
    }
    /**
     * Sets the tenantId property value. The unique identifier for the tenant that hosts the file when this label is applied.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
