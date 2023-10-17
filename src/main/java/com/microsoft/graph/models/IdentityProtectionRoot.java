package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityProtectionRoot implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Risk detection in Azure AD Identity Protection and the associated information about the detection.
     */
    private java.util.List<RiskDetection> riskDetections;
    /**
     * Azure AD service principals that are at risk.
     */
    private java.util.List<RiskyServicePrincipal> riskyServicePrincipals;
    /**
     * Users that are flagged as at-risk by Azure AD Identity Protection.
     */
    private java.util.List<RiskyUser> riskyUsers;
    /**
     * Represents information about detected at-risk service principals in an Azure AD tenant.
     */
    private java.util.List<ServicePrincipalRiskDetection> servicePrincipalRiskDetections;
    /**
     * Instantiates a new IdentityProtectionRoot and sets the default values.
     */
    public IdentityProtectionRoot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentityProtectionRoot
     */
    @jakarta.annotation.Nonnull
    public static IdentityProtectionRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityProtectionRoot();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("riskDetections", (n) -> { this.setRiskDetections(n.getCollectionOfObjectValues(RiskDetection::createFromDiscriminatorValue)); });
        deserializerMap.put("riskyServicePrincipals", (n) -> { this.setRiskyServicePrincipals(n.getCollectionOfObjectValues(RiskyServicePrincipal::createFromDiscriminatorValue)); });
        deserializerMap.put("riskyUsers", (n) -> { this.setRiskyUsers(n.getCollectionOfObjectValues(RiskyUser::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePrincipalRiskDetections", (n) -> { this.setServicePrincipalRiskDetections(n.getCollectionOfObjectValues(ServicePrincipalRiskDetection::createFromDiscriminatorValue)); });
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
     * Gets the riskDetections property value. Risk detection in Azure AD Identity Protection and the associated information about the detection.
     * @return a java.util.List<RiskDetection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RiskDetection> getRiskDetections() {
        return this.riskDetections;
    }
    /**
     * Gets the riskyServicePrincipals property value. Azure AD service principals that are at risk.
     * @return a java.util.List<RiskyServicePrincipal>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RiskyServicePrincipal> getRiskyServicePrincipals() {
        return this.riskyServicePrincipals;
    }
    /**
     * Gets the riskyUsers property value. Users that are flagged as at-risk by Azure AD Identity Protection.
     * @return a java.util.List<RiskyUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RiskyUser> getRiskyUsers() {
        return this.riskyUsers;
    }
    /**
     * Gets the servicePrincipalRiskDetections property value. Represents information about detected at-risk service principals in an Azure AD tenant.
     * @return a java.util.List<ServicePrincipalRiskDetection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePrincipalRiskDetection> getServicePrincipalRiskDetections() {
        return this.servicePrincipalRiskDetections;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("riskDetections", this.getRiskDetections());
        writer.writeCollectionOfObjectValues("riskyServicePrincipals", this.getRiskyServicePrincipals());
        writer.writeCollectionOfObjectValues("riskyUsers", this.getRiskyUsers());
        writer.writeCollectionOfObjectValues("servicePrincipalRiskDetections", this.getServicePrincipalRiskDetections());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the riskDetections property value. Risk detection in Azure AD Identity Protection and the associated information about the detection.
     * @param value Value to set for the riskDetections property.
     */
    public void setRiskDetections(@jakarta.annotation.Nullable final java.util.List<RiskDetection> value) {
        this.riskDetections = value;
    }
    /**
     * Sets the riskyServicePrincipals property value. Azure AD service principals that are at risk.
     * @param value Value to set for the riskyServicePrincipals property.
     */
    public void setRiskyServicePrincipals(@jakarta.annotation.Nullable final java.util.List<RiskyServicePrincipal> value) {
        this.riskyServicePrincipals = value;
    }
    /**
     * Sets the riskyUsers property value. Users that are flagged as at-risk by Azure AD Identity Protection.
     * @param value Value to set for the riskyUsers property.
     */
    public void setRiskyUsers(@jakarta.annotation.Nullable final java.util.List<RiskyUser> value) {
        this.riskyUsers = value;
    }
    /**
     * Sets the servicePrincipalRiskDetections property value. Represents information about detected at-risk service principals in an Azure AD tenant.
     * @param value Value to set for the servicePrincipalRiskDetections property.
     */
    public void setServicePrincipalRiskDetections(@jakarta.annotation.Nullable final java.util.List<ServicePrincipalRiskDetection> value) {
        this.servicePrincipalRiskDetections = value;
    }
}
