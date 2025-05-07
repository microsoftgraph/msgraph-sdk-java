package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OneDriveForBusinessRestoreSession extends RestoreSessionBase implements Parsable {
    /**
     * Instantiates a new {@link OneDriveForBusinessRestoreSession} and sets the default values.
     */
    public OneDriveForBusinessRestoreSession() {
        super();
        this.setOdataType("#microsoft.graph.oneDriveForBusinessRestoreSession");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OneDriveForBusinessRestoreSession}
     */
    @jakarta.annotation.Nonnull
    public static OneDriveForBusinessRestoreSession createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OneDriveForBusinessRestoreSession();
    }
    /**
     * Gets the driveRestoreArtifacts property value. A collection of restore points and destination details that can be used to restore a OneDrive for Business drive.
     * @return a {@link java.util.List<DriveRestoreArtifact>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveRestoreArtifact> getDriveRestoreArtifacts() {
        return this.backingStore.get("driveRestoreArtifacts");
    }
    /**
     * Gets the driveRestoreArtifactsBulkAdditionRequests property value. The driveRestoreArtifactsBulkAdditionRequests property
     * @return a {@link java.util.List<DriveRestoreArtifactsBulkAdditionRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveRestoreArtifactsBulkAdditionRequest> getDriveRestoreArtifactsBulkAdditionRequests() {
        return this.backingStore.get("driveRestoreArtifactsBulkAdditionRequests");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("driveRestoreArtifacts", (n) -> { this.setDriveRestoreArtifacts(n.getCollectionOfObjectValues(DriveRestoreArtifact::createFromDiscriminatorValue)); });
        deserializerMap.put("driveRestoreArtifactsBulkAdditionRequests", (n) -> { this.setDriveRestoreArtifactsBulkAdditionRequests(n.getCollectionOfObjectValues(DriveRestoreArtifactsBulkAdditionRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("driveRestoreArtifacts", this.getDriveRestoreArtifacts());
        writer.writeCollectionOfObjectValues("driveRestoreArtifactsBulkAdditionRequests", this.getDriveRestoreArtifactsBulkAdditionRequests());
    }
    /**
     * Sets the driveRestoreArtifacts property value. A collection of restore points and destination details that can be used to restore a OneDrive for Business drive.
     * @param value Value to set for the driveRestoreArtifacts property.
     */
    public void setDriveRestoreArtifacts(@jakarta.annotation.Nullable final java.util.List<DriveRestoreArtifact> value) {
        this.backingStore.set("driveRestoreArtifacts", value);
    }
    /**
     * Sets the driveRestoreArtifactsBulkAdditionRequests property value. The driveRestoreArtifactsBulkAdditionRequests property
     * @param value Value to set for the driveRestoreArtifactsBulkAdditionRequests property.
     */
    public void setDriveRestoreArtifactsBulkAdditionRequests(@jakarta.annotation.Nullable final java.util.List<DriveRestoreArtifactsBulkAdditionRequest> value) {
        this.backingStore.set("driveRestoreArtifactsBulkAdditionRequests", value);
    }
}
