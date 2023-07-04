package com.microsoft.graph.drives.item.items.item.workbook.functions.match;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MatchPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The lookupArray property
     */
    private Json lookupArray;
    /**
     * The lookupValue property
     */
    private Json lookupValue;
    /**
     * The matchType property
     */
    private Json matchType;
    /**
     * Instantiates a new matchPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MatchPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a matchPostRequestBody
     */
    @javax.annotation.Nonnull
    public static MatchPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MatchPostRequestBody();
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
        deserializerMap.put("lookupArray", (n) -> { this.setLookupArray(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("lookupValue", (n) -> { this.setLookupValue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("matchType", (n) -> { this.setMatchType(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lookupArray property value. The lookupArray property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getLookupArray() {
        return this.lookupArray;
    }
    /**
     * Gets the lookupValue property value. The lookupValue property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getLookupValue() {
        return this.lookupValue;
    }
    /**
     * Gets the matchType property value. The matchType property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getMatchType() {
        return this.matchType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("lookupArray", this.getLookupArray());
        writer.writeObjectValue("lookupValue", this.getLookupValue());
        writer.writeObjectValue("matchType", this.getMatchType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the lookupArray property value. The lookupArray property
     * @param value Value to set for the lookupArray property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLookupArray(@javax.annotation.Nullable final Json value) {
        this.lookupArray = value;
    }
    /**
     * Sets the lookupValue property value. The lookupValue property
     * @param value Value to set for the lookupValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLookupValue(@javax.annotation.Nullable final Json value) {
        this.lookupValue = value;
    }
    /**
     * Sets the matchType property value. The matchType property
     * @param value Value to set for the matchType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMatchType(@javax.annotation.Nullable final Json value) {
        this.matchType = value;
    }
}
