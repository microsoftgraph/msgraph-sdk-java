package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecureScore extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SecureScore} and sets the default values.
     */
    public SecureScore() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SecureScore}
     */
    @jakarta.annotation.Nonnull
    public static SecureScore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecureScore();
    }
    /**
     * Gets the activeUserCount property value. Active user count of the given tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getActiveUserCount() {
        return this.backingStore.get("activeUserCount");
    }
    /**
     * Gets the averageComparativeScores property value. Average score by different scopes (for example, average by industry, average by seating) and control category (Identity, Data, Device, Apps, Infrastructure) within the scope.
     * @return a {@link java.util.List<AverageComparativeScore>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AverageComparativeScore> getAverageComparativeScores() {
        return this.backingStore.get("averageComparativeScores");
    }
    /**
     * Gets the azureTenantId property value. GUID string for tenant ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureTenantId() {
        return this.backingStore.get("azureTenantId");
    }
    /**
     * Gets the controlScores property value. Contains tenant scores for a set of controls.
     * @return a {@link java.util.List<ControlScore>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ControlScore> getControlScores() {
        return this.backingStore.get("controlScores");
    }
    /**
     * Gets the createdDateTime property value. The date when the entity is created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the currentScore property value. Tenant current attained score on specified date.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCurrentScore() {
        return this.backingStore.get("currentScore");
    }
    /**
     * Gets the enabledServices property value. Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnabledServices() {
        return this.backingStore.get("enabledServices");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeUserCount", (n) -> { this.setActiveUserCount(n.getIntegerValue()); });
        deserializerMap.put("averageComparativeScores", (n) -> { this.setAverageComparativeScores(n.getCollectionOfObjectValues(AverageComparativeScore::createFromDiscriminatorValue)); });
        deserializerMap.put("azureTenantId", (n) -> { this.setAzureTenantId(n.getStringValue()); });
        deserializerMap.put("controlScores", (n) -> { this.setControlScores(n.getCollectionOfObjectValues(ControlScore::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("currentScore", (n) -> { this.setCurrentScore(n.getDoubleValue()); });
        deserializerMap.put("enabledServices", (n) -> { this.setEnabledServices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("licensedUserCount", (n) -> { this.setLicensedUserCount(n.getIntegerValue()); });
        deserializerMap.put("maxScore", (n) -> { this.setMaxScore(n.getDoubleValue()); });
        deserializerMap.put("vendorInformation", (n) -> { this.setVendorInformation(n.getObjectValue(SecurityVendorInformation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the licensedUserCount property value. Licensed user count of the given tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLicensedUserCount() {
        return this.backingStore.get("licensedUserCount");
    }
    /**
     * Gets the maxScore property value. Tenant maximum possible score on specified date.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxScore() {
        return this.backingStore.get("maxScore");
    }
    /**
     * Gets the vendorInformation property value. Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required.
     * @return a {@link SecurityVendorInformation}
     */
    @jakarta.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this.backingStore.get("vendorInformation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeUserCount", this.getActiveUserCount());
        writer.writeCollectionOfObjectValues("averageComparativeScores", this.getAverageComparativeScores());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeCollectionOfObjectValues("controlScores", this.getControlScores());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeDoubleValue("currentScore", this.getCurrentScore());
        writer.writeCollectionOfPrimitiveValues("enabledServices", this.getEnabledServices());
        writer.writeIntegerValue("licensedUserCount", this.getLicensedUserCount());
        writer.writeDoubleValue("maxScore", this.getMaxScore());
        writer.writeObjectValue("vendorInformation", this.getVendorInformation());
    }
    /**
     * Sets the activeUserCount property value. Active user count of the given tenant.
     * @param value Value to set for the activeUserCount property.
     */
    public void setActiveUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("activeUserCount", value);
    }
    /**
     * Sets the averageComparativeScores property value. Average score by different scopes (for example, average by industry, average by seating) and control category (Identity, Data, Device, Apps, Infrastructure) within the scope.
     * @param value Value to set for the averageComparativeScores property.
     */
    public void setAverageComparativeScores(@jakarta.annotation.Nullable final java.util.List<AverageComparativeScore> value) {
        this.backingStore.set("averageComparativeScores", value);
    }
    /**
     * Sets the azureTenantId property value. GUID string for tenant ID.
     * @param value Value to set for the azureTenantId property.
     */
    public void setAzureTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureTenantId", value);
    }
    /**
     * Sets the controlScores property value. Contains tenant scores for a set of controls.
     * @param value Value to set for the controlScores property.
     */
    public void setControlScores(@jakarta.annotation.Nullable final java.util.List<ControlScore> value) {
        this.backingStore.set("controlScores", value);
    }
    /**
     * Sets the createdDateTime property value. The date when the entity is created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the currentScore property value. Tenant current attained score on specified date.
     * @param value Value to set for the currentScore property.
     */
    public void setCurrentScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("currentScore", value);
    }
    /**
     * Sets the enabledServices property value. Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint).
     * @param value Value to set for the enabledServices property.
     */
    public void setEnabledServices(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("enabledServices", value);
    }
    /**
     * Sets the licensedUserCount property value. Licensed user count of the given tenant.
     * @param value Value to set for the licensedUserCount property.
     */
    public void setLicensedUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("licensedUserCount", value);
    }
    /**
     * Sets the maxScore property value. Tenant maximum possible score on specified date.
     * @param value Value to set for the maxScore property.
     */
    public void setMaxScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("maxScore", value);
    }
    /**
     * Sets the vendorInformation property value. Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required.
     * @param value Value to set for the vendorInformation property.
     */
    public void setVendorInformation(@jakarta.annotation.Nullable final SecurityVendorInformation value) {
        this.backingStore.set("vendorInformation", value);
    }
}
