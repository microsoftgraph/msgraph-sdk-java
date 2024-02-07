package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdminConsentRequestPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new AdminConsentRequestPolicy and sets the default values.
     */
    public AdminConsentRequestPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AdminConsentRequestPolicy
     */
    @jakarta.annotation.Nonnull
    public static AdminConsentRequestPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminConsentRequestPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("notifyReviewers", (n) -> { this.setNotifyReviewers(n.getBooleanValue()); });
        deserializerMap.put("remindersEnabled", (n) -> { this.setRemindersEnabled(n.getBooleanValue()); });
        deserializerMap.put("requestDurationInDays", (n) -> { this.setRequestDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("reviewers", (n) -> { this.setReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Specifies whether the admin consent request feature is enabled or disabled. Required.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the notifyReviewers property value. Specifies whether reviewers will receive notifications. Required.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNotifyReviewers() {
        return this.backingStore.get("notifyReviewers");
    }
    /**
     * Gets the remindersEnabled property value. Specifies whether reviewers will receive reminder emails. Required.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRemindersEnabled() {
        return this.backingStore.get("remindersEnabled");
    }
    /**
     * Gets the requestDurationInDays property value. Specifies the duration the request is active before it automatically expires if no decision is applied.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRequestDurationInDays() {
        return this.backingStore.get("requestDurationInDays");
    }
    /**
     * Gets the reviewers property value. The list of reviewers for the admin consent. Required.
     * @return a java.util.List<AccessReviewReviewerScope>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getReviewers() {
        return this.backingStore.get("reviewers");
    }
    /**
     * Gets the version property value. Specifies the version of this policy. When the policy is updated, this version is updated. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeBooleanValue("notifyReviewers", this.getNotifyReviewers());
        writer.writeBooleanValue("remindersEnabled", this.getRemindersEnabled());
        writer.writeIntegerValue("requestDurationInDays", this.getRequestDurationInDays());
        writer.writeCollectionOfObjectValues("reviewers", this.getReviewers());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the isEnabled property value. Specifies whether the admin consent request feature is enabled or disabled. Required.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the notifyReviewers property value. Specifies whether reviewers will receive notifications. Required.
     * @param value Value to set for the notifyReviewers property.
     */
    public void setNotifyReviewers(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("notifyReviewers", value);
    }
    /**
     * Sets the remindersEnabled property value. Specifies whether reviewers will receive reminder emails. Required.
     * @param value Value to set for the remindersEnabled property.
     */
    public void setRemindersEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("remindersEnabled", value);
    }
    /**
     * Sets the requestDurationInDays property value. Specifies the duration the request is active before it automatically expires if no decision is applied.
     * @param value Value to set for the requestDurationInDays property.
     */
    public void setRequestDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("requestDurationInDays", value);
    }
    /**
     * Sets the reviewers property value. The list of reviewers for the admin consent. Required.
     * @param value Value to set for the reviewers property.
     */
    public void setReviewers(@jakarta.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this.backingStore.set("reviewers", value);
    }
    /**
     * Sets the version property value. Specifies the version of this policy. When the policy is updated, this version is updated. Read-only.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("version", value);
    }
}
