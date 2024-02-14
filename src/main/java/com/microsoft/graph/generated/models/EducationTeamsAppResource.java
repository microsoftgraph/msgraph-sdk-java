package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationTeamsAppResource extends EducationResource implements Parsable {
    /**
     * Instantiates a new {@link EducationTeamsAppResource} and sets the default values.
     */
    public EducationTeamsAppResource() {
        super();
        this.setOdataType("#microsoft.graph.educationTeamsAppResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationTeamsAppResource}
     */
    @jakarta.annotation.Nonnull
    public static EducationTeamsAppResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationTeamsAppResource();
    }
    /**
     * Gets the appIconWebUrl property value. URL that points to the icon of the app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppIconWebUrl() {
        return this.backingStore.get("appIconWebUrl");
    }
    /**
     * Gets the appId property value. Teams app ID of the application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appIconWebUrl", (n) -> { this.setAppIconWebUrl(n.getStringValue()); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("teamsEmbeddedContentUrl", (n) -> { this.setTeamsEmbeddedContentUrl(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the teamsEmbeddedContentUrl property value. URL for the app resource that will be opened by Teams.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTeamsEmbeddedContentUrl() {
        return this.backingStore.get("teamsEmbeddedContentUrl");
    }
    /**
     * Gets the webUrl property value. URL for the app resource that can be opened in the browser.
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
        writer.writeStringValue("appIconWebUrl", this.getAppIconWebUrl());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("teamsEmbeddedContentUrl", this.getTeamsEmbeddedContentUrl());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the appIconWebUrl property value. URL that points to the icon of the app.
     * @param value Value to set for the appIconWebUrl property.
     */
    public void setAppIconWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appIconWebUrl", value);
    }
    /**
     * Sets the appId property value. Teams app ID of the application.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the teamsEmbeddedContentUrl property value. URL for the app resource that will be opened by Teams.
     * @param value Value to set for the teamsEmbeddedContentUrl property.
     */
    public void setTeamsEmbeddedContentUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("teamsEmbeddedContentUrl", value);
    }
    /**
     * Sets the webUrl property value. URL for the app resource that can be opened in the browser.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
