package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IpEntityMapping extends EntityMapping implements Parsable {
    /**
     * Instantiates a new {@link IpEntityMapping} and sets the default values.
     */
    public IpEntityMapping() {
        super();
        this.setOdataType("#microsoft.graph.security.ipEntityMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IpEntityMapping}
     */
    @jakarta.annotation.Nonnull
    public static IpEntityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpEntityMapping();
    }
    /**
     * Gets the addressColumn property value. Name of the detection query column that maps to the IP address of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddressColumn() {
        return this.backingStore.get("addressColumn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addressColumn", (n) -> { this.setAddressColumn(n.getStringValue()); });
        deserializerMap.put("scopeColumn", (n) -> { this.setScopeColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the scopeColumn property value. Name of the detection query column that maps to the scope of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScopeColumn() {
        return this.backingStore.get("scopeColumn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("addressColumn", this.getAddressColumn());
        writer.writeStringValue("scopeColumn", this.getScopeColumn());
    }
    /**
     * Sets the addressColumn property value. Name of the detection query column that maps to the IP address of the alert entity.
     * @param value Value to set for the addressColumn property.
     */
    public void setAddressColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("addressColumn", value);
    }
    /**
     * Sets the scopeColumn property value. Name of the detection query column that maps to the scope of the alert entity.
     * @param value Value to set for the scopeColumn property.
     */
    public void setScopeColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scopeColumn", value);
    }
}
