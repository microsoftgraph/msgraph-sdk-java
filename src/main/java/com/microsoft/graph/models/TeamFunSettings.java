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
public class TeamFunSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new TeamFunSettings and sets the default values.
     */
    public TeamFunSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamFunSettings
     */
    @jakarta.annotation.Nonnull
    public static TeamFunSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamFunSettings();
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
     * Gets the allowCustomMemes property value. If set to true, enables users to include custom memes.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCustomMemes() {
        return this.backingStore.get("allowCustomMemes");
    }
    /**
     * Gets the allowGiphy property value. If set to true, enables Giphy use.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowGiphy() {
        return this.backingStore.get("allowGiphy");
    }
    /**
     * Gets the allowStickersAndMemes property value. If set to true, enables users to include stickers and memes.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowStickersAndMemes() {
        return this.backingStore.get("allowStickersAndMemes");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("allowCustomMemes", (n) -> { this.setAllowCustomMemes(n.getBooleanValue()); });
        deserializerMap.put("allowGiphy", (n) -> { this.setAllowGiphy(n.getBooleanValue()); });
        deserializerMap.put("allowStickersAndMemes", (n) -> { this.setAllowStickersAndMemes(n.getBooleanValue()); });
        deserializerMap.put("giphyContentRating", (n) -> { this.setGiphyContentRating(n.getEnumValue(GiphyRatingType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the giphyContentRating property value. Giphy content rating. Possible values are: moderate, strict.
     * @return a GiphyRatingType
     */
    @jakarta.annotation.Nullable
    public GiphyRatingType getGiphyContentRating() {
        return this.backingStore.get("giphyContentRating");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowCustomMemes", this.getAllowCustomMemes());
        writer.writeBooleanValue("allowGiphy", this.getAllowGiphy());
        writer.writeBooleanValue("allowStickersAndMemes", this.getAllowStickersAndMemes());
        writer.writeEnumValue("giphyContentRating", this.getGiphyContentRating());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the allowCustomMemes property value. If set to true, enables users to include custom memes.
     * @param value Value to set for the allowCustomMemes property.
     */
    public void setAllowCustomMemes(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowCustomMemes", value);
    }
    /**
     * Sets the allowGiphy property value. If set to true, enables Giphy use.
     * @param value Value to set for the allowGiphy property.
     */
    public void setAllowGiphy(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowGiphy", value);
    }
    /**
     * Sets the allowStickersAndMemes property value. If set to true, enables users to include stickers and memes.
     * @param value Value to set for the allowStickersAndMemes property.
     */
    public void setAllowStickersAndMemes(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowStickersAndMemes", value);
    }
    /**
     * Sets the giphyContentRating property value. Giphy content rating. Possible values are: moderate, strict.
     * @param value Value to set for the giphyContentRating property.
     */
    public void setGiphyContentRating(@jakarta.annotation.Nullable final GiphyRatingType value) {
        this.backingStore.set("giphyContentRating", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
