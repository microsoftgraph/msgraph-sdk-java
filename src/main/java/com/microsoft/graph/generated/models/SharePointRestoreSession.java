package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointRestoreSession extends RestoreSessionBase implements Parsable {
    /**
     * Instantiates a new {@link SharePointRestoreSession} and sets the default values.
     */
    public SharePointRestoreSession() {
        super();
        this.setOdataType("#microsoft.graph.sharePointRestoreSession");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointRestoreSession}
     */
    @jakarta.annotation.Nonnull
    public static SharePointRestoreSession createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointRestoreSession();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("siteRestoreArtifacts", (n) -> { this.setSiteRestoreArtifacts(n.getCollectionOfObjectValues(SiteRestoreArtifact::createFromDiscriminatorValue)); });
        deserializerMap.put("siteRestoreArtifactsBulkAdditionRequests", (n) -> { this.setSiteRestoreArtifactsBulkAdditionRequests(n.getCollectionOfObjectValues(SiteRestoreArtifactsBulkAdditionRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the siteRestoreArtifacts property value. A collection of restore points and destination details that can be used to restore SharePoint sites.
     * @return a {@link java.util.List<SiteRestoreArtifact>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteRestoreArtifact> getSiteRestoreArtifacts() {
        return this.backingStore.get("siteRestoreArtifacts");
    }
    /**
     * Gets the siteRestoreArtifactsBulkAdditionRequests property value. The siteRestoreArtifactsBulkAdditionRequests property
     * @return a {@link java.util.List<SiteRestoreArtifactsBulkAdditionRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteRestoreArtifactsBulkAdditionRequest> getSiteRestoreArtifactsBulkAdditionRequests() {
        return this.backingStore.get("siteRestoreArtifactsBulkAdditionRequests");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("siteRestoreArtifacts", this.getSiteRestoreArtifacts());
        writer.writeCollectionOfObjectValues("siteRestoreArtifactsBulkAdditionRequests", this.getSiteRestoreArtifactsBulkAdditionRequests());
    }
    /**
     * Sets the siteRestoreArtifacts property value. A collection of restore points and destination details that can be used to restore SharePoint sites.
     * @param value Value to set for the siteRestoreArtifacts property.
     */
    public void setSiteRestoreArtifacts(@jakarta.annotation.Nullable final java.util.List<SiteRestoreArtifact> value) {
        this.backingStore.set("siteRestoreArtifacts", value);
    }
    /**
     * Sets the siteRestoreArtifactsBulkAdditionRequests property value. The siteRestoreArtifactsBulkAdditionRequests property
     * @param value Value to set for the siteRestoreArtifactsBulkAdditionRequests property.
     */
    public void setSiteRestoreArtifactsBulkAdditionRequests(@jakarta.annotation.Nullable final java.util.List<SiteRestoreArtifactsBulkAdditionRequest> value) {
        this.backingStore.set("siteRestoreArtifactsBulkAdditionRequests", value);
    }
}
