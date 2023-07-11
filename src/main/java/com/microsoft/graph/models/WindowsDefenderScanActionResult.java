package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device action result
 */
public class WindowsDefenderScanActionResult extends DeviceActionResult implements Parsable {
    /**
     * Scan type either full scan or quick scan
     */
    private String scanType;
    /**
     * Instantiates a new windowsDefenderScanActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsDefenderScanActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsDefenderScanActionResult
     */
    @javax.annotation.Nonnull
    public static WindowsDefenderScanActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDefenderScanActionResult();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("scanType", (n) -> { this.setScanType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the scanType property value. Scan type either full scan or quick scan
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScanType() {
        return this.scanType;
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
        writer.writeStringValue("scanType", this.getScanType());
    }
    /**
     * Sets the scanType property value. Scan type either full scan or quick scan
     * @param value Value to set for the scanType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScanType(@javax.annotation.Nullable final String value) {
        this.scanType = value;
    }
}
