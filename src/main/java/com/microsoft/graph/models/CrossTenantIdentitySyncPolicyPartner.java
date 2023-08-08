package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantIdentitySyncPolicyPartner implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Display name for the cross-tenant user synchronization policy. Use the name of the partner Azure AD (Azure Active Directory) tenant to easily identify the policy. Optional.
     */
    private String displayName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Tenant identifier for the partner Azure AD organization. Read-only.
     */
    private String tenantId;
    /**
     * Defines whether users can be synchronized from the partner tenant. Key.
     */
    private CrossTenantUserSyncInbound userSyncInbound;
    /**
     * Instantiates a new crossTenantIdentitySyncPolicyPartner and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CrossTenantIdentitySyncPolicyPartner() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantIdentitySyncPolicyPartner
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantIdentitySyncPolicyPartner createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantIdentitySyncPolicyPartner();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the displayName property value. Display name for the cross-tenant user synchronization policy. Use the name of the partner Azure AD (Azure Active Directory) tenant to easily identify the policy. Optional.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("userSyncInbound", (n) -> { this.setUserSyncInbound(n.getObjectValue(CrossTenantUserSyncInbound::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the tenantId property value. Tenant identifier for the partner Azure AD organization. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the userSyncInbound property value. Defines whether users can be synchronized from the partner tenant. Key.
     * @return a crossTenantUserSyncInbound
     */
    @jakarta.annotation.Nullable
    public CrossTenantUserSyncInbound getUserSyncInbound() {
        return this.userSyncInbound;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeObjectValue("userSyncInbound", this.getUserSyncInbound());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the displayName property value. Display name for the cross-tenant user synchronization policy. Use the name of the partner Azure AD (Azure Active Directory) tenant to easily identify the policy. Optional.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the tenantId property value. Tenant identifier for the partner Azure AD organization. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the userSyncInbound property value. Defines whether users can be synchronized from the partner tenant. Key.
     * @param value Value to set for the userSyncInbound property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserSyncInbound(@jakarta.annotation.Nullable final CrossTenantUserSyncInbound value) {
        this.userSyncInbound = value;
    }
}
