package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossCloudAzureActiveDirectoryTenant extends IdentitySource implements Parsable {
    /**
     * The ID of the cloud where the tenant is located, one of microsoftonline.com, microsoftonline.us or partner.microsoftonline.cn. Read only.
     */
    private String cloudInstance;
    /**
     * The name of the Azure Active Directory tenant. Read only.
     */
    private String displayName;
    /**
     * The ID of the Azure Active Directory tenant. Read only.
     */
    private String tenantId;
    /**
     * Instantiates a new CrossCloudAzureActiveDirectoryTenant and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CrossCloudAzureActiveDirectoryTenant() {
        super();
        this.setOdataType("#microsoft.graph.crossCloudAzureActiveDirectoryTenant");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CrossCloudAzureActiveDirectoryTenant
     */
    @javax.annotation.Nonnull
    public static CrossCloudAzureActiveDirectoryTenant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossCloudAzureActiveDirectoryTenant();
    }
    /**
     * Gets the cloudInstance property value. The ID of the cloud where the tenant is located, one of microsoftonline.com, microsoftonline.us or partner.microsoftonline.cn. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudInstance() {
        return this.cloudInstance;
    }
    /**
     * Gets the displayName property value. The name of the Azure Active Directory tenant. Read only.
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
        deserializerMap.put("cloudInstance", (n) -> { this.setCloudInstance(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the tenantId property value. The ID of the Azure Active Directory tenant. Read only.
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
        writer.writeStringValue("cloudInstance", this.getCloudInstance());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the cloudInstance property value. The ID of the cloud where the tenant is located, one of microsoftonline.com, microsoftonline.us or partner.microsoftonline.cn. Read only.
     * @param value Value to set for the cloudInstance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudInstance(@javax.annotation.Nullable final String value) {
        this.cloudInstance = value;
    }
    /**
     * Sets the displayName property value. The name of the Azure Active Directory tenant. Read only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the tenantId property value. The ID of the Azure Active Directory tenant. Read only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
