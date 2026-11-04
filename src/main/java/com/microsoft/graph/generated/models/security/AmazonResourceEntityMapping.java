package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AmazonResourceEntityMapping extends EntityMapping implements Parsable {
    /**
     * Instantiates a new {@link AmazonResourceEntityMapping} and sets the default values.
     */
    public AmazonResourceEntityMapping() {
        super();
        this.setOdataType("#microsoft.graph.security.amazonResourceEntityMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AmazonResourceEntityMapping}
     */
    @jakarta.annotation.Nonnull
    public static AmazonResourceEntityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AmazonResourceEntityMapping();
    }
    /**
     * Gets the amazonResourceIdColumn property value. Name of the detection query column that maps to the Amazon resource ID of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAmazonResourceIdColumn() {
        return this.backingStore.get("amazonResourceIdColumn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("amazonResourceIdColumn", (n) -> { this.setAmazonResourceIdColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("amazonResourceIdColumn", this.getAmazonResourceIdColumn());
    }
    /**
     * Sets the amazonResourceIdColumn property value. Name of the detection query column that maps to the Amazon resource ID of the alert entity.
     * @param value Value to set for the amazonResourceIdColumn property.
     */
    public void setAmazonResourceIdColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("amazonResourceIdColumn", value);
    }
}
