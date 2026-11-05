package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A read-only snapshot of one explicit Governance assignee. Inherited id and displayName are the source identifier and resolved name, or null when unavailable. Identifier meaning depends on principalType and does not imply a resolvable directory-object URL. Openness is inherited from identity; the producer returns only the documented fields, never raw owner objects.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotPackageRequestPrincipal extends Identity implements Parsable {
    /**
     * Instantiates a new {@link CopilotPackageRequestPrincipal} and sets the default values.
     */
    public CopilotPackageRequestPrincipal() {
        super();
        this.setOdataType("#microsoft.graph.copilotPackageRequestPrincipal");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotPackageRequestPrincipal}
     */
    @jakarta.annotation.Nonnull
    public static CopilotPackageRequestPrincipal createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotPackageRequestPrincipal();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("principalType", (n) -> { this.setPrincipalType(n.getEnumValue(CopilotPackageRequestPrincipalType::forValue)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the principalType property value. The principalType property
     * @return a {@link CopilotPackageRequestPrincipalType}
     */
    @jakarta.annotation.Nullable
    public CopilotPackageRequestPrincipalType getPrincipalType() {
        return this.backingStore.get("principalType");
    }
    /**
     * Gets the userPrincipalName property value. The actual userPrincipalName returned by Governance for user or agentUser principals. Null when unavailable and for other principal kinds. Never inferred from an email address or creator identity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("principalType", this.getPrincipalType());
    }
    /**
     * Sets the principalType property value. The principalType property
     * @param value Value to set for the principalType property.
     */
    public void setPrincipalType(@jakarta.annotation.Nullable final CopilotPackageRequestPrincipalType value) {
        this.backingStore.set("principalType", value);
    }
    /**
     * Sets the userPrincipalName property value. The actual userPrincipalName returned by Governance for user or agentUser principals. Null when unavailable and for other principal kinds. Never inferred from an email address or creator identity.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
