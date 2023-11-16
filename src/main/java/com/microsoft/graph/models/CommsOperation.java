package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CommsOperation extends Entity implements Parsable {
    /**
     * Instantiates a new CommsOperation and sets the default values.
     */
    public CommsOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CommsOperation
     */
    @jakarta.annotation.Nonnull
    public static CommsOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.addLargeGalleryViewOperation": return new AddLargeGalleryViewOperation();
                case "#microsoft.graph.cancelMediaProcessingOperation": return new CancelMediaProcessingOperation();
                case "#microsoft.graph.inviteParticipantsOperation": return new InviteParticipantsOperation();
                case "#microsoft.graph.muteParticipantOperation": return new MuteParticipantOperation();
                case "#microsoft.graph.playPromptOperation": return new PlayPromptOperation();
                case "#microsoft.graph.recordOperation": return new RecordOperation();
                case "#microsoft.graph.startHoldMusicOperation": return new StartHoldMusicOperation();
                case "#microsoft.graph.stopHoldMusicOperation": return new StopHoldMusicOperation();
                case "#microsoft.graph.subscribeToToneOperation": return new SubscribeToToneOperation();
                case "#microsoft.graph.unmuteParticipantOperation": return new UnmuteParticipantOperation();
                case "#microsoft.graph.updateRecordingStatusOperation": return new UpdateRecordingStatusOperation();
            }
        }
        return new CommsOperation();
    }
    /**
     * Gets the clientContext property value. Unique Client Context string. Max limit is 256 chars.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientContext() {
        return this.backingStore.get("clientContext");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clientContext", (n) -> { this.setClientContext(n.getStringValue()); });
        deserializerMap.put("resultInfo", (n) -> { this.setResultInfo(n.getObjectValue(ResultInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(OperationStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the resultInfo property value. The result information. Read-only.
     * @return a ResultInfo
     */
    @jakarta.annotation.Nullable
    public ResultInfo getResultInfo() {
        return this.backingStore.get("resultInfo");
    }
    /**
     * Gets the status property value. The status property
     * @return a OperationStatus
     */
    @jakarta.annotation.Nullable
    public OperationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("clientContext", this.getClientContext());
        writer.writeObjectValue("resultInfo", this.getResultInfo());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the clientContext property value. Unique Client Context string. Max limit is 256 chars.
     * @param value Value to set for the clientContext property.
     */
    public void setClientContext(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientContext", value);
    }
    /**
     * Sets the resultInfo property value. The result information. Read-only.
     * @param value Value to set for the resultInfo property.
     */
    public void setResultInfo(@jakarta.annotation.Nullable final ResultInfo value) {
        this.backingStore.set("resultInfo", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final OperationStatus value) {
        this.backingStore.set("status", value);
    }
}
