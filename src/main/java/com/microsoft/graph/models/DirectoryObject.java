package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DirectoryObject extends Entity implements Parsable {
    /** Date and time when this object was deleted. Always null when the object hasn't been deleted. */
    private OffsetDateTime _deletedDateTime;
    /**
     * Instantiates a new directoryObject and sets the default values.
     * @return a void
     */
    public DirectoryObject() {
        super();
        this.setOdataType("#microsoft.graph.directoryObject");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directoryObject
     */
    @javax.annotation.Nonnull
    public static DirectoryObject createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.activityBasedTimeoutPolicy": return new ActivityBasedTimeoutPolicy();
                case "#microsoft.graph.administrativeUnit": return new AdministrativeUnit();
                case "#microsoft.graph.application": return new Application();
                case "#microsoft.graph.appRoleAssignment": return new AppRoleAssignment();
                case "#microsoft.graph.authorizationPolicy": return new AuthorizationPolicy();
                case "#microsoft.graph.claimsMappingPolicy": return new ClaimsMappingPolicy();
                case "#microsoft.graph.contract": return new Contract();
                case "#microsoft.graph.crossTenantAccessPolicy": return new CrossTenantAccessPolicy();
                case "#microsoft.graph.device": return new Device();
                case "#microsoft.graph.directoryObjectPartnerReference": return new DirectoryObjectPartnerReference();
                case "#microsoft.graph.directoryRole": return new DirectoryRole();
                case "#microsoft.graph.directoryRoleTemplate": return new DirectoryRoleTemplate();
                case "#microsoft.graph.endpoint": return new Endpoint();
                case "#microsoft.graph.extensionProperty": return new ExtensionProperty();
                case "#microsoft.graph.group": return new Group();
                case "#microsoft.graph.groupSettingTemplate": return new GroupSettingTemplate();
                case "#microsoft.graph.homeRealmDiscoveryPolicy": return new HomeRealmDiscoveryPolicy();
                case "#microsoft.graph.identitySecurityDefaultsEnforcementPolicy": return new IdentitySecurityDefaultsEnforcementPolicy();
                case "#microsoft.graph.organization": return new Organization();
                case "#microsoft.graph.orgContact": return new OrgContact();
                case "#microsoft.graph.permissionGrantPolicy": return new PermissionGrantPolicy();
                case "#microsoft.graph.policyBase": return new PolicyBase();
                case "#microsoft.graph.resourceSpecificPermissionGrant": return new ResourceSpecificPermissionGrant();
                case "#microsoft.graph.servicePrincipal": return new ServicePrincipal();
                case "#microsoft.graph.stsPolicy": return new StsPolicy();
                case "#microsoft.graph.tokenIssuancePolicy": return new TokenIssuancePolicy();
                case "#microsoft.graph.tokenLifetimePolicy": return new TokenLifetimePolicy();
                case "#microsoft.graph.user": return new User();
            }
        }
        return new DirectoryObject();
    }
    /**
     * Gets the deletedDateTime property value. Date and time when this object was deleted. Always null when the object hasn't been deleted.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this._deletedDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DirectoryObject currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deletedDateTime", (n) -> { currentObject.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("deletedDateTime", this.getDeletedDateTime());
    }
    /**
     * Sets the deletedDateTime property value. Date and time when this object was deleted. Always null when the object hasn't been deleted.
     * @param value Value to set for the deletedDateTime property.
     * @return a void
     */
    public void setDeletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deletedDateTime = value;
    }
}
