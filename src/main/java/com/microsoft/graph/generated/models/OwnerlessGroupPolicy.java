package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OwnerlessGroupPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link OwnerlessGroupPolicy} and sets the default values.
     */
    public OwnerlessGroupPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OwnerlessGroupPolicy}
     */
    @jakarta.annotation.Nonnull
    public static OwnerlessGroupPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OwnerlessGroupPolicy();
    }
    /**
     * Gets the emailInfo property value. The emailInfo property
     * @return a {@link EmailDetails}
     */
    @jakarta.annotation.Nullable
    public EmailDetails getEmailInfo() {
        return this.backingStore.get("emailInfo");
    }
    /**
     * Gets the enabledGroupIds property value. The collection of IDs for groups to which the policy is enabled. If empty, the policy is enabled for all groups in the tenant.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnabledGroupIds() {
        return this.backingStore.get("enabledGroupIds");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("emailInfo", (n) -> { this.setEmailInfo(n.getObjectValue(EmailDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("enabledGroupIds", (n) -> { this.setEnabledGroupIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("maxMembersToNotify", (n) -> { this.setMaxMembersToNotify(n.getLongValue()); });
        deserializerMap.put("notificationDurationInWeeks", (n) -> { this.setNotificationDurationInWeeks(n.getLongValue()); });
        deserializerMap.put("policyWebUrl", (n) -> { this.setPolicyWebUrl(n.getStringValue()); });
        deserializerMap.put("targetOwners", (n) -> { this.setTargetOwners(n.getObjectValue(TargetOwners::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the ownerless group policy is enabled in the tenant. Setting this property to false clears the values of all other policy parameters.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the maxMembersToNotify property value. The maximum number of members to notify. Value range is 0-90. Members are prioritized by recent group activity (most active first). If there aren&apos;t enough active members to fill the limit, remaining slots are filled with other eligible group members from the directory.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMaxMembersToNotify() {
        return this.backingStore.get("maxMembersToNotify");
    }
    /**
     * Gets the notificationDurationInWeeks property value. The number of weeks for the notification duration. Value range is 1-7.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getNotificationDurationInWeeks() {
        return this.backingStore.get("notificationDurationInWeeks");
    }
    /**
     * Gets the policyWebUrl property value. The URL to the policy documentation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyWebUrl() {
        return this.backingStore.get("policyWebUrl");
    }
    /**
     * Gets the targetOwners property value. The targetOwners property
     * @return a {@link TargetOwners}
     */
    @jakarta.annotation.Nullable
    public TargetOwners getTargetOwners() {
        return this.backingStore.get("targetOwners");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("emailInfo", this.getEmailInfo());
        writer.writeCollectionOfPrimitiveValues("enabledGroupIds", this.getEnabledGroupIds());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeLongValue("maxMembersToNotify", this.getMaxMembersToNotify());
        writer.writeLongValue("notificationDurationInWeeks", this.getNotificationDurationInWeeks());
        writer.writeStringValue("policyWebUrl", this.getPolicyWebUrl());
        writer.writeObjectValue("targetOwners", this.getTargetOwners());
    }
    /**
     * Sets the emailInfo property value. The emailInfo property
     * @param value Value to set for the emailInfo property.
     */
    public void setEmailInfo(@jakarta.annotation.Nullable final EmailDetails value) {
        this.backingStore.set("emailInfo", value);
    }
    /**
     * Sets the enabledGroupIds property value. The collection of IDs for groups to which the policy is enabled. If empty, the policy is enabled for all groups in the tenant.
     * @param value Value to set for the enabledGroupIds property.
     */
    public void setEnabledGroupIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("enabledGroupIds", value);
    }
    /**
     * Sets the isEnabled property value. Indicates whether the ownerless group policy is enabled in the tenant. Setting this property to false clears the values of all other policy parameters.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the maxMembersToNotify property value. The maximum number of members to notify. Value range is 0-90. Members are prioritized by recent group activity (most active first). If there aren&apos;t enough active members to fill the limit, remaining slots are filled with other eligible group members from the directory.
     * @param value Value to set for the maxMembersToNotify property.
     */
    public void setMaxMembersToNotify(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("maxMembersToNotify", value);
    }
    /**
     * Sets the notificationDurationInWeeks property value. The number of weeks for the notification duration. Value range is 1-7.
     * @param value Value to set for the notificationDurationInWeeks property.
     */
    public void setNotificationDurationInWeeks(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("notificationDurationInWeeks", value);
    }
    /**
     * Sets the policyWebUrl property value. The URL to the policy documentation.
     * @param value Value to set for the policyWebUrl property.
     */
    public void setPolicyWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyWebUrl", value);
    }
    /**
     * Sets the targetOwners property value. The targetOwners property
     * @param value Value to set for the targetOwners property.
     */
    public void setTargetOwners(@jakarta.annotation.Nullable final TargetOwners value) {
        this.backingStore.set("targetOwners", value);
    }
}
