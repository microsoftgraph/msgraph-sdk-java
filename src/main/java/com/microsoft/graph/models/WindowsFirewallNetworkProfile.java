package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Windows Firewall Profile Policies. */
public class WindowsFirewallNetworkProfile implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Configures the firewall to merge authorized application rules from group policy with those from local store instead of ignoring the local store rules. When AuthorizedApplicationRulesFromGroupPolicyNotMerged and AuthorizedApplicationRulesFromGroupPolicyMerged are both true, AuthorizedApplicationRulesFromGroupPolicyMerged takes priority. */
    private Boolean _authorizedApplicationRulesFromGroupPolicyMerged;
    /** Configures the firewall to merge connection security rules from group policy with those from local store instead of ignoring the local store rules. When ConnectionSecurityRulesFromGroupPolicyNotMerged and ConnectionSecurityRulesFromGroupPolicyMerged are both true, ConnectionSecurityRulesFromGroupPolicyMerged takes priority. */
    private Boolean _connectionSecurityRulesFromGroupPolicyMerged;
    /** State Management Setting. */
    private StateManagementSetting _firewallEnabled;
    /** Configures the firewall to merge global port rules from group policy with those from local store instead of ignoring the local store rules. When GlobalPortRulesFromGroupPolicyNotMerged and GlobalPortRulesFromGroupPolicyMerged are both true, GlobalPortRulesFromGroupPolicyMerged takes priority. */
    private Boolean _globalPortRulesFromGroupPolicyMerged;
    /** Configures the firewall to block all incoming connections by default. When InboundConnectionsRequired and InboundConnectionsBlocked are both true, InboundConnectionsBlocked takes priority. */
    private Boolean _inboundConnectionsBlocked;
    /** Prevents the firewall from displaying notifications when an application is blocked from listening on a port. When InboundNotificationsRequired and InboundNotificationsBlocked are both true, InboundNotificationsBlocked takes priority. */
    private Boolean _inboundNotificationsBlocked;
    /** Configures the firewall to block all incoming traffic regardless of other policy settings. When IncomingTrafficRequired and IncomingTrafficBlocked are both true, IncomingTrafficBlocked takes priority. */
    private Boolean _incomingTrafficBlocked;
    /** The OdataType property */
    private String _odataType;
    /** Configures the firewall to block all outgoing connections by default. When OutboundConnectionsRequired and OutboundConnectionsBlocked are both true, OutboundConnectionsBlocked takes priority. This setting will get applied to Windows releases version 1809 and above. */
    private Boolean _outboundConnectionsBlocked;
    /** Configures the firewall to merge Firewall Rule policies from group policy with those from local store instead of ignoring the local store rules. When PolicyRulesFromGroupPolicyNotMerged and PolicyRulesFromGroupPolicyMerged are both true, PolicyRulesFromGroupPolicyMerged takes priority. */
    private Boolean _policyRulesFromGroupPolicyMerged;
    /** Configures the firewall to allow the host computer to respond to unsolicited network traffic of that traffic is secured by IPSec even when stealthModeBlocked is set to true. When SecuredPacketExemptionBlocked and SecuredPacketExemptionAllowed are both true, SecuredPacketExemptionAllowed takes priority. */
    private Boolean _securedPacketExemptionAllowed;
    /** Prevent the server from operating in stealth mode. When StealthModeRequired and StealthModeBlocked are both true, StealthModeBlocked takes priority. */
    private Boolean _stealthModeBlocked;
    /** Configures the firewall to block unicast responses to multicast broadcast traffic. When UnicastResponsesToMulticastBroadcastsRequired and UnicastResponsesToMulticastBroadcastsBlocked are both true, UnicastResponsesToMulticastBroadcastsBlocked takes priority. */
    private Boolean _unicastResponsesToMulticastBroadcastsBlocked;
    /**
     * Instantiates a new windowsFirewallNetworkProfile and sets the default values.
     * @return a void
     */
    public WindowsFirewallNetworkProfile() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windowsFirewallNetworkProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsFirewallNetworkProfile
     */
    @javax.annotation.Nonnull
    public static WindowsFirewallNetworkProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsFirewallNetworkProfile();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the authorizedApplicationRulesFromGroupPolicyMerged property value. Configures the firewall to merge authorized application rules from group policy with those from local store instead of ignoring the local store rules. When AuthorizedApplicationRulesFromGroupPolicyNotMerged and AuthorizedApplicationRulesFromGroupPolicyMerged are both true, AuthorizedApplicationRulesFromGroupPolicyMerged takes priority.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAuthorizedApplicationRulesFromGroupPolicyMerged() {
        return this._authorizedApplicationRulesFromGroupPolicyMerged;
    }
    /**
     * Gets the connectionSecurityRulesFromGroupPolicyMerged property value. Configures the firewall to merge connection security rules from group policy with those from local store instead of ignoring the local store rules. When ConnectionSecurityRulesFromGroupPolicyNotMerged and ConnectionSecurityRulesFromGroupPolicyMerged are both true, ConnectionSecurityRulesFromGroupPolicyMerged takes priority.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectionSecurityRulesFromGroupPolicyMerged() {
        return this._connectionSecurityRulesFromGroupPolicyMerged;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsFirewallNetworkProfile currentObject = this;
        return new HashMap<>(13) {{
            this.put("authorizedApplicationRulesFromGroupPolicyMerged", (n) -> { currentObject.setAuthorizedApplicationRulesFromGroupPolicyMerged(n.getBooleanValue()); });
            this.put("connectionSecurityRulesFromGroupPolicyMerged", (n) -> { currentObject.setConnectionSecurityRulesFromGroupPolicyMerged(n.getBooleanValue()); });
            this.put("firewallEnabled", (n) -> { currentObject.setFirewallEnabled(n.getEnumValue(StateManagementSetting.class)); });
            this.put("globalPortRulesFromGroupPolicyMerged", (n) -> { currentObject.setGlobalPortRulesFromGroupPolicyMerged(n.getBooleanValue()); });
            this.put("inboundConnectionsBlocked", (n) -> { currentObject.setInboundConnectionsBlocked(n.getBooleanValue()); });
            this.put("inboundNotificationsBlocked", (n) -> { currentObject.setInboundNotificationsBlocked(n.getBooleanValue()); });
            this.put("incomingTrafficBlocked", (n) -> { currentObject.setIncomingTrafficBlocked(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("outboundConnectionsBlocked", (n) -> { currentObject.setOutboundConnectionsBlocked(n.getBooleanValue()); });
            this.put("policyRulesFromGroupPolicyMerged", (n) -> { currentObject.setPolicyRulesFromGroupPolicyMerged(n.getBooleanValue()); });
            this.put("securedPacketExemptionAllowed", (n) -> { currentObject.setSecuredPacketExemptionAllowed(n.getBooleanValue()); });
            this.put("stealthModeBlocked", (n) -> { currentObject.setStealthModeBlocked(n.getBooleanValue()); });
            this.put("unicastResponsesToMulticastBroadcastsBlocked", (n) -> { currentObject.setUnicastResponsesToMulticastBroadcastsBlocked(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the firewallEnabled property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getFirewallEnabled() {
        return this._firewallEnabled;
    }
    /**
     * Gets the globalPortRulesFromGroupPolicyMerged property value. Configures the firewall to merge global port rules from group policy with those from local store instead of ignoring the local store rules. When GlobalPortRulesFromGroupPolicyNotMerged and GlobalPortRulesFromGroupPolicyMerged are both true, GlobalPortRulesFromGroupPolicyMerged takes priority.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGlobalPortRulesFromGroupPolicyMerged() {
        return this._globalPortRulesFromGroupPolicyMerged;
    }
    /**
     * Gets the inboundConnectionsBlocked property value. Configures the firewall to block all incoming connections by default. When InboundConnectionsRequired and InboundConnectionsBlocked are both true, InboundConnectionsBlocked takes priority.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInboundConnectionsBlocked() {
        return this._inboundConnectionsBlocked;
    }
    /**
     * Gets the inboundNotificationsBlocked property value. Prevents the firewall from displaying notifications when an application is blocked from listening on a port. When InboundNotificationsRequired and InboundNotificationsBlocked are both true, InboundNotificationsBlocked takes priority.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInboundNotificationsBlocked() {
        return this._inboundNotificationsBlocked;
    }
    /**
     * Gets the incomingTrafficBlocked property value. Configures the firewall to block all incoming traffic regardless of other policy settings. When IncomingTrafficRequired and IncomingTrafficBlocked are both true, IncomingTrafficBlocked takes priority.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIncomingTrafficBlocked() {
        return this._incomingTrafficBlocked;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the outboundConnectionsBlocked property value. Configures the firewall to block all outgoing connections by default. When OutboundConnectionsRequired and OutboundConnectionsBlocked are both true, OutboundConnectionsBlocked takes priority. This setting will get applied to Windows releases version 1809 and above.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOutboundConnectionsBlocked() {
        return this._outboundConnectionsBlocked;
    }
    /**
     * Gets the policyRulesFromGroupPolicyMerged property value. Configures the firewall to merge Firewall Rule policies from group policy with those from local store instead of ignoring the local store rules. When PolicyRulesFromGroupPolicyNotMerged and PolicyRulesFromGroupPolicyMerged are both true, PolicyRulesFromGroupPolicyMerged takes priority.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPolicyRulesFromGroupPolicyMerged() {
        return this._policyRulesFromGroupPolicyMerged;
    }
    /**
     * Gets the securedPacketExemptionAllowed property value. Configures the firewall to allow the host computer to respond to unsolicited network traffic of that traffic is secured by IPSec even when stealthModeBlocked is set to true. When SecuredPacketExemptionBlocked and SecuredPacketExemptionAllowed are both true, SecuredPacketExemptionAllowed takes priority.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecuredPacketExemptionAllowed() {
        return this._securedPacketExemptionAllowed;
    }
    /**
     * Gets the stealthModeBlocked property value. Prevent the server from operating in stealth mode. When StealthModeRequired and StealthModeBlocked are both true, StealthModeBlocked takes priority.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStealthModeBlocked() {
        return this._stealthModeBlocked;
    }
    /**
     * Gets the unicastResponsesToMulticastBroadcastsBlocked property value. Configures the firewall to block unicast responses to multicast broadcast traffic. When UnicastResponsesToMulticastBroadcastsRequired and UnicastResponsesToMulticastBroadcastsBlocked are both true, UnicastResponsesToMulticastBroadcastsBlocked takes priority.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUnicastResponsesToMulticastBroadcastsBlocked() {
        return this._unicastResponsesToMulticastBroadcastsBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("authorizedApplicationRulesFromGroupPolicyMerged", this.getAuthorizedApplicationRulesFromGroupPolicyMerged());
        writer.writeBooleanValue("connectionSecurityRulesFromGroupPolicyMerged", this.getConnectionSecurityRulesFromGroupPolicyMerged());
        writer.writeEnumValue("firewallEnabled", this.getFirewallEnabled());
        writer.writeBooleanValue("globalPortRulesFromGroupPolicyMerged", this.getGlobalPortRulesFromGroupPolicyMerged());
        writer.writeBooleanValue("inboundConnectionsBlocked", this.getInboundConnectionsBlocked());
        writer.writeBooleanValue("inboundNotificationsBlocked", this.getInboundNotificationsBlocked());
        writer.writeBooleanValue("incomingTrafficBlocked", this.getIncomingTrafficBlocked());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("outboundConnectionsBlocked", this.getOutboundConnectionsBlocked());
        writer.writeBooleanValue("policyRulesFromGroupPolicyMerged", this.getPolicyRulesFromGroupPolicyMerged());
        writer.writeBooleanValue("securedPacketExemptionAllowed", this.getSecuredPacketExemptionAllowed());
        writer.writeBooleanValue("stealthModeBlocked", this.getStealthModeBlocked());
        writer.writeBooleanValue("unicastResponsesToMulticastBroadcastsBlocked", this.getUnicastResponsesToMulticastBroadcastsBlocked());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the authorizedApplicationRulesFromGroupPolicyMerged property value. Configures the firewall to merge authorized application rules from group policy with those from local store instead of ignoring the local store rules. When AuthorizedApplicationRulesFromGroupPolicyNotMerged and AuthorizedApplicationRulesFromGroupPolicyMerged are both true, AuthorizedApplicationRulesFromGroupPolicyMerged takes priority.
     * @param value Value to set for the authorizedApplicationRulesFromGroupPolicyMerged property.
     * @return a void
     */
    public void setAuthorizedApplicationRulesFromGroupPolicyMerged(@javax.annotation.Nullable final Boolean value) {
        this._authorizedApplicationRulesFromGroupPolicyMerged = value;
    }
    /**
     * Sets the connectionSecurityRulesFromGroupPolicyMerged property value. Configures the firewall to merge connection security rules from group policy with those from local store instead of ignoring the local store rules. When ConnectionSecurityRulesFromGroupPolicyNotMerged and ConnectionSecurityRulesFromGroupPolicyMerged are both true, ConnectionSecurityRulesFromGroupPolicyMerged takes priority.
     * @param value Value to set for the connectionSecurityRulesFromGroupPolicyMerged property.
     * @return a void
     */
    public void setConnectionSecurityRulesFromGroupPolicyMerged(@javax.annotation.Nullable final Boolean value) {
        this._connectionSecurityRulesFromGroupPolicyMerged = value;
    }
    /**
     * Sets the firewallEnabled property value. State Management Setting.
     * @param value Value to set for the firewallEnabled property.
     * @return a void
     */
    public void setFirewallEnabled(@javax.annotation.Nullable final StateManagementSetting value) {
        this._firewallEnabled = value;
    }
    /**
     * Sets the globalPortRulesFromGroupPolicyMerged property value. Configures the firewall to merge global port rules from group policy with those from local store instead of ignoring the local store rules. When GlobalPortRulesFromGroupPolicyNotMerged and GlobalPortRulesFromGroupPolicyMerged are both true, GlobalPortRulesFromGroupPolicyMerged takes priority.
     * @param value Value to set for the globalPortRulesFromGroupPolicyMerged property.
     * @return a void
     */
    public void setGlobalPortRulesFromGroupPolicyMerged(@javax.annotation.Nullable final Boolean value) {
        this._globalPortRulesFromGroupPolicyMerged = value;
    }
    /**
     * Sets the inboundConnectionsBlocked property value. Configures the firewall to block all incoming connections by default. When InboundConnectionsRequired and InboundConnectionsBlocked are both true, InboundConnectionsBlocked takes priority.
     * @param value Value to set for the inboundConnectionsBlocked property.
     * @return a void
     */
    public void setInboundConnectionsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._inboundConnectionsBlocked = value;
    }
    /**
     * Sets the inboundNotificationsBlocked property value. Prevents the firewall from displaying notifications when an application is blocked from listening on a port. When InboundNotificationsRequired and InboundNotificationsBlocked are both true, InboundNotificationsBlocked takes priority.
     * @param value Value to set for the inboundNotificationsBlocked property.
     * @return a void
     */
    public void setInboundNotificationsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._inboundNotificationsBlocked = value;
    }
    /**
     * Sets the incomingTrafficBlocked property value. Configures the firewall to block all incoming traffic regardless of other policy settings. When IncomingTrafficRequired and IncomingTrafficBlocked are both true, IncomingTrafficBlocked takes priority.
     * @param value Value to set for the incomingTrafficBlocked property.
     * @return a void
     */
    public void setIncomingTrafficBlocked(@javax.annotation.Nullable final Boolean value) {
        this._incomingTrafficBlocked = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the outboundConnectionsBlocked property value. Configures the firewall to block all outgoing connections by default. When OutboundConnectionsRequired and OutboundConnectionsBlocked are both true, OutboundConnectionsBlocked takes priority. This setting will get applied to Windows releases version 1809 and above.
     * @param value Value to set for the outboundConnectionsBlocked property.
     * @return a void
     */
    public void setOutboundConnectionsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._outboundConnectionsBlocked = value;
    }
    /**
     * Sets the policyRulesFromGroupPolicyMerged property value. Configures the firewall to merge Firewall Rule policies from group policy with those from local store instead of ignoring the local store rules. When PolicyRulesFromGroupPolicyNotMerged and PolicyRulesFromGroupPolicyMerged are both true, PolicyRulesFromGroupPolicyMerged takes priority.
     * @param value Value to set for the policyRulesFromGroupPolicyMerged property.
     * @return a void
     */
    public void setPolicyRulesFromGroupPolicyMerged(@javax.annotation.Nullable final Boolean value) {
        this._policyRulesFromGroupPolicyMerged = value;
    }
    /**
     * Sets the securedPacketExemptionAllowed property value. Configures the firewall to allow the host computer to respond to unsolicited network traffic of that traffic is secured by IPSec even when stealthModeBlocked is set to true. When SecuredPacketExemptionBlocked and SecuredPacketExemptionAllowed are both true, SecuredPacketExemptionAllowed takes priority.
     * @param value Value to set for the securedPacketExemptionAllowed property.
     * @return a void
     */
    public void setSecuredPacketExemptionAllowed(@javax.annotation.Nullable final Boolean value) {
        this._securedPacketExemptionAllowed = value;
    }
    /**
     * Sets the stealthModeBlocked property value. Prevent the server from operating in stealth mode. When StealthModeRequired and StealthModeBlocked are both true, StealthModeBlocked takes priority.
     * @param value Value to set for the stealthModeBlocked property.
     * @return a void
     */
    public void setStealthModeBlocked(@javax.annotation.Nullable final Boolean value) {
        this._stealthModeBlocked = value;
    }
    /**
     * Sets the unicastResponsesToMulticastBroadcastsBlocked property value. Configures the firewall to block unicast responses to multicast broadcast traffic. When UnicastResponsesToMulticastBroadcastsRequired and UnicastResponsesToMulticastBroadcastsBlocked are both true, UnicastResponsesToMulticastBroadcastsBlocked takes priority.
     * @param value Value to set for the unicastResponsesToMulticastBroadcastsBlocked property.
     * @return a void
     */
    public void setUnicastResponsesToMulticastBroadcastsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._unicastResponsesToMulticastBroadcastsBlocked = value;
    }
}
