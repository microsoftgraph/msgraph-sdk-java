package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserTeamwork extends Entity implements Parsable {
    /** The list of associatedTeamInfo objects that a user is associated with. */
    private java.util.List<AssociatedTeamInfo> _associatedTeams;
    /** The apps installed in the personal scope of this user. */
    private java.util.List<UserScopeTeamsAppInstallation> _installedApps;
    /**
     * Instantiates a new userTeamwork and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserTeamwork() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userTeamwork
     */
    @javax.annotation.Nonnull
    public static UserTeamwork createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserTeamwork();
    }
    /**
     * Gets the associatedTeams property value. The list of associatedTeamInfo objects that a user is associated with.
     * @return a associatedTeamInfo
     */
    @javax.annotation.Nullable
    public java.util.List<AssociatedTeamInfo> getAssociatedTeams() {
        return this._associatedTeams;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associatedTeams", (n) -> { this.setAssociatedTeams(n.getCollectionOfObjectValues(AssociatedTeamInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("installedApps", (n) -> { this.setInstalledApps(n.getCollectionOfObjectValues(UserScopeTeamsAppInstallation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the installedApps property value. The apps installed in the personal scope of this user.
     * @return a userScopeTeamsAppInstallation
     */
    @javax.annotation.Nullable
    public java.util.List<UserScopeTeamsAppInstallation> getInstalledApps() {
        return this._installedApps;
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
        writer.writeCollectionOfObjectValues("associatedTeams", this.getAssociatedTeams());
        writer.writeCollectionOfObjectValues("installedApps", this.getInstalledApps());
    }
    /**
     * Sets the associatedTeams property value. The list of associatedTeamInfo objects that a user is associated with.
     * @param value Value to set for the associatedTeams property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssociatedTeams(@javax.annotation.Nullable final java.util.List<AssociatedTeamInfo> value) {
        this._associatedTeams = value;
    }
    /**
     * Sets the installedApps property value. The apps installed in the personal scope of this user.
     * @param value Value to set for the installedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstalledApps(@javax.annotation.Nullable final java.util.List<UserScopeTeamsAppInstallation> value) {
        this._installedApps = value;
    }
}
