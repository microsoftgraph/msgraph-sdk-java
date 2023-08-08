package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookNamedItem extends Entity implements Parsable {
    /**
     * Represents the comment associated with this name.
     */
    private String comment;
    /**
     * The name of the object. Read-only.
     */
    private String name;
    /**
     * Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only.
     */
    private String scope;
    /**
     * Indicates what type of reference is associated with the name. The possible values are: String, Integer, Double, Boolean, Range. Read-only.
     */
    private String type;
    /**
     * Represents the formula that the name is defined to refer to. E.g. =Sheet14!$B$2:$H$12, =4.75, etc. Read-only.
     */
    private Json value;
    /**
     * Specifies whether the object is visible or not.
     */
    private Boolean visible;
    /**
     * Returns the worksheet on which the named item is scoped to. Available only if the item is scoped to the worksheet. Read-only.
     */
    private WorkbookWorksheet worksheet;
    /**
     * Instantiates a new workbookNamedItem and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WorkbookNamedItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookNamedItem
     */
    @jakarta.annotation.Nonnull
    public static WorkbookNamedItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookNamedItem();
    }
    /**
     * Gets the comment property value. Represents the comment associated with this name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.comment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("visible", (n) -> { this.setVisible(n.getBooleanValue()); });
        deserializerMap.put("worksheet", (n) -> { this.setWorksheet(n.getObjectValue(WorkbookWorksheet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the object. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the scope property value. Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getScope() {
        return this.scope;
    }
    /**
     * Gets the type property value. Indicates what type of reference is associated with the name. The possible values are: String, Integer, Double, Boolean, Range. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the value property value. Represents the formula that the name is defined to refer to. E.g. =Sheet14!$B$2:$H$12, =4.75, etc. Read-only.
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getValue() {
        return this.value;
    }
    /**
     * Gets the visible property value. Specifies whether the object is visible or not.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getVisible() {
        return this.visible;
    }
    /**
     * Gets the worksheet property value. Returns the worksheet on which the named item is scoped to. Available only if the item is scoped to the worksheet. Read-only.
     * @return a workbookWorksheet
     */
    @jakarta.annotation.Nullable
    public WorkbookWorksheet getWorksheet() {
        return this.worksheet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("comment", this.getComment());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("scope", this.getScope());
        writer.writeStringValue("type", this.getType());
        writer.writeObjectValue("value", this.getValue());
        writer.writeBooleanValue("visible", this.getVisible());
        writer.writeObjectValue("worksheet", this.getWorksheet());
    }
    /**
     * Sets the comment property value. Represents the comment associated with this name.
     * @param value Value to set for the comment property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.comment = value;
    }
    /**
     * Sets the name property value. The name of the object. Read-only.
     * @param value Value to set for the name property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the scope property value. Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only.
     * @param value Value to set for the scope property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setScope(@jakarta.annotation.Nullable final String value) {
        this.scope = value;
    }
    /**
     * Sets the type property value. Indicates what type of reference is associated with the name. The possible values are: String, Integer, Double, Boolean, Range. Read-only.
     * @param value Value to set for the type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the value property value. Represents the formula that the name is defined to refer to. E.g. =Sheet14!$B$2:$H$12, =4.75, etc. Read-only.
     * @param value Value to set for the value property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValue(@jakarta.annotation.Nullable final Json value) {
        this.value = value;
    }
    /**
     * Sets the visible property value. Specifies whether the object is visible or not.
     * @param value Value to set for the visible property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVisible(@jakarta.annotation.Nullable final Boolean value) {
        this.visible = value;
    }
    /**
     * Sets the worksheet property value. Returns the worksheet on which the named item is scoped to. Available only if the item is scoped to the worksheet. Read-only.
     * @param value Value to set for the worksheet property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWorksheet(@jakarta.annotation.Nullable final WorkbookWorksheet value) {
        this.worksheet = value;
    }
}
