package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TodoTaskList extends Entity implements Parsable {
    /**
     * The name of the task list.
     */
    private String displayName;
    /**
     * The collection of open extensions defined for the task list. Nullable.
     */
    private java.util.List<Extension> extensions;
    /**
     * True if the user is owner of the given task list.
     */
    private Boolean isOwner;
    /**
     * True if the task list is shared with other users
     */
    private Boolean isShared;
    /**
     * The tasks in this task list. Read-only. Nullable.
     */
    private java.util.List<TodoTask> tasks;
    /**
     * The wellknownListName property
     */
    private WellknownListName wellknownListName;
    /**
     * Instantiates a new todoTaskList and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TodoTaskList() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a todoTaskList
     */
    @javax.annotation.Nonnull
    public static TodoTaskList createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TodoTaskList();
    }
    /**
     * Gets the displayName property value. The name of the task list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the task list. Nullable.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("isOwner", (n) -> { this.setIsOwner(n.getBooleanValue()); });
        deserializerMap.put("isShared", (n) -> { this.setIsShared(n.getBooleanValue()); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(TodoTask::createFromDiscriminatorValue)); });
        deserializerMap.put("wellknownListName", (n) -> { this.setWellknownListName(n.getEnumValue(WellknownListName.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isOwner property value. True if the user is owner of the given task list.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOwner() {
        return this.isOwner;
    }
    /**
     * Gets the isShared property value. True if the task list is shared with other users
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsShared() {
        return this.isShared;
    }
    /**
     * Gets the tasks property value. The tasks in this task list. Read-only. Nullable.
     * @return a todoTask
     */
    @javax.annotation.Nullable
    public java.util.List<TodoTask> getTasks() {
        return this.tasks;
    }
    /**
     * Gets the wellknownListName property value. The wellknownListName property
     * @return a WellknownListName
     */
    @javax.annotation.Nullable
    public WellknownListName getWellknownListName() {
        return this.wellknownListName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the task list. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this.extensions = value;
    }
    /**
     * Sets the isOwner property value. True if the user is owner of the given task list.
     * @param value Value to set for the isOwner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsOwner(@javax.annotation.Nullable final Boolean value) {
        this.isOwner = value;
    }
    /**
     * Sets the isShared property value. True if the task list is shared with other users
     * @param value Value to set for the isShared property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsShared(@javax.annotation.Nullable final Boolean value) {
        this.isShared = value;
    }
    /**
     * Sets the tasks property value. The tasks in this task list. Read-only. Nullable.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTasks(@javax.annotation.Nullable final java.util.List<TodoTask> value) {
        this.tasks = value;
    }
    /**
     * Sets the wellknownListName property value. The wellknownListName property
     * @param value Value to set for the wellknownListName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWellknownListName(@javax.annotation.Nullable final WellknownListName value) {
        this.wellknownListName = value;
    }
}
