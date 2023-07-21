package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MediaContentRatingAustralia implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Movies rating labels in Australia
     */
    private RatingAustraliaMoviesType movieRating;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * TV content rating labels in Australia
     */
    private RatingAustraliaTelevisionType tvRating;
    /**
     * Instantiates a new mediaContentRatingAustralia and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MediaContentRatingAustralia() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mediaContentRatingAustralia
     */
    @javax.annotation.Nonnull
    public static MediaContentRatingAustralia createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaContentRatingAustralia();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("movieRating", (n) -> { this.setMovieRating(n.getEnumValue(RatingAustraliaMoviesType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tvRating", (n) -> { this.setTvRating(n.getEnumValue(RatingAustraliaTelevisionType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the movieRating property value. Movies rating labels in Australia
     * @return a ratingAustraliaMoviesType
     */
    @javax.annotation.Nullable
    public RatingAustraliaMoviesType getMovieRating() {
        return this.movieRating;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the tvRating property value. TV content rating labels in Australia
     * @return a ratingAustraliaTelevisionType
     */
    @javax.annotation.Nullable
    public RatingAustraliaTelevisionType getTvRating() {
        return this.tvRating;
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
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the movieRating property value. Movies rating labels in Australia
     * @param value Value to set for the movieRating property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMovieRating(@javax.annotation.Nullable final RatingAustraliaMoviesType value) {
        this.movieRating = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the tvRating property value. TV content rating labels in Australia
     * @param value Value to set for the tvRating property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTvRating(@javax.annotation.Nullable final RatingAustraliaTelevisionType value) {
        this.tvRating = value;
    }
}
