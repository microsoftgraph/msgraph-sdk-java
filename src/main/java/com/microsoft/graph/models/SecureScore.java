package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the security singleton. */
public class SecureScore extends Entity implements Parsable {
    /** Active user count of the given tenant. */
    private Integer _activeUserCount;
    /** Average score by different scopes (for example, average by industry, average by seating) and control category (Identity, Data, Device, Apps, Infrastructure) within the scope. */
    private java.util.List<AverageComparativeScore> _averageComparativeScores;
    /** GUID string for tenant ID. */
    private String _azureTenantId;
    /** Contains tenant scores for a set of controls. */
    private java.util.List<ControlScore> _controlScores;
    /** The date when the entity is created. */
    private OffsetDateTime _createdDateTime;
    /** Tenant current attained score on specified date. */
    private Double _currentScore;
    /** Microsoft-provided services for the tenant (for example, Exchange online, Skype, SharePoint). */
    private java.util.List<String> _enabledServices;
    /** Licensed user count of the given tenant. */
    private Integer _licensedUserCount;
    /** Tenant maximum possible score on specified date. */
    private Double _maxScore;
    /** Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required. */
    private SecurityVendorInformation _vendorInformation;
    /**
     * Instantiates a new secureScore and sets the default values.
     * @return a void
     */
    public SecureScore() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a secureScore
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
        return this._activeUserCount;
    }
    /**
     * Gets the averageComparativeScores property value. Average score by different scopes (for example, average by industry, average by seating) and control category (Identity, Data, Device, Apps, Infrastructure) within the scope.
     * @return a averageComparativeScore
     */
    @javax.annotation.Nullable
    public java.util.List<AverageComparativeScore> getAverageComparativeScores() {
        return this._averageComparativeScores;
    }
    /**
     * Gets the azureTenantId property value. GUID string for tenant ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureTenantId() {
        return this._azureTenantId;
    }
    /**
     * Gets the controlScores property value. Contains tenant scores for a set of controls.
     * @return a controlScore
     */
    @javax.annotation.Nullable
    public java.util.List<ControlScore> getControlScores() {
        return this._controlScores;
    }
    /**
     * Gets the createdDateTime property value. The date when the entity is created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the currentScore property value. Tenant current attained score on specified date.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCurrentScore() {
        return this._currentScore;
    }
    /**
     * Gets the enabledServices property value. Microsoft-provided services for the tenant (for example, Exchange online, Skype, SharePoint).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnabledServices() {
        return this._enabledServices;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecureScore currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activeUserCount", (n) -> { currentObject.setActiveUserCount(n.getIntegerValue()); });
            this.put("averageComparativeScores", (n) -> { currentObject.setAverageComparativeScores(n.getCollectionOfObjectValues(AverageComparativeScore::createFromDiscriminatorValue)); });
            this.put("azureTenantId", (n) -> { currentObject.setAzureTenantId(n.getStringValue()); });
            this.put("controlScores", (n) -> { currentObject.setControlScores(n.getCollectionOfObjectValues(ControlScore::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("currentScore", (n) -> { currentObject.setCurrentScore(n.getDoubleValue()); });
            this.put("enabledServices", (n) -> { currentObject.setEnabledServices(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("licensedUserCount", (n) -> { currentObject.setLicensedUserCount(n.getIntegerValue()); });
            this.put("maxScore", (n) -> { currentObject.setMaxScore(n.getDoubleValue()); });
            this.put("vendorInformation", (n) -> { currentObject.setVendorInformation(n.getObjectValue(SecurityVendorInformation::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the licensedUserCount property value. Licensed user count of the given tenant.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLicensedUserCount() {
        return this._licensedUserCount;
    }
    /**
     * Gets the maxScore property value. Tenant maximum possible score on specified date.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaxScore() {
        return this._maxScore;
    }
    /**
     * Gets the vendorInformation property value. Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required.
     * @return a securityVendorInformation
     */
    @javax.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this._vendorInformation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setActiveUserCount(@javax.annotation.Nullable final Integer value) {
        this._activeUserCount = value;
    }
    /**
     * Sets the averageComparativeScores property value. Average score by different scopes (for example, average by industry, average by seating) and control category (Identity, Data, Device, Apps, Infrastructure) within the scope.
     * @param value Value to set for the averageComparativeScores property.
     * @return a void
     */
    public void setAverageComparativeScores(@javax.annotation.Nullable final java.util.List<AverageComparativeScore> value) {
        this._averageComparativeScores = value;
    }
    /**
     * Sets the azureTenantId property value. GUID string for tenant ID.
     * @param value Value to set for the azureTenantId property.
     * @return a void
     */
    public void setAzureTenantId(@javax.annotation.Nullable final String value) {
        this._azureTenantId = value;
    }
    /**
     * Sets the controlScores property value. Contains tenant scores for a set of controls.
     * @param value Value to set for the controlScores property.
     * @return a void
     */
    public void setControlScores(@javax.annotation.Nullable final java.util.List<ControlScore> value) {
        this._controlScores = value;
    }
    /**
     * Sets the createdDateTime property value. The date when the entity is created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the currentScore property value. Tenant current attained score on specified date.
     * @param value Value to set for the currentScore property.
     * @return a void
     */
    public void setCurrentScore(@javax.annotation.Nullable final Double value) {
        this._currentScore = value;
    }
    /**
     * Sets the enabledServices property value. Microsoft-provided services for the tenant (for example, Exchange online, Skype, SharePoint).
     * @param value Value to set for the enabledServices property.
     * @return a void
     */
    public void setEnabledServices(@javax.annotation.Nullable final java.util.List<String> value) {
        this._enabledServices = value;
    }
    /**
     * Sets the licensedUserCount property value. Licensed user count of the given tenant.
     * @param value Value to set for the licensedUserCount property.
     * @return a void
     */
    public void setLicensedUserCount(@javax.annotation.Nullable final Integer value) {
        this._licensedUserCount = value;
    }
    /**
     * Sets the maxScore property value. Tenant maximum possible score on specified date.
     * @param value Value to set for the maxScore property.
     * @return a void
     */
    public void setMaxScore(@javax.annotation.Nullable final Double value) {
        this._maxScore = value;
    }
    /**
     * Sets the vendorInformation property value. Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required.
     * @param value Value to set for the vendorInformation property.
     * @return a void
     */
    public void setVendorInformation(@javax.annotation.Nullable final SecurityVendorInformation value) {
        this._vendorInformation = value;
    }
}
