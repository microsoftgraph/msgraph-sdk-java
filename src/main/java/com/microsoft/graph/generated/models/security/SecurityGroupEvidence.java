package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityGroupEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link SecurityGroupEvidence} and sets the default values.
     */
    public SecurityGroupEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.securityGroupEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SecurityGroupEvidence}
     */
    @jakarta.annotation.Nonnull
    public static SecurityGroupEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityGroupEvidence();
    }
    /**
     * Gets the displayName property value. The name of the security group.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("securityGroupId", (n) -> { this.setSecurityGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the securityGroupId property value. Unique identifier of the security group.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecurityGroupId() {
        return this.backingStore.get("securityGroupId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("securityGroupId", this.getSecurityGroupId());
    }
    /**
     * Sets the displayName property value. The name of the security group.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the securityGroupId property value. Unique identifier of the security group.
     * @param value Value to set for the securityGroupId property.
     */
    public void setSecurityGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("securityGroupId", value);
    }
}
