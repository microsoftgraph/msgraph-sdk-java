package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Scheduled Action Configuration */
public class DeviceComplianceActionItem extends Entity implements Parsable {
    /** Scheduled Action Type Enum */
    private DeviceComplianceActionType _actionType;
    /** Number of hours to wait till the action will be enforced. Valid values 0 to 8760 */
    private Integer _gracePeriodHours;
    /** A list of group IDs to speicify who to CC this notification message to. */
    private java.util.List<String> _notificationMessageCCList;
    /** What notification Message template to use */
    private String _notificationTemplateId;
    /**
     * Instantiates a new deviceComplianceActionItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceComplianceActionItem() {
        super();
        this.setOdataType("#microsoft.graph.deviceComplianceActionItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceActionItem
     */
    @javax.annotation.Nonnull
    public static DeviceComplianceActionItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceActionItem();
    }
    /**
     * Gets the actionType property value. Scheduled Action Type Enum
     * @return a deviceComplianceActionType
     */
    @javax.annotation.Nullable
    public DeviceComplianceActionType getActionType() {
        return this._actionType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceComplianceActionItem currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionType", (n) -> { currentObject.setActionType(n.getEnumValue(DeviceComplianceActionType.class)); });
        deserializerMap.put("gracePeriodHours", (n) -> { currentObject.setGracePeriodHours(n.getIntegerValue()); });
        deserializerMap.put("notificationMessageCCList", (n) -> { currentObject.setNotificationMessageCCList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notificationTemplateId", (n) -> { currentObject.setNotificationTemplateId(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the gracePeriodHours property value. Number of hours to wait till the action will be enforced. Valid values 0 to 8760
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGracePeriodHours() {
        return this._gracePeriodHours;
    }
    /**
     * Gets the notificationMessageCCList property value. A list of group IDs to speicify who to CC this notification message to.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNotificationMessageCCList() {
        return this._notificationMessageCCList;
    }
    /**
     * Gets the notificationTemplateId property value. What notification Message template to use
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationTemplateId() {
        return this._notificationTemplateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionType(@javax.annotation.Nullable final DeviceComplianceActionType value) {
        this._actionType = value;
    }
    /**
     * Sets the gracePeriodHours property value. Number of hours to wait till the action will be enforced. Valid values 0 to 8760
     * @param value Value to set for the gracePeriodHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGracePeriodHours(@javax.annotation.Nullable final Integer value) {
        this._gracePeriodHours = value;
    }
    /**
     * Sets the notificationMessageCCList property value. A list of group IDs to speicify who to CC this notification message to.
     * @param value Value to set for the notificationMessageCCList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationMessageCCList(@javax.annotation.Nullable final java.util.List<String> value) {
        this._notificationMessageCCList = value;
    }
    /**
     * Sets the notificationTemplateId property value. What notification Message template to use
     * @param value Value to set for the notificationTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationTemplateId(@javax.annotation.Nullable final String value) {
        this._notificationTemplateId = value;
    }
}
