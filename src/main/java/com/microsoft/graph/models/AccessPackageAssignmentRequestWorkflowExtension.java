package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentRequestWorkflowExtension extends CustomCalloutExtension implements Parsable {
    /**
     * The callback configuration for a custom extension.
     */
    private CustomExtensionCallbackConfiguration callbackConfiguration;
    /**
     * The userPrincipalName of the user or identity of the subject that created this resource. Read-only.
     */
    private String createdBy;
    /**
     * When the object was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The userPrincipalName of the identity that last modified the object.
     */
    private String lastModifiedBy;
    /**
     * When the object was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Instantiates a new accessPackageAssignmentRequestWorkflowExtension and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentRequestWorkflowExtension() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageAssignmentRequestWorkflowExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentRequestWorkflowExtension
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentRequestWorkflowExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequestWorkflowExtension();
    }
    /**
     * Gets the callbackConfiguration property value. The callback configuration for a custom extension.
     * @return a customExtensionCallbackConfiguration
     */
    @jakarta.annotation.Nullable
    public CustomExtensionCallbackConfiguration getCallbackConfiguration() {
        return this.callbackConfiguration;
    }
    /**
     * Gets the createdBy property value. The userPrincipalName of the user or identity of the subject that created this resource. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. When the object was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callbackConfiguration", (n) -> { this.setCallbackConfiguration(n.getObjectValue(CustomExtensionCallbackConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The userPrincipalName of the identity that last modified the object.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. When the object was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("callbackConfiguration", this.getCallbackConfiguration());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
    }
    /**
     * Sets the callbackConfiguration property value. The callback configuration for a custom extension.
     * @param value Value to set for the callbackConfiguration property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCallbackConfiguration(@jakarta.annotation.Nullable final CustomExtensionCallbackConfiguration value) {
        this.callbackConfiguration = value;
    }
    /**
     * Sets the createdBy property value. The userPrincipalName of the user or identity of the subject that created this resource. Read-only.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. When the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the lastModifiedBy property value. The userPrincipalName of the identity that last modified the object.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. When the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
}
