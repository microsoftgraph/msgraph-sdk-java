package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContactFolder extends Entity implements Parsable {
    /** The collection of child folders in the folder. Navigation property. Read-only. Nullable. */
    private java.util.List<ContactFolder> childFolders;
    /** The contacts in the folder. Navigation property. Read-only. Nullable. */
    private java.util.List<Contact> contacts;
    /** The folder's display name. */
    private String displayName;
    /** The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable. */
    private java.util.List<MultiValueLegacyExtendedProperty> multiValueExtendedProperties;
    /** The ID of the folder's parent folder. */
    private String parentFolderId;
    /** The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable. */
    private java.util.List<SingleValueLegacyExtendedProperty> singleValueExtendedProperties;
    /**
     * Instantiates a new ContactFolder and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ContactFolder() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ContactFolder
     */
    @javax.annotation.Nonnull
    public static ContactFolder createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContactFolder();
    }
    /**
     * Gets the childFolders property value. The collection of child folders in the folder. Navigation property. Read-only. Nullable.
     * @return a contactFolder
     */
    @javax.annotation.Nullable
    public java.util.List<ContactFolder> getChildFolders() {
        return this.childFolders;
    }
    /**
     * Gets the contacts property value. The contacts in the folder. Navigation property. Read-only. Nullable.
     * @return a contact
     */
    @javax.annotation.Nullable
    public java.util.List<Contact> getContacts() {
        return this.contacts;
    }
    /**
     * Gets the displayName property value. The folder's display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("childFolders", (n) -> { this.setChildFolders(n.getCollectionOfObjectValues(ContactFolder::createFromDiscriminatorValue)); });
        deserializerMap.put("contacts", (n) -> { this.setContacts(n.getCollectionOfObjectValues(Contact::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("parentFolderId", (n) -> { this.setParentFolderId(n.getStringValue()); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.multiValueExtendedProperties;
    }
    /**
     * Gets the parentFolderId property value. The ID of the folder's parent folder.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentFolderId() {
        return this.parentFolderId;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.singleValueExtendedProperties;
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
        writer.writeCollectionOfObjectValues("childFolders", this.getChildFolders());
        writer.writeCollectionOfObjectValues("contacts", this.getContacts());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeStringValue("parentFolderId", this.getParentFolderId());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
    }
    /**
     * Sets the childFolders property value. The collection of child folders in the folder. Navigation property. Read-only. Nullable.
     * @param value Value to set for the childFolders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChildFolders(@javax.annotation.Nullable final java.util.List<ContactFolder> value) {
        this.childFolders = value;
    }
    /**
     * Sets the contacts property value. The contacts in the folder. Navigation property. Read-only. Nullable.
     * @param value Value to set for the contacts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContacts(@javax.annotation.Nullable final java.util.List<Contact> value) {
        this.contacts = value;
    }
    /**
     * Sets the displayName property value. The folder's display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.multiValueExtendedProperties = value;
    }
    /**
     * Sets the parentFolderId property value. The ID of the folder's parent folder.
     * @param value Value to set for the parentFolderId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentFolderId(@javax.annotation.Nullable final String value) {
        this.parentFolderId = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.singleValueExtendedProperties = value;
    }
}
