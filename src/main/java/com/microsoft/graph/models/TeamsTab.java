package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsTab extends Entity implements Parsable {
    /**
     * Container for custom settings applied to a tab. The tab is considered configured only once this property is set.
     */
    private TeamsTabConfiguration configuration;
    /**
     * Name of the tab.
     */
    private String displayName;
    /**
     * The application that is linked to the tab. This cannot be changed after tab creation.
     */
    private TeamsApp teamsApp;
    /**
     * Deep link URL of the tab instance. Read only.
     */
    private String webUrl;
    /**
     * Instantiates a new teamsTab and sets the default values.
     */
    public TeamsTab() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsTab
     */
    @jakarta.annotation.Nonnull
    public static TeamsTab createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsTab();
    }
    /**
     * Gets the configuration property value. Container for custom settings applied to a tab. The tab is considered configured only once this property is set.
     * @return a teamsTabConfiguration
     */
    @jakarta.annotation.Nullable
    public TeamsTabConfiguration getConfiguration() {
        return this.configuration;
    }
    /**
     * Gets the displayName property value. Name of the tab.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(TeamsTabConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("teamsApp", (n) -> { this.setTeamsApp(n.getObjectValue(TeamsApp::createFromDiscriminatorValue)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the teamsApp property value. The application that is linked to the tab. This cannot be changed after tab creation.
     * @return a teamsApp
     */
    @jakarta.annotation.Nullable
    public TeamsApp getTeamsApp() {
        return this.teamsApp;
    }
    /**
     * Gets the webUrl property value. Deep link URL of the tab instance. Read only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("teamsApp", this.getTeamsApp());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the configuration property value. Container for custom settings applied to a tab. The tab is considered configured only once this property is set.
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final TeamsTabConfiguration value) {
        this.configuration = value;
    }
    /**
     * Sets the displayName property value. Name of the tab.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the teamsApp property value. The application that is linked to the tab. This cannot be changed after tab creation.
     * @param value Value to set for the teamsApp property.
     */
    public void setTeamsApp(@jakarta.annotation.Nullable final TeamsApp value) {
        this.teamsApp = value;
    }
    /**
     * Sets the webUrl property value. Deep link URL of the tab instance. Read only.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
