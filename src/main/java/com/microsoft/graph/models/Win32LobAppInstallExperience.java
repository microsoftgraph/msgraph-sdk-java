package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains installation experience properties for a Win32 App */
public class Win32LobAppInstallExperience implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates the type of restart action. */
    private Win32LobAppRestartBehavior _deviceRestartBehavior;
    /** Indicates the type of execution context the app runs in. */
    private RunAsAccountType _runAsAccount;
    /**
     * Instantiates a new win32LobAppInstallExperience and sets the default values.
     * @return a void
     */
    public Win32LobAppInstallExperience() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobAppInstallExperience
     */
    @javax.annotation.Nonnull
    public static Win32LobAppInstallExperience createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppInstallExperience();
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
     * Gets the deviceRestartBehavior property value. Indicates the type of restart action.
     * @return a win32LobAppRestartBehavior
     */
    @javax.annotation.Nullable
    public Win32LobAppRestartBehavior getDeviceRestartBehavior() {
        return this._deviceRestartBehavior;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Win32LobAppInstallExperience currentObject = this;
        return new HashMap<>(2) {{
            this.put("deviceRestartBehavior", (n) -> { currentObject.setDeviceRestartBehavior(n.getEnumValue(Win32LobAppRestartBehavior.class)); });
            this.put("runAsAccount", (n) -> { currentObject.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
        }};
    }
    /**
     * Gets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @return a runAsAccountType
     */
    @javax.annotation.Nullable
    public RunAsAccountType getRunAsAccount() {
        return this._runAsAccount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("deviceRestartBehavior", this.getDeviceRestartBehavior());
        writer.writeEnumValue("runAsAccount", this.getRunAsAccount());
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
     * Sets the deviceRestartBehavior property value. Indicates the type of restart action.
     * @param value Value to set for the deviceRestartBehavior property.
     * @return a void
     */
    public void setDeviceRestartBehavior(@javax.annotation.Nullable final Win32LobAppRestartBehavior value) {
        this._deviceRestartBehavior = value;
    }
    /**
     * Sets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @param value Value to set for the runAsAccount property.
     * @return a void
     */
    public void setRunAsAccount(@javax.annotation.Nullable final RunAsAccountType value) {
        this._runAsAccount = value;
    }
}
