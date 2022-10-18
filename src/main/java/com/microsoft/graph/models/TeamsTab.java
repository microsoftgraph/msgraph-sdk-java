package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreement entities. */
public class TeamsTab extends Entity implements Parsable {
    /** Container for custom settings applied to a tab. The tab is considered configured only once this property is set. */
    private TeamsTabConfiguration _configuration;
    /** Name of the tab. */
    private String _displayName;
    /** The application that is linked to the tab. This cannot be changed after tab creation. */
    private TeamsApp _teamsApp;
    /** Deep link URL of the tab instance. Read only. */
    private String _webUrl;
    /**
     * Instantiates a new teamsTab and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamsTab() {
        super();
        this.setOdataType("#microsoft.graph.teamsTab");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsTab
     */
    @javax.annotation.Nonnull
    public static TeamsTab createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsTab();
    }
    /**
     * Gets the configuration property value. Container for custom settings applied to a tab. The tab is considered configured only once this property is set.
     * @return a teamsTabConfiguration
     */
    @javax.annotation.Nullable
    public TeamsTabConfiguration getConfiguration() {
        return this._configuration;
    }
    /**
     * Gets the displayName property value. Name of the tab.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamsTab currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("configuration", (n) -> { currentObject.setConfiguration(n.getObjectValue(TeamsTabConfiguration::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("teamsApp", (n) -> { currentObject.setTeamsApp(n.getObjectValue(TeamsApp::createFromDiscriminatorValue)); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the teamsApp property value. The application that is linked to the tab. This cannot be changed after tab creation.
     * @return a teamsApp
     */
    @javax.annotation.Nullable
    public TeamsApp getTeamsApp() {
        return this._teamsApp;
    }
    /**
     * Gets the webUrl property value. Deep link URL of the tab instance. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
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
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("teamsApp", this.getTeamsApp());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the configuration property value. Container for custom settings applied to a tab. The tab is considered configured only once this property is set.
     * @param value Value to set for the configuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfiguration(@javax.annotation.Nullable final TeamsTabConfiguration value) {
        this._configuration = value;
    }
    /**
     * Sets the displayName property value. Name of the tab.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the teamsApp property value. The application that is linked to the tab. This cannot be changed after tab creation.
     * @param value Value to set for the teamsApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamsApp(@javax.annotation.Nullable final TeamsApp value) {
        this._teamsApp = value;
    }
    /**
     * Sets the webUrl property value. Deep link URL of the tab instance. Read only.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
