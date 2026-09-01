package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryObjectWorkflowSubject extends WorkflowSubject implements Parsable {
    /**
     * Instantiates a new {@link DirectoryObjectWorkflowSubject} and sets the default values.
     */
    public DirectoryObjectWorkflowSubject() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.directoryObjectWorkflowSubject");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DirectoryObjectWorkflowSubject}
     */
    @jakarta.annotation.Nonnull
    public static DirectoryObjectWorkflowSubject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectoryObjectWorkflowSubject();
    }
    /**
     * Gets the directoryObject property value. The directoryObject property
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getDirectoryObject() {
        return this.backingStore.get("directoryObject");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("directoryObject", (n) -> { this.setDirectoryObject(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("directoryObject", this.getDirectoryObject());
    }
    /**
     * Sets the directoryObject property value. The directoryObject property
     * @param value Value to set for the directoryObject property.
     */
    public void setDirectoryObject(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("directoryObject", value);
    }
}
