package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamsAppDefinition extends Entity implements Parsable {
    /** The details of the bot specified in the Teams app manifest. */
    private TeamworkBot bot;
    /** The createdBy property */
    private IdentitySet createdBy;
    /** Verbose description of the application. */
    private String description;
    /** The name of the app provided by the app developer. */
    private String displayName;
    /** The lastModifiedDateTime property */
    private OffsetDateTime lastModifiedDateTime;
    /** The published status of a specific version of a Teams app. Possible values are:submitted  The specific version of the Teams app has been submitted and is under review. published   The request to publish the specific version of the Teams app has been approved by the admin and the app is published.  rejected  The request to publish the specific version of the Teams app was rejected by the admin. */
    private TeamsAppPublishingState publishingState;
    /** Short description of the application. */
    private String shortDescription;
    /** The ID from the Teams app manifest. */
    private String teamsAppId;
    /** The version number of the application. */
    private String version;
    /**
     * Instantiates a new teamsAppDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamsAppDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsAppDefinition
     */
    @javax.annotation.Nonnull
    public static TeamsAppDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppDefinition();
    }
    /**
     * Gets the bot property value. The details of the bot specified in the Teams app manifest.
     * @return a teamworkBot
     */
    @javax.annotation.Nullable
    public TeamworkBot getBot() {
        return this.bot;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the description property value. Verbose description of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The name of the app provided by the app developer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the publishingState property value. The published status of a specific version of a Teams app. Possible values are:submitted  The specific version of the Teams app has been submitted and is under review. published   The request to publish the specific version of the Teams app has been approved by the admin and the app is published.  rejected  The request to publish the specific version of the Teams app was rejected by the admin.
     * @return a teamsAppPublishingState
     */
    @javax.annotation.Nullable
    public TeamsAppPublishingState getPublishingState() {
        return this.publishingState;
    }
    /**
     * Gets the shortDescription property value. Short description of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShortDescription() {
        return this.shortDescription;
    }
    /**
     * Gets the teamsAppId property value. The ID from the Teams app manifest.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamsAppId() {
        return this.teamsAppId;
    }
    /**
     * Gets the version property value. The version number of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
     * Sets the bot property value. The details of the bot specified in the Teams app manifest.
     * @param value Value to set for the bot property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBot(@javax.annotation.Nullable final TeamworkBot value) {
        this.bot = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the description property value. Verbose description of the application.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The name of the app provided by the app developer.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the publishingState property value. The published status of a specific version of a Teams app. Possible values are:submitted  The specific version of the Teams app has been submitted and is under review. published   The request to publish the specific version of the Teams app has been approved by the admin and the app is published.  rejected  The request to publish the specific version of the Teams app was rejected by the admin.
     * @param value Value to set for the publishingState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishingState(@javax.annotation.Nullable final TeamsAppPublishingState value) {
        this.publishingState = value;
    }
    /**
     * Sets the shortDescription property value. Short description of the application.
     * @param value Value to set for the shortDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShortDescription(@javax.annotation.Nullable final String value) {
        this.shortDescription = value;
    }
    /**
     * Sets the teamsAppId property value. The ID from the Teams app manifest.
     * @param value Value to set for the teamsAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamsAppId(@javax.annotation.Nullable final String value) {
        this.teamsAppId = value;
    }
    /**
     * Sets the version property value. The version number of the application.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
