package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Teamwork extends Entity implements Parsable {
    /**
     * The deleted team.
     */
    private java.util.List<DeletedTeam> deletedTeams;
    /**
     * The teamsAppSettings property
     */
    private TeamsAppSettings teamsAppSettings;
    /**
     * The workforceIntegrations property
     */
    private java.util.List<WorkforceIntegration> workforceIntegrations;
    /**
     * Instantiates a new Teamwork and sets the default values.
     */
    public Teamwork() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Teamwork
     */
    @jakarta.annotation.Nonnull
    public static Teamwork createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Teamwork();
    }
    /**
     * Gets the deletedTeams property value. The deleted team.
     * @return a java.util.List<DeletedTeam>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeletedTeam> getDeletedTeams() {
        return this.deletedTeams;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deletedTeams", (n) -> { this.setDeletedTeams(n.getCollectionOfObjectValues(DeletedTeam::createFromDiscriminatorValue)); });
        deserializerMap.put("teamsAppSettings", (n) -> { this.setTeamsAppSettings(n.getObjectValue(TeamsAppSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("workforceIntegrations", (n) -> { this.setWorkforceIntegrations(n.getCollectionOfObjectValues(WorkforceIntegration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the teamsAppSettings property value. The teamsAppSettings property
     * @return a TeamsAppSettings
     */
    @jakarta.annotation.Nullable
    public TeamsAppSettings getTeamsAppSettings() {
        return this.teamsAppSettings;
    }
    /**
     * Gets the workforceIntegrations property value. The workforceIntegrations property
     * @return a java.util.List<WorkforceIntegration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkforceIntegration> getWorkforceIntegrations() {
        return this.workforceIntegrations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("deletedTeams", this.getDeletedTeams());
        writer.writeObjectValue("teamsAppSettings", this.getTeamsAppSettings());
        writer.writeCollectionOfObjectValues("workforceIntegrations", this.getWorkforceIntegrations());
    }
    /**
     * Sets the deletedTeams property value. The deleted team.
     * @param value Value to set for the deletedTeams property.
     */
    public void setDeletedTeams(@jakarta.annotation.Nullable final java.util.List<DeletedTeam> value) {
        this.deletedTeams = value;
    }
    /**
     * Sets the teamsAppSettings property value. The teamsAppSettings property
     * @param value Value to set for the teamsAppSettings property.
     */
    public void setTeamsAppSettings(@jakarta.annotation.Nullable final TeamsAppSettings value) {
        this.teamsAppSettings = value;
    }
    /**
     * Sets the workforceIntegrations property value. The workforceIntegrations property
     * @param value Value to set for the workforceIntegrations property.
     */
    public void setWorkforceIntegrations(@jakarta.annotation.Nullable final java.util.List<WorkforceIntegration> value) {
        this.workforceIntegrations = value;
    }
}
