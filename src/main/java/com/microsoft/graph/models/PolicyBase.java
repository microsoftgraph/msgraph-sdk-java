package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PolicyBase extends DirectoryObject implements Parsable {
    /** Description for this policy. Required. */
    private String description;
    /** Display name for this policy. Required. */
    private String displayName;
    /**
     * Instantiates a new policyBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PolicyBase() {
        super();
        this.setOdataType("#microsoft.graph.policyBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a policyBase
     */
    @javax.annotation.Nonnull
    public static PolicyBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.activityBasedTimeoutPolicy": return new ActivityBasedTimeoutPolicy();
                case "#microsoft.graph.appManagementPolicy": return new AppManagementPolicy();
                case "#microsoft.graph.authorizationPolicy": return new AuthorizationPolicy();
                case "#microsoft.graph.claimsMappingPolicy": return new ClaimsMappingPolicy();
                case "#microsoft.graph.crossTenantAccessPolicy": return new CrossTenantAccessPolicy();
                case "#microsoft.graph.homeRealmDiscoveryPolicy": return new HomeRealmDiscoveryPolicy();
                case "#microsoft.graph.identitySecurityDefaultsEnforcementPolicy": return new IdentitySecurityDefaultsEnforcementPolicy();
                case "#microsoft.graph.permissionGrantPolicy": return new PermissionGrantPolicy();
                case "#microsoft.graph.stsPolicy": return new StsPolicy();
                case "#microsoft.graph.tenantAppManagementPolicy": return new TenantAppManagementPolicy();
                case "#microsoft.graph.tokenIssuancePolicy": return new TokenIssuancePolicy();
                case "#microsoft.graph.tokenLifetimePolicy": return new TokenLifetimePolicy();
            }
        }
        return new PolicyBase();
    }
    /**
     * Gets the description property value. Description for this policy. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name for this policy. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the description property value. Description for this policy. Required.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name for this policy. Required.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
}
