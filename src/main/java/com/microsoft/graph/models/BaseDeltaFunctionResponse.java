package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BaseDeltaFunctionResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataDeltaLink property */
    private String _odataDeltaLink;
    /** The OdataNextLink property */
    private String _odataNextLink;
    /**
     * Instantiates a new BaseDeltaFunctionResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BaseDeltaFunctionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BaseDeltaFunctionResponse
     */
    @javax.annotation.Nonnull
    public static BaseDeltaFunctionResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BaseDeltaFunctionResponse();
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("@odata.deltaLink", (n) -> { this.setOdataDeltaLink(n.getStringValue()); });
        deserializerMap.put("@odata.nextLink", (n) -> { this.setOdataNextLink(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.deltaLink property value. The OdataDeltaLink property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataDeltaLink() {
        return this._odataDeltaLink;
    }
    /**
     * Gets the @odata.nextLink property value. The OdataNextLink property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataNextLink() {
        return this._odataNextLink;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.deltaLink", this.getOdataDeltaLink());
        writer.writeStringValue("@odata.nextLink", this.getOdataNextLink());
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
     * Sets the @odata.deltaLink property value. The OdataDeltaLink property
     * @param value Value to set for the OdataDeltaLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataDeltaLink(@javax.annotation.Nullable final String value) {
        this._odataDeltaLink = value;
    }
    /**
     * Sets the @odata.nextLink property value. The OdataNextLink property
     * @param value Value to set for the OdataNextLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataNextLink(@javax.annotation.Nullable final String value) {
        this._odataNextLink = value;
    }
}
