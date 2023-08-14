package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintTask extends Entity implements Parsable {
    /**
     * The definition property
     */
    private PrintTaskDefinition definition;
    /**
     * The URL for the print entity that triggered this task. For example, https://graph.microsoft.com/v1.0/print/printers/{printerId}/jobs/{jobId}. Read-only.
     */
    private String parentUrl;
    /**
     * The status property
     */
    private PrintTaskStatus status;
    /**
     * The trigger property
     */
    private PrintTaskTrigger trigger;
    /**
     * Instantiates a new printTask and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PrintTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printTask
     */
    @jakarta.annotation.Nonnull
    public static PrintTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintTask();
    }
    /**
     * Gets the definition property value. The definition property
     * @return a printTaskDefinition
     */
    @jakarta.annotation.Nullable
    public PrintTaskDefinition getDefinition() {
        return this.definition;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("definition", (n) -> { this.setDefinition(n.getObjectValue(PrintTaskDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("parentUrl", (n) -> { this.setParentUrl(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(PrintTaskStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("trigger", (n) -> { this.setTrigger(n.getObjectValue(PrintTaskTrigger::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the parentUrl property value. The URL for the print entity that triggered this task. For example, https://graph.microsoft.com/v1.0/print/printers/{printerId}/jobs/{jobId}. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getParentUrl() {
        return this.parentUrl;
    }
    /**
     * Gets the status property value. The status property
     * @return a printTaskStatus
     */
    @jakarta.annotation.Nullable
    public PrintTaskStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the trigger property value. The trigger property
     * @return a printTaskTrigger
     */
    @jakarta.annotation.Nullable
    public PrintTaskTrigger getTrigger() {
        return this.trigger;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setDefinition(@jakarta.annotation.Nullable final PrintTaskDefinition value) {
        this.definition = value;
    }
    /**
     * Sets the parentUrl property value. The URL for the print entity that triggered this task. For example, https://graph.microsoft.com/v1.0/print/printers/{printerId}/jobs/{jobId}. Read-only.
     * @param value Value to set for the parentUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setParentUrl(@jakarta.annotation.Nullable final String value) {
        this.parentUrl = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final PrintTaskStatus value) {
        this.status = value;
    }
    /**
     * Sets the trigger property value. The trigger property
     * @param value Value to set for the trigger property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTrigger(@jakarta.annotation.Nullable final PrintTaskTrigger value) {
        this.trigger = value;
    }
}
