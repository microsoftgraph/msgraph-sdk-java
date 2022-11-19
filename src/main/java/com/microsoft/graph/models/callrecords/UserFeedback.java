package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserFeedback implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The rating property */
    private UserFeedbackRating _rating;
    /** The feedback text provided by the user of this endpoint for the session. */
    private String _text;
    /** The set of feedback tokens provided by the user of this endpoint for the session. This is a set of Boolean properties. The property names should not be relied upon since they may change depending on what tokens are offered to the user. */
    private FeedbackTokenSet _tokens;
    /**
     * Instantiates a new userFeedback and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserFeedback() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.callRecords.userFeedback");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userFeedback
     */
    @javax.annotation.Nonnull
    public static UserFeedback createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserFeedback();
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
        final UserFeedback currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("rating", (n) -> { currentObject.setRating(n.getEnumValue(UserFeedbackRating.class)); });
        deserializerMap.put("text", (n) -> { currentObject.setText(n.getStringValue()); });
        deserializerMap.put("tokens", (n) -> { currentObject.setTokens(n.getObjectValue(FeedbackTokenSet::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the rating property value. The rating property
     * @return a userFeedbackRating
     */
    @javax.annotation.Nullable
    public UserFeedbackRating getRating() {
        return this._rating;
    }
    /**
     * Gets the text property value. The feedback text provided by the user of this endpoint for the session.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getText() {
        return this._text;
    }
    /**
     * Gets the tokens property value. The set of feedback tokens provided by the user of this endpoint for the session. This is a set of Boolean properties. The property names should not be relied upon since they may change depending on what tokens are offered to the user.
     * @return a feedbackTokenSet
     */
    @javax.annotation.Nullable
    public FeedbackTokenSet getTokens() {
        return this._tokens;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("rating", this.getRating());
        writer.writeStringValue("text", this.getText());
        writer.writeObjectValue("tokens", this.getTokens());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the rating property value. The rating property
     * @param value Value to set for the rating property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRating(@javax.annotation.Nullable final UserFeedbackRating value) {
        this._rating = value;
    }
    /**
     * Sets the text property value. The feedback text provided by the user of this endpoint for the session.
     * @param value Value to set for the text property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setText(@javax.annotation.Nullable final String value) {
        this._text = value;
    }
    /**
     * Sets the tokens property value. The set of feedback tokens provided by the user of this endpoint for the session. This is a set of Boolean properties. The property names should not be relied upon since they may change depending on what tokens are offered to the user.
     * @param value Value to set for the tokens property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokens(@javax.annotation.Nullable final FeedbackTokenSet value) {
        this._tokens = value;
    }
}
