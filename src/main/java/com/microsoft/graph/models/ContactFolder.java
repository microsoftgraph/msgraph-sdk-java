package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContactFolder extends Entity implements Parsable {
    /** The collection of child folders in the folder. Navigation property. Read-only. Nullable. */
    private java.util.List<ContactFolder> _childFolders;
    /** The contacts in the folder. Navigation property. Read-only. Nullable. */
    private java.util.List<Contact> _contacts;
    /** The folder's display name. */
    private String _displayName;
    /** The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable. */
    private java.util.List<MultiValueLegacyExtendedProperty> _multiValueExtendedProperties;
    /** The ID of the folder's parent folder. */
    private String _parentFolderId;
    /** The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable. */
    private java.util.List<SingleValueLegacyExtendedProperty> _singleValueExtendedProperties;
    /**
     * Instantiates a new contactFolder and sets the default values.
     * @return a void
     */
    public ContactFolder() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a contactFolder
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
        return this._childFolders;
    }
    /**
     * Gets the contacts property value. The contacts in the folder. Navigation property. Read-only. Nullable.
     * @return a contact
     */
    @javax.annotation.Nullable
    public java.util.List<Contact> getContacts() {
        return this._contacts;
    }
    /**
     * Gets the displayName property value. The folder's display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ContactFolder currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("childFolders", (n) -> { currentObject.setChildFolders(n.getCollectionOfObjectValues(ContactFolder::createFromDiscriminatorValue)); });
            this.put("contacts", (n) -> { currentObject.setContacts(n.getCollectionOfObjectValues(Contact::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("multiValueExtendedProperties", (n) -> { currentObject.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
            this.put("parentFolderId", (n) -> { currentObject.setParentFolderId(n.getStringValue()); });
            this.put("singleValueExtendedProperties", (n) -> { currentObject.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this._multiValueExtendedProperties;
    }
    /**
     * Gets the parentFolderId property value. The ID of the folder's parent folder.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentFolderId() {
        return this._parentFolderId;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this._singleValueExtendedProperties;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setChildFolders(@javax.annotation.Nullable final java.util.List<ContactFolder> value) {
        this._childFolders = value;
    }
    /**
     * Sets the contacts property value. The contacts in the folder. Navigation property. Read-only. Nullable.
     * @param value Value to set for the contacts property.
     * @return a void
     */
    public void setContacts(@javax.annotation.Nullable final java.util.List<Contact> value) {
        this._contacts = value;
    }
    /**
     * Sets the displayName property value. The folder's display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this._multiValueExtendedProperties = value;
    }
    /**
     * Sets the parentFolderId property value. The ID of the folder's parent folder.
     * @param value Value to set for the parentFolderId property.
     * @return a void
     */
    public void setParentFolderId(@javax.annotation.Nullable final String value) {
        this._parentFolderId = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this._singleValueExtendedProperties = value;
    }
}
