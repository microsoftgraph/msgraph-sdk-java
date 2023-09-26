package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Scheduled Action Configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceComplianceActionItem extends Entity implements Parsable {
    /**
     * Scheduled Action Type Enum
     */
    private DeviceComplianceActionType actionType;
    /**
     * Number of hours to wait till the action will be enforced. Valid values 0 to 8760
     */
    private Integer gracePeriodHours;
    /**
     * A list of group IDs to speicify who to CC this notification message to.
     */
    private java.util.List<String> notificationMessageCCList;
    /**
     * What notification Message template to use
     */
    private String notificationTemplateId;
    /**
     * Instantiates a new DeviceComplianceActionItem and sets the default values.
     */
    public DeviceComplianceActionItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceComplianceActionItem
     */
    @jakarta.annotation.Nonnull
    public static DeviceComplianceActionItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceActionItem();
    }
    /**
     * Gets the actionType property value. Scheduled Action Type Enum
     * @return a DeviceComplianceActionType
     */
    @jakarta.annotation.Nullable
    public DeviceComplianceActionType getActionType() {
        return this.actionType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionType", (n) -> { this.setActionType(n.getEnumValue(DeviceComplianceActionType.class)); });
        deserializerMap.put("gracePeriodHours", (n) -> { this.setGracePeriodHours(n.getIntegerValue()); });
        deserializerMap.put("notificationMessageCCList", (n) -> { this.setNotificationMessageCCList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notificationTemplateId", (n) -> { this.setNotificationTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodHours property value. Number of hours to wait till the action will be enforced. Valid values 0 to 8760
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getGracePeriodHours() {
        return this.gracePeriodHours;
    }
    /**
     * Gets the notificationMessageCCList property value. A list of group IDs to speicify who to CC this notification message to.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotificationMessageCCList() {
        return this.notificationMessageCCList;
    }
    /**
     * Gets the notificationTemplateId property value. What notification Message template to use
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNotificationTemplateId() {
        return this.notificationTemplateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("actionType", this.getActionType());
        writer.writeIntegerValue("gracePeriodHours", this.getGracePeriodHours());
        writer.writeCollectionOfPrimitiveValues("notificationMessageCCList", this.getNotificationMessageCCList());
        writer.writeStringValue("notificationTemplateId", this.getNotificationTemplateId());
    }
    /**
     * Sets the actionType property value. Scheduled Action Type Enum
     * @param value Value to set for the actionType property.
     */
    public void setActionType(@jakarta.annotation.Nullable final DeviceComplianceActionType value) {
        this.actionType = value;
    }
    /**
     * Sets the gracePeriodHours property value. Number of hours to wait till the action will be enforced. Valid values 0 to 8760
     * @param value Value to set for the gracePeriodHours property.
     */
    public void setGracePeriodHours(@jakarta.annotation.Nullable final Integer value) {
        this.gracePeriodHours = value;
    }
    /**
     * Sets the notificationMessageCCList property value. A list of group IDs to speicify who to CC this notification message to.
     * @param value Value to set for the notificationMessageCCList property.
     */
    public void setNotificationMessageCCList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.notificationMessageCCList = value;
    }
    /**
     * Sets the notificationTemplateId property value. What notification Message template to use
     * @param value Value to set for the notificationTemplateId property.
     */
    public void setNotificationTemplateId(@jakarta.annotation.Nullable final String value) {
        this.notificationTemplateId = value;
    }
}
