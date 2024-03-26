package com.microsoft.graph.models;

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
public class TitleArea implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TitleArea} and sets the default values.
     */
    public TitleArea() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TitleArea}
     */
    @jakarta.annotation.Nonnull
    public static TitleArea createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TitleArea();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the alternativeText property value. The alternativeText property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlternativeText() {
        return this.backingStore.get("alternativeText");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the enableGradientEffect property value. The enableGradientEffect property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableGradientEffect() {
        return this.backingStore.get("enableGradientEffect");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("alternativeText", (n) -> { this.setAlternativeText(n.getStringValue()); });
        deserializerMap.put("enableGradientEffect", (n) -> { this.setEnableGradientEffect(n.getBooleanValue()); });
        deserializerMap.put("imageWebUrl", (n) -> { this.setImageWebUrl(n.getStringValue()); });
        deserializerMap.put("layout", (n) -> { this.setLayout(n.getEnumValue(TitleAreaLayoutType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("serverProcessedContent", (n) -> { this.setServerProcessedContent(n.getObjectValue(ServerProcessedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("showAuthor", (n) -> { this.setShowAuthor(n.getBooleanValue()); });
        deserializerMap.put("showPublishedDate", (n) -> { this.setShowPublishedDate(n.getBooleanValue()); });
        deserializerMap.put("showTextBlockAboveTitle", (n) -> { this.setShowTextBlockAboveTitle(n.getBooleanValue()); });
        deserializerMap.put("textAboveTitle", (n) -> { this.setTextAboveTitle(n.getStringValue()); });
        deserializerMap.put("textAlignment", (n) -> { this.setTextAlignment(n.getEnumValue(TitleAreaTextAlignmentType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the imageWebUrl property value. The imageWebUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageWebUrl() {
        return this.backingStore.get("imageWebUrl");
    }
    /**
     * Gets the layout property value. The layout property
     * @return a {@link TitleAreaLayoutType}
     */
    @jakarta.annotation.Nullable
    public TitleAreaLayoutType getLayout() {
        return this.backingStore.get("layout");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the serverProcessedContent property value. The serverProcessedContent property
     * @return a {@link ServerProcessedContent}
     */
    @jakarta.annotation.Nullable
    public ServerProcessedContent getServerProcessedContent() {
        return this.backingStore.get("serverProcessedContent");
    }
    /**
     * Gets the showAuthor property value. The showAuthor property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowAuthor() {
        return this.backingStore.get("showAuthor");
    }
    /**
     * Gets the showPublishedDate property value. The showPublishedDate property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowPublishedDate() {
        return this.backingStore.get("showPublishedDate");
    }
    /**
     * Gets the showTextBlockAboveTitle property value. The showTextBlockAboveTitle property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowTextBlockAboveTitle() {
        return this.backingStore.get("showTextBlockAboveTitle");
    }
    /**
     * Gets the textAboveTitle property value. The textAboveTitle property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTextAboveTitle() {
        return this.backingStore.get("textAboveTitle");
    }
    /**
     * Gets the textAlignment property value. The textAlignment property
     * @return a {@link TitleAreaTextAlignmentType}
     */
    @jakarta.annotation.Nullable
    public TitleAreaTextAlignmentType getTextAlignment() {
        return this.backingStore.get("textAlignment");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alternativeText", this.getAlternativeText());
        writer.writeBooleanValue("enableGradientEffect", this.getEnableGradientEffect());
        writer.writeStringValue("imageWebUrl", this.getImageWebUrl());
        writer.writeEnumValue("layout", this.getLayout());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("serverProcessedContent", this.getServerProcessedContent());
        writer.writeBooleanValue("showAuthor", this.getShowAuthor());
        writer.writeBooleanValue("showPublishedDate", this.getShowPublishedDate());
        writer.writeBooleanValue("showTextBlockAboveTitle", this.getShowTextBlockAboveTitle());
        writer.writeStringValue("textAboveTitle", this.getTextAboveTitle());
        writer.writeEnumValue("textAlignment", this.getTextAlignment());
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
     * Sets the alternativeText property value. The alternativeText property
     * @param value Value to set for the alternativeText property.
     */
    public void setAlternativeText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alternativeText", value);
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
     * Sets the enableGradientEffect property value. The enableGradientEffect property
     * @param value Value to set for the enableGradientEffect property.
     */
    public void setEnableGradientEffect(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableGradientEffect", value);
    }
    /**
     * Sets the imageWebUrl property value. The imageWebUrl property
     * @param value Value to set for the imageWebUrl property.
     */
    public void setImageWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("imageWebUrl", value);
    }
    /**
     * Sets the layout property value. The layout property
     * @param value Value to set for the layout property.
     */
    public void setLayout(@jakarta.annotation.Nullable final TitleAreaLayoutType value) {
        this.backingStore.set("layout", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the serverProcessedContent property value. The serverProcessedContent property
     * @param value Value to set for the serverProcessedContent property.
     */
    public void setServerProcessedContent(@jakarta.annotation.Nullable final ServerProcessedContent value) {
        this.backingStore.set("serverProcessedContent", value);
    }
    /**
     * Sets the showAuthor property value. The showAuthor property
     * @param value Value to set for the showAuthor property.
     */
    public void setShowAuthor(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showAuthor", value);
    }
    /**
     * Sets the showPublishedDate property value. The showPublishedDate property
     * @param value Value to set for the showPublishedDate property.
     */
    public void setShowPublishedDate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showPublishedDate", value);
    }
    /**
     * Sets the showTextBlockAboveTitle property value. The showTextBlockAboveTitle property
     * @param value Value to set for the showTextBlockAboveTitle property.
     */
    public void setShowTextBlockAboveTitle(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showTextBlockAboveTitle", value);
    }
    /**
     * Sets the textAboveTitle property value. The textAboveTitle property
     * @param value Value to set for the textAboveTitle property.
     */
    public void setTextAboveTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("textAboveTitle", value);
    }
    /**
     * Sets the textAlignment property value. The textAlignment property
     * @param value Value to set for the textAlignment property.
     */
    public void setTextAlignment(@jakarta.annotation.Nullable final TitleAreaTextAlignmentType value) {
        this.backingStore.set("textAlignment", value);
    }
}
