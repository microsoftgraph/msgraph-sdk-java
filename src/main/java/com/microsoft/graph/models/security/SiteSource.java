package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Site;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SiteSource extends DataSource implements Parsable {
    /** The site property */
    private Site _site;
    /**
     * Instantiates a new SiteSource and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static SiteSource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SiteSource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SiteSource currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("site", (n) -> { currentObject.setSite(n.getObjectValue(Site::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the site property value. The site property
     * @return a site
     */
    @javax.annotation.Nullable
    public Site getSite() {
        return this._site;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("site", this.getSite());
    }
    /**
     * Sets the site property value. The site property
     * @param value Value to set for the site property.
     * @return a void
     */
    public void setSite(@javax.annotation.Nullable final Site value) {
        this._site = value;
    }
}
