package com.microsoft.graph.groups.item.calendar.events.item.instances.item.tentativelyaccept;

import com.microsoft.graph.models.TimeSlot;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the tentativelyAccept method. */
public class TentativelyAcceptPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The Comment property */
    private String _comment;
    /** The ProposedNewTime property */
    private TimeSlot _proposedNewTime;
    /** The SendResponse property */
    private Boolean _sendResponse;
    /**
     * Instantiates a new tentativelyAcceptPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TentativelyAcceptPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tentativelyAcceptPostRequestBody
     */
    @javax.annotation.Nonnull
    public static TentativelyAcceptPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TentativelyAcceptPostRequestBody();
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
     * Gets the comment property value. The Comment property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this._comment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("proposedNewTime", (n) -> { this.setProposedNewTime(n.getObjectValue(TimeSlot::createFromDiscriminatorValue)); });
        deserializerMap.put("sendResponse", (n) -> { this.setSendResponse(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the proposedNewTime property value. The ProposedNewTime property
     * @return a timeSlot
     */
    @javax.annotation.Nullable
    public TimeSlot getProposedNewTime() {
        return this._proposedNewTime;
    }
    /**
     * Gets the sendResponse property value. The SendResponse property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSendResponse() {
        return this._sendResponse;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("comment", this.getComment());
        writer.writeObjectValue("proposedNewTime", this.getProposedNewTime());
        writer.writeBooleanValue("sendResponse", this.getSendResponse());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the comment property value. The Comment property
     * @param value Value to set for the Comment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComment(@javax.annotation.Nullable final String value) {
        this._comment = value;
    }
    /**
     * Sets the proposedNewTime property value. The ProposedNewTime property
     * @param value Value to set for the ProposedNewTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProposedNewTime(@javax.annotation.Nullable final TimeSlot value) {
        this._proposedNewTime = value;
    }
    /**
     * Sets the sendResponse property value. The SendResponse property
     * @param value Value to set for the SendResponse property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSendResponse(@javax.annotation.Nullable final Boolean value) {
        this._sendResponse = value;
    }
}
