package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectedOrganizationMembers extends SubjectSet implements Parsable {
    /**
     * The ID of the connected organization in entitlement management.
     */
    private String connectedOrganizationId;
    /**
     * The name of the connected organization.
     */
    private String description;
    /**
     * Instantiates a new connectedOrganizationMembers and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ConnectedOrganizationMembers() {
        super();
        this.setOdataType("#microsoft.graph.connectedOrganizationMembers");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a connectedOrganizationMembers
     */
    @jakarta.annotation.Nonnull
    public static ConnectedOrganizationMembers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectedOrganizationMembers();
    }
    /**
     * Gets the connectedOrganizationId property value. The ID of the connected organization in entitlement management.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getConnectedOrganizationId() {
        return this.connectedOrganizationId;
    }
    /**
     * Gets the description property value. The name of the connected organization.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectedOrganizationId", (n) -> { this.setConnectedOrganizationId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setConnectedOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.connectedOrganizationId = value;
    }
    /**
     * Sets the description property value. The name of the connected organization.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
}
