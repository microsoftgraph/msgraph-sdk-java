package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FeatureRolloutPolicy extends Entity implements Parsable {
    /** Nullable. Specifies a list of directoryObjects that feature is enabled for. */
    private java.util.List<DirectoryObject> _appliesTo;
    /** A description for this feature rollout policy. */
    private String _description;
    /** The display name for this  feature rollout policy. */
    private String _displayName;
    /** Possible values are: passthroughAuthentication, seamlessSso, passwordHashSync, emailAsAlternateId, unknownFutureValue. */
    private StagedFeatureName _feature;
    /** Indicates whether this feature rollout policy should be applied to the entire organization. */
    private Boolean _isAppliedToOrganization;
    /** Indicates whether the feature rollout is enabled. */
    private Boolean _isEnabled;
    /**
     * Instantiates a new featureRolloutPolicy and sets the default values.
     * @return a void
     */
    public FeatureRolloutPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a featureRolloutPolicy
     */
    @javax.annotation.Nonnull
    public static FeatureRolloutPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeatureRolloutPolicy();
    }
    /**
     * Gets the appliesTo property value. Nullable. Specifies a list of directoryObjects that feature is enabled for.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getAppliesTo() {
        return this._appliesTo;
    }
    /**
     * Gets the description property value. A description for this feature rollout policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name for this  feature rollout policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the feature property value. Possible values are: passthroughAuthentication, seamlessSso, passwordHashSync, emailAsAlternateId, unknownFutureValue.
     * @return a stagedFeatureName
     */
    @javax.annotation.Nullable
    public StagedFeatureName getFeature() {
        return this._feature;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final FeatureRolloutPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appliesTo", (n) -> { currentObject.setAppliesTo(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("feature", (n) -> { currentObject.setFeature(n.getEnumValue(StagedFeatureName.class)); });
            this.put("isAppliedToOrganization", (n) -> { currentObject.setIsAppliedToOrganization(n.getBooleanValue()); });
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isAppliedToOrganization property value. Indicates whether this feature rollout policy should be applied to the entire organization.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAppliedToOrganization() {
        return this._isAppliedToOrganization;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the feature rollout is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("appliesTo", this.getAppliesTo());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("feature", this.getFeature());
        writer.writeBooleanValue("isAppliedToOrganization", this.getIsAppliedToOrganization());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
    }
    /**
     * Sets the appliesTo property value. Nullable. Specifies a list of directoryObjects that feature is enabled for.
     * @param value Value to set for the appliesTo property.
     * @return a void
     */
    public void setAppliesTo(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._appliesTo = value;
    }
    /**
     * Sets the description property value. A description for this feature rollout policy.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name for this  feature rollout policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the feature property value. Possible values are: passthroughAuthentication, seamlessSso, passwordHashSync, emailAsAlternateId, unknownFutureValue.
     * @param value Value to set for the feature property.
     * @return a void
     */
    public void setFeature(@javax.annotation.Nullable final StagedFeatureName value) {
        this._feature = value;
    }
    /**
     * Sets the isAppliedToOrganization property value. Indicates whether this feature rollout policy should be applied to the entire organization.
     * @param value Value to set for the isAppliedToOrganization property.
     * @return a void
     */
    public void setIsAppliedToOrganization(@javax.annotation.Nullable final Boolean value) {
        this._isAppliedToOrganization = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether the feature rollout is enabled.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
}
