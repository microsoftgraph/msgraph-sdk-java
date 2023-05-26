package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationRule implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The containerFilter property */
    private ContainerFilter containerFilter;
    /** The editable property */
    private Boolean editable;
    /** The groupFilter property */
    private GroupFilter groupFilter;
    /** The id property */
    private String id;
    /** The metadata property */
    private java.util.List<StringKeyStringValuePair> metadata;
    /** The name property */
    private String name;
    /** The objectMappings property */
    private java.util.List<ObjectMapping> objectMappings;
    /** The OdataType property */
    private String odataType;
    /** The priority property */
    private Integer priority;
    /** The sourceDirectoryName property */
    private String sourceDirectoryName;
    /** The targetDirectoryName property */
    private String targetDirectoryName;
    /**
     * Instantiates a new synchronizationRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SynchronizationRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationRule
     */
    @javax.annotation.Nonnull
    public static SynchronizationRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationRule();
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
     * Gets the containerFilter property value. The containerFilter property
     * @return a containerFilter
     */
    @javax.annotation.Nullable
    public ContainerFilter getContainerFilter() {
        return this.containerFilter;
    }
    /**
     * Gets the editable property value. The editable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEditable() {
        return this.editable;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a groupFilter
     */
    @javax.annotation.Nullable
    public GroupFilter getGroupFilter() {
        return this.groupFilter;
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the metadata property value. The metadata property
     * @return a stringKeyStringValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<StringKeyStringValuePair> getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the objectMappings property value. The objectMappings property
     * @return a objectMapping
     */
    @javax.annotation.Nullable
    public java.util.List<ObjectMapping> getObjectMappings() {
        return this.objectMappings;
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
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the sourceDirectoryName property value. The sourceDirectoryName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceDirectoryName() {
        return this.sourceDirectoryName;
    }
    /**
     * Gets the targetDirectoryName property value. The targetDirectoryName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetDirectoryName() {
        return this.targetDirectoryName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the containerFilter property value. The containerFilter property
     * @param value Value to set for the containerFilter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContainerFilter(@javax.annotation.Nullable final ContainerFilter value) {
        this.containerFilter = value;
    }
    /**
     * Sets the editable property value. The editable property
     * @param value Value to set for the editable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEditable(@javax.annotation.Nullable final Boolean value) {
        this.editable = value;
    }
    /**
     * Sets the groupFilter property value. The groupFilter property
     * @param value Value to set for the groupFilter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupFilter(@javax.annotation.Nullable final GroupFilter value) {
        this.groupFilter = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the metadata property value. The metadata property
     * @param value Value to set for the metadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetadata(@javax.annotation.Nullable final java.util.List<StringKeyStringValuePair> value) {
        this.metadata = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the objectMappings property value. The objectMappings property
     * @param value Value to set for the objectMappings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setObjectMappings(@javax.annotation.Nullable final java.util.List<ObjectMapping> value) {
        this.objectMappings = value;
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
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the sourceDirectoryName property value. The sourceDirectoryName property
     * @param value Value to set for the sourceDirectoryName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceDirectoryName(@javax.annotation.Nullable final String value) {
        this.sourceDirectoryName = value;
    }
    /**
     * Sets the targetDirectoryName property value. The targetDirectoryName property
     * @param value Value to set for the targetDirectoryName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetDirectoryName(@javax.annotation.Nullable final String value) {
        this.targetDirectoryName = value;
    }
}
