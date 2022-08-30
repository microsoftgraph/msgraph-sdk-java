package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties describing restart coordination following an app installation. */
public class Win32LobAppRestartSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of minutes before the restart time to display the countdown dialog for pending restarts. */
    private Integer _countdownDisplayBeforeRestartInMinutes;
    /** The number of minutes to wait before restarting the device after an app installation. */
    private Integer _gracePeriodInMinutes;
    /** The OdataType property */
    private String _odataType;
    /** The number of minutes to snooze the restart notification dialog when the snooze button is selected. */
    private Integer _restartNotificationSnoozeDurationInMinutes;
    /**
     * Instantiates a new win32LobAppRestartSettings and sets the default values.
     * @return a void
     */
    public Win32LobAppRestartSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.win32LobAppRestartSettings");
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
        return this._additionalData;
    }
    /**
     * Gets the countdownDisplayBeforeRestartInMinutes property value. The number of minutes before the restart time to display the countdown dialog for pending restarts.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCountdownDisplayBeforeRestartInMinutes() {
        return this._countdownDisplayBeforeRestartInMinutes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Win32LobAppRestartSettings currentObject = this;
        return new HashMap<>(4) {{
            this.put("countdownDisplayBeforeRestartInMinutes", (n) -> { currentObject.setCountdownDisplayBeforeRestartInMinutes(n.getIntegerValue()); });
            this.put("gracePeriodInMinutes", (n) -> { currentObject.setGracePeriodInMinutes(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("restartNotificationSnoozeDurationInMinutes", (n) -> { currentObject.setRestartNotificationSnoozeDurationInMinutes(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the gracePeriodInMinutes property value. The number of minutes to wait before restarting the device after an app installation.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGracePeriodInMinutes() {
        return this._gracePeriodInMinutes;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the restartNotificationSnoozeDurationInMinutes property value. The number of minutes to snooze the restart notification dialog when the snooze button is selected.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRestartNotificationSnoozeDurationInMinutes() {
        return this._restartNotificationSnoozeDurationInMinutes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the countdownDisplayBeforeRestartInMinutes property value. The number of minutes before the restart time to display the countdown dialog for pending restarts.
     * @param value Value to set for the countdownDisplayBeforeRestartInMinutes property.
     * @return a void
     */
    public void setCountdownDisplayBeforeRestartInMinutes(@javax.annotation.Nullable final Integer value) {
        this._countdownDisplayBeforeRestartInMinutes = value;
    }
    /**
     * Sets the gracePeriodInMinutes property value. The number of minutes to wait before restarting the device after an app installation.
     * @param value Value to set for the gracePeriodInMinutes property.
     * @return a void
     */
    public void setGracePeriodInMinutes(@javax.annotation.Nullable final Integer value) {
        this._gracePeriodInMinutes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the restartNotificationSnoozeDurationInMinutes property value. The number of minutes to snooze the restart notification dialog when the snooze button is selected.
     * @param value Value to set for the restartNotificationSnoozeDurationInMinutes property.
     * @return a void
     */
    public void setRestartNotificationSnoozeDurationInMinutes(@javax.annotation.Nullable final Integer value) {
        this._restartNotificationSnoozeDurationInMinutes = value;
    }
}
