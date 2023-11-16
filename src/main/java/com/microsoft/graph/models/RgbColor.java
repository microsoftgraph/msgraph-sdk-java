package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Color in RGB.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RgbColor implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new RgbColor and sets the default values.
     */
    public RgbColor() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RgbColor
     */
    @jakarta.annotation.Nonnull
    public static RgbColor createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RgbColor();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the b property value. Blue value
     * @return a Byte
     */
    @jakarta.annotation.Nullable
    public Byte getB() {
        return this.backingStore.get("b");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a Byte
     */
    @jakarta.annotation.Nullable
    public Byte getG() {
        return this.backingStore.get("g");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the r property value. Red value
     * @return a Byte
     */
    @jakarta.annotation.Nullable
    public Byte getR() {
        return this.backingStore.get("r");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteValue("b", this.getB());
        writer.writeByteValue("g", this.getG());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeByteValue("r", this.getR());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the b property value. Blue value
     * @param value Value to set for the b property.
     */
    public void setB(@jakarta.annotation.Nullable final Byte value) {
        this.backingStore.set("b", value);
    }
    /**
     * Sets the g property value. Green value
     * @param value Value to set for the g property.
     */
    public void setG(@jakarta.annotation.Nullable final Byte value) {
        this.backingStore.set("g", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the r property value. Red value
     * @param value Value to set for the r property.
     */
    public void setR(@jakarta.annotation.Nullable final Byte value) {
        this.backingStore.set("r", value);
    }
}
