package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Todo extends Entity implements Parsable {
    /** The task lists in the users mailbox. */
    private java.util.List<TodoTaskList> lists;
    /**
     * Instantiates a new Todo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Todo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Todo
     */
    @javax.annotation.Nonnull
    public static Todo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Todo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lists", (n) -> { this.setLists(n.getCollectionOfObjectValues(TodoTaskList::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lists property value. The task lists in the users mailbox.
     * @return a todoTaskList
     */
    @javax.annotation.Nullable
    public java.util.List<TodoTaskList> getLists() {
        return this.lists;
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
        writer.writeCollectionOfObjectValues("lists", this.getLists());
    }
    /**
     * Sets the lists property value. The task lists in the users mailbox.
     * @param value Value to set for the lists property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLists(@javax.annotation.Nullable final java.util.List<TodoTaskList> value) {
        this.lists = value;
    }
}
