package com.microsoft.graph.models.teamsadministration;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NumberAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link NumberAssignment} and sets the default values.
     */
    public NumberAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NumberAssignment}
     */
    @jakarta.annotation.Nonnull
    public static NumberAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NumberAssignment();
    }
    /**
     * Gets the activationState property value. The activationState property
     * @return a {@link ActivationState}
     */
    @jakarta.annotation.Nullable
    public ActivationState getActivationState() {
        return this.backingStore.get("activationState");
    }
    /**
     * Gets the assignmentCategory property value. Contains the assignment category such as Primary or Private. The possible values are: primary, private, alternate, unknownFutureValue.
     * @return a {@link AssignmentCategory}
     */
    @jakarta.annotation.Nullable
    public AssignmentCategory getAssignmentCategory() {
        return this.backingStore.get("assignmentCategory");
    }
    /**
     * Gets the assignmentStatus property value. The assignment status of the phone number. The possible values are: unassigned, internalError, userAssigned, conferenceAssigned, voiceApplicationAssigned, thirdPartyAppAssigned, policyAssigned, unknownFutureValue.
     * @return a {@link AssignmentStatus}
     */
    @jakarta.annotation.Nullable
    public AssignmentStatus getAssignmentStatus() {
        return this.backingStore.get("assignmentStatus");
    }
    /**
     * Gets the assignmentTargetId property value. The ID of the object the phone number is assigned to, either the ObjectId of a user or resource account, or the policy instance ID of a Teams shared calling routing policy instance.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignmentTargetId() {
        return this.backingStore.get("assignmentTargetId");
    }
    /**
     * Gets the capabilities property value. The list of capabilities assigned to the phone number.
     * @return a {@link java.util.List<NumberCapability>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NumberCapability> getCapabilities() {
        return this.backingStore.get("capabilities");
    }
    /**
     * Gets the city property value. The city where the phone number is located or associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.backingStore.get("city");
    }
    /**
     * Gets the civicAddressId property value. The ID of the civic address assigned to the phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCivicAddressId() {
        return this.backingStore.get("civicAddressId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activationState", (n) -> { this.setActivationState(n.getEnumValue(ActivationState::forValue)); });
        deserializerMap.put("assignmentCategory", (n) -> { this.setAssignmentCategory(n.getEnumValue(AssignmentCategory::forValue)); });
        deserializerMap.put("assignmentStatus", (n) -> { this.setAssignmentStatus(n.getEnumValue(AssignmentStatus::forValue)); });
        deserializerMap.put("assignmentTargetId", (n) -> { this.setAssignmentTargetId(n.getStringValue()); });
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getCollectionOfEnumValues(NumberCapability::forValue)); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("civicAddressId", (n) -> { this.setCivicAddressId(n.getStringValue()); });
        deserializerMap.put("isoCountryCode", (n) -> { this.setIsoCountryCode(n.getStringValue()); });
        deserializerMap.put("locationId", (n) -> { this.setLocationId(n.getStringValue()); });
        deserializerMap.put("networkSiteId", (n) -> { this.setNetworkSiteId(n.getStringValue()); });
        deserializerMap.put("numberSource", (n) -> { this.setNumberSource(n.getEnumValue(NumberSource::forValue)); });
        deserializerMap.put("numberType", (n) -> { this.setNumberType(n.getEnumValue(NumberType::forValue)); });
        deserializerMap.put("operatorId", (n) -> { this.setOperatorId(n.getStringValue()); });
        deserializerMap.put("portInStatus", (n) -> { this.setPortInStatus(n.getEnumValue(PortInStatus::forValue)); });
        deserializerMap.put("reverseNumberLookupOptions", (n) -> { this.setReverseNumberLookupOptions(n.getCollectionOfEnumValues(ReverseNumberLookupOption::forValue)); });
        deserializerMap.put("supportedCustomerActions", (n) -> { this.setSupportedCustomerActions(n.getCollectionOfEnumValues(CustomerAction::forValue)); });
        deserializerMap.put("telephoneNumber", (n) -> { this.setTelephoneNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isoCountryCode property value. The ISO country code assigned to the phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIsoCountryCode() {
        return this.backingStore.get("isoCountryCode");
    }
    /**
     * Gets the locationId property value. The ID of the location assigned to the phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationId() {
        return this.backingStore.get("locationId");
    }
    /**
     * Gets the networkSiteId property value. This property is reserved for internal Microsoft use.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetworkSiteId() {
        return this.backingStore.get("networkSiteId");
    }
    /**
     * Gets the numberSource property value. The source of the phone number. online is used for phone numbers assigned in Microsoft 365, and onPremises is used for phone numbers assigned in AD on-premises, which are synchronized into Microsoft 365. The possible values are: online, onPremises, unknownFutureValue.
     * @return a {@link NumberSource}
     */
    @jakarta.annotation.Nullable
    public NumberSource getNumberSource() {
        return this.backingStore.get("numberSource");
    }
    /**
     * Gets the numberType property value. The numberType property
     * @return a {@link NumberType}
     */
    @jakarta.annotation.Nullable
    public NumberType getNumberType() {
        return this.backingStore.get("numberType");
    }
    /**
     * Gets the operatorId property value. The ID of the operator.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatorId() {
        return this.backingStore.get("operatorId");
    }
    /**
     * Gets the portInStatus property value. The status of any port in order covering the phone number. The possible values are: completed, firmOrderCommitmentAccepted, unknownFutureValue.
     * @return a {@link PortInStatus}
     */
    @jakarta.annotation.Nullable
    public PortInStatus getPortInStatus() {
        return this.backingStore.get("portInStatus");
    }
    /**
     * Gets the reverseNumberLookupOptions property value. Status of Reverse Number Lookup (RNL). If set to skipInternalVoip, calls are routed through the external Public Switched Telephone Network (PSTN) instead of using internal VoIP resolution.
     * @return a {@link java.util.List<ReverseNumberLookupOption>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReverseNumberLookupOption> getReverseNumberLookupOptions() {
        return this.backingStore.get("reverseNumberLookupOptions");
    }
    /**
     * Gets the supportedCustomerActions property value. Indicates what customer actions are available to modify the number.
     * @return a {@link java.util.List<CustomerAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomerAction> getSupportedCustomerActions() {
        return this.backingStore.get("supportedCustomerActions");
    }
    /**
     * Gets the telephoneNumber property value. The telephone number in the record. The recorded telephone number is always displayed with a &apos;+&apos; prefix, regardless of whether it was originally assigned with one.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTelephoneNumber() {
        return this.backingStore.get("telephoneNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("activationState", this.getActivationState());
        writer.writeEnumValue("assignmentCategory", this.getAssignmentCategory());
        writer.writeEnumValue("assignmentStatus", this.getAssignmentStatus());
        writer.writeStringValue("assignmentTargetId", this.getAssignmentTargetId());
        writer.writeCollectionOfEnumValues("capabilities", this.getCapabilities());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("civicAddressId", this.getCivicAddressId());
        writer.writeStringValue("isoCountryCode", this.getIsoCountryCode());
        writer.writeStringValue("locationId", this.getLocationId());
        writer.writeStringValue("networkSiteId", this.getNetworkSiteId());
        writer.writeEnumValue("numberSource", this.getNumberSource());
        writer.writeEnumValue("numberType", this.getNumberType());
        writer.writeStringValue("operatorId", this.getOperatorId());
        writer.writeEnumValue("portInStatus", this.getPortInStatus());
        writer.writeCollectionOfEnumValues("reverseNumberLookupOptions", this.getReverseNumberLookupOptions());
        writer.writeCollectionOfEnumValues("supportedCustomerActions", this.getSupportedCustomerActions());
        writer.writeStringValue("telephoneNumber", this.getTelephoneNumber());
    }
    /**
     * Sets the activationState property value. The activationState property
     * @param value Value to set for the activationState property.
     */
    public void setActivationState(@jakarta.annotation.Nullable final ActivationState value) {
        this.backingStore.set("activationState", value);
    }
    /**
     * Sets the assignmentCategory property value. Contains the assignment category such as Primary or Private. The possible values are: primary, private, alternate, unknownFutureValue.
     * @param value Value to set for the assignmentCategory property.
     */
    public void setAssignmentCategory(@jakarta.annotation.Nullable final AssignmentCategory value) {
        this.backingStore.set("assignmentCategory", value);
    }
    /**
     * Sets the assignmentStatus property value. The assignment status of the phone number. The possible values are: unassigned, internalError, userAssigned, conferenceAssigned, voiceApplicationAssigned, thirdPartyAppAssigned, policyAssigned, unknownFutureValue.
     * @param value Value to set for the assignmentStatus property.
     */
    public void setAssignmentStatus(@jakarta.annotation.Nullable final AssignmentStatus value) {
        this.backingStore.set("assignmentStatus", value);
    }
    /**
     * Sets the assignmentTargetId property value. The ID of the object the phone number is assigned to, either the ObjectId of a user or resource account, or the policy instance ID of a Teams shared calling routing policy instance.
     * @param value Value to set for the assignmentTargetId property.
     */
    public void setAssignmentTargetId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentTargetId", value);
    }
    /**
     * Sets the capabilities property value. The list of capabilities assigned to the phone number.
     * @param value Value to set for the capabilities property.
     */
    public void setCapabilities(@jakarta.annotation.Nullable final java.util.List<NumberCapability> value) {
        this.backingStore.set("capabilities", value);
    }
    /**
     * Sets the city property value. The city where the phone number is located or associated with.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("city", value);
    }
    /**
     * Sets the civicAddressId property value. The ID of the civic address assigned to the phone number.
     * @param value Value to set for the civicAddressId property.
     */
    public void setCivicAddressId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("civicAddressId", value);
    }
    /**
     * Sets the isoCountryCode property value. The ISO country code assigned to the phone number.
     * @param value Value to set for the isoCountryCode property.
     */
    public void setIsoCountryCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("isoCountryCode", value);
    }
    /**
     * Sets the locationId property value. The ID of the location assigned to the phone number.
     * @param value Value to set for the locationId property.
     */
    public void setLocationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("locationId", value);
    }
    /**
     * Sets the networkSiteId property value. This property is reserved for internal Microsoft use.
     * @param value Value to set for the networkSiteId property.
     */
    public void setNetworkSiteId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkSiteId", value);
    }
    /**
     * Sets the numberSource property value. The source of the phone number. online is used for phone numbers assigned in Microsoft 365, and onPremises is used for phone numbers assigned in AD on-premises, which are synchronized into Microsoft 365. The possible values are: online, onPremises, unknownFutureValue.
     * @param value Value to set for the numberSource property.
     */
    public void setNumberSource(@jakarta.annotation.Nullable final NumberSource value) {
        this.backingStore.set("numberSource", value);
    }
    /**
     * Sets the numberType property value. The numberType property
     * @param value Value to set for the numberType property.
     */
    public void setNumberType(@jakarta.annotation.Nullable final NumberType value) {
        this.backingStore.set("numberType", value);
    }
    /**
     * Sets the operatorId property value. The ID of the operator.
     * @param value Value to set for the operatorId property.
     */
    public void setOperatorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatorId", value);
    }
    /**
     * Sets the portInStatus property value. The status of any port in order covering the phone number. The possible values are: completed, firmOrderCommitmentAccepted, unknownFutureValue.
     * @param value Value to set for the portInStatus property.
     */
    public void setPortInStatus(@jakarta.annotation.Nullable final PortInStatus value) {
        this.backingStore.set("portInStatus", value);
    }
    /**
     * Sets the reverseNumberLookupOptions property value. Status of Reverse Number Lookup (RNL). If set to skipInternalVoip, calls are routed through the external Public Switched Telephone Network (PSTN) instead of using internal VoIP resolution.
     * @param value Value to set for the reverseNumberLookupOptions property.
     */
    public void setReverseNumberLookupOptions(@jakarta.annotation.Nullable final java.util.List<ReverseNumberLookupOption> value) {
        this.backingStore.set("reverseNumberLookupOptions", value);
    }
    /**
     * Sets the supportedCustomerActions property value. Indicates what customer actions are available to modify the number.
     * @param value Value to set for the supportedCustomerActions property.
     */
    public void setSupportedCustomerActions(@jakarta.annotation.Nullable final java.util.List<CustomerAction> value) {
        this.backingStore.set("supportedCustomerActions", value);
    }
    /**
     * Sets the telephoneNumber property value. The telephone number in the record. The recorded telephone number is always displayed with a &apos;+&apos; prefix, regardless of whether it was originally assigned with one.
     * @param value Value to set for the telephoneNumber property.
     */
    public void setTelephoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("telephoneNumber", value);
    }
}
