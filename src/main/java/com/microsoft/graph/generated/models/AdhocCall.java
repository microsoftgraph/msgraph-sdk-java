package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdhocCall extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AdhocCall} and sets the default values.
     */
    public AdhocCall() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdhocCall}
     */
    @jakarta.annotation.Nonnull
    public static AdhocCall createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdhocCall();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("recordings", (n) -> { this.setRecordings(n.getCollectionOfObjectValues(CallRecording::createFromDiscriminatorValue)); });
        deserializerMap.put("transcripts", (n) -> { this.setTranscripts(n.getCollectionOfObjectValues(CallTranscript::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the recordings property value. The recordings of a call. Read-only.
     * @return a {@link java.util.List<CallRecording>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CallRecording> getRecordings() {
        return this.backingStore.get("recordings");
    }
    /**
     * Gets the transcripts property value. The transcripts of a call. Read-only.
     * @return a {@link java.util.List<CallTranscript>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CallTranscript> getTranscripts() {
        return this.backingStore.get("transcripts");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("recordings", this.getRecordings());
        writer.writeCollectionOfObjectValues("transcripts", this.getTranscripts());
    }
    /**
     * Sets the recordings property value. The recordings of a call. Read-only.
     * @param value Value to set for the recordings property.
     */
    public void setRecordings(@jakarta.annotation.Nullable final java.util.List<CallRecording> value) {
        this.backingStore.set("recordings", value);
    }
    /**
     * Sets the transcripts property value. The transcripts of a call. Read-only.
     * @param value Value to set for the transcripts property.
     */
    public void setTranscripts(@jakarta.annotation.Nullable final java.util.List<CallTranscript> value) {
        this.backingStore.set("transcripts", value);
    }
}
