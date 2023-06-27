package com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.filter.applycustomfilter;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplyCustomFilterPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The criteria1 property
     */
    private String criteria1;
    /**
     * The criteria2 property
     */
    private String criteria2;
    /**
     * The oper property
     */
    private String oper;
    /**
     * Instantiates a new applyCustomFilterPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApplyCustomFilterPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applyCustomFilterPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ApplyCustomFilterPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyCustomFilterPostRequestBody();
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
     * Gets the criteria1 property value. The criteria1 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCriteria1() {
        return this.criteria1;
    }
    /**
     * Gets the criteria2 property value. The criteria2 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCriteria2() {
        return this.criteria2;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("criteria1", (n) -> { this.setCriteria1(n.getStringValue()); });
        deserializerMap.put("criteria2", (n) -> { this.setCriteria2(n.getStringValue()); });
        deserializerMap.put("oper", (n) -> { this.setOper(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the oper property value. The oper property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOper() {
        return this.oper;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("criteria1", this.getCriteria1());
        writer.writeStringValue("criteria2", this.getCriteria2());
        writer.writeStringValue("oper", this.getOper());
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
     * Sets the criteria1 property value. The criteria1 property
     * @param value Value to set for the criteria1 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCriteria1(@javax.annotation.Nullable final String value) {
        this.criteria1 = value;
    }
    /**
     * Sets the criteria2 property value. The criteria2 property
     * @param value Value to set for the criteria2 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCriteria2(@javax.annotation.Nullable final String value) {
        this.criteria2 = value;
    }
    /**
     * Sets the oper property value. The oper property
     * @param value Value to set for the oper property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOper(@javax.annotation.Nullable final String value) {
        this.oper = value;
    }
}
