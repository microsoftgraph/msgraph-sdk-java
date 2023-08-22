package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MediaPrompt extends Prompt implements Parsable {
    /**
     * The mediaInfo property
     */
    private MediaInfo mediaInfo;
    /**
     * Instantiates a new mediaPrompt and sets the default values.
     */
    public MediaPrompt() {
        super();
        this.setOdataType("#microsoft.graph.mediaPrompt");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mediaPrompt
     */
    @jakarta.annotation.Nonnull
    public static MediaPrompt createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaPrompt();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mediaInfo", (n) -> { this.setMediaInfo(n.getObjectValue(MediaInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mediaInfo property value. The mediaInfo property
     * @return a mediaInfo
     */
    @jakarta.annotation.Nullable
    public MediaInfo getMediaInfo() {
        return this.mediaInfo;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("mediaInfo", this.getMediaInfo());
    }
    /**
     * Sets the mediaInfo property value. The mediaInfo property
     * @param value Value to set for the mediaInfo property.
     */
    public void setMediaInfo(@jakarta.annotation.Nullable final MediaInfo value) {
        this.mediaInfo = value;
    }
}
