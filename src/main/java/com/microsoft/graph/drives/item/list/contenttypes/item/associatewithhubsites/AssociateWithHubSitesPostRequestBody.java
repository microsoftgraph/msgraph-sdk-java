package com.microsoft.graph.drives.item.list.contenttypes.item.associatewithhubsites;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AssociateWithHubSitesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The hubSiteUrls property
     */
    private java.util.List<String> hubSiteUrls;
    /**
     * The propagateToExistingLists property
     */
    private Boolean propagateToExistingLists;
    /**
     * Instantiates a new associateWithHubSitesPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AssociateWithHubSitesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a associateWithHubSitesPostRequestBody
     */
    @javax.annotation.Nonnull
    public static AssociateWithHubSitesPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssociateWithHubSitesPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("hubSiteUrls", (n) -> { this.setHubSiteUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("propagateToExistingLists", (n) -> { this.setPropagateToExistingLists(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hubSiteUrls property value. The hubSiteUrls property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getHubSiteUrls() {
        return this.hubSiteUrls;
    }
    /**
     * Gets the propagateToExistingLists property value. The propagateToExistingLists property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPropagateToExistingLists() {
        return this.propagateToExistingLists;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("hubSiteUrls", this.getHubSiteUrls());
        writer.writeBooleanValue("propagateToExistingLists", this.getPropagateToExistingLists());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the hubSiteUrls property value. The hubSiteUrls property
     * @param value Value to set for the hubSiteUrls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHubSiteUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this.hubSiteUrls = value;
    }
    /**
     * Sets the propagateToExistingLists property value. The propagateToExistingLists property
     * @param value Value to set for the propagateToExistingLists property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPropagateToExistingLists(@javax.annotation.Nullable final Boolean value) {
        this.propagateToExistingLists = value;
    }
}
