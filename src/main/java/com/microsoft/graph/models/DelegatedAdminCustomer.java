package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DelegatedAdminCustomer extends Entity implements Parsable {
    /**
     * The Microsoft Entra ID display name of the customer tenant. Read-only. Supports $orderby.
     */
    private String displayName;
    /**
     * Contains the management details of a service in the customer tenant that's managed by delegated administration.
     */
    private java.util.List<DelegatedAdminServiceManagementDetail> serviceManagementDetails;
    /**
     * The Microsoft Entra ID-assigned tenant ID of the customer. Read-only.
     */
    private String tenantId;
    /**
     * Instantiates a new DelegatedAdminCustomer and sets the default values.
     */
    public DelegatedAdminCustomer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DelegatedAdminCustomer
     */
    @jakarta.annotation.Nonnull
    public static DelegatedAdminCustomer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminCustomer();
    }
    /**
     * Gets the displayName property value. The Microsoft Entra ID display name of the customer tenant. Read-only. Supports $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("serviceManagementDetails", (n) -> { this.setServiceManagementDetails(n.getCollectionOfObjectValues(DelegatedAdminServiceManagementDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the serviceManagementDetails property value. Contains the management details of a service in the customer tenant that's managed by delegated administration.
     * @return a java.util.List<DelegatedAdminServiceManagementDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DelegatedAdminServiceManagementDetail> getServiceManagementDetails() {
        return this.serviceManagementDetails;
    }
    /**
     * Gets the tenantId property value. The Microsoft Entra ID-assigned tenant ID of the customer. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("serviceManagementDetails", this.getServiceManagementDetails());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the displayName property value. The Microsoft Entra ID display name of the customer tenant. Read-only. Supports $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the serviceManagementDetails property value. Contains the management details of a service in the customer tenant that's managed by delegated administration.
     * @param value Value to set for the serviceManagementDetails property.
     */
    public void setServiceManagementDetails(@jakarta.annotation.Nullable final java.util.List<DelegatedAdminServiceManagementDetail> value) {
        this.serviceManagementDetails = value;
    }
    /**
     * Sets the tenantId property value. The Microsoft Entra ID-assigned tenant ID of the customer. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
