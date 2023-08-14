package com.microsoft.graph.drives.item.items.item.workbook.functions.imsub;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ImSubPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The inumber1 property
     */
    private Json inumber1;
    /**
     * The inumber2 property
     */
    private Json inumber2;
    /**
     * Instantiates a new imSubPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ImSubPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a imSubPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ImSubPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImSubPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("inumber1", (n) -> { this.setInumber1(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("inumber2", (n) -> { this.setInumber2(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inumber1 property value. The inumber1 property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getInumber1() {
        return this.inumber1;
    }
    /**
     * Gets the inumber2 property value. The inumber2 property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getInumber2() {
        return this.inumber2;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("inumber1", this.getInumber1());
        writer.writeObjectValue("inumber2", this.getInumber2());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the inumber1 property value. The inumber1 property
     * @param value Value to set for the inumber1 property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInumber1(@jakarta.annotation.Nullable final Json value) {
        this.inumber1 = value;
    }
    /**
     * Sets the inumber2 property value. The inumber2 property
     * @param value Value to set for the inumber2 property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInumber2(@jakarta.annotation.Nullable final Json value) {
        this.inumber2 = value;
    }
}
