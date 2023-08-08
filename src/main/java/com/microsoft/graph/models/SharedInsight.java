package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharedInsight extends Entity implements Parsable {
    /**
     * Details about the shared item. Read only.
     */
    private SharingDetail lastShared;
    /**
     * The lastSharedMethod property
     */
    private Entity lastSharedMethod;
    /**
     * Used for navigating to the item that was shared. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.
     */
    private Entity resource;
    /**
     * Reference properties of the shared document, such as the url and type of the document. Read-only
     */
    private ResourceReference resourceReference;
    /**
     * Properties that you can use to visualize the document in your experience. Read-only
     */
    private ResourceVisualization resourceVisualization;
    /**
     * The sharingHistory property
     */
    private java.util.List<SharingDetail> sharingHistory;
    /**
     * Instantiates a new sharedInsight and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SharedInsight() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharedInsight
     */
    @jakarta.annotation.Nonnull
    public static SharedInsight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedInsight();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastShared", (n) -> { this.setLastShared(n.getObjectValue(SharingDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSharedMethod", (n) -> { this.setLastSharedMethod(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceReference", (n) -> { this.setResourceReference(n.getObjectValue(ResourceReference::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceVisualization", (n) -> { this.setResourceVisualization(n.getObjectValue(ResourceVisualization::createFromDiscriminatorValue)); });
        deserializerMap.put("sharingHistory", (n) -> { this.setSharingHistory(n.getCollectionOfObjectValues(SharingDetail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastShared property value. Details about the shared item. Read only.
     * @return a sharingDetail
     */
    @jakarta.annotation.Nullable
    public SharingDetail getLastShared() {
        return this.lastShared;
    }
    /**
     * Gets the lastSharedMethod property value. The lastSharedMethod property
     * @return a entity
     */
    @jakarta.annotation.Nullable
    public Entity getLastSharedMethod() {
        return this.lastSharedMethod;
    }
    /**
     * Gets the resource property value. Used for navigating to the item that was shared. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.
     * @return a entity
     */
    @jakarta.annotation.Nullable
    public Entity getResource() {
        return this.resource;
    }
    /**
     * Gets the resourceReference property value. Reference properties of the shared document, such as the url and type of the document. Read-only
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
     * Gets the sharingHistory property value. The sharingHistory property
     * @return a sharingDetail
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharingDetail> getSharingHistory() {
        return this.sharingHistory;
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
        writer.writeObjectValue("lastShared", this.getLastShared());
        writer.writeObjectValue("lastSharedMethod", this.getLastSharedMethod());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeCollectionOfObjectValues("sharingHistory", this.getSharingHistory());
    }
    /**
     * Sets the lastShared property value. Details about the shared item. Read only.
     * @param value Value to set for the lastShared property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastShared(@jakarta.annotation.Nullable final SharingDetail value) {
        this.lastShared = value;
    }
    /**
     * Sets the lastSharedMethod property value. The lastSharedMethod property
     * @param value Value to set for the lastSharedMethod property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastSharedMethod(@jakarta.annotation.Nullable final Entity value) {
        this.lastSharedMethod = value;
    }
    /**
     * Sets the resource property value. Used for navigating to the item that was shared. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.
     * @param value Value to set for the resource property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResource(@jakarta.annotation.Nullable final Entity value) {
        this.resource = value;
    }
    /**
     * Sets the resourceReference property value. Reference properties of the shared document, such as the url and type of the document. Read-only
     * @param value Value to set for the resourceReference property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResourceReference(@jakarta.annotation.Nullable final ResourceReference value) {
        this.resourceReference = value;
    }
    /**
     * Sets the resourceVisualization property value. Properties that you can use to visualize the document in your experience. Read-only
     * @param value Value to set for the resourceVisualization property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResourceVisualization(@jakarta.annotation.Nullable final ResourceVisualization value) {
        this.resourceVisualization = value;
    }
    /**
     * Sets the sharingHistory property value. The sharingHistory property
     * @param value Value to set for the sharingHistory property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSharingHistory(@jakarta.annotation.Nullable final java.util.List<SharingDetail> value) {
        this.sharingHistory = value;
    }
}
