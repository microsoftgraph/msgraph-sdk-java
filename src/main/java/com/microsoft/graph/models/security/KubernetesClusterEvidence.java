package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KubernetesClusterEvidence extends AlertEvidence implements Parsable {
    /**
     * The cloudResource property
     */
    private AlertEvidence cloudResource;
    /**
     * The distribution property
     */
    private String distribution;
    /**
     * The name property
     */
    private String name;
    /**
     * The platform property
     */
    private KubernetesPlatform platform;
    /**
     * The version property
     */
    private String version;
    /**
     * Instantiates a new kubernetesClusterEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public KubernetesClusterEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesClusterEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a kubernetesClusterEvidence
     */
    @javax.annotation.Nonnull
    public static KubernetesClusterEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesClusterEvidence();
    }
    /**
     * Gets the cloudResource property value. The cloudResource property
     * @return a alertEvidence
     */
    @javax.annotation.Nullable
    public AlertEvidence getCloudResource() {
        return this.cloudResource;
    }
    /**
     * Gets the distribution property value. The distribution property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDistribution() {
        return this.distribution;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cloudResource", (n) -> { this.setCloudResource(n.getObjectValue(AlertEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("distribution", (n) -> { this.setDistribution(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(KubernetesPlatform.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a kubernetesPlatform
     */
    @javax.annotation.Nullable
    public KubernetesPlatform getPlatform() {
        return this.platform;
    }
    /**
     * Gets the version property value. The version property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeObjectValue("cloudResource", this.getCloudResource());
        writer.writeStringValue("distribution", this.getDistribution());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the cloudResource property value. The cloudResource property
     * @param value Value to set for the cloudResource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudResource(@javax.annotation.Nullable final AlertEvidence value) {
        this.cloudResource = value;
    }
    /**
     * Sets the distribution property value. The distribution property
     * @param value Value to set for the distribution property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDistribution(@javax.annotation.Nullable final String value) {
        this.distribution = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final KubernetesPlatform value) {
        this.platform = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
