package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationStrengthRoot extends Entity implements Parsable {
    /**
     * Instantiates a new AuthenticationStrengthRoot and sets the default values.
     */
    public AuthenticationStrengthRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationStrengthRoot
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationStrengthRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationStrengthRoot();
    }
    /**
     * Gets the authenticationMethodModes property value. Names and descriptions of all valid authentication method modes in the system.
     * @return a java.util.List<AuthenticationMethodModeDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodModeDetail> getAuthenticationMethodModes() {
        return this.BackingStore.get("authenticationMethodModes");
    }
    /**
     * Gets the combinations property value. The combinations property
     * @return a java.util.List<AuthenticationMethodModes>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getCombinations() {
        return this.BackingStore.get("combinations");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethodModes", (n) -> { this.setAuthenticationMethodModes(n.getCollectionOfObjectValues(AuthenticationMethodModeDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("combinations", (n) -> { this.setCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes.class)); });
        deserializerMap.put("policies", (n) -> { this.setPolicies(n.getCollectionOfObjectValues(AuthenticationStrengthPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policies property value. A collection of authentication strength policies that exist for this tenant, including both built-in and custom policies.
     * @return a java.util.List<AuthenticationStrengthPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationStrengthPolicy> getPolicies() {
        return this.BackingStore.get("policies");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("authenticationMethodModes", this.getAuthenticationMethodModes());
        writer.writeCollectionOfEnumValues("combinations", this.getCombinations());
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
    }
    /**
     * Sets the authenticationMethodModes property value. Names and descriptions of all valid authentication method modes in the system.
     * @param value Value to set for the authenticationMethodModes property.
     */
    public void setAuthenticationMethodModes(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodModeDetail> value) {
        this.BackingStore.set("authenticationMethodModes", value);
    }
    /**
     * Sets the combinations property value. The combinations property
     * @param value Value to set for the combinations property.
     */
    public void setCombinations(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this.BackingStore.set("combinations", value);
    }
    /**
     * Sets the policies property value. A collection of authentication strength policies that exist for this tenant, including both built-in and custom policies.
     * @param value Value to set for the policies property.
     */
    public void setPolicies(@jakarta.annotation.Nullable final java.util.List<AuthenticationStrengthPolicy> value) {
        this.BackingStore.set("policies", value);
    }
}
