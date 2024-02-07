package com.microsoft.graph.models.partners.billing;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExportSuccessOperation extends Operation implements Parsable {
    /**
     * Instantiates a new ExportSuccessOperation and sets the default values.
     */
    public ExportSuccessOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExportSuccessOperation
     */
    @jakarta.annotation.Nonnull
    public static ExportSuccessOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExportSuccessOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("resourceLocation", (n) -> { this.setResourceLocation(n.getObjectValue(Manifest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceLocation property value. The resourceLocation property
     * @return a Manifest
     */
    @jakarta.annotation.Nullable
    public Manifest getResourceLocation() {
        return this.backingStore.get("resourceLocation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("resourceLocation", this.getResourceLocation());
    }
    /**
     * Sets the resourceLocation property value. The resourceLocation property
     * @param value Value to set for the resourceLocation property.
     */
    public void setResourceLocation(@jakarta.annotation.Nullable final Manifest value) {
        this.backingStore.set("resourceLocation", value);
    }
}
