package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the policyRoot singleton. */
public class AdminConsentRequestPolicy extends Entity implements Parsable {
    /** Specifies whether the admin consent request feature is enabled or disabled. Required. */
    private Boolean _isEnabled;
    /** Specifies whether reviewers will receive notifications. Required. */
    private Boolean _notifyReviewers;
    /** Specifies whether reviewers will receive reminder emails. Required. */
    private Boolean _remindersEnabled;
    /** Specifies the duration the request is active before it automatically expires if no decision is applied. */
    private Integer _requestDurationInDays;
    /** Required. */
    private java.util.List<AccessReviewReviewerScope> _reviewers;
    /** Specifies the version of this policy. When the policy is updated, this version is updated. Read-only. */
    private Integer _version;
    /**
     * Instantiates a new adminConsentRequestPolicy and sets the default values.
     * @return a void
     */
    public AdminConsentRequestPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a adminConsentRequestPolicy
     */
    @javax.annotation.Nonnull
    public static AdminConsentRequestPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminConsentRequestPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AdminConsentRequestPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("notifyReviewers", (n) -> { currentObject.setNotifyReviewers(n.getBooleanValue()); });
            this.put("remindersEnabled", (n) -> { currentObject.setRemindersEnabled(n.getBooleanValue()); });
            this.put("requestDurationInDays", (n) -> { currentObject.setRequestDurationInDays(n.getIntegerValue()); });
            this.put("reviewers", (n) -> { currentObject.setReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the isEnabled property value. Specifies whether the admin consent request feature is enabled or disabled. Required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the notifyReviewers property value. Specifies whether reviewers will receive notifications. Required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNotifyReviewers() {
        return this._notifyReviewers;
    }
    /**
     * Gets the remindersEnabled property value. Specifies whether reviewers will receive reminder emails. Required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRemindersEnabled() {
        return this._remindersEnabled;
    }
    /**
     * Gets the requestDurationInDays property value. Specifies the duration the request is active before it automatically expires if no decision is applied.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRequestDurationInDays() {
        return this._requestDurationInDays;
    }
    /**
     * Gets the reviewers property value. Required.
     * @return a accessReviewReviewerScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getReviewers() {
        return this._reviewers;
    }
    /**
     * Gets the version property value. Specifies the version of this policy. When the policy is updated, this version is updated. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the notifyReviewers property value. Specifies whether reviewers will receive notifications. Required.
     * @param value Value to set for the notifyReviewers property.
     * @return a void
     */
    public void setNotifyReviewers(@javax.annotation.Nullable final Boolean value) {
        this._notifyReviewers = value;
    }
    /**
     * Sets the remindersEnabled property value. Specifies whether reviewers will receive reminder emails. Required.
     * @param value Value to set for the remindersEnabled property.
     * @return a void
     */
    public void setRemindersEnabled(@javax.annotation.Nullable final Boolean value) {
        this._remindersEnabled = value;
    }
    /**
     * Sets the requestDurationInDays property value. Specifies the duration the request is active before it automatically expires if no decision is applied.
     * @param value Value to set for the requestDurationInDays property.
     * @return a void
     */
    public void setRequestDurationInDays(@javax.annotation.Nullable final Integer value) {
        this._requestDurationInDays = value;
    }
    /**
     * Sets the reviewers property value. Required.
     * @param value Value to set for the reviewers property.
     * @return a void
     */
    public void setReviewers(@javax.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this._reviewers = value;
    }
    /**
     * Sets the version property value. Specifies the version of this policy. When the policy is updated, this version is updated. Read-only.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
