package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchAlteration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Defines the altered highlighted query string with spelling correction. The annotation around the corrected segment is: /ue000, /ue001.
     */
    private String alteredHighlightedQueryString;
    /**
     * Defines the altered query string with spelling correction.
     */
    private String alteredQueryString;
    /**
     * Represents changed segments related to an original user query.
     */
    private java.util.List<AlteredQueryToken> alteredQueryTokens;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new searchAlteration and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SearchAlteration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchAlteration
     */
    @jakarta.annotation.Nonnull
    public static SearchAlteration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchAlteration();
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
     * Gets the alteredHighlightedQueryString property value. Defines the altered highlighted query string with spelling correction. The annotation around the corrected segment is: /ue000, /ue001.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAlteredHighlightedQueryString() {
        return this.alteredHighlightedQueryString;
    }
    /**
     * Gets the alteredQueryString property value. Defines the altered query string with spelling correction.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAlteredQueryString() {
        return this.alteredQueryString;
    }
    /**
     * Gets the alteredQueryTokens property value. Represents changed segments related to an original user query.
     * @return a alteredQueryToken
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlteredQueryToken> getAlteredQueryTokens() {
        return this.alteredQueryTokens;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("alteredHighlightedQueryString", (n) -> { this.setAlteredHighlightedQueryString(n.getStringValue()); });
        deserializerMap.put("alteredQueryString", (n) -> { this.setAlteredQueryString(n.getStringValue()); });
        deserializerMap.put("alteredQueryTokens", (n) -> { this.setAlteredQueryTokens(n.getCollectionOfObjectValues(AlteredQueryToken::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alteredHighlightedQueryString", this.getAlteredHighlightedQueryString());
        writer.writeStringValue("alteredQueryString", this.getAlteredQueryString());
        writer.writeCollectionOfObjectValues("alteredQueryTokens", this.getAlteredQueryTokens());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the alteredHighlightedQueryString property value. Defines the altered highlighted query string with spelling correction. The annotation around the corrected segment is: /ue000, /ue001.
     * @param value Value to set for the alteredHighlightedQueryString property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAlteredHighlightedQueryString(@jakarta.annotation.Nullable final String value) {
        this.alteredHighlightedQueryString = value;
    }
    /**
     * Sets the alteredQueryString property value. Defines the altered query string with spelling correction.
     * @param value Value to set for the alteredQueryString property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAlteredQueryString(@jakarta.annotation.Nullable final String value) {
        this.alteredQueryString = value;
    }
    /**
     * Sets the alteredQueryTokens property value. Represents changed segments related to an original user query.
     * @param value Value to set for the alteredQueryTokens property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAlteredQueryTokens(@jakarta.annotation.Nullable final java.util.List<AlteredQueryToken> value) {
        this.alteredQueryTokens = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
