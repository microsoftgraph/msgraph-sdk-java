package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessPolicyConfigurationDefault extends Entity implements Parsable {
    /** Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B collaboration. */
    private CrossTenantAccessPolicyB2BSetting _b2bCollaborationInbound;
    /** Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration. */
    private CrossTenantAccessPolicyB2BSetting _b2bCollaborationOutbound;
    /** Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B direct connect. */
    private CrossTenantAccessPolicyB2BSetting _b2bDirectConnectInbound;
    /** Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect. */
    private CrossTenantAccessPolicyB2BSetting _b2bDirectConnectOutbound;
    /** Determines the default configuration for trusting other Conditional Access claims from external Azure AD organizations. */
    private CrossTenantAccessPolicyInboundTrust _inboundTrust;
    /** If true, the default configuration is set to the system default configuration. If false, the default settings have been customized. */
    private Boolean _isServiceDefault;
    /**
     * Instantiates a new crossTenantAccessPolicyConfigurationDefault and sets the default values.
     * @return a void
     */
    public CrossTenantAccessPolicyConfigurationDefault() {
        super();
        this.setOdataType("#microsoft.graph.crossTenantAccessPolicyConfigurationDefault");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantAccessPolicyConfigurationDefault
     */
    @javax.annotation.Nonnull
    public static CrossTenantAccessPolicyConfigurationDefault createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyConfigurationDefault();
    }
    /**
     * Gets the b2bCollaborationInbound property value. Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B collaboration.
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bCollaborationInbound() {
        return this._b2bCollaborationInbound;
    }
    /**
     * Gets the b2bCollaborationOutbound property value. Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration.
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bCollaborationOutbound() {
        return this._b2bCollaborationOutbound;
    }
    /**
     * Gets the b2bDirectConnectInbound property value. Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B direct connect.
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bDirectConnectInbound() {
        return this._b2bDirectConnectInbound;
    }
    /**
     * Gets the b2bDirectConnectOutbound property value. Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect.
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bDirectConnectOutbound() {
        return this._b2bDirectConnectOutbound;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CrossTenantAccessPolicyConfigurationDefault currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("b2bCollaborationInbound", (n) -> { currentObject.setB2bCollaborationInbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
            this.put("b2bCollaborationOutbound", (n) -> { currentObject.setB2bCollaborationOutbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
            this.put("b2bDirectConnectInbound", (n) -> { currentObject.setB2bDirectConnectInbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
            this.put("b2bDirectConnectOutbound", (n) -> { currentObject.setB2bDirectConnectOutbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
            this.put("inboundTrust", (n) -> { currentObject.setInboundTrust(n.getObjectValue(CrossTenantAccessPolicyInboundTrust::createFromDiscriminatorValue)); });
            this.put("isServiceDefault", (n) -> { currentObject.setIsServiceDefault(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the inboundTrust property value. Determines the default configuration for trusting other Conditional Access claims from external Azure AD organizations.
     * @return a crossTenantAccessPolicyInboundTrust
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyInboundTrust getInboundTrust() {
        return this._inboundTrust;
    }
    /**
     * Gets the isServiceDefault property value. If true, the default configuration is set to the system default configuration. If false, the default settings have been customized.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsServiceDefault() {
        return this._isServiceDefault;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("b2bCollaborationInbound", this.getB2bCollaborationInbound());
        writer.writeObjectValue("b2bCollaborationOutbound", this.getB2bCollaborationOutbound());
        writer.writeObjectValue("b2bDirectConnectInbound", this.getB2bDirectConnectInbound());
        writer.writeObjectValue("b2bDirectConnectOutbound", this.getB2bDirectConnectOutbound());
        writer.writeObjectValue("inboundTrust", this.getInboundTrust());
        writer.writeBooleanValue("isServiceDefault", this.getIsServiceDefault());
    }
    /**
     * Sets the b2bCollaborationInbound property value. Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B collaboration.
     * @param value Value to set for the b2bCollaborationInbound property.
     * @return a void
     */
    public void setB2bCollaborationInbound(@javax.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this._b2bCollaborationInbound = value;
    }
    /**
     * Sets the b2bCollaborationOutbound property value. Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration.
     * @param value Value to set for the b2bCollaborationOutbound property.
     * @return a void
     */
    public void setB2bCollaborationOutbound(@javax.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this._b2bCollaborationOutbound = value;
    }
    /**
     * Sets the b2bDirectConnectInbound property value. Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B direct connect.
     * @param value Value to set for the b2bDirectConnectInbound property.
     * @return a void
     */
    public void setB2bDirectConnectInbound(@javax.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this._b2bDirectConnectInbound = value;
    }
    /**
     * Sets the b2bDirectConnectOutbound property value. Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect.
     * @param value Value to set for the b2bDirectConnectOutbound property.
     * @return a void
     */
    public void setB2bDirectConnectOutbound(@javax.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this._b2bDirectConnectOutbound = value;
    }
    /**
     * Sets the inboundTrust property value. Determines the default configuration for trusting other Conditional Access claims from external Azure AD organizations.
     * @param value Value to set for the inboundTrust property.
     * @return a void
     */
    public void setInboundTrust(@javax.annotation.Nullable final CrossTenantAccessPolicyInboundTrust value) {
        this._inboundTrust = value;
    }
    /**
     * Sets the isServiceDefault property value. If true, the default configuration is set to the system default configuration. If false, the default settings have been customized.
     * @param value Value to set for the isServiceDefault property.
     * @return a void
     */
    public void setIsServiceDefault(@javax.annotation.Nullable final Boolean value) {
        this._isServiceDefault = value;
    }
}
