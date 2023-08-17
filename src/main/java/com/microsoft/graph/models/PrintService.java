package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintService extends Entity implements Parsable {
    /**
     * Endpoints that can be used to access the service. Read-only. Nullable.
     */
    private java.util.List<PrintServiceEndpoint> endpoints;
    /**
     * Instantiates a new printService and sets the default values.
     */
    public PrintService() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printService
     */
    @jakarta.annotation.Nonnull
    public static PrintService createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintService();
    }
    /**
     * Gets the endpoints property value. Endpoints that can be used to access the service. Read-only. Nullable.
     * @return a printServiceEndpoint
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintServiceEndpoint> getEndpoints() {
        return this.endpoints;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endpoints", (n) -> { this.setEndpoints(n.getCollectionOfObjectValues(PrintServiceEndpoint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("endpoints", this.getEndpoints());
    }
    /**
     * Sets the endpoints property value. Endpoints that can be used to access the service. Read-only. Nullable.
     * @param value Value to set for the endpoints property.
     */
    public void setEndpoints(@jakarta.annotation.Nullable final java.util.List<PrintServiceEndpoint> value) {
        this.endpoints = value;
    }
}
