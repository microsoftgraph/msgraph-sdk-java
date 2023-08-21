package com.microsoft.graph.users.item.translateexchangeids;

import com.microsoft.graph.models.ExchangeIdFormat;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TranslateExchangeIdsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The InputIds property
     */
    private java.util.List<String> inputIds;
    /**
     * The SourceIdType property
     */
    private ExchangeIdFormat sourceIdType;
    /**
     * The TargetIdType property
     */
    private ExchangeIdFormat targetIdType;
    /**
     * Instantiates a new translateExchangeIdsPostRequestBody and sets the default values.
     */
    public TranslateExchangeIdsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a translateExchangeIdsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static TranslateExchangeIdsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TranslateExchangeIdsPostRequestBody();
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
        deserializerMap.put("InputIds", (n) -> { this.setInputIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("SourceIdType", (n) -> { this.setSourceIdType(n.getEnumValue(ExchangeIdFormat.class)); });
        deserializerMap.put("TargetIdType", (n) -> { this.setTargetIdType(n.getEnumValue(ExchangeIdFormat.class)); });
        return deserializerMap;
    }
    /**
     * Gets the InputIds property value. The InputIds property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInputIds() {
        return this.inputIds;
    }
    /**
     * Gets the SourceIdType property value. The SourceIdType property
     * @return a exchangeIdFormat
     */
    @jakarta.annotation.Nullable
    public ExchangeIdFormat getSourceIdType() {
        return this.sourceIdType;
    }
    /**
     * Gets the TargetIdType property value. The TargetIdType property
     * @return a exchangeIdFormat
     */
    @jakarta.annotation.Nullable
    public ExchangeIdFormat getTargetIdType() {
        return this.targetIdType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("InputIds", this.getInputIds());
        writer.writeEnumValue("SourceIdType", this.getSourceIdType());
        writer.writeEnumValue("TargetIdType", this.getTargetIdType());
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
     * Sets the InputIds property value. The InputIds property
     * @param value Value to set for the InputIds property.
     */
    public void setInputIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.inputIds = value;
    }
    /**
     * Sets the SourceIdType property value. The SourceIdType property
     * @param value Value to set for the SourceIdType property.
     */
    public void setSourceIdType(@jakarta.annotation.Nullable final ExchangeIdFormat value) {
        this.sourceIdType = value;
    }
    /**
     * Sets the TargetIdType property value. The TargetIdType property
     * @param value Value to set for the TargetIdType property.
     */
    public void setTargetIdType(@jakarta.annotation.Nullable final ExchangeIdFormat value) {
        this.targetIdType = value;
    }
}
