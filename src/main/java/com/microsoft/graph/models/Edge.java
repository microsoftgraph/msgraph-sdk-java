package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Edge extends Entity implements Parsable {
    /**
     * A container for Internet Explorer mode resources.
     */
    private InternetExplorerMode internetExplorerMode;
    /**
     * Instantiates a new edge and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Edge() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a edge
     */
    @javax.annotation.Nonnull
    public static Edge createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Edge();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("internetExplorerMode", (n) -> { this.setInternetExplorerMode(n.getObjectValue(InternetExplorerMode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the internetExplorerMode property value. A container for Internet Explorer mode resources.
     * @return a internetExplorerMode
     */
    @javax.annotation.Nullable
    public InternetExplorerMode getInternetExplorerMode() {
        return this.internetExplorerMode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("internetExplorerMode", this.getInternetExplorerMode());
    }
    /**
     * Sets the internetExplorerMode property value. A container for Internet Explorer mode resources.
     * @param value Value to set for the internetExplorerMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternetExplorerMode(@javax.annotation.Nullable final InternetExplorerMode value) {
        this.internetExplorerMode = value;
    }
}
