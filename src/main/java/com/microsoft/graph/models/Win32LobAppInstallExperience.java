package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains installation experience properties for a Win32 App
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppInstallExperience implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates the type of restart action.
     */
    private Win32LobAppRestartBehavior deviceRestartBehavior;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates the type of execution context the app runs in.
     */
    private RunAsAccountType runAsAccount;
    /**
     * Instantiates a new Win32LobAppInstallExperience and sets the default values.
     */
    public Win32LobAppInstallExperience() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppInstallExperience
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppInstallExperience createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppInstallExperience();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deviceRestartBehavior property value. Indicates the type of restart action.
     * @return a Win32LobAppRestartBehavior
     */
    @jakarta.annotation.Nullable
    public Win32LobAppRestartBehavior getDeviceRestartBehavior() {
        return this.deviceRestartBehavior;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("deviceRestartBehavior", (n) -> { this.setDeviceRestartBehavior(n.getEnumValue(Win32LobAppRestartBehavior.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("runAsAccount", (n) -> { this.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @return a RunAsAccountType
     */
    @jakarta.annotation.Nullable
    public RunAsAccountType getRunAsAccount() {
        return this.runAsAccount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("deviceRestartBehavior", this.getDeviceRestartBehavior());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("runAsAccount", this.getRunAsAccount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceRestartBehavior property value. Indicates the type of restart action.
     * @param value Value to set for the deviceRestartBehavior property.
     */
    public void setDeviceRestartBehavior(@jakarta.annotation.Nullable final Win32LobAppRestartBehavior value) {
        this.deviceRestartBehavior = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @param value Value to set for the runAsAccount property.
     */
    public void setRunAsAccount(@jakarta.annotation.Nullable final RunAsAccountType value) {
        this.runAsAccount = value;
    }
}
