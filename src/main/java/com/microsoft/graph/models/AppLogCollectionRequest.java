package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity for AppLogCollectionRequest contains all logs values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppLogCollectionRequest extends Entity implements Parsable {
    /**
     * Instantiates a new AppLogCollectionRequest and sets the default values.
     */
    public AppLogCollectionRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppLogCollectionRequest
     */
    @jakarta.annotation.Nonnull
    public static AppLogCollectionRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppLogCollectionRequest();
    }
    /**
     * Gets the completedDateTime property value. Time at which the upload log request reached a completed state if not completed yet NULL will be returned.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.BackingStore.get("completedDateTime");
    }
    /**
     * Gets the customLogFolders property value. List of log folders.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCustomLogFolders() {
        return this.BackingStore.get("customLogFolders");
    }
    /**
     * Gets the errorMessage property value. Indicates error message if any during the upload process.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getErrorMessage() {
        return this.BackingStore.get("errorMessage");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customLogFolders", (n) -> { this.setCustomLogFolders(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("errorMessage", (n) -> { this.setErrorMessage(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AppLogUploadState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the status property value. AppLogUploadStatus
     * @return a AppLogUploadState
     */
    @jakarta.annotation.Nullable
    public AppLogUploadState getStatus() {
        return this.BackingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeCollectionOfPrimitiveValues("customLogFolders", this.getCustomLogFolders());
        writer.writeStringValue("errorMessage", this.getErrorMessage());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the completedDateTime property value. Time at which the upload log request reached a completed state if not completed yet NULL will be returned.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("completedDateTime", value);
    }
    /**
     * Sets the customLogFolders property value. List of log folders.
     * @param value Value to set for the customLogFolders property.
     */
    public void setCustomLogFolders(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("customLogFolders", value);
    }
    /**
     * Sets the errorMessage property value. Indicates error message if any during the upload process.
     * @param value Value to set for the errorMessage property.
     */
    public void setErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("errorMessage", value);
    }
    /**
     * Sets the status property value. AppLogUploadStatus
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AppLogUploadState value) {
        this.BackingStore.set("status", value);
    }
}
