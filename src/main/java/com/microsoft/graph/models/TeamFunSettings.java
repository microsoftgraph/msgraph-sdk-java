package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamFunSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** If set to true, enables users to include custom memes.  */
    private Boolean _allowCustomMemes;
    /** If set to true, enables Giphy use.  */
    private Boolean _allowGiphy;
    /** If set to true, enables users to include stickers and memes.  */
    private Boolean _allowStickersAndMemes;
    /** Giphy content rating. Possible values are: moderate, strict.  */
    private GiphyRatingType _giphyContentRating;
    /**
     * Instantiates a new teamFunSettings and sets the default values.
     * @return a void
     */
    public TeamFunSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamFunSettings
     */
    @javax.annotation.Nonnull
    public static TeamFunSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamFunSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the allowCustomMemes property value. If set to true, enables users to include custom memes.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowCustomMemes() {
        return this._allowCustomMemes;
    }
    /**
     * Gets the allowGiphy property value. If set to true, enables Giphy use.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowGiphy() {
        return this._allowGiphy;
    }
    /**
     * Gets the allowStickersAndMemes property value. If set to true, enables users to include stickers and memes.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowStickersAndMemes() {
        return this._allowStickersAndMemes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamFunSettings currentObject = this;
        return new HashMap<>(4) {{
            this.put("allowCustomMemes", (n) -> { currentObject.setAllowCustomMemes(n.getBooleanValue()); });
            this.put("allowGiphy", (n) -> { currentObject.setAllowGiphy(n.getBooleanValue()); });
            this.put("allowStickersAndMemes", (n) -> { currentObject.setAllowStickersAndMemes(n.getBooleanValue()); });
            this.put("giphyContentRating", (n) -> { currentObject.setGiphyContentRating(n.getEnumValue(GiphyRatingType.class)); });
        }};
    }
    /**
     * Gets the giphyContentRating property value. Giphy content rating. Possible values are: moderate, strict.
     * @return a giphyRatingType
     */
    @javax.annotation.Nullable
    public GiphyRatingType getGiphyContentRating() {
        return this._giphyContentRating;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowCustomMemes", this.getAllowCustomMemes());
        writer.writeBooleanValue("allowGiphy", this.getAllowGiphy());
        writer.writeBooleanValue("allowStickersAndMemes", this.getAllowStickersAndMemes());
        writer.writeEnumValue("giphyContentRating", this.getGiphyContentRating());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the allowCustomMemes property value. If set to true, enables users to include custom memes.
     * @param value Value to set for the allowCustomMemes property.
     * @return a void
     */
    public void setAllowCustomMemes(@javax.annotation.Nullable final Boolean value) {
        this._allowCustomMemes = value;
    }
    /**
     * Sets the allowGiphy property value. If set to true, enables Giphy use.
     * @param value Value to set for the allowGiphy property.
     * @return a void
     */
    public void setAllowGiphy(@javax.annotation.Nullable final Boolean value) {
        this._allowGiphy = value;
    }
    /**
     * Sets the allowStickersAndMemes property value. If set to true, enables users to include stickers and memes.
     * @param value Value to set for the allowStickersAndMemes property.
     * @return a void
     */
    public void setAllowStickersAndMemes(@javax.annotation.Nullable final Boolean value) {
        this._allowStickersAndMemes = value;
    }
    /**
     * Sets the giphyContentRating property value. Giphy content rating. Possible values are: moderate, strict.
     * @param value Value to set for the giphyContentRating property.
     * @return a void
     */
    public void setGiphyContentRating(@javax.annotation.Nullable final GiphyRatingType value) {
        this._giphyContentRating = value;
    }
}
