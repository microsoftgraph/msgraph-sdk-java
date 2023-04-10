package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ParticipantJoiningNotification extends Entity implements Parsable {
    /** The call property */
    private Call call;
    /**
     * Instantiates a new ParticipantJoiningNotification and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ParticipantJoiningNotification() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ParticipantJoiningNotification
     */
    @javax.annotation.Nonnull
    public static ParticipantJoiningNotification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParticipantJoiningNotification();
    }
    /**
     * Gets the call property value. The call property
     * @return a call
     */
    @javax.annotation.Nullable
    public Call getCall() {
        return this.call;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("call", (n) -> { this.setCall(n.getObjectValue(Call::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeObjectValue("call", this.getCall());
    }
    /**
     * Sets the call property value. The call property
     * @param value Value to set for the call property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCall(@javax.annotation.Nullable final Call value) {
        this.call = value;
    }
}
