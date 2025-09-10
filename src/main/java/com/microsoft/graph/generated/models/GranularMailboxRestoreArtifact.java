package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GranularMailboxRestoreArtifact extends MailboxRestoreArtifact implements Parsable {
    /**
     * Instantiates a new {@link GranularMailboxRestoreArtifact} and sets the default values.
     */
    public GranularMailboxRestoreArtifact() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GranularMailboxRestoreArtifact}
     */
    @jakarta.annotation.Nonnull
    public static GranularMailboxRestoreArtifact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GranularMailboxRestoreArtifact();
    }
    /**
     * Gets the artifactCount property value. This property will be deprecated soon. Don&apos;t use.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getArtifactCount() {
        return this.backingStore.get("artifactCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("artifactCount", (n) -> { this.setArtifactCount(n.getIntegerValue()); });
        deserializerMap.put("searchResponseId", (n) -> { this.setSearchResponseId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the searchResponseId property value. .
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSearchResponseId() {
        return this.backingStore.get("searchResponseId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("artifactCount", this.getArtifactCount());
        writer.writeStringValue("searchResponseId", this.getSearchResponseId());
    }
    /**
     * Sets the artifactCount property value. This property will be deprecated soon. Don&apos;t use.
     * @param value Value to set for the artifactCount property.
     */
    public void setArtifactCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("artifactCount", value);
    }
    /**
     * Sets the searchResponseId property value. .
     * @param value Value to set for the searchResponseId property.
     */
    public void setSearchResponseId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("searchResponseId", value);
    }
}
