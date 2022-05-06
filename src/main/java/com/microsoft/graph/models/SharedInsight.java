package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharedInsight extends Entity implements Parsable {
    /** Details about the shared item. Read only.  */
    private SharingDetail _lastShared;
    /** The lastSharedMethod property  */
    private Entity _lastSharedMethod;
    /** Used for navigating to the item that was shared. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.  */
    private Entity _resource;
    /** Reference properties of the shared document, such as the url and type of the document. Read-only  */
    private ResourceReference _resourceReference;
    /** Properties that you can use to visualize the document in your experience. Read-only  */
    private ResourceVisualization _resourceVisualization;
    /** The sharingHistory property  */
    private java.util.List<SharingDetail> _sharingHistory;
    /**
     * Instantiates a new sharedInsight and sets the default values.
     * @return a void
     */
    public SharedInsight() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharedInsight
     */
    @javax.annotation.Nonnull
    public static SharedInsight createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedInsight();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SharedInsight currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("lastShared", (n) -> { currentObject.setLastShared(n.getObjectValue(SharingDetail::createFromDiscriminatorValue)); });
            this.put("lastSharedMethod", (n) -> { currentObject.setLastSharedMethod(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
            this.put("resource", (n) -> { currentObject.setResource(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
            this.put("resourceReference", (n) -> { currentObject.setResourceReference(n.getObjectValue(ResourceReference::createFromDiscriminatorValue)); });
            this.put("resourceVisualization", (n) -> { currentObject.setResourceVisualization(n.getObjectValue(ResourceVisualization::createFromDiscriminatorValue)); });
            this.put("sharingHistory", (n) -> { currentObject.setSharingHistory(n.getCollectionOfObjectValues(SharingDetail::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastShared property value. Details about the shared item. Read only.
     * @return a sharingDetail
     */
    @javax.annotation.Nullable
    public SharingDetail getLastShared() {
        return this._lastShared;
    }
    /**
     * Gets the lastSharedMethod property value. The lastSharedMethod property
     * @return a entity
     */
    @javax.annotation.Nullable
    public Entity getLastSharedMethod() {
        return this._lastSharedMethod;
    }
    /**
     * Gets the resource property value. Used for navigating to the item that was shared. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.
     * @return a entity
     */
    @javax.annotation.Nullable
    public Entity getResource() {
        return this._resource;
    }
    /**
     * Gets the resourceReference property value. Reference properties of the shared document, such as the url and type of the document. Read-only
     * @return a resourceReference
     */
    @javax.annotation.Nullable
    public ResourceReference getResourceReference() {
        return this._resourceReference;
    }
    /**
     * Gets the resourceVisualization property value. Properties that you can use to visualize the document in your experience. Read-only
     * @return a resourceVisualization
     */
    @javax.annotation.Nullable
    public ResourceVisualization getResourceVisualization() {
        return this._resourceVisualization;
    }
    /**
     * Gets the sharingHistory property value. The sharingHistory property
     * @return a sharingDetail
     */
    @javax.annotation.Nullable
    public java.util.List<SharingDetail> getSharingHistory() {
        return this._sharingHistory;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("lastShared", this.getLastShared());
        writer.writeObjectValue("lastSharedMethod", this.getLastSharedMethod());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeObjectValue("resourceReference", this.getResourceReference());
        writer.writeObjectValue("resourceVisualization", this.getResourceVisualization());
        writer.writeCollectionOfObjectValues("sharingHistory", this.getSharingHistory());
    }
    /**
     * Sets the lastShared property value. Details about the shared item. Read only.
     * @param value Value to set for the lastShared property.
     * @return a void
     */
    public void setLastShared(@javax.annotation.Nullable final SharingDetail value) {
        this._lastShared = value;
    }
    /**
     * Sets the lastSharedMethod property value. The lastSharedMethod property
     * @param value Value to set for the lastSharedMethod property.
     * @return a void
     */
    public void setLastSharedMethod(@javax.annotation.Nullable final Entity value) {
        this._lastSharedMethod = value;
    }
    /**
     * Sets the resource property value. Used for navigating to the item that was shared. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.
     * @param value Value to set for the resource property.
     * @return a void
     */
    public void setResource(@javax.annotation.Nullable final Entity value) {
        this._resource = value;
    }
    /**
     * Sets the resourceReference property value. Reference properties of the shared document, such as the url and type of the document. Read-only
     * @param value Value to set for the resourceReference property.
     * @return a void
     */
    public void setResourceReference(@javax.annotation.Nullable final ResourceReference value) {
        this._resourceReference = value;
    }
    /**
     * Sets the resourceVisualization property value. Properties that you can use to visualize the document in your experience. Read-only
     * @param value Value to set for the resourceVisualization property.
     * @return a void
     */
    public void setResourceVisualization(@javax.annotation.Nullable final ResourceVisualization value) {
        this._resourceVisualization = value;
    }
    /**
     * Sets the sharingHistory property value. The sharingHistory property
     * @param value Value to set for the sharingHistory property.
     * @return a void
     */
    public void setSharingHistory(@javax.annotation.Nullable final java.util.List<SharingDetail> value) {
        this._sharingHistory = value;
    }
}
