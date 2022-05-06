package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookFilter extends Entity implements Parsable {
    /** The currently applied filter on the given column. Read-only.  */
    private WorkbookFilterCriteria _criteria;
    /**
     * Instantiates a new workbookFilter and sets the default values.
     * @return a void
     */
    public WorkbookFilter() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookFilter
     */
    @javax.annotation.Nonnull
    public static WorkbookFilter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookFilter();
    }
    /**
     * Gets the criteria property value. The currently applied filter on the given column. Read-only.
     * @return a workbookFilterCriteria
     */
    @javax.annotation.Nullable
    public WorkbookFilterCriteria getCriteria() {
        return this._criteria;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookFilter currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("criteria", (n) -> { currentObject.setCriteria(n.getObjectValue(WorkbookFilterCriteria::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("criteria", this.getCriteria());
    }
    /**
     * Sets the criteria property value. The currently applied filter on the given column. Read-only.
     * @param value Value to set for the criteria property.
     * @return a void
     */
    public void setCriteria(@javax.annotation.Nullable final WorkbookFilterCriteria value) {
        this._criteria = value;
    }
}
