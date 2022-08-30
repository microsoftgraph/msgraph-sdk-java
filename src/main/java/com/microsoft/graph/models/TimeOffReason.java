package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeOffReason extends ChangeTrackedEntity implements Parsable {
    /** The name of the timeOffReason. Required. */
    private String _displayName;
    /** Supported icon types: none; car; calendar; running; plane; firstAid; doctor; notWorking; clock; juryDuty; globe; cup; phone; weather; umbrella; piggyBank; dog; cake; trafficCone; pin; sunny. Required. */
    private TimeOffReasonIconType _iconType;
    /** Indicates whether the timeOffReason can be used when creating new entities or updating existing ones. Required. */
    private Boolean _isActive;
    /**
     * Instantiates a new TimeOffReason and sets the default values.
     * @return a void
     */
    public TimeOffReason() {
        super();
        this.setOdataType("#microsoft.graph.timeOffReason");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TimeOffReason
     */
    @javax.annotation.Nonnull
    public static TimeOffReason createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeOffReason();
    }
    /**
     * Gets the displayName property value. The name of the timeOffReason. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TimeOffReason currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("iconType", (n) -> { currentObject.setIconType(n.getEnumValue(TimeOffReasonIconType.class)); });
            this.put("isActive", (n) -> { currentObject.setIsActive(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the iconType property value. Supported icon types: none; car; calendar; running; plane; firstAid; doctor; notWorking; clock; juryDuty; globe; cup; phone; weather; umbrella; piggyBank; dog; cake; trafficCone; pin; sunny. Required.
     * @return a timeOffReasonIconType
     */
    @javax.annotation.Nullable
    public TimeOffReasonIconType getIconType() {
        return this._iconType;
    }
    /**
     * Gets the isActive property value. Indicates whether the timeOffReason can be used when creating new entities or updating existing ones. Required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsActive() {
        return this._isActive;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("iconType", this.getIconType());
        writer.writeBooleanValue("isActive", this.getIsActive());
    }
    /**
     * Sets the displayName property value. The name of the timeOffReason. Required.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the iconType property value. Supported icon types: none; car; calendar; running; plane; firstAid; doctor; notWorking; clock; juryDuty; globe; cup; phone; weather; umbrella; piggyBank; dog; cake; trafficCone; pin; sunny. Required.
     * @param value Value to set for the iconType property.
     * @return a void
     */
    public void setIconType(@javax.annotation.Nullable final TimeOffReasonIconType value) {
        this._iconType = value;
    }
    /**
     * Sets the isActive property value. Indicates whether the timeOffReason can be used when creating new entities or updating existing ones. Required.
     * @param value Value to set for the isActive property.
     * @return a void
     */
    public void setIsActive(@javax.annotation.Nullable final Boolean value) {
        this._isActive = value;
    }
}
