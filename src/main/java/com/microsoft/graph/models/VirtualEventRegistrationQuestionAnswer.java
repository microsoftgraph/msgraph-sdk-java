package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventRegistrationQuestionAnswer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The booleanValue property
     */
    private Boolean booleanValue;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The multiChoiceValues property
     */
    private java.util.List<String> multiChoiceValues;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The questionId property
     */
    private String questionId;
    /**
     * The value property
     */
    private String value;
    /**
     * Instantiates a new VirtualEventRegistrationQuestionAnswer and sets the default values.
     */
    public VirtualEventRegistrationQuestionAnswer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VirtualEventRegistrationQuestionAnswer
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventRegistrationQuestionAnswer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventRegistrationQuestionAnswer();
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
     * Gets the booleanValue property value. The booleanValue property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBooleanValue() {
        return this.booleanValue;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("booleanValue", (n) -> { this.setBooleanValue(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("multiChoiceValues", (n) -> { this.setMultiChoiceValues(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("questionId", (n) -> { this.setQuestionId(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the multiChoiceValues property value. The multiChoiceValues property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMultiChoiceValues() {
        return this.multiChoiceValues;
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
     * Gets the questionId property value. The questionId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQuestionId() {
        return this.questionId;
    }
    /**
     * Gets the value property value. The value property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("booleanValue", this.getBooleanValue());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("multiChoiceValues", this.getMultiChoiceValues());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("questionId", this.getQuestionId());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the booleanValue property value. The booleanValue property
     * @param value Value to set for the booleanValue property.
     */
    public void setBooleanValue(@jakarta.annotation.Nullable final Boolean value) {
        this.booleanValue = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the multiChoiceValues property value. The multiChoiceValues property
     * @param value Value to set for the multiChoiceValues property.
     */
    public void setMultiChoiceValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.multiChoiceValues = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the questionId property value. The questionId property
     * @param value Value to set for the questionId property.
     */
    public void setQuestionId(@jakarta.annotation.Nullable final String value) {
        this.questionId = value;
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
