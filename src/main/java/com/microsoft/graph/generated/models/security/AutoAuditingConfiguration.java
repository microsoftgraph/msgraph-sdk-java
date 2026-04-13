package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutoAuditingConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AutoAuditingConfiguration} and sets the default values.
     */
    public AutoAuditingConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutoAuditingConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AutoAuditingConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutoAuditingConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isAutomatic", (n) -> { this.setIsAutomatic(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAutomatic property value. Indicates whether automatic auditing is enabled for Defender for Identity monitoring.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAutomatic() {
        return this.backingStore.get("isAutomatic");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isAutomatic", this.getIsAutomatic());
    }
    /**
     * Sets the isAutomatic property value. Indicates whether automatic auditing is enabled for Defender for Identity monitoring.
     * @param value Value to set for the isAutomatic property.
     */
    public void setIsAutomatic(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAutomatic", value);
    }
}
