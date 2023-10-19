package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookFilterCriteria implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The color property
     */
    private String color;
    /**
     * The criterion1 property
     */
    private String criterion1;
    /**
     * The criterion2 property
     */
    private String criterion2;
    /**
     * The dynamicCriteria property
     */
    private String dynamicCriteria;
    /**
     * The filterOn property
     */
    private String filterOn;
    /**
     * The icon property
     */
    private WorkbookIcon icon;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The operator property
     */
    private String operator;
    /**
     * The values property
     */
    private Json values;
    /**
     * Instantiates a new WorkbookFilterCriteria and sets the default values.
     */
    public WorkbookFilterCriteria() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookFilterCriteria
     */
    @jakarta.annotation.Nonnull
    public static WorkbookFilterCriteria createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookFilterCriteria();
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
     * Gets the color property value. The color property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getColor() {
        return this.color;
    }
    /**
     * Gets the criterion1 property value. The criterion1 property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCriterion1() {
        return this.criterion1;
    }
    /**
     * Gets the criterion2 property value. The criterion2 property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCriterion2() {
        return this.criterion2;
    }
    /**
     * Gets the dynamicCriteria property value. The dynamicCriteria property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDynamicCriteria() {
        return this.dynamicCriteria;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("color", (n) -> { this.setColor(n.getStringValue()); });
        deserializerMap.put("criterion1", (n) -> { this.setCriterion1(n.getStringValue()); });
        deserializerMap.put("criterion2", (n) -> { this.setCriterion2(n.getStringValue()); });
        deserializerMap.put("dynamicCriteria", (n) -> { this.setDynamicCriteria(n.getStringValue()); });
        deserializerMap.put("filterOn", (n) -> { this.setFilterOn(n.getStringValue()); });
        deserializerMap.put("icon", (n) -> { this.setIcon(n.getObjectValue(WorkbookIcon::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filterOn property value. The filterOn property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFilterOn() {
        return this.filterOn;
    }
    /**
     * Gets the icon property value. The icon property
     * @return a WorkbookIcon
     */
    @jakarta.annotation.Nullable
    public WorkbookIcon getIcon() {
        return this.icon;
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
     * Gets the operator property value. The operator property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperator() {
        return this.operator;
    }
    /**
     * Gets the values property value. The values property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getValues() {
        return this.values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the color property value. The color property
     * @param value Value to set for the color property.
     */
    public void setColor(@jakarta.annotation.Nullable final String value) {
        this.color = value;
    }
    /**
     * Sets the criterion1 property value. The criterion1 property
     * @param value Value to set for the criterion1 property.
     */
    public void setCriterion1(@jakarta.annotation.Nullable final String value) {
        this.criterion1 = value;
    }
    /**
     * Sets the criterion2 property value. The criterion2 property
     * @param value Value to set for the criterion2 property.
     */
    public void setCriterion2(@jakarta.annotation.Nullable final String value) {
        this.criterion2 = value;
    }
    /**
     * Sets the dynamicCriteria property value. The dynamicCriteria property
     * @param value Value to set for the dynamicCriteria property.
     */
    public void setDynamicCriteria(@jakarta.annotation.Nullable final String value) {
        this.dynamicCriteria = value;
    }
    /**
     * Sets the filterOn property value. The filterOn property
     * @param value Value to set for the filterOn property.
     */
    public void setFilterOn(@jakarta.annotation.Nullable final String value) {
        this.filterOn = value;
    }
    /**
     * Sets the icon property value. The icon property
     * @param value Value to set for the icon property.
     */
    public void setIcon(@jakarta.annotation.Nullable final WorkbookIcon value) {
        this.icon = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the operator property value. The operator property
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final String value) {
        this.operator = value;
    }
    /**
     * Sets the values property value. The values property
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final Json value) {
        this.values = value;
    }
}
