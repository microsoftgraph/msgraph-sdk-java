package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The minimum operating system required for a Windows mobile app. */
public class WindowsMinimumOperatingSystem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Windows version 10.0 or later. */
    private Boolean _v10_0;
    /** Windows version 8.0 or later. */
    private Boolean _v8_0;
    /** Windows version 8.1 or later. */
    private Boolean _v8_1;
    /**
     * Instantiates a new windowsMinimumOperatingSystem and sets the default values.
     * @return a void
     */
    public WindowsMinimumOperatingSystem() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windowsMinimumOperatingSystem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsMinimumOperatingSystem
     */
    @javax.annotation.Nonnull
    public static WindowsMinimumOperatingSystem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsMinimumOperatingSystem();
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
        final WindowsMinimumOperatingSystem currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("v10_0", (n) -> { currentObject.setV10_0(n.getBooleanValue()); });
            this.put("v8_0", (n) -> { currentObject.setV8_0(n.getBooleanValue()); });
            this.put("v8_1", (n) -> { currentObject.setV8_1(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the v10_0 property value. Windows version 10.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_0() {
        return this._v10_0;
    }
    /**
     * Gets the v8_0 property value. Windows version 8.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV8_0() {
        return this._v8_0;
    }
    /**
     * Gets the v8_1 property value. Windows version 8.1 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV8_1() {
        return this._v8_1;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("v10_0", this.getV10_0());
        writer.writeBooleanValue("v8_0", this.getV8_0());
        writer.writeBooleanValue("v8_1", this.getV8_1());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the v10_0 property value. Windows version 10.0 or later.
     * @param value Value to set for the v10_0 property.
     * @return a void
     */
    public void setV10_0(@javax.annotation.Nullable final Boolean value) {
        this._v10_0 = value;
    }
    /**
     * Sets the v8_0 property value. Windows version 8.0 or later.
     * @param value Value to set for the v8_0 property.
     * @return a void
     */
    public void setV8_0(@javax.annotation.Nullable final Boolean value) {
        this._v8_0 = value;
    }
    /**
     * Sets the v8_1 property value. Windows version 8.1 or later.
     * @param value Value to set for the v8_1 property.
     * @return a void
     */
    public void setV8_1(@javax.annotation.Nullable final Boolean value) {
        this._v8_1 = value;
    }
}
