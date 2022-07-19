package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceHealthIssue extends ServiceAnnouncementBase implements Parsable {
    /** The classification property */
    private ServiceHealthClassificationType _classification;
    /** The feature name of the service issue. */
    private String _feature;
    /** The feature group name of the service issue. */
    private String _featureGroup;
    /** The description of the service issue impact. */
    private String _impactDescription;
    /** Indicates whether the issue is resolved. */
    private Boolean _isResolved;
    /** The origin property */
    private ServiceHealthOrigin _origin;
    /** Collection of historical posts for the service issue. */
    private java.util.List<ServiceHealthIssuePost> _posts;
    /** Indicates the service affected by the issue. */
    private String _service;
    /** The status property */
    private ServiceHealthStatus _status;
    /**
     * Instantiates a new ServiceHealthIssue and sets the default values.
     * @return a void
     */
    public ServiceHealthIssue() {
        super();
        this.setOdataType("#microsoft.graph.serviceHealthIssue");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceHealthIssue
     */
    @javax.annotation.Nonnull
    public static ServiceHealthIssue createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceHealthIssue();
    }
    /**
     * Gets the classification property value. The classification property
     * @return a serviceHealthClassificationType
     */
    @javax.annotation.Nullable
    public ServiceHealthClassificationType getClassification() {
        return this._classification;
    }
    /**
     * Gets the feature property value. The feature name of the service issue.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFeature() {
        return this._feature;
    }
    /**
     * Gets the featureGroup property value. The feature group name of the service issue.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFeatureGroup() {
        return this._featureGroup;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ServiceHealthIssue currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("classification", (n) -> { currentObject.setClassification(n.getEnumValue(ServiceHealthClassificationType.class)); });
            this.put("feature", (n) -> { currentObject.setFeature(n.getStringValue()); });
            this.put("featureGroup", (n) -> { currentObject.setFeatureGroup(n.getStringValue()); });
            this.put("impactDescription", (n) -> { currentObject.setImpactDescription(n.getStringValue()); });
            this.put("isResolved", (n) -> { currentObject.setIsResolved(n.getBooleanValue()); });
            this.put("origin", (n) -> { currentObject.setOrigin(n.getEnumValue(ServiceHealthOrigin.class)); });
            this.put("posts", (n) -> { currentObject.setPosts(n.getCollectionOfObjectValues(ServiceHealthIssuePost::createFromDiscriminatorValue)); });
            this.put("service", (n) -> { currentObject.setService(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ServiceHealthStatus.class)); });
        }};
    }
    /**
     * Gets the impactDescription property value. The description of the service issue impact.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImpactDescription() {
        return this._impactDescription;
    }
    /**
     * Gets the isResolved property value. Indicates whether the issue is resolved.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsResolved() {
        return this._isResolved;
    }
    /**
     * Gets the origin property value. The origin property
     * @return a serviceHealthOrigin
     */
    @javax.annotation.Nullable
    public ServiceHealthOrigin getOrigin() {
        return this._origin;
    }
    /**
     * Gets the posts property value. Collection of historical posts for the service issue.
     * @return a serviceHealthIssuePost
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceHealthIssuePost> getPosts() {
        return this._posts;
    }
    /**
     * Gets the service property value. Indicates the service affected by the issue.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getService() {
        return this._service;
    }
    /**
     * Gets the status property value. The status property
     * @return a serviceHealthStatus
     */
    @javax.annotation.Nullable
    public ServiceHealthStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setClassification(@javax.annotation.Nullable final ServiceHealthClassificationType value) {
        this._classification = value;
    }
    /**
     * Sets the feature property value. The feature name of the service issue.
     * @param value Value to set for the feature property.
     * @return a void
     */
    public void setFeature(@javax.annotation.Nullable final String value) {
        this._feature = value;
    }
    /**
     * Sets the featureGroup property value. The feature group name of the service issue.
     * @param value Value to set for the featureGroup property.
     * @return a void
     */
    public void setFeatureGroup(@javax.annotation.Nullable final String value) {
        this._featureGroup = value;
    }
    /**
     * Sets the impactDescription property value. The description of the service issue impact.
     * @param value Value to set for the impactDescription property.
     * @return a void
     */
    public void setImpactDescription(@javax.annotation.Nullable final String value) {
        this._impactDescription = value;
    }
    /**
     * Sets the isResolved property value. Indicates whether the issue is resolved.
     * @param value Value to set for the isResolved property.
     * @return a void
     */
    public void setIsResolved(@javax.annotation.Nullable final Boolean value) {
        this._isResolved = value;
    }
    /**
     * Sets the origin property value. The origin property
     * @param value Value to set for the origin property.
     * @return a void
     */
    public void setOrigin(@javax.annotation.Nullable final ServiceHealthOrigin value) {
        this._origin = value;
    }
    /**
     * Sets the posts property value. Collection of historical posts for the service issue.
     * @param value Value to set for the posts property.
     * @return a void
     */
    public void setPosts(@javax.annotation.Nullable final java.util.List<ServiceHealthIssuePost> value) {
        this._posts = value;
    }
    /**
     * Sets the service property value. Indicates the service affected by the issue.
     * @param value Value to set for the service property.
     * @return a void
     */
    public void setService(@javax.annotation.Nullable final String value) {
        this._service = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final ServiceHealthStatus value) {
        this._status = value;
    }
}
