package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExternalConnection extends Entity implements Parsable {
    /**
     * Collects configurable settings related to activities involving connector content.
     */
    private ActivitySettings activitySettings;
    /**
     * Specifies additional application IDs that are allowed to manage the connection and to index content in the connection. Optional.
     */
    private Configuration configuration;
    /**
     * Description of the connection displayed in the Microsoft 365 admin center. Optional.
     */
    private String description;
    /**
     * The groups property
     */
    private java.util.List<ExternalGroup> groups;
    /**
     * The items property
     */
    private java.util.List<ExternalItem> items;
    /**
     * The display name of the connection to be displayed in the Microsoft 365 admin center. Maximum length of 128 characters. Required.
     */
    private String name;
    /**
     * The operations property
     */
    private java.util.List<ConnectionOperation> operations;
    /**
     * The schema property
     */
    private Schema schema;
    /**
     * The settings configuring the search experience for content in this connection, such as the display templates for search results.
     */
    private SearchSettings searchSettings;
    /**
     * Indicates the current state of the connection. Possible values are: draft, ready, obsolete, limitExceeded, unknownFutureValue.
     */
    private ConnectionState state;
    /**
     * Instantiates a new externalConnection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExternalConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a externalConnection
     */
    @javax.annotation.Nonnull
    public static ExternalConnection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalConnection();
    }
    /**
     * Gets the activitySettings property value. Collects configurable settings related to activities involving connector content.
     * @return a activitySettings
     */
    @javax.annotation.Nullable
    public ActivitySettings getActivitySettings() {
        return this.activitySettings;
    }
    /**
     * Gets the configuration property value. Specifies additional application IDs that are allowed to manage the connection and to index content in the connection. Optional.
     * @return a configuration
     */
    @javax.annotation.Nullable
    public Configuration getConfiguration() {
        return this.configuration;
    }
    /**
     * Gets the description property value. Description of the connection displayed in the Microsoft 365 admin center. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activitySettings", (n) -> { this.setActivitySettings(n.getObjectValue(ActivitySettings::createFromDiscriminatorValue)); });
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(Configuration::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getCollectionOfObjectValues(ExternalGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(ExternalItem::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(ConnectionOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("schema", (n) -> { this.setSchema(n.getObjectValue(Schema::createFromDiscriminatorValue)); });
        deserializerMap.put("searchSettings", (n) -> { this.setSearchSettings(n.getObjectValue(SearchSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ConnectionState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. The groups property
     * @return a externalGroup
     */
    @javax.annotation.Nullable
    public java.util.List<ExternalGroup> getGroups() {
        return this.groups;
    }
    /**
     * Gets the items property value. The items property
     * @return a externalItem
     */
    @javax.annotation.Nullable
    public java.util.List<ExternalItem> getItems() {
        return this.items;
    }
    /**
     * Gets the name property value. The display name of the connection to be displayed in the Microsoft 365 admin center. Maximum length of 128 characters. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the operations property value. The operations property
     * @return a connectionOperation
     */
    @javax.annotation.Nullable
    public java.util.List<ConnectionOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the schema property value. The schema property
     * @return a schema
     */
    @javax.annotation.Nullable
    public Schema getSchema() {
        return this.schema;
    }
    /**
     * Gets the searchSettings property value. The settings configuring the search experience for content in this connection, such as the display templates for search results.
     * @return a searchSettings
     */
    @javax.annotation.Nullable
    public SearchSettings getSearchSettings() {
        return this.searchSettings;
    }
    /**
     * Gets the state property value. Indicates the current state of the connection. Possible values are: draft, ready, obsolete, limitExceeded, unknownFutureValue.
     * @return a connectionState
     */
    @javax.annotation.Nullable
    public ConnectionState getState() {
        return this.state;
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
        writer.writeObjectValue("activitySettings", this.getActivitySettings());
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("groups", this.getGroups());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeObjectValue("schema", this.getSchema());
        writer.writeObjectValue("searchSettings", this.getSearchSettings());
    }
    /**
     * Sets the activitySettings property value. Collects configurable settings related to activities involving connector content.
     * @param value Value to set for the activitySettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivitySettings(@javax.annotation.Nullable final ActivitySettings value) {
        this.activitySettings = value;
    }
    /**
     * Sets the configuration property value. Specifies additional application IDs that are allowed to manage the connection and to index content in the connection. Optional.
     * @param value Value to set for the configuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfiguration(@javax.annotation.Nullable final Configuration value) {
        this.configuration = value;
    }
    /**
     * Sets the description property value. Description of the connection displayed in the Microsoft 365 admin center. Optional.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the groups property value. The groups property
     * @param value Value to set for the groups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroups(@javax.annotation.Nullable final java.util.List<ExternalGroup> value) {
        this.groups = value;
    }
    /**
     * Sets the items property value. The items property
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<ExternalItem> value) {
        this.items = value;
    }
    /**
     * Sets the name property value. The display name of the connection to be displayed in the Microsoft 365 admin center. Maximum length of 128 characters. Required.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the operations property value. The operations property
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<ConnectionOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the schema property value. The schema property
     * @param value Value to set for the schema property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchema(@javax.annotation.Nullable final Schema value) {
        this.schema = value;
    }
    /**
     * Sets the searchSettings property value. The settings configuring the search experience for content in this connection, such as the display templates for search results.
     * @param value Value to set for the searchSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchSettings(@javax.annotation.Nullable final SearchSettings value) {
        this.searchSettings = value;
    }
    /**
     * Sets the state property value. Indicates the current state of the connection. Possible values are: draft, ready, obsolete, limitExceeded, unknownFutureValue.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ConnectionState value) {
        this.state = value;
    }
}
