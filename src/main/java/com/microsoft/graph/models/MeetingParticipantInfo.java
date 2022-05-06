package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingParticipantInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Identity information of the participant.  */
    private IdentitySet _identity;
    /** Specifies the participant's role in the meeting.  */
    private OnlineMeetingRole _role;
    /** User principal name of the participant.  */
    private String _upn;
    /**
     * Instantiates a new meetingParticipantInfo and sets the default values.
     * @return a void
     */
    public MeetingParticipantInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingParticipantInfo
     */
    @javax.annotation.Nonnull
    public static MeetingParticipantInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingParticipantInfo();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MeetingParticipantInfo currentObject = this;
        return new HashMap<>(3) {{
            this.put("identity", (n) -> { currentObject.setIdentity(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("role", (n) -> { currentObject.setRole(n.getEnumValue(OnlineMeetingRole.class)); });
            this.put("upn", (n) -> { currentObject.setUpn(n.getStringValue()); });
        }};
    }
    /**
     * Gets the identity property value. Identity information of the participant.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getIdentity() {
        return this._identity;
    }
    /**
     * Gets the role property value. Specifies the participant's role in the meeting.
     * @return a onlineMeetingRole
     */
    @javax.annotation.Nullable
    public OnlineMeetingRole getRole() {
        return this._role;
    }
    /**
     * Gets the upn property value. User principal name of the participant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpn() {
        return this._upn;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("identity", this.getIdentity());
        writer.writeEnumValue("role", this.getRole());
        writer.writeStringValue("upn", this.getUpn());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the identity property value. Identity information of the participant.
     * @param value Value to set for the identity property.
     * @return a void
     */
    public void setIdentity(@javax.annotation.Nullable final IdentitySet value) {
        this._identity = value;
    }
    /**
     * Sets the role property value. Specifies the participant's role in the meeting.
     * @param value Value to set for the role property.
     * @return a void
     */
    public void setRole(@javax.annotation.Nullable final OnlineMeetingRole value) {
        this._role = value;
    }
    /**
     * Sets the upn property value. User principal name of the participant.
     * @param value Value to set for the upn property.
     * @return a void
     */
    public void setUpn(@javax.annotation.Nullable final String value) {
        this._upn = value;
    }
}
