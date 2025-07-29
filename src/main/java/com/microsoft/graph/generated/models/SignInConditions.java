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
public class SignInConditions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SignInConditions} and sets the default values.
     */
    public SignInConditions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SignInConditions}
     */
    @jakarta.annotation.Nonnull
    public static SignInConditions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignInConditions();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the authenticationFlow property value. Type of authentication flow. The possible value is: deviceCodeFlow or authenticationTransfer. Default value is none.
     * @return a {@link AuthenticationFlow}
     */
    @jakarta.annotation.Nullable
    public AuthenticationFlow getAuthenticationFlow() {
        return this.backingStore.get("authenticationFlow");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the clientAppType property value. Client application type. The possible value is: all, browser, mobileAppsAndDesktopClients, exchangeActiveSync, easSupported, other, unknownFutureValue. Default value is all.
     * @return a {@link ConditionalAccessClientApp}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessClientApp getClientAppType() {
        return this.backingStore.get("clientAppType");
    }
    /**
     * Gets the country property value. Country from where the identity is authenticating.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.backingStore.get("country");
    }
    /**
     * Gets the deviceInfo property value. Information about the device used for the sign-in.
     * @return a {@link DeviceInfo}
     */
    @jakarta.annotation.Nullable
    public DeviceInfo getDeviceInfo() {
        return this.backingStore.get("deviceInfo");
    }
    /**
     * Gets the devicePlatform property value. Device platform. The possible value is: android, iOS, windows, windowsPhone, macOS, all, unknownFutureValue, linux. Default value is all.
     * @return a {@link ConditionalAccessDevicePlatform}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessDevicePlatform getDevicePlatform() {
        return this.backingStore.get("devicePlatform");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("authenticationFlow", (n) -> { this.setAuthenticationFlow(n.getObjectValue(AuthenticationFlow::createFromDiscriminatorValue)); });
        deserializerMap.put("clientAppType", (n) -> { this.setClientAppType(n.getEnumValue(ConditionalAccessClientApp::forValue)); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("deviceInfo", (n) -> { this.setDeviceInfo(n.getObjectValue(DeviceInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("devicePlatform", (n) -> { this.setDevicePlatform(n.getEnumValue(ConditionalAccessDevicePlatform::forValue)); });
        deserializerMap.put("insiderRiskLevel", (n) -> { this.setInsiderRiskLevel(n.getEnumValue(InsiderRiskLevel::forValue)); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("servicePrincipalRiskLevel", (n) -> { this.setServicePrincipalRiskLevel(n.getEnumValue(RiskLevel::forValue)); });
        deserializerMap.put("signInRiskLevel", (n) -> { this.setSignInRiskLevel(n.getEnumValue(RiskLevel::forValue)); });
        deserializerMap.put("userRiskLevel", (n) -> { this.setUserRiskLevel(n.getEnumValue(RiskLevel::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the insiderRiskLevel property value. Insider risk associated with the authenticating user. The possible value is: none, minor, moderate, elevated, unknownFutureValue. Default value is none.
     * @return a {@link InsiderRiskLevel}
     */
    @jakarta.annotation.Nullable
    public InsiderRiskLevel getInsiderRiskLevel() {
        return this.backingStore.get("insiderRiskLevel");
    }
    /**
     * Gets the ipAddress property value. Ip address of the authenticating identity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.backingStore.get("ipAddress");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the servicePrincipalRiskLevel property value. Risk associated with the service principal. The possible value is: low, medium, high, hidden, none, unknownFutureValue. Default value is none.
     * @return a {@link RiskLevel}
     */
    @jakarta.annotation.Nullable
    public RiskLevel getServicePrincipalRiskLevel() {
        return this.backingStore.get("servicePrincipalRiskLevel");
    }
    /**
     * Gets the signInRiskLevel property value. Sign-in risk associated with the user. The possible value is: low, medium, high, hidden, none, unknownFutureValue. Default value is none.
     * @return a {@link RiskLevel}
     */
    @jakarta.annotation.Nullable
    public RiskLevel getSignInRiskLevel() {
        return this.backingStore.get("signInRiskLevel");
    }
    /**
     * Gets the userRiskLevel property value. The authenticating user&apos;s risk level. The possible value is: low, medium, high, hidden, none, unknownFutureValue. Default value is none.
     * @return a {@link RiskLevel}
     */
    @jakarta.annotation.Nullable
    public RiskLevel getUserRiskLevel() {
        return this.backingStore.get("userRiskLevel");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authenticationFlow", this.getAuthenticationFlow());
        writer.writeEnumValue("clientAppType", this.getClientAppType());
        writer.writeStringValue("country", this.getCountry());
        writer.writeObjectValue("deviceInfo", this.getDeviceInfo());
        writer.writeEnumValue("devicePlatform", this.getDevicePlatform());
        writer.writeEnumValue("insiderRiskLevel", this.getInsiderRiskLevel());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("servicePrincipalRiskLevel", this.getServicePrincipalRiskLevel());
        writer.writeEnumValue("signInRiskLevel", this.getSignInRiskLevel());
        writer.writeEnumValue("userRiskLevel", this.getUserRiskLevel());
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
     * Sets the authenticationFlow property value. Type of authentication flow. The possible value is: deviceCodeFlow or authenticationTransfer. Default value is none.
     * @param value Value to set for the authenticationFlow property.
     */
    public void setAuthenticationFlow(@jakarta.annotation.Nullable final AuthenticationFlow value) {
        this.backingStore.set("authenticationFlow", value);
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
     * Sets the clientAppType property value. Client application type. The possible value is: all, browser, mobileAppsAndDesktopClients, exchangeActiveSync, easSupported, other, unknownFutureValue. Default value is all.
     * @param value Value to set for the clientAppType property.
     */
    public void setClientAppType(@jakarta.annotation.Nullable final ConditionalAccessClientApp value) {
        this.backingStore.set("clientAppType", value);
    }
    /**
     * Sets the country property value. Country from where the identity is authenticating.
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("country", value);
    }
    /**
     * Sets the deviceInfo property value. Information about the device used for the sign-in.
     * @param value Value to set for the deviceInfo property.
     */
    public void setDeviceInfo(@jakarta.annotation.Nullable final DeviceInfo value) {
        this.backingStore.set("deviceInfo", value);
    }
    /**
     * Sets the devicePlatform property value. Device platform. The possible value is: android, iOS, windows, windowsPhone, macOS, all, unknownFutureValue, linux. Default value is all.
     * @param value Value to set for the devicePlatform property.
     */
    public void setDevicePlatform(@jakarta.annotation.Nullable final ConditionalAccessDevicePlatform value) {
        this.backingStore.set("devicePlatform", value);
    }
    /**
     * Sets the insiderRiskLevel property value. Insider risk associated with the authenticating user. The possible value is: none, minor, moderate, elevated, unknownFutureValue. Default value is none.
     * @param value Value to set for the insiderRiskLevel property.
     */
    public void setInsiderRiskLevel(@jakarta.annotation.Nullable final InsiderRiskLevel value) {
        this.backingStore.set("insiderRiskLevel", value);
    }
    /**
     * Sets the ipAddress property value. Ip address of the authenticating identity.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipAddress", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the servicePrincipalRiskLevel property value. Risk associated with the service principal. The possible value is: low, medium, high, hidden, none, unknownFutureValue. Default value is none.
     * @param value Value to set for the servicePrincipalRiskLevel property.
     */
    public void setServicePrincipalRiskLevel(@jakarta.annotation.Nullable final RiskLevel value) {
        this.backingStore.set("servicePrincipalRiskLevel", value);
    }
    /**
     * Sets the signInRiskLevel property value. Sign-in risk associated with the user. The possible value is: low, medium, high, hidden, none, unknownFutureValue. Default value is none.
     * @param value Value to set for the signInRiskLevel property.
     */
    public void setSignInRiskLevel(@jakarta.annotation.Nullable final RiskLevel value) {
        this.backingStore.set("signInRiskLevel", value);
    }
    /**
     * Sets the userRiskLevel property value. The authenticating user&apos;s risk level. The possible value is: low, medium, high, hidden, none, unknownFutureValue. Default value is none.
     * @param value Value to set for the userRiskLevel property.
     */
    public void setUserRiskLevel(@jakarta.annotation.Nullable final RiskLevel value) {
        this.backingStore.set("userRiskLevel", value);
    }
}
