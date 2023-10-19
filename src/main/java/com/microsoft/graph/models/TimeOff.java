package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
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
     */
    public TimeOff() {
        super();
        this.setOdataType("#microsoft.graph.timeOff");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TimeOff
     */
    @jakarta.annotation.Nonnull
    public static TimeOff createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeOff();
    }
    /**
     * Gets the draftTimeOff property value. The draft version of this timeOff that is viewable by managers. Required.
     * @return a TimeOffItem
     */
    @jakarta.annotation.Nullable
    public TimeOffItem getDraftTimeOff() {
        return this.draftTimeOff;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("draftTimeOff", (n) -> { this.setDraftTimeOff(n.getObjectValue(TimeOffItem::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedTimeOff", (n) -> { this.setSharedTimeOff(n.getObjectValue(TimeOffItem::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sharedTimeOff property value. The shared version of this timeOff that is viewable by both employees and managers. Required.
     * @return a TimeOffItem
     */
    @jakarta.annotation.Nullable
    public TimeOffItem getSharedTimeOff() {
        return this.sharedTimeOff;
    }
    /**
     * Gets the userId property value. ID of the user assigned to the timeOff. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("draftTimeOff", this.getDraftTimeOff());
        writer.writeObjectValue("sharedTimeOff", this.getSharedTimeOff());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the draftTimeOff property value. The draft version of this timeOff that is viewable by managers. Required.
     * @param value Value to set for the draftTimeOff property.
     */
    public void setDraftTimeOff(@jakarta.annotation.Nullable final TimeOffItem value) {
        this.draftTimeOff = value;
    }
    /**
     * Sets the sharedTimeOff property value. The shared version of this timeOff that is viewable by both employees and managers. Required.
     * @param value Value to set for the sharedTimeOff property.
     */
    public void setSharedTimeOff(@jakarta.annotation.Nullable final TimeOffItem value) {
        this.sharedTimeOff = value;
    }
    /**
     * Sets the userId property value. ID of the user assigned to the timeOff. Required.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
