package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAnswerChoice implements AdditionalDataHolder, Parsable {
    /**
     * The actual value of the selected choice. This is typically a string value which is understandable by applications. Required.
     */
    private String actualValue;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The text of the answer choice represented in a format for a specific locale.
     */
    private java.util.List<AccessPackageLocalizedText> localizations;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The text property
     */
    private String text;
    /**
     * Instantiates a new accessPackageAnswerChoice and sets the default values.
     */
    public AccessPackageAnswerChoice() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAnswerChoice
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAnswerChoice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAnswerChoice();
    }
    /**
     * Gets the actualValue property value. The actual value of the selected choice. This is typically a string value which is understandable by applications. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getActualValue() {
        return this.actualValue;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("actualValue", (n) -> { this.setActualValue(n.getStringValue()); });
        deserializerMap.put("localizations", (n) -> { this.setLocalizations(n.getCollectionOfObjectValues(AccessPackageLocalizedText::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the localizations property value. The text of the answer choice represented in a format for a specific locale.
     * @return a accessPackageLocalizedText
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageLocalizedText> getLocalizations() {
        return this.localizations;
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
     * Gets the text property value. The text property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actualValue", this.getActualValue());
        writer.writeCollectionOfObjectValues("localizations", this.getLocalizations());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("text", this.getText());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actualValue property value. The actual value of the selected choice. This is typically a string value which is understandable by applications. Required.
     * @param value Value to set for the actualValue property.
     */
    public void setActualValue(@jakarta.annotation.Nullable final String value) {
        this.actualValue = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the localizations property value. The text of the answer choice represented in a format for a specific locale.
     * @param value Value to set for the localizations property.
     */
    public void setLocalizations(@jakarta.annotation.Nullable final java.util.List<AccessPackageLocalizedText> value) {
        this.localizations = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
}
