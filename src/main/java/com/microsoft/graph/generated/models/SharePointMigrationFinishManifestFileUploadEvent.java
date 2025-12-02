package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointMigrationFinishManifestFileUploadEvent extends SharePointMigrationEvent implements Parsable {
    /**
     * Instantiates a new {@link SharePointMigrationFinishManifestFileUploadEvent} and sets the default values.
     */
    public SharePointMigrationFinishManifestFileUploadEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMigrationFinishManifestFileUploadEvent}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMigrationFinishManifestFileUploadEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointMigrationFinishManifestFileUploadEvent();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("manifestFileName", (n) -> { this.setManifestFileName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the manifestFileName property value. The exported manifest file name. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManifestFileName() {
        return this.backingStore.get("manifestFileName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("manifestFileName", this.getManifestFileName());
    }
    /**
     * Sets the manifestFileName property value. The exported manifest file name. Read-only.
     * @param value Value to set for the manifestFileName property.
     */
    public void setManifestFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manifestFileName", value);
    }
}
