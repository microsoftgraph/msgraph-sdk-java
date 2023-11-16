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
/**
 * The user experience analytics insight is the recomendation to improve the user experience analytics score.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsInsight implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new UserExperienceAnalyticsInsight and sets the default values.
     */
    public UserExperienceAnalyticsInsight() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsInsight
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsInsight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsInsight();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("insightId", (n) -> { this.setInsightId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(UserExperienceAnalyticsInsightSeverity.class)); });
        deserializerMap.put("userExperienceAnalyticsMetricId", (n) -> { this.setUserExperienceAnalyticsMetricId(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfObjectValues(UserExperienceAnalyticsInsightValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the insightId property value. The unique identifier of the user experience analytics insight.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInsightId() {
        return this.backingStore.get("insightId");
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
     * Gets the severity property value. Indicates severity of insights. Possible values are: None, Informational, Warning, Error.
     * @return a UserExperienceAnalyticsInsightSeverity
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsInsightSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Gets the userExperienceAnalyticsMetricId property value. The unique identifier of the user experience analytics metric.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserExperienceAnalyticsMetricId() {
        return this.backingStore.get("userExperienceAnalyticsMetricId");
    }
    /**
     * Gets the values property value. The value of the user experience analytics insight.
     * @return a java.util.List<UserExperienceAnalyticsInsightValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsInsightValue> getValues() {
        return this.backingStore.get("values");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("insightId", this.getInsightId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeStringValue("userExperienceAnalyticsMetricId", this.getUserExperienceAnalyticsMetricId());
        writer.writeCollectionOfObjectValues("values", this.getValues());
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
     * Sets the insightId property value. The unique identifier of the user experience analytics insight.
     * @param value Value to set for the insightId property.
     */
    public void setInsightId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("insightId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the severity property value. Indicates severity of insights. Possible values are: None, Informational, Warning, Error.
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final UserExperienceAnalyticsInsightSeverity value) {
        this.backingStore.set("severity", value);
    }
    /**
     * Sets the userExperienceAnalyticsMetricId property value. The unique identifier of the user experience analytics metric.
     * @param value Value to set for the userExperienceAnalyticsMetricId property.
     */
    public void setUserExperienceAnalyticsMetricId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userExperienceAnalyticsMetricId", value);
    }
    /**
     * Sets the values property value. The value of the user experience analytics insight.
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsInsightValue> value) {
        this.backingStore.set("values", value);
    }
}
