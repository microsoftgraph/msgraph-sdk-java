package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceHealthIssue extends ServiceAnnouncementBase implements Parsable {
    /**
     * Instantiates a new {@link ServiceHealthIssue} and sets the default values.
     */
    public ServiceHealthIssue() {
        super();
        this.setOdataType("#microsoft.graph.serviceHealthIssue");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServiceHealthIssue}
     */
    @jakarta.annotation.Nonnull
    public static ServiceHealthIssue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceHealthIssue();
    }
    /**
     * Gets the classification property value. The classification property
     * @return a {@link ServiceHealthClassificationType}
     */
    @jakarta.annotation.Nullable
    public ServiceHealthClassificationType getClassification() {
        return this.backingStore.get("classification");
    }
    /**
     * Gets the feature property value. The feature name of the service issue.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeature() {
        return this.backingStore.get("feature");
    }
    /**
     * Gets the featureGroup property value. The feature group name of the service issue.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFeatureGroup() {
        return this.backingStore.get("featureGroup");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getEnumValue(ServiceHealthClassificationType::forValue)); });
        deserializerMap.put("feature", (n) -> { this.setFeature(n.getStringValue()); });
        deserializerMap.put("featureGroup", (n) -> { this.setFeatureGroup(n.getStringValue()); });
        deserializerMap.put("impactDescription", (n) -> { this.setImpactDescription(n.getStringValue()); });
        deserializerMap.put("isResolved", (n) -> { this.setIsResolved(n.getBooleanValue()); });
        deserializerMap.put("origin", (n) -> { this.setOrigin(n.getEnumValue(ServiceHealthOrigin::forValue)); });
        deserializerMap.put("posts", (n) -> { this.setPosts(n.getCollectionOfObjectValues(ServiceHealthIssuePost::createFromDiscriminatorValue)); });
        deserializerMap.put("service", (n) -> { this.setService(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ServiceHealthStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the impactDescription property value. The description of the service issue impact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImpactDescription() {
        return this.backingStore.get("impactDescription");
    }
    /**
     * Gets the isResolved property value. Indicates whether the issue is resolved.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsResolved() {
        return this.backingStore.get("isResolved");
    }
    /**
     * Gets the origin property value. The origin property
     * @return a {@link ServiceHealthOrigin}
     */
    @jakarta.annotation.Nullable
    public ServiceHealthOrigin getOrigin() {
        return this.backingStore.get("origin");
    }
    /**
     * Gets the posts property value. Collection of historical posts for the service issue.
     * @return a {@link java.util.List<ServiceHealthIssuePost>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceHealthIssuePost> getPosts() {
        return this.backingStore.get("posts");
    }
    /**
     * Gets the service property value. Indicates the service affected by the issue.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getService() {
        return this.backingStore.get("service");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link ServiceHealthStatus}
     */
    @jakarta.annotation.Nullable
    public ServiceHealthStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeStringValue("feature", this.getFeature());
        writer.writeStringValue("featureGroup", this.getFeatureGroup());
        writer.writeStringValue("impactDescription", this.getImpactDescription());
        writer.writeBooleanValue("isResolved", this.getIsResolved());
        writer.writeEnumValue("origin", this.getOrigin());
        writer.writeCollectionOfObjectValues("posts", this.getPosts());
        writer.writeStringValue("service", this.getService());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the classification property value. The classification property
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final ServiceHealthClassificationType value) {
        this.backingStore.set("classification", value);
    }
    /**
     * Sets the feature property value. The feature name of the service issue.
     * @param value Value to set for the feature property.
     */
    public void setFeature(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("feature", value);
    }
    /**
     * Sets the featureGroup property value. The feature group name of the service issue.
     * @param value Value to set for the featureGroup property.
     */
    public void setFeatureGroup(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("featureGroup", value);
    }
    /**
     * Sets the impactDescription property value. The description of the service issue impact.
     * @param value Value to set for the impactDescription property.
     */
    public void setImpactDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("impactDescription", value);
    }
    /**
     * Sets the isResolved property value. Indicates whether the issue is resolved.
     * @param value Value to set for the isResolved property.
     */
    public void setIsResolved(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isResolved", value);
    }
    /**
     * Sets the origin property value. The origin property
     * @param value Value to set for the origin property.
     */
    public void setOrigin(@jakarta.annotation.Nullable final ServiceHealthOrigin value) {
        this.backingStore.set("origin", value);
    }
    /**
     * Sets the posts property value. Collection of historical posts for the service issue.
     * @param value Value to set for the posts property.
     */
    public void setPosts(@jakarta.annotation.Nullable final java.util.List<ServiceHealthIssuePost> value) {
        this.backingStore.set("posts", value);
    }
    /**
     * Sets the service property value. Indicates the service affected by the issue.
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("service", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ServiceHealthStatus value) {
        this.backingStore.set("status", value);
    }
}
