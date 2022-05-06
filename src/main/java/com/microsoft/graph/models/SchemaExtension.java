package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SchemaExtension extends Entity implements Parsable {
    /** Description for the schema extension. Supports $filter (eq).  */
    private String _description;
    /** The appId of the application that is the owner of the schema extension. This property can be supplied on creation, to set the owner.  If not supplied, then the calling application's appId will be set as the owner. In either case, the signed-in user must be the owner of the application. So, for example, if creating a new schema extension definition using Graph Explorer, you must supply the owner property. Once set, this property is read-only and cannot be changed. Supports $filter (eq).  */
    private String _owner;
    /** The collection of property names and types that make up the schema extension definition.  */
    private java.util.List<ExtensionSchemaProperty> _properties;
    /** The lifecycle state of the schema extension. Possible states are InDevelopment, Available, and Deprecated. Automatically set to InDevelopment on creation. Schema extensions provides more information on the possible state transitions and behaviors. Supports $filter (eq).  */
    private String _status;
    /** Set of Microsoft Graph types (that can support extensions) that the schema extension can be applied to. Select from administrativeUnit, contact, device, event, group, message, organization, post, or user.  */
    private java.util.List<String> _targetTypes;
    /**
     * Instantiates a new schemaExtension and sets the default values.
     * @return a void
     */
    public SchemaExtension() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a schemaExtension
     */
    @javax.annotation.Nonnull
    public static SchemaExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SchemaExtension();
    }
    /**
     * Gets the description property value. Description for the schema extension. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SchemaExtension currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("owner", (n) -> { currentObject.setOwner(n.getStringValue()); });
            this.put("properties", (n) -> { currentObject.setProperties(n.getCollectionOfObjectValues(ExtensionSchemaProperty::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
            this.put("targetTypes", (n) -> { currentObject.setTargetTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the owner property value. The appId of the application that is the owner of the schema extension. This property can be supplied on creation, to set the owner.  If not supplied, then the calling application's appId will be set as the owner. In either case, the signed-in user must be the owner of the application. So, for example, if creating a new schema extension definition using Graph Explorer, you must supply the owner property. Once set, this property is read-only and cannot be changed. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwner() {
        return this._owner;
    }
    /**
     * Gets the properties property value. The collection of property names and types that make up the schema extension definition.
     * @return a extensionSchemaProperty
     */
    @javax.annotation.Nullable
    public java.util.List<ExtensionSchemaProperty> getProperties() {
        return this._properties;
    }
    /**
     * Gets the status property value. The lifecycle state of the schema extension. Possible states are InDevelopment, Available, and Deprecated. Automatically set to InDevelopment on creation. Schema extensions provides more information on the possible state transitions and behaviors. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Gets the targetTypes property value. Set of Microsoft Graph types (that can support extensions) that the schema extension can be applied to. Select from administrativeUnit, contact, device, event, group, message, organization, post, or user.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTargetTypes() {
        return this._targetTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeCollectionOfObjectValues("properties", this.getProperties());
        writer.writeStringValue("status", this.getStatus());
        writer.writeCollectionOfPrimitiveValues("targetTypes", this.getTargetTypes());
    }
    /**
     * Sets the description property value. Description for the schema extension. Supports $filter (eq).
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the owner property value. The appId of the application that is the owner of the schema extension. This property can be supplied on creation, to set the owner.  If not supplied, then the calling application's appId will be set as the owner. In either case, the signed-in user must be the owner of the application. So, for example, if creating a new schema extension definition using Graph Explorer, you must supply the owner property. Once set, this property is read-only and cannot be changed. Supports $filter (eq).
     * @param value Value to set for the owner property.
     * @return a void
     */
    public void setOwner(@javax.annotation.Nullable final String value) {
        this._owner = value;
    }
    /**
     * Sets the properties property value. The collection of property names and types that make up the schema extension definition.
     * @param value Value to set for the properties property.
     * @return a void
     */
    public void setProperties(@javax.annotation.Nullable final java.util.List<ExtensionSchemaProperty> value) {
        this._properties = value;
    }
    /**
     * Sets the status property value. The lifecycle state of the schema extension. Possible states are InDevelopment, Available, and Deprecated. Automatically set to InDevelopment on creation. Schema extensions provides more information on the possible state transitions and behaviors. Supports $filter (eq).
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the targetTypes property value. Set of Microsoft Graph types (that can support extensions) that the schema extension can be applied to. Select from administrativeUnit, contact, device, event, group, message, organization, post, or user.
     * @param value Value to set for the targetTypes property.
     * @return a void
     */
    public void setTargetTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._targetTypes = value;
    }
}
