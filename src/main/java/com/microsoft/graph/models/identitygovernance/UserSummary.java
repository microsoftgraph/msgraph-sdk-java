package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of failed tasks for users in a user summary.
     */
    private Integer failedTasks;
    /**
     * The number of failed users in a user summary.
     */
    private Integer failedUsers;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The number of successful users in a user summary.
     */
    private Integer successfulUsers;
    /**
     * The total tasks of users in a user summary.
     */
    private Integer totalTasks;
    /**
     * The total number of users in a user summary
     */
    private Integer totalUsers;
    /**
     * Instantiates a new userSummary and sets the default values.
     */
    public UserSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSummary
     */
    @jakarta.annotation.Nonnull
    public static UserSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSummary();
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
     * Gets the failedTasks property value. The number of failed tasks for users in a user summary.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedTasks() {
        return this.failedTasks;
    }
    /**
     * Gets the failedUsers property value. The number of failed users in a user summary.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedUsers() {
        return this.failedUsers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("failedTasks", (n) -> { this.setFailedTasks(n.getIntegerValue()); });
        deserializerMap.put("failedUsers", (n) -> { this.setFailedUsers(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("successfulUsers", (n) -> { this.setSuccessfulUsers(n.getIntegerValue()); });
        deserializerMap.put("totalTasks", (n) -> { this.setTotalTasks(n.getIntegerValue()); });
        deserializerMap.put("totalUsers", (n) -> { this.setTotalUsers(n.getIntegerValue()); });
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
     * Gets the successfulUsers property value. The number of successful users in a user summary.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulUsers() {
        return this.successfulUsers;
    }
    /**
     * Gets the totalTasks property value. The total tasks of users in a user summary.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalTasks() {
        return this.totalTasks;
    }
    /**
     * Gets the totalUsers property value. The total number of users in a user summary
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalUsers() {
        return this.totalUsers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedTasks", this.getFailedTasks());
        writer.writeIntegerValue("failedUsers", this.getFailedUsers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("successfulUsers", this.getSuccessfulUsers());
        writer.writeIntegerValue("totalTasks", this.getTotalTasks());
        writer.writeIntegerValue("totalUsers", this.getTotalUsers());
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
     * Sets the failedTasks property value. The number of failed tasks for users in a user summary.
     * @param value Value to set for the failedTasks property.
     */
    public void setFailedTasks(@jakarta.annotation.Nullable final Integer value) {
        this.failedTasks = value;
    }
    /**
     * Sets the failedUsers property value. The number of failed users in a user summary.
     * @param value Value to set for the failedUsers property.
     */
    public void setFailedUsers(@jakarta.annotation.Nullable final Integer value) {
        this.failedUsers = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the successfulUsers property value. The number of successful users in a user summary.
     * @param value Value to set for the successfulUsers property.
     */
    public void setSuccessfulUsers(@jakarta.annotation.Nullable final Integer value) {
        this.successfulUsers = value;
    }
    /**
     * Sets the totalTasks property value. The total tasks of users in a user summary.
     * @param value Value to set for the totalTasks property.
     */
    public void setTotalTasks(@jakarta.annotation.Nullable final Integer value) {
        this.totalTasks = value;
    }
    /**
     * Sets the totalUsers property value. The total number of users in a user summary
     * @param value Value to set for the totalUsers property.
     */
    public void setTotalUsers(@jakarta.annotation.Nullable final Integer value) {
        this.totalUsers = value;
    }
}
