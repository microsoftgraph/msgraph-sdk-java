package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ColumnValidation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Default BCP 47 language tag for the description.
     */
    private String defaultLanguage;
    /**
     * Localized messages that explain what is needed for this column's value to be considered valid. User will be prompted with this message if validation fails.
     */
    private java.util.List<DisplayNameLocalization> descriptions;
    /**
     * The formula to validate column value. For examples, see Examples of common formulas in lists.
     */
    private String formula;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new columnValidation and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ColumnValidation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a columnValidation
     */
    @jakarta.annotation.Nonnull
    public static ColumnValidation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ColumnValidation();
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
     * Gets the defaultLanguage property value. Default BCP 47 language tag for the description.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }
    /**
     * Gets the descriptions property value. Localized messages that explain what is needed for this column's value to be considered valid. User will be prompted with this message if validation fails.
     * @return a displayNameLocalization
     */
    @jakarta.annotation.Nullable
    public java.util.List<DisplayNameLocalization> getDescriptions() {
        return this.descriptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("defaultLanguage", (n) -> { this.setDefaultLanguage(n.getStringValue()); });
        deserializerMap.put("descriptions", (n) -> { this.setDescriptions(n.getCollectionOfObjectValues(DisplayNameLocalization::createFromDiscriminatorValue)); });
        deserializerMap.put("formula", (n) -> { this.setFormula(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the formula property value. The formula to validate column value. For examples, see Examples of common formulas in lists.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFormula() {
        return this.formula;
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
        writer.writeStringValue("defaultLanguage", this.getDefaultLanguage());
        writer.writeCollectionOfObjectValues("descriptions", this.getDescriptions());
        writer.writeStringValue("formula", this.getFormula());
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
     * Sets the defaultLanguage property value. Default BCP 47 language tag for the description.
     * @param value Value to set for the defaultLanguage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDefaultLanguage(@jakarta.annotation.Nullable final String value) {
        this.defaultLanguage = value;
    }
    /**
     * Sets the descriptions property value. Localized messages that explain what is needed for this column's value to be considered valid. User will be prompted with this message if validation fails.
     * @param value Value to set for the descriptions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescriptions(@jakarta.annotation.Nullable final java.util.List<DisplayNameLocalization> value) {
        this.descriptions = value;
    }
    /**
     * Sets the formula property value. The formula to validate column value. For examples, see Examples of common formulas in lists.
     * @param value Value to set for the formula property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFormula(@jakarta.annotation.Nullable final String value) {
        this.formula = value;
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
