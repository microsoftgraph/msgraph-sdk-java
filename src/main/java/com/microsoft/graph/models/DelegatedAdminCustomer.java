package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DelegatedAdminCustomer extends Entity implements Parsable {
    /**
     * The Azure AD display name of the customer tenant. Read-only. Supports $orderBy.
     */
    private String displayName;
    /**
     * Contains the management details of a service in the customer tenant that's managed by delegated administration.
     */
    private java.util.List<DelegatedAdminServiceManagementDetail> serviceManagementDetails;
    /**
     * The Azure AD-assigned tenant ID of the customer. Read-only.
     */
    private String tenantId;
    /**
     * Instantiates a new DelegatedAdminCustomer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DelegatedAdminCustomer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DelegatedAdminCustomer
     */
    @javax.annotation.Nonnull
    public static DelegatedAdminCustomer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminCustomer();
    }
    /**
     * Gets the displayName property value. The Azure AD display name of the customer tenant. Read-only. Supports $orderBy.
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
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("serviceManagementDetails", (n) -> { this.setServiceManagementDetails(n.getCollectionOfObjectValues(DelegatedAdminServiceManagementDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the serviceManagementDetails property value. Contains the management details of a service in the customer tenant that's managed by delegated administration.
     * @return a delegatedAdminServiceManagementDetail
     */
    @javax.annotation.Nullable
    public java.util.List<DelegatedAdminServiceManagementDetail> getServiceManagementDetails() {
        return this.serviceManagementDetails;
    }
    /**
     * Gets the tenantId property value. The Azure AD-assigned tenant ID of the customer. Read-only.
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
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("serviceManagementDetails", this.getServiceManagementDetails());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the displayName property value. The Azure AD display name of the customer tenant. Read-only. Supports $orderBy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the serviceManagementDetails property value. Contains the management details of a service in the customer tenant that's managed by delegated administration.
     * @param value Value to set for the serviceManagementDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceManagementDetails(@javax.annotation.Nullable final java.util.List<DelegatedAdminServiceManagementDetail> value) {
        this.serviceManagementDetails = value;
    }
    /**
     * Sets the tenantId property value. The Azure AD-assigned tenant ID of the customer. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
