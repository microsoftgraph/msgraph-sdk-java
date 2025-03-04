package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OfficeGraphInsights extends Entity implements Parsable {
    /**
     * Instantiates a new {@link OfficeGraphInsights} and sets the default values.
     */
    public OfficeGraphInsights() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OfficeGraphInsights}
     */
    @jakarta.annotation.Nonnull
    public static OfficeGraphInsights createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.itemInsights": return new ItemInsights();
            }
        }
        return new OfficeGraphInsights();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("shared", (n) -> { this.setShared(n.getCollectionOfObjectValues(SharedInsight::createFromDiscriminatorValue)); });
        deserializerMap.put("trending", (n) -> { this.setTrending(n.getCollectionOfObjectValues(Trending::createFromDiscriminatorValue)); });
        deserializerMap.put("used", (n) -> { this.setUsed(n.getCollectionOfObjectValues(UsedInsight::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the shared property value. Calculated relationship that identifies documents shared with or by the user. This includes URLs, file attachments, and reference attachments to OneDrive for work or school and SharePoint files found in Outlook messages and meetings. This also includes URLs and reference attachments to Teams conversations. Ordered by recency of share.
     * @return a {@link java.util.List<SharedInsight>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharedInsight> getShared() {
        return this.backingStore.get("shared");
    }
    /**
     * Gets the trending property value. Calculated relationship that identifies documents trending around a user. Trending documents are calculated based on activity of the user&apos;s closest network of people and include files stored in OneDrive for work or school and SharePoint. Trending insights help the user to discover potentially useful content that the user has access to, but has never viewed before.
     * @return a {@link java.util.List<Trending>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Trending> getTrending() {
        return this.backingStore.get("trending");
    }
    /**
     * Gets the used property value. Calculated relationship that identifies the latest documents viewed or modified by a user, including OneDrive for work or school and SharePoint documents, ranked by recency of use.
     * @return a {@link java.util.List<UsedInsight>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UsedInsight> getUsed() {
        return this.backingStore.get("used");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("shared", this.getShared());
        writer.writeCollectionOfObjectValues("trending", this.getTrending());
        writer.writeCollectionOfObjectValues("used", this.getUsed());
    }
    /**
     * Sets the shared property value. Calculated relationship that identifies documents shared with or by the user. This includes URLs, file attachments, and reference attachments to OneDrive for work or school and SharePoint files found in Outlook messages and meetings. This also includes URLs and reference attachments to Teams conversations. Ordered by recency of share.
     * @param value Value to set for the shared property.
     */
    public void setShared(@jakarta.annotation.Nullable final java.util.List<SharedInsight> value) {
        this.backingStore.set("shared", value);
    }
    /**
     * Sets the trending property value. Calculated relationship that identifies documents trending around a user. Trending documents are calculated based on activity of the user&apos;s closest network of people and include files stored in OneDrive for work or school and SharePoint. Trending insights help the user to discover potentially useful content that the user has access to, but has never viewed before.
     * @param value Value to set for the trending property.
     */
    public void setTrending(@jakarta.annotation.Nullable final java.util.List<Trending> value) {
        this.backingStore.set("trending", value);
    }
    /**
     * Sets the used property value. Calculated relationship that identifies the latest documents viewed or modified by a user, including OneDrive for work or school and SharePoint documents, ranked by recency of use.
     * @param value Value to set for the used property.
     */
    public void setUsed(@jakarta.annotation.Nullable final java.util.List<UsedInsight> value) {
        this.backingStore.set("used", value);
    }
}
