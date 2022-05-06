package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Trending extends Entity implements Parsable {
    /** The lastModifiedDateTime property  */
    private OffsetDateTime _lastModifiedDateTime;
    /** Used for navigating to the trending document.  */
    private Entity _resource;
    /** Reference properties of the trending document, such as the url and type of the document.  */
    private ResourceReference _resourceReference;
    /** Properties that you can use to visualize the document in your experience.  */
    private ResourceVisualization _resourceVisualization;
    /** Value indicating how much the document is currently trending. The larger the number, the more the document is currently trending around the user (the more relevant it is). Returned documents are sorted by this value.  */
    private Double _weight;
    /**
     * Instantiates a new trending and sets the default values.
     * @return a void
     */
    public Trending() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a trending
     */
    @javax.annotation.Nonnull
    public static Trending createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Trending();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Trending currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("resource", (n) -> { currentObject.setResource(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
            this.put("resourceReference", (n) -> { currentObject.setResourceReference(n.getObjectValue(ResourceReference::createFromDiscriminatorValue)); });
            this.put("resourceVisualization", (n) -> { currentObject.setResourceVisualization(n.getObjectValue(ResourceVisualization::createFromDiscriminatorValue)); });
            this.put("weight", (n) -> { currentObject.setWeight(n.getDoubleValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the resource property value. Used for navigating to the trending document.
     * @return a entity
     */
    @javax.annotation.Nullable
    public Entity getResource() {
        return this._resource;
    }
    /**
     * Gets the resourceReference property value. Reference properties of the trending document, such as the url and type of the document.
     * @return a resourceReference
     */
    @javax.annotation.Nullable
    public ResourceReference getResourceReference() {
        return this._resourceReference;
    }
    /**
     * Gets the resourceVisualization property value. Properties that you can use to visualize the document in your experience.
     * @return a resourceVisualization
     */
    @javax.annotation.Nullable
    public ResourceVisualization getResourceVisualization() {
        return this._resourceVisualization;
    }
    /**
     * Gets the weight property value. Value indicating how much the document is currently trending. The larger the number, the more the document is currently trending around the user (the more relevant it is). Returned documents are sorted by this value.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getWeight() {
        return this._weight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeObjectValue("resourceReference", this.getResourceReference());
        writer.writeObjectValue("resourceVisualization", this.getResourceVisualization());
        writer.writeDoubleValue("weight", this.getWeight());
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the resource property value. Used for navigating to the trending document.
     * @param value Value to set for the resource property.
     * @return a void
     */
    public void setResource(@javax.annotation.Nullable final Entity value) {
        this._resource = value;
    }
    /**
     * Sets the resourceReference property value. Reference properties of the trending document, such as the url and type of the document.
     * @param value Value to set for the resourceReference property.
     * @return a void
     */
    public void setResourceReference(@javax.annotation.Nullable final ResourceReference value) {
        this._resourceReference = value;
    }
    /**
     * Sets the resourceVisualization property value. Properties that you can use to visualize the document in your experience.
     * @param value Value to set for the resourceVisualization property.
     * @return a void
     */
    public void setResourceVisualization(@javax.annotation.Nullable final ResourceVisualization value) {
        this._resourceVisualization = value;
    }
    /**
     * Sets the weight property value. Value indicating how much the document is currently trending. The larger the number, the more the document is currently trending around the user (the more relevant it is). Returned documents are sorted by this value.
     * @param value Value to set for the weight property.
     * @return a void
     */
    public void setWeight(@javax.annotation.Nullable final Double value) {
        this._weight = value;
    }
}
