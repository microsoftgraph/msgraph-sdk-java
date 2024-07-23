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
     * Instantiates a new {@link Teamwork} and sets the default values.
     */
    public Teamwork() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Teamwork}
     */
    @jakarta.annotation.Nonnull
    public static Teamwork createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Teamwork();
    }
    /**
     * Gets the deletedChats property value. A collection of deleted chats.
     * @return a {@link java.util.List<DeletedChat>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeletedChat> getDeletedChats() {
        return this.backingStore.get("deletedChats");
    }
    /**
     * Gets the deletedTeams property value. The deleted team.
     * @return a {@link java.util.List<DeletedTeam>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeletedTeam> getDeletedTeams() {
        return this.backingStore.get("deletedTeams");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deletedChats", (n) -> { this.setDeletedChats(n.getCollectionOfObjectValues(DeletedChat::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedTeams", (n) -> { this.setDeletedTeams(n.getCollectionOfObjectValues(DeletedTeam::createFromDiscriminatorValue)); });
        deserializerMap.put("isTeamsEnabled", (n) -> { this.setIsTeamsEnabled(n.getBooleanValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("teamsAppSettings", (n) -> { this.setTeamsAppSettings(n.getObjectValue(TeamsAppSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("workforceIntegrations", (n) -> { this.setWorkforceIntegrations(n.getCollectionOfObjectValues(WorkforceIntegration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isTeamsEnabled property value. Indicates whether Microsoft Teams is enabled for the organization.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTeamsEnabled() {
        return this.backingStore.get("isTeamsEnabled");
    }
    /**
     * Gets the region property value. Represents the region of the organization or the tenant. The region value can be any region supported by the Teams payload. The possible values are: Americas, Europe and MiddleEast, Asia Pacific, UAE, Australia, Brazil, Canada, Switzerland, Germany, France, India, Japan, South Korea, Norway, Singapore, United Kingdom, South Africa, Sweden, Qatar, Poland, Italy, Israel, USGov Community Cloud, USGov Community Cloud High, USGov Department of Defense, and China.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.backingStore.get("region");
    }
    /**
     * Gets the teamsAppSettings property value. Represents tenant-wide settings for all Teams apps in the tenant.
     * @return a {@link TeamsAppSettings}
     */
    @jakarta.annotation.Nullable
    public TeamsAppSettings getTeamsAppSettings() {
        return this.backingStore.get("teamsAppSettings");
    }
    /**
     * Gets the workforceIntegrations property value. The workforceIntegrations property
     * @return a {@link java.util.List<WorkforceIntegration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkforceIntegration> getWorkforceIntegrations() {
        return this.backingStore.get("workforceIntegrations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("deletedChats", this.getDeletedChats());
        writer.writeCollectionOfObjectValues("deletedTeams", this.getDeletedTeams());
        writer.writeBooleanValue("isTeamsEnabled", this.getIsTeamsEnabled());
        writer.writeStringValue("region", this.getRegion());
        writer.writeObjectValue("teamsAppSettings", this.getTeamsAppSettings());
        writer.writeCollectionOfObjectValues("workforceIntegrations", this.getWorkforceIntegrations());
    }
    /**
     * Sets the deletedChats property value. A collection of deleted chats.
     * @param value Value to set for the deletedChats property.
     */
    public void setDeletedChats(@jakarta.annotation.Nullable final java.util.List<DeletedChat> value) {
        this.backingStore.set("deletedChats", value);
    }
    /**
     * Sets the deletedTeams property value. The deleted team.
     * @param value Value to set for the deletedTeams property.
     */
    public void setDeletedTeams(@jakarta.annotation.Nullable final java.util.List<DeletedTeam> value) {
        this.backingStore.set("deletedTeams", value);
    }
    /**
     * Sets the isTeamsEnabled property value. Indicates whether Microsoft Teams is enabled for the organization.
     * @param value Value to set for the isTeamsEnabled property.
     */
    public void setIsTeamsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTeamsEnabled", value);
    }
    /**
     * Sets the region property value. Represents the region of the organization or the tenant. The region value can be any region supported by the Teams payload. The possible values are: Americas, Europe and MiddleEast, Asia Pacific, UAE, Australia, Brazil, Canada, Switzerland, Germany, France, India, Japan, South Korea, Norway, Singapore, United Kingdom, South Africa, Sweden, Qatar, Poland, Italy, Israel, USGov Community Cloud, USGov Community Cloud High, USGov Department of Defense, and China.
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("region", value);
    }
    /**
     * Sets the teamsAppSettings property value. Represents tenant-wide settings for all Teams apps in the tenant.
     * @param value Value to set for the teamsAppSettings property.
     */
    public void setTeamsAppSettings(@jakarta.annotation.Nullable final TeamsAppSettings value) {
        this.backingStore.set("teamsAppSettings", value);
    }
    /**
     * Sets the workforceIntegrations property value. The workforceIntegrations property
     * @param value Value to set for the workforceIntegrations property.
     */
    public void setWorkforceIntegrations(@jakarta.annotation.Nullable final java.util.List<WorkforceIntegration> value) {
        this.backingStore.set("workforceIntegrations", value);
    }
}
