package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSimulationEventInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Browser information from where the simulation event was initiated by a user in an attack simulation and training campaign.
     */
    private String browser;
    /**
     * Date and time of the simulation event by a user in an attack simulation and training campaign.
     */
    private OffsetDateTime eventDateTime;
    /**
     * Name of the simulation event by a user in an attack simulation and training campaign.
     */
    private String eventName;
    /**
     * IP address from where the simulation event was initiated by a user in an attack simulation and training campaign.
     */
    private String ipAddress;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The operating system, platform, and device details from where the simulation event was initiated by a user in an attack simulation and training campaign.
     */
    private String osPlatformDeviceDetails;
    /**
     * Instantiates a new userSimulationEventInfo and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UserSimulationEventInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSimulationEventInfo
     */
    @jakarta.annotation.Nonnull
    public static UserSimulationEventInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSimulationEventInfo();
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
     * Gets the browser property value. Browser information from where the simulation event was initiated by a user in an attack simulation and training campaign.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBrowser() {
        return this.browser;
    }
    /**
     * Gets the eventDateTime property value. Date and time of the simulation event by a user in an attack simulation and training campaign.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.eventDateTime;
    }
    /**
     * Gets the eventName property value. Name of the simulation event by a user in an attack simulation and training campaign.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEventName() {
        return this.eventName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("browser", (n) -> { this.setBrowser(n.getStringValue()); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("eventName", (n) -> { this.setEventName(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("osPlatformDeviceDetails", (n) -> { this.setOsPlatformDeviceDetails(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. IP address from where the simulation event was initiated by a user in an attack simulation and training campaign.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
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
     * Gets the osPlatformDeviceDetails property value. The operating system, platform, and device details from where the simulation event was initiated by a user in an attack simulation and training campaign.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsPlatformDeviceDetails() {
        return this.osPlatformDeviceDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("eventName", this.getEventName());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("osPlatformDeviceDetails", this.getOsPlatformDeviceDetails());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the browser property value. Browser information from where the simulation event was initiated by a user in an attack simulation and training campaign.
     * @param value Value to set for the browser property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBrowser(@jakarta.annotation.Nullable final String value) {
        this.browser = value;
    }
    /**
     * Sets the eventDateTime property value. Date and time of the simulation event by a user in an attack simulation and training campaign.
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.eventDateTime = value;
    }
    /**
     * Sets the eventName property value. Name of the simulation event by a user in an attack simulation and training campaign.
     * @param value Value to set for the eventName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEventName(@jakarta.annotation.Nullable final String value) {
        this.eventName = value;
    }
    /**
     * Sets the ipAddress property value. IP address from where the simulation event was initiated by a user in an attack simulation and training campaign.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the osPlatformDeviceDetails property value. The operating system, platform, and device details from where the simulation event was initiated by a user in an attack simulation and training campaign.
     * @param value Value to set for the osPlatformDeviceDetails property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOsPlatformDeviceDetails(@jakarta.annotation.Nullable final String value) {
        this.osPlatformDeviceDetails = value;
    }
}
