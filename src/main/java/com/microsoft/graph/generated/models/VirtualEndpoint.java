package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEndpoint extends Entity implements Parsable {
    /**
     * Instantiates a new {@link VirtualEndpoint} and sets the default values.
     */
    public VirtualEndpoint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEndpoint}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEndpoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEndpoint();
    }
    /**
     * Gets the auditEvents property value. A collection of Cloud PC audit events.
     * @return a {@link java.util.List<CloudPcAuditEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcAuditEvent> getAuditEvents() {
        return this.backingStore.get("auditEvents");
    }
    /**
     * Gets the cloudPCs property value. A collection of cloud-managed virtual desktops.
     * @return a {@link java.util.List<CloudPC>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPC> getCloudPCs() {
        return this.backingStore.get("cloudPCs");
    }
    /**
     * Gets the deviceImages property value. A collection of device image resources on Cloud PC.
     * @return a {@link java.util.List<CloudPcDeviceImage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcDeviceImage> getDeviceImages() {
        return this.backingStore.get("deviceImages");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("auditEvents", (n) -> { this.setAuditEvents(n.getCollectionOfObjectValues(CloudPcAuditEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPCs", (n) -> { this.setCloudPCs(n.getCollectionOfObjectValues(CloudPC::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceImages", (n) -> { this.setDeviceImages(n.getCollectionOfObjectValues(CloudPcDeviceImage::createFromDiscriminatorValue)); });
        deserializerMap.put("galleryImages", (n) -> { this.setGalleryImages(n.getCollectionOfObjectValues(CloudPcGalleryImage::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesConnections", (n) -> { this.setOnPremisesConnections(n.getCollectionOfObjectValues(CloudPcOnPremisesConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("provisioningPolicies", (n) -> { this.setProvisioningPolicies(n.getCollectionOfObjectValues(CloudPcProvisioningPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("userSettings", (n) -> { this.setUserSettings(n.getCollectionOfObjectValues(CloudPcUserSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the galleryImages property value. A collection of gallery image resources on Cloud PC.
     * @return a {@link java.util.List<CloudPcGalleryImage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcGalleryImage> getGalleryImages() {
        return this.backingStore.get("galleryImages");
    }
    /**
     * Gets the onPremisesConnections property value. A defined collection of Azure resource information that can be used to establish Azure network connections for Cloud PCs.
     * @return a {@link java.util.List<CloudPcOnPremisesConnection>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcOnPremisesConnection> getOnPremisesConnections() {
        return this.backingStore.get("onPremisesConnections");
    }
    /**
     * Gets the provisioningPolicies property value. A collection of Cloud PC provisioning policies.
     * @return a {@link java.util.List<CloudPcProvisioningPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcProvisioningPolicy> getProvisioningPolicies() {
        return this.backingStore.get("provisioningPolicies");
    }
    /**
     * Gets the userSettings property value. A collection of Cloud PC user settings.
     * @return a {@link java.util.List<CloudPcUserSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcUserSetting> getUserSettings() {
        return this.backingStore.get("userSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("auditEvents", this.getAuditEvents());
        writer.writeCollectionOfObjectValues("cloudPCs", this.getCloudPCs());
        writer.writeCollectionOfObjectValues("deviceImages", this.getDeviceImages());
        writer.writeCollectionOfObjectValues("galleryImages", this.getGalleryImages());
        writer.writeCollectionOfObjectValues("onPremisesConnections", this.getOnPremisesConnections());
        writer.writeCollectionOfObjectValues("provisioningPolicies", this.getProvisioningPolicies());
        writer.writeCollectionOfObjectValues("userSettings", this.getUserSettings());
    }
    /**
     * Sets the auditEvents property value. A collection of Cloud PC audit events.
     * @param value Value to set for the auditEvents property.
     */
    public void setAuditEvents(@jakarta.annotation.Nullable final java.util.List<CloudPcAuditEvent> value) {
        this.backingStore.set("auditEvents", value);
    }
    /**
     * Sets the cloudPCs property value. A collection of cloud-managed virtual desktops.
     * @param value Value to set for the cloudPCs property.
     */
    public void setCloudPCs(@jakarta.annotation.Nullable final java.util.List<CloudPC> value) {
        this.backingStore.set("cloudPCs", value);
    }
    /**
     * Sets the deviceImages property value. A collection of device image resources on Cloud PC.
     * @param value Value to set for the deviceImages property.
     */
    public void setDeviceImages(@jakarta.annotation.Nullable final java.util.List<CloudPcDeviceImage> value) {
        this.backingStore.set("deviceImages", value);
    }
    /**
     * Sets the galleryImages property value. A collection of gallery image resources on Cloud PC.
     * @param value Value to set for the galleryImages property.
     */
    public void setGalleryImages(@jakarta.annotation.Nullable final java.util.List<CloudPcGalleryImage> value) {
        this.backingStore.set("galleryImages", value);
    }
    /**
     * Sets the onPremisesConnections property value. A defined collection of Azure resource information that can be used to establish Azure network connections for Cloud PCs.
     * @param value Value to set for the onPremisesConnections property.
     */
    public void setOnPremisesConnections(@jakarta.annotation.Nullable final java.util.List<CloudPcOnPremisesConnection> value) {
        this.backingStore.set("onPremisesConnections", value);
    }
    /**
     * Sets the provisioningPolicies property value. A collection of Cloud PC provisioning policies.
     * @param value Value to set for the provisioningPolicies property.
     */
    public void setProvisioningPolicies(@jakarta.annotation.Nullable final java.util.List<CloudPcProvisioningPolicy> value) {
        this.backingStore.set("provisioningPolicies", value);
    }
    /**
     * Sets the userSettings property value. A collection of Cloud PC user settings.
     * @param value Value to set for the userSettings property.
     */
    public void setUserSettings(@jakarta.annotation.Nullable final java.util.List<CloudPcUserSetting> value) {
        this.backingStore.set("userSettings", value);
    }
}
