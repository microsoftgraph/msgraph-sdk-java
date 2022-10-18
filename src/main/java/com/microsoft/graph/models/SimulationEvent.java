package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SimulationEvent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Count of the simulation event occurrence in an attack simulation and training campaign. */
    private Integer _count;
    /** Name of the simulation event in an attack simulation and training campaign. */
    private String _eventName;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new simulationEvent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SimulationEvent() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.simulationEvent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a simulationEvent
     */
    @javax.annotation.Nonnull
    public static SimulationEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimulationEvent();
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
     * Gets the count property value. Count of the simulation event occurrence in an attack simulation and training campaign.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCount() {
        return this._count;
    }
    /**
     * Gets the eventName property value. Name of the simulation event in an attack simulation and training campaign.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventName() {
        return this._eventName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SimulationEvent currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("count", (n) -> { currentObject.setCount(n.getIntegerValue()); });
            this.put("eventName", (n) -> { currentObject.setEventName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("count", this.getCount());
        writer.writeStringValue("eventName", this.getEventName());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the count property value. Count of the simulation event occurrence in an attack simulation and training campaign.
     * @param value Value to set for the count property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCount(@javax.annotation.Nullable final Integer value) {
        this._count = value;
    }
    /**
     * Sets the eventName property value. Name of the simulation event in an attack simulation and training campaign.
     * @param value Value to set for the eventName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventName(@javax.annotation.Nullable final String value) {
        this._eventName = value;
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
}
