package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BaseDeltaFunctionResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataDeltaLink property
     */
    private String odataDeltaLink;
    /**
     * The OdataNextLink property
     */
    private String odataNextLink;
    /**
     * Instantiates a new BaseDeltaFunctionResponse and sets the default values.
     */
    public BaseDeltaFunctionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BaseDeltaFunctionResponse
     */
    @jakarta.annotation.Nonnull
    public static BaseDeltaFunctionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BaseDeltaFunctionResponse();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("@odata.deltaLink", (n) -> { this.setOdataDeltaLink(n.getStringValue()); });
        deserializerMap.put("@odata.nextLink", (n) -> { this.setOdataNextLink(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.deltaLink property value. The OdataDeltaLink property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataDeltaLink() {
        return this.odataDeltaLink;
    }
    /**
     * Gets the @odata.nextLink property value. The OdataNextLink property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataNextLink() {
        return this.odataNextLink;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.deltaLink", this.getOdataDeltaLink());
        writer.writeStringValue("@odata.nextLink", this.getOdataNextLink());
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
     * Sets the @odata.deltaLink property value. The OdataDeltaLink property
     * @param value Value to set for the @odata.deltaLink property.
     */
    public void setOdataDeltaLink(@jakarta.annotation.Nullable final String value) {
        this.odataDeltaLink = value;
    }
    /**
     * Sets the @odata.nextLink property value. The OdataNextLink property
     * @param value Value to set for the @odata.nextLink property.
     */
    public void setOdataNextLink(@jakarta.annotation.Nullable final String value) {
        this.odataNextLink = value;
    }
}
