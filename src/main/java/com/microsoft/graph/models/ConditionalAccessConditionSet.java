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
public class ConditionalAccessConditionSet implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore backingStore;
    /**
     * Instantiates a new ConditionalAccessConditionSet and sets the default values.
     */
    public ConditionalAccessConditionSet() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConditionalAccessConditionSet
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessConditionSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessConditionSet();
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
     * Gets the applications property value. Applications and user actions included in and excluded from the policy. Required.
     * @return a ConditionalAccessApplications
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessApplications getApplications() {
        return this.backingStore.get("applications");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the clientApplications property value. Client applications (service principals and workload identities) included in and excluded from the policy. Either users or clientApplications is required.
     * @return a ConditionalAccessClientApplications
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessClientApplications getClientApplications() {
        return this.backingStore.get("clientApplications");
    }
    /**
     * Gets the clientAppTypes property value. Client application types included in the policy. Possible values are: all, browser, mobileAppsAndDesktopClients, exchangeActiveSync, easSupported, other. Required.  The easUnsupported enumeration member will be deprecated in favor of exchangeActiveSync which includes EAS supported and unsupported platforms.
     * @return a java.util.List<ConditionalAccessClientApp>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessClientApp> getClientAppTypes() {
        return this.backingStore.get("clientAppTypes");
    }
    /**
     * Gets the devices property value. Devices in the policy.
     * @return a ConditionalAccessDevices
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessDevices getDevices() {
        return this.backingStore.get("devices");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("applications", (n) -> { this.setApplications(n.getObjectValue(ConditionalAccessApplications::createFromDiscriminatorValue)); });
        deserializerMap.put("clientApplications", (n) -> { this.setClientApplications(n.getObjectValue(ConditionalAccessClientApplications::createFromDiscriminatorValue)); });
        deserializerMap.put("clientAppTypes", (n) -> { this.setClientAppTypes(n.getCollectionOfEnumValues(ConditionalAccessClientApp.class)); });
        deserializerMap.put("devices", (n) -> { this.setDevices(n.getObjectValue(ConditionalAccessDevices::createFromDiscriminatorValue)); });
        deserializerMap.put("locations", (n) -> { this.setLocations(n.getObjectValue(ConditionalAccessLocations::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("platforms", (n) -> { this.setPlatforms(n.getObjectValue(ConditionalAccessPlatforms::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePrincipalRiskLevels", (n) -> { this.setServicePrincipalRiskLevels(n.getCollectionOfEnumValues(RiskLevel.class)); });
        deserializerMap.put("signInRiskLevels", (n) -> { this.setSignInRiskLevels(n.getCollectionOfEnumValues(RiskLevel.class)); });
        deserializerMap.put("userRiskLevels", (n) -> { this.setUserRiskLevels(n.getCollectionOfEnumValues(RiskLevel.class)); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getObjectValue(ConditionalAccessUsers::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the locations property value. Locations included in and excluded from the policy.
     * @return a ConditionalAccessLocations
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessLocations getLocations() {
        return this.backingStore.get("locations");
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
     * Gets the platforms property value. Platforms included in and excluded from the policy.
     * @return a ConditionalAccessPlatforms
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessPlatforms getPlatforms() {
        return this.backingStore.get("platforms");
    }
    /**
     * Gets the servicePrincipalRiskLevels property value. Service principal risk levels included in the policy. Possible values are: low, medium, high, none, unknownFutureValue.
     * @return a java.util.List<RiskLevel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RiskLevel> getServicePrincipalRiskLevels() {
        return this.backingStore.get("servicePrincipalRiskLevels");
    }
    /**
     * Gets the signInRiskLevels property value. Sign-in risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue. Required.
     * @return a java.util.List<RiskLevel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RiskLevel> getSignInRiskLevels() {
        return this.backingStore.get("signInRiskLevels");
    }
    /**
     * Gets the userRiskLevels property value. User risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue. Required.
     * @return a java.util.List<RiskLevel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RiskLevel> getUserRiskLevels() {
        return this.backingStore.get("userRiskLevels");
    }
    /**
     * Gets the users property value. Users, groups, and roles included in and excluded from the policy. Either users or clientApplications is required.
     * @return a ConditionalAccessUsers
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessUsers getUsers() {
        return this.backingStore.get("users");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("applications", this.getApplications());
        writer.writeObjectValue("clientApplications", this.getClientApplications());
        writer.writeCollectionOfEnumValues("clientAppTypes", this.getClientAppTypes());
        writer.writeObjectValue("devices", this.getDevices());
        writer.writeObjectValue("locations", this.getLocations());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("platforms", this.getPlatforms());
        writer.writeCollectionOfEnumValues("servicePrincipalRiskLevels", this.getServicePrincipalRiskLevels());
        writer.writeCollectionOfEnumValues("signInRiskLevels", this.getSignInRiskLevels());
        writer.writeCollectionOfEnumValues("userRiskLevels", this.getUserRiskLevels());
        writer.writeObjectValue("users", this.getUsers());
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
     * Sets the applications property value. Applications and user actions included in and excluded from the policy. Required.
     * @param value Value to set for the applications property.
     */
    public void setApplications(@jakarta.annotation.Nullable final ConditionalAccessApplications value) {
        this.backingStore.set("applications", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the clientApplications property value. Client applications (service principals and workload identities) included in and excluded from the policy. Either users or clientApplications is required.
     * @param value Value to set for the clientApplications property.
     */
    public void setClientApplications(@jakarta.annotation.Nullable final ConditionalAccessClientApplications value) {
        this.backingStore.set("clientApplications", value);
    }
    /**
     * Sets the clientAppTypes property value. Client application types included in the policy. Possible values are: all, browser, mobileAppsAndDesktopClients, exchangeActiveSync, easSupported, other. Required.  The easUnsupported enumeration member will be deprecated in favor of exchangeActiveSync which includes EAS supported and unsupported platforms.
     * @param value Value to set for the clientAppTypes property.
     */
    public void setClientAppTypes(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessClientApp> value) {
        this.backingStore.set("clientAppTypes", value);
    }
    /**
     * Sets the devices property value. Devices in the policy.
     * @param value Value to set for the devices property.
     */
    public void setDevices(@jakarta.annotation.Nullable final ConditionalAccessDevices value) {
        this.backingStore.set("devices", value);
    }
    /**
     * Sets the locations property value. Locations included in and excluded from the policy.
     * @param value Value to set for the locations property.
     */
    public void setLocations(@jakarta.annotation.Nullable final ConditionalAccessLocations value) {
        this.backingStore.set("locations", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the platforms property value. Platforms included in and excluded from the policy.
     * @param value Value to set for the platforms property.
     */
    public void setPlatforms(@jakarta.annotation.Nullable final ConditionalAccessPlatforms value) {
        this.backingStore.set("platforms", value);
    }
    /**
     * Sets the servicePrincipalRiskLevels property value. Service principal risk levels included in the policy. Possible values are: low, medium, high, none, unknownFutureValue.
     * @param value Value to set for the servicePrincipalRiskLevels property.
     */
    public void setServicePrincipalRiskLevels(@jakarta.annotation.Nullable final java.util.List<RiskLevel> value) {
        this.backingStore.set("servicePrincipalRiskLevels", value);
    }
    /**
     * Sets the signInRiskLevels property value. Sign-in risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue. Required.
     * @param value Value to set for the signInRiskLevels property.
     */
    public void setSignInRiskLevels(@jakarta.annotation.Nullable final java.util.List<RiskLevel> value) {
        this.backingStore.set("signInRiskLevels", value);
    }
    /**
     * Sets the userRiskLevels property value. User risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue. Required.
     * @param value Value to set for the userRiskLevels property.
     */
    public void setUserRiskLevels(@jakarta.annotation.Nullable final java.util.List<RiskLevel> value) {
        this.backingStore.set("userRiskLevels", value);
    }
    /**
     * Sets the users property value. Users, groups, and roles included in and excluded from the policy. Either users or clientApplications is required.
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final ConditionalAccessUsers value) {
        this.backingStore.set("users", value);
    }
}
