package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuditLogRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AuditLogRoot} and sets the default values.
     */
    public AuditLogRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuditLogRoot}
     */
    @jakarta.annotation.Nonnull
    public static AuditLogRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditLogRoot();
    }
    /**
     * Gets the directoryAudits property value. The directoryAudits property
     * @return a {@link java.util.List<DirectoryAudit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryAudit> getDirectoryAudits() {
        return this.backingStore.get("directoryAudits");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("directoryAudits", (n) -> { this.setDirectoryAudits(n.getCollectionOfObjectValues(DirectoryAudit::createFromDiscriminatorValue)); });
        deserializerMap.put("provisioning", (n) -> { this.setProvisioning(n.getCollectionOfObjectValues(ProvisioningObjectSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("signIns", (n) -> { this.setSignIns(n.getCollectionOfObjectValues(SignIn::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the provisioning property value. The provisioning property
     * @return a {@link java.util.List<ProvisioningObjectSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProvisioningObjectSummary> getProvisioning() {
        return this.backingStore.get("provisioning");
    }
    /**
     * Gets the signIns property value. The signIns property
     * @return a {@link java.util.List<SignIn>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SignIn> getSignIns() {
        return this.backingStore.get("signIns");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("directoryAudits", this.getDirectoryAudits());
        writer.writeCollectionOfObjectValues("provisioning", this.getProvisioning());
        writer.writeCollectionOfObjectValues("signIns", this.getSignIns());
    }
    /**
     * Sets the directoryAudits property value. The directoryAudits property
     * @param value Value to set for the directoryAudits property.
     */
    public void setDirectoryAudits(@jakarta.annotation.Nullable final java.util.List<DirectoryAudit> value) {
        this.backingStore.set("directoryAudits", value);
    }
    /**
     * Sets the provisioning property value. The provisioning property
     * @param value Value to set for the provisioning property.
     */
    public void setProvisioning(@jakarta.annotation.Nullable final java.util.List<ProvisioningObjectSummary> value) {
        this.backingStore.set("provisioning", value);
    }
    /**
     * Sets the signIns property value. The signIns property
     * @param value Value to set for the signIns property.
     */
    public void setSignIns(@jakarta.annotation.Nullable final java.util.List<SignIn> value) {
        this.backingStore.set("signIns", value);
    }
}
