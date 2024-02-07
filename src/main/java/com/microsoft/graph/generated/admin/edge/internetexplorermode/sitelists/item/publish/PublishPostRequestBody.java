package com.microsoft.graph.admin.edge.internetexplorermode.sitelists.item.publish;

import com.microsoft.graph.models.BrowserSharedCookie;
import com.microsoft.graph.models.BrowserSite;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PublishPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new PublishPostRequestBody and sets the default values.
     */
    public PublishPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PublishPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static PublishPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PublishPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("revision", (n) -> { this.setRevision(n.getStringValue()); });
        deserializerMap.put("sharedCookies", (n) -> { this.setSharedCookies(n.getCollectionOfObjectValues(BrowserSharedCookie::createFromDiscriminatorValue)); });
        deserializerMap.put("sites", (n) -> { this.setSites(n.getCollectionOfObjectValues(BrowserSite::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the revision property value. The revision property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRevision() {
        return this.backingStore.get("revision");
    }
    /**
     * Gets the sharedCookies property value. The sharedCookies property
     * @return a java.util.List<BrowserSharedCookie>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BrowserSharedCookie> getSharedCookies() {
        return this.backingStore.get("sharedCookies");
    }
    /**
     * Gets the sites property value. The sites property
     * @return a java.util.List<BrowserSite>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BrowserSite> getSites() {
        return this.backingStore.get("sites");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("revision", this.getRevision());
        writer.writeCollectionOfObjectValues("sharedCookies", this.getSharedCookies());
        writer.writeCollectionOfObjectValues("sites", this.getSites());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the revision property value. The revision property
     * @param value Value to set for the revision property.
     */
    public void setRevision(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("revision", value);
    }
    /**
     * Sets the sharedCookies property value. The sharedCookies property
     * @param value Value to set for the sharedCookies property.
     */
    public void setSharedCookies(@jakarta.annotation.Nullable final java.util.List<BrowserSharedCookie> value) {
        this.backingStore.set("sharedCookies", value);
    }
    /**
     * Sets the sites property value. The sites property
     * @param value Value to set for the sites property.
     */
    public void setSites(@jakarta.annotation.Nullable final java.util.List<BrowserSite> value) {
        this.backingStore.set("sites", value);
    }
}
