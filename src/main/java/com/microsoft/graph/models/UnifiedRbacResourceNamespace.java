package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRbacResourceNamespace extends Entity implements Parsable {
    /**
     * The name property
     */
    private String name;
    /**
     * The resourceActions property
     */
    private java.util.List<UnifiedRbacResourceAction> resourceActions;
    /**
     * Instantiates a new unifiedRbacResourceNamespace and sets the default values.
     */
    public UnifiedRbacResourceNamespace() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRbacResourceNamespace
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRbacResourceNamespace createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRbacResourceNamespace();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("resourceActions", (n) -> { this.setResourceActions(n.getCollectionOfObjectValues(UnifiedRbacResourceAction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the resourceActions property value. The resourceActions property
     * @return a unifiedRbacResourceAction
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRbacResourceAction> getResourceActions() {
        return this.resourceActions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("resourceActions", this.getResourceActions());
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the resourceActions property value. The resourceActions property
     * @param value Value to set for the resourceActions property.
     */
    public void setResourceActions(@jakarta.annotation.Nullable final java.util.List<UnifiedRbacResourceAction> value) {
        this.resourceActions = value;
    }
}
