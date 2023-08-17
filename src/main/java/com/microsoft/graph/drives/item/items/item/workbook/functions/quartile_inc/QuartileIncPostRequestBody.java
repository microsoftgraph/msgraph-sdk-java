package com.microsoft.graph.drives.item.items.item.workbook.functions.quartile_inc;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class QuartileIncPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The array property
     */
    private Json array;
    /**
     * The quart property
     */
    private Json quart;
    /**
     * Instantiates a new QuartileIncPostRequestBody and sets the default values.
     */
    public QuartileIncPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a QuartileIncPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static QuartileIncPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QuartileIncPostRequestBody();
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
     * Gets the array property value. The array property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getArray() {
        return this.array;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("array", (n) -> { this.setArray(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("quart", (n) -> { this.setQuart(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the quart property value. The quart property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getQuart() {
        return this.quart;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("array", this.getArray());
        writer.writeObjectValue("quart", this.getQuart());
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
     * Sets the array property value. The array property
     * @param value Value to set for the array property.
     */
    public void setArray(@jakarta.annotation.Nullable final Json value) {
        this.array = value;
    }
    /**
     * Sets the quart property value. The quart property
     * @param value Value to set for the quart property.
     */
    public void setQuart(@jakarta.annotation.Nullable final Json value) {
        this.quart = value;
    }
}
