package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to determine when to offer an app to devices and when to install the app on devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppInstallTimeSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The time at which the app should be installed.
     */
    private OffsetDateTime deadlineDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The time at which the app should be available for installation.
     */
    private OffsetDateTime startDateTime;
    /**
     * Whether the local device time or UTC time should be used when determining the available and deadline times.
     */
    private Boolean useLocalTime;
    /**
     * Instantiates a new mobileAppInstallTimeSettings and sets the default values.
     */
    public MobileAppInstallTimeSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppInstallTimeSettings
     */
    @jakarta.annotation.Nonnull
    public static MobileAppInstallTimeSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppInstallTimeSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deadlineDateTime property value. The time at which the app should be installed.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeadlineDateTime() {
        return this.deadlineDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("deadlineDateTime", (n) -> { this.setDeadlineDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("useLocalTime", (n) -> { this.setUseLocalTime(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the startDateTime property value. The time at which the app should be available for installation.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the useLocalTime property value. Whether the local device time or UTC time should be used when determining the available and deadline times.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseLocalTime() {
        return this.useLocalTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("deadlineDateTime", this.getDeadlineDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeBooleanValue("useLocalTime", this.getUseLocalTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deadlineDateTime property value. The time at which the app should be installed.
     * @param value Value to set for the deadlineDateTime property.
     */
    public void setDeadlineDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.deadlineDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the startDateTime property value. The time at which the app should be available for installation.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the useLocalTime property value. Whether the local device time or UTC time should be used when determining the available and deadline times.
     * @param value Value to set for the useLocalTime property.
     */
    public void setUseLocalTime(@jakarta.annotation.Nullable final Boolean value) {
        this.useLocalTime = value;
    }
}
