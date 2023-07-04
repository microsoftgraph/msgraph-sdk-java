package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CommsOperation extends Entity implements Parsable {
    /**
     * Unique Client Context string. Max limit is 256 chars.
     */
    private String clientContext;
    /**
     * The result information. Read-only.
     */
    private ResultInfo resultInfo;
    /**
     * The status property
     */
    private OperationStatus status;
    /**
     * Instantiates a new commsOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CommsOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a commsOperation
     */
    @javax.annotation.Nonnull
    public static CommsOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientContext() {
        return this.clientContext;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clientContext", (n) -> { this.setClientContext(n.getStringValue()); });
        deserializerMap.put("resultInfo", (n) -> { this.setResultInfo(n.getObjectValue(ResultInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(OperationStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the resultInfo property value. The result information. Read-only.
     * @return a resultInfo
     */
    @javax.annotation.Nullable
    public ResultInfo getResultInfo() {
        return this.resultInfo;
    }
    /**
     * Gets the status property value. The status property
     * @return a OperationStatus
     */
    @javax.annotation.Nullable
    public OperationStatus getStatus() {
        return this.status;
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
        writer.writeStringValue("clientContext", this.getClientContext());
        writer.writeObjectValue("resultInfo", this.getResultInfo());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the clientContext property value. Unique Client Context string. Max limit is 256 chars.
     * @param value Value to set for the clientContext property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientContext(@javax.annotation.Nullable final String value) {
        this.clientContext = value;
    }
    /**
     * Sets the resultInfo property value. The result information. Read-only.
     * @param value Value to set for the resultInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResultInfo(@javax.annotation.Nullable final ResultInfo value) {
        this.resultInfo = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final OperationStatus value) {
        this.status = value;
    }
}
