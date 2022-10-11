package com.microsoft.graph.models;

import com.microsoft.graph.models.ServiceHealthIssue;
import com.microsoft.graph.models.ServiceUpdateMessage;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class ServiceAnnouncementBase extends Entity implements Parsable {
    /** Additional details about service event. This property doesn't support filters. */
    private java.util.List<KeyValuePair> _details;
    /** The end time of the service event. */
    private OffsetDateTime _endDateTime;
    /** The last modified time of the service event. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The start time of the service event. */
    private OffsetDateTime _startDateTime;
    /** The title of the service event. */
    private String _title;
    /**
     * Instantiates a new serviceAnnouncementBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceAnnouncementBase() {
        super();
        this.setOdataType("#microsoft.graph.serviceAnnouncementBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serviceAnnouncementBase
     */
    @javax.annotation.Nonnull
    public static ServiceAnnouncementBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.serviceHealthIssue": return new ServiceHealthIssue();
                case "#microsoft.graph.serviceUpdateMessage": return new ServiceUpdateMessage();
            }
        }
        return new ServiceAnnouncementBase();
    }
    /**
     * Gets the details property value. Additional details about service event. This property doesn't support filters.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getDetails() {
        return this._details;
    }
    /**
     * Gets the endDateTime property value. The end time of the service event.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ServiceAnnouncementBase currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("details", (n) -> { currentObject.setDetails(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The last modified time of the service event.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the startDateTime property value. The start time of the service event.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the title property value. The title of the service event.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
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
        writer.writeCollectionOfObjectValues("details", this.getDetails());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the details property value. Additional details about service event. This property doesn't support filters.
     * @param value Value to set for the details property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetails(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._details = value;
    }
    /**
     * Sets the endDateTime property value. The end time of the service event.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The last modified time of the service event.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the startDateTime property value. The start time of the service event.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the title property value. The title of the service event.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}
