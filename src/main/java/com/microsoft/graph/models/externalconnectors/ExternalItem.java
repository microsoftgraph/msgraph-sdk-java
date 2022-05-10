package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class ExternalItem extends Entity implements Parsable {
    /** An array of access control entries. Each entry specifies the access granted to a user or group. Required. */
    private java.util.List<Acl> _acl;
    /** A plain-text  representation of the contents of the item. The text in this property is full-text indexed. Optional. */
    private ExternalItemContent _content;
    /** A property bag with the properties of the item. The properties MUST conform to the schema defined for the externalConnection. Required. */
    private Properties _properties;
    /**
     * Instantiates a new externalItem and sets the default values.
     * @return a void
     */
    public ExternalItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a externalItem
     */
    @javax.annotation.Nonnull
    public static ExternalItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalItem();
    }
    /**
     * Gets the acl property value. An array of access control entries. Each entry specifies the access granted to a user or group. Required.
     * @return a acl
     */
    @javax.annotation.Nullable
    public java.util.List<Acl> getAcl() {
        return this._acl;
    }
    /**
     * Gets the content property value. A plain-text  representation of the contents of the item. The text in this property is full-text indexed. Optional.
     * @return a externalItemContent
     */
    @javax.annotation.Nullable
    public ExternalItemContent getContent() {
        return this._content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExternalItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("acl", (n) -> { currentObject.setAcl(n.getCollectionOfObjectValues(Acl::createFromDiscriminatorValue)); });
            this.put("content", (n) -> { currentObject.setContent(n.getObjectValue(ExternalItemContent::createFromDiscriminatorValue)); });
            this.put("properties", (n) -> { currentObject.setProperties(n.getObjectValue(Properties::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the properties property value. A property bag with the properties of the item. The properties MUST conform to the schema defined for the externalConnection. Required.
     * @return a properties
     */
    @javax.annotation.Nullable
    public Properties getProperties() {
        return this._properties;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acl", this.getAcl());
        writer.writeObjectValue("content", this.getContent());
        writer.writeObjectValue("properties", this.getProperties());
    }
    /**
     * Sets the acl property value. An array of access control entries. Each entry specifies the access granted to a user or group. Required.
     * @param value Value to set for the acl property.
     * @return a void
     */
    public void setAcl(@javax.annotation.Nullable final java.util.List<Acl> value) {
        this._acl = value;
    }
    /**
     * Sets the content property value. A plain-text  representation of the contents of the item. The text in this property is full-text indexed. Optional.
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final ExternalItemContent value) {
        this._content = value;
    }
    /**
     * Sets the properties property value. A property bag with the properties of the item. The properties MUST conform to the schema defined for the externalConnection. Required.
     * @param value Value to set for the properties property.
     * @return a void
     */
    public void setProperties(@javax.annotation.Nullable final Properties value) {
        this._properties = value;
    }
}
