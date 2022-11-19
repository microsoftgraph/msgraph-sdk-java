package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttackSimulationSimulationUserCoverage implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** User in an attack simulation and training campaign. */
    private AttackSimulationUser _attackSimulationUser;
    /** Number of link clicks in the received payloads by the user in attack simulation and training campaigns. */
    private Integer _clickCount;
    /** Number of compromising actions by the user in attack simulation and training campaigns. */
    private Integer _compromisedCount;
    /** Date and time of the latest attack simulation and training campaign that the user was included in. */
    private OffsetDateTime _latestSimulationDateTime;
    /** The OdataType property */
    private String _odataType;
    /** Number of attack simulation and training campaigns that the user was included in. */
    private Integer _simulationCount;
    /**
     * Instantiates a new attackSimulationSimulationUserCoverage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AttackSimulationSimulationUserCoverage() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.attackSimulationSimulationUserCoverage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attackSimulationSimulationUserCoverage
     */
    @javax.annotation.Nonnull
    public static AttackSimulationSimulationUserCoverage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationSimulationUserCoverage();
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
     * Gets the attackSimulationUser property value. User in an attack simulation and training campaign.
     * @return a attackSimulationUser
     */
    @javax.annotation.Nullable
    public AttackSimulationUser getAttackSimulationUser() {
        return this._attackSimulationUser;
    }
    /**
     * Gets the clickCount property value. Number of link clicks in the received payloads by the user in attack simulation and training campaigns.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getClickCount() {
        return this._clickCount;
    }
    /**
     * Gets the compromisedCount property value. Number of compromising actions by the user in attack simulation and training campaigns.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompromisedCount() {
        return this._compromisedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttackSimulationSimulationUserCoverage currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("attackSimulationUser", (n) -> { currentObject.setAttackSimulationUser(n.getObjectValue(AttackSimulationUser::createFromDiscriminatorValue)); });
        deserializerMap.put("clickCount", (n) -> { currentObject.setClickCount(n.getIntegerValue()); });
        deserializerMap.put("compromisedCount", (n) -> { currentObject.setCompromisedCount(n.getIntegerValue()); });
        deserializerMap.put("latestSimulationDateTime", (n) -> { currentObject.setLatestSimulationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("simulationCount", (n) -> { currentObject.setSimulationCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the latestSimulationDateTime property value. Date and time of the latest attack simulation and training campaign that the user was included in.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLatestSimulationDateTime() {
        return this._latestSimulationDateTime;
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
     * Gets the simulationCount property value. Number of attack simulation and training campaigns that the user was included in.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSimulationCount() {
        return this._simulationCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the attackSimulationUser property value. User in an attack simulation and training campaign.
     * @param value Value to set for the attackSimulationUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttackSimulationUser(@javax.annotation.Nullable final AttackSimulationUser value) {
        this._attackSimulationUser = value;
    }
    /**
     * Sets the clickCount property value. Number of link clicks in the received payloads by the user in attack simulation and training campaigns.
     * @param value Value to set for the clickCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClickCount(@javax.annotation.Nullable final Integer value) {
        this._clickCount = value;
    }
    /**
     * Sets the compromisedCount property value. Number of compromising actions by the user in attack simulation and training campaigns.
     * @param value Value to set for the compromisedCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompromisedCount(@javax.annotation.Nullable final Integer value) {
        this._compromisedCount = value;
    }
    /**
     * Sets the latestSimulationDateTime property value. Date and time of the latest attack simulation and training campaign that the user was included in.
     * @param value Value to set for the latestSimulationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLatestSimulationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._latestSimulationDateTime = value;
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
     * Sets the simulationCount property value. Number of attack simulation and training campaigns that the user was included in.
     * @param value Value to set for the simulationCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSimulationCount(@javax.annotation.Nullable final Integer value) {
        this._simulationCount = value;
    }
}
