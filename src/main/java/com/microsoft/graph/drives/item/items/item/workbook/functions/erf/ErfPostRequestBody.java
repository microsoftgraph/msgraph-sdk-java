package com.microsoft.graph.drives.item.items.item.workbook.functions.erf;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ErfPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The lowerLimit property */
    private Json lowerLimit;
    /** The upperLimit property */
    private Json upperLimit;
    /**
     * Instantiates a new erfPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ErfPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a erfPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ErfPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ErfPostRequestBody();
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
        deserializerMap.put("lowerLimit", (n) -> { this.setLowerLimit(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("upperLimit", (n) -> { this.setUpperLimit(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lowerLimit property value. The lowerLimit property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getLowerLimit() {
        return this.lowerLimit;
    }
    /**
     * Gets the upperLimit property value. The upperLimit property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getUpperLimit() {
        return this.upperLimit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("lowerLimit", this.getLowerLimit());
        writer.writeObjectValue("upperLimit", this.getUpperLimit());
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
     * Sets the lowerLimit property value. The lowerLimit property
     * @param value Value to set for the lowerLimit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLowerLimit(@javax.annotation.Nullable final Json value) {
        this.lowerLimit = value;
    }
    /**
     * Sets the upperLimit property value. The upperLimit property
     * @param value Value to set for the upperLimit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpperLimit(@javax.annotation.Nullable final Json value) {
        this.upperLimit = value;
    }
}
