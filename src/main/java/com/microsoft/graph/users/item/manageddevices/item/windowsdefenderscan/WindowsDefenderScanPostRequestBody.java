package com.microsoft.graph.users.item.manageddevices.item.windowsdefenderscan;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the windowsDefenderScan method. */
public class WindowsDefenderScanPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The quickScan property */
    private Boolean _quickScan;
    /**
     * Instantiates a new windowsDefenderScanPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsDefenderScanPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsDefenderScanPostRequestBody
     */
    @javax.annotation.Nonnull
    public static WindowsDefenderScanPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDefenderScanPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsDefenderScanPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("quickScan", (n) -> { currentObject.setQuickScan(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the quickScan property value. The quickScan property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getQuickScan() {
        return this._quickScan;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("quickScan", this.getQuickScan());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the quickScan property value. The quickScan property
     * @param value Value to set for the quickScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuickScan(@javax.annotation.Nullable final Boolean value) {
        this._quickScan = value;
    }
}
