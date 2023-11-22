package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TodoTaskList extends Entity implements Parsable {
    /**
     * Instantiates a new TodoTaskList and sets the default values.
     */
    public TodoTaskList() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TodoTaskList
     */
    @jakarta.annotation.Nonnull
    public static TodoTaskList createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TodoTaskList();
    }
    /**
     * Gets the displayName property value. The name of the task list.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the task list. Nullable.
     * @return a java.util.List<Extension>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("isOwner", (n) -> { this.setIsOwner(n.getBooleanValue()); });
        deserializerMap.put("isShared", (n) -> { this.setIsShared(n.getBooleanValue()); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(TodoTask::createFromDiscriminatorValue)); });
        deserializerMap.put("wellknownListName", (n) -> { this.setWellknownListName(n.getEnumValue(WellknownListName::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isOwner property value. True if the user is owner of the given task list.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOwner() {
        return this.backingStore.get("isOwner");
    }
    /**
     * Gets the isShared property value. True if the task list is shared with other users
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsShared() {
        return this.backingStore.get("isShared");
    }
    /**
     * Gets the tasks property value. The tasks in this task list. Read-only. Nullable.
     * @return a java.util.List<TodoTask>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TodoTask> getTasks() {
        return this.backingStore.get("tasks");
    }
    /**
     * Gets the wellknownListName property value. The wellknownListName property
     * @return a WellknownListName
     */
    @jakarta.annotation.Nullable
    public WellknownListName getWellknownListName() {
        return this.backingStore.get("wellknownListName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeBooleanValue("isOwner", this.getIsOwner());
        writer.writeBooleanValue("isShared", this.getIsShared());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
        writer.writeEnumValue("wellknownListName", this.getWellknownListName());
    }
    /**
     * Sets the displayName property value. The name of the task list.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the task list. Nullable.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Extension> value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the isOwner property value. True if the user is owner of the given task list.
     * @param value Value to set for the isOwner property.
     */
    public void setIsOwner(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOwner", value);
    }
    /**
     * Sets the isShared property value. True if the task list is shared with other users
     * @param value Value to set for the isShared property.
     */
    public void setIsShared(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isShared", value);
    }
    /**
     * Sets the tasks property value. The tasks in this task list. Read-only. Nullable.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<TodoTask> value) {
        this.backingStore.set("tasks", value);
    }
    /**
     * Sets the wellknownListName property value. The wellknownListName property
     * @param value Value to set for the wellknownListName property.
     */
    public void setWellknownListName(@jakarta.annotation.Nullable final WellknownListName value) {
        this.backingStore.set("wellknownListName", value);
    }
}
