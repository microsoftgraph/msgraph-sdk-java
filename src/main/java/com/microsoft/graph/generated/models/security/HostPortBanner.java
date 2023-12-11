package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostPortBanner implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new HostPortBanner and sets the default values.
     */
    public HostPortBanner() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HostPortBanner
     */
    @jakarta.annotation.Nonnull
    public static HostPortBanner createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostPortBanner();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the banner property value. The text response received from a web component when scanning a hostPort.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBanner() {
        return this.backingStore.get("banner");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("banner", (n) -> { this.setBanner(n.getStringValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("scanProtocol", (n) -> { this.setScanProtocol(n.getStringValue()); });
        deserializerMap.put("timesObserved", (n) -> { this.setTimesObserved(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The first date and time when Microsoft Defender Threat Intelligence observed the hostPortBanner. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.backingStore.get("firstSeenDateTime");
    }
    /**
     * Gets the lastSeenDateTime property value. The last date and time when Microsoft Defender Threat Intelligence observed the hostPortBanner. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.backingStore.get("lastSeenDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the scanProtocol property value. The specific protocol used to scan the hostPort.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScanProtocol() {
        return this.backingStore.get("scanProtocol");
    }
    /**
     * Gets the timesObserved property value. The total amount of times that Microsoft Defender Threat Intelligence has observed the hostPortBanner in all its scans.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTimesObserved() {
        return this.backingStore.get("timesObserved");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("banner", this.getBanner());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("scanProtocol", this.getScanProtocol());
        writer.writeIntegerValue("timesObserved", this.getTimesObserved());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the banner property value. The text response received from a web component when scanning a hostPort.
     * @param value Value to set for the banner property.
     */
    public void setBanner(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("banner", value);
    }
    /**
     * Sets the firstSeenDateTime property value. The first date and time when Microsoft Defender Threat Intelligence observed the hostPortBanner. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstSeenDateTime", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The last date and time when Microsoft Defender Threat Intelligence observed the hostPortBanner. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSeenDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the scanProtocol property value. The specific protocol used to scan the hostPort.
     * @param value Value to set for the scanProtocol property.
     */
    public void setScanProtocol(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scanProtocol", value);
    }
    /**
     * Sets the timesObserved property value. The total amount of times that Microsoft Defender Threat Intelligence has observed the hostPortBanner in all its scans.
     * @param value Value to set for the timesObserved property.
     */
    public void setTimesObserved(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("timesObserved", value);
    }
}
