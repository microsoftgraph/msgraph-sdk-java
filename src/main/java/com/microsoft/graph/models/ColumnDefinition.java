package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ColumnDefinition extends Entity implements Parsable {
    /** This column stores boolean values. */
    private BooleanColumn booleanEscaped;
    /** This column's data is calculated based on other columns. */
    private CalculatedColumn calculated;
    /** This column stores data from a list of choices. */
    private ChoiceColumn choice;
    /** For site columns, the name of the group this column belongs to. Helps organize related columns. */
    private String columnGroup;
    /** This column stores content approval status. */
    private ContentApprovalStatusColumn contentApprovalStatus;
    /** This column stores currency values. */
    private CurrencyColumn currency;
    /** This column stores DateTime values. */
    private DateTimeColumn dateTime;
    /** The default value for this column. */
    private DefaultColumnValue defaultValue;
    /** The user-facing description of the column. */
    private String description;
    /** The user-facing name of the column. */
    private String displayName;
    /** If true, no two list items may have the same value for this column. */
    private Boolean enforceUniqueValues;
    /** This column stores a geolocation. */
    private GeolocationColumn geolocation;
    /** Specifies whether the column is displayed in the user interface. */
    private Boolean hidden;
    /** This column stores hyperlink or picture values. */
    private HyperlinkOrPictureColumn hyperlinkOrPicture;
    /** Specifies whether the column values can be used for sorting and searching. */
    private Boolean indexed;
    /** Indicates whether this column can be deleted. */
    private Boolean isDeletable;
    /** Indicates whether values in the column can be reordered. Read-only. */
    private Boolean isReorderable;
    /** Specifies whether the column can be changed. */
    private Boolean isSealed;
    /** This column's data is looked up from another source in the site. */
    private LookupColumn lookup;
    /** The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see displayName. */
    private String name;
    /** This column stores number values. */
    private NumberColumn number;
    /** This column stores Person or Group values. */
    private PersonOrGroupColumn personOrGroup;
    /** If 'true', changes to this column will be propagated to lists that implement the column. */
    private Boolean propagateChanges;
    /** Specifies whether the column values can be modified. */
    private Boolean readOnly;
    /** Specifies whether the column value isn't optional. */
    private Boolean required;
    /** The source column for the content type column. */
    private ColumnDefinition sourceColumn;
    /** ContentType from which this column is inherited from. Present only in contentTypes columns response. Read-only. */
    private ContentTypeInfo sourceContentType;
    /** This column stores taxonomy terms. */
    private TermColumn term;
    /** This column stores text values. */
    private TextColumn text;
    /** This column stores thumbnail values. */
    private ThumbnailColumn thumbnail;
    /** For site columns, the type of column. Read-only. */
    private ColumnTypes type;
    /** This column stores validation formula and message for the column. */
    private ColumnValidation validation;
    /**
     * Instantiates a new columnDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ColumnDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a columnDefinition
     */
    @javax.annotation.Nonnull
    public static ColumnDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ColumnDefinition();
    }
    /**
     * Gets the boolean property value. This column stores boolean values.
     * @return a booleanColumn
     */
    @javax.annotation.Nullable
    public BooleanColumn getBoolean() {
        return this.booleanEscaped;
    }
    /**
     * Gets the calculated property value. This column's data is calculated based on other columns.
     * @return a calculatedColumn
     */
    @javax.annotation.Nullable
    public CalculatedColumn getCalculated() {
        return this.calculated;
    }
    /**
     * Gets the choice property value. This column stores data from a list of choices.
     * @return a choiceColumn
     */
    @javax.annotation.Nullable
    public ChoiceColumn getChoice() {
        return this.choice;
    }
    /**
     * Gets the columnGroup property value. For site columns, the name of the group this column belongs to. Helps organize related columns.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getColumnGroup() {
        return this.columnGroup;
    }
    /**
     * Gets the contentApprovalStatus property value. This column stores content approval status.
     * @return a contentApprovalStatusColumn
     */
    @javax.annotation.Nullable
    public ContentApprovalStatusColumn getContentApprovalStatus() {
        return this.contentApprovalStatus;
    }
    /**
     * Gets the currency property value. This column stores currency values.
     * @return a currencyColumn
     */
    @javax.annotation.Nullable
    public CurrencyColumn getCurrency() {
        return this.currency;
    }
    /**
     * Gets the dateTime property value. This column stores DateTime values.
     * @return a dateTimeColumn
     */
    @javax.annotation.Nullable
    public DateTimeColumn getDateTime() {
        return this.dateTime;
    }
    /**
     * Gets the defaultValue property value. The default value for this column.
     * @return a defaultColumnValue
     */
    @javax.annotation.Nullable
    public DefaultColumnValue getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * Gets the description property value. The user-facing description of the column.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The user-facing name of the column.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the enforceUniqueValues property value. If true, no two list items may have the same value for this column.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnforceUniqueValues() {
        return this.enforceUniqueValues;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a geolocationColumn
     */
    @javax.annotation.Nullable
    public GeolocationColumn getGeolocation() {
        return this.geolocation;
    }
    /**
     * Gets the hidden property value. Specifies whether the column is displayed in the user interface.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHidden() {
        return this.hidden;
    }
    /**
     * Gets the hyperlinkOrPicture property value. This column stores hyperlink or picture values.
     * @return a hyperlinkOrPictureColumn
     */
    @javax.annotation.Nullable
    public HyperlinkOrPictureColumn getHyperlinkOrPicture() {
        return this.hyperlinkOrPicture;
    }
    /**
     * Gets the indexed property value. Specifies whether the column values can be used for sorting and searching.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIndexed() {
        return this.indexed;
    }
    /**
     * Gets the isDeletable property value. Indicates whether this column can be deleted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDeletable() {
        return this.isDeletable;
    }
    /**
     * Gets the isReorderable property value. Indicates whether values in the column can be reordered. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReorderable() {
        return this.isReorderable;
    }
    /**
     * Gets the isSealed property value. Specifies whether the column can be changed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSealed() {
        return this.isSealed;
    }
    /**
     * Gets the lookup property value. This column's data is looked up from another source in the site.
     * @return a lookupColumn
     */
    @javax.annotation.Nullable
    public LookupColumn getLookup() {
        return this.lookup;
    }
    /**
     * Gets the name property value. The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see displayName.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the number property value. This column stores number values.
     * @return a numberColumn
     */
    @javax.annotation.Nullable
    public NumberColumn getNumber() {
        return this.number;
    }
    /**
     * Gets the personOrGroup property value. This column stores Person or Group values.
     * @return a personOrGroupColumn
     */
    @javax.annotation.Nullable
    public PersonOrGroupColumn getPersonOrGroup() {
        return this.personOrGroup;
    }
    /**
     * Gets the propagateChanges property value. If 'true', changes to this column will be propagated to lists that implement the column.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPropagateChanges() {
        return this.propagateChanges;
    }
    /**
     * Gets the readOnly property value. Specifies whether the column values can be modified.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getReadOnly() {
        return this.readOnly;
    }
    /**
     * Gets the required property value. Specifies whether the column value isn't optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this.required;
    }
    /**
     * Gets the sourceColumn property value. The source column for the content type column.
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public ColumnDefinition getSourceColumn() {
        return this.sourceColumn;
    }
    /**
     * Gets the sourceContentType property value. ContentType from which this column is inherited from. Present only in contentTypes columns response. Read-only.
     * @return a contentTypeInfo
     */
    @javax.annotation.Nullable
    public ContentTypeInfo getSourceContentType() {
        return this.sourceContentType;
    }
    /**
     * Gets the term property value. This column stores taxonomy terms.
     * @return a termColumn
     */
    @javax.annotation.Nullable
    public TermColumn getTerm() {
        return this.term;
    }
    /**
     * Gets the text property value. This column stores text values.
     * @return a textColumn
     */
    @javax.annotation.Nullable
    public TextColumn getText() {
        return this.text;
    }
    /**
     * Gets the thumbnail property value. This column stores thumbnail values.
     * @return a thumbnailColumn
     */
    @javax.annotation.Nullable
    public ThumbnailColumn getThumbnail() {
        return this.thumbnail;
    }
    /**
     * Gets the type property value. For site columns, the type of column. Read-only.
     * @return a columnTypes
     */
    @javax.annotation.Nullable
    public ColumnTypes getType() {
        return this.type;
    }
    /**
     * Gets the validation property value. This column stores validation formula and message for the column.
     * @return a columnValidation
     */
    @javax.annotation.Nullable
    public ColumnValidation getValidation() {
        return this.validation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBoolean(@javax.annotation.Nullable final BooleanColumn value) {
        this.booleanEscaped = value;
    }
    /**
     * Sets the calculated property value. This column's data is calculated based on other columns.
     * @param value Value to set for the calculated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalculated(@javax.annotation.Nullable final CalculatedColumn value) {
        this.calculated = value;
    }
    /**
     * Sets the choice property value. This column stores data from a list of choices.
     * @param value Value to set for the choice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChoice(@javax.annotation.Nullable final ChoiceColumn value) {
        this.choice = value;
    }
    /**
     * Sets the columnGroup property value. For site columns, the name of the group this column belongs to. Helps organize related columns.
     * @param value Value to set for the columnGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumnGroup(@javax.annotation.Nullable final String value) {
        this.columnGroup = value;
    }
    /**
     * Sets the contentApprovalStatus property value. This column stores content approval status.
     * @param value Value to set for the contentApprovalStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentApprovalStatus(@javax.annotation.Nullable final ContentApprovalStatusColumn value) {
        this.contentApprovalStatus = value;
    }
    /**
     * Sets the currency property value. This column stores currency values.
     * @param value Value to set for the currency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrency(@javax.annotation.Nullable final CurrencyColumn value) {
        this.currency = value;
    }
    /**
     * Sets the dateTime property value. This column stores DateTime values.
     * @param value Value to set for the dateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDateTime(@javax.annotation.Nullable final DateTimeColumn value) {
        this.dateTime = value;
    }
    /**
     * Sets the defaultValue property value. The default value for this column.
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultValue(@javax.annotation.Nullable final DefaultColumnValue value) {
        this.defaultValue = value;
    }
    /**
     * Sets the description property value. The user-facing description of the column.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The user-facing name of the column.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the enforceUniqueValues property value. If true, no two list items may have the same value for this column.
     * @param value Value to set for the enforceUniqueValues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnforceUniqueValues(@javax.annotation.Nullable final Boolean value) {
        this.enforceUniqueValues = value;
    }
    /**
     * Sets the geolocation property value. This column stores a geolocation.
     * @param value Value to set for the geolocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGeolocation(@javax.annotation.Nullable final GeolocationColumn value) {
        this.geolocation = value;
    }
    /**
     * Sets the hidden property value. Specifies whether the column is displayed in the user interface.
     * @param value Value to set for the hidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHidden(@javax.annotation.Nullable final Boolean value) {
        this.hidden = value;
    }
    /**
     * Sets the hyperlinkOrPicture property value. This column stores hyperlink or picture values.
     * @param value Value to set for the hyperlinkOrPicture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHyperlinkOrPicture(@javax.annotation.Nullable final HyperlinkOrPictureColumn value) {
        this.hyperlinkOrPicture = value;
    }
    /**
     * Sets the indexed property value. Specifies whether the column values can be used for sorting and searching.
     * @param value Value to set for the indexed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIndexed(@javax.annotation.Nullable final Boolean value) {
        this.indexed = value;
    }
    /**
     * Sets the isDeletable property value. Indicates whether this column can be deleted.
     * @param value Value to set for the isDeletable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDeletable(@javax.annotation.Nullable final Boolean value) {
        this.isDeletable = value;
    }
    /**
     * Sets the isReorderable property value. Indicates whether values in the column can be reordered. Read-only.
     * @param value Value to set for the isReorderable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsReorderable(@javax.annotation.Nullable final Boolean value) {
        this.isReorderable = value;
    }
    /**
     * Sets the isSealed property value. Specifies whether the column can be changed.
     * @param value Value to set for the isSealed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSealed(@javax.annotation.Nullable final Boolean value) {
        this.isSealed = value;
    }
    /**
     * Sets the lookup property value. This column's data is looked up from another source in the site.
     * @param value Value to set for the lookup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLookup(@javax.annotation.Nullable final LookupColumn value) {
        this.lookup = value;
    }
    /**
     * Sets the name property value. The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see displayName.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the number property value. This column stores number values.
     * @param value Value to set for the number property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber(@javax.annotation.Nullable final NumberColumn value) {
        this.number = value;
    }
    /**
     * Sets the personOrGroup property value. This column stores Person or Group values.
     * @param value Value to set for the personOrGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonOrGroup(@javax.annotation.Nullable final PersonOrGroupColumn value) {
        this.personOrGroup = value;
    }
    /**
     * Sets the propagateChanges property value. If 'true', changes to this column will be propagated to lists that implement the column.
     * @param value Value to set for the propagateChanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPropagateChanges(@javax.annotation.Nullable final Boolean value) {
        this.propagateChanges = value;
    }
    /**
     * Sets the readOnly property value. Specifies whether the column values can be modified.
     * @param value Value to set for the readOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReadOnly(@javax.annotation.Nullable final Boolean value) {
        this.readOnly = value;
    }
    /**
     * Sets the required property value. Specifies whether the column value isn't optional.
     * @param value Value to set for the required property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this.required = value;
    }
    /**
     * Sets the sourceColumn property value. The source column for the content type column.
     * @param value Value to set for the sourceColumn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceColumn(@javax.annotation.Nullable final ColumnDefinition value) {
        this.sourceColumn = value;
    }
    /**
     * Sets the sourceContentType property value. ContentType from which this column is inherited from. Present only in contentTypes columns response. Read-only.
     * @param value Value to set for the sourceContentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceContentType(@javax.annotation.Nullable final ContentTypeInfo value) {
        this.sourceContentType = value;
    }
    /**
     * Sets the term property value. This column stores taxonomy terms.
     * @param value Value to set for the term property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTerm(@javax.annotation.Nullable final TermColumn value) {
        this.term = value;
    }
    /**
     * Sets the text property value. This column stores text values.
     * @param value Value to set for the text property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setText(@javax.annotation.Nullable final TextColumn value) {
        this.text = value;
    }
    /**
     * Sets the thumbnail property value. This column stores thumbnail values.
     * @param value Value to set for the thumbnail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThumbnail(@javax.annotation.Nullable final ThumbnailColumn value) {
        this.thumbnail = value;
    }
    /**
     * Sets the type property value. For site columns, the type of column. Read-only.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final ColumnTypes value) {
        this.type = value;
    }
    /**
     * Sets the validation property value. This column stores validation formula and message for the column.
     * @param value Value to set for the validation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValidation(@javax.annotation.Nullable final ColumnValidation value) {
        this.validation = value;
    }
}
