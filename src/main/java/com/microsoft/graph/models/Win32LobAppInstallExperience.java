package com.microsoft.graph.models;

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
    /** The OdataType property */
    private String _odataType;
    /** Indicates the type of execution context the app runs in. */
    private RunAsAccountType _runAsAccount;
    /**
     * Instantiates a new win32LobAppInstallExperience and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("deviceRestartBehavior", (n) -> { this.setDeviceRestartBehavior(n.getEnumValue(Win32LobAppRestartBehavior.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("runAsAccount", (n) -> { this.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
        return deserializerMap;
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("deviceRestartBehavior", this.getDeviceRestartBehavior());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("runAsAccount", this.getRunAsAccount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the deviceRestartBehavior property value. Indicates the type of restart action.
     * @param value Value to set for the deviceRestartBehavior property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceRestartBehavior(@javax.annotation.Nullable final Win32LobAppRestartBehavior value) {
        this._deviceRestartBehavior = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @param value Value to set for the runAsAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRunAsAccount(@javax.annotation.Nullable final RunAsAccountType value) {
        this._runAsAccount = value;
    }
}
