package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrintUsageByPrinter extends PrintUsage implements Parsable {
    /**
     * Instantiates a new PrintUsageByPrinter and sets the default values.
     */
    public PrintUsageByPrinter() {
        super();
        this.setOdataType("#microsoft.graph.printUsageByPrinter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrintUsageByPrinter
     */
    @jakarta.annotation.Nonnull
    public static PrintUsageByPrinter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintUsageByPrinter();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("printerId", (n) -> { this.setPrinterId(n.getStringValue()); });
        deserializerMap.put("printerName", (n) -> { this.setPrinterName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the printerId property value. The printerId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrinterId() {
        return this.backingStore.get("printerId");
    }
    /**
     * Gets the printerName property value. The name of the printer represented by these statistics.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrinterName() {
        return this.backingStore.get("printerName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("printerId", this.getPrinterId());
        writer.writeStringValue("printerName", this.getPrinterName());
    }
    /**
     * Sets the printerId property value. The printerId property
     * @param value Value to set for the printerId property.
     */
    public void setPrinterId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("printerId", value);
    }
    /**
     * Sets the printerName property value. The name of the printer represented by these statistics.
     * @param value Value to set for the printerName property.
     */
    public void setPrinterName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("printerName", value);
    }
}
