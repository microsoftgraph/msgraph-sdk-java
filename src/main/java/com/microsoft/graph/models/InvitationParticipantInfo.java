package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InvitationParticipantInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The hidden property */
    private Boolean _hidden;
    /** The identity property */
    private IdentitySet _identity;
    /** Optional. The ID of the target participant. */
    private String _participantId;
    /** The removeFromDefaultAudioRoutingGroup property */
    private Boolean _removeFromDefaultAudioRoutingGroup;
    /** Optional. The call which the target identity is currently a part of. For peer-to-peer case, the call will be dropped once the participant is added successfully. */
    private String _replacesCallId;
    /**
     * Instantiates a new invitationParticipantInfo and sets the default values.
     * @return a void
     */
    public InvitationParticipantInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a invitationParticipantInfo
     */
    @javax.annotation.Nonnull
    public static InvitationParticipantInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvitationParticipantInfo();
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
        final InvitationParticipantInfo currentObject = this;
        return new HashMap<>(5) {{
            this.put("hidden", (n) -> { currentObject.setHidden(n.getBooleanValue()); });
            this.put("identity", (n) -> { currentObject.setIdentity(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("participantId", (n) -> { currentObject.setParticipantId(n.getStringValue()); });
            this.put("removeFromDefaultAudioRoutingGroup", (n) -> { currentObject.setRemoveFromDefaultAudioRoutingGroup(n.getBooleanValue()); });
            this.put("replacesCallId", (n) -> { currentObject.setReplacesCallId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the hidden property value. The hidden property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHidden() {
        return this._hidden;
    }
    /**
     * Gets the identity property value. The identity property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getIdentity() {
        return this._identity;
    }
    /**
     * Gets the participantId property value. Optional. The ID of the target participant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParticipantId() {
        return this._participantId;
    }
    /**
     * Gets the removeFromDefaultAudioRoutingGroup property value. The removeFromDefaultAudioRoutingGroup property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRemoveFromDefaultAudioRoutingGroup() {
        return this._removeFromDefaultAudioRoutingGroup;
    }
    /**
     * Gets the replacesCallId property value. Optional. The call which the target identity is currently a part of. For peer-to-peer case, the call will be dropped once the participant is added successfully.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReplacesCallId() {
        return this._replacesCallId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("hidden", this.getHidden());
        writer.writeObjectValue("identity", this.getIdentity());
        writer.writeStringValue("participantId", this.getParticipantId());
        writer.writeBooleanValue("removeFromDefaultAudioRoutingGroup", this.getRemoveFromDefaultAudioRoutingGroup());
        writer.writeStringValue("replacesCallId", this.getReplacesCallId());
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
     * Sets the hidden property value. The hidden property
     * @param value Value to set for the hidden property.
     * @return a void
     */
    public void setHidden(@javax.annotation.Nullable final Boolean value) {
        this._hidden = value;
    }
    /**
     * Sets the identity property value. The identity property
     * @param value Value to set for the identity property.
     * @return a void
     */
    public void setIdentity(@javax.annotation.Nullable final IdentitySet value) {
        this._identity = value;
    }
    /**
     * Sets the participantId property value. Optional. The ID of the target participant.
     * @param value Value to set for the participantId property.
     * @return a void
     */
    public void setParticipantId(@javax.annotation.Nullable final String value) {
        this._participantId = value;
    }
    /**
     * Sets the removeFromDefaultAudioRoutingGroup property value. The removeFromDefaultAudioRoutingGroup property
     * @param value Value to set for the removeFromDefaultAudioRoutingGroup property.
     * @return a void
     */
    public void setRemoveFromDefaultAudioRoutingGroup(@javax.annotation.Nullable final Boolean value) {
        this._removeFromDefaultAudioRoutingGroup = value;
    }
    /**
     * Sets the replacesCallId property value. Optional. The call which the target identity is currently a part of. For peer-to-peer case, the call will be dropped once the participant is added successfully.
     * @param value Value to set for the replacesCallId property.
     * @return a void
     */
    public void setReplacesCallId(@javax.annotation.Nullable final String value) {
        this._replacesCallId = value;
    }
}
