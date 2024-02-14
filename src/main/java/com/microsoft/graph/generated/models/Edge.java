package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Edge extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Edge} and sets the default values.
     */
    public Edge() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Edge}
     */
    @jakarta.annotation.Nonnull
    public static Edge createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Edge();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("internetExplorerMode", (n) -> { this.setInternetExplorerMode(n.getObjectValue(InternetExplorerMode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the internetExplorerMode property value. A container for Internet Explorer mode resources.
     * @return a {@link InternetExplorerMode}
     */
    @jakarta.annotation.Nullable
    public InternetExplorerMode getInternetExplorerMode() {
        return this.backingStore.get("internetExplorerMode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("internetExplorerMode", this.getInternetExplorerMode());
    }
    /**
     * Sets the internetExplorerMode property value. A container for Internet Explorer mode resources.
     * @param value Value to set for the internetExplorerMode property.
     */
    public void setInternetExplorerMode(@jakarta.annotation.Nullable final InternetExplorerMode value) {
        this.backingStore.set("internetExplorerMode", value);
    }
}
