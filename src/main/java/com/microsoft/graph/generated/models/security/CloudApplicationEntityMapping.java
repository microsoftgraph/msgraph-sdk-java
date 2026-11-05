package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudApplicationEntityMapping extends EntityMapping implements Parsable {
    /**
     * Instantiates a new {@link CloudApplicationEntityMapping} and sets the default values.
     */
    public CloudApplicationEntityMapping() {
        super();
        this.setOdataType("#microsoft.graph.security.cloudApplicationEntityMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudApplicationEntityMapping}
     */
    @jakarta.annotation.Nonnull
    public static CloudApplicationEntityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudApplicationEntityMapping();
    }
    /**
     * Gets the appIdColumn property value. Name of the detection query column that maps to the application ID of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppIdColumn() {
        return this.backingStore.get("appIdColumn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appIdColumn", (n) -> { this.setAppIdColumn(n.getStringValue()); });
        deserializerMap.put("nameColumn", (n) -> { this.setNameColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nameColumn property value. Name of the detection query column that maps to the name of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameColumn() {
        return this.backingStore.get("nameColumn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appIdColumn", this.getAppIdColumn());
        writer.writeStringValue("nameColumn", this.getNameColumn());
    }
    /**
     * Sets the appIdColumn property value. Name of the detection query column that maps to the application ID of the alert entity.
     * @param value Value to set for the appIdColumn property.
     */
    public void setAppIdColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appIdColumn", value);
    }
    /**
     * Sets the nameColumn property value. Name of the detection query column that maps to the name of the alert entity.
     * @param value Value to set for the nameColumn property.
     */
    public void setNameColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nameColumn", value);
    }
}
