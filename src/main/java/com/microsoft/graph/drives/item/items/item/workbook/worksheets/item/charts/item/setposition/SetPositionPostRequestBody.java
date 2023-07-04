package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.item.setposition;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SetPositionPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The endCell property
     */
    private Json endCell;
    /**
     * The startCell property
     */
    private Json startCell;
    /**
     * Instantiates a new setPositionPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SetPositionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a setPositionPostRequestBody
     */
    @javax.annotation.Nonnull
    public static SetPositionPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetPositionPostRequestBody();
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
     * Gets the endCell property value. The endCell property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getEndCell() {
        return this.endCell;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("endCell", (n) -> { this.setEndCell(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startCell", (n) -> { this.setStartCell(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the startCell property value. The startCell property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getStartCell() {
        return this.startCell;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("endCell", this.getEndCell());
        writer.writeObjectValue("startCell", this.getStartCell());
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
     * Sets the endCell property value. The endCell property
     * @param value Value to set for the endCell property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndCell(@javax.annotation.Nullable final Json value) {
        this.endCell = value;
    }
    /**
     * Sets the startCell property value. The startCell property
     * @param value Value to set for the startCell property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartCell(@javax.annotation.Nullable final Json value) {
        this.startCell = value;
    }
}
