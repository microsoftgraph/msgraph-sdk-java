package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GranularRestoreArtifactBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GranularRestoreArtifactBase} and sets the default values.
     */
    public GranularRestoreArtifactBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GranularRestoreArtifactBase}
     */
    @jakarta.annotation.Nonnull
    public static GranularRestoreArtifactBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.granularDriveRestoreArtifact": return new GranularDriveRestoreArtifact();
                case "#microsoft.graph.granularSiteRestoreArtifact": return new GranularSiteRestoreArtifact();
            }
        }
        return new GranularRestoreArtifactBase();
    }
    /**
     * Gets the browseSessionId property value. The unique identifier of the browseSession
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrowseSessionId() {
        return this.backingStore.get("browseSessionId");
    }
    /**
     * Gets the completionDateTime property value. Date time when the artifact&apos;s restoration completes.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this.backingStore.get("completionDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("browseSessionId", (n) -> { this.setBrowseSessionId(n.getStringValue()); });
        deserializerMap.put("completionDateTime", (n) -> { this.setCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("restoredItemKey", (n) -> { this.setRestoredItemKey(n.getStringValue()); });
        deserializerMap.put("restoredItemPath", (n) -> { this.setRestoredItemPath(n.getStringValue()); });
        deserializerMap.put("restoredItemWebUrl", (n) -> { this.setRestoredItemWebUrl(n.getStringValue()); });
        deserializerMap.put("restorePointDateTime", (n) -> { this.setRestorePointDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ArtifactRestoreStatus::forValue)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the restoredItemKey property value. The unique identifier for the restored artifact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestoredItemKey() {
        return this.backingStore.get("restoredItemKey");
    }
    /**
     * Gets the restoredItemPath property value. The path of the restored artifact. It&apos;s the path of the folder where all the artifacts are restored within a granular restore session.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestoredItemPath() {
        return this.backingStore.get("restoredItemPath");
    }
    /**
     * Gets the restoredItemWebUrl property value. The web url of the restored artifact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestoredItemWebUrl() {
        return this.backingStore.get("restoredItemWebUrl");
    }
    /**
     * Gets the restorePointDateTime property value. The restore point date time to which the artifact is restored.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRestorePointDateTime() {
        return this.backingStore.get("restorePointDateTime");
    }
    /**
     * Gets the startDateTime property value. The start time of the restoration.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link ArtifactRestoreStatus}
     */
    @jakarta.annotation.Nullable
    public ArtifactRestoreStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the webUrl property value. The original web url of the artifact being restored.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("browseSessionId", this.getBrowseSessionId());
        writer.writeOffsetDateTimeValue("completionDateTime", this.getCompletionDateTime());
        writer.writeStringValue("restoredItemKey", this.getRestoredItemKey());
        writer.writeStringValue("restoredItemPath", this.getRestoredItemPath());
        writer.writeStringValue("restoredItemWebUrl", this.getRestoredItemWebUrl());
        writer.writeOffsetDateTimeValue("restorePointDateTime", this.getRestorePointDateTime());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the browseSessionId property value. The unique identifier of the browseSession
     * @param value Value to set for the browseSessionId property.
     */
    public void setBrowseSessionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("browseSessionId", value);
    }
    /**
     * Sets the completionDateTime property value. Date time when the artifact&apos;s restoration completes.
     * @param value Value to set for the completionDateTime property.
     */
    public void setCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completionDateTime", value);
    }
    /**
     * Sets the restoredItemKey property value. The unique identifier for the restored artifact.
     * @param value Value to set for the restoredItemKey property.
     */
    public void setRestoredItemKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("restoredItemKey", value);
    }
    /**
     * Sets the restoredItemPath property value. The path of the restored artifact. It&apos;s the path of the folder where all the artifacts are restored within a granular restore session.
     * @param value Value to set for the restoredItemPath property.
     */
    public void setRestoredItemPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("restoredItemPath", value);
    }
    /**
     * Sets the restoredItemWebUrl property value. The web url of the restored artifact.
     * @param value Value to set for the restoredItemWebUrl property.
     */
    public void setRestoredItemWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("restoredItemWebUrl", value);
    }
    /**
     * Sets the restorePointDateTime property value. The restore point date time to which the artifact is restored.
     * @param value Value to set for the restorePointDateTime property.
     */
    public void setRestorePointDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("restorePointDateTime", value);
    }
    /**
     * Sets the startDateTime property value. The start time of the restoration.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ArtifactRestoreStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the webUrl property value. The original web url of the artifact being restored.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
