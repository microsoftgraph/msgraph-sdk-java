package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SitePage extends BaseSitePage implements Parsable {
    /**
     * Instantiates a new {@link SitePage} and sets the default values.
     */
    public SitePage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SitePage}
     */
    @jakarta.annotation.Nonnull
    public static SitePage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SitePage();
    }
    /**
     * Gets the canvasLayout property value. Indicates the layout of the content in a given SharePoint page, including horizontal sections and vertical sections.
     * @return a {@link CanvasLayout}
     */
    @jakarta.annotation.Nullable
    public CanvasLayout getCanvasLayout() {
        return this.backingStore.get("canvasLayout");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("canvasLayout", (n) -> { this.setCanvasLayout(n.getObjectValue(CanvasLayout::createFromDiscriminatorValue)); });
        deserializerMap.put("promotionKind", (n) -> { this.setPromotionKind(n.getEnumValue(PagePromotionType::forValue)); });
        deserializerMap.put("reactions", (n) -> { this.setReactions(n.getObjectValue(ReactionsFacet::createFromDiscriminatorValue)); });
        deserializerMap.put("showComments", (n) -> { this.setShowComments(n.getBooleanValue()); });
        deserializerMap.put("showRecommendedPages", (n) -> { this.setShowRecommendedPages(n.getBooleanValue()); });
        deserializerMap.put("thumbnailWebUrl", (n) -> { this.setThumbnailWebUrl(n.getStringValue()); });
        deserializerMap.put("titleArea", (n) -> { this.setTitleArea(n.getObjectValue(TitleArea::createFromDiscriminatorValue)); });
        deserializerMap.put("webParts", (n) -> { this.setWebParts(n.getCollectionOfObjectValues(WebPart::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the promotionKind property value. Indicates the promotion kind of the sitePage. The possible values are: microsoftReserved, page, newsPost, unknownFutureValue.
     * @return a {@link PagePromotionType}
     */
    @jakarta.annotation.Nullable
    public PagePromotionType getPromotionKind() {
        return this.backingStore.get("promotionKind");
    }
    /**
     * Gets the reactions property value. Reactions information for the page.
     * @return a {@link ReactionsFacet}
     */
    @jakarta.annotation.Nullable
    public ReactionsFacet getReactions() {
        return this.backingStore.get("reactions");
    }
    /**
     * Gets the showComments property value. Determines whether or not to show comments at the bottom of the page.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowComments() {
        return this.backingStore.get("showComments");
    }
    /**
     * Gets the showRecommendedPages property value. Determines whether or not to show recommended pages at the bottom of the page.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowRecommendedPages() {
        return this.backingStore.get("showRecommendedPages");
    }
    /**
     * Gets the thumbnailWebUrl property value. Url of the sitePage's thumbnail image
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThumbnailWebUrl() {
        return this.backingStore.get("thumbnailWebUrl");
    }
    /**
     * Gets the titleArea property value. Title area on the SharePoint page.
     * @return a {@link TitleArea}
     */
    @jakarta.annotation.Nullable
    public TitleArea getTitleArea() {
        return this.backingStore.get("titleArea");
    }
    /**
     * Gets the webParts property value. Collection of webparts on the SharePoint page.
     * @return a {@link java.util.List<WebPart>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WebPart> getWebParts() {
        return this.backingStore.get("webParts");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("canvasLayout", this.getCanvasLayout());
        writer.writeEnumValue("promotionKind", this.getPromotionKind());
        writer.writeObjectValue("reactions", this.getReactions());
        writer.writeBooleanValue("showComments", this.getShowComments());
        writer.writeBooleanValue("showRecommendedPages", this.getShowRecommendedPages());
        writer.writeStringValue("thumbnailWebUrl", this.getThumbnailWebUrl());
        writer.writeObjectValue("titleArea", this.getTitleArea());
        writer.writeCollectionOfObjectValues("webParts", this.getWebParts());
    }
    /**
     * Sets the canvasLayout property value. Indicates the layout of the content in a given SharePoint page, including horizontal sections and vertical sections.
     * @param value Value to set for the canvasLayout property.
     */
    public void setCanvasLayout(@jakarta.annotation.Nullable final CanvasLayout value) {
        this.backingStore.set("canvasLayout", value);
    }
    /**
     * Sets the promotionKind property value. Indicates the promotion kind of the sitePage. The possible values are: microsoftReserved, page, newsPost, unknownFutureValue.
     * @param value Value to set for the promotionKind property.
     */
    public void setPromotionKind(@jakarta.annotation.Nullable final PagePromotionType value) {
        this.backingStore.set("promotionKind", value);
    }
    /**
     * Sets the reactions property value. Reactions information for the page.
     * @param value Value to set for the reactions property.
     */
    public void setReactions(@jakarta.annotation.Nullable final ReactionsFacet value) {
        this.backingStore.set("reactions", value);
    }
    /**
     * Sets the showComments property value. Determines whether or not to show comments at the bottom of the page.
     * @param value Value to set for the showComments property.
     */
    public void setShowComments(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showComments", value);
    }
    /**
     * Sets the showRecommendedPages property value. Determines whether or not to show recommended pages at the bottom of the page.
     * @param value Value to set for the showRecommendedPages property.
     */
    public void setShowRecommendedPages(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showRecommendedPages", value);
    }
    /**
     * Sets the thumbnailWebUrl property value. Url of the sitePage's thumbnail image
     * @param value Value to set for the thumbnailWebUrl property.
     */
    public void setThumbnailWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thumbnailWebUrl", value);
    }
    /**
     * Sets the titleArea property value. Title area on the SharePoint page.
     * @param value Value to set for the titleArea property.
     */
    public void setTitleArea(@jakarta.annotation.Nullable final TitleArea value) {
        this.backingStore.set("titleArea", value);
    }
    /**
     * Sets the webParts property value. Collection of webparts on the SharePoint page.
     * @param value Value to set for the webParts property.
     */
    public void setWebParts(@jakarta.annotation.Nullable final java.util.List<WebPart> value) {
        this.backingStore.set("webParts", value);
    }
}
