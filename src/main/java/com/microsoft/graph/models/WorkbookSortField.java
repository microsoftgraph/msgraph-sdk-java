package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookSortField implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Represents whether the sorting is done in an ascending fashion.
     */
    private Boolean ascending;
    /**
     * Represents the color that is the target of the condition if the sorting is on font or cell color.
     */
    private String color;
    /**
     * Represents additional sorting options for this field. The possible values are: Normal, TextAsNumber.
     */
    private String dataOption;
    /**
     * Represents the icon that is the target of the condition if the sorting is on the cell's icon.
     */
    private WorkbookIcon icon;
    /**
     * Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
     */
    private Integer key;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Represents the type of sorting of this condition. The possible values are: Value, CellColor, FontColor, Icon.
     */
    private String sortOn;
    /**
     * Instantiates a new WorkbookSortField and sets the default values.
     */
    public WorkbookSortField() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookSortField
     */
    @jakarta.annotation.Nonnull
    public static WorkbookSortField createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookSortField();
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
     * Gets the ascending property value. Represents whether the sorting is done in an ascending fashion.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAscending() {
        return this.ascending;
    }
    /**
     * Gets the color property value. Represents the color that is the target of the condition if the sorting is on font or cell color.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getColor() {
        return this.color;
    }
    /**
     * Gets the dataOption property value. Represents additional sorting options for this field. The possible values are: Normal, TextAsNumber.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDataOption() {
        return this.dataOption;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("ascending", (n) -> { this.setAscending(n.getBooleanValue()); });
        deserializerMap.put("color", (n) -> { this.setColor(n.getStringValue()); });
        deserializerMap.put("dataOption", (n) -> { this.setDataOption(n.getStringValue()); });
        deserializerMap.put("icon", (n) -> { this.setIcon(n.getObjectValue(WorkbookIcon::createFromDiscriminatorValue)); });
        deserializerMap.put("key", (n) -> { this.setKey(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sortOn", (n) -> { this.setSortOn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the icon property value. Represents the icon that is the target of the condition if the sorting is on the cell's icon.
     * @return a WorkbookIcon
     */
    @jakarta.annotation.Nullable
    public WorkbookIcon getIcon() {
        return this.icon;
    }
    /**
     * Gets the key property value. Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getKey() {
        return this.key;
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
     * Gets the sortOn property value. Represents the type of sorting of this condition. The possible values are: Value, CellColor, FontColor, Icon.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSortOn() {
        return this.sortOn;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("ascending", this.getAscending());
        writer.writeStringValue("color", this.getColor());
        writer.writeStringValue("dataOption", this.getDataOption());
        writer.writeObjectValue("icon", this.getIcon());
        writer.writeIntegerValue("key", this.getKey());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sortOn", this.getSortOn());
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
     * Sets the ascending property value. Represents whether the sorting is done in an ascending fashion.
     * @param value Value to set for the ascending property.
     */
    public void setAscending(@jakarta.annotation.Nullable final Boolean value) {
        this.ascending = value;
    }
    /**
     * Sets the color property value. Represents the color that is the target of the condition if the sorting is on font or cell color.
     * @param value Value to set for the color property.
     */
    public void setColor(@jakarta.annotation.Nullable final String value) {
        this.color = value;
    }
    /**
     * Sets the dataOption property value. Represents additional sorting options for this field. The possible values are: Normal, TextAsNumber.
     * @param value Value to set for the dataOption property.
     */
    public void setDataOption(@jakarta.annotation.Nullable final String value) {
        this.dataOption = value;
    }
    /**
     * Sets the icon property value. Represents the icon that is the target of the condition if the sorting is on the cell's icon.
     * @param value Value to set for the icon property.
     */
    public void setIcon(@jakarta.annotation.Nullable final WorkbookIcon value) {
        this.icon = value;
    }
    /**
     * Sets the key property value. Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final Integer value) {
        this.key = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sortOn property value. Represents the type of sorting of this condition. The possible values are: Value, CellColor, FontColor, Icon.
     * @param value Value to set for the sortOn property.
     */
    public void setSortOn(@jakarta.annotation.Nullable final String value) {
        this.sortOn = value;
    }
}
