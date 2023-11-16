package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BrowserSharedCookieHistory implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new BrowserSharedCookieHistory and sets the default values.
     */
    public BrowserSharedCookieHistory() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BrowserSharedCookieHistory
     */
    @jakarta.annotation.Nonnull
    public static BrowserSharedCookieHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSharedCookieHistory();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the comment property value. The comment for the shared cookie.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.BackingStore.get("comment");
    }
    /**
     * Gets the displayName property value. The name of the cookie.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("hostOnly", (n) -> { this.setHostOnly(n.getBooleanValue()); });
        deserializerMap.put("hostOrDomain", (n) -> { this.setHostOrDomain(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("publishedDateTime", (n) -> { this.setPublishedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sourceEnvironment", (n) -> { this.setSourceEnvironment(n.getEnumValue(BrowserSharedCookieSourceEnvironment.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hostOnly property value. Controls whether a cookie is a host-only or domain cookie.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHostOnly() {
        return this.BackingStore.get("hostOnly");
    }
    /**
     * Gets the hostOrDomain property value. The URL of the cookie.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHostOrDomain() {
        return this.BackingStore.get("hostOrDomain");
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.BackingStore.get("lastModifiedBy");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the path property value. The path of the cookie.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.BackingStore.get("path");
    }
    /**
     * Gets the publishedDateTime property value. The date and time when the cookie was last published.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this.BackingStore.get("publishedDateTime");
    }
    /**
     * Gets the sourceEnvironment property value. Specifies how the cookies are shared between Microsoft Edge and Internet Explorer. The possible values are: microsoftEdge, internetExplorer11, both, unknownFutureValue.
     * @return a BrowserSharedCookieSourceEnvironment
     */
    @jakarta.annotation.Nullable
    public BrowserSharedCookieSourceEnvironment getSourceEnvironment() {
        return this.BackingStore.get("sourceEnvironment");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("comment", this.getComment());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("hostOnly", this.getHostOnly());
        writer.writeStringValue("hostOrDomain", this.getHostOrDomain());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("path", this.getPath());
        writer.writeOffsetDateTimeValue("publishedDateTime", this.getPublishedDateTime());
        writer.writeEnumValue("sourceEnvironment", this.getSourceEnvironment());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the comment property value. The comment for the shared cookie.
     * @param value Value to set for the comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("comment", value);
    }
    /**
     * Sets the displayName property value. The name of the cookie.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the hostOnly property value. Controls whether a cookie is a host-only or domain cookie.
     * @param value Value to set for the hostOnly property.
     */
    public void setHostOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hostOnly", value);
    }
    /**
     * Sets the hostOrDomain property value. The URL of the cookie.
     * @param value Value to set for the hostOrDomain property.
     */
    public void setHostOrDomain(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("hostOrDomain", value);
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.BackingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the path property value. The path of the cookie.
     * @param value Value to set for the path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("path", value);
    }
    /**
     * Sets the publishedDateTime property value. The date and time when the cookie was last published.
     * @param value Value to set for the publishedDateTime property.
     */
    public void setPublishedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("publishedDateTime", value);
    }
    /**
     * Sets the sourceEnvironment property value. Specifies how the cookies are shared between Microsoft Edge and Internet Explorer. The possible values are: microsoftEdge, internetExplorer11, both, unknownFutureValue.
     * @param value Value to set for the sourceEnvironment property.
     */
    public void setSourceEnvironment(@jakarta.annotation.Nullable final BrowserSharedCookieSourceEnvironment value) {
        this.BackingStore.set("sourceEnvironment", value);
    }
}
