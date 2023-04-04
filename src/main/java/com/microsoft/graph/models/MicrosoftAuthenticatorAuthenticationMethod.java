package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftAuthenticatorAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /** The date and time that this app was registered. This property is null if the device is not registered for passwordless Phone Sign-In. */
    private OffsetDateTime createdDateTime;
    /** The registered device on which Microsoft Authenticator resides. This property is null if the device is not registered for passwordless Phone Sign-In. */
    private Device device;
    /** Tags containing app metadata. */
    private String deviceTag;
    /** The name of the device on which this app is registered. */
    private String displayName;
    /** Numerical version of this instance of the Authenticator app. */
    private String phoneAppVersion;
    /**
     * Instantiates a new MicrosoftAuthenticatorAuthenticationMethod and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftAuthenticatorAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.microsoftAuthenticatorAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftAuthenticatorAuthenticationMethod
     */
    @javax.annotation.Nonnull
    public static MicrosoftAuthenticatorAuthenticationMethod createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAuthenticatorAuthenticationMethod();
    }
    /**
     * Gets the createdDateTime property value. The date and time that this app was registered. This property is null if the device is not registered for passwordless Phone Sign-In.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the device property value. The registered device on which Microsoft Authenticator resides. This property is null if the device is not registered for passwordless Phone Sign-In.
     * @return a device
     */
    @javax.annotation.Nullable
    public Device getDevice() {
        return this.device;
    }
    /**
     * Gets the deviceTag property value. Tags containing app metadata.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceTag() {
        return this.deviceTag;
    }
    /**
     * Gets the displayName property value. The name of the device on which this app is registered.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("device", (n) -> { this.setDevice(n.getObjectValue(Device::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceTag", (n) -> { this.setDeviceTag(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("phoneAppVersion", (n) -> { this.setPhoneAppVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the phoneAppVersion property value. Numerical version of this instance of the Authenticator app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneAppVersion() {
        return this.phoneAppVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("device", this.getDevice());
        writer.writeStringValue("deviceTag", this.getDeviceTag());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("phoneAppVersion", this.getPhoneAppVersion());
    }
    /**
     * Sets the createdDateTime property value. The date and time that this app was registered. This property is null if the device is not registered for passwordless Phone Sign-In.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the device property value. The registered device on which Microsoft Authenticator resides. This property is null if the device is not registered for passwordless Phone Sign-In.
     * @param value Value to set for the device property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDevice(@javax.annotation.Nullable final Device value) {
        this.device = value;
    }
    /**
     * Sets the deviceTag property value. Tags containing app metadata.
     * @param value Value to set for the deviceTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceTag(@javax.annotation.Nullable final String value) {
        this.deviceTag = value;
    }
    /**
     * Sets the displayName property value. The name of the device on which this app is registered.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the phoneAppVersion property value. Numerical version of this instance of the Authenticator app.
     * @param value Value to set for the phoneAppVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneAppVersion(@javax.annotation.Nullable final String value) {
        this.phoneAppVersion = value;
    }
}
