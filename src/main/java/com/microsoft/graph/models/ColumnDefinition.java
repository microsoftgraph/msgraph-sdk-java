package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ColumnDefinition extends Entity implements Parsable {
    /** The boolean property */
    private BooleanColumn _boolean_escaped;
    /** The calculated property */
    private CalculatedColumn _calculated;
    /** The choice property */
    private ChoiceColumn _choice;
    /** For site columns, the name of the group this column belongs to. Helps organize related columns. */
    private String _columnGroup;
    /** The contentApprovalStatus property */
    private ContentApprovalStatusColumn _contentApprovalStatus;
    /** The currency property */
    private CurrencyColumn _currency;
    /** The dateTime property */
    private DateTimeColumn _dateTime;
    /** The defaultValue property */
    private DefaultColumnValue _defaultValue;
    /** The user-facing description of the column. */
    private String _description;
    /** The user-facing name of the column. */
    private String _displayName;
    /** If true, no two list items may have the same value for this column. */
    private Boolean _enforceUniqueValues;
    /** The geolocation property */
    private GeolocationColumn _geolocation;
    /** Specifies whether the column is displayed in the user interface. */
    private Boolean _hidden;
    /** The hyperlinkOrPicture property */
    private HyperlinkOrPictureColumn _hyperlinkOrPicture;
    /** Specifies whether the column values can be used for sorting and searching. */
    private Boolean _indexed;
    /** Indicates whether this column can be deleted. */
    private Boolean _isDeletable;
    /** Indicates whether values in the column can be reordered. Read-only. */
    private Boolean _isReorderable;
    /** Specifies whether the column can be changed. */
    private Boolean _isSealed;
    /** The lookup property */
    private LookupColumn _lookup;
    /** The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see displayName. */
    private String _name;
    /** The number property */
    private NumberColumn _number;
    /** The personOrGroup property */
    private PersonOrGroupColumn _personOrGroup;
    /** If 'true', changes to this column will be propagated to lists that implement the column. */
    private Boolean _propagateChanges;
    /** Specifies whether the column values can be modified. */
    private Boolean _readOnly;
    /** Specifies whether the column value isn't optional. */
    private Boolean _required;
    /** The sourceColumn property */
    private ColumnDefinition _sourceColumn;
    /** The sourceContentType property */
    private ContentTypeInfo _sourceContentType;
    /** The term property */
    private TermColumn _term;
    /** The text property */
    private TextColumn _text;
    /** The thumbnail property */
    private ThumbnailColumn _thumbnail;
    /** The type property */
    private ColumnTypes _type;
    /** The validation property */
    private ColumnValidation _validation;
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
     * Gets the boolean property value. The boolean property
     * @return a booleanColumn
     */
    @javax.annotation.Nullable
    public BooleanColumn getBoolean() {
        return this._boolean_escaped;
    }
    /**
     * Gets the calculated property value. The calculated property
     * @return a calculatedColumn
     */
    @javax.annotation.Nullable
    public CalculatedColumn getCalculated() {
        return this._calculated;
    }
    /**
     * Gets the choice property value. The choice property
     * @return a choiceColumn
     */
    @javax.annotation.Nullable
    public ChoiceColumn getChoice() {
        return this._choice;
    }
    /**
     * Gets the columnGroup property value. For site columns, the name of the group this column belongs to. Helps organize related columns.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getColumnGroup() {
        return this._columnGroup;
    }
    /**
     * Gets the contentApprovalStatus property value. The contentApprovalStatus property
     * @return a contentApprovalStatusColumn
     */
    @javax.annotation.Nullable
    public ContentApprovalStatusColumn getContentApprovalStatus() {
        return this._contentApprovalStatus;
    }
    /**
     * Gets the currency property value. The currency property
     * @return a currencyColumn
     */
    @javax.annotation.Nullable
    public CurrencyColumn getCurrency() {
        return this._currency;
    }
    /**
     * Gets the dateTime property value. The dateTime property
     * @return a dateTimeColumn
     */
    @javax.annotation.Nullable
    public DateTimeColumn getDateTime() {
        return this._dateTime;
    }
    /**
     * Gets the defaultValue property value. The defaultValue property
     * @return a defaultColumnValue
     */
    @javax.annotation.Nullable
    public DefaultColumnValue getDefaultValue() {
        return this._defaultValue;
    }
    /**
     * Gets the description property value. The user-facing description of the column.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The user-facing name of the column.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enforceUniqueValues property value. If true, no two list items may have the same value for this column.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnforceUniqueValues() {
        return this._enforceUniqueValues;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ColumnDefinition currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("boolean", (n) -> { currentObject.setBoolean(n.getObjectValue(BooleanColumn::createFromDiscriminatorValue)); });
            this.put("calculated", (n) -> { currentObject.setCalculated(n.getObjectValue(CalculatedColumn::createFromDiscriminatorValue)); });
            this.put("choice", (n) -> { currentObject.setChoice(n.getObjectValue(ChoiceColumn::createFromDiscriminatorValue)); });
            this.put("columnGroup", (n) -> { currentObject.setColumnGroup(n.getStringValue()); });
            this.put("contentApprovalStatus", (n) -> { currentObject.setContentApprovalStatus(n.getObjectValue(ContentApprovalStatusColumn::createFromDiscriminatorValue)); });
            this.put("currency", (n) -> { currentObject.setCurrency(n.getObjectValue(CurrencyColumn::createFromDiscriminatorValue)); });
            this.put("dateTime", (n) -> { currentObject.setDateTime(n.getObjectValue(DateTimeColumn::createFromDiscriminatorValue)); });
            this.put("defaultValue", (n) -> { currentObject.setDefaultValue(n.getObjectValue(DefaultColumnValue::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enforceUniqueValues", (n) -> { currentObject.setEnforceUniqueValues(n.getBooleanValue()); });
            this.put("geolocation", (n) -> { currentObject.setGeolocation(n.getObjectValue(GeolocationColumn::createFromDiscriminatorValue)); });
            this.put("hidden", (n) -> { currentObject.setHidden(n.getBooleanValue()); });
            this.put("hyperlinkOrPicture", (n) -> { currentObject.setHyperlinkOrPicture(n.getObjectValue(HyperlinkOrPictureColumn::createFromDiscriminatorValue)); });
            this.put("indexed", (n) -> { currentObject.setIndexed(n.getBooleanValue()); });
            this.put("isDeletable", (n) -> { currentObject.setIsDeletable(n.getBooleanValue()); });
            this.put("isReorderable", (n) -> { currentObject.setIsReorderable(n.getBooleanValue()); });
            this.put("isSealed", (n) -> { currentObject.setIsSealed(n.getBooleanValue()); });
            this.put("lookup", (n) -> { currentObject.setLookup(n.getObjectValue(LookupColumn::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("number", (n) -> { currentObject.setNumber(n.getObjectValue(NumberColumn::createFromDiscriminatorValue)); });
            this.put("personOrGroup", (n) -> { currentObject.setPersonOrGroup(n.getObjectValue(PersonOrGroupColumn::createFromDiscriminatorValue)); });
            this.put("propagateChanges", (n) -> { currentObject.setPropagateChanges(n.getBooleanValue()); });
            this.put("readOnly", (n) -> { currentObject.setReadOnly(n.getBooleanValue()); });
            this.put("required", (n) -> { currentObject.setRequired(n.getBooleanValue()); });
            this.put("sourceColumn", (n) -> { currentObject.setSourceColumn(n.getObjectValue(ColumnDefinition::createFromDiscriminatorValue)); });
            this.put("sourceContentType", (n) -> { currentObject.setSourceContentType(n.getObjectValue(ContentTypeInfo::createFromDiscriminatorValue)); });
            this.put("term", (n) -> { currentObject.setTerm(n.getObjectValue(TermColumn::createFromDiscriminatorValue)); });
            this.put("text", (n) -> { currentObject.setText(n.getObjectValue(TextColumn::createFromDiscriminatorValue)); });
            this.put("thumbnail", (n) -> { currentObject.setThumbnail(n.getObjectValue(ThumbnailColumn::createFromDiscriminatorValue)); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(ColumnTypes.class)); });
            this.put("validation", (n) -> { currentObject.setValidation(n.getObjectValue(ColumnValidation::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the geolocation property value. The geolocation property
     * @return a geolocationColumn
     */
    @javax.annotation.Nullable
    public GeolocationColumn getGeolocation() {
        return this._geolocation;
    }
    /**
     * Gets the hidden property value. Specifies whether the column is displayed in the user interface.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHidden() {
        return this._hidden;
    }
    /**
     * Gets the hyperlinkOrPicture property value. The hyperlinkOrPicture property
     * @return a hyperlinkOrPictureColumn
     */
    @javax.annotation.Nullable
    public HyperlinkOrPictureColumn getHyperlinkOrPicture() {
        return this._hyperlinkOrPicture;
    }
    /**
     * Gets the indexed property value. Specifies whether the column values can be used for sorting and searching.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIndexed() {
        return this._indexed;
    }
    /**
     * Gets the isDeletable property value. Indicates whether this column can be deleted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDeletable() {
        return this._isDeletable;
    }
    /**
     * Gets the isReorderable property value. Indicates whether values in the column can be reordered. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReorderable() {
        return this._isReorderable;
    }
    /**
     * Gets the isSealed property value. Specifies whether the column can be changed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSealed() {
        return this._isSealed;
    }
    /**
     * Gets the lookup property value. The lookup property
     * @return a lookupColumn
     */
    @javax.annotation.Nullable
    public LookupColumn getLookup() {
        return this._lookup;
    }
    /**
     * Gets the name property value. The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see displayName.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the number property value. The number property
     * @return a numberColumn
     */
    @javax.annotation.Nullable
    public NumberColumn getNumber() {
        return this._number;
    }
    /**
     * Gets the personOrGroup property value. The personOrGroup property
     * @return a personOrGroupColumn
     */
    @javax.annotation.Nullable
    public PersonOrGroupColumn getPersonOrGroup() {
        return this._personOrGroup;
    }
    /**
     * Gets the propagateChanges property value. If 'true', changes to this column will be propagated to lists that implement the column.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPropagateChanges() {
        return this._propagateChanges;
    }
    /**
     * Gets the readOnly property value. Specifies whether the column values can be modified.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getReadOnly() {
        return this._readOnly;
    }
    /**
     * Gets the required property value. Specifies whether the column value isn't optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this._required;
    }
    /**
     * Gets the sourceColumn property value. The sourceColumn property
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public ColumnDefinition getSourceColumn() {
        return this._sourceColumn;
    }
    /**
     * Gets the sourceContentType property value. The sourceContentType property
     * @return a contentTypeInfo
     */
    @javax.annotation.Nullable
    public ContentTypeInfo getSourceContentType() {
        return this._sourceContentType;
    }
    /**
     * Gets the term property value. The term property
     * @return a termColumn
     */
    @javax.annotation.Nullable
    public TermColumn getTerm() {
        return this._term;
    }
    /**
     * Gets the text property value. The text property
     * @return a textColumn
     */
    @javax.annotation.Nullable
    public TextColumn getText() {
        return this._text;
    }
    /**
     * Gets the thumbnail property value. The thumbnail property
     * @return a thumbnailColumn
     */
    @javax.annotation.Nullable
    public ThumbnailColumn getThumbnail() {
        return this._thumbnail;
    }
    /**
     * Gets the type property value. The type property
     * @return a columnTypes
     */
    @javax.annotation.Nullable
    public ColumnTypes getType() {
        return this._type;
    }
    /**
     * Gets the validation property value. The validation property
     * @return a columnValidation
     */
    @javax.annotation.Nullable
    public ColumnValidation getValidation() {
        return this._validation;
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
     * Sets the boolean property value. The boolean property
     * @param value Value to set for the boolean property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBoolean(@javax.annotation.Nullable final BooleanColumn value) {
        this._boolean_escaped = value;
    }
    /**
     * Sets the calculated property value. The calculated property
     * @param value Value to set for the calculated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalculated(@javax.annotation.Nullable final CalculatedColumn value) {
        this._calculated = value;
    }
    /**
     * Sets the choice property value. The choice property
     * @param value Value to set for the choice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChoice(@javax.annotation.Nullable final ChoiceColumn value) {
        this._choice = value;
    }
    /**
     * Sets the columnGroup property value. For site columns, the name of the group this column belongs to. Helps organize related columns.
     * @param value Value to set for the columnGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumnGroup(@javax.annotation.Nullable final String value) {
        this._columnGroup = value;
    }
    /**
     * Sets the contentApprovalStatus property value. The contentApprovalStatus property
     * @param value Value to set for the contentApprovalStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentApprovalStatus(@javax.annotation.Nullable final ContentApprovalStatusColumn value) {
        this._contentApprovalStatus = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrency(@javax.annotation.Nullable final CurrencyColumn value) {
        this._currency = value;
    }
    /**
     * Sets the dateTime property value. The dateTime property
     * @param value Value to set for the dateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDateTime(@javax.annotation.Nullable final DateTimeColumn value) {
        this._dateTime = value;
    }
    /**
     * Sets the defaultValue property value. The defaultValue property
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultValue(@javax.annotation.Nullable final DefaultColumnValue value) {
        this._defaultValue = value;
    }
    /**
     * Sets the description property value. The user-facing description of the column.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The user-facing name of the column.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enforceUniqueValues property value. If true, no two list items may have the same value for this column.
     * @param value Value to set for the enforceUniqueValues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnforceUniqueValues(@javax.annotation.Nullable final Boolean value) {
        this._enforceUniqueValues = value;
    }
    /**
     * Sets the geolocation property value. The geolocation property
     * @param value Value to set for the geolocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGeolocation(@javax.annotation.Nullable final GeolocationColumn value) {
        this._geolocation = value;
    }
    /**
     * Sets the hidden property value. Specifies whether the column is displayed in the user interface.
     * @param value Value to set for the hidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHidden(@javax.annotation.Nullable final Boolean value) {
        this._hidden = value;
    }
    /**
     * Sets the hyperlinkOrPicture property value. The hyperlinkOrPicture property
     * @param value Value to set for the hyperlinkOrPicture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHyperlinkOrPicture(@javax.annotation.Nullable final HyperlinkOrPictureColumn value) {
        this._hyperlinkOrPicture = value;
    }
    /**
     * Sets the indexed property value. Specifies whether the column values can be used for sorting and searching.
     * @param value Value to set for the indexed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIndexed(@javax.annotation.Nullable final Boolean value) {
        this._indexed = value;
    }
    /**
     * Sets the isDeletable property value. Indicates whether this column can be deleted.
     * @param value Value to set for the isDeletable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDeletable(@javax.annotation.Nullable final Boolean value) {
        this._isDeletable = value;
    }
    /**
     * Sets the isReorderable property value. Indicates whether values in the column can be reordered. Read-only.
     * @param value Value to set for the isReorderable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsReorderable(@javax.annotation.Nullable final Boolean value) {
        this._isReorderable = value;
    }
    /**
     * Sets the isSealed property value. Specifies whether the column can be changed.
     * @param value Value to set for the isSealed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSealed(@javax.annotation.Nullable final Boolean value) {
        this._isSealed = value;
    }
    /**
     * Sets the lookup property value. The lookup property
     * @param value Value to set for the lookup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLookup(@javax.annotation.Nullable final LookupColumn value) {
        this._lookup = value;
    }
    /**
     * Sets the name property value. The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see displayName.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber(@javax.annotation.Nullable final NumberColumn value) {
        this._number = value;
    }
    /**
     * Sets the personOrGroup property value. The personOrGroup property
     * @param value Value to set for the personOrGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonOrGroup(@javax.annotation.Nullable final PersonOrGroupColumn value) {
        this._personOrGroup = value;
    }
    /**
     * Sets the propagateChanges property value. If 'true', changes to this column will be propagated to lists that implement the column.
     * @param value Value to set for the propagateChanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPropagateChanges(@javax.annotation.Nullable final Boolean value) {
        this._propagateChanges = value;
    }
    /**
     * Sets the readOnly property value. Specifies whether the column values can be modified.
     * @param value Value to set for the readOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReadOnly(@javax.annotation.Nullable final Boolean value) {
        this._readOnly = value;
    }
    /**
     * Sets the required property value. Specifies whether the column value isn't optional.
     * @param value Value to set for the required property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this._required = value;
    }
    /**
     * Sets the sourceColumn property value. The sourceColumn property
     * @param value Value to set for the sourceColumn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceColumn(@javax.annotation.Nullable final ColumnDefinition value) {
        this._sourceColumn = value;
    }
    /**
     * Sets the sourceContentType property value. The sourceContentType property
     * @param value Value to set for the sourceContentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceContentType(@javax.annotation.Nullable final ContentTypeInfo value) {
        this._sourceContentType = value;
    }
    /**
     * Sets the term property value. The term property
     * @param value Value to set for the term property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTerm(@javax.annotation.Nullable final TermColumn value) {
        this._term = value;
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setText(@javax.annotation.Nullable final TextColumn value) {
        this._text = value;
    }
    /**
     * Sets the thumbnail property value. The thumbnail property
     * @param value Value to set for the thumbnail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThumbnail(@javax.annotation.Nullable final ThumbnailColumn value) {
        this._thumbnail = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final ColumnTypes value) {
        this._type = value;
    }
    /**
     * Sets the validation property value. The validation property
     * @param value Value to set for the validation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValidation(@javax.annotation.Nullable final ColumnValidation value) {
        this._validation = value;
    }
}
