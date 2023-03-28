package com.microsoft.graph.users.item.translateexchangeids;

import com.microsoft.graph.models.ExchangeIdFormat;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TranslateExchangeIdsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The InputIds property */
    private java.util.List<String> inputIds;
    /** The SourceIdType property */
    private ExchangeIdFormat sourceIdType;
    /** The TargetIdType property */
    private ExchangeIdFormat targetIdType;
    /**
     * Instantiates a new translateExchangeIdsPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TranslateExchangeIdsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a translateExchangeIdsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static TranslateExchangeIdsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TranslateExchangeIdsPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("InputIds", (n) -> { this.setInputIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("SourceIdType", (n) -> { this.setSourceIdType(n.getEnumValue(ExchangeIdFormat.class)); });
        deserializerMap.put("TargetIdType", (n) -> { this.setTargetIdType(n.getEnumValue(ExchangeIdFormat.class)); });
        return deserializerMap;
    }
    /**
     * Gets the inputIds property value. The InputIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getInputIds() {
        return this.inputIds;
    }
    /**
     * Gets the sourceIdType property value. The SourceIdType property
     * @return a exchangeIdFormat
     */
    @javax.annotation.Nullable
    public ExchangeIdFormat getSourceIdType() {
        return this.sourceIdType;
    }
    /**
     * Gets the targetIdType property value. The TargetIdType property
     * @return a exchangeIdFormat
     */
    @javax.annotation.Nullable
    public ExchangeIdFormat getTargetIdType() {
        return this.targetIdType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("InputIds", this.getInputIds());
        writer.writeEnumValue("SourceIdType", this.getSourceIdType());
        writer.writeEnumValue("TargetIdType", this.getTargetIdType());
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
     * Sets the inputIds property value. The InputIds property
     * @param value Value to set for the InputIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInputIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.inputIds = value;
    }
    /**
     * Sets the sourceIdType property value. The SourceIdType property
     * @param value Value to set for the SourceIdType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceIdType(@javax.annotation.Nullable final ExchangeIdFormat value) {
        this.sourceIdType = value;
    }
    /**
     * Sets the targetIdType property value. The TargetIdType property
     * @param value Value to set for the TargetIdType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetIdType(@javax.annotation.Nullable final ExchangeIdFormat value) {
        this.targetIdType = value;
    }
}
