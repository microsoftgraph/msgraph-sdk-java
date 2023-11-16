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
 * Contains properties describing restart coordination following an app installation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppRestartSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new Win32LobAppRestartSettings and sets the default values.
     */
    public Win32LobAppRestartSettings() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppRestartSettings
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppRestartSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppRestartSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the countdownDisplayBeforeRestartInMinutes property value. The number of minutes before the restart time to display the countdown dialog for pending restarts.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCountdownDisplayBeforeRestartInMinutes() {
        return this.BackingStore.get("countdownDisplayBeforeRestartInMinutes");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("countdownDisplayBeforeRestartInMinutes", (n) -> { this.setCountdownDisplayBeforeRestartInMinutes(n.getIntegerValue()); });
        deserializerMap.put("gracePeriodInMinutes", (n) -> { this.setGracePeriodInMinutes(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("restartNotificationSnoozeDurationInMinutes", (n) -> { this.setRestartNotificationSnoozeDurationInMinutes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodInMinutes property value. The number of minutes to wait before restarting the device after an app installation.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getGracePeriodInMinutes() {
        return this.BackingStore.get("gracePeriodInMinutes");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the restartNotificationSnoozeDurationInMinutes property value. The number of minutes to snooze the restart notification dialog when the snooze button is selected.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRestartNotificationSnoozeDurationInMinutes() {
        return this.BackingStore.get("restartNotificationSnoozeDurationInMinutes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("countdownDisplayBeforeRestartInMinutes", this.getCountdownDisplayBeforeRestartInMinutes());
        writer.writeIntegerValue("gracePeriodInMinutes", this.getGracePeriodInMinutes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("restartNotificationSnoozeDurationInMinutes", this.getRestartNotificationSnoozeDurationInMinutes());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the countdownDisplayBeforeRestartInMinutes property value. The number of minutes before the restart time to display the countdown dialog for pending restarts.
     * @param value Value to set for the countdownDisplayBeforeRestartInMinutes property.
     */
    public void setCountdownDisplayBeforeRestartInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("countdownDisplayBeforeRestartInMinutes", value);
    }
    /**
     * Sets the gracePeriodInMinutes property value. The number of minutes to wait before restarting the device after an app installation.
     * @param value Value to set for the gracePeriodInMinutes property.
     */
    public void setGracePeriodInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("gracePeriodInMinutes", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the restartNotificationSnoozeDurationInMinutes property value. The number of minutes to snooze the restart notification dialog when the snooze button is selected.
     * @param value Value to set for the restartNotificationSnoozeDurationInMinutes property.
     */
    public void setRestartNotificationSnoozeDurationInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("restartNotificationSnoozeDurationInMinutes", value);
    }
}
