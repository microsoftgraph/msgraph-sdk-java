package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EntitlementManagement extends Entity implements Parsable {
    /** Approval stages for assignment requests.  */
    private java.util.List<Approval> _accessPackageAssignmentApprovals;
    /** Represents access package objects.  */
    private java.util.List<AccessPackage> _accessPackages;
    /** Access package assignment policies.  */
    private java.util.List<AccessPackageAssignmentPolicy> _assignmentPolicies;
    /** Represents access package assignment requests created by or on behalf of a user.  */
    private java.util.List<AccessPackageAssignmentRequest> _assignmentRequests;
    /** Represents the grant of an access package to a subject (user or group).  */
    private java.util.List<AccessPackageAssignment> _assignments;
    /** Represents a collection of access packages.  */
    private java.util.List<AccessPackageCatalog> _catalogs;
    /** Represents references to a directory or domain of another organization whose users can request access.  */
    private java.util.List<ConnectedOrganization> _connectedOrganizations;
    /** Represents the settings that control the behavior of Azure AD entitlement management.  */
    private EntitlementManagementSettings _settings;
    /**
     * Instantiates a new entitlementManagement and sets the default values.
     * @return a void
     */
    public EntitlementManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a entitlementManagement
     */
    @javax.annotation.Nonnull
    public static EntitlementManagement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntitlementManagement();
    }
    /**
     * Gets the accessPackageAssignmentApprovals property value. Approval stages for assignment requests.
     * @return a approval
     */
    @javax.annotation.Nullable
    public java.util.List<Approval> getAccessPackageAssignmentApprovals() {
        return this._accessPackageAssignmentApprovals;
    }
    /**
     * Gets the accessPackages property value. Represents access package objects.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackages() {
        return this._accessPackages;
    }
    /**
     * Gets the assignmentPolicies property value. Access package assignment policies.
     * @return a accessPackageAssignmentPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignmentPolicy> getAssignmentPolicies() {
        return this._assignmentPolicies;
    }
    /**
     * Gets the assignmentRequests property value. Represents access package assignment requests created by or on behalf of a user.
     * @return a accessPackageAssignmentRequest
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignmentRequest> getAssignmentRequests() {
        return this._assignmentRequests;
    }
    /**
     * Gets the assignments property value. Represents the grant of an access package to a subject (user or group).
     * @return a accessPackageAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the catalogs property value. Represents a collection of access packages.
     * @return a accessPackageCatalog
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageCatalog> getCatalogs() {
        return this._catalogs;
    }
    /**
     * Gets the connectedOrganizations property value. Represents references to a directory or domain of another organization whose users can request access.
     * @return a connectedOrganization
     */
    @javax.annotation.Nullable
    public java.util.List<ConnectedOrganization> getConnectedOrganizations() {
        return this._connectedOrganizations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EntitlementManagement currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accessPackageAssignmentApprovals", (n) -> { currentObject.setAccessPackageAssignmentApprovals(n.getCollectionOfObjectValues(Approval::createFromDiscriminatorValue)); });
            this.put("accessPackages", (n) -> { currentObject.setAccessPackages(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
            this.put("assignmentPolicies", (n) -> { currentObject.setAssignmentPolicies(n.getCollectionOfObjectValues(AccessPackageAssignmentPolicy::createFromDiscriminatorValue)); });
            this.put("assignmentRequests", (n) -> { currentObject.setAssignmentRequests(n.getCollectionOfObjectValues(AccessPackageAssignmentRequest::createFromDiscriminatorValue)); });
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(AccessPackageAssignment::createFromDiscriminatorValue)); });
            this.put("catalogs", (n) -> { currentObject.setCatalogs(n.getCollectionOfObjectValues(AccessPackageCatalog::createFromDiscriminatorValue)); });
            this.put("connectedOrganizations", (n) -> { currentObject.setConnectedOrganizations(n.getCollectionOfObjectValues(ConnectedOrganization::createFromDiscriminatorValue)); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(EntitlementManagementSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the settings property value. Represents the settings that control the behavior of Azure AD entitlement management.
     * @return a entitlementManagementSettings
     */
    @javax.annotation.Nullable
    public EntitlementManagementSettings getSettings() {
        return this._settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accessPackageAssignmentApprovals", this.getAccessPackageAssignmentApprovals());
        writer.writeCollectionOfObjectValues("accessPackages", this.getAccessPackages());
        writer.writeCollectionOfObjectValues("assignmentPolicies", this.getAssignmentPolicies());
        writer.writeCollectionOfObjectValues("assignmentRequests", this.getAssignmentRequests());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfObjectValues("catalogs", this.getCatalogs());
        writer.writeCollectionOfObjectValues("connectedOrganizations", this.getConnectedOrganizations());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the accessPackageAssignmentApprovals property value. Approval stages for assignment requests.
     * @param value Value to set for the accessPackageAssignmentApprovals property.
     * @return a void
     */
    public void setAccessPackageAssignmentApprovals(@javax.annotation.Nullable final java.util.List<Approval> value) {
        this._accessPackageAssignmentApprovals = value;
    }
    /**
     * Sets the accessPackages property value. Represents access package objects.
     * @param value Value to set for the accessPackages property.
     * @return a void
     */
    public void setAccessPackages(@javax.annotation.Nullable final java.util.List<AccessPackage> value) {
        this._accessPackages = value;
    }
    /**
     * Sets the assignmentPolicies property value. Access package assignment policies.
     * @param value Value to set for the assignmentPolicies property.
     * @return a void
     */
    public void setAssignmentPolicies(@javax.annotation.Nullable final java.util.List<AccessPackageAssignmentPolicy> value) {
        this._assignmentPolicies = value;
    }
    /**
     * Sets the assignmentRequests property value. Represents access package assignment requests created by or on behalf of a user.
     * @param value Value to set for the assignmentRequests property.
     * @return a void
     */
    public void setAssignmentRequests(@javax.annotation.Nullable final java.util.List<AccessPackageAssignmentRequest> value) {
        this._assignmentRequests = value;
    }
    /**
     * Sets the assignments property value. Represents the grant of an access package to a subject (user or group).
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<AccessPackageAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the catalogs property value. Represents a collection of access packages.
     * @param value Value to set for the catalogs property.
     * @return a void
     */
    public void setCatalogs(@javax.annotation.Nullable final java.util.List<AccessPackageCatalog> value) {
        this._catalogs = value;
    }
    /**
     * Sets the connectedOrganizations property value. Represents references to a directory or domain of another organization whose users can request access.
     * @param value Value to set for the connectedOrganizations property.
     * @return a void
     */
    public void setConnectedOrganizations(@javax.annotation.Nullable final java.util.List<ConnectedOrganization> value) {
        this._connectedOrganizations = value;
    }
    /**
     * Sets the settings property value. Represents the settings that control the behavior of Azure AD entitlement management.
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final EntitlementManagementSettings value) {
        this._settings = value;
    }
}
