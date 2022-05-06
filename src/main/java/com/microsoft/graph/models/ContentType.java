package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContentType extends Entity implements Parsable {
    /** List of canonical URLs for hub sites with which this content type is associated to. This will contain all hubsites where this content type is queued to be enforced or is already enforced. Enforcing a content type means that the content type will be applied to the lists in the enforced sites.  */
    private java.util.List<String> _associatedHubsUrls;
    /** Parent contentType from which this content type is derived.  */
    private ContentType _base;
    /** The collection of content types that are ancestors of this content type.  */
    private java.util.List<ContentType> _baseTypes;
    /** The collection of columns that are required by this content type  */
    private java.util.List<ColumnLink> _columnLinks;
    /** Column order information in a content type.  */
    private java.util.List<ColumnDefinition> _columnPositions;
    /** The collection of column definitions for this contentType.  */
    private java.util.List<ColumnDefinition> _columns;
    /** The descriptive text for the item.  */
    private String _description;
    /** Document Set metadata.  */
    private DocumentSet _documentSet;
    /** Document template metadata. To make sure that documents have consistent content across a site and its subsites, you can associate a Word, Excel, or PowerPoint template with a site content type.  */
    private DocumentSetContent _documentTemplate;
    /** The name of the group this content type belongs to. Helps organize related content types.  */
    private String _group;
    /** Indicates whether the content type is hidden in the list's 'New' menu.  */
    private Boolean _hidden;
    /** If this content type is inherited from another scope (like a site), provides a reference to the item where the content type is defined.  */
    private ItemReference _inheritedFrom;
    /** Specifies if a content type is a built-in content type.  */
    private Boolean _isBuiltIn;
    /** The name of the content type.  */
    private String _name;
    /** Specifies the order in which the content type appears in the selection UI.  */
    private ContentTypeOrder _order;
    /** The unique identifier of the content type.  */
    private String _parentId;
    /** If true, any changes made to the content type will be pushed to inherited content types and lists that implement the content type.  */
    private Boolean _propagateChanges;
    /** If true, the content type cannot be modified unless this value is first set to false.  */
    private Boolean _readOnly;
    /** If true, the content type cannot be modified by users or through push-down operations. Only site collection administrators can seal or unseal content types.  */
    private Boolean _sealed;
    /**
     * Instantiates a new contentType and sets the default values.
     * @return a void
     */
    public ContentType() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a contentType
     */
    @javax.annotation.Nonnull
    public static ContentType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentType();
    }
    /**
     * Gets the associatedHubsUrls property value. List of canonical URLs for hub sites with which this content type is associated to. This will contain all hubsites where this content type is queued to be enforced or is already enforced. Enforcing a content type means that the content type will be applied to the lists in the enforced sites.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAssociatedHubsUrls() {
        return this._associatedHubsUrls;
    }
    /**
     * Gets the base property value. Parent contentType from which this content type is derived.
     * @return a contentType
     */
    @javax.annotation.Nullable
    public ContentType getBase() {
        return this._base;
    }
    /**
     * Gets the baseTypes property value. The collection of content types that are ancestors of this content type.
     * @return a contentType
     */
    @javax.annotation.Nullable
    public java.util.List<ContentType> getBaseTypes() {
        return this._baseTypes;
    }
    /**
     * Gets the columnLinks property value. The collection of columns that are required by this content type
     * @return a columnLink
     */
    @javax.annotation.Nullable
    public java.util.List<ColumnLink> getColumnLinks() {
        return this._columnLinks;
    }
    /**
     * Gets the columnPositions property value. Column order information in a content type.
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<ColumnDefinition> getColumnPositions() {
        return this._columnPositions;
    }
    /**
     * Gets the columns property value. The collection of column definitions for this contentType.
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<ColumnDefinition> getColumns() {
        return this._columns;
    }
    /**
     * Gets the description property value. The descriptive text for the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the documentSet property value. Document Set metadata.
     * @return a documentSet
     */
    @javax.annotation.Nullable
    public DocumentSet getDocumentSet() {
        return this._documentSet;
    }
    /**
     * Gets the documentTemplate property value. Document template metadata. To make sure that documents have consistent content across a site and its subsites, you can associate a Word, Excel, or PowerPoint template with a site content type.
     * @return a documentSetContent
     */
    @javax.annotation.Nullable
    public DocumentSetContent getDocumentTemplate() {
        return this._documentTemplate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ContentType currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("associatedHubsUrls", (n) -> { currentObject.setAssociatedHubsUrls(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("base", (n) -> { currentObject.setBase(n.getObjectValue(ContentType::createFromDiscriminatorValue)); });
            this.put("baseTypes", (n) -> { currentObject.setBaseTypes(n.getCollectionOfObjectValues(ContentType::createFromDiscriminatorValue)); });
            this.put("columnLinks", (n) -> { currentObject.setColumnLinks(n.getCollectionOfObjectValues(ColumnLink::createFromDiscriminatorValue)); });
            this.put("columnPositions", (n) -> { currentObject.setColumnPositions(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
            this.put("columns", (n) -> { currentObject.setColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("documentSet", (n) -> { currentObject.setDocumentSet(n.getObjectValue(DocumentSet::createFromDiscriminatorValue)); });
            this.put("documentTemplate", (n) -> { currentObject.setDocumentTemplate(n.getObjectValue(DocumentSetContent::createFromDiscriminatorValue)); });
            this.put("group", (n) -> { currentObject.setGroup(n.getStringValue()); });
            this.put("hidden", (n) -> { currentObject.setHidden(n.getBooleanValue()); });
            this.put("inheritedFrom", (n) -> { currentObject.setInheritedFrom(n.getObjectValue(ItemReference::createFromDiscriminatorValue)); });
            this.put("isBuiltIn", (n) -> { currentObject.setIsBuiltIn(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("order", (n) -> { currentObject.setOrder(n.getObjectValue(ContentTypeOrder::createFromDiscriminatorValue)); });
            this.put("parentId", (n) -> { currentObject.setParentId(n.getStringValue()); });
            this.put("propagateChanges", (n) -> { currentObject.setPropagateChanges(n.getBooleanValue()); });
            this.put("readOnly", (n) -> { currentObject.setReadOnly(n.getBooleanValue()); });
            this.put("sealed", (n) -> { currentObject.setSealed(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the group property value. The name of the group this content type belongs to. Helps organize related content types.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroup() {
        return this._group;
    }
    /**
     * Gets the hidden property value. Indicates whether the content type is hidden in the list's 'New' menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHidden() {
        return this._hidden;
    }
    /**
     * Gets the inheritedFrom property value. If this content type is inherited from another scope (like a site), provides a reference to the item where the content type is defined.
     * @return a itemReference
     */
    @javax.annotation.Nullable
    public ItemReference getInheritedFrom() {
        return this._inheritedFrom;
    }
    /**
     * Gets the isBuiltIn property value. Specifies if a content type is a built-in content type.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this._isBuiltIn;
    }
    /**
     * Gets the name property value. The name of the content type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the order property value. Specifies the order in which the content type appears in the selection UI.
     * @return a contentTypeOrder
     */
    @javax.annotation.Nullable
    public ContentTypeOrder getOrder() {
        return this._order;
    }
    /**
     * Gets the parentId property value. The unique identifier of the content type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentId() {
        return this._parentId;
    }
    /**
     * Gets the propagateChanges property value. If true, any changes made to the content type will be pushed to inherited content types and lists that implement the content type.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPropagateChanges() {
        return this._propagateChanges;
    }
    /**
     * Gets the readOnly property value. If true, the content type cannot be modified unless this value is first set to false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getReadOnly() {
        return this._readOnly;
    }
    /**
     * Gets the sealed property value. If true, the content type cannot be modified by users or through push-down operations. Only site collection administrators can seal or unseal content types.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSealed() {
        return this._sealed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("associatedHubsUrls", this.getAssociatedHubsUrls());
        writer.writeObjectValue("base", this.getBase());
        writer.writeCollectionOfObjectValues("baseTypes", this.getBaseTypes());
        writer.writeCollectionOfObjectValues("columnLinks", this.getColumnLinks());
        writer.writeCollectionOfObjectValues("columnPositions", this.getColumnPositions());
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("documentSet", this.getDocumentSet());
        writer.writeObjectValue("documentTemplate", this.getDocumentTemplate());
        writer.writeStringValue("group", this.getGroup());
        writer.writeBooleanValue("hidden", this.getHidden());
        writer.writeObjectValue("inheritedFrom", this.getInheritedFrom());
        writer.writeBooleanValue("isBuiltIn", this.getIsBuiltIn());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("order", this.getOrder());
        writer.writeStringValue("parentId", this.getParentId());
        writer.writeBooleanValue("propagateChanges", this.getPropagateChanges());
        writer.writeBooleanValue("readOnly", this.getReadOnly());
        writer.writeBooleanValue("sealed", this.getSealed());
    }
    /**
     * Sets the associatedHubsUrls property value. List of canonical URLs for hub sites with which this content type is associated to. This will contain all hubsites where this content type is queued to be enforced or is already enforced. Enforcing a content type means that the content type will be applied to the lists in the enforced sites.
     * @param value Value to set for the associatedHubsUrls property.
     * @return a void
     */
    public void setAssociatedHubsUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._associatedHubsUrls = value;
    }
    /**
     * Sets the base property value. Parent contentType from which this content type is derived.
     * @param value Value to set for the base property.
     * @return a void
     */
    public void setBase(@javax.annotation.Nullable final ContentType value) {
        this._base = value;
    }
    /**
     * Sets the baseTypes property value. The collection of content types that are ancestors of this content type.
     * @param value Value to set for the baseTypes property.
     * @return a void
     */
    public void setBaseTypes(@javax.annotation.Nullable final java.util.List<ContentType> value) {
        this._baseTypes = value;
    }
    /**
     * Sets the columnLinks property value. The collection of columns that are required by this content type
     * @param value Value to set for the columnLinks property.
     * @return a void
     */
    public void setColumnLinks(@javax.annotation.Nullable final java.util.List<ColumnLink> value) {
        this._columnLinks = value;
    }
    /**
     * Sets the columnPositions property value. Column order information in a content type.
     * @param value Value to set for the columnPositions property.
     * @return a void
     */
    public void setColumnPositions(@javax.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this._columnPositions = value;
    }
    /**
     * Sets the columns property value. The collection of column definitions for this contentType.
     * @param value Value to set for the columns property.
     * @return a void
     */
    public void setColumns(@javax.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this._columns = value;
    }
    /**
     * Sets the description property value. The descriptive text for the item.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the documentSet property value. Document Set metadata.
     * @param value Value to set for the documentSet property.
     * @return a void
     */
    public void setDocumentSet(@javax.annotation.Nullable final DocumentSet value) {
        this._documentSet = value;
    }
    /**
     * Sets the documentTemplate property value. Document template metadata. To make sure that documents have consistent content across a site and its subsites, you can associate a Word, Excel, or PowerPoint template with a site content type.
     * @param value Value to set for the documentTemplate property.
     * @return a void
     */
    public void setDocumentTemplate(@javax.annotation.Nullable final DocumentSetContent value) {
        this._documentTemplate = value;
    }
    /**
     * Sets the group property value. The name of the group this content type belongs to. Helps organize related content types.
     * @param value Value to set for the group property.
     * @return a void
     */
    public void setGroup(@javax.annotation.Nullable final String value) {
        this._group = value;
    }
    /**
     * Sets the hidden property value. Indicates whether the content type is hidden in the list's 'New' menu.
     * @param value Value to set for the hidden property.
     * @return a void
     */
    public void setHidden(@javax.annotation.Nullable final Boolean value) {
        this._hidden = value;
    }
    /**
     * Sets the inheritedFrom property value. If this content type is inherited from another scope (like a site), provides a reference to the item where the content type is defined.
     * @param value Value to set for the inheritedFrom property.
     * @return a void
     */
    public void setInheritedFrom(@javax.annotation.Nullable final ItemReference value) {
        this._inheritedFrom = value;
    }
    /**
     * Sets the isBuiltIn property value. Specifies if a content type is a built-in content type.
     * @param value Value to set for the isBuiltIn property.
     * @return a void
     */
    public void setIsBuiltIn(@javax.annotation.Nullable final Boolean value) {
        this._isBuiltIn = value;
    }
    /**
     * Sets the name property value. The name of the content type.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the order property value. Specifies the order in which the content type appears in the selection UI.
     * @param value Value to set for the order property.
     * @return a void
     */
    public void setOrder(@javax.annotation.Nullable final ContentTypeOrder value) {
        this._order = value;
    }
    /**
     * Sets the parentId property value. The unique identifier of the content type.
     * @param value Value to set for the parentId property.
     * @return a void
     */
    public void setParentId(@javax.annotation.Nullable final String value) {
        this._parentId = value;
    }
    /**
     * Sets the propagateChanges property value. If true, any changes made to the content type will be pushed to inherited content types and lists that implement the content type.
     * @param value Value to set for the propagateChanges property.
     * @return a void
     */
    public void setPropagateChanges(@javax.annotation.Nullable final Boolean value) {
        this._propagateChanges = value;
    }
    /**
     * Sets the readOnly property value. If true, the content type cannot be modified unless this value is first set to false.
     * @param value Value to set for the readOnly property.
     * @return a void
     */
    public void setReadOnly(@javax.annotation.Nullable final Boolean value) {
        this._readOnly = value;
    }
    /**
     * Sets the sealed property value. If true, the content type cannot be modified by users or through push-down operations. Only site collection administrators can seal or unseal content types.
     * @param value Value to set for the sealed property.
     * @return a void
     */
    public void setSealed(@javax.annotation.Nullable final Boolean value) {
        this._sealed = value;
    }
}
