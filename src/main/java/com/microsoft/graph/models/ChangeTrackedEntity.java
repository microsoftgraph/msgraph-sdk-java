package com.microsoft.graph.models;

import com.microsoft.graph.models.OfferShiftRequest;
import com.microsoft.graph.models.OpenShift;
import com.microsoft.graph.models.OpenShiftChangeRequest;
import com.microsoft.graph.models.ScheduleChangeRequest;
import com.microsoft.graph.models.SchedulingGroup;
import com.microsoft.graph.models.Shift;
import com.microsoft.graph.models.ShiftPreferences;
import com.microsoft.graph.models.SwapShiftsChangeRequest;
import com.microsoft.graph.models.TimeOff;
import com.microsoft.graph.models.TimeOffReason;
import com.microsoft.graph.models.TimeOffRequest;
import com.microsoft.graph.models.WorkforceIntegration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreement entities. */
public class ChangeTrackedEntity extends Entity implements Parsable {
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _createdDateTime;
    /** Identity of the person who last modified the entity. */
    private IdentitySet _lastModifiedBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _lastModifiedDateTime;
    /**
     * Instantiates a new changeTrackedEntity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChangeTrackedEntity() {
        super();
        this.setOdataType("#microsoft.graph.changeTrackedEntity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a changeTrackedEntity
     */
    @javax.annotation.Nonnull
    public static ChangeTrackedEntity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.offerShiftRequest": return new OfferShiftRequest();
                case "#microsoft.graph.openShift": return new OpenShift();
                case "#microsoft.graph.openShiftChangeRequest": return new OpenShiftChangeRequest();
                case "#microsoft.graph.scheduleChangeRequest": return new ScheduleChangeRequest();
                case "#microsoft.graph.schedulingGroup": return new SchedulingGroup();
                case "#microsoft.graph.shift": return new Shift();
                case "#microsoft.graph.shiftPreferences": return new ShiftPreferences();
                case "#microsoft.graph.swapShiftsChangeRequest": return new SwapShiftsChangeRequest();
                case "#microsoft.graph.timeOff": return new TimeOff();
                case "#microsoft.graph.timeOffReason": return new TimeOffReason();
                case "#microsoft.graph.timeOffRequest": return new TimeOffRequest();
                case "#microsoft.graph.workforceIntegration": return new WorkforceIntegration();
            }
        }
        return new ChangeTrackedEntity();
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChangeTrackedEntity currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the person who last modified the entity.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
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
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the person who last modified the entity.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
}
