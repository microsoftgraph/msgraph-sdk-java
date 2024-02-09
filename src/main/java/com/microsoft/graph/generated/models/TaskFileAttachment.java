package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaskFileAttachment extends AttachmentBase implements Parsable {
    /**
     * Instantiates a new {@link TaskFileAttachment} and sets the default values.
     */
    public TaskFileAttachment() {
        super();
        this.setOdataType("#microsoft.graph.taskFileAttachment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TaskFileAttachment}
     */
    @jakarta.annotation.Nonnull
    public static TaskFileAttachment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskFileAttachment();
    }
    /**
     * Gets the contentBytes property value. The base64-encoded contents of the file.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getContentBytes() {
        return this.backingStore.get("contentBytes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentBytes", (n) -> { this.setContentBytes(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("contentBytes", this.getContentBytes());
    }
    /**
     * Sets the contentBytes property value. The base64-encoded contents of the file.
     * @param value Value to set for the contentBytes property.
     */
    public void setContentBytes(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("contentBytes", value);
    }
}
