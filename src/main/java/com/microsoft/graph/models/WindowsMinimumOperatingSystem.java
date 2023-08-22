package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The minimum operating system required for a Windows mobile app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsMinimumOperatingSystem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Windows version 10.0 or later.
     */
    private Boolean v100;
    /**
     * Windows version 8.0 or later.
     */
    private Boolean v80;
    /**
     * Windows version 8.1 or later.
     */
    private Boolean v81;
    /**
     * Instantiates a new windowsMinimumOperatingSystem and sets the default values.
     */
    public WindowsMinimumOperatingSystem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsMinimumOperatingSystem
     */
    @jakarta.annotation.Nonnull
    public static WindowsMinimumOperatingSystem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsMinimumOperatingSystem();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("v10_0", (n) -> { this.setV100(n.getBooleanValue()); });
        deserializerMap.put("v8_0", (n) -> { this.setV80(n.getBooleanValue()); });
        deserializerMap.put("v8_1", (n) -> { this.setV81(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the v10_0 property value. Windows version 10.0 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV100() {
        return this.v100;
    }
    /**
     * Gets the v8_0 property value. Windows version 8.0 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV80() {
        return this.v80;
    }
    /**
     * Gets the v8_1 property value. Windows version 8.1 or later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getV81() {
        return this.v81;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("v10_0", this.getV100());
        writer.writeBooleanValue("v8_0", this.getV80());
        writer.writeBooleanValue("v8_1", this.getV81());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the v10_0 property value. Windows version 10.0 or later.
     * @param value Value to set for the v10_0 property.
     */
    public void setV100(@jakarta.annotation.Nullable final Boolean value) {
        this.v100 = value;
    }
    /**
     * Sets the v8_0 property value. Windows version 8.0 or later.
     * @param value Value to set for the v8_0 property.
     */
    public void setV80(@jakarta.annotation.Nullable final Boolean value) {
        this.v80 = value;
    }
    /**
     * Sets the v8_1 property value. Windows version 8.1 or later.
     * @param value Value to set for the v8_1 property.
     */
    public void setV81(@jakarta.annotation.Nullable final Boolean value) {
        this.v81 = value;
    }
}
