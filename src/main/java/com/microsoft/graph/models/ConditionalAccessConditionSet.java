package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessConditionSet implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Applications and user actions included in and excluded from the policy. Required. */
    private ConditionalAccessApplications _applications;
    /** Client applications (service principals and workload identities) included in and excluded from the policy. Either users or clientApplications is required. */
    private ConditionalAccessClientApplications _clientApplications;
    /** Client application types included in the policy. Possible values are: all, browser, mobileAppsAndDesktopClients, exchangeActiveSync, easSupported, other. Required. */
    private java.util.List<ConditionalAccessClientApp> _clientAppTypes;
    /** Devices in the policy. */
    private ConditionalAccessDevices _devices;
    /** Locations included in and excluded from the policy. */
    private ConditionalAccessLocations _locations;
    /** The OdataType property */
    private String _odataType;
    /** Platforms included in and excluded from the policy. */
    private ConditionalAccessPlatforms _platforms;
    /** Service principal risk levels included in the policy. Possible values are: low, medium, high, none, unknownFutureValue. */
    private java.util.List<RiskLevel> _servicePrincipalRiskLevels;
    /** Sign-in risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue. Required. */
    private java.util.List<RiskLevel> _signInRiskLevels;
    /** User risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue. Required. */
    private java.util.List<RiskLevel> _userRiskLevels;
    /** Users, groups, and roles included in and excluded from the policy. Either users or clientApplications is required. */
    private ConditionalAccessUsers _users;
    /**
     * Instantiates a new conditionalAccessConditionSet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessConditionSet() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessConditionSet
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessConditionSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessConditionSet();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the applications property value. Applications and user actions included in and excluded from the policy. Required.
     * @return a conditionalAccessApplications
     */
    @javax.annotation.Nullable
    public ConditionalAccessApplications getApplications() {
        return this._applications;
    }
    /**
     * Gets the clientApplications property value. Client applications (service principals and workload identities) included in and excluded from the policy. Either users or clientApplications is required.
     * @return a conditionalAccessClientApplications
     */
    @javax.annotation.Nullable
    public ConditionalAccessClientApplications getClientApplications() {
        return this._clientApplications;
    }
    /**
     * Gets the clientAppTypes property value. Client application types included in the policy. Possible values are: all, browser, mobileAppsAndDesktopClients, exchangeActiveSync, easSupported, other. Required.
     * @return a conditionalAccessClientApp
     */
    @javax.annotation.Nullable
    public java.util.List<ConditionalAccessClientApp> getClientAppTypes() {
        return this._clientAppTypes;
    }
    /**
     * Gets the devices property value. Devices in the policy.
     * @return a conditionalAccessDevices
     */
    @javax.annotation.Nullable
    public ConditionalAccessDevices getDevices() {
        return this._devices;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(11);
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
     * @return a conditionalAccessLocations
     */
    @javax.annotation.Nullable
    public ConditionalAccessLocations getLocations() {
        return this._locations;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the platforms property value. Platforms included in and excluded from the policy.
     * @return a conditionalAccessPlatforms
     */
    @javax.annotation.Nullable
    public ConditionalAccessPlatforms getPlatforms() {
        return this._platforms;
    }
    /**
     * Gets the servicePrincipalRiskLevels property value. Service principal risk levels included in the policy. Possible values are: low, medium, high, none, unknownFutureValue.
     * @return a riskLevel
     */
    @javax.annotation.Nullable
    public java.util.List<RiskLevel> getServicePrincipalRiskLevels() {
        return this._servicePrincipalRiskLevels;
    }
    /**
     * Gets the signInRiskLevels property value. Sign-in risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue. Required.
     * @return a riskLevel
     */
    @javax.annotation.Nullable
    public java.util.List<RiskLevel> getSignInRiskLevels() {
        return this._signInRiskLevels;
    }
    /**
     * Gets the userRiskLevels property value. User risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue. Required.
     * @return a riskLevel
     */
    @javax.annotation.Nullable
    public java.util.List<RiskLevel> getUserRiskLevels() {
        return this._userRiskLevels;
    }
    /**
     * Gets the users property value. Users, groups, and roles included in and excluded from the policy. Either users or clientApplications is required.
     * @return a conditionalAccessUsers
     */
    @javax.annotation.Nullable
    public ConditionalAccessUsers getUsers() {
        return this._users;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the applications property value. Applications and user actions included in and excluded from the policy. Required.
     * @param value Value to set for the applications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplications(@javax.annotation.Nullable final ConditionalAccessApplications value) {
        this._applications = value;
    }
    /**
     * Sets the clientApplications property value. Client applications (service principals and workload identities) included in and excluded from the policy. Either users or clientApplications is required.
     * @param value Value to set for the clientApplications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientApplications(@javax.annotation.Nullable final ConditionalAccessClientApplications value) {
        this._clientApplications = value;
    }
    /**
     * Sets the clientAppTypes property value. Client application types included in the policy. Possible values are: all, browser, mobileAppsAndDesktopClients, exchangeActiveSync, easSupported, other. Required.
     * @param value Value to set for the clientAppTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientAppTypes(@javax.annotation.Nullable final java.util.List<ConditionalAccessClientApp> value) {
        this._clientAppTypes = value;
    }
    /**
     * Sets the devices property value. Devices in the policy.
     * @param value Value to set for the devices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDevices(@javax.annotation.Nullable final ConditionalAccessDevices value) {
        this._devices = value;
    }
    /**
     * Sets the locations property value. Locations included in and excluded from the policy.
     * @param value Value to set for the locations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocations(@javax.annotation.Nullable final ConditionalAccessLocations value) {
        this._locations = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the platforms property value. Platforms included in and excluded from the policy.
     * @param value Value to set for the platforms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatforms(@javax.annotation.Nullable final ConditionalAccessPlatforms value) {
        this._platforms = value;
    }
    /**
     * Sets the servicePrincipalRiskLevels property value. Service principal risk levels included in the policy. Possible values are: low, medium, high, none, unknownFutureValue.
     * @param value Value to set for the servicePrincipalRiskLevels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalRiskLevels(@javax.annotation.Nullable final java.util.List<RiskLevel> value) {
        this._servicePrincipalRiskLevels = value;
    }
    /**
     * Sets the signInRiskLevels property value. Sign-in risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue. Required.
     * @param value Value to set for the signInRiskLevels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignInRiskLevels(@javax.annotation.Nullable final java.util.List<RiskLevel> value) {
        this._signInRiskLevels = value;
    }
    /**
     * Sets the userRiskLevels property value. User risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue. Required.
     * @param value Value to set for the userRiskLevels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRiskLevels(@javax.annotation.Nullable final java.util.List<RiskLevel> value) {
        this._userRiskLevels = value;
    }
    /**
     * Sets the users property value. Users, groups, and roles included in and excluded from the policy. Either users or clientApplications is required.
     * @param value Value to set for the users property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsers(@javax.annotation.Nullable final ConditionalAccessUsers value) {
        this._users = value;
    }
}
