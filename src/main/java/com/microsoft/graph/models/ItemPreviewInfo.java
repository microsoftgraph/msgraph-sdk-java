package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemPreviewInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The getUrl property */
    private String _getUrl;
    /** The OdataType property */
    private String _odataType;
    /** The postParameters property */
    private String _postParameters;
    /** The postUrl property */
    private String _postUrl;
    /**
     * Instantiates a new itemPreviewInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ItemPreviewInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.itemPreviewInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemPreviewInfo
     */
    @javax.annotation.Nonnull
    public static ItemPreviewInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemPreviewInfo();
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
        final ItemPreviewInfo currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("getUrl", (n) -> { currentObject.setGetUrl(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("postParameters", (n) -> { currentObject.setPostParameters(n.getStringValue()); });
            this.put("postUrl", (n) -> { currentObject.setPostUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the getUrl property value. The getUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGetUrl() {
        return this._getUrl;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the postParameters property value. The postParameters property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostParameters() {
        return this._postParameters;
    }
    /**
     * Gets the postUrl property value. The postUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostUrl() {
        return this._postUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("getUrl", this.getGetUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("postParameters", this.getPostParameters());
        writer.writeStringValue("postUrl", this.getPostUrl());
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
     * Sets the getUrl property value. The getUrl property
     * @param value Value to set for the getUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGetUrl(@javax.annotation.Nullable final String value) {
        this._getUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the postParameters property value. The postParameters property
     * @param value Value to set for the postParameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostParameters(@javax.annotation.Nullable final String value) {
        this._postParameters = value;
    }
    /**
     * Sets the postUrl property value. The postUrl property
     * @param value Value to set for the postUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostUrl(@javax.annotation.Nullable final String value) {
        this._postUrl = value;
    }
}
