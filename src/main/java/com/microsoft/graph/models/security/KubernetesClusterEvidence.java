package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KubernetesClusterEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new KubernetesClusterEvidence and sets the default values.
     */
    public KubernetesClusterEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesClusterEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KubernetesClusterEvidence
     */
    @jakarta.annotation.Nonnull
    public static KubernetesClusterEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesClusterEvidence();
    }
    /**
     * Gets the cloudResource property value. The cloud identifier of the cluster. Can be either an amazonResourceEvidence, azureResourceEvidence, or googleCloudResourceEvidence object.
     * @return a AlertEvidence
     */
    @jakarta.annotation.Nullable
    public AlertEvidence getCloudResource() {
        return this.backingStore.get("cloudResource");
    }
    /**
     * Gets the distribution property value. The distribution type of the cluster.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDistribution() {
        return this.backingStore.get("distribution");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cloudResource", (n) -> { this.setCloudResource(n.getObjectValue(AlertEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("distribution", (n) -> { this.setDistribution(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(KubernetesPlatform::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The cluster name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the platform property value. The platform the cluster runs on. Possible values are: unknown, aks, eks, gke, arc, unknownFutureValue.
     * @return a KubernetesPlatform
     */
    @jakarta.annotation.Nullable
    public KubernetesPlatform getPlatform() {
        return this.backingStore.get("platform");
    }
    /**
     * Gets the version property value. The kubernetes version of the cluster.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("cloudResource", this.getCloudResource());
        writer.writeStringValue("distribution", this.getDistribution());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the cloudResource property value. The cloud identifier of the cluster. Can be either an amazonResourceEvidence, azureResourceEvidence, or googleCloudResourceEvidence object.
     * @param value Value to set for the cloudResource property.
     */
    public void setCloudResource(@jakarta.annotation.Nullable final AlertEvidence value) {
        this.backingStore.set("cloudResource", value);
    }
    /**
     * Sets the distribution property value. The distribution type of the cluster.
     * @param value Value to set for the distribution property.
     */
    public void setDistribution(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("distribution", value);
    }
    /**
     * Sets the name property value. The cluster name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the platform property value. The platform the cluster runs on. Possible values are: unknown, aks, eks, gke, arc, unknownFutureValue.
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final KubernetesPlatform value) {
        this.backingStore.set("platform", value);
    }
    /**
     * Sets the version property value. The kubernetes version of the cluster.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
