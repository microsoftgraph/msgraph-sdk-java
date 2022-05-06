package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the auditLogRoot singleton.  */
public class AuditLogRoot extends Entity implements Parsable {
    /** Read-only. Nullable.  */
    private java.util.List<DirectoryAudit> _directoryAudits;
    /** The provisioning property  */
    private java.util.List<ProvisioningObjectSummary> _provisioning;
    /** The restrictedSignIns property  */
    private java.util.List<RestrictedSignIn> _restrictedSignIns;
    /** Read-only. Nullable.  */
    private java.util.List<SignIn> _signIns;
    /**
     * Instantiates a new auditLogRoot and sets the default values.
     * @return a void
     */
    public AuditLogRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a auditLogRoot
     */
    @javax.annotation.Nonnull
    public static AuditLogRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditLogRoot();
    }
    /**
     * Gets the directoryAudits property value. Read-only. Nullable.
     * @return a directoryAudit
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryAudit> getDirectoryAudits() {
        return this._directoryAudits;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuditLogRoot currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("directoryAudits", (n) -> { currentObject.setDirectoryAudits(n.getCollectionOfObjectValues(DirectoryAudit::createFromDiscriminatorValue)); });
            this.put("provisioning", (n) -> { currentObject.setProvisioning(n.getCollectionOfObjectValues(ProvisioningObjectSummary::createFromDiscriminatorValue)); });
            this.put("restrictedSignIns", (n) -> { currentObject.setRestrictedSignIns(n.getCollectionOfObjectValues(RestrictedSignIn::createFromDiscriminatorValue)); });
            this.put("signIns", (n) -> { currentObject.setSignIns(n.getCollectionOfObjectValues(SignIn::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the provisioning property value. The provisioning property
     * @return a provisioningObjectSummary
     */
    @javax.annotation.Nullable
    public java.util.List<ProvisioningObjectSummary> getProvisioning() {
        return this._provisioning;
    }
    /**
     * Gets the restrictedSignIns property value. The restrictedSignIns property
     * @return a restrictedSignIn
     */
    @javax.annotation.Nullable
    public java.util.List<RestrictedSignIn> getRestrictedSignIns() {
        return this._restrictedSignIns;
    }
    /**
     * Gets the signIns property value. Read-only. Nullable.
     * @return a signIn
     */
    @javax.annotation.Nullable
    public java.util.List<SignIn> getSignIns() {
        return this._signIns;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("directoryAudits", this.getDirectoryAudits());
        writer.writeCollectionOfObjectValues("provisioning", this.getProvisioning());
        writer.writeCollectionOfObjectValues("restrictedSignIns", this.getRestrictedSignIns());
        writer.writeCollectionOfObjectValues("signIns", this.getSignIns());
    }
    /**
     * Sets the directoryAudits property value. Read-only. Nullable.
     * @param value Value to set for the directoryAudits property.
     * @return a void
     */
    public void setDirectoryAudits(@javax.annotation.Nullable final java.util.List<DirectoryAudit> value) {
        this._directoryAudits = value;
    }
    /**
     * Sets the provisioning property value. The provisioning property
     * @param value Value to set for the provisioning property.
     * @return a void
     */
    public void setProvisioning(@javax.annotation.Nullable final java.util.List<ProvisioningObjectSummary> value) {
        this._provisioning = value;
    }
    /**
     * Sets the restrictedSignIns property value. The restrictedSignIns property
     * @param value Value to set for the restrictedSignIns property.
     * @return a void
     */
    public void setRestrictedSignIns(@javax.annotation.Nullable final java.util.List<RestrictedSignIn> value) {
        this._restrictedSignIns = value;
    }
    /**
     * Sets the signIns property value. Read-only. Nullable.
     * @param value Value to set for the signIns property.
     * @return a void
     */
    public void setSignIns(@javax.annotation.Nullable final java.util.List<SignIn> value) {
        this._signIns = value;
    }
}
