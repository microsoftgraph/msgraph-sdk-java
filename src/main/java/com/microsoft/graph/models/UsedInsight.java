package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UsedInsight extends Entity implements Parsable {
    /** Information about when the item was last viewed or modified by the user. Read only.  */
    private UsageDetails _lastUsed;
    /** Used for navigating to the item that was used. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.  */
    private Entity _resource;
    /** Reference properties of the used document, such as the url and type of the document. Read-only  */
    private ResourceReference _resourceReference;
    /** Properties that you can use to visualize the document in your experience. Read-only  */
    private ResourceVisualization _resourceVisualization;
    /**
     * Instantiates a new usedInsight and sets the default values.
     * @return a void
     */
    public UsedInsight() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a usedInsight
     */
    @javax.annotation.Nonnull
    public static UsedInsight createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UsedInsight();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UsedInsight currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("lastUsed", (n) -> { currentObject.setLastUsed(n.getObjectValue(UsageDetails::createFromDiscriminatorValue)); });
            this.put("resource", (n) -> { currentObject.setResource(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
            this.put("resourceReference", (n) -> { currentObject.setResourceReference(n.getObjectValue(ResourceReference::createFromDiscriminatorValue)); });
            this.put("resourceVisualization", (n) -> { currentObject.setResourceVisualization(n.getObjectValue(ResourceVisualization::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastUsed property value. Information about when the item was last viewed or modified by the user. Read only.
     * @return a usageDetails
     */
    @javax.annotation.Nullable
    public UsageDetails getLastUsed() {
        return this._lastUsed;
    }
    /**
     * Gets the resource property value. Used for navigating to the item that was used. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.
     * @return a entity
     */
    @javax.annotation.Nullable
    public Entity getResource() {
        return this._resource;
    }
    /**
     * Gets the resourceReference property value. Reference properties of the used document, such as the url and type of the document. Read-only
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("lastUsed", this.getLastUsed());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeObjectValue("resourceReference", this.getResourceReference());
        writer.writeObjectValue("resourceVisualization", this.getResourceVisualization());
    }
    /**
     * Sets the lastUsed property value. Information about when the item was last viewed or modified by the user. Read only.
     * @param value Value to set for the lastUsed property.
     * @return a void
     */
    public void setLastUsed(@javax.annotation.Nullable final UsageDetails value) {
        this._lastUsed = value;
    }
    /**
     * Sets the resource property value. Used for navigating to the item that was used. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.
     * @param value Value to set for the resource property.
     * @return a void
     */
    public void setResource(@javax.annotation.Nullable final Entity value) {
        this._resource = value;
    }
    /**
     * Sets the resourceReference property value. Reference properties of the used document, such as the url and type of the document. Read-only
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
}
