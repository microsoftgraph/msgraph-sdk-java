package com.microsoft.graph.drives.item.items.item.workbook.functions.exact;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExactPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The text1 property */
    private Json text1;
    /** The text2 property */
    private Json text2;
    /**
     * Instantiates a new exactPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExactPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a exactPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ExactPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExactPostRequestBody();
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
        deserializerMap.put("text1", (n) -> { this.setText1(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("text2", (n) -> { this.setText2(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the text1 property value. The text1 property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getText1() {
        return this.text1;
    }
    /**
     * Gets the text2 property value. The text2 property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getText2() {
        return this.text2;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("text1", this.getText1());
        writer.writeObjectValue("text2", this.getText2());
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
     * Sets the text1 property value. The text1 property
     * @param value Value to set for the text1 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setText1(@javax.annotation.Nullable final Json value) {
        this.text1 = value;
    }
    /**
     * Sets the text2 property value. The text2 property
     * @param value Value to set for the text2 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setText2(@javax.annotation.Nullable final Json value) {
        this.text2 = value;
    }
}
