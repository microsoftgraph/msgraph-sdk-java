package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Describes the resourceOperation resource (entity) of the Microsoft Graph API (REST), which supports Intune workflows related to role-based access control (RBAC). */
public class ResourceOperation extends Entity implements Parsable {
    /** Type of action this operation is going to perform. The actionName should be concise and limited to as few words as possible. */
    private String _actionName;
    /** Description of the resource operation. The description is used in mouse-over text for the operation when shown in the Azure Portal. */
    private String _description;
    /** Name of the Resource this operation is performed on. */
    private String _resourceName;
    /**
     * Instantiates a new resourceOperation and sets the default values.
     * @return a void
     */
    public ResourceOperation() {
        super();
        this.setOdataType("#microsoft.graph.resourceOperation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a resourceOperation
     */
    @javax.annotation.Nonnull
    public static ResourceOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceOperation();
    }
    /**
     * Gets the actionName property value. Type of action this operation is going to perform. The actionName should be concise and limited to as few words as possible.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionName() {
        return this._actionName;
    }
    /**
     * Gets the description property value. Description of the resource operation. The description is used in mouse-over text for the operation when shown in the Azure Portal.
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
        final ResourceOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("actionName", (n) -> { currentObject.setActionName(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("resourceName", (n) -> { currentObject.setResourceName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the resourceName property value. Name of the Resource this operation is performed on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceName() {
        return this._resourceName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("actionName", this.getActionName());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("resourceName", this.getResourceName());
    }
    /**
     * Sets the actionName property value. Type of action this operation is going to perform. The actionName should be concise and limited to as few words as possible.
     * @param value Value to set for the actionName property.
     * @return a void
     */
    public void setActionName(@javax.annotation.Nullable final String value) {
        this._actionName = value;
    }
    /**
     * Sets the description property value. Description of the resource operation. The description is used in mouse-over text for the operation when shown in the Azure Portal.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the resourceName property value. Name of the Resource this operation is performed on.
     * @param value Value to set for the resourceName property.
     * @return a void
     */
    public void setResourceName(@javax.annotation.Nullable final String value) {
        this._resourceName = value;
    }
}
