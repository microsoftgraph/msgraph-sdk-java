package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftAuthenticatorAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /**
     * Instantiates a new {@link MicrosoftAuthenticatorAuthenticationMethodConfiguration} and sets the default values.
     */
    public MicrosoftAuthenticatorAuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.microsoftAuthenticatorAuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MicrosoftAuthenticatorAuthenticationMethodConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftAuthenticatorAuthenticationMethodConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAuthenticatorAuthenticationMethodConfiguration();
    }
    /**
     * Gets the featureSettings property value. A collection of Microsoft Authenticator settings such as application context and location context, and whether they are enabled for all users or specific users only.
     * @return a {@link MicrosoftAuthenticatorFeatureSettings}
     */
    @jakarta.annotation.Nullable
    public MicrosoftAuthenticatorFeatureSettings getFeatureSettings() {
        return this.backingStore.get("featureSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("featureSettings", (n) -> { this.setFeatureSettings(n.getObjectValue(MicrosoftAuthenticatorFeatureSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("includeTargets", (n) -> { this.setIncludeTargets(n.getCollectionOfObjectValues(MicrosoftAuthenticatorAuthenticationMethodTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("isSoftwareOathEnabled", (n) -> { this.setIsSoftwareOathEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. A collection of groups that are enabled to use the authentication method. Expanded by default.
     * @return a {@link java.util.List<MicrosoftAuthenticatorAuthenticationMethodTarget>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MicrosoftAuthenticatorAuthenticationMethodTarget> getIncludeTargets() {
        return this.backingStore.get("includeTargets");
    }
    /**
     * Gets the isSoftwareOathEnabled property value. The isSoftwareOathEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSoftwareOathEnabled() {
        return this.backingStore.get("isSoftwareOathEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("featureSettings", this.getFeatureSettings());
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeBooleanValue("isSoftwareOathEnabled", this.getIsSoftwareOathEnabled());
    }
    /**
     * Sets the featureSettings property value. A collection of Microsoft Authenticator settings such as application context and location context, and whether they are enabled for all users or specific users only.
     * @param value Value to set for the featureSettings property.
     */
    public void setFeatureSettings(@jakarta.annotation.Nullable final MicrosoftAuthenticatorFeatureSettings value) {
        this.backingStore.set("featureSettings", value);
    }
    /**
     * Sets the includeTargets property value. A collection of groups that are enabled to use the authentication method. Expanded by default.
     * @param value Value to set for the includeTargets property.
     */
    public void setIncludeTargets(@jakarta.annotation.Nullable final java.util.List<MicrosoftAuthenticatorAuthenticationMethodTarget> value) {
        this.backingStore.set("includeTargets", value);
    }
    /**
     * Sets the isSoftwareOathEnabled property value. The isSoftwareOathEnabled property
     * @param value Value to set for the isSoftwareOathEnabled property.
     */
    public void setIsSoftwareOathEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSoftwareOathEnabled", value);
    }
}
