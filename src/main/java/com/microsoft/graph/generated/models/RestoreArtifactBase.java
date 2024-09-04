package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RestoreArtifactBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RestoreArtifactBase} and sets the default values.
     */
    public RestoreArtifactBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RestoreArtifactBase}
     */
    @jakarta.annotation.Nonnull
    public static RestoreArtifactBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.driveRestoreArtifact": return new DriveRestoreArtifact();
                case "#microsoft.graph.granularMailboxRestoreArtifact": return new GranularMailboxRestoreArtifact();
                case "#microsoft.graph.mailboxRestoreArtifact": return new MailboxRestoreArtifact();
                case "#microsoft.graph.siteRestoreArtifact": return new SiteRestoreArtifact();
            }
        }
        return new RestoreArtifactBase();
    }
    /**
     * Gets the completionDateTime property value. The time when restoration of restore artifact is completed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this.backingStore.get("completionDateTime");
    }
    /**
     * Gets the destinationType property value. Indicates the restoration destination. The possible values are: new, inPlace, unknownFutureValue.
     * @return a {@link DestinationType}
     */
    @jakarta.annotation.Nullable
    public DestinationType getDestinationType() {
        return this.backingStore.get("destinationType");
    }
    /**
     * Gets the error property value. Contains error details if the restore session fails or completes with an error.
     * @return a {@link PublicError}
     */
    @jakarta.annotation.Nullable
    public PublicError getError() {
        return this.backingStore.get("error");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completionDateTime", (n) -> { this.setCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("destinationType", (n) -> { this.setDestinationType(n.getEnumValue(DestinationType::forValue)); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("restorePoint", (n) -> { this.setRestorePoint(n.getObjectValue(RestorePoint::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ArtifactRestoreStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the restorePoint property value. Represents the date and time when an artifact is protected by a protectionPolicy and can be restored.
     * @return a {@link RestorePoint}
     */
    @jakarta.annotation.Nullable
    public RestorePoint getRestorePoint() {
        return this.backingStore.get("restorePoint");
    }
    /**
     * Gets the startDateTime property value. The time when restoration of restore artifact is started.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the status property value. The individual restoration status of the restore artifact. The possible values are: added, scheduling, scheduled, inProgress, succeeded, failed, unknownFutureValue.
     * @return a {@link ArtifactRestoreStatus}
     */
    @jakarta.annotation.Nullable
    public ArtifactRestoreStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completionDateTime", this.getCompletionDateTime());
        writer.writeEnumValue("destinationType", this.getDestinationType());
        writer.writeObjectValue("error", this.getError());
        writer.writeObjectValue("restorePoint", this.getRestorePoint());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the completionDateTime property value. The time when restoration of restore artifact is completed.
     * @param value Value to set for the completionDateTime property.
     */
    public void setCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completionDateTime", value);
    }
    /**
     * Sets the destinationType property value. Indicates the restoration destination. The possible values are: new, inPlace, unknownFutureValue.
     * @param value Value to set for the destinationType property.
     */
    public void setDestinationType(@jakarta.annotation.Nullable final DestinationType value) {
        this.backingStore.set("destinationType", value);
    }
    /**
     * Sets the error property value. Contains error details if the restore session fails or completes with an error.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the restorePoint property value. Represents the date and time when an artifact is protected by a protectionPolicy and can be restored.
     * @param value Value to set for the restorePoint property.
     */
    public void setRestorePoint(@jakarta.annotation.Nullable final RestorePoint value) {
        this.backingStore.set("restorePoint", value);
    }
    /**
     * Sets the startDateTime property value. The time when restoration of restore artifact is started.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the status property value. The individual restoration status of the restore artifact. The possible values are: added, scheduling, scheduled, inProgress, succeeded, failed, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ArtifactRestoreStatus value) {
        this.backingStore.set("status", value);
    }
}
