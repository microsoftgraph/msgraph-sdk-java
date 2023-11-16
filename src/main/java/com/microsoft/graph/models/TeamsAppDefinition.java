package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsAppDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new TeamsAppDefinition and sets the default values.
     */
    public TeamsAppDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamsAppDefinition
     */
    @jakarta.annotation.Nonnull
    public static TeamsAppDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppDefinition();
    }
    /**
     * Gets the authorization property value. Authorization requirements specified in the Teams app manifest.
     * @return a TeamsAppAuthorization
     */
    @jakarta.annotation.Nullable
    public TeamsAppAuthorization getAuthorization() {
        return this.backingStore.get("authorization");
    }
    /**
     * Gets the bot property value. The details of the bot specified in the Teams app manifest.
     * @return a TeamworkBot
     */
    @jakarta.annotation.Nullable
    public TeamworkBot getBot() {
        return this.backingStore.get("bot");
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the description property value. Verbose description of the application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The name of the app provided by the app developer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authorization", (n) -> { this.setAuthorization(n.getObjectValue(TeamsAppAuthorization::createFromDiscriminatorValue)); });
        deserializerMap.put("bot", (n) -> { this.setBot(n.getObjectValue(TeamworkBot::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("publishingState", (n) -> { this.setPublishingState(n.getEnumValue(TeamsAppPublishingState.class)); });
        deserializerMap.put("shortDescription", (n) -> { this.setShortDescription(n.getStringValue()); });
        deserializerMap.put("teamsAppId", (n) -> { this.setTeamsAppId(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the publishingState property value. The published status of a specific version of a Teams app. Possible values are:submittedThe specific version of the Teams app has been submitted and is under review. publishedThe request to publish the specific version of the Teams app has been approved by the admin and the app is published.  rejectedThe admin rejected the request to publish the specific version of the Teams app.
     * @return a TeamsAppPublishingState
     */
    @jakarta.annotation.Nullable
    public TeamsAppPublishingState getPublishingState() {
        return this.backingStore.get("publishingState");
    }
    /**
     * Gets the shortDescription property value. Short description of the application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getShortDescription() {
        return this.backingStore.get("shortDescription");
    }
    /**
     * Gets the teamsAppId property value. The ID from the Teams app manifest.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTeamsAppId() {
        return this.backingStore.get("teamsAppId");
    }
    /**
     * Gets the version property value. The version number of the application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("authorization", this.getAuthorization());
        writer.writeObjectValue("bot", this.getBot());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("publishingState", this.getPublishingState());
        writer.writeStringValue("shortDescription", this.getShortDescription());
        writer.writeStringValue("teamsAppId", this.getTeamsAppId());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the authorization property value. Authorization requirements specified in the Teams app manifest.
     * @param value Value to set for the authorization property.
     */
    public void setAuthorization(@jakarta.annotation.Nullable final TeamsAppAuthorization value) {
        this.backingStore.set("authorization", value);
    }
    /**
     * Sets the bot property value. The details of the bot specified in the Teams app manifest.
     * @param value Value to set for the bot property.
     */
    public void setBot(@jakarta.annotation.Nullable final TeamworkBot value) {
        this.backingStore.set("bot", value);
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the description property value. Verbose description of the application.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The name of the app provided by the app developer.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the publishingState property value. The published status of a specific version of a Teams app. Possible values are:submittedThe specific version of the Teams app has been submitted and is under review. publishedThe request to publish the specific version of the Teams app has been approved by the admin and the app is published.  rejectedThe admin rejected the request to publish the specific version of the Teams app.
     * @param value Value to set for the publishingState property.
     */
    public void setPublishingState(@jakarta.annotation.Nullable final TeamsAppPublishingState value) {
        this.backingStore.set("publishingState", value);
    }
    /**
     * Sets the shortDescription property value. Short description of the application.
     * @param value Value to set for the shortDescription property.
     */
    public void setShortDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("shortDescription", value);
    }
    /**
     * Sets the teamsAppId property value. The ID from the Teams app manifest.
     * @param value Value to set for the teamsAppId property.
     */
    public void setTeamsAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("teamsAppId", value);
    }
    /**
     * Sets the version property value. The version number of the application.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
