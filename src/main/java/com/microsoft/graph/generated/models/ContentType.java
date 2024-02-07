package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentType extends Entity implements Parsable {
    /**
     * Instantiates a new ContentType and sets the default values.
     */
    public ContentType() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ContentType
     */
    @jakarta.annotation.Nonnull
    public static ContentType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentType();
    }
    /**
     * Gets the associatedHubsUrls property value. List of canonical URLs for hub sites with which this content type is associated to. This will contain all hub sites where this content type is queued to be enforced or is already enforced. Enforcing a content type means that the content type will be applied to the lists in the enforced sites.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssociatedHubsUrls() {
        return this.backingStore.get("associatedHubsUrls");
    }
    /**
     * Gets the base property value. Parent contentType from which this content type is derived.
     * @return a ContentType
     */
    @jakarta.annotation.Nullable
    public ContentType getBase() {
        return this.backingStore.get("base");
    }
    /**
     * Gets the baseTypes property value. The collection of content types that are ancestors of this content type.
     * @return a java.util.List<ContentType>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentType> getBaseTypes() {
        return this.backingStore.get("baseTypes");
    }
    /**
     * Gets the columnLinks property value. The collection of columns that are required by this content type.
     * @return a java.util.List<ColumnLink>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ColumnLink> getColumnLinks() {
        return this.backingStore.get("columnLinks");
    }
    /**
     * Gets the columnPositions property value. Column order information in a content type.
     * @return a java.util.List<ColumnDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ColumnDefinition> getColumnPositions() {
        return this.backingStore.get("columnPositions");
    }
    /**
     * Gets the columns property value. The collection of column definitions for this contentType.
     * @return a java.util.List<ColumnDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ColumnDefinition> getColumns() {
        return this.backingStore.get("columns");
    }
    /**
     * Gets the description property value. The descriptive text for the item.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the documentSet property value. Document Set metadata.
     * @return a DocumentSet
     */
    @jakarta.annotation.Nullable
    public DocumentSet getDocumentSet() {
        return this.backingStore.get("documentSet");
    }
    /**
     * Gets the documentTemplate property value. Document template metadata. To make sure that documents have consistent content across a site and its subsites, you can associate a Word, Excel, or PowerPoint template with a site content type.
     * @return a DocumentSetContent
     */
    @jakarta.annotation.Nullable
    public DocumentSetContent getDocumentTemplate() {
        return this.backingStore.get("documentTemplate");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associatedHubsUrls", (n) -> { this.setAssociatedHubsUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("base", (n) -> { this.setBase(n.getObjectValue(ContentType::createFromDiscriminatorValue)); });
        deserializerMap.put("baseTypes", (n) -> { this.setBaseTypes(n.getCollectionOfObjectValues(ContentType::createFromDiscriminatorValue)); });
        deserializerMap.put("columnLinks", (n) -> { this.setColumnLinks(n.getCollectionOfObjectValues(ColumnLink::createFromDiscriminatorValue)); });
        deserializerMap.put("columnPositions", (n) -> { this.setColumnPositions(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("columns", (n) -> { this.setColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("documentSet", (n) -> { this.setDocumentSet(n.getObjectValue(DocumentSet::createFromDiscriminatorValue)); });
        deserializerMap.put("documentTemplate", (n) -> { this.setDocumentTemplate(n.getObjectValue(DocumentSetContent::createFromDiscriminatorValue)); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getStringValue()); });
        deserializerMap.put("hidden", (n) -> { this.setHidden(n.getBooleanValue()); });
        deserializerMap.put("inheritedFrom", (n) -> { this.setInheritedFrom(n.getObjectValue(ItemReference::createFromDiscriminatorValue)); });
        deserializerMap.put("isBuiltIn", (n) -> { this.setIsBuiltIn(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("order", (n) -> { this.setOrder(n.getObjectValue(ContentTypeOrder::createFromDiscriminatorValue)); });
        deserializerMap.put("parentId", (n) -> { this.setParentId(n.getStringValue()); });
        deserializerMap.put("propagateChanges", (n) -> { this.setPropagateChanges(n.getBooleanValue()); });
        deserializerMap.put("readOnly", (n) -> { this.setReadOnly(n.getBooleanValue()); });
        deserializerMap.put("sealed", (n) -> { this.setSealed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. The name of the group this content type belongs to. Helps organize related content types.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroup() {
        return this.backingStore.get("group");
    }
    /**
     * Gets the hidden property value. Indicates whether the content type is hidden in the list's 'New' menu.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHidden() {
        return this.backingStore.get("hidden");
    }
    /**
     * Gets the inheritedFrom property value. If this content type is inherited from another scope (like a site), provides a reference to the item where the content type is defined.
     * @return a ItemReference
     */
    @jakarta.annotation.Nullable
    public ItemReference getInheritedFrom() {
        return this.backingStore.get("inheritedFrom");
    }
    /**
     * Gets the isBuiltIn property value. Specifies if a content type is a built-in content type.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this.backingStore.get("isBuiltIn");
    }
    /**
     * Gets the name property value. The name of the content type.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the order property value. Specifies the order in which the content type appears in the selection UI.
     * @return a ContentTypeOrder
     */
    @jakarta.annotation.Nullable
    public ContentTypeOrder getOrder() {
        return this.backingStore.get("order");
    }
    /**
     * Gets the parentId property value. The unique identifier of the content type.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getParentId() {
        return this.backingStore.get("parentId");
    }
    /**
     * Gets the propagateChanges property value. If true, any changes made to the content type will be pushed to inherited content types and lists that implement the content type.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPropagateChanges() {
        return this.backingStore.get("propagateChanges");
    }
    /**
     * Gets the readOnly property value. If true, the content type can't be modified unless this value is first set to false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getReadOnly() {
        return this.backingStore.get("readOnly");
    }
    /**
     * Gets the sealed property value. If true, the content type can't be modified by users or through push-down operations. Only site collection administrators can seal or unseal content types.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSealed() {
        return this.backingStore.get("sealed");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the associatedHubsUrls property value. List of canonical URLs for hub sites with which this content type is associated to. This will contain all hub sites where this content type is queued to be enforced or is already enforced. Enforcing a content type means that the content type will be applied to the lists in the enforced sites.
     * @param value Value to set for the associatedHubsUrls property.
     */
    public void setAssociatedHubsUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("associatedHubsUrls", value);
    }
    /**
     * Sets the base property value. Parent contentType from which this content type is derived.
     * @param value Value to set for the base property.
     */
    public void setBase(@jakarta.annotation.Nullable final ContentType value) {
        this.backingStore.set("base", value);
    }
    /**
     * Sets the baseTypes property value. The collection of content types that are ancestors of this content type.
     * @param value Value to set for the baseTypes property.
     */
    public void setBaseTypes(@jakarta.annotation.Nullable final java.util.List<ContentType> value) {
        this.backingStore.set("baseTypes", value);
    }
    /**
     * Sets the columnLinks property value. The collection of columns that are required by this content type.
     * @param value Value to set for the columnLinks property.
     */
    public void setColumnLinks(@jakarta.annotation.Nullable final java.util.List<ColumnLink> value) {
        this.backingStore.set("columnLinks", value);
    }
    /**
     * Sets the columnPositions property value. Column order information in a content type.
     * @param value Value to set for the columnPositions property.
     */
    public void setColumnPositions(@jakarta.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this.backingStore.set("columnPositions", value);
    }
    /**
     * Sets the columns property value. The collection of column definitions for this contentType.
     * @param value Value to set for the columns property.
     */
    public void setColumns(@jakarta.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this.backingStore.set("columns", value);
    }
    /**
     * Sets the description property value. The descriptive text for the item.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the documentSet property value. Document Set metadata.
     * @param value Value to set for the documentSet property.
     */
    public void setDocumentSet(@jakarta.annotation.Nullable final DocumentSet value) {
        this.backingStore.set("documentSet", value);
    }
    /**
     * Sets the documentTemplate property value. Document template metadata. To make sure that documents have consistent content across a site and its subsites, you can associate a Word, Excel, or PowerPoint template with a site content type.
     * @param value Value to set for the documentTemplate property.
     */
    public void setDocumentTemplate(@jakarta.annotation.Nullable final DocumentSetContent value) {
        this.backingStore.set("documentTemplate", value);
    }
    /**
     * Sets the group property value. The name of the group this content type belongs to. Helps organize related content types.
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("group", value);
    }
    /**
     * Sets the hidden property value. Indicates whether the content type is hidden in the list's 'New' menu.
     * @param value Value to set for the hidden property.
     */
    public void setHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hidden", value);
    }
    /**
     * Sets the inheritedFrom property value. If this content type is inherited from another scope (like a site), provides a reference to the item where the content type is defined.
     * @param value Value to set for the inheritedFrom property.
     */
    public void setInheritedFrom(@jakarta.annotation.Nullable final ItemReference value) {
        this.backingStore.set("inheritedFrom", value);
    }
    /**
     * Sets the isBuiltIn property value. Specifies if a content type is a built-in content type.
     * @param value Value to set for the isBuiltIn property.
     */
    public void setIsBuiltIn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBuiltIn", value);
    }
    /**
     * Sets the name property value. The name of the content type.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the order property value. Specifies the order in which the content type appears in the selection UI.
     * @param value Value to set for the order property.
     */
    public void setOrder(@jakarta.annotation.Nullable final ContentTypeOrder value) {
        this.backingStore.set("order", value);
    }
    /**
     * Sets the parentId property value. The unique identifier of the content type.
     * @param value Value to set for the parentId property.
     */
    public void setParentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentId", value);
    }
    /**
     * Sets the propagateChanges property value. If true, any changes made to the content type will be pushed to inherited content types and lists that implement the content type.
     * @param value Value to set for the propagateChanges property.
     */
    public void setPropagateChanges(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("propagateChanges", value);
    }
    /**
     * Sets the readOnly property value. If true, the content type can't be modified unless this value is first set to false.
     * @param value Value to set for the readOnly property.
     */
    public void setReadOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("readOnly", value);
    }
    /**
     * Sets the sealed property value. If true, the content type can't be modified by users or through push-down operations. Only site collection administrators can seal or unseal content types.
     * @param value Value to set for the sealed property.
     */
    public void setSealed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("sealed", value);
    }
}
