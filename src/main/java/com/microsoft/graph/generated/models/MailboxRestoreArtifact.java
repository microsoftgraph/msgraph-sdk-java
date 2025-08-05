package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailboxRestoreArtifact extends RestoreArtifactBase implements Parsable {
    /**
     * Instantiates a new {@link MailboxRestoreArtifact} and sets the default values.
     */
    public MailboxRestoreArtifact() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MailboxRestoreArtifact}
     */
    @jakarta.annotation.Nonnull
    public static MailboxRestoreArtifact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.granularMailboxRestoreArtifact": return new GranularMailboxRestoreArtifact();
            }
        }
        return new MailboxRestoreArtifact();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("restoredFolderId", (n) -> { this.setRestoredFolderId(n.getStringValue()); });
        deserializerMap.put("restoredFolderName", (n) -> { this.setRestoredFolderName(n.getStringValue()); });
        deserializerMap.put("restoredItemCount", (n) -> { this.setRestoredItemCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the restoredFolderId property value. The new restored folder identifier for the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestoredFolderId() {
        return this.backingStore.get("restoredFolderId");
    }
    /**
     * Gets the restoredFolderName property value. The new restored folder name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestoredFolderName() {
        return this.backingStore.get("restoredFolderName");
    }
    /**
     * Gets the restoredItemCount property value. The number of items that are being restored in the folder.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRestoredItemCount() {
        return this.backingStore.get("restoredItemCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("restoredFolderId", this.getRestoredFolderId());
        writer.writeIntegerValue("restoredItemCount", this.getRestoredItemCount());
    }
    /**
     * Sets the restoredFolderId property value. The new restored folder identifier for the user.
     * @param value Value to set for the restoredFolderId property.
     */
    public void setRestoredFolderId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("restoredFolderId", value);
    }
    /**
     * Sets the restoredFolderName property value. The new restored folder name.
     * @param value Value to set for the restoredFolderName property.
     */
    public void setRestoredFolderName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("restoredFolderName", value);
    }
    /**
     * Sets the restoredItemCount property value. The number of items that are being restored in the folder.
     * @param value Value to set for the restoredItemCount property.
     */
    public void setRestoredItemCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("restoredItemCount", value);
    }
}
