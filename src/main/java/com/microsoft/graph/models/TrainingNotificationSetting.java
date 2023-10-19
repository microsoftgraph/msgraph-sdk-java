package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrainingNotificationSetting extends EndUserNotificationSetting implements Parsable {
    /**
     * The trainingAssignment property
     */
    private BaseEndUserNotification trainingAssignment;
    /**
     * The trainingReminder property
     */
    private TrainingReminderNotification trainingReminder;
    /**
     * Instantiates a new TrainingNotificationSetting and sets the default values.
     */
    public TrainingNotificationSetting() {
        super();
        this.setOdataType("#microsoft.graph.trainingNotificationSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TrainingNotificationSetting
     */
    @jakarta.annotation.Nonnull
    public static TrainingNotificationSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrainingNotificationSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("trainingAssignment", (n) -> { this.setTrainingAssignment(n.getObjectValue(BaseEndUserNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("trainingReminder", (n) -> { this.setTrainingReminder(n.getObjectValue(TrainingReminderNotification::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the trainingAssignment property value. The trainingAssignment property
     * @return a BaseEndUserNotification
     */
    @jakarta.annotation.Nullable
    public BaseEndUserNotification getTrainingAssignment() {
        return this.trainingAssignment;
    }
    /**
     * Gets the trainingReminder property value. The trainingReminder property
     * @return a TrainingReminderNotification
     */
    @jakarta.annotation.Nullable
    public TrainingReminderNotification getTrainingReminder() {
        return this.trainingReminder;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("trainingAssignment", this.getTrainingAssignment());
        writer.writeObjectValue("trainingReminder", this.getTrainingReminder());
    }
    /**
     * Sets the trainingAssignment property value. The trainingAssignment property
     * @param value Value to set for the trainingAssignment property.
     */
    public void setTrainingAssignment(@jakarta.annotation.Nullable final BaseEndUserNotification value) {
        this.trainingAssignment = value;
    }
    /**
     * Sets the trainingReminder property value. The trainingReminder property
     * @param value Value to set for the trainingReminder property.
     */
    public void setTrainingReminder(@jakarta.annotation.Nullable final TrainingReminderNotification value) {
        this.trainingReminder = value;
    }
}
