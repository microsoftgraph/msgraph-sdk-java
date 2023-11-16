package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaskDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new TaskDefinition and sets the default values.
     */
    public TaskDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TaskDefinition
     */
    @jakarta.annotation.Nonnull
    public static TaskDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskDefinition();
    }
    /**
     * Gets the category property value. The category property
     * @return a EnumSet<LifecycleTaskCategory>
     */
    @jakarta.annotation.Nullable
    public EnumSet<LifecycleTaskCategory> getCategory() {
        return this.BackingStore.get("category");
    }
    /**
     * Gets the continueOnError property value. The continueOnError property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContinueOnError() {
        return this.BackingStore.get("continueOnError");
    }
    /**
     * Gets the description property value. The description of the taskDefinition.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the taskDefinition.Supports $filter(eq, ne) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumSetValue(LifecycleTaskCategory.class)); });
        deserializerMap.put("continueOnError", (n) -> { this.setContinueOnError(n.getBooleanValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("parameters", (n) -> { this.setParameters(n.getCollectionOfObjectValues(Parameter::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the parameters property value. The parameters that must be supplied when creating a workflow task object.Supports $filter(any).
     * @return a java.util.List<Parameter>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Parameter> getParameters() {
        return this.BackingStore.get("parameters");
    }
    /**
     * Gets the version property value. The version number of the taskDefinition. New records are pushed when we add support for new parameters.Supports $filter(ge, gt, le, lt, eq, ne) and $orderby.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.BackingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("category", this.getCategory());
        writer.writeBooleanValue("continueOnError", this.getContinueOnError());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final EnumSet<LifecycleTaskCategory> value) {
        this.BackingStore.set("category", value);
    }
    /**
     * Sets the continueOnError property value. The continueOnError property
     * @param value Value to set for the continueOnError property.
     */
    public void setContinueOnError(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("continueOnError", value);
    }
    /**
     * Sets the description property value. The description of the taskDefinition.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the taskDefinition.Supports $filter(eq, ne) and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the parameters property value. The parameters that must be supplied when creating a workflow task object.Supports $filter(any).
     * @param value Value to set for the parameters property.
     */
    public void setParameters(@jakarta.annotation.Nullable final java.util.List<Parameter> value) {
        this.BackingStore.set("parameters", value);
    }
    /**
     * Sets the version property value. The version number of the taskDefinition. New records are pushed when we add support for new parameters.Supports $filter(ge, gt, le, lt, eq, ne) and $orderby.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("version", value);
    }
}
