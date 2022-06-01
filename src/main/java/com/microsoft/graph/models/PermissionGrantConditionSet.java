package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the policyRoot singleton. */
public class PermissionGrantConditionSet extends Entity implements Parsable {
    /** A list of appId values for the client applications to match with, or a list with the single value all to match any client application. Default is the single value all. */
    private java.util.List<String> _clientApplicationIds;
    /** A list of Microsoft Partner Network (MPN) IDs for verified publishers of the client application, or a list with the single value all to match with client apps from any publisher. Default is the single value all. */
    private java.util.List<String> _clientApplicationPublisherIds;
    /** Set to true to only match on client applications with a verified publisher. Set to false to match on any client app, even if it does not have a verified publisher. Default is false. */
    private Boolean _clientApplicationsFromVerifiedPublisherOnly;
    /** A list of Azure Active Directory tenant IDs in which the client application is registered, or a list with the single value all to match with client apps registered in any tenant. Default is the single value all. */
    private java.util.List<String> _clientApplicationTenantIds;
    /** The permission classification for the permission being granted, or all to match with any permission classification (including permissions which are not classified). Default is all. */
    private String _permissionClassification;
    /** The list of id values for the specific permissions to match with, or a list with the single value all to match with any permission. The id of delegated permissions can be found in the publishedPermissionScopes property of the API's **servicePrincipal** object. The id of application permissions can be found in the appRoles property of the API's **servicePrincipal** object. The id of resource-specific application permissions can be found in the resourceSpecificApplicationPermissions property of the API's **servicePrincipal** object. Default is the single value all. */
    private java.util.List<String> _permissions;
    /** The permission type of the permission being granted. Possible values: application for application permissions (e.g. app roles), or delegated for delegated permissions. The value delegatedUserConsentable indicates delegated permissions which have not been configured by the API publisher to require admin consent—this value may be used in built-in permission grant policies, but cannot be used in custom permission grant policies. Required. */
    private PermissionType _permissionType;
    /** The appId of the resource application (e.g. the API) for which a permission is being granted, or any to match with any resource application or API. Default is any. */
    private String _resourceApplication;
    /**
     * Instantiates a new permissionGrantConditionSet and sets the default values.
     * @return a void
     */
    public PermissionGrantConditionSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a permissionGrantConditionSet
     */
    @javax.annotation.Nonnull
    public static PermissionGrantConditionSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PermissionGrantConditionSet();
    }
    /**
     * Gets the clientApplicationIds property value. A list of appId values for the client applications to match with, or a list with the single value all to match any client application. Default is the single value all.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getClientApplicationIds() {
        return this._clientApplicationIds;
    }
    /**
     * Gets the clientApplicationPublisherIds property value. A list of Microsoft Partner Network (MPN) IDs for verified publishers of the client application, or a list with the single value all to match with client apps from any publisher. Default is the single value all.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getClientApplicationPublisherIds() {
        return this._clientApplicationPublisherIds;
    }
    /**
     * Gets the clientApplicationsFromVerifiedPublisherOnly property value. Set to true to only match on client applications with a verified publisher. Set to false to match on any client app, even if it does not have a verified publisher. Default is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getClientApplicationsFromVerifiedPublisherOnly() {
        return this._clientApplicationsFromVerifiedPublisherOnly;
    }
    /**
     * Gets the clientApplicationTenantIds property value. A list of Azure Active Directory tenant IDs in which the client application is registered, or a list with the single value all to match with client apps registered in any tenant. Default is the single value all.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getClientApplicationTenantIds() {
        return this._clientApplicationTenantIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PermissionGrantConditionSet currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("clientApplicationIds", (n) -> { currentObject.setClientApplicationIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("clientApplicationPublisherIds", (n) -> { currentObject.setClientApplicationPublisherIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("clientApplicationsFromVerifiedPublisherOnly", (n) -> { currentObject.setClientApplicationsFromVerifiedPublisherOnly(n.getBooleanValue()); });
            this.put("clientApplicationTenantIds", (n) -> { currentObject.setClientApplicationTenantIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("permissionClassification", (n) -> { currentObject.setPermissionClassification(n.getStringValue()); });
            this.put("permissions", (n) -> { currentObject.setPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("permissionType", (n) -> { currentObject.setPermissionType(n.getEnumValue(PermissionType.class)); });
            this.put("resourceApplication", (n) -> { currentObject.setResourceApplication(n.getStringValue()); });
        }};
    }
    /**
     * Gets the permissionClassification property value. The permission classification for the permission being granted, or all to match with any permission classification (including permissions which are not classified). Default is all.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPermissionClassification() {
        return this._permissionClassification;
    }
    /**
     * Gets the permissions property value. The list of id values for the specific permissions to match with, or a list with the single value all to match with any permission. The id of delegated permissions can be found in the publishedPermissionScopes property of the API's **servicePrincipal** object. The id of application permissions can be found in the appRoles property of the API's **servicePrincipal** object. The id of resource-specific application permissions can be found in the resourceSpecificApplicationPermissions property of the API's **servicePrincipal** object. Default is the single value all.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPermissions() {
        return this._permissions;
    }
    /**
     * Gets the permissionType property value. The permission type of the permission being granted. Possible values: application for application permissions (e.g. app roles), or delegated for delegated permissions. The value delegatedUserConsentable indicates delegated permissions which have not been configured by the API publisher to require admin consent—this value may be used in built-in permission grant policies, but cannot be used in custom permission grant policies. Required.
     * @return a permissionType
     */
    @javax.annotation.Nullable
    public PermissionType getPermissionType() {
        return this._permissionType;
    }
    /**
     * Gets the resourceApplication property value. The appId of the resource application (e.g. the API) for which a permission is being granted, or any to match with any resource application or API. Default is any.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceApplication() {
        return this._resourceApplication;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("clientApplicationIds", this.getClientApplicationIds());
        writer.writeCollectionOfPrimitiveValues("clientApplicationPublisherIds", this.getClientApplicationPublisherIds());
        writer.writeBooleanValue("clientApplicationsFromVerifiedPublisherOnly", this.getClientApplicationsFromVerifiedPublisherOnly());
        writer.writeCollectionOfPrimitiveValues("clientApplicationTenantIds", this.getClientApplicationTenantIds());
        writer.writeStringValue("permissionClassification", this.getPermissionClassification());
        writer.writeCollectionOfPrimitiveValues("permissions", this.getPermissions());
        writer.writeEnumValue("permissionType", this.getPermissionType());
        writer.writeStringValue("resourceApplication", this.getResourceApplication());
    }
    /**
     * Sets the clientApplicationIds property value. A list of appId values for the client applications to match with, or a list with the single value all to match any client application. Default is the single value all.
     * @param value Value to set for the clientApplicationIds property.
     * @return a void
     */
    public void setClientApplicationIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._clientApplicationIds = value;
    }
    /**
     * Sets the clientApplicationPublisherIds property value. A list of Microsoft Partner Network (MPN) IDs for verified publishers of the client application, or a list with the single value all to match with client apps from any publisher. Default is the single value all.
     * @param value Value to set for the clientApplicationPublisherIds property.
     * @return a void
     */
    public void setClientApplicationPublisherIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._clientApplicationPublisherIds = value;
    }
    /**
     * Sets the clientApplicationsFromVerifiedPublisherOnly property value. Set to true to only match on client applications with a verified publisher. Set to false to match on any client app, even if it does not have a verified publisher. Default is false.
     * @param value Value to set for the clientApplicationsFromVerifiedPublisherOnly property.
     * @return a void
     */
    public void setClientApplicationsFromVerifiedPublisherOnly(@javax.annotation.Nullable final Boolean value) {
        this._clientApplicationsFromVerifiedPublisherOnly = value;
    }
    /**
     * Sets the clientApplicationTenantIds property value. A list of Azure Active Directory tenant IDs in which the client application is registered, or a list with the single value all to match with client apps registered in any tenant. Default is the single value all.
     * @param value Value to set for the clientApplicationTenantIds property.
     * @return a void
     */
    public void setClientApplicationTenantIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._clientApplicationTenantIds = value;
    }
    /**
     * Sets the permissionClassification property value. The permission classification for the permission being granted, or all to match with any permission classification (including permissions which are not classified). Default is all.
     * @param value Value to set for the permissionClassification property.
     * @return a void
     */
    public void setPermissionClassification(@javax.annotation.Nullable final String value) {
        this._permissionClassification = value;
    }
    /**
     * Sets the permissions property value. The list of id values for the specific permissions to match with, or a list with the single value all to match with any permission. The id of delegated permissions can be found in the publishedPermissionScopes property of the API's **servicePrincipal** object. The id of application permissions can be found in the appRoles property of the API's **servicePrincipal** object. The id of resource-specific application permissions can be found in the resourceSpecificApplicationPermissions property of the API's **servicePrincipal** object. Default is the single value all.
     * @param value Value to set for the permissions property.
     * @return a void
     */
    public void setPermissions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._permissions = value;
    }
    /**
     * Sets the permissionType property value. The permission type of the permission being granted. Possible values: application for application permissions (e.g. app roles), or delegated for delegated permissions. The value delegatedUserConsentable indicates delegated permissions which have not been configured by the API publisher to require admin consent—this value may be used in built-in permission grant policies, but cannot be used in custom permission grant policies. Required.
     * @param value Value to set for the permissionType property.
     * @return a void
     */
    public void setPermissionType(@javax.annotation.Nullable final PermissionType value) {
        this._permissionType = value;
    }
    /**
     * Sets the resourceApplication property value. The appId of the resource application (e.g. the API) for which a permission is being granted, or any to match with any resource application or API. Default is any.
     * @param value Value to set for the resourceApplication property.
     * @return a void
     */
    public void setResourceApplication(@javax.annotation.Nullable final String value) {
        this._resourceApplication = value;
    }
}
