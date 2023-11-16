package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ColumnDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new ColumnDefinition and sets the default values.
     */
    public ColumnDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ColumnDefinition
     */
    @jakarta.annotation.Nonnull
    public static ColumnDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ColumnDefinition();
    }
    /**
     * Gets the boolean property value. This column stores boolean values.
     * @return a BooleanColumn
     */
    @jakarta.annotation.Nullable
    public BooleanColumn getBoolean() {
        return this.backingStore.get("boolean");
    }
    /**
     * Gets the calculated property value. This column's data is calculated based on other columns.
     * @return a CalculatedColumn
     */
    @jakarta.annotation.Nullable
    public CalculatedColumn getCalculated() {
        return this.backingStore.get("calculated");
    }
    /**
     * Gets the choice property value. This column stores data from a list of choices.
     * @return a ChoiceColumn
     */
    @jakarta.annotation.Nullable
    public ChoiceColumn getChoice() {
        return this.backingStore.get("choice");
    }
    /**
     * Gets the columnGroup property value. For site columns, the name of the group this column belongs to. Helps organize related columns.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getColumnGroup() {
        return this.backingStore.get("columnGroup");
    }
    /**
     * Gets the contentApprovalStatus property value. This column stores content approval status.
     * @return a ContentApprovalStatusColumn
     */
    @jakarta.annotation.Nullable
    public ContentApprovalStatusColumn getContentApprovalStatus() {
        return this.backingStore.get("contentApprovalStatus");
    }
    /**
     * Gets the currency property value. This column stores currency values.
     * @return a CurrencyColumn
     */
    @jakarta.annotation.Nullable
    public CurrencyColumn getCurrency() {
        return this.backingStore.get("currency");
    }
    /**
     * Gets the dateTime property value. This column stores DateTime values.
     * @return a DateTimeColumn
     */
    @jakarta.annotation.Nullable
    public DateTimeColumn getDateTime() {
        return this.backingStore.get("dateTime");
    }
    /**
     * Gets the defaultValue property value. The default value for this column.
     * @return a DefaultColumnValue
     */
    @jakarta.annotation.Nullable
    public DefaultColumnValue getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * Gets the description property value. The user-facing description of the column.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The user-facing name of the column.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the enforceUniqueValues property value. If true, no two list items may have the same value for this column.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnforceUniqueValues() {
        return this.backingStore.get("enforceUniqueValues");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("boolean", (n) -> { this.setBoolean(n.getObjectValue(BooleanColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("calculated", (n) -> { this.setCalculated(n.getObjectValue(CalculatedColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("choice", (n) -> { this.setChoice(n.getObjectValue(ChoiceColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("columnGroup", (n) -> { this.setColumnGroup(n.getStringValue()); });
        deserializerMap.put("contentApprovalStatus", (n) -> { this.setContentApprovalStatus(n.getObjectValue(ContentApprovalStatusColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getObjectValue(CurrencyColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("dateTime", (n) -> { this.setDateTime(n.getObjectValue(DateTimeColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getObjectValue(DefaultColumnValue::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enforceUniqueValues", (n) -> { this.setEnforceUniqueValues(n.getBooleanValue()); });
        deserializerMap.put("geolocation", (n) -> { this.setGeolocation(n.getObjectValue(GeolocationColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("hidden", (n) -> { this.setHidden(n.getBooleanValue()); });
        deserializerMap.put("hyperlinkOrPicture", (n) -> { this.setHyperlinkOrPicture(n.getObjectValue(HyperlinkOrPictureColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("indexed", (n) -> { this.setIndexed(n.getBooleanValue()); });
        deserializerMap.put("isDeletable", (n) -> { this.setIsDeletable(n.getBooleanValue()); });
        deserializerMap.put("isReorderable", (n) -> { this.setIsReorderable(n.getBooleanValue()); });
        deserializerMap.put("isSealed", (n) -> { this.setIsSealed(n.getBooleanValue()); });
        deserializerMap.put("lookup", (n) -> { this.setLookup(n.getObjectValue(LookupColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getObjectValue(NumberColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("personOrGroup", (n) -> { this.setPersonOrGroup(n.getObjectValue(PersonOrGroupColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("propagateChanges", (n) -> { this.setPropagateChanges(n.getBooleanValue()); });
        deserializerMap.put("readOnly", (n) -> { this.setReadOnly(n.getBooleanValue()); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        deserializerMap.put("sourceColumn", (n) -> { this.setSourceColumn(n.getObjectValue(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceContentType", (n) -> { this.setSourceContentType(n.getObjectValue(ContentTypeInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("term", (n) -> { this.setTerm(n.getObjectValue(TermColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getObjectValue(TextColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("thumbnail", (n) -> { this.setThumbnail(n.getObjectValue(ThumbnailColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ColumnTypes.class)); });
        deserializerMap.put("validation", (n) -> { this.setValidation(n.getObjectValue(ColumnValidation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the geolocation property value. This column stores a geolocation.
     * @return a GeolocationColumn
     */
    @jakarta.annotation.Nullable
    public GeolocationColumn getGeolocation() {
        return this.backingStore.get("geolocation");
    }
    /**
     * Gets the hidden property value. Specifies whether the column is displayed in the user interface.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHidden() {
        return this.backingStore.get("hidden");
    }
    /**
     * Gets the hyperlinkOrPicture property value. This column stores hyperlink or picture values.
     * @return a HyperlinkOrPictureColumn
     */
    @jakarta.annotation.Nullable
    public HyperlinkOrPictureColumn getHyperlinkOrPicture() {
        return this.backingStore.get("hyperlinkOrPicture");
    }
    /**
     * Gets the indexed property value. Specifies whether the column values can be used for sorting and searching.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIndexed() {
        return this.backingStore.get("indexed");
    }
    /**
     * Gets the isDeletable property value. Indicates whether this column can be deleted.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeletable() {
        return this.backingStore.get("isDeletable");
    }
    /**
     * Gets the isReorderable property value. Indicates whether values in the column can be reordered. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReorderable() {
        return this.backingStore.get("isReorderable");
    }
    /**
     * Gets the isSealed property value. Specifies whether the column can be changed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSealed() {
        return this.backingStore.get("isSealed");
    }
    /**
     * Gets the lookup property value. This column's data is looked up from another source in the site.
     * @return a LookupColumn
     */
    @jakarta.annotation.Nullable
    public LookupColumn getLookup() {
        return this.backingStore.get("lookup");
    }
    /**
     * Gets the name property value. The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see displayName.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the number property value. This column stores number values.
     * @return a NumberColumn
     */
    @jakarta.annotation.Nullable
    public NumberColumn getNumber() {
        return this.backingStore.get("number");
    }
    /**
     * Gets the personOrGroup property value. This column stores Person or Group values.
     * @return a PersonOrGroupColumn
     */
    @jakarta.annotation.Nullable
    public PersonOrGroupColumn getPersonOrGroup() {
        return this.backingStore.get("personOrGroup");
    }
    /**
     * Gets the propagateChanges property value. If 'true', changes to this column will be propagated to lists that implement the column.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPropagateChanges() {
        return this.backingStore.get("propagateChanges");
    }
    /**
     * Gets the readOnly property value. Specifies whether the column values can be modified.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getReadOnly() {
        return this.backingStore.get("readOnly");
    }
    /**
     * Gets the required property value. Specifies whether the column value isn't optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequired() {
        return this.backingStore.get("required");
    }
    /**
     * Gets the sourceColumn property value. The source column for the content type column.
     * @return a ColumnDefinition
     */
    @jakarta.annotation.Nullable
    public ColumnDefinition getSourceColumn() {
        return this.backingStore.get("sourceColumn");
    }
    /**
     * Gets the sourceContentType property value. ContentType from which this column is inherited from. Present only in contentTypes columns response. Read-only.
     * @return a ContentTypeInfo
     */
    @jakarta.annotation.Nullable
    public ContentTypeInfo getSourceContentType() {
        return this.backingStore.get("sourceContentType");
    }
    /**
     * Gets the term property value. This column stores taxonomy terms.
     * @return a TermColumn
     */
    @jakarta.annotation.Nullable
    public TermColumn getTerm() {
        return this.backingStore.get("term");
    }
    /**
     * Gets the text property value. This column stores text values.
     * @return a TextColumn
     */
    @jakarta.annotation.Nullable
    public TextColumn getText() {
        return this.backingStore.get("text");
    }
    /**
     * Gets the thumbnail property value. This column stores thumbnail values.
     * @return a ThumbnailColumn
     */
    @jakarta.annotation.Nullable
    public ThumbnailColumn getThumbnail() {
        return this.backingStore.get("thumbnail");
    }
    /**
     * Gets the type property value. For site columns, the type of column. Read-only.
     * @return a ColumnTypes
     */
    @jakarta.annotation.Nullable
    public ColumnTypes getType() {
        return this.backingStore.get("type");
    }
    /**
     * Gets the validation property value. This column stores validation formula and message for the column.
     * @return a ColumnValidation
     */
    @jakarta.annotation.Nullable
    public ColumnValidation getValidation() {
        return this.backingStore.get("validation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("boolean", this.getBoolean());
        writer.writeObjectValue("calculated", this.getCalculated());
        writer.writeObjectValue("choice", this.getChoice());
        writer.writeStringValue("columnGroup", this.getColumnGroup());
        writer.writeObjectValue("contentApprovalStatus", this.getContentApprovalStatus());
        writer.writeObjectValue("currency", this.getCurrency());
        writer.writeObjectValue("dateTime", this.getDateTime());
        writer.writeObjectValue("defaultValue", this.getDefaultValue());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("enforceUniqueValues", this.getEnforceUniqueValues());
        writer.writeObjectValue("geolocation", this.getGeolocation());
        writer.writeBooleanValue("hidden", this.getHidden());
        writer.writeObjectValue("hyperlinkOrPicture", this.getHyperlinkOrPicture());
        writer.writeBooleanValue("indexed", this.getIndexed());
        writer.writeBooleanValue("isDeletable", this.getIsDeletable());
        writer.writeBooleanValue("isReorderable", this.getIsReorderable());
        writer.writeBooleanValue("isSealed", this.getIsSealed());
        writer.writeObjectValue("lookup", this.getLookup());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("number", this.getNumber());
        writer.writeObjectValue("personOrGroup", this.getPersonOrGroup());
        writer.writeBooleanValue("propagateChanges", this.getPropagateChanges());
        writer.writeBooleanValue("readOnly", this.getReadOnly());
        writer.writeBooleanValue("required", this.getRequired());
        writer.writeObjectValue("sourceColumn", this.getSourceColumn());
        writer.writeObjectValue("sourceContentType", this.getSourceContentType());
        writer.writeObjectValue("term", this.getTerm());
        writer.writeObjectValue("text", this.getText());
        writer.writeObjectValue("thumbnail", this.getThumbnail());
        writer.writeEnumValue("type", this.getType());
        writer.writeObjectValue("validation", this.getValidation());
    }
    /**
     * Sets the boolean property value. This column stores boolean values.
     * @param value Value to set for the boolean property.
     */
    public void setBoolean(@jakarta.annotation.Nullable final BooleanColumn value) {
        this.backingStore.set("boolean", value);
    }
    /**
     * Sets the calculated property value. This column's data is calculated based on other columns.
     * @param value Value to set for the calculated property.
     */
    public void setCalculated(@jakarta.annotation.Nullable final CalculatedColumn value) {
        this.backingStore.set("calculated", value);
    }
    /**
     * Sets the choice property value. This column stores data from a list of choices.
     * @param value Value to set for the choice property.
     */
    public void setChoice(@jakarta.annotation.Nullable final ChoiceColumn value) {
        this.backingStore.set("choice", value);
    }
    /**
     * Sets the columnGroup property value. For site columns, the name of the group this column belongs to. Helps organize related columns.
     * @param value Value to set for the columnGroup property.
     */
    public void setColumnGroup(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("columnGroup", value);
    }
    /**
     * Sets the contentApprovalStatus property value. This column stores content approval status.
     * @param value Value to set for the contentApprovalStatus property.
     */
    public void setContentApprovalStatus(@jakarta.annotation.Nullable final ContentApprovalStatusColumn value) {
        this.backingStore.set("contentApprovalStatus", value);
    }
    /**
     * Sets the currency property value. This column stores currency values.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final CurrencyColumn value) {
        this.backingStore.set("currency", value);
    }
    /**
     * Sets the dateTime property value. This column stores DateTime values.
     * @param value Value to set for the dateTime property.
     */
    public void setDateTime(@jakarta.annotation.Nullable final DateTimeColumn value) {
        this.backingStore.set("dateTime", value);
    }
    /**
     * Sets the defaultValue property value. The default value for this column.
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final DefaultColumnValue value) {
        this.backingStore.set("defaultValue", value);
    }
    /**
     * Sets the description property value. The user-facing description of the column.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The user-facing name of the column.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the enforceUniqueValues property value. If true, no two list items may have the same value for this column.
     * @param value Value to set for the enforceUniqueValues property.
     */
    public void setEnforceUniqueValues(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enforceUniqueValues", value);
    }
    /**
     * Sets the geolocation property value. This column stores a geolocation.
     * @param value Value to set for the geolocation property.
     */
    public void setGeolocation(@jakarta.annotation.Nullable final GeolocationColumn value) {
        this.backingStore.set("geolocation", value);
    }
    /**
     * Sets the hidden property value. Specifies whether the column is displayed in the user interface.
     * @param value Value to set for the hidden property.
     */
    public void setHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hidden", value);
    }
    /**
     * Sets the hyperlinkOrPicture property value. This column stores hyperlink or picture values.
     * @param value Value to set for the hyperlinkOrPicture property.
     */
    public void setHyperlinkOrPicture(@jakarta.annotation.Nullable final HyperlinkOrPictureColumn value) {
        this.backingStore.set("hyperlinkOrPicture", value);
    }
    /**
     * Sets the indexed property value. Specifies whether the column values can be used for sorting and searching.
     * @param value Value to set for the indexed property.
     */
    public void setIndexed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("indexed", value);
    }
    /**
     * Sets the isDeletable property value. Indicates whether this column can be deleted.
     * @param value Value to set for the isDeletable property.
     */
    public void setIsDeletable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDeletable", value);
    }
    /**
     * Sets the isReorderable property value. Indicates whether values in the column can be reordered. Read-only.
     * @param value Value to set for the isReorderable property.
     */
    public void setIsReorderable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isReorderable", value);
    }
    /**
     * Sets the isSealed property value. Specifies whether the column can be changed.
     * @param value Value to set for the isSealed property.
     */
    public void setIsSealed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSealed", value);
    }
    /**
     * Sets the lookup property value. This column's data is looked up from another source in the site.
     * @param value Value to set for the lookup property.
     */
    public void setLookup(@jakarta.annotation.Nullable final LookupColumn value) {
        this.backingStore.set("lookup", value);
    }
    /**
     * Sets the name property value. The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see displayName.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the number property value. This column stores number values.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final NumberColumn value) {
        this.backingStore.set("number", value);
    }
    /**
     * Sets the personOrGroup property value. This column stores Person or Group values.
     * @param value Value to set for the personOrGroup property.
     */
    public void setPersonOrGroup(@jakarta.annotation.Nullable final PersonOrGroupColumn value) {
        this.backingStore.set("personOrGroup", value);
    }
    /**
     * Sets the propagateChanges property value. If 'true', changes to this column will be propagated to lists that implement the column.
     * @param value Value to set for the propagateChanges property.
     */
    public void setPropagateChanges(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("propagateChanges", value);
    }
    /**
     * Sets the readOnly property value. Specifies whether the column values can be modified.
     * @param value Value to set for the readOnly property.
     */
    public void setReadOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("readOnly", value);
    }
    /**
     * Sets the required property value. Specifies whether the column value isn't optional.
     * @param value Value to set for the required property.
     */
    public void setRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("required", value);
    }
    /**
     * Sets the sourceColumn property value. The source column for the content type column.
     * @param value Value to set for the sourceColumn property.
     */
    public void setSourceColumn(@jakarta.annotation.Nullable final ColumnDefinition value) {
        this.backingStore.set("sourceColumn", value);
    }
    /**
     * Sets the sourceContentType property value. ContentType from which this column is inherited from. Present only in contentTypes columns response. Read-only.
     * @param value Value to set for the sourceContentType property.
     */
    public void setSourceContentType(@jakarta.annotation.Nullable final ContentTypeInfo value) {
        this.backingStore.set("sourceContentType", value);
    }
    /**
     * Sets the term property value. This column stores taxonomy terms.
     * @param value Value to set for the term property.
     */
    public void setTerm(@jakarta.annotation.Nullable final TermColumn value) {
        this.backingStore.set("term", value);
    }
    /**
     * Sets the text property value. This column stores text values.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final TextColumn value) {
        this.backingStore.set("text", value);
    }
    /**
     * Sets the thumbnail property value. This column stores thumbnail values.
     * @param value Value to set for the thumbnail property.
     */
    public void setThumbnail(@jakarta.annotation.Nullable final ThumbnailColumn value) {
        this.backingStore.set("thumbnail", value);
    }
    /**
     * Sets the type property value. For site columns, the type of column. Read-only.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final ColumnTypes value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the validation property value. This column stores validation formula and message for the column.
     * @param value Value to set for the validation property.
     */
    public void setValidation(@jakarta.annotation.Nullable final ColumnValidation value) {
        this.backingStore.set("validation", value);
    }
}
