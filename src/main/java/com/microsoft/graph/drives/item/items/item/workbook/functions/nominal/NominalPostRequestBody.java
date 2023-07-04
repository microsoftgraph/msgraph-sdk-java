package com.microsoft.graph.drives.item.items.item.workbook.functions.nominal;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NominalPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The effectRate property
     */
    private Json effectRate;
    /**
     * The npery property
     */
    private Json npery;
    /**
     * Instantiates a new nominalPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NominalPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a nominalPostRequestBody
     */
    @javax.annotation.Nonnull
    public static NominalPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NominalPostRequestBody();
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
     * Gets the effectRate property value. The effectRate property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getEffectRate() {
        return this.effectRate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("effectRate", (n) -> { this.setEffectRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("npery", (n) -> { this.setNpery(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the npery property value. The npery property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNpery() {
        return this.npery;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("effectRate", this.getEffectRate());
        writer.writeObjectValue("npery", this.getNpery());
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
     * Sets the effectRate property value. The effectRate property
     * @param value Value to set for the effectRate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEffectRate(@javax.annotation.Nullable final Json value) {
        this.effectRate = value;
    }
    /**
     * Sets the npery property value. The npery property
     * @param value Value to set for the npery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNpery(@javax.annotation.Nullable final Json value) {
        this.npery = value;
    }
}
