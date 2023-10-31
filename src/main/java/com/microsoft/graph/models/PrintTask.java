package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrintTask extends Entity implements Parsable {
    /**
     * Instantiates a new PrintTask and sets the default values.
     */
    public PrintTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrintTask
     */
    @jakarta.annotation.Nonnull
    public static PrintTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintTask();
    }
    /**
     * Gets the definition property value. The definition property
     * @return a PrintTaskDefinition
     */
    @jakarta.annotation.Nullable
    public PrintTaskDefinition getDefinition() {
        return this.getBackingStore().get("definition");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getParentUrl() {
        return this.getBackingStore().get("parentUrl");
    }
    /**
     * Gets the status property value. The status property
     * @return a PrintTaskStatus
     */
    @jakarta.annotation.Nullable
    public PrintTaskStatus getStatus() {
        return this.getBackingStore().get("status");
    }
    /**
     * Gets the trigger property value. The trigger property
     * @return a PrintTaskTrigger
     */
    @jakarta.annotation.Nullable
    public PrintTaskTrigger getTrigger() {
        return this.getBackingStore().get("trigger");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setDefinition(@jakarta.annotation.Nullable final PrintTaskDefinition value) {
        this.getBackingStore().set("definition", value);
    }
    /**
     * Sets the parentUrl property value. The URL for the print entity that triggered this task. For example, https://graph.microsoft.com/v1.0/print/printers/{printerId}/jobs/{jobId}. Read-only.
     * @param value Value to set for the parentUrl property.
     */
    public void setParentUrl(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("parentUrl", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PrintTaskStatus value) {
        this.getBackingStore().set("status", value);
    }
    /**
     * Sets the trigger property value. The trigger property
     * @param value Value to set for the trigger property.
     */
    public void setTrigger(@jakarta.annotation.Nullable final PrintTaskTrigger value) {
        this.getBackingStore().set("trigger", value);
    }
}
