package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintUsageByPrinter extends PrintUsage implements Parsable {
    /**
     * The printerId property
     */
    private String printerId;
    /**
     * Instantiates a new printUsageByPrinter and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintUsageByPrinter() {
        super();
        this.setOdataType("#microsoft.graph.printUsageByPrinter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printUsageByPrinter
     */
    @javax.annotation.Nonnull
    public static PrintUsageByPrinter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintUsageByPrinter();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("printerId", (n) -> { this.setPrinterId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the printerId property value. The printerId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrinterId() {
        return this.printerId;
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
        writer.writeStringValue("printerId", this.getPrinterId());
    }
    /**
     * Sets the printerId property value. The printerId property
     * @param value Value to set for the printerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrinterId(@javax.annotation.Nullable final String value) {
        this.printerId = value;
    }
}
