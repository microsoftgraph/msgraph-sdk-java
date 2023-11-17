package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsApp extends Entity implements Parsable {
    /**
     * Instantiates a new TeamsApp and sets the default values.
     */
    public TeamsApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamsApp
     */
    @jakarta.annotation.Nonnull
    public static TeamsApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsApp();
    }
    /**
     * Gets the appDefinitions property value. The details for each version of the app.
     * @return a java.util.List<TeamsAppDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamsAppDefinition> getAppDefinitions() {
        return this.backingStore.get("appDefinitions");
    }
    /**
     * Gets the displayName property value. The name of the catalog app provided by the app developer in the Microsoft Teams zip app package.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the distributionMethod property value. The method of distribution for the app. Read-only.
     * @return a TeamsAppDistributionMethod
     */
    @jakarta.annotation.Nullable
    public TeamsAppDistributionMethod getDistributionMethod() {
        return this.backingStore.get("distributionMethod");
    }
    /**
     * Gets the externalId property value. The ID of the catalog provided by the app developer in the Microsoft Teams zip app package.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAppDefinitions(@jakarta.annotation.Nullable final java.util.List<TeamsAppDefinition> value) {
        this.backingStore.set("appDefinitions", value);
    }
    /**
     * Sets the displayName property value. The name of the catalog app provided by the app developer in the Microsoft Teams zip app package.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the distributionMethod property value. The method of distribution for the app. Read-only.
     * @param value Value to set for the distributionMethod property.
     */
    public void setDistributionMethod(@jakarta.annotation.Nullable final TeamsAppDistributionMethod value) {
        this.backingStore.set("distributionMethod", value);
    }
    /**
     * Sets the externalId property value. The ID of the catalog provided by the app developer in the Microsoft Teams zip app package.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
}
