package com.microsoft.graph.drives.item.items.item.workbook.functions.imdiv;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ImDivPostRequestBody implements AdditionalDataHolder, Parsable {
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
     * Instantiates a new imDivPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ImDivPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a imDivPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ImDivPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImDivPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public Json getInumber1() {
        return this.inumber1;
    }
    /**
     * Gets the inumber2 property value. The inumber2 property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getInumber2() {
        return this.inumber2;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the inumber1 property value. The inumber1 property
     * @param value Value to set for the inumber1 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInumber1(@javax.annotation.Nullable final Json value) {
        this.inumber1 = value;
    }
    /**
     * Sets the inumber2 property value. The inumber2 property
     * @param value Value to set for the inumber2 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInumber2(@javax.annotation.Nullable final Json value) {
        this.inumber2 = value;
    }
}
