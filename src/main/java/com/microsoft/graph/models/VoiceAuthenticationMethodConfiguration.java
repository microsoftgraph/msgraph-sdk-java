package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VoiceAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /**
     * A collection of groups that are enabled to use the authentication method. Expanded by default.
     */
    private java.util.List<AuthenticationMethodTarget> includeTargets;
    /**
     * true if users can register office phones, otherwise, false.
     */
    private Boolean isOfficePhoneAllowed;
    /**
     * Instantiates a new voiceAuthenticationMethodConfiguration and sets the default values.
     */
    public VoiceAuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.voiceAuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a voiceAuthenticationMethodConfiguration
     */
    @jakarta.annotation.Nonnull
    public static VoiceAuthenticationMethodConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VoiceAuthenticationMethodConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("includeTargets", (n) -> { this.setIncludeTargets(n.getCollectionOfObjectValues(AuthenticationMethodTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("isOfficePhoneAllowed", (n) -> { this.setIsOfficePhoneAllowed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. A collection of groups that are enabled to use the authentication method. Expanded by default.
     * @return a authenticationMethodTarget
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodTarget> getIncludeTargets() {
        return this.includeTargets;
    }
    /**
     * Gets the isOfficePhoneAllowed property value. true if users can register office phones, otherwise, false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOfficePhoneAllowed() {
        return this.isOfficePhoneAllowed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeBooleanValue("isOfficePhoneAllowed", this.getIsOfficePhoneAllowed());
    }
    /**
     * Sets the includeTargets property value. A collection of groups that are enabled to use the authentication method. Expanded by default.
     * @param value Value to set for the includeTargets property.
     */
    public void setIncludeTargets(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodTarget> value) {
        this.includeTargets = value;
    }
    /**
     * Sets the isOfficePhoneAllowed property value. true if users can register office phones, otherwise, false.
     * @param value Value to set for the isOfficePhoneAllowed property.
     */
    public void setIsOfficePhoneAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.isOfficePhoneAllowed = value;
    }
}
