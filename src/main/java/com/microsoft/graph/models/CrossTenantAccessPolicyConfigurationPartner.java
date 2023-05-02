package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessPolicyConfigurationPartner implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The automaticUserConsentSettings property */
    private InboundOutboundPolicyConfiguration automaticUserConsentSettings;
    /** Defines your partner-specific configuration for users from other organizations accessing your resources via Azure AD B2B collaboration. */
    private CrossTenantAccessPolicyB2BSetting b2bCollaborationInbound;
    /** Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration. */
    private CrossTenantAccessPolicyB2BSetting b2bCollaborationOutbound;
    /** Defines your partner-specific configuration for users from other organizations accessing your resources via Azure B2B direct connect. */
    private CrossTenantAccessPolicyB2BSetting b2bDirectConnectInbound;
    /** Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect. */
    private CrossTenantAccessPolicyB2BSetting b2bDirectConnectOutbound;
    /** Determines the partner-specific configuration for trusting other Conditional Access claims from external Azure AD organizations. */
    private CrossTenantAccessPolicyInboundTrust inboundTrust;
    /** Identifies whether the partner-specific configuration is a Cloud Service Provider for your organization. */
    private Boolean isServiceProvider;
    /** The OdataType property */
    private String odataType;
    /** The tenant identifier for the partner Azure AD organization. Read-only. Key. */
    private String tenantId;
    /**
     * Instantiates a new crossTenantAccessPolicyConfigurationPartner and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyConfigurationPartner() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantAccessPolicyConfigurationPartner
     */
    @javax.annotation.Nonnull
    public static CrossTenantAccessPolicyConfigurationPartner createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyConfigurationPartner();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the automaticUserConsentSettings property value. The automaticUserConsentSettings property
     * @return a inboundOutboundPolicyConfiguration
     */
    @javax.annotation.Nullable
    public InboundOutboundPolicyConfiguration getAutomaticUserConsentSettings() {
        return this.automaticUserConsentSettings;
    }
    /**
     * Gets the b2bCollaborationInbound property value. Defines your partner-specific configuration for users from other organizations accessing your resources via Azure AD B2B collaboration.
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bCollaborationInbound() {
        return this.b2bCollaborationInbound;
    }
    /**
     * Gets the b2bCollaborationOutbound property value. Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration.
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bCollaborationOutbound() {
        return this.b2bCollaborationOutbound;
    }
    /**
     * Gets the b2bDirectConnectInbound property value. Defines your partner-specific configuration for users from other organizations accessing your resources via Azure B2B direct connect.
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bDirectConnectInbound() {
        return this.b2bDirectConnectInbound;
    }
    /**
     * Gets the b2bDirectConnectOutbound property value. Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect.
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bDirectConnectOutbound() {
        return this.b2bDirectConnectOutbound;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("automaticUserConsentSettings", (n) -> { this.setAutomaticUserConsentSettings(n.getObjectValue(InboundOutboundPolicyConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bCollaborationInbound", (n) -> { this.setB2bCollaborationInbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bCollaborationOutbound", (n) -> { this.setB2bCollaborationOutbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bDirectConnectInbound", (n) -> { this.setB2bDirectConnectInbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bDirectConnectOutbound", (n) -> { this.setB2bDirectConnectOutbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("inboundTrust", (n) -> { this.setInboundTrust(n.getObjectValue(CrossTenantAccessPolicyInboundTrust::createFromDiscriminatorValue)); });
        deserializerMap.put("isServiceProvider", (n) -> { this.setIsServiceProvider(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inboundTrust property value. Determines the partner-specific configuration for trusting other Conditional Access claims from external Azure AD organizations.
     * @return a crossTenantAccessPolicyInboundTrust
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyInboundTrust getInboundTrust() {
        return this.inboundTrust;
    }
    /**
     * Gets the isServiceProvider property value. Identifies whether the partner-specific configuration is a Cloud Service Provider for your organization.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsServiceProvider() {
        return this.isServiceProvider;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the tenantId property value. The tenant identifier for the partner Azure AD organization. Read-only. Key.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("automaticUserConsentSettings", this.getAutomaticUserConsentSettings());
        writer.writeObjectValue("b2bCollaborationInbound", this.getB2bCollaborationInbound());
        writer.writeObjectValue("b2bCollaborationOutbound", this.getB2bCollaborationOutbound());
        writer.writeObjectValue("b2bDirectConnectInbound", this.getB2bDirectConnectInbound());
        writer.writeObjectValue("b2bDirectConnectOutbound", this.getB2bDirectConnectOutbound());
        writer.writeObjectValue("inboundTrust", this.getInboundTrust());
        writer.writeBooleanValue("isServiceProvider", this.getIsServiceProvider());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the automaticUserConsentSettings property value. The automaticUserConsentSettings property
     * @param value Value to set for the automaticUserConsentSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutomaticUserConsentSettings(@javax.annotation.Nullable final InboundOutboundPolicyConfiguration value) {
        this.automaticUserConsentSettings = value;
    }
    /**
     * Sets the b2bCollaborationInbound property value. Defines your partner-specific configuration for users from other organizations accessing your resources via Azure AD B2B collaboration.
     * @param value Value to set for the b2bCollaborationInbound property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setB2bCollaborationInbound(@javax.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bCollaborationInbound = value;
    }
    /**
     * Sets the b2bCollaborationOutbound property value. Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration.
     * @param value Value to set for the b2bCollaborationOutbound property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setB2bCollaborationOutbound(@javax.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bCollaborationOutbound = value;
    }
    /**
     * Sets the b2bDirectConnectInbound property value. Defines your partner-specific configuration for users from other organizations accessing your resources via Azure B2B direct connect.
     * @param value Value to set for the b2bDirectConnectInbound property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setB2bDirectConnectInbound(@javax.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bDirectConnectInbound = value;
    }
    /**
     * Sets the b2bDirectConnectOutbound property value. Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect.
     * @param value Value to set for the b2bDirectConnectOutbound property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setB2bDirectConnectOutbound(@javax.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bDirectConnectOutbound = value;
    }
    /**
     * Sets the inboundTrust property value. Determines the partner-specific configuration for trusting other Conditional Access claims from external Azure AD organizations.
     * @param value Value to set for the inboundTrust property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInboundTrust(@javax.annotation.Nullable final CrossTenantAccessPolicyInboundTrust value) {
        this.inboundTrust = value;
    }
    /**
     * Sets the isServiceProvider property value. Identifies whether the partner-specific configuration is a Cloud Service Provider for your organization.
     * @param value Value to set for the isServiceProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsServiceProvider(@javax.annotation.Nullable final Boolean value) {
        this.isServiceProvider = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the tenantId property value. The tenant identifier for the partner Azure AD organization. Read-only. Key.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
