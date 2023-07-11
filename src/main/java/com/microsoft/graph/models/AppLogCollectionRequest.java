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
public class AppLogCollectionRequest extends Entity implements Parsable {
    /**
     * Time at which the upload log request reached a completed state if not completed yet NULL will be returned.
     */
    private OffsetDateTime completedDateTime;
    /**
     * List of log folders.
     */
    private java.util.List<String> customLogFolders;
    /**
     * Indicates error message if any during the upload process.
     */
    private String errorMessage;
    /**
     * AppLogUploadStatus
     */
    private AppLogUploadState status;
    /**
     * Instantiates a new appLogCollectionRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppLogCollectionRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appLogCollectionRequest
     */
    @javax.annotation.Nonnull
    public static AppLogCollectionRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppLogCollectionRequest();
    }
    /**
     * Gets the completedDateTime property value. Time at which the upload log request reached a completed state if not completed yet NULL will be returned.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.completedDateTime;
    }
    /**
     * Gets the customLogFolders property value. List of log folders.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCustomLogFolders() {
        return this.customLogFolders;
    }
    /**
     * Gets the errorMessage property value. Indicates error message if any during the upload process.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a appLogUploadState
     */
    @javax.annotation.Nullable
    public AppLogUploadState getStatus() {
        return this.status;
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
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeCollectionOfPrimitiveValues("customLogFolders", this.getCustomLogFolders());
        writer.writeStringValue("errorMessage", this.getErrorMessage());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the completedDateTime property value. Time at which the upload log request reached a completed state if not completed yet NULL will be returned.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.completedDateTime = value;
    }
    /**
     * Sets the customLogFolders property value. List of log folders.
     * @param value Value to set for the customLogFolders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomLogFolders(@javax.annotation.Nullable final java.util.List<String> value) {
        this.customLogFolders = value;
    }
    /**
     * Sets the errorMessage property value. Indicates error message if any during the upload process.
     * @param value Value to set for the errorMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorMessage(@javax.annotation.Nullable final String value) {
        this.errorMessage = value;
    }
    /**
     * Sets the status property value. AppLogUploadStatus
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final AppLogUploadState value) {
        this.status = value;
    }
}
