package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KeyCredentialConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The maxLifetime property
     */
    private PeriodAndDuration maxLifetime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Timestamp when the policy is enforced for all apps created on or after the specified date. For existing applications, the enforcement date would be back dated. To apply to all applications regardless of their creation date, this property would be null. Nullable.
     */
    private OffsetDateTime restrictForAppsCreatedAfterDateTime;
    /**
     * The type of restriction being applied. Possible values are asymmetricKeyLifetime, unknownFutureValue. Each value of restrictionType can be used only once per policy.
     */
    private AppKeyCredentialRestrictionType restrictionType;
    /**
     * Instantiates a new KeyCredentialConfiguration and sets the default values.
     */
    public KeyCredentialConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KeyCredentialConfiguration
     */
    @jakarta.annotation.Nonnull
    public static KeyCredentialConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KeyCredentialConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("maxLifetime", (n) -> { this.setMaxLifetime(n.getPeriodAndDurationValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("restrictForAppsCreatedAfterDateTime", (n) -> { this.setRestrictForAppsCreatedAfterDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("restrictionType", (n) -> { this.setRestrictionType(n.getEnumValue(AppKeyCredentialRestrictionType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the maxLifetime property value. The maxLifetime property
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMaxLifetime() {
        return this.maxLifetime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the restrictForAppsCreatedAfterDateTime property value. Timestamp when the policy is enforced for all apps created on or after the specified date. For existing applications, the enforcement date would be back dated. To apply to all applications regardless of their creation date, this property would be null. Nullable.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRestrictForAppsCreatedAfterDateTime() {
        return this.restrictForAppsCreatedAfterDateTime;
    }
    /**
     * Gets the restrictionType property value. The type of restriction being applied. Possible values are asymmetricKeyLifetime, unknownFutureValue. Each value of restrictionType can be used only once per policy.
     * @return a AppKeyCredentialRestrictionType
     */
    @jakarta.annotation.Nullable
    public AppKeyCredentialRestrictionType getRestrictionType() {
        return this.restrictionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writePeriodAndDurationValue("maxLifetime", this.getMaxLifetime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("restrictForAppsCreatedAfterDateTime", this.getRestrictForAppsCreatedAfterDateTime());
        writer.writeEnumValue("restrictionType", this.getRestrictionType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the maxLifetime property value. The maxLifetime property
     * @param value Value to set for the maxLifetime property.
     */
    public void setMaxLifetime(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.maxLifetime = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the restrictForAppsCreatedAfterDateTime property value. Timestamp when the policy is enforced for all apps created on or after the specified date. For existing applications, the enforcement date would be back dated. To apply to all applications regardless of their creation date, this property would be null. Nullable.
     * @param value Value to set for the restrictForAppsCreatedAfterDateTime property.
     */
    public void setRestrictForAppsCreatedAfterDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.restrictForAppsCreatedAfterDateTime = value;
    }
    /**
     * Sets the restrictionType property value. The type of restriction being applied. Possible values are asymmetricKeyLifetime, unknownFutureValue. Each value of restrictionType can be used only once per policy.
     * @param value Value to set for the restrictionType property.
     */
    public void setRestrictionType(@jakarta.annotation.Nullable final AppKeyCredentialRestrictionType value) {
        this.restrictionType = value;
    }
}
