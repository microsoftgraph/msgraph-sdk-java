package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.callrecords.CallRecord;
/** Provides operations to manage the cloudCommunications singleton.  */
public class CloudCommunications extends Entity implements Parsable {
    /** The callRecords property  */
    private java.util.List<CallRecord> _callRecords;
    /** The calls property  */
    private java.util.List<Call> _calls;
    /** The onlineMeetings property  */
    private java.util.List<OnlineMeeting> _onlineMeetings;
    /** The presences property  */
    private java.util.List<Presence> _presences;
    /**
     * Instantiates a new cloudCommunications and sets the default values.
     * @return a void
     */
    public CloudCommunications() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudCommunications
     */
    @javax.annotation.Nonnull
    public static CloudCommunications createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudCommunications();
    }
    /**
     * Gets the callRecords property value. The callRecords property
     * @return a callRecord
     */
    @javax.annotation.Nullable
    public java.util.List<CallRecord> getCallRecords() {
        return this._callRecords;
    }
    /**
     * Gets the calls property value. The calls property
     * @return a call
     */
    @javax.annotation.Nullable
    public java.util.List<Call> getCalls() {
        return this._calls;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudCommunications currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("callRecords", (n) -> { currentObject.setCallRecords(n.getCollectionOfObjectValues(CallRecord::createFromDiscriminatorValue)); });
            this.put("calls", (n) -> { currentObject.setCalls(n.getCollectionOfObjectValues(Call::createFromDiscriminatorValue)); });
            this.put("onlineMeetings", (n) -> { currentObject.setOnlineMeetings(n.getCollectionOfObjectValues(OnlineMeeting::createFromDiscriminatorValue)); });
            this.put("presences", (n) -> { currentObject.setPresences(n.getCollectionOfObjectValues(Presence::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the onlineMeetings property value. The onlineMeetings property
     * @return a onlineMeeting
     */
    @javax.annotation.Nullable
    public java.util.List<OnlineMeeting> getOnlineMeetings() {
        return this._onlineMeetings;
    }
    /**
     * Gets the presences property value. The presences property
     * @return a presence
     */
    @javax.annotation.Nullable
    public java.util.List<Presence> getPresences() {
        return this._presences;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("callRecords", this.getCallRecords());
        writer.writeCollectionOfObjectValues("calls", this.getCalls());
        writer.writeCollectionOfObjectValues("onlineMeetings", this.getOnlineMeetings());
        writer.writeCollectionOfObjectValues("presences", this.getPresences());
    }
    /**
     * Sets the callRecords property value. The callRecords property
     * @param value Value to set for the callRecords property.
     * @return a void
     */
    public void setCallRecords(@javax.annotation.Nullable final java.util.List<CallRecord> value) {
        this._callRecords = value;
    }
    /**
     * Sets the calls property value. The calls property
     * @param value Value to set for the calls property.
     * @return a void
     */
    public void setCalls(@javax.annotation.Nullable final java.util.List<Call> value) {
        this._calls = value;
    }
    /**
     * Sets the onlineMeetings property value. The onlineMeetings property
     * @param value Value to set for the onlineMeetings property.
     * @return a void
     */
    public void setOnlineMeetings(@javax.annotation.Nullable final java.util.List<OnlineMeeting> value) {
        this._onlineMeetings = value;
    }
    /**
     * Sets the presences property value. The presences property
     * @param value Value to set for the presences property.
     * @return a void
     */
    public void setPresences(@javax.annotation.Nullable final java.util.List<Presence> value) {
        this._presences = value;
    }
}
