package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAnswer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The answeredQuestion property
     */
    private AccessPackageQuestion answeredQuestion;
    /**
     * The localized display value shown to the requestor and approvers.
     */
    private String displayValue;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new accessPackageAnswer and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AccessPackageAnswer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAnswer
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAnswer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.accessPackageAnswerString": return new AccessPackageAnswerString();
            }
        }
        return new AccessPackageAnswer();
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
     * Gets the answeredQuestion property value. The answeredQuestion property
     * @return a accessPackageQuestion
     */
    @jakarta.annotation.Nullable
    public AccessPackageQuestion getAnsweredQuestion() {
        return this.answeredQuestion;
    }
    /**
     * Gets the displayValue property value. The localized display value shown to the requestor and approvers.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayValue() {
        return this.displayValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("answeredQuestion", (n) -> { this.setAnsweredQuestion(n.getObjectValue(AccessPackageQuestion::createFromDiscriminatorValue)); });
        deserializerMap.put("displayValue", (n) -> { this.setDisplayValue(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("answeredQuestion", this.getAnsweredQuestion());
        writer.writeStringValue("displayValue", this.getDisplayValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the answeredQuestion property value. The answeredQuestion property
     * @param value Value to set for the answeredQuestion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAnsweredQuestion(@jakarta.annotation.Nullable final AccessPackageQuestion value) {
        this.answeredQuestion = value;
    }
    /**
     * Sets the displayValue property value. The localized display value shown to the requestor and approvers.
     * @param value Value to set for the displayValue property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayValue(@jakarta.annotation.Nullable final String value) {
        this.displayValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
