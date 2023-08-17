package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EntitlementManagement extends Entity implements Parsable {
    /**
     * Approval stages for decisions associated with access package assignment requests.
     */
    private java.util.List<Approval> accessPackageAssignmentApprovals;
    /**
     * Access packages define the collection of resource roles and the policies for which subjects can request or be assigned access to those resources.
     */
    private java.util.List<AccessPackage> accessPackages;
    /**
     * Access package assignment policies govern which subjects can request or be assigned an access package via an access package assignment.
     */
    private java.util.List<AccessPackageAssignmentPolicy> assignmentPolicies;
    /**
     * Access package assignment requests created by or on behalf of a subject.
     */
    private java.util.List<AccessPackageAssignmentRequest> assignmentRequests;
    /**
     * The assignment of an access package to a subject for a period of time.
     */
    private java.util.List<AccessPackageAssignment> assignments;
    /**
     * A container for access packages.
     */
    private java.util.List<AccessPackageCatalog> catalogs;
    /**
     * References to a directory or domain of another organization whose users can request access.
     */
    private java.util.List<ConnectedOrganization> connectedOrganizations;
    /**
     * A reference to the geolocation environments in which a resource is located.
     */
    private java.util.List<AccessPackageResourceEnvironment> resourceEnvironments;
    /**
     * Represents a request to add or remove a resource to or from a catalog respectively.
     */
    private java.util.List<AccessPackageResourceRequest> resourceRequests;
    /**
     * The resourceRoleScopes property
     */
    private java.util.List<AccessPackageResourceRoleScope> resourceRoleScopes;
    /**
     * The resources associated with the catalogs.
     */
    private java.util.List<AccessPackageResource> resources;
    /**
     * The settings that control the behavior of Azure AD entitlement management.
     */
    private EntitlementManagementSettings settings;
    /**
     * Instantiates a new entitlementManagement and sets the default values.
     */
    public EntitlementManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a entitlementManagement
     */
    @jakarta.annotation.Nonnull
    public static EntitlementManagement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntitlementManagement();
    }
    /**
     * Gets the accessPackageAssignmentApprovals property value. Approval stages for decisions associated with access package assignment requests.
     * @return a approval
     */
    @jakarta.annotation.Nullable
    public java.util.List<Approval> getAccessPackageAssignmentApprovals() {
        return this.accessPackageAssignmentApprovals;
    }
    /**
     * Gets the accessPackages property value. Access packages define the collection of resource roles and the policies for which subjects can request or be assigned access to those resources.
     * @return a accessPackage
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackages() {
        return this.accessPackages;
    }
    /**
     * Gets the assignmentPolicies property value. Access package assignment policies govern which subjects can request or be assigned an access package via an access package assignment.
     * @return a accessPackageAssignmentPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignmentPolicy> getAssignmentPolicies() {
        return this.assignmentPolicies;
    }
    /**
     * Gets the assignmentRequests property value. Access package assignment requests created by or on behalf of a subject.
     * @return a accessPackageAssignmentRequest
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignmentRequest> getAssignmentRequests() {
        return this.assignmentRequests;
    }
    /**
     * Gets the assignments property value. The assignment of an access package to a subject for a period of time.
     * @return a accessPackageAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the catalogs property value. A container for access packages.
     * @return a accessPackageCatalog
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageCatalog> getCatalogs() {
        return this.catalogs;
    }
    /**
     * Gets the connectedOrganizations property value. References to a directory or domain of another organization whose users can request access.
     * @return a connectedOrganization
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConnectedOrganization> getConnectedOrganizations() {
        return this.connectedOrganizations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackageAssignmentApprovals", (n) -> { this.setAccessPackageAssignmentApprovals(n.getCollectionOfObjectValues(Approval::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackages", (n) -> { this.setAccessPackages(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentPolicies", (n) -> { this.setAssignmentPolicies(n.getCollectionOfObjectValues(AccessPackageAssignmentPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentRequests", (n) -> { this.setAssignmentRequests(n.getCollectionOfObjectValues(AccessPackageAssignmentRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(AccessPackageAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("catalogs", (n) -> { this.setCatalogs(n.getCollectionOfObjectValues(AccessPackageCatalog::createFromDiscriminatorValue)); });
        deserializerMap.put("connectedOrganizations", (n) -> { this.setConnectedOrganizations(n.getCollectionOfObjectValues(ConnectedOrganization::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceEnvironments", (n) -> { this.setResourceEnvironments(n.getCollectionOfObjectValues(AccessPackageResourceEnvironment::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceRequests", (n) -> { this.setResourceRequests(n.getCollectionOfObjectValues(AccessPackageResourceRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceRoleScopes", (n) -> { this.setResourceRoleScopes(n.getCollectionOfObjectValues(AccessPackageResourceRoleScope::createFromDiscriminatorValue)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(AccessPackageResource::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(EntitlementManagementSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceEnvironments property value. A reference to the geolocation environments in which a resource is located.
     * @return a accessPackageResourceEnvironment
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceEnvironment> getResourceEnvironments() {
        return this.resourceEnvironments;
    }
    /**
     * Gets the resourceRequests property value. Represents a request to add or remove a resource to or from a catalog respectively.
     * @return a accessPackageResourceRequest
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceRequest> getResourceRequests() {
        return this.resourceRequests;
    }
    /**
     * Gets the resourceRoleScopes property value. The resourceRoleScopes property
     * @return a accessPackageResourceRoleScope
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceRoleScope> getResourceRoleScopes() {
        return this.resourceRoleScopes;
    }
    /**
     * Gets the resources property value. The resources associated with the catalogs.
     * @return a accessPackageResource
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResource> getResources() {
        return this.resources;
    }
    /**
     * Gets the settings property value. The settings that control the behavior of Azure AD entitlement management.
     * @return a entitlementManagementSettings
     */
    @jakarta.annotation.Nullable
    public EntitlementManagementSettings getSettings() {
        return this.settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accessPackageAssignmentApprovals", this.getAccessPackageAssignmentApprovals());
        writer.writeCollectionOfObjectValues("accessPackages", this.getAccessPackages());
        writer.writeCollectionOfObjectValues("assignmentPolicies", this.getAssignmentPolicies());
        writer.writeCollectionOfObjectValues("assignmentRequests", this.getAssignmentRequests());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfObjectValues("catalogs", this.getCatalogs());
        writer.writeCollectionOfObjectValues("connectedOrganizations", this.getConnectedOrganizations());
        writer.writeCollectionOfObjectValues("resourceEnvironments", this.getResourceEnvironments());
        writer.writeCollectionOfObjectValues("resourceRequests", this.getResourceRequests());
        writer.writeCollectionOfObjectValues("resourceRoleScopes", this.getResourceRoleScopes());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the accessPackageAssignmentApprovals property value. Approval stages for decisions associated with access package assignment requests.
     * @param value Value to set for the accessPackageAssignmentApprovals property.
     */
    public void setAccessPackageAssignmentApprovals(@jakarta.annotation.Nullable final java.util.List<Approval> value) {
        this.accessPackageAssignmentApprovals = value;
    }
    /**
     * Sets the accessPackages property value. Access packages define the collection of resource roles and the policies for which subjects can request or be assigned access to those resources.
     * @param value Value to set for the accessPackages property.
     */
    public void setAccessPackages(@jakarta.annotation.Nullable final java.util.List<AccessPackage> value) {
        this.accessPackages = value;
    }
    /**
     * Sets the assignmentPolicies property value. Access package assignment policies govern which subjects can request or be assigned an access package via an access package assignment.
     * @param value Value to set for the assignmentPolicies property.
     */
    public void setAssignmentPolicies(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignmentPolicy> value) {
        this.assignmentPolicies = value;
    }
    /**
     * Sets the assignmentRequests property value. Access package assignment requests created by or on behalf of a subject.
     * @param value Value to set for the assignmentRequests property.
     */
    public void setAssignmentRequests(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignmentRequest> value) {
        this.assignmentRequests = value;
    }
    /**
     * Sets the assignments property value. The assignment of an access package to a subject for a period of time.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the catalogs property value. A container for access packages.
     * @param value Value to set for the catalogs property.
     */
    public void setCatalogs(@jakarta.annotation.Nullable final java.util.List<AccessPackageCatalog> value) {
        this.catalogs = value;
    }
    /**
     * Sets the connectedOrganizations property value. References to a directory or domain of another organization whose users can request access.
     * @param value Value to set for the connectedOrganizations property.
     */
    public void setConnectedOrganizations(@jakarta.annotation.Nullable final java.util.List<ConnectedOrganization> value) {
        this.connectedOrganizations = value;
    }
    /**
     * Sets the resourceEnvironments property value. A reference to the geolocation environments in which a resource is located.
     * @param value Value to set for the resourceEnvironments property.
     */
    public void setResourceEnvironments(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceEnvironment> value) {
        this.resourceEnvironments = value;
    }
    /**
     * Sets the resourceRequests property value. Represents a request to add or remove a resource to or from a catalog respectively.
     * @param value Value to set for the resourceRequests property.
     */
    public void setResourceRequests(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceRequest> value) {
        this.resourceRequests = value;
    }
    /**
     * Sets the resourceRoleScopes property value. The resourceRoleScopes property
     * @param value Value to set for the resourceRoleScopes property.
     */
    public void setResourceRoleScopes(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceRoleScope> value) {
        this.resourceRoleScopes = value;
    }
    /**
     * Sets the resources property value. The resources associated with the catalogs.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<AccessPackageResource> value) {
        this.resources = value;
    }
    /**
     * Sets the settings property value. The settings that control the behavior of Azure AD entitlement management.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final EntitlementManagementSettings value) {
        this.settings = value;
    }
}
