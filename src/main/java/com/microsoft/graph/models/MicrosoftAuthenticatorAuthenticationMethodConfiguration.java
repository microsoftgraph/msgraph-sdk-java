package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftAuthenticatorAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /** A collection of Microsoft Authenticator settings such as application context and location context, and whether they are enabled for all users or specific users only. */
    private MicrosoftAuthenticatorFeatureSettings _featureSettings;
    /** A collection of users or groups who are enabled to use the authentication method. Expanded by default. */
    private java.util.List<MicrosoftAuthenticatorAuthenticationMethodTarget> _includeTargets;
    /**
     * Instantiates a new MicrosoftAuthenticatorAuthenticationMethodConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftAuthenticatorAuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.microsoftAuthenticatorAuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftAuthenticatorAuthenticationMethodConfiguration
     */
    @javax.annotation.Nonnull
    public static MicrosoftAuthenticatorAuthenticationMethodConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAuthenticatorAuthenticationMethodConfiguration();
    }
    /**
     * Gets the featureSettings property value. A collection of Microsoft Authenticator settings such as application context and location context, and whether they are enabled for all users or specific users only.
     * @return a microsoftAuthenticatorFeatureSettings
     */
    @javax.annotation.Nullable
    public MicrosoftAuthenticatorFeatureSettings getFeatureSettings() {
        return this._featureSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MicrosoftAuthenticatorAuthenticationMethodConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("featureSettings", (n) -> { currentObject.setFeatureSettings(n.getObjectValue(MicrosoftAuthenticatorFeatureSettings::createFromDiscriminatorValue)); });
            this.put("includeTargets", (n) -> { currentObject.setIncludeTargets(n.getCollectionOfObjectValues(MicrosoftAuthenticatorAuthenticationMethodTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the includeTargets property value. A collection of users or groups who are enabled to use the authentication method. Expanded by default.
     * @return a microsoftAuthenticatorAuthenticationMethodTarget
     */
    @javax.annotation.Nullable
    public java.util.List<MicrosoftAuthenticatorAuthenticationMethodTarget> getIncludeTargets() {
        return this._includeTargets;
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
        writer.writeObjectValue("featureSettings", this.getFeatureSettings());
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
    }
    /**
     * Sets the featureSettings property value. A collection of Microsoft Authenticator settings such as application context and location context, and whether they are enabled for all users or specific users only.
     * @param value Value to set for the featureSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeatureSettings(@javax.annotation.Nullable final MicrosoftAuthenticatorFeatureSettings value) {
        this._featureSettings = value;
    }
    /**
     * Sets the includeTargets property value. A collection of users or groups who are enabled to use the authentication method. Expanded by default.
     * @param value Value to set for the includeTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeTargets(@javax.annotation.Nullable final java.util.List<MicrosoftAuthenticatorAuthenticationMethodTarget> value) {
        this._includeTargets = value;
    }
}
