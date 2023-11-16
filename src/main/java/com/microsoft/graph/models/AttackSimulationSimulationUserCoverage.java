package com.microsoft.graph.models;

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
public class AttackSimulationSimulationUserCoverage implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new AttackSimulationSimulationUserCoverage and sets the default values.
     */
    public AttackSimulationSimulationUserCoverage() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttackSimulationSimulationUserCoverage
     */
    @jakarta.annotation.Nonnull
    public static AttackSimulationSimulationUserCoverage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationSimulationUserCoverage();
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
     * Gets the attackSimulationUser property value. User in an attack simulation and training campaign.
     * @return a AttackSimulationUser
     */
    @jakarta.annotation.Nullable
    public AttackSimulationUser getAttackSimulationUser() {
        return this.backingStore.get("attackSimulationUser");
    }
    /**
     * Gets the clickCount property value. Number of link clicks in the received payloads by the user in attack simulation and training campaigns.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getClickCount() {
        return this.backingStore.get("clickCount");
    }
    /**
     * Gets the compromisedCount property value. Number of compromising actions by the user in attack simulation and training campaigns.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompromisedCount() {
        return this.backingStore.get("compromisedCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("attackSimulationUser", (n) -> { this.setAttackSimulationUser(n.getObjectValue(AttackSimulationUser::createFromDiscriminatorValue)); });
        deserializerMap.put("clickCount", (n) -> { this.setClickCount(n.getIntegerValue()); });
        deserializerMap.put("compromisedCount", (n) -> { this.setCompromisedCount(n.getIntegerValue()); });
        deserializerMap.put("latestSimulationDateTime", (n) -> { this.setLatestSimulationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("simulationCount", (n) -> { this.setSimulationCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the latestSimulationDateTime property value. Date and time of the latest attack simulation and training campaign that the user was included in.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLatestSimulationDateTime() {
        return this.backingStore.get("latestSimulationDateTime");
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
     * Gets the simulationCount property value. Number of attack simulation and training campaigns that the user was included in.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSimulationCount() {
        return this.backingStore.get("simulationCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("attackSimulationUser", this.getAttackSimulationUser());
        writer.writeIntegerValue("clickCount", this.getClickCount());
        writer.writeIntegerValue("compromisedCount", this.getCompromisedCount());
        writer.writeOffsetDateTimeValue("latestSimulationDateTime", this.getLatestSimulationDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("simulationCount", this.getSimulationCount());
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
     * Sets the attackSimulationUser property value. User in an attack simulation and training campaign.
     * @param value Value to set for the attackSimulationUser property.
     */
    public void setAttackSimulationUser(@jakarta.annotation.Nullable final AttackSimulationUser value) {
        this.backingStore.set("attackSimulationUser", value);
    }
    /**
     * Sets the clickCount property value. Number of link clicks in the received payloads by the user in attack simulation and training campaigns.
     * @param value Value to set for the clickCount property.
     */
    public void setClickCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("clickCount", value);
    }
    /**
     * Sets the compromisedCount property value. Number of compromising actions by the user in attack simulation and training campaigns.
     * @param value Value to set for the compromisedCount property.
     */
    public void setCompromisedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("compromisedCount", value);
    }
    /**
     * Sets the latestSimulationDateTime property value. Date and time of the latest attack simulation and training campaign that the user was included in.
     * @param value Value to set for the latestSimulationDateTime property.
     */
    public void setLatestSimulationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("latestSimulationDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the simulationCount property value. Number of attack simulation and training campaigns that the user was included in.
     * @param value Value to set for the simulationCount property.
     */
    public void setSimulationCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("simulationCount", value);
    }
}
