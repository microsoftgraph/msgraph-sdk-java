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
    /** The attackSimulationUser property */
    private AttackSimulationUser _attackSimulationUser;
    /** The clickCount property */
    private Integer _clickCount;
    /** The compromisedCount property */
    private Integer _compromisedCount;
    /** The latestSimulationDateTime property */
    private OffsetDateTime _latestSimulationDateTime;
    /** The OdataType property */
    private String _odataType;
    /** The simulationCount property */
    private Integer _simulationCount;
    /**
     * Instantiates a new attackSimulationSimulationUserCoverage and sets the default values.
     * @return a void
     */
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
     * Gets the attackSimulationUser property value. The attackSimulationUser property
     * @return a attackSimulationUser
     */
    @javax.annotation.Nullable
    public AttackSimulationUser getAttackSimulationUser() {
        return this._attackSimulationUser;
    }
    /**
     * Gets the clickCount property value. The clickCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getClickCount() {
        return this._clickCount;
    }
    /**
     * Gets the compromisedCount property value. The compromisedCount property
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
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("attackSimulationUser", (n) -> { currentObject.setAttackSimulationUser(n.getObjectValue(AttackSimulationUser::createFromDiscriminatorValue)); });
            this.put("clickCount", (n) -> { currentObject.setClickCount(n.getIntegerValue()); });
            this.put("compromisedCount", (n) -> { currentObject.setCompromisedCount(n.getIntegerValue()); });
            this.put("latestSimulationDateTime", (n) -> { currentObject.setLatestSimulationDateTime(n.getOffsetDateTimeValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("simulationCount", (n) -> { currentObject.setSimulationCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the latestSimulationDateTime property value. The latestSimulationDateTime property
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
     * Gets the simulationCount property value. The simulationCount property
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the attackSimulationUser property value. The attackSimulationUser property
     * @param value Value to set for the attackSimulationUser property.
     * @return a void
     */
    public void setAttackSimulationUser(@javax.annotation.Nullable final AttackSimulationUser value) {
        this._attackSimulationUser = value;
    }
    /**
     * Sets the clickCount property value. The clickCount property
     * @param value Value to set for the clickCount property.
     * @return a void
     */
    public void setClickCount(@javax.annotation.Nullable final Integer value) {
        this._clickCount = value;
    }
    /**
     * Sets the compromisedCount property value. The compromisedCount property
     * @param value Value to set for the compromisedCount property.
     * @return a void
     */
    public void setCompromisedCount(@javax.annotation.Nullable final Integer value) {
        this._compromisedCount = value;
    }
    /**
     * Sets the latestSimulationDateTime property value. The latestSimulationDateTime property
     * @param value Value to set for the latestSimulationDateTime property.
     * @return a void
     */
    public void setLatestSimulationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._latestSimulationDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the simulationCount property value. The simulationCount property
     * @param value Value to set for the simulationCount property.
     * @return a void
     */
    public void setSimulationCount(@javax.annotation.Nullable final Integer value) {
        this._simulationCount = value;
    }
}
