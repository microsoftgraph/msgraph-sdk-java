package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MediaContentRatingUnitedStates implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Movies rating labels in United States */
    private RatingUnitedStatesMoviesType _movieRating;
    /** The OdataType property */
    private String _odataType;
    /** TV content rating labels in United States */
    private RatingUnitedStatesTelevisionType _tvRating;
    /**
     * Instantiates a new mediaContentRatingUnitedStates and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MediaContentRatingUnitedStates() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.mediaContentRatingUnitedStates");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mediaContentRatingUnitedStates
     */
    @javax.annotation.Nonnull
    public static MediaContentRatingUnitedStates createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaContentRatingUnitedStates();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MediaContentRatingUnitedStates currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("movieRating", (n) -> { currentObject.setMovieRating(n.getEnumValue(RatingUnitedStatesMoviesType.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("tvRating", (n) -> { currentObject.setTvRating(n.getEnumValue(RatingUnitedStatesTelevisionType.class)); });
        return deserializerMap
    }
    /**
     * Gets the movieRating property value. Movies rating labels in United States
     * @return a ratingUnitedStatesMoviesType
     */
    @javax.annotation.Nullable
    public RatingUnitedStatesMoviesType getMovieRating() {
        return this._movieRating;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the tvRating property value. TV content rating labels in United States
     * @return a ratingUnitedStatesTelevisionType
     */
    @javax.annotation.Nullable
    public RatingUnitedStatesTelevisionType getTvRating() {
        return this._tvRating;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("movieRating", this.getMovieRating());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("tvRating", this.getTvRating());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the movieRating property value. Movies rating labels in United States
     * @param value Value to set for the movieRating property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMovieRating(@javax.annotation.Nullable final RatingUnitedStatesMoviesType value) {
        this._movieRating = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the tvRating property value. TV content rating labels in United States
     * @param value Value to set for the tvRating property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTvRating(@javax.annotation.Nullable final RatingUnitedStatesTelevisionType value) {
        this._tvRating = value;
    }
}
