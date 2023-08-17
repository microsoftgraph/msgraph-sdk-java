package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AzureActiveDirectoryTenant extends IdentitySource implements Parsable {
    /**
     * The name of the Azure Active Directory tenant. Read only.
     */
    private String displayName;
    /**
     * The ID of the Azure Active Directory tenant. Read only.
     */
    private String tenantId;
    /**
     * Instantiates a new azureActiveDirectoryTenant and sets the default values.
     */
    public AzureActiveDirectoryTenant() {
        super();
        this.setOdataType("#microsoft.graph.azureActiveDirectoryTenant");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a azureActiveDirectoryTenant
     */
    @jakarta.annotation.Nonnull
    public static AzureActiveDirectoryTenant createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureActiveDirectoryTenant();
    }
    /**
     * Gets the displayName property value. The name of the Azure Active Directory tenant. Read only.
     * @return a string
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
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the tenantId property value. The ID of the Azure Active Directory tenant. Read only.
     * @return a string
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
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the displayName property value. The name of the Azure Active Directory tenant. Read only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the tenantId property value. The ID of the Azure Active Directory tenant. Read only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
