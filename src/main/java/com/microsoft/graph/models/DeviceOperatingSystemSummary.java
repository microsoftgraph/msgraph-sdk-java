package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device operating system summary.  */
public class DeviceOperatingSystemSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Number of android device count.  */
    private Integer _androidCount;
    /** Number of iOS device count.  */
    private Integer _iosCount;
    /** Number of Mac OS X device count.  */
    private Integer _macOSCount;
    /** Number of unknown device count.  */
    private Integer _unknownCount;
    /** Number of Windows device count.  */
    private Integer _windowsCount;
    /** Number of Windows mobile device count.  */
    private Integer _windowsMobileCount;
    /**
     * Instantiates a new deviceOperatingSystemSummary and sets the default values.
     * @return a void
     */
    public DeviceOperatingSystemSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceOperatingSystemSummary
     */
    @javax.annotation.Nonnull
    public static DeviceOperatingSystemSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceOperatingSystemSummary();
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
     * Gets the androidCount property value. Number of android device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAndroidCount() {
        return this._androidCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceOperatingSystemSummary currentObject = this;
        return new HashMap<>(6) {{
            this.put("androidCount", (n) -> { currentObject.setAndroidCount(n.getIntegerValue()); });
            this.put("iosCount", (n) -> { currentObject.setIosCount(n.getIntegerValue()); });
            this.put("macOSCount", (n) -> { currentObject.setMacOSCount(n.getIntegerValue()); });
            this.put("unknownCount", (n) -> { currentObject.setUnknownCount(n.getIntegerValue()); });
            this.put("windowsCount", (n) -> { currentObject.setWindowsCount(n.getIntegerValue()); });
            this.put("windowsMobileCount", (n) -> { currentObject.setWindowsMobileCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the iosCount property value. Number of iOS device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIosCount() {
        return this._iosCount;
    }
    /**
     * Gets the macOSCount property value. Number of Mac OS X device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMacOSCount() {
        return this._macOSCount;
    }
    /**
     * Gets the unknownCount property value. Number of unknown device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownCount() {
        return this._unknownCount;
    }
    /**
     * Gets the windowsCount property value. Number of Windows device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWindowsCount() {
        return this._windowsCount;
    }
    /**
     * Gets the windowsMobileCount property value. Number of Windows mobile device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWindowsMobileCount() {
        return this._windowsMobileCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("androidCount", this.getAndroidCount());
        writer.writeIntegerValue("iosCount", this.getIosCount());
        writer.writeIntegerValue("macOSCount", this.getMacOSCount());
        writer.writeIntegerValue("unknownCount", this.getUnknownCount());
        writer.writeIntegerValue("windowsCount", this.getWindowsCount());
        writer.writeIntegerValue("windowsMobileCount", this.getWindowsMobileCount());
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
     * Sets the androidCount property value. Number of android device count.
     * @param value Value to set for the androidCount property.
     * @return a void
     */
    public void setAndroidCount(@javax.annotation.Nullable final Integer value) {
        this._androidCount = value;
    }
    /**
     * Sets the iosCount property value. Number of iOS device count.
     * @param value Value to set for the iosCount property.
     * @return a void
     */
    public void setIosCount(@javax.annotation.Nullable final Integer value) {
        this._iosCount = value;
    }
    /**
     * Sets the macOSCount property value. Number of Mac OS X device count.
     * @param value Value to set for the macOSCount property.
     * @return a void
     */
    public void setMacOSCount(@javax.annotation.Nullable final Integer value) {
        this._macOSCount = value;
    }
    /**
     * Sets the unknownCount property value. Number of unknown device count.
     * @param value Value to set for the unknownCount property.
     * @return a void
     */
    public void setUnknownCount(@javax.annotation.Nullable final Integer value) {
        this._unknownCount = value;
    }
    /**
     * Sets the windowsCount property value. Number of Windows device count.
     * @param value Value to set for the windowsCount property.
     * @return a void
     */
    public void setWindowsCount(@javax.annotation.Nullable final Integer value) {
        this._windowsCount = value;
    }
    /**
     * Sets the windowsMobileCount property value. Number of Windows mobile device count.
     * @param value Value to set for the windowsMobileCount property.
     * @return a void
     */
    public void setWindowsMobileCount(@javax.annotation.Nullable final Integer value) {
        this._windowsMobileCount = value;
    }
}
