package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityProtectionRoot implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new IdentityProtectionRoot and sets the default values.
     */
    public IdentityProtectionRoot() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
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
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
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
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the riskDetections property value. Risk detection in Microsoft Entra ID Protection and the associated information about the detection.
     * @return a java.util.List<RiskDetection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RiskDetection> getRiskDetections() {
        return this.backingStore.get("riskDetections");
    }
    /**
     * Gets the riskyServicePrincipals property value. Microsoft Entra service principals that are at risk.
     * @return a java.util.List<RiskyServicePrincipal>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RiskyServicePrincipal> getRiskyServicePrincipals() {
        return this.backingStore.get("riskyServicePrincipals");
    }
    /**
     * Gets the riskyUsers property value. Users that are flagged as at-risk by Microsoft Entra ID Protection.
     * @return a java.util.List<RiskyUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RiskyUser> getRiskyUsers() {
        return this.backingStore.get("riskyUsers");
    }
    /**
     * Gets the servicePrincipalRiskDetections property value. Represents information about detected at-risk service principals in a Microsoft Entra tenant.
     * @return a java.util.List<ServicePrincipalRiskDetection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePrincipalRiskDetection> getServicePrincipalRiskDetections() {
        return this.backingStore.get("servicePrincipalRiskDetections");
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
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the riskDetections property value. Risk detection in Microsoft Entra ID Protection and the associated information about the detection.
     * @param value Value to set for the riskDetections property.
     */
    public void setRiskDetections(@jakarta.annotation.Nullable final java.util.List<RiskDetection> value) {
        this.backingStore.set("riskDetections", value);
    }
    /**
     * Sets the riskyServicePrincipals property value. Microsoft Entra service principals that are at risk.
     * @param value Value to set for the riskyServicePrincipals property.
     */
    public void setRiskyServicePrincipals(@jakarta.annotation.Nullable final java.util.List<RiskyServicePrincipal> value) {
        this.backingStore.set("riskyServicePrincipals", value);
    }
    /**
     * Sets the riskyUsers property value. Users that are flagged as at-risk by Microsoft Entra ID Protection.
     * @param value Value to set for the riskyUsers property.
     */
    public void setRiskyUsers(@jakarta.annotation.Nullable final java.util.List<RiskyUser> value) {
        this.backingStore.set("riskyUsers", value);
    }
    /**
     * Sets the servicePrincipalRiskDetections property value. Represents information about detected at-risk service principals in a Microsoft Entra tenant.
     * @param value Value to set for the servicePrincipalRiskDetections property.
     */
    public void setServicePrincipalRiskDetections(@jakarta.annotation.Nullable final java.util.List<ServicePrincipalRiskDetection> value) {
        this.backingStore.set("servicePrincipalRiskDetections", value);
    }
}
