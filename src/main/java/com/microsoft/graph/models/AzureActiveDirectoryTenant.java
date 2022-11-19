package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AzureActiveDirectoryTenant extends IdentitySource implements Parsable {
    /** The name of the Azure Active Directory tenant. Read only. */
    private String _displayName;
    /** The ID of the Azure Active Directory tenant. Read only. */
    private String _tenantId;
    /**
     * Instantiates a new AzureActiveDirectoryTenant and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AzureActiveDirectoryTenant() {
        super();
        this.setOdataType("#microsoft.graph.azureActiveDirectoryTenant");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AzureActiveDirectoryTenant
     */
    @javax.annotation.Nonnull
    public static AzureActiveDirectoryTenant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureActiveDirectoryTenant();
    }
    /**
     * Gets the displayName property value. The name of the Azure Active Directory tenant. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AzureActiveDirectoryTenant currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the tenantId property value. The ID of the Azure Active Directory tenant. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
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
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the displayName property value. The name of the Azure Active Directory tenant. Read only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the tenantId property value. The ID of the Azure Active Directory tenant. Read only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
