package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthContext extends SignInContext implements Parsable {
    /**
     * Instantiates a new {@link AuthContext} and sets the default values.
     */
    public AuthContext() {
        super();
        this.setOdataType("#microsoft.graph.authContext");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthContext}
     */
    @jakarta.annotation.Nonnull
    public static AuthContext createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthContext();
    }
    /**
     * Gets the authenticationContextValue property value. Supported values are c1 through c99.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationContextValue() {
        return this.backingStore.get("authenticationContextValue");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationContextValue", (n) -> { this.setAuthenticationContextValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("authenticationContextValue", this.getAuthenticationContextValue());
    }
    /**
     * Sets the authenticationContextValue property value. Supported values are c1 through c99.
     * @param value Value to set for the authenticationContextValue property.
     */
    public void setAuthenticationContextValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticationContextValue", value);
    }
}
