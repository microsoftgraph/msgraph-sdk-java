package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceAnnouncement extends Entity implements Parsable {
    /**
     * A collection of service health information for tenant. This property is a contained navigation property, it is nullable and readonly.
     */
    private java.util.List<ServiceHealth> healthOverviews;
    /**
     * A collection of service issues for tenant. This property is a contained navigation property, it is nullable and readonly.
     */
    private java.util.List<ServiceHealthIssue> issues;
    /**
     * A collection of service messages for tenant. This property is a contained navigation property, it is nullable and readonly.
     */
    private java.util.List<ServiceUpdateMessage> messages;
    /**
     * Instantiates a new ServiceAnnouncement and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceAnnouncement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceAnnouncement
     */
    @javax.annotation.Nonnull
    public static ServiceAnnouncement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceAnnouncement();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("healthOverviews", (n) -> { this.setHealthOverviews(n.getCollectionOfObjectValues(ServiceHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("issues", (n) -> { this.setIssues(n.getCollectionOfObjectValues(ServiceHealthIssue::createFromDiscriminatorValue)); });
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(ServiceUpdateMessage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the healthOverviews property value. A collection of service health information for tenant. This property is a contained navigation property, it is nullable and readonly.
     * @return a serviceHealth
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceHealth> getHealthOverviews() {
        return this.healthOverviews;
    }
    /**
     * Gets the issues property value. A collection of service issues for tenant. This property is a contained navigation property, it is nullable and readonly.
     * @return a serviceHealthIssue
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceHealthIssue> getIssues() {
        return this.issues;
    }
    /**
     * Gets the messages property value. A collection of service messages for tenant. This property is a contained navigation property, it is nullable and readonly.
     * @return a serviceUpdateMessage
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceUpdateMessage> getMessages() {
        return this.messages;
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
        writer.writeCollectionOfObjectValues("healthOverviews", this.getHealthOverviews());
        writer.writeCollectionOfObjectValues("issues", this.getIssues());
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
    }
    /**
     * Sets the healthOverviews property value. A collection of service health information for tenant. This property is a contained navigation property, it is nullable and readonly.
     * @param value Value to set for the healthOverviews property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthOverviews(@javax.annotation.Nullable final java.util.List<ServiceHealth> value) {
        this.healthOverviews = value;
    }
    /**
     * Sets the issues property value. A collection of service issues for tenant. This property is a contained navigation property, it is nullable and readonly.
     * @param value Value to set for the issues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssues(@javax.annotation.Nullable final java.util.List<ServiceHealthIssue> value) {
        this.issues = value;
    }
    /**
     * Sets the messages property value. A collection of service messages for tenant. This property is a contained navigation property, it is nullable and readonly.
     * @param value Value to set for the messages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessages(@javax.annotation.Nullable final java.util.List<ServiceUpdateMessage> value) {
        this.messages = value;
    }
}
