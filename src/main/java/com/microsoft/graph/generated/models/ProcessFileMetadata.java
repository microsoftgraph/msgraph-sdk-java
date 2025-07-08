package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProcessFileMetadata extends ProcessContentMetadataBase implements Parsable {
    /**
     * Instantiates a new {@link ProcessFileMetadata} and sets the default values.
     */
    public ProcessFileMetadata() {
        super();
        this.setOdataType("#microsoft.graph.processFileMetadata");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProcessFileMetadata}
     */
    @jakarta.annotation.Nonnull
    public static ProcessFileMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProcessFileMetadata();
    }
    /**
     * Gets the customProperties property value. A dictionary containing custom metadata associated with the file, potentially extracted by the calling application.
     * @return a {@link CustomMetadataDictionary}
     */
    @jakarta.annotation.Nullable
    public CustomMetadataDictionary getCustomProperties() {
        return this.backingStore.get("customProperties");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customProperties", (n) -> { this.setCustomProperties(n.getObjectValue(CustomMetadataDictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("ownerId", (n) -> { this.setOwnerId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ownerId property value. The unique identifier (for example, Entra User ID or UPN) of the owner of the file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnerId() {
        return this.backingStore.get("ownerId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("customProperties", this.getCustomProperties());
        writer.writeStringValue("ownerId", this.getOwnerId());
    }
    /**
     * Sets the customProperties property value. A dictionary containing custom metadata associated with the file, potentially extracted by the calling application.
     * @param value Value to set for the customProperties property.
     */
    public void setCustomProperties(@jakarta.annotation.Nullable final CustomMetadataDictionary value) {
        this.backingStore.set("customProperties", value);
    }
    /**
     * Sets the ownerId property value. The unique identifier (for example, Entra User ID or UPN) of the owner of the file.
     * @param value Value to set for the ownerId property.
     */
    public void setOwnerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerId", value);
    }
}
