package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Todo extends Entity implements Parsable {
    /**
     * The task lists in the users mailbox.
     */
    private java.util.List<TodoTaskList> lists;
    /**
     * Instantiates a new todo and sets the default values.
     */
    public Todo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a todo
     */
    @jakarta.annotation.Nonnull
    public static Todo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Todo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lists", (n) -> { this.setLists(n.getCollectionOfObjectValues(TodoTaskList::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lists property value. The task lists in the users mailbox.
     * @return a todoTaskList
     */
    @jakarta.annotation.Nullable
    public java.util.List<TodoTaskList> getLists() {
        return this.lists;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("lists", this.getLists());
    }
    /**
     * Sets the lists property value. The task lists in the users mailbox.
     * @param value Value to set for the lists property.
     */
    public void setLists(@jakarta.annotation.Nullable final java.util.List<TodoTaskList> value) {
        this.lists = value;
    }
}
