package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Synchronization extends Entity implements Parsable {
    /**
     * Performs synchronization by periodically running in the background, polling for changes in one directory, and pushing them to another directory.
     */
    private java.util.List<SynchronizationJob> jobs;
    /**
     * Represents a collection of credentials to access provisioned cloud applications.
     */
    private java.util.List<SynchronizationSecretKeyStringValuePair> secrets;
    /**
     * Pre-configured synchronization settings for a particular application.
     */
    private java.util.List<SynchronizationTemplate> templates;
    /**
     * Instantiates a new synchronization and sets the default values.
     */
    public Synchronization() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronization
     */
    @jakarta.annotation.Nonnull
    public static Synchronization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Synchronization();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("jobs", (n) -> { this.setJobs(n.getCollectionOfObjectValues(SynchronizationJob::createFromDiscriminatorValue)); });
        deserializerMap.put("secrets", (n) -> { this.setSecrets(n.getCollectionOfObjectValues(SynchronizationSecretKeyStringValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("templates", (n) -> { this.setTemplates(n.getCollectionOfObjectValues(SynchronizationTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the jobs property value. Performs synchronization by periodically running in the background, polling for changes in one directory, and pushing them to another directory.
     * @return a synchronizationJob
     */
    @jakarta.annotation.Nullable
    public java.util.List<SynchronizationJob> getJobs() {
        return this.jobs;
    }
    /**
     * Gets the secrets property value. Represents a collection of credentials to access provisioned cloud applications.
     * @return a synchronizationSecretKeyStringValuePair
     */
    @jakarta.annotation.Nullable
    public java.util.List<SynchronizationSecretKeyStringValuePair> getSecrets() {
        return this.secrets;
    }
    /**
     * Gets the templates property value. Pre-configured synchronization settings for a particular application.
     * @return a synchronizationTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<SynchronizationTemplate> getTemplates() {
        return this.templates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("jobs", this.getJobs());
        writer.writeCollectionOfObjectValues("secrets", this.getSecrets());
        writer.writeCollectionOfObjectValues("templates", this.getTemplates());
    }
    /**
     * Sets the jobs property value. Performs synchronization by periodically running in the background, polling for changes in one directory, and pushing them to another directory.
     * @param value Value to set for the jobs property.
     */
    public void setJobs(@jakarta.annotation.Nullable final java.util.List<SynchronizationJob> value) {
        this.jobs = value;
    }
    /**
     * Sets the secrets property value. Represents a collection of credentials to access provisioned cloud applications.
     * @param value Value to set for the secrets property.
     */
    public void setSecrets(@jakarta.annotation.Nullable final java.util.List<SynchronizationSecretKeyStringValuePair> value) {
        this.secrets = value;
    }
    /**
     * Sets the templates property value. Pre-configured synchronization settings for a particular application.
     * @param value Value to set for the templates property.
     */
    public void setTemplates(@jakarta.annotation.Nullable final java.util.List<SynchronizationTemplate> value) {
        this.templates = value;
    }
}
