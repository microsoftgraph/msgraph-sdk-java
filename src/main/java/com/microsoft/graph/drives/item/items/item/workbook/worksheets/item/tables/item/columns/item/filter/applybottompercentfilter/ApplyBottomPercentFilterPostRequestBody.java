package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.applybottompercentfilter;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplyBottomPercentFilterPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The percent property */
    private Integer percent;
    /**
     * Instantiates a new applyBottomPercentFilterPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApplyBottomPercentFilterPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applyBottomPercentFilterPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ApplyBottomPercentFilterPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyBottomPercentFilterPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("percent", (n) -> { this.setPercent(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the percent property value. The percent property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPercent() {
        return this.percent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("percent", this.getPercent());
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
     * Sets the percent property value. The percent property
     * @param value Value to set for the percent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPercent(@javax.annotation.Nullable final Integer value) {
        this.percent = value;
    }
}
