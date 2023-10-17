package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SearchHit implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the content source that the externalItem is part of.
     */
    private String contentSource;
    /**
     * The internal identifier for the item. The format of the identifier varies based on the entity type. For details, see hitId format.
     */
    private String hitId;
    /**
     * Indicates whether the current result is collapsed when the collapseProperties property in the searchRequest is used.
     */
    private Boolean isCollapsed;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The rank or the order of the result.
     */
    private Integer rank;
    /**
     * The resource property
     */
    private Entity resource;
    /**
     * ID of the result template used to render the search result. This ID must map to a display layout in the resultTemplates dictionary that is also included in the searchResponse.
     */
    private String resultTemplateId;
    /**
     * A summary of the result, if a summary is available.
     */
    private String summary;
    /**
     * Instantiates a new SearchHit and sets the default values.
     */
    public SearchHit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SearchHit
     */
    @jakarta.annotation.Nonnull
    public static SearchHit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchHit();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the contentSource property value. The name of the content source that the externalItem is part of.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentSource() {
        return this.contentSource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("contentSource", (n) -> { this.setContentSource(n.getStringValue()); });
        deserializerMap.put("hitId", (n) -> { this.setHitId(n.getStringValue()); });
        deserializerMap.put("isCollapsed", (n) -> { this.setIsCollapsed(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("rank", (n) -> { this.setRank(n.getIntegerValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
        deserializerMap.put("resultTemplateId", (n) -> { this.setResultTemplateId(n.getStringValue()); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hitId property value. The internal identifier for the item. The format of the identifier varies based on the entity type. For details, see hitId format.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHitId() {
        return this.hitId;
    }
    /**
     * Gets the isCollapsed property value. Indicates whether the current result is collapsed when the collapseProperties property in the searchRequest is used.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCollapsed() {
        return this.isCollapsed;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the rank property value. The rank or the order of the result.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRank() {
        return this.rank;
    }
    /**
     * Gets the resource property value. The resource property
     * @return a Entity
     */
    @jakarta.annotation.Nullable
    public Entity getResource() {
        return this.resource;
    }
    /**
     * Gets the resultTemplateId property value. ID of the result template used to render the search result. This ID must map to a display layout in the resultTemplates dictionary that is also included in the searchResponse.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResultTemplateId() {
        return this.resultTemplateId;
    }
    /**
     * Gets the summary property value. A summary of the result, if a summary is available.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSummary() {
        return this.summary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contentSource", this.getContentSource());
        writer.writeStringValue("hitId", this.getHitId());
        writer.writeBooleanValue("isCollapsed", this.getIsCollapsed());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("rank", this.getRank());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeStringValue("resultTemplateId", this.getResultTemplateId());
        writer.writeStringValue("summary", this.getSummary());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the contentSource property value. The name of the content source that the externalItem is part of.
     * @param value Value to set for the contentSource property.
     */
    public void setContentSource(@jakarta.annotation.Nullable final String value) {
        this.contentSource = value;
    }
    /**
     * Sets the hitId property value. The internal identifier for the item. The format of the identifier varies based on the entity type. For details, see hitId format.
     * @param value Value to set for the hitId property.
     */
    public void setHitId(@jakarta.annotation.Nullable final String value) {
        this.hitId = value;
    }
    /**
     * Sets the isCollapsed property value. Indicates whether the current result is collapsed when the collapseProperties property in the searchRequest is used.
     * @param value Value to set for the isCollapsed property.
     */
    public void setIsCollapsed(@jakarta.annotation.Nullable final Boolean value) {
        this.isCollapsed = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the rank property value. The rank or the order of the result.
     * @param value Value to set for the rank property.
     */
    public void setRank(@jakarta.annotation.Nullable final Integer value) {
        this.rank = value;
    }
    /**
     * Sets the resource property value. The resource property
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final Entity value) {
        this.resource = value;
    }
    /**
     * Sets the resultTemplateId property value. ID of the result template used to render the search result. This ID must map to a display layout in the resultTemplates dictionary that is also included in the searchResponse.
     * @param value Value to set for the resultTemplateId property.
     */
    public void setResultTemplateId(@jakarta.annotation.Nullable final String value) {
        this.resultTemplateId = value;
    }
    /**
     * Sets the summary property value. A summary of the result, if a summary is available.
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final String value) {
        this.summary = value;
    }
}
