package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttackSimulationRepeatOffender implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The user in an attack simulation and training campaign.
     */
    private AttackSimulationUser attackSimulationUser;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Number of repeat offences of the user in attack simulation and training campaigns.
     */
    private Integer repeatOffenceCount;
    /**
     * Instantiates a new attackSimulationRepeatOffender and sets the default values.
     */
    public AttackSimulationRepeatOffender() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attackSimulationRepeatOffender
     */
    @jakarta.annotation.Nonnull
    public static AttackSimulationRepeatOffender createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationRepeatOffender();
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
     * Gets the attackSimulationUser property value. The user in an attack simulation and training campaign.
     * @return a attackSimulationUser
     */
    @jakarta.annotation.Nullable
    public AttackSimulationUser getAttackSimulationUser() {
        return this.attackSimulationUser;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("attackSimulationUser", (n) -> { this.setAttackSimulationUser(n.getObjectValue(AttackSimulationUser::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("repeatOffenceCount", (n) -> { this.setRepeatOffenceCount(n.getIntegerValue()); });
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
     * Gets the repeatOffenceCount property value. Number of repeat offences of the user in attack simulation and training campaigns.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getRepeatOffenceCount() {
        return this.repeatOffenceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("attackSimulationUser", this.getAttackSimulationUser());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("repeatOffenceCount", this.getRepeatOffenceCount());
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
     * Sets the attackSimulationUser property value. The user in an attack simulation and training campaign.
     * @param value Value to set for the attackSimulationUser property.
     */
    public void setAttackSimulationUser(@jakarta.annotation.Nullable final AttackSimulationUser value) {
        this.attackSimulationUser = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the repeatOffenceCount property value. Number of repeat offences of the user in attack simulation and training campaigns.
     * @param value Value to set for the repeatOffenceCount property.
     */
    public void setRepeatOffenceCount(@jakarta.annotation.Nullable final Integer value) {
        this.repeatOffenceCount = value;
    }
}
