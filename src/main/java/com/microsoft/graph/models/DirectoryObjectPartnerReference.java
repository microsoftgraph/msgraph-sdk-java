package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DirectoryObjectPartnerReference extends DirectoryObject implements Parsable {
    /** Description of the object returned. Read-only. */
    private String _description;
    /** Name of directory object being returned, like group or application. Read-only. */
    private String _displayName;
    /** The tenant identifier for the partner tenant. Read-only. */
    private String _externalPartnerTenantId;
    /** The type of the referenced object in the partner tenant. Read-only. */
    private String _objectType;
    /**
     * Instantiates a new DirectoryObjectPartnerReference and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryObjectPartnerReference() {
        super();
        this.setOdataType("#microsoft.graph.directoryObjectPartnerReference");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DirectoryObjectPartnerReference
     */
    @javax.annotation.Nonnull
    public static DirectoryObjectPartnerReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectoryObjectPartnerReference();
    }
    /**
     * Gets the description property value. Description of the object returned. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Name of directory object being returned, like group or application. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the externalPartnerTenantId property value. The tenant identifier for the partner tenant. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalPartnerTenantId() {
        return this._externalPartnerTenantId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DirectoryObjectPartnerReference currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalPartnerTenantId", (n) -> { currentObject.setExternalPartnerTenantId(n.getStringValue()); });
        deserializerMap.put("objectType", (n) -> { currentObject.setObjectType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the objectType property value. The type of the referenced object in the partner tenant. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObjectType() {
        return this._objectType;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalPartnerTenantId", this.getExternalPartnerTenantId());
        writer.writeStringValue("objectType", this.getObjectType());
    }
    /**
     * Sets the description property value. Description of the object returned. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Name of directory object being returned, like group or application. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the externalPartnerTenantId property value. The tenant identifier for the partner tenant. Read-only.
     * @param value Value to set for the externalPartnerTenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalPartnerTenantId(@javax.annotation.Nullable final String value) {
        this._externalPartnerTenantId = value;
    }
    /**
     * Sets the objectType property value. The type of the referenced object in the partner tenant. Read-only.
     * @param value Value to set for the objectType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setObjectType(@javax.annotation.Nullable final String value) {
        this._objectType = value;
    }
}
