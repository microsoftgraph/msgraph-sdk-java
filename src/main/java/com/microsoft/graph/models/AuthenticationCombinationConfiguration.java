package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationCombinationConfiguration extends Entity implements Parsable {
    /** Which authentication method combinations this configuration applies to. Must be an allowedCombinations object that's defined for the authenticationStrengthPolicy. The only possible value for fido2combinationConfigurations is 'fido2'. */
    private java.util.List<AuthenticationMethodModes> appliesToCombinations;
    /**
     * Instantiates a new AuthenticationCombinationConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationCombinationConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationCombinationConfiguration
     */
    @javax.annotation.Nonnull
    public static AuthenticationCombinationConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.fido2CombinationConfiguration": return new Fido2CombinationConfiguration();
            }
        }
        return new AuthenticationCombinationConfiguration();
    }
    /**
     * Gets the appliesToCombinations property value. Which authentication method combinations this configuration applies to. Must be an allowedCombinations object that's defined for the authenticationStrengthPolicy. The only possible value for fido2combinationConfigurations is 'fido2'.
     * @return a authenticationMethodModes
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getAppliesToCombinations() {
        return this.appliesToCombinations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appliesToCombinations", (n) -> { this.setAppliesToCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes.class)); });
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
        writer.writeCollectionOfEnumValues("appliesToCombinations", this.getAppliesToCombinations());
    }
    /**
     * Sets the appliesToCombinations property value. Which authentication method combinations this configuration applies to. Must be an allowedCombinations object that's defined for the authenticationStrengthPolicy. The only possible value for fido2combinationConfigurations is 'fido2'.
     * @param value Value to set for the appliesToCombinations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliesToCombinations(@javax.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this.appliesToCombinations = value;
    }
}
