package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessPolicyConfigurationDefault extends Entity implements Parsable {
    /**
     * Determines the default configuration for automatic user consent settings. The inboundAllowed and outboundAllowed properties are always false and cannot be updated in the default configuration. Read-only.
     */
    private InboundOutboundPolicyConfiguration automaticUserConsentSettings;
    /**
     * Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B collaboration.
     */
    private CrossTenantAccessPolicyB2BSetting b2bCollaborationInbound;
    /**
     * Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration.
     */
    private CrossTenantAccessPolicyB2BSetting b2bCollaborationOutbound;
    /**
     * Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B direct connect.
     */
    private CrossTenantAccessPolicyB2BSetting b2bDirectConnectInbound;
    /**
     * Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect.
     */
    private CrossTenantAccessPolicyB2BSetting b2bDirectConnectOutbound;
    /**
     * Determines the default configuration for trusting other Conditional Access claims from external Azure AD organizations.
     */
    private CrossTenantAccessPolicyInboundTrust inboundTrust;
    /**
     * If true, the default configuration is set to the system default configuration. If false, the default settings have been customized.
     */
    private Boolean isServiceDefault;
    /**
     * Instantiates a new crossTenantAccessPolicyConfigurationDefault and sets the default values.
     */
    public CrossTenantAccessPolicyConfigurationDefault() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantAccessPolicyConfigurationDefault
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantAccessPolicyConfigurationDefault createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyConfigurationDefault();
    }
    /**
     * Gets the automaticUserConsentSettings property value. Determines the default configuration for automatic user consent settings. The inboundAllowed and outboundAllowed properties are always false and cannot be updated in the default configuration. Read-only.
     * @return a inboundOutboundPolicyConfiguration
     */
    @jakarta.annotation.Nullable
    public InboundOutboundPolicyConfiguration getAutomaticUserConsentSettings() {
        return this.automaticUserConsentSettings;
    }
    /**
     * Gets the b2bCollaborationInbound property value. Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B collaboration.
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bCollaborationInbound() {
        return this.b2bCollaborationInbound;
    }
    /**
     * Gets the b2bCollaborationOutbound property value. Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration.
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bCollaborationOutbound() {
        return this.b2bCollaborationOutbound;
    }
    /**
     * Gets the b2bDirectConnectInbound property value. Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B direct connect.
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bDirectConnectInbound() {
        return this.b2bDirectConnectInbound;
    }
    /**
     * Gets the b2bDirectConnectOutbound property value. Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect.
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bDirectConnectOutbound() {
        return this.b2bDirectConnectOutbound;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
        deserializerMap.put("isServiceDefault", (n) -> { this.setIsServiceDefault(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inboundTrust property value. Determines the default configuration for trusting other Conditional Access claims from external Azure AD organizations.
     * @return a crossTenantAccessPolicyInboundTrust
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyInboundTrust getInboundTrust() {
        return this.inboundTrust;
    }
    /**
     * Gets the isServiceDefault property value. If true, the default configuration is set to the system default configuration. If false, the default settings have been customized.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsServiceDefault() {
        return this.isServiceDefault;
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
        writer.writeBooleanValue("isServiceDefault", this.getIsServiceDefault());
    }
    /**
     * Sets the automaticUserConsentSettings property value. Determines the default configuration for automatic user consent settings. The inboundAllowed and outboundAllowed properties are always false and cannot be updated in the default configuration. Read-only.
     * @param value Value to set for the automaticUserConsentSettings property.
     */
    public void setAutomaticUserConsentSettings(@jakarta.annotation.Nullable final InboundOutboundPolicyConfiguration value) {
        this.automaticUserConsentSettings = value;
    }
    /**
     * Sets the b2bCollaborationInbound property value. Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B collaboration.
     * @param value Value to set for the b2bCollaborationInbound property.
     */
    public void setB2bCollaborationInbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bCollaborationInbound = value;
    }
    /**
     * Sets the b2bCollaborationOutbound property value. Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration.
     * @param value Value to set for the b2bCollaborationOutbound property.
     */
    public void setB2bCollaborationOutbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bCollaborationOutbound = value;
    }
    /**
     * Sets the b2bDirectConnectInbound property value. Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B direct connect.
     * @param value Value to set for the b2bDirectConnectInbound property.
     */
    public void setB2bDirectConnectInbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bDirectConnectInbound = value;
    }
    /**
     * Sets the b2bDirectConnectOutbound property value. Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect.
     * @param value Value to set for the b2bDirectConnectOutbound property.
     */
    public void setB2bDirectConnectOutbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bDirectConnectOutbound = value;
    }
    /**
     * Sets the inboundTrust property value. Determines the default configuration for trusting other Conditional Access claims from external Azure AD organizations.
     * @param value Value to set for the inboundTrust property.
     */
    public void setInboundTrust(@jakarta.annotation.Nullable final CrossTenantAccessPolicyInboundTrust value) {
        this.inboundTrust = value;
    }
    /**
     * Sets the isServiceDefault property value. If true, the default configuration is set to the system default configuration. If false, the default settings have been customized.
     * @param value Value to set for the isServiceDefault property.
     */
    public void setIsServiceDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.isServiceDefault = value;
    }
}
