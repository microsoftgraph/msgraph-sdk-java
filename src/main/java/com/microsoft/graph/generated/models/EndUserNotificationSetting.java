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
public class EndUserNotificationSetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new EndUserNotificationSetting and sets the default values.
     */
    public EndUserNotificationSetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EndUserNotificationSetting
     */
    @jakarta.annotation.Nonnull
    public static EndUserNotificationSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.noTrainingNotificationSetting": return new NoTrainingNotificationSetting();
                case "#microsoft.graph.trainingNotificationSetting": return new TrainingNotificationSetting();
            }
        }
        return new EndUserNotificationSetting();
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("notificationPreference", (n) -> { this.setNotificationPreference(n.getEnumValue(EndUserNotificationPreference::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("positiveReinforcement", (n) -> { this.setPositiveReinforcement(n.getObjectValue(PositiveReinforcementNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("settingType", (n) -> { this.setSettingType(n.getEnumValue(EndUserNotificationSettingType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the notificationPreference property value. Notification preference. Possible values are: unknown, microsoft, custom, unknownFutureValue.
     * @return a EndUserNotificationPreference
     */
    @jakarta.annotation.Nullable
    public EndUserNotificationPreference getNotificationPreference() {
        return this.backingStore.get("notificationPreference");
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
     * Gets the positiveReinforcement property value. Positive reinforcement detail.
     * @return a PositiveReinforcementNotification
     */
    @jakarta.annotation.Nullable
    public PositiveReinforcementNotification getPositiveReinforcement() {
        return this.backingStore.get("positiveReinforcement");
    }
    /**
     * Gets the settingType property value. End user notification type. Possible values are: unknown, noTraining, trainingSelected, noNotification, unknownFutureValue.
     * @return a EndUserNotificationSettingType
     */
    @jakarta.annotation.Nullable
    public EndUserNotificationSettingType getSettingType() {
        return this.backingStore.get("settingType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("notificationPreference", this.getNotificationPreference());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("positiveReinforcement", this.getPositiveReinforcement());
        writer.writeEnumValue("settingType", this.getSettingType());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the notificationPreference property value. Notification preference. Possible values are: unknown, microsoft, custom, unknownFutureValue.
     * @param value Value to set for the notificationPreference property.
     */
    public void setNotificationPreference(@jakarta.annotation.Nullable final EndUserNotificationPreference value) {
        this.backingStore.set("notificationPreference", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the positiveReinforcement property value. Positive reinforcement detail.
     * @param value Value to set for the positiveReinforcement property.
     */
    public void setPositiveReinforcement(@jakarta.annotation.Nullable final PositiveReinforcementNotification value) {
        this.backingStore.set("positiveReinforcement", value);
    }
    /**
     * Sets the settingType property value. End user notification type. Possible values are: unknown, noTraining, trainingSelected, noNotification, unknownFutureValue.
     * @param value Value to set for the settingType property.
     */
    public void setSettingType(@jakarta.annotation.Nullable final EndUserNotificationSettingType value) {
        this.backingStore.set("settingType", value);
    }
}
