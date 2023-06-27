package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeOff extends ChangeTrackedEntity implements Parsable {
    /**
     * The draft version of this timeOff that is viewable by managers. Required.
     */
    private TimeOffItem draftTimeOff;
    /**
     * The shared version of this timeOff that is viewable by both employees and managers. Required.
     */
    private TimeOffItem sharedTimeOff;
    /**
     * ID of the user assigned to the timeOff. Required.
     */
    private String userId;
    /**
     * Instantiates a new TimeOff and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TimeOff() {
        super();
        this.setOdataType("#microsoft.graph.timeOff");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TimeOff
     */
    @javax.annotation.Nonnull
    public static TimeOff createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeOff();
    }
    /**
     * Gets the draftTimeOff property value. The draft version of this timeOff that is viewable by managers. Required.
     * @return a timeOffItem
     */
    @javax.annotation.Nullable
    public TimeOffItem getDraftTimeOff() {
        return this.draftTimeOff;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("draftTimeOff", (n) -> { this.setDraftTimeOff(n.getObjectValue(TimeOffItem::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedTimeOff", (n) -> { this.setSharedTimeOff(n.getObjectValue(TimeOffItem::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sharedTimeOff property value. The shared version of this timeOff that is viewable by both employees and managers. Required.
     * @return a timeOffItem
     */
    @javax.annotation.Nullable
    public TimeOffItem getSharedTimeOff() {
        return this.sharedTimeOff;
    }
    /**
     * Gets the userId property value. ID of the user assigned to the timeOff. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
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
        writer.writeObjectValue("draftTimeOff", this.getDraftTimeOff());
        writer.writeObjectValue("sharedTimeOff", this.getSharedTimeOff());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the draftTimeOff property value. The draft version of this timeOff that is viewable by managers. Required.
     * @param value Value to set for the draftTimeOff property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDraftTimeOff(@javax.annotation.Nullable final TimeOffItem value) {
        this.draftTimeOff = value;
    }
    /**
     * Sets the sharedTimeOff property value. The shared version of this timeOff that is viewable by both employees and managers. Required.
     * @param value Value to set for the sharedTimeOff property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedTimeOff(@javax.annotation.Nullable final TimeOffItem value) {
        this.sharedTimeOff = value;
    }
    /**
     * Sets the userId property value. ID of the user assigned to the timeOff. Required.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
}
