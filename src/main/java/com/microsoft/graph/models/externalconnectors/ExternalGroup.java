package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreement entities. */
public class ExternalGroup extends Entity implements Parsable {
    /** The description of the external group. Optional. */
    private String _description;
    /** The friendly name of the external group. Optional. */
    private String _displayName;
    /** A member added to an externalGroup. You can add Azure Active Directory users, Azure Active Directory groups, or an externalGroup as members. */
    private java.util.List<Identity> _members;
    /**
     * Instantiates a new externalGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExternalGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a externalGroup
     */
    @javax.annotation.Nonnull
    public static ExternalGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalGroup();
    }
    /**
     * Gets the description property value. The description of the external group. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The friendly name of the external group. Optional.
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(Identity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. A member added to an externalGroup. You can add Azure Active Directory users, Azure Active Directory groups, or an externalGroup as members.
     * @return a identity
     */
    @javax.annotation.Nullable
    public java.util.List<Identity> getMembers() {
        return this._members;
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
        writer.writeCollectionOfObjectValues("members", this.getMembers());
    }
    /**
     * Sets the description property value. The description of the external group. Optional.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The friendly name of the external group. Optional.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the members property value. A member added to an externalGroup. You can add Azure Active Directory users, Azure Active Directory groups, or an externalGroup as members.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<Identity> value) {
        this._members = value;
    }
}
