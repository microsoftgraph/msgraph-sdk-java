package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttackSimulationTrainingUserCoverage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * User in an attack simulation and training campaign.
     */
    private AttackSimulationUser attackSimulationUser;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * List of assigned trainings and their statuses for the user.
     */
    private java.util.List<UserTrainingStatusInfo> userTrainings;
    /**
     * Instantiates a new attackSimulationTrainingUserCoverage and sets the default values.
     */
    public AttackSimulationTrainingUserCoverage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attackSimulationTrainingUserCoverage
     */
    @jakarta.annotation.Nonnull
    public static AttackSimulationTrainingUserCoverage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationTrainingUserCoverage();
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
     * Gets the attackSimulationUser property value. User in an attack simulation and training campaign.
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
        deserializerMap.put("userTrainings", (n) -> { this.setUserTrainings(n.getCollectionOfObjectValues(UserTrainingStatusInfo::createFromDiscriminatorValue)); });
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
     * Gets the userTrainings property value. List of assigned trainings and their statuses for the user.
     * @return a userTrainingStatusInfo
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserTrainingStatusInfo> getUserTrainings() {
        return this.userTrainings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("attackSimulationUser", this.getAttackSimulationUser());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("userTrainings", this.getUserTrainings());
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
     * Sets the attackSimulationUser property value. User in an attack simulation and training campaign.
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
     * Sets the userTrainings property value. List of assigned trainings and their statuses for the user.
     * @param value Value to set for the userTrainings property.
     */
    public void setUserTrainings(@jakarta.annotation.Nullable final java.util.List<UserTrainingStatusInfo> value) {
        this.userTrainings = value;
    }
}
