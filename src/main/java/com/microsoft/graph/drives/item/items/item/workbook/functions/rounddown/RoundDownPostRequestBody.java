package com.microsoft.graph.drives.item.items.item.workbook.functions.rounddown;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoundDownPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The number property */
    private Json number;
    /** The numDigits property */
    private Json numDigits;
    /**
     * Instantiates a new roundDownPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoundDownPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a roundDownPostRequestBody
     */
    @javax.annotation.Nonnull
    public static RoundDownPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoundDownPostRequestBody();
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
        deserializerMap.put("number", (n) -> { this.setNumber(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("numDigits", (n) -> { this.setNumDigits(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the number property value. The number property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNumber() {
        return this.number;
    }
    /**
     * Gets the numDigits property value. The numDigits property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNumDigits() {
        return this.numDigits;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("number", this.getNumber());
        writer.writeObjectValue("numDigits", this.getNumDigits());
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
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber(@javax.annotation.Nullable final Json value) {
        this.number = value;
    }
    /**
     * Sets the numDigits property value. The numDigits property
     * @param value Value to set for the numDigits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumDigits(@javax.annotation.Nullable final Json value) {
        this.numDigits = value;
    }
}
