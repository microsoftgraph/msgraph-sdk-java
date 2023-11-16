package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Allows IT admins to set a predefined default search engine for MDM-Controlled devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdgeSearchEngine extends EdgeSearchEngineBase implements Parsable {
    /**
     * Instantiates a new EdgeSearchEngine and sets the default values.
     */
    public EdgeSearchEngine() {
        super();
        this.setOdataType("#microsoft.graph.edgeSearchEngine");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdgeSearchEngine
     */
    @jakarta.annotation.Nonnull
    public static EdgeSearchEngine createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdgeSearchEngine();
    }
    /**
     * Gets the edgeSearchEngineType property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @return a EdgeSearchEngineType
     */
    @jakarta.annotation.Nullable
    public EdgeSearchEngineType getEdgeSearchEngineType() {
        return this.backingStore.get("edgeSearchEngineType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("edgeSearchEngineType", (n) -> { this.setEdgeSearchEngineType(n.getEnumValue(EdgeSearchEngineType.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("edgeSearchEngineType", this.getEdgeSearchEngineType());
    }
    /**
     * Sets the edgeSearchEngineType property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @param value Value to set for the edgeSearchEngineType property.
     */
    public void setEdgeSearchEngineType(@jakarta.annotation.Nullable final EdgeSearchEngineType value) {
        this.backingStore.set("edgeSearchEngineType", value);
    }
}
