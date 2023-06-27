package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Color in RGB.
 */
public class RgbColor implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Blue value
     */
    private Byte b;
    /**
     * Green value
     */
    private Byte g;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Red value
     */
    private Byte r;
    /**
     * Instantiates a new rgbColor and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RgbColor() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rgbColor
     */
    @javax.annotation.Nonnull
    public static RgbColor createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RgbColor();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the b property value. Blue value
     * @return a byte
     */
    @javax.annotation.Nullable
    public Byte getB() {
        return this.b;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("b", (n) -> { this.setB(n.getByteValue()); });
        deserializerMap.put("g", (n) -> { this.setG(n.getByteValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("r", (n) -> { this.setR(n.getByteValue()); });
        return deserializerMap;
    }
    /**
     * Gets the g property value. Green value
     * @return a byte
     */
    @javax.annotation.Nullable
    public Byte getG() {
        return this.g;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the r property value. Red value
     * @return a byte
     */
    @javax.annotation.Nullable
    public Byte getR() {
        return this.r;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteValue("b", this.getB());
        writer.writeByteValue("g", this.getG());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeByteValue("r", this.getR());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the b property value. Blue value
     * @param value Value to set for the b property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setB(@javax.annotation.Nullable final Byte value) {
        this.b = value;
    }
    /**
     * Sets the g property value. Green value
     * @param value Value to set for the g property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setG(@javax.annotation.Nullable final Byte value) {
        this.g = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the r property value. Red value
     * @param value Value to set for the r property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setR(@javax.annotation.Nullable final Byte value) {
        this.r = value;
    }
}
