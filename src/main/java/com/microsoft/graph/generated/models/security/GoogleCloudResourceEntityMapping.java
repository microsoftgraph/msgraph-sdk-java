package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GoogleCloudResourceEntityMapping extends EntityMapping implements Parsable {
    /**
     * Instantiates a new {@link GoogleCloudResourceEntityMapping} and sets the default values.
     */
    public GoogleCloudResourceEntityMapping() {
        super();
        this.setOdataType("#microsoft.graph.security.googleCloudResourceEntityMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GoogleCloudResourceEntityMapping}
     */
    @jakarta.annotation.Nonnull
    public static GoogleCloudResourceEntityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GoogleCloudResourceEntityMapping();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fullResourceNameColumn", (n) -> { this.setFullResourceNameColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fullResourceNameColumn property value. Name of the detection query column that maps to the full resource name of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFullResourceNameColumn() {
        return this.backingStore.get("fullResourceNameColumn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("fullResourceNameColumn", this.getFullResourceNameColumn());
    }
    /**
     * Sets the fullResourceNameColumn property value. Name of the detection query column that maps to the full resource name of the alert entity.
     * @param value Value to set for the fullResourceNameColumn property.
     */
    public void setFullResourceNameColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fullResourceNameColumn", value);
    }
}
