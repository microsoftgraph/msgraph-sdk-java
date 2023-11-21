package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Trending extends Entity implements Parsable {
    /**
     * Instantiates a new Trending and sets the default values.
     */
    public Trending() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Trending
     */
    @jakarta.annotation.Nonnull
    public static Trending createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Trending();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceReference", (n) -> { this.setResourceReference(n.getObjectValue(ResourceReference::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceVisualization", (n) -> { this.setResourceVisualization(n.getObjectValue(ResourceVisualization::createFromDiscriminatorValue)); });
        deserializerMap.put("weight", (n) -> { this.setWeight(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the resource property value. Used for navigating to the trending document.
     * @return a Entity
     */
    @jakarta.annotation.Nullable
    public Entity getResource() {
        return this.backingStore.get("resource");
    }
    /**
     * Gets the resourceReference property value. Reference properties of the trending document, such as the url and type of the document.
     * @return a ResourceReference
     */
    @jakarta.annotation.Nullable
    public ResourceReference getResourceReference() {
        return this.backingStore.get("resourceReference");
    }
    /**
     * Gets the resourceVisualization property value. Properties that you can use to visualize the document in your experience.
     * @return a ResourceVisualization
     */
    @jakarta.annotation.Nullable
    public ResourceVisualization getResourceVisualization() {
        return this.backingStore.get("resourceVisualization");
    }
    /**
     * Gets the weight property value. Value indicating how much the document is currently trending. The larger the number, the more the document is currently trending around the user (the more relevant it is). Returned documents are sorted by this value.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getWeight() {
        return this.backingStore.get("weight");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeDoubleValue("weight", this.getWeight());
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the resource property value. Used for navigating to the trending document.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final Entity value) {
        this.backingStore.set("resource", value);
    }
    /**
     * Sets the resourceReference property value. Reference properties of the trending document, such as the url and type of the document.
     * @param value Value to set for the resourceReference property.
     */
    public void setResourceReference(@jakarta.annotation.Nullable final ResourceReference value) {
        this.backingStore.set("resourceReference", value);
    }
    /**
     * Sets the resourceVisualization property value. Properties that you can use to visualize the document in your experience.
     * @param value Value to set for the resourceVisualization property.
     */
    public void setResourceVisualization(@jakarta.annotation.Nullable final ResourceVisualization value) {
        this.backingStore.set("resourceVisualization", value);
    }
    /**
     * Sets the weight property value. Value indicating how much the document is currently trending. The larger the number, the more the document is currently trending around the user (the more relevant it is). Returned documents are sorted by this value.
     * @param value Value to set for the weight property.
     */
    public void setWeight(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("weight", value);
    }
}
