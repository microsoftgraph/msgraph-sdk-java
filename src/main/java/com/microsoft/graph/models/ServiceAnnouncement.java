package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class ServiceAnnouncement extends Entity implements Parsable {
    /** A collection of service health information for tenant. This property is a contained navigation property, it is nullable and readonly. */
    private java.util.List<ServiceHealth> _healthOverviews;
    /** A collection of service issues for tenant. This property is a contained navigation property, it is nullable and readonly. */
    private java.util.List<ServiceHealthIssue> _issues;
    /** A collection of service messages for tenant. This property is a contained navigation property, it is nullable and readonly. */
    private java.util.List<ServiceUpdateMessage> _messages;
    /**
     * Instantiates a new serviceAnnouncement and sets the default values.
     * @return a void
     */
    public ServiceAnnouncement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serviceAnnouncement
     */
    @javax.annotation.Nonnull
    public static ServiceAnnouncement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceAnnouncement();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ServiceAnnouncement currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("healthOverviews", (n) -> { currentObject.setHealthOverviews(n.getCollectionOfObjectValues(ServiceHealth::createFromDiscriminatorValue)); });
            this.put("issues", (n) -> { currentObject.setIssues(n.getCollectionOfObjectValues(ServiceHealthIssue::createFromDiscriminatorValue)); });
            this.put("messages", (n) -> { currentObject.setMessages(n.getCollectionOfObjectValues(ServiceUpdateMessage::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the healthOverviews property value. A collection of service health information for tenant. This property is a contained navigation property, it is nullable and readonly.
     * @return a serviceHealth
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceHealth> getHealthOverviews() {
        return this._healthOverviews;
    }
    /**
     * Gets the issues property value. A collection of service issues for tenant. This property is a contained navigation property, it is nullable and readonly.
     * @return a serviceHealthIssue
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceHealthIssue> getIssues() {
        return this._issues;
    }
    /**
     * Gets the messages property value. A collection of service messages for tenant. This property is a contained navigation property, it is nullable and readonly.
     * @return a serviceUpdateMessage
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceUpdateMessage> getMessages() {
        return this._messages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("healthOverviews", this.getHealthOverviews());
        writer.writeCollectionOfObjectValues("issues", this.getIssues());
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
    }
    /**
     * Sets the healthOverviews property value. A collection of service health information for tenant. This property is a contained navigation property, it is nullable and readonly.
     * @param value Value to set for the healthOverviews property.
     * @return a void
     */
    public void setHealthOverviews(@javax.annotation.Nullable final java.util.List<ServiceHealth> value) {
        this._healthOverviews = value;
    }
    /**
     * Sets the issues property value. A collection of service issues for tenant. This property is a contained navigation property, it is nullable and readonly.
     * @param value Value to set for the issues property.
     * @return a void
     */
    public void setIssues(@javax.annotation.Nullable final java.util.List<ServiceHealthIssue> value) {
        this._issues = value;
    }
    /**
     * Sets the messages property value. A collection of service messages for tenant. This property is a contained navigation property, it is nullable and readonly.
     * @param value Value to set for the messages property.
     * @return a void
     */
    public void setMessages(@javax.annotation.Nullable final java.util.List<ServiceUpdateMessage> value) {
        this._messages = value;
    }
}
