package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Casts the previous resource to user. */
public class PlannerBucket extends Entity implements Parsable {
    /** Name of the bucket. */
    private String _name;
    /** Hint used to order items of this type in a list view. The format is defined as outlined here. */
    private String _orderHint;
    /** Plan ID to which the bucket belongs. */
    private String _planId;
    /** Read-only. Nullable. The collection of tasks in the bucket. */
    private java.util.List<PlannerTask> _tasks;
    /**
     * Instantiates a new plannerBucket and sets the default values.
     * @return a void
     */
    public PlannerBucket() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerBucket
     */
    @javax.annotation.Nonnull
    public static PlannerBucket createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerBucket();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlannerBucket currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("orderHint", (n) -> { currentObject.setOrderHint(n.getStringValue()); });
            this.put("planId", (n) -> { currentObject.setPlanId(n.getStringValue()); });
            this.put("tasks", (n) -> { currentObject.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the name property value. Name of the bucket.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the orderHint property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrderHint() {
        return this._orderHint;
    }
    /**
     * Gets the planId property value. Plan ID to which the bucket belongs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlanId() {
        return this._planId;
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. The collection of tasks in the bucket.
     * @return a plannerTask
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this._tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("orderHint", this.getOrderHint());
        writer.writeStringValue("planId", this.getPlanId());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the name property value. Name of the bucket.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the orderHint property value. Hint used to order items of this type in a list view. The format is defined as outlined here.
     * @param value Value to set for the orderHint property.
     * @return a void
     */
    public void setOrderHint(@javax.annotation.Nullable final String value) {
        this._orderHint = value;
    }
    /**
     * Sets the planId property value. Plan ID to which the bucket belongs.
     * @param value Value to set for the planId property.
     * @return a void
     */
    public void setPlanId(@javax.annotation.Nullable final String value) {
        this._planId = value;
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. The collection of tasks in the bucket.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    public void setTasks(@javax.annotation.Nullable final java.util.List<PlannerTask> value) {
        this._tasks = value;
    }
}
