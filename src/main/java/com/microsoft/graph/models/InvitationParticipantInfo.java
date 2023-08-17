package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InvitationParticipantInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Optional. Whether to hide the participant from the roster.
     */
    private Boolean hidden;
    /**
     * The identity property
     */
    private IdentitySet identity;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Optional. The ID of the target participant.
     */
    private String participantId;
    /**
     * Optional. Whether to remove them from the main mixer.
     */
    private Boolean removeFromDefaultAudioRoutingGroup;
    /**
     * Optional. The call which the target identity is currently a part of. For peer-to-peer case, the call will be dropped once the participant is added successfully.
     */
    private String replacesCallId;
    /**
     * Instantiates a new invitationParticipantInfo and sets the default values.
     */
    public InvitationParticipantInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a invitationParticipantInfo
     */
    @jakarta.annotation.Nonnull
    public static InvitationParticipantInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvitationParticipantInfo();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("hidden", (n) -> { this.setHidden(n.getBooleanValue()); });
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("participantId", (n) -> { this.setParticipantId(n.getStringValue()); });
        deserializerMap.put("removeFromDefaultAudioRoutingGroup", (n) -> { this.setRemoveFromDefaultAudioRoutingGroup(n.getBooleanValue()); });
        deserializerMap.put("replacesCallId", (n) -> { this.setReplacesCallId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hidden property value. Optional. Whether to hide the participant from the roster.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHidden() {
        return this.hidden;
    }
    /**
     * Gets the identity property value. The identity property
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getIdentity() {
        return this.identity;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the participantId property value. Optional. The ID of the target participant.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getParticipantId() {
        return this.participantId;
    }
    /**
     * Gets the removeFromDefaultAudioRoutingGroup property value. Optional. Whether to remove them from the main mixer.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRemoveFromDefaultAudioRoutingGroup() {
        return this.removeFromDefaultAudioRoutingGroup;
    }
    /**
     * Gets the replacesCallId property value. Optional. The call which the target identity is currently a part of. For peer-to-peer case, the call will be dropped once the participant is added successfully.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReplacesCallId() {
        return this.replacesCallId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("hidden", this.getHidden());
        writer.writeObjectValue("identity", this.getIdentity());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("participantId", this.getParticipantId());
        writer.writeBooleanValue("removeFromDefaultAudioRoutingGroup", this.getRemoveFromDefaultAudioRoutingGroup());
        writer.writeStringValue("replacesCallId", this.getReplacesCallId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the hidden property value. Optional. Whether to hide the participant from the roster.
     * @param value Value to set for the hidden property.
     */
    public void setHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.hidden = value;
    }
    /**
     * Sets the identity property value. The identity property
     * @param value Value to set for the identity property.
     */
    public void setIdentity(@jakarta.annotation.Nullable final IdentitySet value) {
        this.identity = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the participantId property value. Optional. The ID of the target participant.
     * @param value Value to set for the participantId property.
     */
    public void setParticipantId(@jakarta.annotation.Nullable final String value) {
        this.participantId = value;
    }
    /**
     * Sets the removeFromDefaultAudioRoutingGroup property value. Optional. Whether to remove them from the main mixer.
     * @param value Value to set for the removeFromDefaultAudioRoutingGroup property.
     */
    public void setRemoveFromDefaultAudioRoutingGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.removeFromDefaultAudioRoutingGroup = value;
    }
    /**
     * Sets the replacesCallId property value. Optional. The call which the target identity is currently a part of. For peer-to-peer case, the call will be dropped once the participant is added successfully.
     * @param value Value to set for the replacesCallId property.
     */
    public void setReplacesCallId(@jakarta.annotation.Nullable final String value) {
        this.replacesCallId = value;
    }
}
