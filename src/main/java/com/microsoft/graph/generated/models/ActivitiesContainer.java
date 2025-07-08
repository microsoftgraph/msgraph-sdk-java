package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivitiesContainer extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ActivitiesContainer} and sets the default values.
     */
    public ActivitiesContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ActivitiesContainer}
     */
    @jakarta.annotation.Nonnull
    public static ActivitiesContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivitiesContainer();
    }
    /**
     * Gets the contentActivities property value. Collection of activity logs related to content processing.
     * @return a {@link java.util.List<ContentActivity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentActivity> getContentActivities() {
        return this.backingStore.get("contentActivities");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentActivities", (n) -> { this.setContentActivities(n.getCollectionOfObjectValues(ContentActivity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("contentActivities", this.getContentActivities());
    }
    /**
     * Sets the contentActivities property value. Collection of activity logs related to content processing.
     * @param value Value to set for the contentActivities property.
     */
    public void setContentActivities(@jakarta.annotation.Nullable final java.util.List<ContentActivity> value) {
        this.backingStore.set("contentActivities", value);
    }
}
