package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SiteProtectionUnit extends ProtectionUnitBase implements Parsable {
    /**
     * Instantiates a new {@link SiteProtectionUnit} and sets the default values.
     */
    public SiteProtectionUnit() {
        super();
        this.setOdataType("#microsoft.graph.siteProtectionUnit");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SiteProtectionUnit}
     */
    @jakarta.annotation.Nonnull
    public static SiteProtectionUnit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SiteProtectionUnit();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("siteId", (n) -> { this.setSiteId(n.getStringValue()); });
        deserializerMap.put("siteName", (n) -> { this.setSiteName(n.getStringValue()); });
        deserializerMap.put("siteWebUrl", (n) -> { this.setSiteWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the siteId property value. Unique identifier of the SharePoint site.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSiteId() {
        return this.backingStore.get("siteId");
    }
    /**
     * Gets the siteName property value. Name of the SharePoint site.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSiteName() {
        return this.backingStore.get("siteName");
    }
    /**
     * Gets the siteWebUrl property value. The web URL of the SharePoint site.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSiteWebUrl() {
        return this.backingStore.get("siteWebUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("siteId", this.getSiteId());
    }
    /**
     * Sets the siteId property value. Unique identifier of the SharePoint site.
     * @param value Value to set for the siteId property.
     */
    public void setSiteId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteId", value);
    }
    /**
     * Sets the siteName property value. Name of the SharePoint site.
     * @param value Value to set for the siteName property.
     */
    public void setSiteName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteName", value);
    }
    /**
     * Sets the siteWebUrl property value. The web URL of the SharePoint site.
     * @param value Value to set for the siteWebUrl property.
     */
    public void setSiteWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteWebUrl", value);
    }
}
