package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties used to determine when to offer an app to devices and when to install the app on devices. */
public class MobileAppInstallTimeSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The time at which the app should be installed. */
    private OffsetDateTime _deadlineDateTime;
    /** The time at which the app should be available for installation. */
    private OffsetDateTime _startDateTime;
    /** Whether the local device time or UTC time should be used when determining the available and deadline times. */
    private Boolean _useLocalTime;
    /**
     * Instantiates a new mobileAppInstallTimeSettings and sets the default values.
     * @return a void
     */
    public MobileAppInstallTimeSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppInstallTimeSettings
     */
    @javax.annotation.Nonnull
    public static MobileAppInstallTimeSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppInstallTimeSettings();
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
     * Gets the deadlineDateTime property value. The time at which the app should be installed.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeadlineDateTime() {
        return this._deadlineDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppInstallTimeSettings currentObject = this;
        return new HashMap<>(3) {{
            this.put("deadlineDateTime", (n) -> { currentObject.setDeadlineDateTime(n.getOffsetDateTimeValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("useLocalTime", (n) -> { currentObject.setUseLocalTime(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the startDateTime property value. The time at which the app should be available for installation.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the useLocalTime property value. Whether the local device time or UTC time should be used when determining the available and deadline times.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseLocalTime() {
        return this._useLocalTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("deadlineDateTime", this.getDeadlineDateTime());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeBooleanValue("useLocalTime", this.getUseLocalTime());
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
     * Sets the deadlineDateTime property value. The time at which the app should be installed.
     * @param value Value to set for the deadlineDateTime property.
     * @return a void
     */
    public void setDeadlineDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deadlineDateTime = value;
    }
    /**
     * Sets the startDateTime property value. The time at which the app should be available for installation.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the useLocalTime property value. Whether the local device time or UTC time should be used when determining the available and deadline times.
     * @param value Value to set for the useLocalTime property.
     * @return a void
     */
    public void setUseLocalTime(@javax.annotation.Nullable final Boolean value) {
        this._useLocalTime = value;
    }
}
