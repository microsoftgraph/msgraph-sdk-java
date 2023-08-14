package com.microsoft.graph.drives.item.items.item.workbook.functions.lookup;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LookupPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The lookupValue property
     */
    private Json lookupValue;
    /**
     * The lookupVector property
     */
    private Json lookupVector;
    /**
     * The resultVector property
     */
    private Json resultVector;
    /**
     * Instantiates a new lookupPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public LookupPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a lookupPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static LookupPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LookupPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("lookupValue", (n) -> { this.setLookupValue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("lookupVector", (n) -> { this.setLookupVector(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("resultVector", (n) -> { this.setResultVector(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lookupValue property value. The lookupValue property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getLookupValue() {
        return this.lookupValue;
    }
    /**
     * Gets the lookupVector property value. The lookupVector property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getLookupVector() {
        return this.lookupVector;
    }
    /**
     * Gets the resultVector property value. The resultVector property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getResultVector() {
        return this.resultVector;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("lookupValue", this.getLookupValue());
        writer.writeObjectValue("lookupVector", this.getLookupVector());
        writer.writeObjectValue("resultVector", this.getResultVector());
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
     * Sets the lookupValue property value. The lookupValue property
     * @param value Value to set for the lookupValue property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLookupValue(@jakarta.annotation.Nullable final Json value) {
        this.lookupValue = value;
    }
    /**
     * Sets the lookupVector property value. The lookupVector property
     * @param value Value to set for the lookupVector property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLookupVector(@jakarta.annotation.Nullable final Json value) {
        this.lookupVector = value;
    }
    /**
     * Sets the resultVector property value. The resultVector property
     * @param value Value to set for the resultVector property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResultVector(@jakarta.annotation.Nullable final Json value) {
        this.resultVector = value;
    }
}
