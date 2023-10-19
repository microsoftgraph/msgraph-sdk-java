package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AlteredQueryToken implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Defines the length of a changed segment.
     */
    private Integer length;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Defines the offset of a changed segment.
     */
    private Integer offset;
    /**
     * Represents the corrected segment string.
     */
    private String suggestion;
    /**
     * Instantiates a new AlteredQueryToken and sets the default values.
     */
    public AlteredQueryToken() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AlteredQueryToken
     */
    @jakarta.annotation.Nonnull
    public static AlteredQueryToken createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlteredQueryToken();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("length", (n) -> { this.setLength(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("suggestion", (n) -> { this.setSuggestion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the length property value. Defines the length of a changed segment.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLength() {
        return this.length;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the offset property value. Defines the offset of a changed segment.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the suggestion property value. Represents the corrected segment string.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSuggestion() {
        return this.suggestion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("length", this.getLength());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeStringValue("suggestion", this.getSuggestion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the length property value. Defines the length of a changed segment.
     * @param value Value to set for the length property.
     */
    public void setLength(@jakarta.annotation.Nullable final Integer value) {
        this.length = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the offset property value. Defines the offset of a changed segment.
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the suggestion property value. Represents the corrected segment string.
     * @param value Value to set for the suggestion property.
     */
    public void setSuggestion(@jakarta.annotation.Nullable final String value) {
        this.suggestion = value;
    }
}
