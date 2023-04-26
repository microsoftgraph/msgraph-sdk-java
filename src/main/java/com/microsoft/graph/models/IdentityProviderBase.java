package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityProviderBase extends Entity implements Parsable {
    /** The display name of the identity provider. */
    private String displayName;
    /**
     * Instantiates a new identityProviderBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdentityProviderBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identityProviderBase
     */
    @javax.annotation.Nonnull
    public static IdentityProviderBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.appleManagedIdentityProvider": return new AppleManagedIdentityProvider();
                case "#microsoft.graph.builtInIdentityProvider": return new BuiltInIdentityProvider();
                case "#microsoft.graph.internalDomainFederation": return new InternalDomainFederation();
                case "#microsoft.graph.samlOrWsFedExternalDomainFederation": return new SamlOrWsFedExternalDomainFederation();
                case "#microsoft.graph.samlOrWsFedProvider": return new SamlOrWsFedProvider();
                case "#microsoft.graph.socialIdentityProvider": return new SocialIdentityProvider();
            }
        }
        return new IdentityProviderBase();
    }
    /**
     * Gets the displayName property value. The display name of the identity provider.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
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
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the displayName property value. The display name of the identity provider.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
}
