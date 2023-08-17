package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ToneInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * An incremental identifier used for ordering DTMF events.
     */
    private Long sequenceId;
    /**
     * The tone property
     */
    private Tone tone;
    /**
     * Instantiates a new toneInfo and sets the default values.
     */
    public ToneInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a toneInfo
     */
    @jakarta.annotation.Nonnull
    public static ToneInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ToneInfo();
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
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sequenceId", (n) -> { this.setSequenceId(n.getLongValue()); });
        deserializerMap.put("tone", (n) -> { this.setTone(n.getEnumValue(Tone.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the sequenceId property value. An incremental identifier used for ordering DTMF events.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getSequenceId() {
        return this.sequenceId;
    }
    /**
     * Gets the tone property value. The tone property
     * @return a tone
     */
    @jakarta.annotation.Nullable
    public Tone getTone() {
        return this.tone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("sequenceId", this.getSequenceId());
        writer.writeEnumValue("tone", this.getTone());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sequenceId property value. An incremental identifier used for ordering DTMF events.
     * @param value Value to set for the sequenceId property.
     */
    public void setSequenceId(@jakarta.annotation.Nullable final Long value) {
        this.sequenceId = value;
    }
    /**
     * Sets the tone property value. The tone property
     * @param value Value to set for the tone property.
     */
    public void setTone(@jakarta.annotation.Nullable final Tone value) {
        this.tone = value;
    }
}
