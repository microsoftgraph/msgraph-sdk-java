package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SiteRestoreArtifactsBulkAdditionRequest extends RestoreArtifactsBulkRequestBase implements Parsable {
    /**
     * Instantiates a new {@link SiteRestoreArtifactsBulkAdditionRequest} and sets the default values.
     */
    public SiteRestoreArtifactsBulkAdditionRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SiteRestoreArtifactsBulkAdditionRequest}
     */
    @jakarta.annotation.Nonnull
    public static SiteRestoreArtifactsBulkAdditionRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SiteRestoreArtifactsBulkAdditionRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("siteIds", (n) -> { this.setSiteIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("siteWebUrls", (n) -> { this.setSiteWebUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the siteIds property value. The list of SharePoint site IDs that are added to the corresponding SharePoint restore session in a bulk operation.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSiteIds() {
        return this.backingStore.get("siteIds");
    }
    /**
     * Gets the siteWebUrls property value. The list of SharePoint site URLs that are added to the corresponding SharePoint restore session in a bulk operation.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSiteWebUrls() {
        return this.backingStore.get("siteWebUrls");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("siteIds", this.getSiteIds());
        writer.writeCollectionOfPrimitiveValues("siteWebUrls", this.getSiteWebUrls());
    }
    /**
     * Sets the siteIds property value. The list of SharePoint site IDs that are added to the corresponding SharePoint restore session in a bulk operation.
     * @param value Value to set for the siteIds property.
     */
    public void setSiteIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("siteIds", value);
    }
    /**
     * Sets the siteWebUrls property value. The list of SharePoint site URLs that are added to the corresponding SharePoint restore session in a bulk operation.
     * @param value Value to set for the siteWebUrls property.
     */
    public void setSiteWebUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("siteWebUrls", value);
    }
}
