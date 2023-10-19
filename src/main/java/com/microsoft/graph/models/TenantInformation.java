package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantInformation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Primary domain name of an Azure AD tenant.
     */
    private String defaultDomainName;
    /**
     * Display name of an Azure AD tenant.
     */
    private String displayName;
    /**
     * Name shown to users that sign in to an Azure AD tenant.
     */
    private String federationBrandName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Unique identifier of an Azure AD tenant.
     */
    private String tenantId;
    /**
     * Instantiates a new TenantInformation and sets the default values.
     */
    public TenantInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TenantInformation
     */
    @jakarta.annotation.Nonnull
    public static TenantInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantInformation();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the defaultDomainName property value. Primary domain name of an Azure AD tenant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultDomainName() {
        return this.defaultDomainName;
    }
    /**
     * Gets the displayName property value. Display name of an Azure AD tenant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the federationBrandName property value. Name shown to users that sign in to an Azure AD tenant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFederationBrandName() {
        return this.federationBrandName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("defaultDomainName", (n) -> { this.setDefaultDomainName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("federationBrandName", (n) -> { this.setFederationBrandName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the tenantId property value. Unique identifier of an Azure AD tenant.
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
        writer.writeStringValue("defaultDomainName", this.getDefaultDomainName());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("federationBrandName", this.getFederationBrandName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the defaultDomainName property value. Primary domain name of an Azure AD tenant.
     * @param value Value to set for the defaultDomainName property.
     */
    public void setDefaultDomainName(@jakarta.annotation.Nullable final String value) {
        this.defaultDomainName = value;
    }
    /**
     * Sets the displayName property value. Display name of an Azure AD tenant.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the federationBrandName property value. Name shown to users that sign in to an Azure AD tenant.
     * @param value Value to set for the federationBrandName property.
     */
    public void setFederationBrandName(@jakarta.annotation.Nullable final String value) {
        this.federationBrandName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the tenantId property value. Unique identifier of an Azure AD tenant.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
