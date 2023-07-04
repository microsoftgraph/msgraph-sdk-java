package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LinkedResource extends Entity implements Parsable {
    /**
     * The app name of the source that sends the linkedResource.
     */
    private String applicationName;
    /**
     * The title of the linkedResource.
     */
    private String displayName;
    /**
     * ID of the object that is associated with this task on the third-party/partner system.
     */
    private String externalId;
    /**
     * Deep link to the linkedResource.
     */
    private String webUrl;
    /**
     * Instantiates a new linkedResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LinkedResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a linkedResource
     */
    @javax.annotation.Nonnull
    public static LinkedResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LinkedResource();
    }
    /**
     * Gets the applicationName property value. The app name of the source that sends the linkedResource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationName() {
        return this.applicationName;
    }
    /**
     * Gets the displayName property value. The title of the linkedResource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the externalId property value. ID of the object that is associated with this task on the third-party/partner system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationName", (n) -> { this.setApplicationName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the webUrl property value. Deep link to the linkedResource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
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
        writer.writeStringValue("applicationName", this.getApplicationName());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the applicationName property value. The app name of the source that sends the linkedResource.
     * @param value Value to set for the applicationName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationName(@javax.annotation.Nullable final String value) {
        this.applicationName = value;
    }
    /**
     * Sets the displayName property value. The title of the linkedResource.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the externalId property value. ID of the object that is associated with this task on the third-party/partner system.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the webUrl property value. Deep link to the linkedResource.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
