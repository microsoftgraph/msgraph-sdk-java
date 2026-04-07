package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /**
     * Instantiates a new {@link ExternalAuthenticationMethodConfiguration} and sets the default values.
     */
    public ExternalAuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.externalAuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExternalAuthenticationMethodConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static ExternalAuthenticationMethodConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalAuthenticationMethodConfiguration();
    }
    /**
     * Gets the appId property value. appId for the app registration in Microsoft Entra ID representing the integration with the external provider.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the displayName property value. Display name for the external authentication method. This name is shown to users during sign-in.
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
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("includeTargets", (n) -> { this.setIncludeTargets(n.getCollectionOfObjectValues(AuthenticationMethodTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("openIdConnectSetting", (n) -> { this.setOpenIdConnectSetting(n.getObjectValue(OpenIdConnectSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. A collection of groups that are enabled to use an authentication method as part of an authentication method policy in Microsoft Entra ID.
     * @return a {@link java.util.List<AuthenticationMethodTarget>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodTarget> getIncludeTargets() {
        return this.backingStore.get("includeTargets");
    }
    /**
     * Gets the openIdConnectSetting property value. The openIdConnectSetting property
     * @return a {@link OpenIdConnectSetting}
     */
    @jakarta.annotation.Nullable
    public OpenIdConnectSetting getOpenIdConnectSetting() {
        return this.backingStore.get("openIdConnectSetting");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeObjectValue("openIdConnectSetting", this.getOpenIdConnectSetting());
    }
    /**
     * Sets the appId property value. appId for the app registration in Microsoft Entra ID representing the integration with the external provider.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the displayName property value. Display name for the external authentication method. This name is shown to users during sign-in.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the includeTargets property value. A collection of groups that are enabled to use an authentication method as part of an authentication method policy in Microsoft Entra ID.
     * @param value Value to set for the includeTargets property.
     */
    public void setIncludeTargets(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodTarget> value) {
        this.backingStore.set("includeTargets", value);
    }
    /**
     * Sets the openIdConnectSetting property value. The openIdConnectSetting property
     * @param value Value to set for the openIdConnectSetting property.
     */
    public void setOpenIdConnectSetting(@jakarta.annotation.Nullable final OpenIdConnectSetting value) {
        this.backingStore.set("openIdConnectSetting", value);
    }
}
