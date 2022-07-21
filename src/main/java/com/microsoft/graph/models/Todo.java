package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Todo extends Entity implements Parsable {
    /** The task lists in the users mailbox. */
    private java.util.List<TodoTaskList> _lists;
    /**
     * Instantiates a new todo and sets the default values.
     * @return a void
     */
    public Todo() {
        super();
        this.setOdataType("#microsoft.graph.todo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a todo
     */
    @javax.annotation.Nonnull
    public static Todo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Todo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Todo currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("lists", (n) -> { currentObject.setLists(n.getCollectionOfObjectValues(TodoTaskList::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lists property value. The task lists in the users mailbox.
     * @return a todoTaskList
     */
    @javax.annotation.Nullable
    public java.util.List<TodoTaskList> getLists() {
        return this._lists;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setLists(@javax.annotation.Nullable final java.util.List<TodoTaskList> value) {
        this._lists = value;
    }
}
