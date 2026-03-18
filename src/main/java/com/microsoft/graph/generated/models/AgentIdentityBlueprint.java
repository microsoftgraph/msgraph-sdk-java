package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentIdentityBlueprint extends Application implements Parsable {
    /**
     * Instantiates a new {@link AgentIdentityBlueprint} and sets the default values.
     */
    public AgentIdentityBlueprint() {
        super();
        this.setOdataType("#microsoft.graph.agentIdentityBlueprint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentIdentityBlueprint}
     */
    @jakarta.annotation.Nonnull
    public static AgentIdentityBlueprint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentIdentityBlueprint();
    }
    /**
     * Gets the createdByAppId property value. The appId of the application that created this agent identity blueprint. Set internally by Microsoft Entra ID. Read-only. Inherited from application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedByAppId() {
        return this.backingStore.get("createdByAppId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdByAppId", (n) -> { this.setCreatedByAppId(n.getStringValue()); });
        deserializerMap.put("inheritablePermissions", (n) -> { this.setInheritablePermissions(n.getCollectionOfObjectValues(InheritablePermission::createFromDiscriminatorValue)); });
        deserializerMap.put("sponsors", (n) -> { this.setSponsors(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inheritablePermissions property value. Defines scopes of a resource application that may be automatically granted to agent identities without additional consent.
     * @return a {@link java.util.List<InheritablePermission>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InheritablePermission> getInheritablePermissions() {
        return this.backingStore.get("inheritablePermissions");
    }
    /**
     * Gets the sponsors property value. The sponsors for this agent identity blueprint. Sponsors are users or groups who can authorize and manage the lifecycle of agent identity instances. Required during the create operation.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getSponsors() {
        return this.backingStore.get("sponsors");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("createdByAppId", this.getCreatedByAppId());
        writer.writeCollectionOfObjectValues("inheritablePermissions", this.getInheritablePermissions());
        writer.writeCollectionOfObjectValues("sponsors", this.getSponsors());
    }
    /**
     * Sets the createdByAppId property value. The appId of the application that created this agent identity blueprint. Set internally by Microsoft Entra ID. Read-only. Inherited from application.
     * @param value Value to set for the createdByAppId property.
     */
    public void setCreatedByAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdByAppId", value);
    }
    /**
     * Sets the inheritablePermissions property value. Defines scopes of a resource application that may be automatically granted to agent identities without additional consent.
     * @param value Value to set for the inheritablePermissions property.
     */
    public void setInheritablePermissions(@jakarta.annotation.Nullable final java.util.List<InheritablePermission> value) {
        this.backingStore.set("inheritablePermissions", value);
    }
    /**
     * Sets the sponsors property value. The sponsors for this agent identity blueprint. Sponsors are users or groups who can authorize and manage the lifecycle of agent identity instances. Required during the create operation.
     * @param value Value to set for the sponsors property.
     */
    public void setSponsors(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("sponsors", value);
    }
}
