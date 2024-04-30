package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MultiTenantOrganizationPartnerConfigurationTemplate extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MultiTenantOrganizationPartnerConfigurationTemplate} and sets the default values.
     */
    public MultiTenantOrganizationPartnerConfigurationTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MultiTenantOrganizationPartnerConfigurationTemplate}
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantOrganizationPartnerConfigurationTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganizationPartnerConfigurationTemplate();
    }
    /**
     * Gets the automaticUserConsentSettings property value. Determines the partner-specific configuration for automatic user consent settings. Unless configured, the inboundAllowed and outboundAllowed properties are null and inherit from the default settings, which is always false.
     * @return a {@link InboundOutboundPolicyConfiguration}
     */
    @jakarta.annotation.Nullable
    public InboundOutboundPolicyConfiguration getAutomaticUserConsentSettings() {
        return this.backingStore.get("automaticUserConsentSettings");
    }
    /**
     * Gets the b2bCollaborationInbound property value. Defines your partner-specific configuration for users from other organizations accessing your resources via Microsoft Entra B2B collaboration.
     * @return a {@link CrossTenantAccessPolicyB2BSetting}
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bCollaborationInbound() {
        return this.backingStore.get("b2bCollaborationInbound");
    }
    /**
     * Gets the b2bCollaborationOutbound property value. Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Microsoft Entra B2B collaboration.
     * @return a {@link CrossTenantAccessPolicyB2BSetting}
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bCollaborationOutbound() {
        return this.backingStore.get("b2bCollaborationOutbound");
    }
    /**
     * Gets the b2bDirectConnectInbound property value. Defines your partner-specific configuration for users from other organizations accessing your resources via Azure B2B direct connect.
     * @return a {@link CrossTenantAccessPolicyB2BSetting}
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bDirectConnectInbound() {
        return this.backingStore.get("b2bDirectConnectInbound");
    }
    /**
     * Gets the b2bDirectConnectOutbound property value. Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Microsoft Entra B2B direct connect.
     * @return a {@link CrossTenantAccessPolicyB2BSetting}
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bDirectConnectOutbound() {
        return this.backingStore.get("b2bDirectConnectOutbound");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("automaticUserConsentSettings", (n) -> { this.setAutomaticUserConsentSettings(n.getObjectValue(InboundOutboundPolicyConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bCollaborationInbound", (n) -> { this.setB2bCollaborationInbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bCollaborationOutbound", (n) -> { this.setB2bCollaborationOutbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bDirectConnectInbound", (n) -> { this.setB2bDirectConnectInbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bDirectConnectOutbound", (n) -> { this.setB2bDirectConnectOutbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("inboundTrust", (n) -> { this.setInboundTrust(n.getObjectValue(CrossTenantAccessPolicyInboundTrust::createFromDiscriminatorValue)); });
        deserializerMap.put("templateApplicationLevel", (n) -> { this.setTemplateApplicationLevel(n.getEnumSetValue(TemplateApplicationLevel::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inboundTrust property value. Determines the partner-specific configuration for trusting other Conditional Access claims from external Microsoft Entra organizations.
     * @return a {@link CrossTenantAccessPolicyInboundTrust}
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyInboundTrust getInboundTrust() {
        return this.backingStore.get("inboundTrust");
    }
    /**
     * Gets the templateApplicationLevel property value. The templateApplicationLevel property
     * @return a {@link EnumSet<TemplateApplicationLevel>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<TemplateApplicationLevel> getTemplateApplicationLevel() {
        return this.backingStore.get("templateApplicationLevel");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("automaticUserConsentSettings", this.getAutomaticUserConsentSettings());
        writer.writeObjectValue("b2bCollaborationInbound", this.getB2bCollaborationInbound());
        writer.writeObjectValue("b2bCollaborationOutbound", this.getB2bCollaborationOutbound());
        writer.writeObjectValue("b2bDirectConnectInbound", this.getB2bDirectConnectInbound());
        writer.writeObjectValue("b2bDirectConnectOutbound", this.getB2bDirectConnectOutbound());
        writer.writeObjectValue("inboundTrust", this.getInboundTrust());
        writer.writeEnumSetValue("templateApplicationLevel", this.getTemplateApplicationLevel());
    }
    /**
     * Sets the automaticUserConsentSettings property value. Determines the partner-specific configuration for automatic user consent settings. Unless configured, the inboundAllowed and outboundAllowed properties are null and inherit from the default settings, which is always false.
     * @param value Value to set for the automaticUserConsentSettings property.
     */
    public void setAutomaticUserConsentSettings(@jakarta.annotation.Nullable final InboundOutboundPolicyConfiguration value) {
        this.backingStore.set("automaticUserConsentSettings", value);
    }
    /**
     * Sets the b2bCollaborationInbound property value. Defines your partner-specific configuration for users from other organizations accessing your resources via Microsoft Entra B2B collaboration.
     * @param value Value to set for the b2bCollaborationInbound property.
     */
    public void setB2bCollaborationInbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.backingStore.set("b2bCollaborationInbound", value);
    }
    /**
     * Sets the b2bCollaborationOutbound property value. Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Microsoft Entra B2B collaboration.
     * @param value Value to set for the b2bCollaborationOutbound property.
     */
    public void setB2bCollaborationOutbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.backingStore.set("b2bCollaborationOutbound", value);
    }
    /**
     * Sets the b2bDirectConnectInbound property value. Defines your partner-specific configuration for users from other organizations accessing your resources via Azure B2B direct connect.
     * @param value Value to set for the b2bDirectConnectInbound property.
     */
    public void setB2bDirectConnectInbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.backingStore.set("b2bDirectConnectInbound", value);
    }
    /**
     * Sets the b2bDirectConnectOutbound property value. Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Microsoft Entra B2B direct connect.
     * @param value Value to set for the b2bDirectConnectOutbound property.
     */
    public void setB2bDirectConnectOutbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.backingStore.set("b2bDirectConnectOutbound", value);
    }
    /**
     * Sets the inboundTrust property value. Determines the partner-specific configuration for trusting other Conditional Access claims from external Microsoft Entra organizations.
     * @param value Value to set for the inboundTrust property.
     */
    public void setInboundTrust(@jakarta.annotation.Nullable final CrossTenantAccessPolicyInboundTrust value) {
        this.backingStore.set("inboundTrust", value);
    }
    /**
     * Sets the templateApplicationLevel property value. The templateApplicationLevel property
     * @param value Value to set for the templateApplicationLevel property.
     */
    public void setTemplateApplicationLevel(@jakarta.annotation.Nullable final EnumSet<TemplateApplicationLevel> value) {
        this.backingStore.set("templateApplicationLevel", value);
    }
}
