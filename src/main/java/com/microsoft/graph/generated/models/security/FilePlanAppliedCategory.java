package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FilePlanAppliedCategory extends FilePlanDescriptorBase implements Parsable {
    /**
     * Instantiates a new {@link FilePlanAppliedCategory} and sets the default values.
     */
    public FilePlanAppliedCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FilePlanAppliedCategory}
     */
    @jakarta.annotation.Nonnull
    public static FilePlanAppliedCategory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FilePlanAppliedCategory();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("subcategory", (n) -> { this.setSubcategory(n.getObjectValue(FilePlanSubcategory::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the subcategory property value. Represents the file plan descriptor for a subcategory under a specific category, which has been assigned to a particular retention label.
     * @return a {@link FilePlanSubcategory}
     */
    @jakarta.annotation.Nullable
    public FilePlanSubcategory getSubcategory() {
        return this.backingStore.get("subcategory");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("subcategory", this.getSubcategory());
    }
    /**
     * Sets the subcategory property value. Represents the file plan descriptor for a subcategory under a specific category, which has been assigned to a particular retention label.
     * @param value Value to set for the subcategory property.
     */
    public void setSubcategory(@jakarta.annotation.Nullable final FilePlanSubcategory value) {
        this.backingStore.set("subcategory", value);
    }
}
