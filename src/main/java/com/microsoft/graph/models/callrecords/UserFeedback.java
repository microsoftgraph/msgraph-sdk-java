package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserFeedback implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The rating property
     */
    private UserFeedbackRating rating;
    /**
     * The feedback text provided by the user of this endpoint for the session.
     */
    private String text;
    /**
     * The set of feedback tokens provided by the user of this endpoint for the session. This is a set of Boolean properties. The property names should not be relied upon since they may change depending on what tokens are offered to the user.
     */
    private FeedbackTokenSet tokens;
    /**
     * Instantiates a new userFeedback and sets the default values.
     */
    public UserFeedback() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userFeedback
     */
    @jakarta.annotation.Nonnull
    public static UserFeedback createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserFeedback();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("rating", (n) -> { this.setRating(n.getEnumValue(UserFeedbackRating.class)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("tokens", (n) -> { this.setTokens(n.getObjectValue(FeedbackTokenSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the rating property value. The rating property
     * @return a userFeedbackRating
     */
    @jakarta.annotation.Nullable
    public UserFeedbackRating getRating() {
        return this.rating;
    }
    /**
     * Gets the text property value. The feedback text provided by the user of this endpoint for the session.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
    }
    /**
     * Gets the tokens property value. The set of feedback tokens provided by the user of this endpoint for the session. This is a set of Boolean properties. The property names should not be relied upon since they may change depending on what tokens are offered to the user.
     * @return a feedbackTokenSet
     */
    @jakarta.annotation.Nullable
    public FeedbackTokenSet getTokens() {
        return this.tokens;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("rating", this.getRating());
        writer.writeStringValue("text", this.getText());
        writer.writeObjectValue("tokens", this.getTokens());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the rating property value. The rating property
     * @param value Value to set for the rating property.
     */
    public void setRating(@jakarta.annotation.Nullable final UserFeedbackRating value) {
        this.rating = value;
    }
    /**
     * Sets the text property value. The feedback text provided by the user of this endpoint for the session.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
    /**
     * Sets the tokens property value. The set of feedback tokens provided by the user of this endpoint for the session. This is a set of Boolean properties. The property names should not be relied upon since they may change depending on what tokens are offered to the user.
     * @param value Value to set for the tokens property.
     */
    public void setTokens(@jakarta.annotation.Nullable final FeedbackTokenSet value) {
        this.tokens = value;
    }
}
