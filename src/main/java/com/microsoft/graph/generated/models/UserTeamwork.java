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
     * Instantiates a new {@link UserTeamwork} and sets the default values.
     */
    public UserTeamwork() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserTeamwork}
     */
    @jakarta.annotation.Nonnull
    public static UserTeamwork createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserTeamwork();
    }
    /**
     * Gets the associatedTeams property value. The list of associatedTeamInfo objects that a user is associated with.
     * @return a {@link java.util.List<AssociatedTeamInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssociatedTeamInfo> getAssociatedTeams() {
        return this.backingStore.get("associatedTeams");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associatedTeams", (n) -> { this.setAssociatedTeams(n.getCollectionOfObjectValues(AssociatedTeamInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("installedApps", (n) -> { this.setInstalledApps(n.getCollectionOfObjectValues(UserScopeTeamsAppInstallation::createFromDiscriminatorValue)); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installedApps property value. The apps installed in the personal scope of this user.
     * @return a {@link java.util.List<UserScopeTeamsAppInstallation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserScopeTeamsAppInstallation> getInstalledApps() {
        return this.backingStore.get("installedApps");
    }
    /**
     * Gets the locale property value. Represents the location that a user selected in Microsoft Teams and doesn't follow the Office's locale setting. A users locale is represented by their preferred language and country or region. For example, en-us. The language component follows two-letter codes as defined in ISO 639-1, and the country component follows two-letter codes as defined in ISO 3166-1 alpha-2.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocale() {
        return this.backingStore.get("locale");
    }
    /**
     * Gets the region property value. Represents the region of the organization or the user. For users with multigeo licenses, the property contains the user's region (if available). For users without multigeo licenses, the property contains the organization's region.The region value can be any region supported by the Teams payload. The possible values are: Americas, Europe and MiddleEast, Asia Pacific, UAE, Australia, Brazil, Canada, Switzerland, Germany, France, India, Japan, South Korea, Norway, Singapore, United Kingdom, South Africa, Sweden, Qatar, Poland, Italy, Israel, Spain, Mexico, USGov Community Cloud, USGov Community Cloud High, USGov Department of Defense, and China.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.backingStore.get("region");
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
        writer.writeStringValue("locale", this.getLocale());
        writer.writeStringValue("region", this.getRegion());
    }
    /**
     * Sets the associatedTeams property value. The list of associatedTeamInfo objects that a user is associated with.
     * @param value Value to set for the associatedTeams property.
     */
    public void setAssociatedTeams(@jakarta.annotation.Nullable final java.util.List<AssociatedTeamInfo> value) {
        this.backingStore.set("associatedTeams", value);
    }
    /**
     * Sets the installedApps property value. The apps installed in the personal scope of this user.
     * @param value Value to set for the installedApps property.
     */
    public void setInstalledApps(@jakarta.annotation.Nullable final java.util.List<UserScopeTeamsAppInstallation> value) {
        this.backingStore.set("installedApps", value);
    }
    /**
     * Sets the locale property value. Represents the location that a user selected in Microsoft Teams and doesn't follow the Office's locale setting. A users locale is represented by their preferred language and country or region. For example, en-us. The language component follows two-letter codes as defined in ISO 639-1, and the country component follows two-letter codes as defined in ISO 3166-1 alpha-2.
     * @param value Value to set for the locale property.
     */
    public void setLocale(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("locale", value);
    }
    /**
     * Sets the region property value. Represents the region of the organization or the user. For users with multigeo licenses, the property contains the user's region (if available). For users without multigeo licenses, the property contains the organization's region.The region value can be any region supported by the Teams payload. The possible values are: Americas, Europe and MiddleEast, Asia Pacific, UAE, Australia, Brazil, Canada, Switzerland, Germany, France, India, Japan, South Korea, Norway, Singapore, United Kingdom, South Africa, Sweden, Qatar, Poland, Italy, Israel, Spain, Mexico, USGov Community Cloud, USGov Community Cloud High, USGov Department of Defense, and China.
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("region", value);
    }
}
