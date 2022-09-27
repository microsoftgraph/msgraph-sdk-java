package com.microsoft.graph.models;

import com.microsoft.graph.models.AddLargeGalleryViewOperation;
import com.microsoft.graph.models.CancelMediaProcessingOperation;
import com.microsoft.graph.models.InviteParticipantsOperation;
import com.microsoft.graph.models.MuteParticipantOperation;
import com.microsoft.graph.models.PlayPromptOperation;
import com.microsoft.graph.models.RecordOperation;
import com.microsoft.graph.models.StartHoldMusicOperation;
import com.microsoft.graph.models.StopHoldMusicOperation;
import com.microsoft.graph.models.SubscribeToToneOperation;
import com.microsoft.graph.models.UnmuteParticipantOperation;
import com.microsoft.graph.models.UpdateRecordingStatusOperation;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the cloudCommunications singleton. */
public class CommsOperation extends Entity implements Parsable {
    /** Unique Client Context string. Max limit is 256 chars. */
    private String _clientContext;
    /** The result information. Read-only. */
    private ResultInfo _resultInfo;
    /** The status property */
    private OperationStatus _status;
    /**
     * Instantiates a new commsOperation and sets the default values.
     * @return a void
     */
    public CommsOperation() {
        super();
        this.setOdataType("#microsoft.graph.commsOperation");
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
        return this._clientContext;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CommsOperation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("clientContext", (n) -> { currentObject.setClientContext(n.getStringValue()); });
            this.put("resultInfo", (n) -> { currentObject.setResultInfo(n.getObjectValue(ResultInfo::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(OperationStatus.class)); });
        }};
    }
    /**
     * Gets the resultInfo property value. The result information. Read-only.
     * @return a resultInfo
     */
    @javax.annotation.Nullable
    public ResultInfo getResultInfo() {
        return this._resultInfo;
    }
    /**
     * Gets the status property value. The status property
     * @return a operationStatus
     */
    @javax.annotation.Nullable
    public OperationStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setClientContext(@javax.annotation.Nullable final String value) {
        this._clientContext = value;
    }
    /**
     * Sets the resultInfo property value. The result information. Read-only.
     * @param value Value to set for the resultInfo property.
     * @return a void
     */
    public void setResultInfo(@javax.annotation.Nullable final ResultInfo value) {
        this._resultInfo = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final OperationStatus value) {
        this._status = value;
    }
}
