package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersonOrGroupColumn implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether multiple values can be selected from the source.
     */
    private Boolean allowMultipleSelection;
    /**
     * Whether to allow selection of people only, or people and groups. Must be one of peopleAndGroups or peopleOnly.
     */
    private String chooseFromType;
    /**
     * How to display the information about the person or group chosen. See below.
     */
    private String displayAs;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new personOrGroupColumn and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PersonOrGroupColumn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a personOrGroupColumn
     */
    @javax.annotation.Nonnull
    public static PersonOrGroupColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonOrGroupColumn();
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
     * Gets the allowMultipleSelection property value. Indicates whether multiple values can be selected from the source.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowMultipleSelection() {
        return this.allowMultipleSelection;
    }
    /**
     * Gets the chooseFromType property value. Whether to allow selection of people only, or people and groups. Must be one of peopleAndGroups or peopleOnly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChooseFromType() {
        return this.chooseFromType;
    }
    /**
     * Gets the displayAs property value. How to display the information about the person or group chosen. See below.
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
        deserializerMap.put("allowMultipleSelection", (n) -> { this.setAllowMultipleSelection(n.getBooleanValue()); });
        deserializerMap.put("chooseFromType", (n) -> { this.setChooseFromType(n.getStringValue()); });
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
        writer.writeBooleanValue("allowMultipleSelection", this.getAllowMultipleSelection());
        writer.writeStringValue("chooseFromType", this.getChooseFromType());
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
     * Sets the allowMultipleSelection property value. Indicates whether multiple values can be selected from the source.
     * @param value Value to set for the allowMultipleSelection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowMultipleSelection(@javax.annotation.Nullable final Boolean value) {
        this.allowMultipleSelection = value;
    }
    /**
     * Sets the chooseFromType property value. Whether to allow selection of people only, or people and groups. Must be one of peopleAndGroups or peopleOnly.
     * @param value Value to set for the chooseFromType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChooseFromType(@javax.annotation.Nullable final String value) {
        this.chooseFromType = value;
    }
    /**
     * Sets the displayAs property value. How to display the information about the person or group chosen. See below.
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
