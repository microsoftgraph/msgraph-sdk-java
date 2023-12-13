package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsAppInstallation extends Entity implements Parsable {
    /**
     * Instantiates a new TeamsAppInstallation and sets the default values.
     */
    public TeamsAppInstallation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamsAppInstallation
     */
    @jakarta.annotation.Nonnull
    public static TeamsAppInstallation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.userScopeTeamsAppInstallation": return new UserScopeTeamsAppInstallation();
            }
        }
        return new TeamsAppInstallation();
    }
    /**
     * Gets the consentedPermissionSet property value. The set of resource-specific permissions consented to while installing or upgrading the teamsApp.
     * @return a TeamsAppPermissionSet
     */
    @jakarta.annotation.Nullable
    public TeamsAppPermissionSet getConsentedPermissionSet() {
        return this.backingStore.get("consentedPermissionSet");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("consentedPermissionSet", (n) -> { this.setConsentedPermissionSet(n.getObjectValue(TeamsAppPermissionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("teamsApp", (n) -> { this.setTeamsApp(n.getObjectValue(TeamsApp::createFromDiscriminatorValue)); });
        deserializerMap.put("teamsAppDefinition", (n) -> { this.setTeamsAppDefinition(n.getObjectValue(TeamsAppDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the teamsApp property value. The app that is installed.
     * @return a TeamsApp
     */
    @jakarta.annotation.Nullable
    public TeamsApp getTeamsApp() {
        return this.backingStore.get("teamsApp");
    }
    /**
     * Gets the teamsAppDefinition property value. The details of this version of the app.
     * @return a TeamsAppDefinition
     */
    @jakarta.annotation.Nullable
    public TeamsAppDefinition getTeamsAppDefinition() {
        return this.backingStore.get("teamsAppDefinition");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("consentedPermissionSet", this.getConsentedPermissionSet());
        writer.writeObjectValue("teamsApp", this.getTeamsApp());
        writer.writeObjectValue("teamsAppDefinition", this.getTeamsAppDefinition());
    }
    /**
     * Sets the consentedPermissionSet property value. The set of resource-specific permissions consented to while installing or upgrading the teamsApp.
     * @param value Value to set for the consentedPermissionSet property.
     */
    public void setConsentedPermissionSet(@jakarta.annotation.Nullable final TeamsAppPermissionSet value) {
        this.backingStore.set("consentedPermissionSet", value);
    }
    /**
     * Sets the teamsApp property value. The app that is installed.
     * @param value Value to set for the teamsApp property.
     */
    public void setTeamsApp(@jakarta.annotation.Nullable final TeamsApp value) {
        this.backingStore.set("teamsApp", value);
    }
    /**
     * Sets the teamsAppDefinition property value. The details of this version of the app.
     * @param value Value to set for the teamsAppDefinition property.
     */
    public void setTeamsAppDefinition(@jakarta.annotation.Nullable final TeamsAppDefinition value) {
        this.backingStore.set("teamsAppDefinition", value);
    }
}
