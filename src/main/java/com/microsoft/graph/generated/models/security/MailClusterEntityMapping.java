package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailClusterEntityMapping extends EntityMapping implements Parsable {
    /**
     * Instantiates a new {@link MailClusterEntityMapping} and sets the default values.
     */
    public MailClusterEntityMapping() {
        super();
        this.setOdataType("#microsoft.graph.security.mailClusterEntityMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MailClusterEntityMapping}
     */
    @jakarta.annotation.Nonnull
    public static MailClusterEntityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailClusterEntityMapping();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("queryColumn", (n) -> { this.setQueryColumn(n.getStringValue()); });
        deserializerMap.put("sourceColumn", (n) -> { this.setSourceColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the queryColumn property value. Name of the detection query column that maps to the query of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQueryColumn() {
        return this.backingStore.get("queryColumn");
    }
    /**
     * Gets the sourceColumn property value. Name of the detection query column that maps to the source of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceColumn() {
        return this.backingStore.get("sourceColumn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("queryColumn", this.getQueryColumn());
        writer.writeStringValue("sourceColumn", this.getSourceColumn());
    }
    /**
     * Sets the queryColumn property value. Name of the detection query column that maps to the query of the alert entity.
     * @param value Value to set for the queryColumn property.
     */
    public void setQueryColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("queryColumn", value);
    }
    /**
     * Sets the sourceColumn property value. Name of the detection query column that maps to the source of the alert entity.
     * @param value Value to set for the sourceColumn property.
     */
    public void setSourceColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceColumn", value);
    }
}
