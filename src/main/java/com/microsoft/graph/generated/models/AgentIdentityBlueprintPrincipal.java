package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentIdentityBlueprintPrincipal extends ServicePrincipal implements Parsable {
    /**
     * Instantiates a new {@link AgentIdentityBlueprintPrincipal} and sets the default values.
     */
    public AgentIdentityBlueprintPrincipal() {
        super();
        this.setOdataType("#microsoft.graph.agentIdentityBlueprintPrincipal");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentIdentityBlueprintPrincipal}
     */
    @jakarta.annotation.Nonnull
    public static AgentIdentityBlueprintPrincipal createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentIdentityBlueprintPrincipal();
    }
    /**
     * Gets the createdByAppId property value. The appId of the application that created this agent identity blueprint principal. Set internally by Microsoft Entra ID. Read-only. Inherited from servicePrincipal.
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
        deserializerMap.put("sponsors", (n) -> { this.setSponsors(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sponsors property value. The sponsors for this agent identity blueprint principal. Sponsors are users or service principals who can authorize and manage the lifecycle of agent identity instances.
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
        writer.writeCollectionOfObjectValues("sponsors", this.getSponsors());
    }
    /**
     * Sets the createdByAppId property value. The appId of the application that created this agent identity blueprint principal. Set internally by Microsoft Entra ID. Read-only. Inherited from servicePrincipal.
     * @param value Value to set for the createdByAppId property.
     */
    public void setCreatedByAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdByAppId", value);
    }
    /**
     * Sets the sponsors property value. The sponsors for this agent identity blueprint principal. Sponsors are users or service principals who can authorize and manage the lifecycle of agent identity instances.
     * @param value Value to set for the sponsors property.
     */
    public void setSponsors(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("sponsors", value);
    }
}
