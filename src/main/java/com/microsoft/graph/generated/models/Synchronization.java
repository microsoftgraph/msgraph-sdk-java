package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Synchronization extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Synchronization} and sets the default values.
     */
    public Synchronization() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Synchronization}
     */
    @jakarta.annotation.Nonnull
    public static Synchronization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Synchronization();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * @return a {@link java.util.List<SynchronizationJob>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SynchronizationJob> getJobs() {
        return this.backingStore.get("jobs");
    }
    /**
     * Gets the secrets property value. Represents a collection of credentials to access provisioned cloud applications.
     * @return a {@link java.util.List<SynchronizationSecretKeyStringValuePair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SynchronizationSecretKeyStringValuePair> getSecrets() {
        return this.backingStore.get("secrets");
    }
    /**
     * Gets the templates property value. Preconfigured synchronization settings for a particular application.
     * @return a {@link java.util.List<SynchronizationTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SynchronizationTemplate> getTemplates() {
        return this.backingStore.get("templates");
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
        this.backingStore.set("jobs", value);
    }
    /**
     * Sets the secrets property value. Represents a collection of credentials to access provisioned cloud applications.
     * @param value Value to set for the secrets property.
     */
    public void setSecrets(@jakarta.annotation.Nullable final java.util.List<SynchronizationSecretKeyStringValuePair> value) {
        this.backingStore.set("secrets", value);
    }
    /**
     * Sets the templates property value. Preconfigured synchronization settings for a particular application.
     * @param value Value to set for the templates property.
     */
    public void setTemplates(@jakarta.annotation.Nullable final java.util.List<SynchronizationTemplate> value) {
        this.backingStore.set("templates", value);
    }
}
