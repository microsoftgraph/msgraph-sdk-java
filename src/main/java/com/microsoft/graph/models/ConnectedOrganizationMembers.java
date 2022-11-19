package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectedOrganizationMembers extends SubjectSet implements Parsable {
    /** The ID of the connected organization in entitlement management. */
    private String _connectedOrganizationId;
    /** The name of the connected organization. */
    private String _description;
    /**
     * Instantiates a new ConnectedOrganizationMembers and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectedOrganizationMembers() {
        super();
        this.setOdataType("#microsoft.graph.connectedOrganizationMembers");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectedOrganizationMembers
     */
    @javax.annotation.Nonnull
    public static ConnectedOrganizationMembers createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectedOrganizationMembers();
    }
    /**
     * Gets the connectedOrganizationId property value. The ID of the connected organization in entitlement management.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectedOrganizationId() {
        return this._connectedOrganizationId;
    }
    /**
     * Gets the description property value. The name of the connected organization.
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
        final ConnectedOrganizationMembers currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectedOrganizationId", (n) -> { currentObject.setConnectedOrganizationId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("connectedOrganizationId", this.getConnectedOrganizationId());
        writer.writeStringValue("description", this.getDescription());
    }
    /**
     * Sets the connectedOrganizationId property value. The ID of the connected organization in entitlement management.
     * @param value Value to set for the connectedOrganizationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectedOrganizationId(@javax.annotation.Nullable final String value) {
        this._connectedOrganizationId = value;
    }
    /**
     * Sets the description property value. The name of the connected organization.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
}
