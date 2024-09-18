package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HealthIssue extends Entity implements Parsable {
    /**
     * Instantiates a new {@link HealthIssue} and sets the default values.
     */
    public HealthIssue() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HealthIssue}
     */
    @jakarta.annotation.Nonnull
    public static HealthIssue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HealthIssue();
    }
    /**
     * Gets the additionalInformation property value. Contains additional information about the issue, such as a list of items to fix.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdditionalInformation() {
        return this.backingStore.get("additionalInformation");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the health issue was generated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Contains more detailed information about the health issue.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the health issue.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the domainNames property value. A list of the fully qualified domain names of the domains or the sensors the health issue is related to.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDomainNames() {
        return this.backingStore.get("domainNames");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalInformation", (n) -> { this.setAdditionalInformation(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("domainNames", (n) -> { this.setDomainNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("healthIssueType", (n) -> { this.setHealthIssueType(n.getEnumValue(HealthIssueType::forValue)); });
        deserializerMap.put("issueTypeId", (n) -> { this.setIssueTypeId(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recommendations", (n) -> { this.setRecommendations(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("recommendedActionCommands", (n) -> { this.setRecommendedActionCommands(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sensorDNSNames", (n) -> { this.setSensorDNSNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(HealthIssueSeverity::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(HealthIssueStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the healthIssueType property value. The type of the health issue. The possible values are: sensor, global, unknownFutureValue. For a list of all health issues and their identifiers, see Microsoft Defender for Identity health issues.
     * @return a {@link HealthIssueType}
     */
    @jakarta.annotation.Nullable
    public HealthIssueType getHealthIssueType() {
        return this.backingStore.get("healthIssueType");
    }
    /**
     * Gets the issueTypeId property value. The type identifier of the health issue. For a list of all health issues and their identifiers, see Microsoft Defender for Identity health issues.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssueTypeId() {
        return this.backingStore.get("issueTypeId");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the health issue was last updated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the recommendations property value. A list of recommended actions that can be taken to resolve the issue effectively and efficiently. These actions might include instructions for further investigation and aren't limited to prewritten responses.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRecommendations() {
        return this.backingStore.get("recommendations");
    }
    /**
     * Gets the recommendedActionCommands property value. A list of commands from the PowerShell module for the product that can be used to resolve the issue, if available. If no commands can be used to solve the issue, this property is empty. The commands, if present, provide a quick and efficient way to address the issue. These commands run in sequence for the single recommended fix.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRecommendedActionCommands() {
        return this.backingStore.get("recommendedActionCommands");
    }
    /**
     * Gets the sensorDNSNames property value. A list of the DNS names of the sensors the health issue is related to.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSensorDNSNames() {
        return this.backingStore.get("sensorDNSNames");
    }
    /**
     * Gets the severity property value. The severity of the health issue. The possible values are: low, medium, high, unknownFutureValue.
     * @return a {@link HealthIssueSeverity}
     */
    @jakarta.annotation.Nullable
    public HealthIssueSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Gets the status property value. The status of the health issue. The possible values are: open, closed, suppressed, unknownFutureValue.
     * @return a {@link HealthIssueStatus}
     */
    @jakarta.annotation.Nullable
    public HealthIssueStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("additionalInformation", this.getAdditionalInformation());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("domainNames", this.getDomainNames());
        writer.writeEnumValue("healthIssueType", this.getHealthIssueType());
        writer.writeStringValue("issueTypeId", this.getIssueTypeId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("recommendations", this.getRecommendations());
        writer.writeCollectionOfPrimitiveValues("recommendedActionCommands", this.getRecommendedActionCommands());
        writer.writeCollectionOfPrimitiveValues("sensorDNSNames", this.getSensorDNSNames());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the additionalInformation property value. Contains additional information about the issue, such as a list of items to fix.
     * @param value Value to set for the additionalInformation property.
     */
    public void setAdditionalInformation(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("additionalInformation", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the health issue was generated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Contains more detailed information about the health issue.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the health issue.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the domainNames property value. A list of the fully qualified domain names of the domains or the sensors the health issue is related to.
     * @param value Value to set for the domainNames property.
     */
    public void setDomainNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("domainNames", value);
    }
    /**
     * Sets the healthIssueType property value. The type of the health issue. The possible values are: sensor, global, unknownFutureValue. For a list of all health issues and their identifiers, see Microsoft Defender for Identity health issues.
     * @param value Value to set for the healthIssueType property.
     */
    public void setHealthIssueType(@jakarta.annotation.Nullable final HealthIssueType value) {
        this.backingStore.set("healthIssueType", value);
    }
    /**
     * Sets the issueTypeId property value. The type identifier of the health issue. For a list of all health issues and their identifiers, see Microsoft Defender for Identity health issues.
     * @param value Value to set for the issueTypeId property.
     */
    public void setIssueTypeId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issueTypeId", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the health issue was last updated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the recommendations property value. A list of recommended actions that can be taken to resolve the issue effectively and efficiently. These actions might include instructions for further investigation and aren't limited to prewritten responses.
     * @param value Value to set for the recommendations property.
     */
    public void setRecommendations(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("recommendations", value);
    }
    /**
     * Sets the recommendedActionCommands property value. A list of commands from the PowerShell module for the product that can be used to resolve the issue, if available. If no commands can be used to solve the issue, this property is empty. The commands, if present, provide a quick and efficient way to address the issue. These commands run in sequence for the single recommended fix.
     * @param value Value to set for the recommendedActionCommands property.
     */
    public void setRecommendedActionCommands(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("recommendedActionCommands", value);
    }
    /**
     * Sets the sensorDNSNames property value. A list of the DNS names of the sensors the health issue is related to.
     * @param value Value to set for the sensorDNSNames property.
     */
    public void setSensorDNSNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sensorDNSNames", value);
    }
    /**
     * Sets the severity property value. The severity of the health issue. The possible values are: low, medium, high, unknownFutureValue.
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final HealthIssueSeverity value) {
        this.backingStore.set("severity", value);
    }
    /**
     * Sets the status property value. The status of the health issue. The possible values are: open, closed, suppressed, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final HealthIssueStatus value) {
        this.backingStore.set("status", value);
    }
}
