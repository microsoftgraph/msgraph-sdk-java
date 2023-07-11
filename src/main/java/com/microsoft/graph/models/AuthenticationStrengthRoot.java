package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationStrengthRoot extends Entity implements Parsable {
    /**
     * Names and descriptions of all valid authentication method modes in the system.
     */
    private java.util.List<AuthenticationMethodModeDetail> authenticationMethodModes;
    /**
     * The combinations property
     */
    private java.util.List<AuthenticationMethodModes> combinations;
    /**
     * A collection of authentication strength policies that exist for this tenant, including both built-in and custom policies.
     */
    private java.util.List<AuthenticationStrengthPolicy> policies;
    /**
     * Instantiates a new authenticationStrengthRoot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationStrengthRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationStrengthRoot
     */
    @javax.annotation.Nonnull
    public static AuthenticationStrengthRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationStrengthRoot();
    }
    /**
     * Gets the authenticationMethodModes property value. Names and descriptions of all valid authentication method modes in the system.
     * @return a authenticationMethodModeDetail
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodModeDetail> getAuthenticationMethodModes() {
        return this.authenticationMethodModes;
    }
    /**
     * Gets the combinations property value. The combinations property
     * @return a authenticationMethodModes
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getCombinations() {
        return this.combinations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethodModes", (n) -> { this.setAuthenticationMethodModes(n.getCollectionOfObjectValues(AuthenticationMethodModeDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("combinations", (n) -> { this.setCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes.class)); });
        deserializerMap.put("policies", (n) -> { this.setPolicies(n.getCollectionOfObjectValues(AuthenticationStrengthPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policies property value. A collection of authentication strength policies that exist for this tenant, including both built-in and custom policies.
     * @return a authenticationStrengthPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationStrengthPolicy> getPolicies() {
        return this.policies;
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
        writer.writeCollectionOfObjectValues("authenticationMethodModes", this.getAuthenticationMethodModes());
        writer.writeCollectionOfEnumValues("combinations", this.getCombinations());
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
    }
    /**
     * Sets the authenticationMethodModes property value. Names and descriptions of all valid authentication method modes in the system.
     * @param value Value to set for the authenticationMethodModes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethodModes(@javax.annotation.Nullable final java.util.List<AuthenticationMethodModeDetail> value) {
        this.authenticationMethodModes = value;
    }
    /**
     * Sets the combinations property value. The combinations property
     * @param value Value to set for the combinations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCombinations(@javax.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this.combinations = value;
    }
    /**
     * Sets the policies property value. A collection of authentication strength policies that exist for this tenant, including both built-in and custom policies.
     * @param value Value to set for the policies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicies(@javax.annotation.Nullable final java.util.List<AuthenticationStrengthPolicy> value) {
        this.policies = value;
    }
}
