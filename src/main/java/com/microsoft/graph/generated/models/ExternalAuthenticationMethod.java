package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /**
     * Instantiates a new {@link ExternalAuthenticationMethod} and sets the default values.
     */
    public ExternalAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.externalAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExternalAuthenticationMethod}
     */
    @jakarta.annotation.Nonnull
    public static ExternalAuthenticationMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalAuthenticationMethod();
    }
    /**
     * Gets the configurationId property value. A unique identifier used to manage the external auth method within Microsoft Entra ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConfigurationId() {
        return this.backingStore.get("configurationId");
    }
    /**
     * Gets the displayName property value. Custom name given to the registered external MFA.
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
        deserializerMap.put("configurationId", (n) -> { this.setConfigurationId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("configurationId", this.getConfigurationId());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the configurationId property value. A unique identifier used to manage the external auth method within Microsoft Entra ID.
     * @param value Value to set for the configurationId property.
     */
    public void setConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("configurationId", value);
    }
    /**
     * Sets the displayName property value. Custom name given to the registered external MFA.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
}
