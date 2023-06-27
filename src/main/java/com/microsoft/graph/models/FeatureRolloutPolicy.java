package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FeatureRolloutPolicy extends Entity implements Parsable {
    /**
     * Nullable. Specifies a list of directoryObjects that feature is enabled for.
     */
    private java.util.List<DirectoryObject> appliesTo;
    /**
     * A description for this feature rollout policy.
     */
    private String description;
    /**
     * The display name for this  feature rollout policy.
     */
    private String displayName;
    /**
     * The feature property
     */
    private StagedFeatureName feature;
    /**
     * Indicates whether this feature rollout policy should be applied to the entire organization.
     */
    private Boolean isAppliedToOrganization;
    /**
     * Indicates whether the feature rollout is enabled.
     */
    private Boolean isEnabled;
    /**
     * Instantiates a new featureRolloutPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.appliesTo;
    }
    /**
     * Gets the description property value. A description for this feature rollout policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name for this  feature rollout policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the feature property value. The feature property
     * @return a StagedFeatureName
     */
    @javax.annotation.Nullable
    public StagedFeatureName getFeature() {
        return this.feature;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appliesTo", (n) -> { this.setAppliesTo(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("feature", (n) -> { this.setFeature(n.getEnumValue(StagedFeatureName.class)); });
        deserializerMap.put("isAppliedToOrganization", (n) -> { this.setIsAppliedToOrganization(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAppliedToOrganization property value. Indicates whether this feature rollout policy should be applied to the entire organization.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAppliedToOrganization() {
        return this.isAppliedToOrganization;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the feature rollout is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
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
    @javax.annotation.Nonnull
    public void setAppliesTo(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.appliesTo = value;
    }
    /**
     * Sets the description property value. A description for this feature rollout policy.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name for this  feature rollout policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the feature property value. The feature property
     * @param value Value to set for the feature property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeature(@javax.annotation.Nullable final StagedFeatureName value) {
        this.feature = value;
    }
    /**
     * Sets the isAppliedToOrganization property value. Indicates whether this feature rollout policy should be applied to the entire organization.
     * @param value Value to set for the isAppliedToOrganization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAppliedToOrganization(@javax.annotation.Nullable final Boolean value) {
        this.isAppliedToOrganization = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether the feature rollout is enabled.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
}
