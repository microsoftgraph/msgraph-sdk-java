package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties describing restart coordination following an app installation.
 */
public class Win32LobAppRestartSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The number of minutes before the restart time to display the countdown dialog for pending restarts. */
    private Integer countdownDisplayBeforeRestartInMinutes;
    /** The number of minutes to wait before restarting the device after an app installation. */
    private Integer gracePeriodInMinutes;
    /** The OdataType property */
    private String odataType;
    /** The number of minutes to snooze the restart notification dialog when the snooze button is selected. */
    private Integer restartNotificationSnoozeDurationInMinutes;
    /**
     * Instantiates a new win32LobAppRestartSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Win32LobAppRestartSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobAppRestartSettings
     */
    @javax.annotation.Nonnull
    public static Win32LobAppRestartSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppRestartSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the countdownDisplayBeforeRestartInMinutes property value. The number of minutes before the restart time to display the countdown dialog for pending restarts.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCountdownDisplayBeforeRestartInMinutes() {
        return this.countdownDisplayBeforeRestartInMinutes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGracePeriodInMinutes() {
        return this.gracePeriodInMinutes;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the restartNotificationSnoozeDurationInMinutes property value. The number of minutes to snooze the restart notification dialog when the snooze button is selected.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRestartNotificationSnoozeDurationInMinutes() {
        return this.restartNotificationSnoozeDurationInMinutes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("countdownDisplayBeforeRestartInMinutes", this.getCountdownDisplayBeforeRestartInMinutes());
        writer.writeIntegerValue("gracePeriodInMinutes", this.getGracePeriodInMinutes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("restartNotificationSnoozeDurationInMinutes", this.getRestartNotificationSnoozeDurationInMinutes());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the countdownDisplayBeforeRestartInMinutes property value. The number of minutes before the restart time to display the countdown dialog for pending restarts.
     * @param value Value to set for the countdownDisplayBeforeRestartInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountdownDisplayBeforeRestartInMinutes(@javax.annotation.Nullable final Integer value) {
        this.countdownDisplayBeforeRestartInMinutes = value;
    }
    /**
     * Sets the gracePeriodInMinutes property value. The number of minutes to wait before restarting the device after an app installation.
     * @param value Value to set for the gracePeriodInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGracePeriodInMinutes(@javax.annotation.Nullable final Integer value) {
        this.gracePeriodInMinutes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the restartNotificationSnoozeDurationInMinutes property value. The number of minutes to snooze the restart notification dialog when the snooze button is selected.
     * @param value Value to set for the restartNotificationSnoozeDurationInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestartNotificationSnoozeDurationInMinutes(@javax.annotation.Nullable final Integer value) {
        this.restartNotificationSnoozeDurationInMinutes = value;
    }
}
