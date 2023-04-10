package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SecureScore extends Entity implements Parsable {
    /** Active user count of the given tenant. */
    private Integer activeUserCount;
    /** Average score by different scopes (for example, average by industry, average by seating) and control category (Identity, Data, Device, Apps, Infrastructure) within the scope. */
    private java.util.List<AverageComparativeScore> averageComparativeScores;
    /** GUID string for tenant ID. */
    private String azureTenantId;
    /** Contains tenant scores for a set of controls. */
    private java.util.List<ControlScore> controlScores;
    /** The date when the entity is created. */
    private OffsetDateTime createdDateTime;
    /** Tenant current attained score on specified date. */
    private Double currentScore;
    /** Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint). */
    private java.util.List<String> enabledServices;
    /** Licensed user count of the given tenant. */
    private Integer licensedUserCount;
    /** Tenant maximum possible score on specified date. */
    private Double maxScore;
    /** Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required. */
    private SecurityVendorInformation vendorInformation;
    /**
     * Instantiates a new SecureScore and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SecureScore() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SecureScore
     */
    @javax.annotation.Nonnull
    public static SecureScore createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecureScore();
    }
    /**
     * Gets the activeUserCount property value. Active user count of the given tenant.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveUserCount() {
        return this.activeUserCount;
    }
    /**
     * Gets the averageComparativeScores property value. Average score by different scopes (for example, average by industry, average by seating) and control category (Identity, Data, Device, Apps, Infrastructure) within the scope.
     * @return a averageComparativeScore
     */
    @javax.annotation.Nullable
    public java.util.List<AverageComparativeScore> getAverageComparativeScores() {
        return this.averageComparativeScores;
    }
    /**
     * Gets the azureTenantId property value. GUID string for tenant ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureTenantId() {
        return this.azureTenantId;
    }
    /**
     * Gets the controlScores property value. Contains tenant scores for a set of controls.
     * @return a controlScore
     */
    @javax.annotation.Nullable
    public java.util.List<ControlScore> getControlScores() {
        return this.controlScores;
    }
    /**
     * Gets the createdDateTime property value. The date when the entity is created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the currentScore property value. Tenant current attained score on specified date.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCurrentScore() {
        return this.currentScore;
    }
    /**
     * Gets the enabledServices property value. Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnabledServices() {
        return this.enabledServices;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLicensedUserCount() {
        return this.licensedUserCount;
    }
    /**
     * Gets the maxScore property value. Tenant maximum possible score on specified date.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaxScore() {
        return this.maxScore;
    }
    /**
     * Gets the vendorInformation property value. Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required.
     * @return a securityVendorInformation
     */
    @javax.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this.vendorInformation;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveUserCount(@javax.annotation.Nullable final Integer value) {
        this.activeUserCount = value;
    }
    /**
     * Sets the averageComparativeScores property value. Average score by different scopes (for example, average by industry, average by seating) and control category (Identity, Data, Device, Apps, Infrastructure) within the scope.
     * @param value Value to set for the averageComparativeScores property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageComparativeScores(@javax.annotation.Nullable final java.util.List<AverageComparativeScore> value) {
        this.averageComparativeScores = value;
    }
    /**
     * Sets the azureTenantId property value. GUID string for tenant ID.
     * @param value Value to set for the azureTenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureTenantId(@javax.annotation.Nullable final String value) {
        this.azureTenantId = value;
    }
    /**
     * Sets the controlScores property value. Contains tenant scores for a set of controls.
     * @param value Value to set for the controlScores property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setControlScores(@javax.annotation.Nullable final java.util.List<ControlScore> value) {
        this.controlScores = value;
    }
    /**
     * Sets the createdDateTime property value. The date when the entity is created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the currentScore property value. Tenant current attained score on specified date.
     * @param value Value to set for the currentScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrentScore(@javax.annotation.Nullable final Double value) {
        this.currentScore = value;
    }
    /**
     * Sets the enabledServices property value. Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint).
     * @param value Value to set for the enabledServices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabledServices(@javax.annotation.Nullable final java.util.List<String> value) {
        this.enabledServices = value;
    }
    /**
     * Sets the licensedUserCount property value. Licensed user count of the given tenant.
     * @param value Value to set for the licensedUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLicensedUserCount(@javax.annotation.Nullable final Integer value) {
        this.licensedUserCount = value;
    }
    /**
     * Sets the maxScore property value. Tenant maximum possible score on specified date.
     * @param value Value to set for the maxScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxScore(@javax.annotation.Nullable final Double value) {
        this.maxScore = value;
    }
    /**
     * Sets the vendorInformation property value. Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required.
     * @param value Value to set for the vendorInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendorInformation(@javax.annotation.Nullable final SecurityVendorInformation value) {
        this.vendorInformation = value;
    }
}
