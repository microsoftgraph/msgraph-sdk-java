package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for the installation state summary for a user. */
public class UserInstallStateSummary extends Entity implements Parsable {
    /** The install state of the eBook. */
    private java.util.List<DeviceInstallState> _deviceStates;
    /** Failed Device Count. */
    private Integer _failedDeviceCount;
    /** Installed Device Count. */
    private Integer _installedDeviceCount;
    /** Not installed device count. */
    private Integer _notInstalledDeviceCount;
    /** User name. */
    private String _userName;
    /**
     * Instantiates a new userInstallStateSummary and sets the default values.
     * @return a void
     */
    public UserInstallStateSummary() {
        super();
        this.setOdataType("#microsoft.graph.userInstallStateSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userInstallStateSummary
     */
    @javax.annotation.Nonnull
    public static UserInstallStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserInstallStateSummary();
    }
    /**
     * Gets the deviceStates property value. The install state of the eBook.
     * @return a deviceInstallState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceInstallState> getDeviceStates() {
        return this._deviceStates;
    }
    /**
     * Gets the failedDeviceCount property value. Failed Device Count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this._failedDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserInstallStateSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceStates", (n) -> { currentObject.setDeviceStates(n.getCollectionOfObjectValues(DeviceInstallState::createFromDiscriminatorValue)); });
            this.put("failedDeviceCount", (n) -> { currentObject.setFailedDeviceCount(n.getIntegerValue()); });
            this.put("installedDeviceCount", (n) -> { currentObject.setInstalledDeviceCount(n.getIntegerValue()); });
            this.put("notInstalledDeviceCount", (n) -> { currentObject.setNotInstalledDeviceCount(n.getIntegerValue()); });
            this.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the installedDeviceCount property value. Installed Device Count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInstalledDeviceCount() {
        return this._installedDeviceCount;
    }
    /**
     * Gets the notInstalledDeviceCount property value. Not installed device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotInstalledDeviceCount() {
        return this._notInstalledDeviceCount;
    }
    /**
     * Gets the userName property value. User name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("deviceStates", this.getDeviceStates());
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
        writer.writeIntegerValue("installedDeviceCount", this.getInstalledDeviceCount());
        writer.writeIntegerValue("notInstalledDeviceCount", this.getNotInstalledDeviceCount());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the deviceStates property value. The install state of the eBook.
     * @param value Value to set for the deviceStates property.
     * @return a void
     */
    public void setDeviceStates(@javax.annotation.Nullable final java.util.List<DeviceInstallState> value) {
        this._deviceStates = value;
    }
    /**
     * Sets the failedDeviceCount property value. Failed Device Count.
     * @param value Value to set for the failedDeviceCount property.
     * @return a void
     */
    public void setFailedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._failedDeviceCount = value;
    }
    /**
     * Sets the installedDeviceCount property value. Installed Device Count.
     * @param value Value to set for the installedDeviceCount property.
     * @return a void
     */
    public void setInstalledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._installedDeviceCount = value;
    }
    /**
     * Sets the notInstalledDeviceCount property value. Not installed device count.
     * @param value Value to set for the notInstalledDeviceCount property.
     * @return a void
     */
    public void setNotInstalledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._notInstalledDeviceCount = value;
    }
    /**
     * Sets the userName property value. User name.
     * @param value Value to set for the userName property.
     * @return a void
     */
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
}
