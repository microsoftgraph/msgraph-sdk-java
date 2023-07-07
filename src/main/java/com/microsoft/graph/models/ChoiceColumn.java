package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChoiceColumn implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If true, allows custom values that aren't in the configured choices.
     */
    private Boolean allowTextEntry;
    /**
     * The list of values available for this column.
     */
    private java.util.List<String> choices;
    /**
     * How the choices are to be presented in the UX. Must be one of checkBoxes, dropDownMenu, or radioButtons
     */
    private String displayAs;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new choiceColumn and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChoiceColumn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a choiceColumn
     */
    @javax.annotation.Nonnull
    public static ChoiceColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChoiceColumn();
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
     * Gets the allowTextEntry property value. If true, allows custom values that aren't in the configured choices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowTextEntry() {
        return this.allowTextEntry;
    }
    /**
     * Gets the choices property value. The list of values available for this column.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getChoices() {
        return this.choices;
    }
    /**
     * Gets the displayAs property value. How the choices are to be presented in the UX. Must be one of checkBoxes, dropDownMenu, or radioButtons
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayAs() {
        return this.displayAs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("allowTextEntry", (n) -> { this.setAllowTextEntry(n.getBooleanValue()); });
        deserializerMap.put("choices", (n) -> { this.setChoices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("displayAs", (n) -> { this.setDisplayAs(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowTextEntry", this.getAllowTextEntry());
        writer.writeCollectionOfPrimitiveValues("choices", this.getChoices());
        writer.writeStringValue("displayAs", this.getDisplayAs());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the allowTextEntry property value. If true, allows custom values that aren't in the configured choices.
     * @param value Value to set for the allowTextEntry property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowTextEntry(@javax.annotation.Nullable final Boolean value) {
        this.allowTextEntry = value;
    }
    /**
     * Sets the choices property value. The list of values available for this column.
     * @param value Value to set for the choices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChoices(@javax.annotation.Nullable final java.util.List<String> value) {
        this.choices = value;
    }
    /**
     * Sets the displayAs property value. How the choices are to be presented in the UX. Must be one of checkBoxes, dropDownMenu, or radioButtons
     * @param value Value to set for the displayAs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayAs(@javax.annotation.Nullable final String value) {
        this.displayAs = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
