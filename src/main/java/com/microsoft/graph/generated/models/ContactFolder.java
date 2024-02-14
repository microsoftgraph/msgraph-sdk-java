package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContactFolder extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ContactFolder} and sets the default values.
     */
    public ContactFolder() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContactFolder}
     */
    @jakarta.annotation.Nonnull
    public static ContactFolder createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContactFolder();
    }
    /**
     * Gets the childFolders property value. The collection of child folders in the folder. Navigation property. Read-only. Nullable.
     * @return a {@link java.util.List<ContactFolder>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContactFolder> getChildFolders() {
        return this.backingStore.get("childFolders");
    }
    /**
     * Gets the contacts property value. The contacts in the folder. Navigation property. Read-only. Nullable.
     * @return a {@link java.util.List<Contact>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Contact> getContacts() {
        return this.backingStore.get("contacts");
    }
    /**
     * Gets the displayName property value. The folder's display name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link java.util.List<MultiValueLegacyExtendedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.backingStore.get("multiValueExtendedProperties");
    }
    /**
     * Gets the parentFolderId property value. The ID of the folder's parent folder.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentFolderId() {
        return this.backingStore.get("parentFolderId");
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable.
     * @return a {@link java.util.List<SingleValueLegacyExtendedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.backingStore.get("singleValueExtendedProperties");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setChildFolders(@jakarta.annotation.Nullable final java.util.List<ContactFolder> value) {
        this.backingStore.set("childFolders", value);
    }
    /**
     * Sets the contacts property value. The contacts in the folder. Navigation property. Read-only. Nullable.
     * @param value Value to set for the contacts property.
     */
    public void setContacts(@jakarta.annotation.Nullable final java.util.List<Contact> value) {
        this.backingStore.set("contacts", value);
    }
    /**
     * Sets the displayName property value. The folder's display name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     */
    public void setMultiValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.backingStore.set("multiValueExtendedProperties", value);
    }
    /**
     * Sets the parentFolderId property value. The ID of the folder's parent folder.
     * @param value Value to set for the parentFolderId property.
     */
    public void setParentFolderId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentFolderId", value);
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     */
    public void setSingleValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.backingStore.set("singleValueExtendedProperties", value);
    }
}
