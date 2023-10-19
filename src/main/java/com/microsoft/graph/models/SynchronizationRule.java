package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SynchronizationRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The containerFilter property
     */
    private ContainerFilter containerFilter;
    /**
     * true if the synchronization rule can be customized; false if this rule is read-only and shouldn't be changed.
     */
    private Boolean editable;
    /**
     * The groupFilter property
     */
    private GroupFilter groupFilter;
    /**
     * Synchronization rule identifier. Must be one of the identifiers recognized by the synchronization engine. Supported rule identifiers can be found in the synchronization template returned by the API.
     */
    private String id;
    /**
     * Additional extension properties. Unless instructed explicitly by the support team, metadata values shouldn't be changed.
     */
    private java.util.List<StringKeyStringValuePair> metadata;
    /**
     * Human-readable name of the synchronization rule. Not nullable.
     */
    private String name;
    /**
     * Collection of object mappings supported by the rule. Tells the synchronization engine which objects should be synchronized.
     */
    private java.util.List<ObjectMapping> objectMappings;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Priority relative to other rules in the synchronizationSchema. Rules with the lowest priority number will be processed first.
     */
    private Integer priority;
    /**
     * Name of the source directory. Must match one of the directory definitions in synchronizationSchema.
     */
    private String sourceDirectoryName;
    /**
     * Name of the target directory. Must match one of the directory definitions in synchronizationSchema.
     */
    private String targetDirectoryName;
    /**
     * Instantiates a new SynchronizationRule and sets the default values.
     */
    public SynchronizationRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SynchronizationRule
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationRule();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the containerFilter property value. The containerFilter property
     * @return a ContainerFilter
     */
    @jakarta.annotation.Nullable
    public ContainerFilter getContainerFilter() {
        return this.containerFilter;
    }
    /**
     * Gets the editable property value. true if the synchronization rule can be customized; false if this rule is read-only and shouldn't be changed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEditable() {
        return this.editable;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("containerFilter", (n) -> { this.setContainerFilter(n.getObjectValue(ContainerFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("editable", (n) -> { this.setEditable(n.getBooleanValue()); });
        deserializerMap.put("groupFilter", (n) -> { this.setGroupFilter(n.getObjectValue(GroupFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getCollectionOfObjectValues(StringKeyStringValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("objectMappings", (n) -> { this.setObjectMappings(n.getCollectionOfObjectValues(ObjectMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("sourceDirectoryName", (n) -> { this.setSourceDirectoryName(n.getStringValue()); });
        deserializerMap.put("targetDirectoryName", (n) -> { this.setTargetDirectoryName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupFilter property value. The groupFilter property
     * @return a GroupFilter
     */
    @jakarta.annotation.Nullable
    public GroupFilter getGroupFilter() {
        return this.groupFilter;
    }
    /**
     * Gets the id property value. Synchronization rule identifier. Must be one of the identifiers recognized by the synchronization engine. Supported rule identifiers can be found in the synchronization template returned by the API.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the metadata property value. Additional extension properties. Unless instructed explicitly by the support team, metadata values shouldn't be changed.
     * @return a java.util.List<StringKeyStringValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<StringKeyStringValuePair> getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the name property value. Human-readable name of the synchronization rule. Not nullable.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the objectMappings property value. Collection of object mappings supported by the rule. Tells the synchronization engine which objects should be synchronized.
     * @return a java.util.List<ObjectMapping>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ObjectMapping> getObjectMappings() {
        return this.objectMappings;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the priority property value. Priority relative to other rules in the synchronizationSchema. Rules with the lowest priority number will be processed first.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the sourceDirectoryName property value. Name of the source directory. Must match one of the directory definitions in synchronizationSchema.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceDirectoryName() {
        return this.sourceDirectoryName;
    }
    /**
     * Gets the targetDirectoryName property value. Name of the target directory. Must match one of the directory definitions in synchronizationSchema.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetDirectoryName() {
        return this.targetDirectoryName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("containerFilter", this.getContainerFilter());
        writer.writeBooleanValue("editable", this.getEditable());
        writer.writeObjectValue("groupFilter", this.getGroupFilter());
        writer.writeStringValue("id", this.getId());
        writer.writeCollectionOfObjectValues("metadata", this.getMetadata());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("objectMappings", this.getObjectMappings());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeStringValue("sourceDirectoryName", this.getSourceDirectoryName());
        writer.writeStringValue("targetDirectoryName", this.getTargetDirectoryName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the containerFilter property value. The containerFilter property
     * @param value Value to set for the containerFilter property.
     */
    public void setContainerFilter(@jakarta.annotation.Nullable final ContainerFilter value) {
        this.containerFilter = value;
    }
    /**
     * Sets the editable property value. true if the synchronization rule can be customized; false if this rule is read-only and shouldn't be changed.
     * @param value Value to set for the editable property.
     */
    public void setEditable(@jakarta.annotation.Nullable final Boolean value) {
        this.editable = value;
    }
    /**
     * Sets the groupFilter property value. The groupFilter property
     * @param value Value to set for the groupFilter property.
     */
    public void setGroupFilter(@jakarta.annotation.Nullable final GroupFilter value) {
        this.groupFilter = value;
    }
    /**
     * Sets the id property value. Synchronization rule identifier. Must be one of the identifiers recognized by the synchronization engine. Supported rule identifiers can be found in the synchronization template returned by the API.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the metadata property value. Additional extension properties. Unless instructed explicitly by the support team, metadata values shouldn't be changed.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final java.util.List<StringKeyStringValuePair> value) {
        this.metadata = value;
    }
    /**
     * Sets the name property value. Human-readable name of the synchronization rule. Not nullable.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the objectMappings property value. Collection of object mappings supported by the rule. Tells the synchronization engine which objects should be synchronized.
     * @param value Value to set for the objectMappings property.
     */
    public void setObjectMappings(@jakarta.annotation.Nullable final java.util.List<ObjectMapping> value) {
        this.objectMappings = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the priority property value. Priority relative to other rules in the synchronizationSchema. Rules with the lowest priority number will be processed first.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the sourceDirectoryName property value. Name of the source directory. Must match one of the directory definitions in synchronizationSchema.
     * @param value Value to set for the sourceDirectoryName property.
     */
    public void setSourceDirectoryName(@jakarta.annotation.Nullable final String value) {
        this.sourceDirectoryName = value;
    }
    /**
     * Sets the targetDirectoryName property value. Name of the target directory. Must match one of the directory definitions in synchronizationSchema.
     * @param value Value to set for the targetDirectoryName property.
     */
    public void setTargetDirectoryName(@jakarta.annotation.Nullable final String value) {
        this.targetDirectoryName = value;
    }
}
