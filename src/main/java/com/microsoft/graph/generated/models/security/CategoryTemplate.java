package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategoryTemplate extends FilePlanDescriptorTemplate implements Parsable {
    /**
     * Instantiates a new {@link CategoryTemplate} and sets the default values.
     */
    public CategoryTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CategoryTemplate}
     */
    @jakarta.annotation.Nonnull
    public static CategoryTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CategoryTemplate();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("subcategories", (n) -> { this.setSubcategories(n.getCollectionOfObjectValues(SubcategoryTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the subcategories property value. Represents all subcategories under a particular category.
     * @return a {@link java.util.List<SubcategoryTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubcategoryTemplate> getSubcategories() {
        return this.backingStore.get("subcategories");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("subcategories", this.getSubcategories());
    }
    /**
     * Sets the subcategories property value. Represents all subcategories under a particular category.
     * @param value Value to set for the subcategories property.
     */
    public void setSubcategories(@jakarta.annotation.Nullable final java.util.List<SubcategoryTemplate> value) {
        this.backingStore.set("subcategories", value);
    }
}
