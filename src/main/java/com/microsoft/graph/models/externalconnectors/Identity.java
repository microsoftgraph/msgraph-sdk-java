package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Identity extends Entity implements Parsable {
    /**
     * The type of identity. Possible values are: user or group for Azure AD identities and externalgroup for groups in an external system.
     */
    private IdentityType type;
    /**
     * Instantiates a new identity and sets the default values.
     */
    public Identity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identity
     */
    @jakarta.annotation.Nonnull
    public static Identity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Identity();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(IdentityType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the type property value. The type of identity. Possible values are: user or group for Azure AD identities and externalgroup for groups in an external system.
     * @return a identityType
     */
    @jakarta.annotation.Nullable
    public IdentityType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the type property value. The type of identity. Possible values are: user or group for Azure AD identities and externalgroup for groups in an external system.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final IdentityType value) {
        this.type = value;
    }
}
