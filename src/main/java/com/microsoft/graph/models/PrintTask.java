package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintTask extends Entity implements Parsable {
    /** The definition property  */
    private PrintTaskDefinition _definition;
    /** The URL for the print entity that triggered this task. For example, https://graph.microsoft.com/beta/print/printers/{printerId}/jobs/{jobId}. Read-only.  */
    private String _parentUrl;
    /** The status property  */
    private PrintTaskStatus _status;
    /** The trigger property  */
    private PrintTaskTrigger _trigger;
    /**
     * Instantiates a new printTask and sets the default values.
     * @return a void
     */
    public PrintTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printTask
     */
    @javax.annotation.Nonnull
    public static PrintTask createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintTask();
    }
    /**
     * Gets the definition property value. The definition property
     * @return a printTaskDefinition
     */
    @javax.annotation.Nullable
    public PrintTaskDefinition getDefinition() {
        return this._definition;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrintTask currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("definition", (n) -> { currentObject.setDefinition(n.getObjectValue(PrintTaskDefinition::createFromDiscriminatorValue)); });
            this.put("parentUrl", (n) -> { currentObject.setParentUrl(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getObjectValue(PrintTaskStatus::createFromDiscriminatorValue)); });
            this.put("trigger", (n) -> { currentObject.setTrigger(n.getObjectValue(PrintTaskTrigger::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the parentUrl property value. The URL for the print entity that triggered this task. For example, https://graph.microsoft.com/beta/print/printers/{printerId}/jobs/{jobId}. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentUrl() {
        return this._parentUrl;
    }
    /**
     * Gets the status property value. The status property
     * @return a printTaskStatus
     */
    @javax.annotation.Nullable
    public PrintTaskStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the trigger property value. The trigger property
     * @return a printTaskTrigger
     */
    @javax.annotation.Nullable
    public PrintTaskTrigger getTrigger() {
        return this._trigger;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("definition", this.getDefinition());
        writer.writeStringValue("parentUrl", this.getParentUrl());
        writer.writeObjectValue("status", this.getStatus());
        writer.writeObjectValue("trigger", this.getTrigger());
    }
    /**
     * Sets the definition property value. The definition property
     * @param value Value to set for the definition property.
     * @return a void
     */
    public void setDefinition(@javax.annotation.Nullable final PrintTaskDefinition value) {
        this._definition = value;
    }
    /**
     * Sets the parentUrl property value. The URL for the print entity that triggered this task. For example, https://graph.microsoft.com/beta/print/printers/{printerId}/jobs/{jobId}. Read-only.
     * @param value Value to set for the parentUrl property.
     * @return a void
     */
    public void setParentUrl(@javax.annotation.Nullable final String value) {
        this._parentUrl = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final PrintTaskStatus value) {
        this._status = value;
    }
    /**
     * Sets the trigger property value. The trigger property
     * @param value Value to set for the trigger property.
     * @return a void
     */
    public void setTrigger(@javax.annotation.Nullable final PrintTaskTrigger value) {
        this._trigger = value;
    }
}
