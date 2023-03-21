package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device action result
 */
public class DeviceActionResult implements AdditionalDataHolder, Parsable {
    /** Action name */
    private String actionName;
    /** State of the action on the device */
    private ActionState actionState;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Time the action state was last updated */
    private OffsetDateTime lastUpdatedDateTime;
    /** The OdataType property */
    private String odataType;
    /** Time the action was initiated */
    private OffsetDateTime startDateTime;
    /**
     * Instantiates a new deviceActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceActionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceActionResult
     */
    @javax.annotation.Nonnull
    public static DeviceActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deleteUserFromSharedAppleDeviceActionResult": return new DeleteUserFromSharedAppleDeviceActionResult();
                case "#microsoft.graph.locateDeviceActionResult": return new LocateDeviceActionResult();
                case "#microsoft.graph.remoteLockActionResult": return new RemoteLockActionResult();
                case "#microsoft.graph.resetPasscodeActionResult": return new ResetPasscodeActionResult();
                case "#microsoft.graph.windowsDefenderScanActionResult": return new WindowsDefenderScanActionResult();
            }
        }
        return new DeviceActionResult();
    }
    /**
     * Gets the actionName property value. Action name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionName() {
        return this.actionName;
    }
    /**
     * Gets the actionState property value. State of the action on the device
     * @return a actionState
     */
    @javax.annotation.Nullable
    public ActionState getActionState() {
        return this.actionState;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("actionName", (n) -> { this.setActionName(n.getStringValue()); });
        deserializerMap.put("actionState", (n) -> { this.setActionState(n.getEnumValue(ActionState.class)); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Time the action state was last updated
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the startDateTime property value. Time the action was initiated
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionName", this.getActionName());
        writer.writeEnumValue("actionState", this.getActionState());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionName property value. Action name
     * @param value Value to set for the actionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionName(@javax.annotation.Nullable final String value) {
        this.actionName = value;
    }
    /**
     * Sets the actionState property value. State of the action on the device
     * @param value Value to set for the actionState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionState(@javax.annotation.Nullable final ActionState value) {
        this.actionState = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Time the action state was last updated
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the startDateTime property value. Time the action was initiated
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
}
