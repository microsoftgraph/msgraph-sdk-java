package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostPortComponent implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The component property
     */
    private HostComponent component;
    /**
     * The first date and time when Microsoft Defender Threat Intelligence observed the hostPortComponent. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime firstSeenDateTime;
    /**
     * Indicates whether this hostPortComponent is recent, which is determined by whether the hostPortComponent was observed either at the same time or after the latest hostPortBanner in the scan history, or within two days of the latest scan of the hostPort when there are no hostPortBanners in the scan history.
     */
    private Boolean isRecent;
    /**
     * The last date and time when Microsoft Defender Threat Intelligence observed the hostPortComponent. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime lastSeenDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new HostPortComponent and sets the default values.
     */
    public HostPortComponent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HostPortComponent
     */
    @jakarta.annotation.Nonnull
    public static HostPortComponent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostPortComponent();
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
     * Gets the component property value. The component property
     * @return a HostComponent
     */
    @jakarta.annotation.Nullable
    public HostComponent getComponent() {
        return this.component;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("component", (n) -> { this.setComponent(n.getObjectValue(HostComponent::createFromDiscriminatorValue)); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isRecent", (n) -> { this.setIsRecent(n.getBooleanValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The first date and time when Microsoft Defender Threat Intelligence observed the hostPortComponent. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.firstSeenDateTime;
    }
    /**
     * Gets the isRecent property value. Indicates whether this hostPortComponent is recent, which is determined by whether the hostPortComponent was observed either at the same time or after the latest hostPortBanner in the scan history, or within two days of the latest scan of the hostPort when there are no hostPortBanners in the scan history.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRecent() {
        return this.isRecent;
    }
    /**
     * Gets the lastSeenDateTime property value. The last date and time when Microsoft Defender Threat Intelligence observed the hostPortComponent. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.lastSeenDateTime;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("component", this.getComponent());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeBooleanValue("isRecent", this.getIsRecent());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the component property value. The component property
     * @param value Value to set for the component property.
     */
    public void setComponent(@jakarta.annotation.Nullable final HostComponent value) {
        this.component = value;
    }
    /**
     * Sets the firstSeenDateTime property value. The first date and time when Microsoft Defender Threat Intelligence observed the hostPortComponent. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.firstSeenDateTime = value;
    }
    /**
     * Sets the isRecent property value. Indicates whether this hostPortComponent is recent, which is determined by whether the hostPortComponent was observed either at the same time or after the latest hostPortBanner in the scan history, or within two days of the latest scan of the hostPort when there are no hostPortBanners in the scan history.
     * @param value Value to set for the isRecent property.
     */
    public void setIsRecent(@jakarta.annotation.Nullable final Boolean value) {
        this.isRecent = value;
    }
    /**
     * Sets the lastSeenDateTime property value. The last date and time when Microsoft Defender Threat Intelligence observed the hostPortComponent. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSeenDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
