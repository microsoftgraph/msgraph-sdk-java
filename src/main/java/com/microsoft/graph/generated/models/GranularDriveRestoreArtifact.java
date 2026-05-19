package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GranularDriveRestoreArtifact extends GranularRestoreArtifactBase implements Parsable {
    /**
     * Instantiates a new {@link GranularDriveRestoreArtifact} and sets the default values.
     */
    public GranularDriveRestoreArtifact() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GranularDriveRestoreArtifact}
     */
    @jakarta.annotation.Nonnull
    public static GranularDriveRestoreArtifact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GranularDriveRestoreArtifact();
    }
    /**
     * Gets the directoryObjectId property value. Id of the drive in which artifact is present.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirectoryObjectId() {
        return this.backingStore.get("directoryObjectId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("directoryObjectId", (n) -> { this.setDirectoryObjectId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("directoryObjectId", this.getDirectoryObjectId());
    }
    /**
     * Sets the directoryObjectId property value. Id of the drive in which artifact is present.
     * @param value Value to set for the directoryObjectId property.
     */
    public void setDirectoryObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("directoryObjectId", value);
    }
}
