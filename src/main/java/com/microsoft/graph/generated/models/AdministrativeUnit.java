package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdministrativeUnit extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link AdministrativeUnit} and sets the default values.
     */
    public AdministrativeUnit() {
        super();
        this.setOdataType("#microsoft.graph.administrativeUnit");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdministrativeUnit}
     */
    @jakarta.annotation.Nonnull
    public static AdministrativeUnit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdministrativeUnit();
    }
    /**
     * Gets the description property value. An optional description for the administrative unit. Supports $filter (eq, ne, in, startsWith), $search.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Display name for the administrative unit. Maximum length is 256 characters. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for this administrative unit. Nullable.
     * @return a {@link java.util.List<Extension>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("isMemberManagementRestricted", (n) -> { this.setIsMemberManagementRestricted(n.getBooleanValue()); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("membershipRule", (n) -> { this.setMembershipRule(n.getStringValue()); });
        deserializerMap.put("membershipRuleProcessingState", (n) -> { this.setMembershipRuleProcessingState(n.getStringValue()); });
        deserializerMap.put("membershipType", (n) -> { this.setMembershipType(n.getStringValue()); });
        deserializerMap.put("scopedRoleMembers", (n) -> { this.setScopedRoleMembers(n.getCollectionOfObjectValues(ScopedRoleMembership::createFromDiscriminatorValue)); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isMemberManagementRestricted property value. true if members of this administrative unit should be treated as sensitive, which requires specific permissions to manage. If not set, the default value is null and the default behavior is false. Use this property to define administrative units with roles that don&apos;t inherit from tenant-level administrators, and where the management of individual member objects is limited to administrators scoped to a restricted management administrative unit. This property is immutable and can&apos;t be changed later.  For more information on how to work with restricted management administrative units, see Restricted management administrative units in Microsoft Entra ID.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMemberManagementRestricted() {
        return this.backingStore.get("isMemberManagementRestricted");
    }
    /**
     * Gets the members property value. Users and groups that are members of this administrative unit. Supports $expand.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getMembers() {
        return this.backingStore.get("members");
    }
    /**
     * Gets the membershipRule property value. The dynamic membership rule for the administrative unit. For more information about the rules you can use for dynamic administrative units and dynamic groups, see Manage rules for dynamic membership groups in Microsoft Entra ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMembershipRule() {
        return this.backingStore.get("membershipRule");
    }
    /**
     * Gets the membershipRuleProcessingState property value. Controls whether the dynamic membership rule is actively processed. Set to On to activate the dynamic membership rule, or Paused to stop updating membership dynamically.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMembershipRuleProcessingState() {
        return this.backingStore.get("membershipRuleProcessingState");
    }
    /**
     * Gets the membershipType property value. Indicates the membership type for the administrative unit. The possible values are: dynamic, assigned. If not set, the default value is null and the default behavior is assigned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMembershipType() {
        return this.backingStore.get("membershipType");
    }
    /**
     * Gets the scopedRoleMembers property value. Scoped-role members of this administrative unit.
     * @return a {@link java.util.List<ScopedRoleMembership>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ScopedRoleMembership> getScopedRoleMembers() {
        return this.backingStore.get("scopedRoleMembers");
    }
    /**
     * Gets the visibility property value. Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership. If not set, the default value is null and the default behavior is public. When set to HiddenMembership, only members of the administrative unit can list other members of the administrative unit.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVisibility() {
        return this.backingStore.get("visibility");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeBooleanValue("isMemberManagementRestricted", this.getIsMemberManagementRestricted());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeStringValue("membershipRule", this.getMembershipRule());
        writer.writeStringValue("membershipRuleProcessingState", this.getMembershipRuleProcessingState());
        writer.writeStringValue("membershipType", this.getMembershipType());
        writer.writeCollectionOfObjectValues("scopedRoleMembers", this.getScopedRoleMembers());
        writer.writeStringValue("visibility", this.getVisibility());
    }
    /**
     * Sets the description property value. An optional description for the administrative unit. Supports $filter (eq, ne, in, startsWith), $search.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Display name for the administrative unit. Maximum length is 256 characters. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for this administrative unit. Nullable.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Extension> value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the isMemberManagementRestricted property value. true if members of this administrative unit should be treated as sensitive, which requires specific permissions to manage. If not set, the default value is null and the default behavior is false. Use this property to define administrative units with roles that don&apos;t inherit from tenant-level administrators, and where the management of individual member objects is limited to administrators scoped to a restricted management administrative unit. This property is immutable and can&apos;t be changed later.  For more information on how to work with restricted management administrative units, see Restricted management administrative units in Microsoft Entra ID.
     * @param value Value to set for the isMemberManagementRestricted property.
     */
    public void setIsMemberManagementRestricted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMemberManagementRestricted", value);
    }
    /**
     * Sets the members property value. Users and groups that are members of this administrative unit. Supports $expand.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("members", value);
    }
    /**
     * Sets the membershipRule property value. The dynamic membership rule for the administrative unit. For more information about the rules you can use for dynamic administrative units and dynamic groups, see Manage rules for dynamic membership groups in Microsoft Entra ID.
     * @param value Value to set for the membershipRule property.
     */
    public void setMembershipRule(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("membershipRule", value);
    }
    /**
     * Sets the membershipRuleProcessingState property value. Controls whether the dynamic membership rule is actively processed. Set to On to activate the dynamic membership rule, or Paused to stop updating membership dynamically.
     * @param value Value to set for the membershipRuleProcessingState property.
     */
    public void setMembershipRuleProcessingState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("membershipRuleProcessingState", value);
    }
    /**
     * Sets the membershipType property value. Indicates the membership type for the administrative unit. The possible values are: dynamic, assigned. If not set, the default value is null and the default behavior is assigned.
     * @param value Value to set for the membershipType property.
     */
    public void setMembershipType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("membershipType", value);
    }
    /**
     * Sets the scopedRoleMembers property value. Scoped-role members of this administrative unit.
     * @param value Value to set for the scopedRoleMembers property.
     */
    public void setScopedRoleMembers(@jakarta.annotation.Nullable final java.util.List<ScopedRoleMembership> value) {
        this.backingStore.set("scopedRoleMembers", value);
    }
    /**
     * Sets the visibility property value. Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership. If not set, the default value is null and the default behavior is public. When set to HiddenMembership, only members of the administrative unit can list other members of the administrative unit.
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("visibility", value);
    }
}
