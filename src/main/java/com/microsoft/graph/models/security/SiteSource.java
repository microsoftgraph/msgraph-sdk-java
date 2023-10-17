package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Site;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SiteSource extends DataSource implements Parsable {
    /**
     * The site property
     */
    private Site site;
    /**
     * Instantiates a new SiteSource and sets the default values.
     */
    public SiteSource() {
        super();
        this.setOdataType("#microsoft.graph.security.siteSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SiteSource
     */
    @jakarta.annotation.Nonnull
    public static SiteSource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SiteSource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("site", (n) -> { this.setSite(n.getObjectValue(Site::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the site property value. The site property
     * @return a Site
     */
    @jakarta.annotation.Nullable
    public Site getSite() {
        return this.site;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("site", this.getSite());
    }
    /**
     * Sets the site property value. The site property
     * @param value Value to set for the site property.
     */
    public void setSite(@jakarta.annotation.Nullable final Site value) {
        this.site = value;
    }
}
