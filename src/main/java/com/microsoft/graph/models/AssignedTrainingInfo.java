package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AssignedTrainingInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of users who were assigned the training in an attack simulation and training campaign.
     */
    private Integer assignedUserCount;
    /**
     * Number of users who completed the training in an attack simulation and training campaign.
     */
    private Integer completedUserCount;
    /**
     * Display name of the training in an attack simulation and training campaign.
     */
    private String displayName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new assignedTrainingInfo and sets the default values.
     */
    public AssignedTrainingInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignedTrainingInfo
     */
    @jakarta.annotation.Nonnull
    public static AssignedTrainingInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignedTrainingInfo();
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
     * Gets the assignedUserCount property value. Number of users who were assigned the training in an attack simulation and training campaign.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAssignedUserCount() {
        return this.assignedUserCount;
    }
    /**
     * Gets the completedUserCount property value. Number of users who completed the training in an attack simulation and training campaign.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompletedUserCount() {
        return this.completedUserCount;
    }
    /**
     * Gets the displayName property value. Display name of the training in an attack simulation and training campaign.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("assignedUserCount", (n) -> { this.setAssignedUserCount(n.getIntegerValue()); });
        deserializerMap.put("completedUserCount", (n) -> { this.setCompletedUserCount(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("assignedUserCount", this.getAssignedUserCount());
        writer.writeIntegerValue("completedUserCount", this.getCompletedUserCount());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the assignedUserCount property value. Number of users who were assigned the training in an attack simulation and training campaign.
     * @param value Value to set for the assignedUserCount property.
     */
    public void setAssignedUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.assignedUserCount = value;
    }
    /**
     * Sets the completedUserCount property value. Number of users who completed the training in an attack simulation and training campaign.
     * @param value Value to set for the completedUserCount property.
     */
    public void setCompletedUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.completedUserCount = value;
    }
    /**
     * Sets the displayName property value. Display name of the training in an attack simulation and training campaign.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
