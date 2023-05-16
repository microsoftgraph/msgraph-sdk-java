package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RiskyServicePrincipal extends Entity implements Parsable {
    /** The globally unique identifier for the associated application (its appId property), if any. */
    private String appId;
    /** The display name for the service principal. */
    private String displayName;
    /** Represents the risk history of Azure AD service principals. */
    private java.util.List<RiskyServicePrincipalHistoryItem> history;
    /** true if the service principal account is enabled; otherwise, false. */
    private Boolean isEnabled;
    /** Indicates whether Azure AD is currently processing the service principal's risky state. */
    private Boolean isProcessing;
    /** Details of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: none, hidden,  unknownFutureValue, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal. */
    private RiskDetail riskDetail;
    /** The date and time that the risk state was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2021 is 2021-01-01T00:00:00Z. Supports $filter (eq). */
    private OffsetDateTime riskLastUpdatedDateTime;
    /** Level of the detected risky workload identity. The possible values are: low, medium, high, hidden, none, unknownFutureValue. Supports $filter (eq). */
    private RiskLevel riskLevel;
    /** State of the service principal's risk. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue. */
    private RiskState riskState;
    /** Identifies whether the service principal represents an Application, a ManagedIdentity, or a legacy application (socialIdp). This is set by Azure AD internally and is inherited from servicePrincipal. */
    private String servicePrincipalType;
    /**
     * Instantiates a new riskyServicePrincipal and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RiskyServicePrincipal() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a riskyServicePrincipal
     */
    @javax.annotation.Nonnull
    public static RiskyServicePrincipal createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.riskyServicePrincipalHistoryItem": return new RiskyServicePrincipalHistoryItem();
            }
        }
        return new RiskyServicePrincipal();
    }
    /**
     * Gets the appId property value. The globally unique identifier for the associated application (its appId property), if any.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the displayName property value. The display name for the service principal.
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
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("history", (n) -> { this.setHistory(n.getCollectionOfObjectValues(RiskyServicePrincipalHistoryItem::createFromDiscriminatorValue)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isProcessing", (n) -> { this.setIsProcessing(n.getBooleanValue()); });
        deserializerMap.put("riskDetail", (n) -> { this.setRiskDetail(n.getEnumValue(RiskDetail.class)); });
        deserializerMap.put("riskLastUpdatedDateTime", (n) -> { this.setRiskLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("riskLevel", (n) -> { this.setRiskLevel(n.getEnumValue(RiskLevel.class)); });
        deserializerMap.put("riskState", (n) -> { this.setRiskState(n.getEnumValue(RiskState.class)); });
        deserializerMap.put("servicePrincipalType", (n) -> { this.setServicePrincipalType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. Represents the risk history of Azure AD service principals.
     * @return a riskyServicePrincipalHistoryItem
     */
    @javax.annotation.Nullable
    public java.util.List<RiskyServicePrincipalHistoryItem> getHistory() {
        return this.history;
    }
    /**
     * Gets the isEnabled property value. true if the service principal account is enabled; otherwise, false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the isProcessing property value. Indicates whether Azure AD is currently processing the service principal's risky state.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsProcessing() {
        return this.isProcessing;
    }
    /**
     * Gets the riskDetail property value. Details of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: none, hidden,  unknownFutureValue, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal.
     * @return a riskDetail
     */
    @javax.annotation.Nullable
    public RiskDetail getRiskDetail() {
        return this.riskDetail;
    }
    /**
     * Gets the riskLastUpdatedDateTime property value. The date and time that the risk state was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2021 is 2021-01-01T00:00:00Z. Supports $filter (eq).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRiskLastUpdatedDateTime() {
        return this.riskLastUpdatedDateTime;
    }
    /**
     * Gets the riskLevel property value. Level of the detected risky workload identity. The possible values are: low, medium, high, hidden, none, unknownFutureValue. Supports $filter (eq).
     * @return a riskLevel
     */
    @javax.annotation.Nullable
    public RiskLevel getRiskLevel() {
        return this.riskLevel;
    }
    /**
     * Gets the riskState property value. State of the service principal's risk. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     * @return a riskState
     */
    @javax.annotation.Nullable
    public RiskState getRiskState() {
        return this.riskState;
    }
    /**
     * Gets the servicePrincipalType property value. Identifies whether the service principal represents an Application, a ManagedIdentity, or a legacy application (socialIdp). This is set by Azure AD internally and is inherited from servicePrincipal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalType() {
        return this.servicePrincipalType;
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
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeBooleanValue("isProcessing", this.getIsProcessing());
        writer.writeEnumValue("riskDetail", this.getRiskDetail());
        writer.writeOffsetDateTimeValue("riskLastUpdatedDateTime", this.getRiskLastUpdatedDateTime());
        writer.writeEnumValue("riskLevel", this.getRiskLevel());
        writer.writeEnumValue("riskState", this.getRiskState());
        writer.writeStringValue("servicePrincipalType", this.getServicePrincipalType());
    }
    /**
     * Sets the appId property value. The globally unique identifier for the associated application (its appId property), if any.
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the displayName property value. The display name for the service principal.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the history property value. Represents the risk history of Azure AD service principals.
     * @param value Value to set for the history property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHistory(@javax.annotation.Nullable final java.util.List<RiskyServicePrincipalHistoryItem> value) {
        this.history = value;
    }
    /**
     * Sets the isEnabled property value. true if the service principal account is enabled; otherwise, false.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the isProcessing property value. Indicates whether Azure AD is currently processing the service principal's risky state.
     * @param value Value to set for the isProcessing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsProcessing(@javax.annotation.Nullable final Boolean value) {
        this.isProcessing = value;
    }
    /**
     * Sets the riskDetail property value. Details of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: none, hidden,  unknownFutureValue, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal.
     * @param value Value to set for the riskDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskDetail(@javax.annotation.Nullable final RiskDetail value) {
        this.riskDetail = value;
    }
    /**
     * Sets the riskLastUpdatedDateTime property value. The date and time that the risk state was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2021 is 2021-01-01T00:00:00Z. Supports $filter (eq).
     * @param value Value to set for the riskLastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.riskLastUpdatedDateTime = value;
    }
    /**
     * Sets the riskLevel property value. Level of the detected risky workload identity. The possible values are: low, medium, high, hidden, none, unknownFutureValue. Supports $filter (eq).
     * @param value Value to set for the riskLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskLevel(@javax.annotation.Nullable final RiskLevel value) {
        this.riskLevel = value;
    }
    /**
     * Sets the riskState property value. State of the service principal's risk. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     * @param value Value to set for the riskState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskState(@javax.annotation.Nullable final RiskState value) {
        this.riskState = value;
    }
    /**
     * Sets the servicePrincipalType property value. Identifies whether the service principal represents an Application, a ManagedIdentity, or a legacy application (socialIdp). This is set by Azure AD internally and is inherited from servicePrincipal.
     * @param value Value to set for the servicePrincipalType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalType(@javax.annotation.Nullable final String value) {
        this.servicePrincipalType = value;
    }
}
