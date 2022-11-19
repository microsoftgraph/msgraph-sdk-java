package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfficeGraphInsights extends Entity implements Parsable {
    /** Calculated relationship identifying documents shared with or by the user. This includes URLs, file attachments, and reference attachments to OneDrive for Business and SharePoint files found in Outlook messages and meetings. This also includes URLs and reference attachments to Teams conversations. Ordered by recency of share. */
    private java.util.List<SharedInsight> _shared;
    /** Calculated relationship identifying documents trending around a user. Trending documents are calculated based on activity of the user's closest network of people and include files stored in OneDrive for Business and SharePoint. Trending insights help the user to discover potentially useful content that the user has access to, but has never viewed before. */
    private java.util.List<Trending> _trending;
    /** Calculated relationship identifying the latest documents viewed or modified by a user, including OneDrive for Business and SharePoint documents, ranked by recency of use. */
    private java.util.List<UsedInsight> _used;
    /**
     * Instantiates a new officeGraphInsights and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OfficeGraphInsights() {
        super();
        this.setOdataType("#microsoft.graph.officeGraphInsights");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a officeGraphInsights
     */
    @javax.annotation.Nonnull
    public static OfficeGraphInsights createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfficeGraphInsights();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OfficeGraphInsights currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("shared", (n) -> { currentObject.setShared(n.getCollectionOfObjectValues(SharedInsight::createFromDiscriminatorValue)); });
        deserializerMap.put("trending", (n) -> { currentObject.setTrending(n.getCollectionOfObjectValues(Trending::createFromDiscriminatorValue)); });
        deserializerMap.put("used", (n) -> { currentObject.setUsed(n.getCollectionOfObjectValues(UsedInsight::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the shared property value. Calculated relationship identifying documents shared with or by the user. This includes URLs, file attachments, and reference attachments to OneDrive for Business and SharePoint files found in Outlook messages and meetings. This also includes URLs and reference attachments to Teams conversations. Ordered by recency of share.
     * @return a sharedInsight
     */
    @javax.annotation.Nullable
    public java.util.List<SharedInsight> getShared() {
        return this._shared;
    }
    /**
     * Gets the trending property value. Calculated relationship identifying documents trending around a user. Trending documents are calculated based on activity of the user's closest network of people and include files stored in OneDrive for Business and SharePoint. Trending insights help the user to discover potentially useful content that the user has access to, but has never viewed before.
     * @return a trending
     */
    @javax.annotation.Nullable
    public java.util.List<Trending> getTrending() {
        return this._trending;
    }
    /**
     * Gets the used property value. Calculated relationship identifying the latest documents viewed or modified by a user, including OneDrive for Business and SharePoint documents, ranked by recency of use.
     * @return a usedInsight
     */
    @javax.annotation.Nullable
    public java.util.List<UsedInsight> getUsed() {
        return this._used;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("shared", this.getShared());
        writer.writeCollectionOfObjectValues("trending", this.getTrending());
        writer.writeCollectionOfObjectValues("used", this.getUsed());
    }
    /**
     * Sets the shared property value. Calculated relationship identifying documents shared with or by the user. This includes URLs, file attachments, and reference attachments to OneDrive for Business and SharePoint files found in Outlook messages and meetings. This also includes URLs and reference attachments to Teams conversations. Ordered by recency of share.
     * @param value Value to set for the shared property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShared(@javax.annotation.Nullable final java.util.List<SharedInsight> value) {
        this._shared = value;
    }
    /**
     * Sets the trending property value. Calculated relationship identifying documents trending around a user. Trending documents are calculated based on activity of the user's closest network of people and include files stored in OneDrive for Business and SharePoint. Trending insights help the user to discover potentially useful content that the user has access to, but has never viewed before.
     * @param value Value to set for the trending property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrending(@javax.annotation.Nullable final java.util.List<Trending> value) {
        this._trending = value;
    }
    /**
     * Sets the used property value. Calculated relationship identifying the latest documents viewed or modified by a user, including OneDrive for Business and SharePoint documents, ranked by recency of use.
     * @param value Value to set for the used property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsed(@javax.annotation.Nullable final java.util.List<UsedInsight> value) {
        this._used = value;
    }
}
