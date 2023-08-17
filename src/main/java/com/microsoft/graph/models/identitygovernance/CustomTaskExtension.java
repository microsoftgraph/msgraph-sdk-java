package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.CustomCalloutExtension;
import com.microsoft.graph.models.CustomExtensionCallbackConfiguration;
import com.microsoft.graph.models.User;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomTaskExtension extends CustomCalloutExtension implements Parsable {
    /**
     * The callback configuration for a custom task extension.
     */
    private CustomExtensionCallbackConfiguration callbackConfiguration;
    /**
     * The unique identifier of the Azure AD user that created the custom task extension.Supports $filter(eq, ne) and $expand.
     */
    private User createdBy;
    /**
     * When the custom task extension was created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The unique identifier of the Azure AD user that modified the custom task extension last.Supports $filter(eq, ne) and $expand.
     */
    private User lastModifiedBy;
    /**
     * When the custom extension was last modified.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Instantiates a new customTaskExtension and sets the default values.
     */
    public CustomTaskExtension() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.customTaskExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customTaskExtension
     */
    @jakarta.annotation.Nonnull
    public static CustomTaskExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomTaskExtension();
    }
    /**
     * Gets the callbackConfiguration property value. The callback configuration for a custom task extension.
     * @return a customExtensionCallbackConfiguration
     */
    @jakarta.annotation.Nullable
    public CustomExtensionCallbackConfiguration getCallbackConfiguration() {
        return this.callbackConfiguration;
    }
    /**
     * Gets the createdBy property value. The unique identifier of the Azure AD user that created the custom task extension.Supports $filter(eq, ne) and $expand.
     * @return a user
     */
    @jakarta.annotation.Nullable
    public User getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. When the custom task extension was created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
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
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The unique identifier of the Azure AD user that modified the custom task extension last.Supports $filter(eq, ne) and $expand.
     * @return a user
     */
    @jakarta.annotation.Nullable
    public User getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. When the custom extension was last modified.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("callbackConfiguration", this.getCallbackConfiguration());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
    }
    /**
     * Sets the callbackConfiguration property value. The callback configuration for a custom task extension.
     * @param value Value to set for the callbackConfiguration property.
     */
    public void setCallbackConfiguration(@jakarta.annotation.Nullable final CustomExtensionCallbackConfiguration value) {
        this.callbackConfiguration = value;
    }
    /**
     * Sets the createdBy property value. The unique identifier of the Azure AD user that created the custom task extension.Supports $filter(eq, ne) and $expand.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final User value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. When the custom task extension was created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the lastModifiedBy property value. The unique identifier of the Azure AD user that modified the custom task extension last.Supports $filter(eq, ne) and $expand.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final User value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. When the custom extension was last modified.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
}
