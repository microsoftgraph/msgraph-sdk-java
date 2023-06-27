package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.item.setdata;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SetDataPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The seriesBy property
     */
    private String seriesBy;
    /**
     * The sourceData property
     */
    private Json sourceData;
    /**
     * Instantiates a new setDataPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SetDataPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a setDataPostRequestBody
     */
    @javax.annotation.Nonnull
    public static SetDataPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetDataPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("seriesBy", (n) -> { this.setSeriesBy(n.getStringValue()); });
        deserializerMap.put("sourceData", (n) -> { this.setSourceData(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the seriesBy property value. The seriesBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSeriesBy() {
        return this.seriesBy;
    }
    /**
     * Gets the sourceData property value. The sourceData property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getSourceData() {
        return this.sourceData;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("seriesBy", this.getSeriesBy());
        writer.writeObjectValue("sourceData", this.getSourceData());
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
     * Sets the seriesBy property value. The seriesBy property
     * @param value Value to set for the seriesBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeriesBy(@javax.annotation.Nullable final String value) {
        this.seriesBy = value;
    }
    /**
     * Sets the sourceData property value. The sourceData property
     * @param value Value to set for the sourceData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceData(@javax.annotation.Nullable final Json value) {
        this.sourceData = value;
    }
}
