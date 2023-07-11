package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamsAppInstallation extends Entity implements Parsable {
    /**
     * The set of resource-specific permissions consented to while installing or upgrading the teamsApp.
     */
    private TeamsAppPermissionSet consentedPermissionSet;
    /**
     * The app that is installed.
     */
    private TeamsApp teamsApp;
    /**
     * The details of this version of the app.
     */
    private TeamsAppDefinition teamsAppDefinition;
    /**
     * Instantiates a new teamsAppInstallation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamsAppInstallation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsAppInstallation
     */
    @javax.annotation.Nonnull
    public static TeamsAppInstallation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a teamsAppPermissionSet
     */
    @javax.annotation.Nullable
    public TeamsAppPermissionSet getConsentedPermissionSet() {
        return this.consentedPermissionSet;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("consentedPermissionSet", (n) -> { this.setConsentedPermissionSet(n.getObjectValue(TeamsAppPermissionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("teamsApp", (n) -> { this.setTeamsApp(n.getObjectValue(TeamsApp::createFromDiscriminatorValue)); });
        deserializerMap.put("teamsAppDefinition", (n) -> { this.setTeamsAppDefinition(n.getObjectValue(TeamsAppDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the teamsApp property value. The app that is installed.
     * @return a teamsApp
     */
    @javax.annotation.Nullable
    public TeamsApp getTeamsApp() {
        return this.teamsApp;
    }
    /**
     * Gets the teamsAppDefinition property value. The details of this version of the app.
     * @return a teamsAppDefinition
     */
    @javax.annotation.Nullable
    public TeamsAppDefinition getTeamsAppDefinition() {
        return this.teamsAppDefinition;
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
        writer.writeObjectValue("consentedPermissionSet", this.getConsentedPermissionSet());
        writer.writeObjectValue("teamsApp", this.getTeamsApp());
        writer.writeObjectValue("teamsAppDefinition", this.getTeamsAppDefinition());
    }
    /**
     * Sets the consentedPermissionSet property value. The set of resource-specific permissions consented to while installing or upgrading the teamsApp.
     * @param value Value to set for the consentedPermissionSet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConsentedPermissionSet(@javax.annotation.Nullable final TeamsAppPermissionSet value) {
        this.consentedPermissionSet = value;
    }
    /**
     * Sets the teamsApp property value. The app that is installed.
     * @param value Value to set for the teamsApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamsApp(@javax.annotation.Nullable final TeamsApp value) {
        this.teamsApp = value;
    }
    /**
     * Sets the teamsAppDefinition property value. The details of this version of the app.
     * @param value Value to set for the teamsAppDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamsAppDefinition(@javax.annotation.Nullable final TeamsAppDefinition value) {
        this.teamsAppDefinition = value;
    }
}
