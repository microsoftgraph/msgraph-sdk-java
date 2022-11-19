package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookFilterCriteria implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The color property */
    private String _color;
    /** The criterion1 property */
    private String _criterion1;
    /** The criterion2 property */
    private String _criterion2;
    /** The dynamicCriteria property */
    private String _dynamicCriteria;
    /** The filterOn property */
    private String _filterOn;
    /** The icon property */
    private WorkbookIcon _icon;
    /** The OdataType property */
    private String _odataType;
    /** The operator property */
    private String _operator;
    /** The values property */
    private Json _values;
    /**
     * Instantiates a new workbookFilterCriteria and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookFilterCriteria() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.workbookFilterCriteria");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookFilterCriteria
     */
    @javax.annotation.Nonnull
    public static WorkbookFilterCriteria createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookFilterCriteria();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the color property value. The color property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getColor() {
        return this._color;
    }
    /**
     * Gets the criterion1 property value. The criterion1 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCriterion1() {
        return this._criterion1;
    }
    /**
     * Gets the criterion2 property value. The criterion2 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCriterion2() {
        return this._criterion2;
    }
    /**
     * Gets the dynamicCriteria property value. The dynamicCriteria property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDynamicCriteria() {
        return this._dynamicCriteria;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookFilterCriteria currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(9);
        deserializerMap.put("color", (n) -> { currentObject.setColor(n.getStringValue()); });
        deserializerMap.put("criterion1", (n) -> { currentObject.setCriterion1(n.getStringValue()); });
        deserializerMap.put("criterion2", (n) -> { currentObject.setCriterion2(n.getStringValue()); });
        deserializerMap.put("dynamicCriteria", (n) -> { currentObject.setDynamicCriteria(n.getStringValue()); });
        deserializerMap.put("filterOn", (n) -> { currentObject.setFilterOn(n.getStringValue()); });
        deserializerMap.put("icon", (n) -> { currentObject.setIcon(n.getObjectValue(WorkbookIcon::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("operator", (n) -> { currentObject.setOperator(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { currentObject.setValues(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the filterOn property value. The filterOn property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilterOn() {
        return this._filterOn;
    }
    /**
     * Gets the icon property value. The icon property
     * @return a workbookIcon
     */
    @javax.annotation.Nullable
    public WorkbookIcon getIcon() {
        return this._icon;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the operator property value. The operator property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperator() {
        return this._operator;
    }
    /**
     * Gets the values property value. The values property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getValues() {
        return this._values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("color", this.getColor());
        writer.writeStringValue("criterion1", this.getCriterion1());
        writer.writeStringValue("criterion2", this.getCriterion2());
        writer.writeStringValue("dynamicCriteria", this.getDynamicCriteria());
        writer.writeStringValue("filterOn", this.getFilterOn());
        writer.writeObjectValue("icon", this.getIcon());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operator", this.getOperator());
        writer.writeObjectValue("values", this.getValues());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the color property value. The color property
     * @param value Value to set for the color property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColor(@javax.annotation.Nullable final String value) {
        this._color = value;
    }
    /**
     * Sets the criterion1 property value. The criterion1 property
     * @param value Value to set for the criterion1 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCriterion1(@javax.annotation.Nullable final String value) {
        this._criterion1 = value;
    }
    /**
     * Sets the criterion2 property value. The criterion2 property
     * @param value Value to set for the criterion2 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCriterion2(@javax.annotation.Nullable final String value) {
        this._criterion2 = value;
    }
    /**
     * Sets the dynamicCriteria property value. The dynamicCriteria property
     * @param value Value to set for the dynamicCriteria property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDynamicCriteria(@javax.annotation.Nullable final String value) {
        this._dynamicCriteria = value;
    }
    /**
     * Sets the filterOn property value. The filterOn property
     * @param value Value to set for the filterOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilterOn(@javax.annotation.Nullable final String value) {
        this._filterOn = value;
    }
    /**
     * Sets the icon property value. The icon property
     * @param value Value to set for the icon property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIcon(@javax.annotation.Nullable final WorkbookIcon value) {
        this._icon = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the operator property value. The operator property
     * @param value Value to set for the operator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperator(@javax.annotation.Nullable final String value) {
        this._operator = value;
    }
    /**
     * Sets the values property value. The values property
     * @param value Value to set for the values property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValues(@javax.annotation.Nullable final Json value) {
        this._values = value;
    }
}
