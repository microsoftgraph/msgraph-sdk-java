package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserTeamwork extends Entity implements Parsable {
    /**
     * Instantiates a new UserTeamwork and sets the default values.
     */
    public UserTeamwork() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserTeamwork
     */
    @jakarta.annotation.Nonnull
    public static UserTeamwork createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserTeamwork();
    }
    /**
     * Gets the associatedTeams property value. The list of associatedTeamInfo objects that a user is associated with.
     * @return a java.util.List<AssociatedTeamInfo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssociatedTeamInfo> getAssociatedTeams() {
        return this.BackingStore.get("associatedTeams");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associatedTeams", (n) -> { this.setAssociatedTeams(n.getCollectionOfObjectValues(AssociatedTeamInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("installedApps", (n) -> { this.setInstalledApps(n.getCollectionOfObjectValues(UserScopeTeamsAppInstallation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the installedApps property value. The apps installed in the personal scope of this user.
     * @return a java.util.List<UserScopeTeamsAppInstallation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserScopeTeamsAppInstallation> getInstalledApps() {
        return this.BackingStore.get("installedApps");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("associatedTeams", this.getAssociatedTeams());
        writer.writeCollectionOfObjectValues("installedApps", this.getInstalledApps());
    }
    /**
     * Sets the associatedTeams property value. The list of associatedTeamInfo objects that a user is associated with.
     * @param value Value to set for the associatedTeams property.
     */
    public void setAssociatedTeams(@jakarta.annotation.Nullable final java.util.List<AssociatedTeamInfo> value) {
        this.BackingStore.set("associatedTeams", value);
    }
    /**
     * Sets the installedApps property value. The apps installed in the personal scope of this user.
     * @param value Value to set for the installedApps property.
     */
    public void setInstalledApps(@jakarta.annotation.Nullable final java.util.List<UserScopeTeamsAppInstallation> value) {
        this.BackingStore.set("installedApps", value);
    }
}
