package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsedInsight extends Entity implements Parsable {
    /**
     * Information about when the item was last viewed or modified by the user. Read only.
     */
    private UsageDetails lastUsed;
    /**
     * Used for navigating to the item that was used. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.
     */
    private Entity resource;
    /**
     * Reference properties of the used document, such as the url and type of the document. Read-only
     */
    private ResourceReference resourceReference;
    /**
     * Properties that you can use to visualize the document in your experience. Read-only
     */
    private ResourceVisualization resourceVisualization;
    /**
     * Instantiates a new usedInsight and sets the default values.
     */
    public UsedInsight() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a usedInsight
     */
    @jakarta.annotation.Nonnull
    public static UsedInsight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UsedInsight();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastUsed", (n) -> { this.setLastUsed(n.getObjectValue(UsageDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceReference", (n) -> { this.setResourceReference(n.getObjectValue(ResourceReference::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceVisualization", (n) -> { this.setResourceVisualization(n.getObjectValue(ResourceVisualization::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastUsed property value. Information about when the item was last viewed or modified by the user. Read only.
     * @return a usageDetails
     */
    @jakarta.annotation.Nullable
    public UsageDetails getLastUsed() {
        return this.lastUsed;
    }
    /**
     * Gets the resource property value. Used for navigating to the item that was used. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.
     * @return a entity
     */
    @jakarta.annotation.Nullable
    public Entity getResource() {
        return this.resource;
    }
    /**
     * Gets the resourceReference property value. Reference properties of the used document, such as the url and type of the document. Read-only
     * @return a resourceReference
     */
    @jakarta.annotation.Nullable
    public ResourceReference getResourceReference() {
        return this.resourceReference;
    }
    /**
     * Gets the resourceVisualization property value. Properties that you can use to visualize the document in your experience. Read-only
     * @return a resourceVisualization
     */
    @jakarta.annotation.Nullable
    public ResourceVisualization getResourceVisualization() {
        return this.resourceVisualization;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("lastUsed", this.getLastUsed());
        writer.writeObjectValue("resource", this.getResource());
    }
    /**
     * Sets the lastUsed property value. Information about when the item was last viewed or modified by the user. Read only.
     * @param value Value to set for the lastUsed property.
     */
    public void setLastUsed(@jakarta.annotation.Nullable final UsageDetails value) {
        this.lastUsed = value;
    }
    /**
     * Sets the resource property value. Used for navigating to the item that was used. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final Entity value) {
        this.resource = value;
    }
    /**
     * Sets the resourceReference property value. Reference properties of the used document, such as the url and type of the document. Read-only
     * @param value Value to set for the resourceReference property.
     */
    public void setResourceReference(@jakarta.annotation.Nullable final ResourceReference value) {
        this.resourceReference = value;
    }
    /**
     * Sets the resourceVisualization property value. Properties that you can use to visualize the document in your experience. Read-only
     * @param value Value to set for the resourceVisualization property.
     */
    public void setResourceVisualization(@jakarta.annotation.Nullable final ResourceVisualization value) {
        this.resourceVisualization = value;
    }
}
