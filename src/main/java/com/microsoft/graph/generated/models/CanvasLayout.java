package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CanvasLayout extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CanvasLayout} and sets the default values.
     */
    public CanvasLayout() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CanvasLayout}
     */
    @jakarta.annotation.Nonnull
    public static CanvasLayout createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CanvasLayout();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("horizontalSections", (n) -> { this.setHorizontalSections(n.getCollectionOfObjectValues(HorizontalSection::createFromDiscriminatorValue)); });
        deserializerMap.put("verticalSection", (n) -> { this.setVerticalSection(n.getObjectValue(VerticalSection::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the horizontalSections property value. Collection of horizontal sections on the SharePoint page.
     * @return a {@link java.util.List<HorizontalSection>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HorizontalSection> getHorizontalSections() {
        return this.backingStore.get("horizontalSections");
    }
    /**
     * Gets the verticalSection property value. Vertical section on the SharePoint page.
     * @return a {@link VerticalSection}
     */
    @jakarta.annotation.Nullable
    public VerticalSection getVerticalSection() {
        return this.backingStore.get("verticalSection");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("horizontalSections", this.getHorizontalSections());
        writer.writeObjectValue("verticalSection", this.getVerticalSection());
    }
    /**
     * Sets the horizontalSections property value. Collection of horizontal sections on the SharePoint page.
     * @param value Value to set for the horizontalSections property.
     */
    public void setHorizontalSections(@jakarta.annotation.Nullable final java.util.List<HorizontalSection> value) {
        this.backingStore.set("horizontalSections", value);
    }
    /**
     * Sets the verticalSection property value. Vertical section on the SharePoint page.
     * @param value Value to set for the verticalSection property.
     */
    public void setVerticalSection(@jakarta.annotation.Nullable final VerticalSection value) {
        this.backingStore.set("verticalSection", value);
    }
}
