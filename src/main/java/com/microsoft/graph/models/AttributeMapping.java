package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttributeMapping implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Default value to be used in case the source property was evaluated to null. Optional.
     */
    private String defaultValue;
    /**
     * For internal use only.
     */
    private Boolean exportMissingReferences;
    /**
     * The flowBehavior property
     */
    private AttributeFlowBehavior flowBehavior;
    /**
     * The flowType property
     */
    private AttributeFlowType flowType;
    /**
     * If higher than 0, this attribute will be used to perform an initial match of the objects between source and target directories. The synchronization engine will try to find the matching object using attribute with lowest value of matching priority first. If not found, the attribute with the next matching priority will be used, and so on a until match is found or no more matching attributes are left. Only attributes that are expected to have unique values, such as email, should be used as matching attributes.
     */
    private Integer matchingPriority;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Defines how a value should be extracted (or transformed) from the source object.
     */
    private AttributeMappingSource source;
    /**
     * Name of the attribute on the target object.
     */
    private String targetAttributeName;
    /**
     * Instantiates a new attributeMapping and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AttributeMapping() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attributeMapping
     */
    @javax.annotation.Nonnull
    public static AttributeMapping createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeMapping();
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
     * Gets the defaultValue property value. Default value to be used in case the source property was evaluated to null. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * Gets the exportMissingReferences property value. For internal use only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExportMissingReferences() {
        return this.exportMissingReferences;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
        deserializerMap.put("exportMissingReferences", (n) -> { this.setExportMissingReferences(n.getBooleanValue()); });
        deserializerMap.put("flowBehavior", (n) -> { this.setFlowBehavior(n.getEnumValue(AttributeFlowBehavior.class)); });
        deserializerMap.put("flowType", (n) -> { this.setFlowType(n.getEnumValue(AttributeFlowType.class)); });
        deserializerMap.put("matchingPriority", (n) -> { this.setMatchingPriority(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getObjectValue(AttributeMappingSource::createFromDiscriminatorValue)); });
        deserializerMap.put("targetAttributeName", (n) -> { this.setTargetAttributeName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the flowBehavior property value. The flowBehavior property
     * @return a attributeFlowBehavior
     */
    @javax.annotation.Nullable
    public AttributeFlowBehavior getFlowBehavior() {
        return this.flowBehavior;
    }
    /**
     * Gets the flowType property value. The flowType property
     * @return a attributeFlowType
     */
    @javax.annotation.Nullable
    public AttributeFlowType getFlowType() {
        return this.flowType;
    }
    /**
     * Gets the matchingPriority property value. If higher than 0, this attribute will be used to perform an initial match of the objects between source and target directories. The synchronization engine will try to find the matching object using attribute with lowest value of matching priority first. If not found, the attribute with the next matching priority will be used, and so on a until match is found or no more matching attributes are left. Only attributes that are expected to have unique values, such as email, should be used as matching attributes.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMatchingPriority() {
        return this.matchingPriority;
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
     * Gets the source property value. Defines how a value should be extracted (or transformed) from the source object.
     * @return a attributeMappingSource
     */
    @javax.annotation.Nullable
    public AttributeMappingSource getSource() {
        return this.source;
    }
    /**
     * Gets the targetAttributeName property value. Name of the attribute on the target object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetAttributeName() {
        return this.targetAttributeName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeBooleanValue("exportMissingReferences", this.getExportMissingReferences());
        writer.writeEnumValue("flowBehavior", this.getFlowBehavior());
        writer.writeEnumValue("flowType", this.getFlowType());
        writer.writeIntegerValue("matchingPriority", this.getMatchingPriority());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("source", this.getSource());
        writer.writeStringValue("targetAttributeName", this.getTargetAttributeName());
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
     * Sets the defaultValue property value. Default value to be used in case the source property was evaluated to null. Optional.
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultValue(@javax.annotation.Nullable final String value) {
        this.defaultValue = value;
    }
    /**
     * Sets the exportMissingReferences property value. For internal use only.
     * @param value Value to set for the exportMissingReferences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExportMissingReferences(@javax.annotation.Nullable final Boolean value) {
        this.exportMissingReferences = value;
    }
    /**
     * Sets the flowBehavior property value. The flowBehavior property
     * @param value Value to set for the flowBehavior property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFlowBehavior(@javax.annotation.Nullable final AttributeFlowBehavior value) {
        this.flowBehavior = value;
    }
    /**
     * Sets the flowType property value. The flowType property
     * @param value Value to set for the flowType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFlowType(@javax.annotation.Nullable final AttributeFlowType value) {
        this.flowType = value;
    }
    /**
     * Sets the matchingPriority property value. If higher than 0, this attribute will be used to perform an initial match of the objects between source and target directories. The synchronization engine will try to find the matching object using attribute with lowest value of matching priority first. If not found, the attribute with the next matching priority will be used, and so on a until match is found or no more matching attributes are left. Only attributes that are expected to have unique values, such as email, should be used as matching attributes.
     * @param value Value to set for the matchingPriority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMatchingPriority(@javax.annotation.Nullable final Integer value) {
        this.matchingPriority = value;
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
     * Sets the source property value. Defines how a value should be extracted (or transformed) from the source object.
     * @param value Value to set for the source property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSource(@javax.annotation.Nullable final AttributeMappingSource value) {
        this.source = value;
    }
    /**
     * Sets the targetAttributeName property value. Name of the attribute on the target object.
     * @param value Value to set for the targetAttributeName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetAttributeName(@javax.annotation.Nullable final String value) {
        this.targetAttributeName = value;
    }
}
