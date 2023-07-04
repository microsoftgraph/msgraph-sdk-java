package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamsApp extends Entity implements Parsable {
    /**
     * The details for each version of the app.
     */
    private java.util.List<TeamsAppDefinition> appDefinitions;
    /**
     * The name of the catalog app provided by the app developer in the Microsoft Teams zip app package.
     */
    private String displayName;
    /**
     * The method of distribution for the app. Read-only.
     */
    private TeamsAppDistributionMethod distributionMethod;
    /**
     * The ID of the catalog provided by the app developer in the Microsoft Teams zip app package.
     */
    private String externalId;
    /**
     * Instantiates a new teamsApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamsApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsApp
     */
    @javax.annotation.Nonnull
    public static TeamsApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsApp();
    }
    /**
     * Gets the appDefinitions property value. The details for each version of the app.
     * @return a teamsAppDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<TeamsAppDefinition> getAppDefinitions() {
        return this.appDefinitions;
    }
    /**
     * Gets the displayName property value. The name of the catalog app provided by the app developer in the Microsoft Teams zip app package.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the distributionMethod property value. The method of distribution for the app. Read-only.
     * @return a teamsAppDistributionMethod
     */
    @javax.annotation.Nullable
    public TeamsAppDistributionMethod getDistributionMethod() {
        return this.distributionMethod;
    }
    /**
     * Gets the externalId property value. The ID of the catalog provided by the app developer in the Microsoft Teams zip app package.
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
        deserializerMap.put("appDefinitions", (n) -> { this.setAppDefinitions(n.getCollectionOfObjectValues(TeamsAppDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("distributionMethod", (n) -> { this.setDistributionMethod(n.getEnumValue(TeamsAppDistributionMethod.class)); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeCollectionOfObjectValues("appDefinitions", this.getAppDefinitions());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("distributionMethod", this.getDistributionMethod());
        writer.writeStringValue("externalId", this.getExternalId());
    }
    /**
     * Sets the appDefinitions property value. The details for each version of the app.
     * @param value Value to set for the appDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDefinitions(@javax.annotation.Nullable final java.util.List<TeamsAppDefinition> value) {
        this.appDefinitions = value;
    }
    /**
     * Sets the displayName property value. The name of the catalog app provided by the app developer in the Microsoft Teams zip app package.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the distributionMethod property value. The method of distribution for the app. Read-only.
     * @param value Value to set for the distributionMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDistributionMethod(@javax.annotation.Nullable final TeamsAppDistributionMethod value) {
        this.distributionMethod = value;
    }
    /**
     * Sets the externalId property value. The ID of the catalog provided by the app developer in the Microsoft Teams zip app package.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this.externalId = value;
    }
}
