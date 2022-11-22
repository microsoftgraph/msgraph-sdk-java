package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RecordOperation extends CommsOperation implements Parsable {
    /** The access token required to retrieve the recording. */
    private String _recordingAccessToken;
    /** The location where the recording is located. */
    private String _recordingLocation;
    /**
     * Instantiates a new RecordOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RecordOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RecordOperation
     */
    @javax.annotation.Nonnull
    public static RecordOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecordOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("recordingAccessToken", (n) -> { this.setRecordingAccessToken(n.getStringValue()); });
        deserializerMap.put("recordingLocation", (n) -> { this.setRecordingLocation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recordingAccessToken property value. The access token required to retrieve the recording.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecordingAccessToken() {
        return this._recordingAccessToken;
    }
    /**
     * Gets the recordingLocation property value. The location where the recording is located.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecordingLocation() {
        return this._recordingLocation;
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
        writer.writeStringValue("recordingAccessToken", this.getRecordingAccessToken());
        writer.writeStringValue("recordingLocation", this.getRecordingLocation());
    }
    /**
     * Sets the recordingAccessToken property value. The access token required to retrieve the recording.
     * @param value Value to set for the recordingAccessToken property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecordingAccessToken(@javax.annotation.Nullable final String value) {
        this._recordingAccessToken = value;
    }
    /**
     * Sets the recordingLocation property value. The location where the recording is located.
     * @param value Value to set for the recordingLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecordingLocation(@javax.annotation.Nullable final String value) {
        this._recordingLocation = value;
    }
}
