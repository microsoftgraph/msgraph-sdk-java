package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserTrainingEventInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new UserTrainingEventInfo and sets the default values.
     */
    public UserTrainingEventInfo() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserTrainingEventInfo
     */
    @jakarta.annotation.Nonnull
    public static UserTrainingEventInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserTrainingEventInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the displayName property value. Display name of the training.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("latestTrainingStatus", (n) -> { this.setLatestTrainingStatus(n.getEnumValue(TrainingStatus.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("trainingAssignedProperties", (n) -> { this.setTrainingAssignedProperties(n.getObjectValue(UserTrainingContentEventInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("trainingCompletedProperties", (n) -> { this.setTrainingCompletedProperties(n.getObjectValue(UserTrainingContentEventInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("trainingUpdatedProperties", (n) -> { this.setTrainingUpdatedProperties(n.getObjectValue(UserTrainingContentEventInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the latestTrainingStatus property value. Latest status of the training assigned to the user. Possible values are: unknown, assigned, inProgress, completed, overdue, unknownFutureValue.
     * @return a TrainingStatus
     */
    @jakarta.annotation.Nullable
    public TrainingStatus getLatestTrainingStatus() {
        return this.BackingStore.get("latestTrainingStatus");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the trainingAssignedProperties property value. Event details of the training when it was assigned to the user.
     * @return a UserTrainingContentEventInfo
     */
    @jakarta.annotation.Nullable
    public UserTrainingContentEventInfo getTrainingAssignedProperties() {
        return this.BackingStore.get("trainingAssignedProperties");
    }
    /**
     * Gets the trainingCompletedProperties property value. Event details of the training when it was completed by the user.
     * @return a UserTrainingContentEventInfo
     */
    @jakarta.annotation.Nullable
    public UserTrainingContentEventInfo getTrainingCompletedProperties() {
        return this.BackingStore.get("trainingCompletedProperties");
    }
    /**
     * Gets the trainingUpdatedProperties property value. Event details of the training when it was updated/in-progress by the user.
     * @return a UserTrainingContentEventInfo
     */
    @jakarta.annotation.Nullable
    public UserTrainingContentEventInfo getTrainingUpdatedProperties() {
        return this.BackingStore.get("trainingUpdatedProperties");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("latestTrainingStatus", this.getLatestTrainingStatus());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("trainingAssignedProperties", this.getTrainingAssignedProperties());
        writer.writeObjectValue("trainingCompletedProperties", this.getTrainingCompletedProperties());
        writer.writeObjectValue("trainingUpdatedProperties", this.getTrainingUpdatedProperties());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the displayName property value. Display name of the training.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the latestTrainingStatus property value. Latest status of the training assigned to the user. Possible values are: unknown, assigned, inProgress, completed, overdue, unknownFutureValue.
     * @param value Value to set for the latestTrainingStatus property.
     */
    public void setLatestTrainingStatus(@jakarta.annotation.Nullable final TrainingStatus value) {
        this.BackingStore.set("latestTrainingStatus", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the trainingAssignedProperties property value. Event details of the training when it was assigned to the user.
     * @param value Value to set for the trainingAssignedProperties property.
     */
    public void setTrainingAssignedProperties(@jakarta.annotation.Nullable final UserTrainingContentEventInfo value) {
        this.BackingStore.set("trainingAssignedProperties", value);
    }
    /**
     * Sets the trainingCompletedProperties property value. Event details of the training when it was completed by the user.
     * @param value Value to set for the trainingCompletedProperties property.
     */
    public void setTrainingCompletedProperties(@jakarta.annotation.Nullable final UserTrainingContentEventInfo value) {
        this.BackingStore.set("trainingCompletedProperties", value);
    }
    /**
     * Sets the trainingUpdatedProperties property value. Event details of the training when it was updated/in-progress by the user.
     * @param value Value to set for the trainingUpdatedProperties property.
     */
    public void setTrainingUpdatedProperties(@jakarta.annotation.Nullable final UserTrainingContentEventInfo value) {
        this.BackingStore.set("trainingUpdatedProperties", value);
    }
}
