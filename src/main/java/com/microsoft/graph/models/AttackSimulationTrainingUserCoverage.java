package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttackSimulationTrainingUserCoverage implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** User in an attack simulation and training campaign. */
    private AttackSimulationUser _attackSimulationUser;
    /** The OdataType property */
    private String _odataType;
    /** List of assigned trainings and their statuses for the user. */
    private java.util.List<UserTrainingStatusInfo> _userTrainings;
    /**
     * Instantiates a new attackSimulationTrainingUserCoverage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AttackSimulationTrainingUserCoverage() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.attackSimulationTrainingUserCoverage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attackSimulationTrainingUserCoverage
     */
    @javax.annotation.Nonnull
    public static AttackSimulationTrainingUserCoverage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationTrainingUserCoverage();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttackSimulationTrainingUserCoverage currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("attackSimulationUser", (n) -> { currentObject.setAttackSimulationUser(n.getObjectValue(AttackSimulationUser::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("userTrainings", (n) -> { currentObject.setUserTrainings(n.getCollectionOfObjectValues(UserTrainingStatusInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the userTrainings property value. List of assigned trainings and their statuses for the user.
     * @return a userTrainingStatusInfo
     */
    @javax.annotation.Nullable
    public java.util.List<UserTrainingStatusInfo> getUserTrainings() {
        return this._userTrainings;
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
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("userTrainings", this.getUserTrainings());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the userTrainings property value. List of assigned trainings and their statuses for the user.
     * @param value Value to set for the userTrainings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserTrainings(@javax.annotation.Nullable final java.util.List<UserTrainingStatusInfo> value) {
        this._userTrainings = value;
    }
}
