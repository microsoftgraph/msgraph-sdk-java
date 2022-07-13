package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartGridlinesFormat extends Entity implements Parsable {
    /** Represents chart line formatting. Read-only. */
    private WorkbookChartLineFormat _line;
    /**
     * Instantiates a new workbookChartGridlinesFormat and sets the default values.
     * @return a void
     */
    public WorkbookChartGridlinesFormat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartGridlinesFormat
     */
    @javax.annotation.Nonnull
    public static WorkbookChartGridlinesFormat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartGridlinesFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartGridlinesFormat currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("line", (n) -> { currentObject.setLine(n.getObjectValue(WorkbookChartLineFormat::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the line property value. Represents chart line formatting. Read-only.
     * @return a workbookChartLineFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartLineFormat getLine() {
        return this._line;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("line", this.getLine());
    }
    /**
     * Sets the line property value. Represents chart line formatting. Read-only.
     * @param value Value to set for the line property.
     * @return a void
     */
    public void setLine(@javax.annotation.Nullable final WorkbookChartLineFormat value) {
        this._line = value;
    }
}
