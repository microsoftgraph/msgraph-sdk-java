package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BuiltInIdentityProvider extends IdentityProviderBase implements Parsable {
    /** The identity provider type. For a B2B scenario, possible values: AADSignup, MicrosoftAccount, EmailOTP. Required. */
    private String _identityProviderType;
    /**
     * Instantiates a new BuiltInIdentityProvider and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BuiltInIdentityProvider() {
        super();
        this.setOdataType("#microsoft.graph.builtInIdentityProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BuiltInIdentityProvider
     */
    @javax.annotation.Nonnull
    public static BuiltInIdentityProvider createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BuiltInIdentityProvider();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BuiltInIdentityProvider currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identityProviderType", (n) -> { currentObject.setIdentityProviderType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityProviderType property value. The identity provider type. For a B2B scenario, possible values: AADSignup, MicrosoftAccount, EmailOTP. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityProviderType() {
        return this._identityProviderType;
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
        writer.writeStringValue("identityProviderType", this.getIdentityProviderType());
    }
    /**
     * Sets the identityProviderType property value. The identity provider type. For a B2B scenario, possible values: AADSignup, MicrosoftAccount, EmailOTP. Required.
     * @param value Value to set for the identityProviderType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityProviderType(@javax.annotation.Nullable final String value) {
        this._identityProviderType = value;
    }
}
