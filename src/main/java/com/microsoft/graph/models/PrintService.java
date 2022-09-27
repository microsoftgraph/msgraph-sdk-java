package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintService extends Entity implements Parsable {
    /** Endpoints that can be used to access the service. Read-only. Nullable. */
    private java.util.List<PrintServiceEndpoint> _endpoints;
    /**
     * Instantiates a new PrintService and sets the default values.
     * @return a void
     */
    public PrintService() {
        super();
        this.setOdataType("#microsoft.graph.printService");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrintService
     */
    @javax.annotation.Nonnull
    public static PrintService createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintService();
    }
    /**
     * Gets the endpoints property value. Endpoints that can be used to access the service. Read-only. Nullable.
     * @return a printServiceEndpoint
     */
    @javax.annotation.Nullable
    public java.util.List<PrintServiceEndpoint> getEndpoints() {
        return this._endpoints;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrintService currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("endpoints", (n) -> { currentObject.setEndpoints(n.getCollectionOfObjectValues(PrintServiceEndpoint::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("endpoints", this.getEndpoints());
    }
    /**
     * Sets the endpoints property value. Endpoints that can be used to access the service. Read-only. Nullable.
     * @param value Value to set for the endpoints property.
     * @return a void
     */
    public void setEndpoints(@javax.annotation.Nullable final java.util.List<PrintServiceEndpoint> value) {
        this._endpoints = value;
    }
}
