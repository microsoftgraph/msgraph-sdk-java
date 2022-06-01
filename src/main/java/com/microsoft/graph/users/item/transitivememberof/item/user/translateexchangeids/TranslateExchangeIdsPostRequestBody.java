package microsoft.graph.users.item.transitivememberof.item.user.translateexchangeids;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.ExchangeIdFormat;
/** Provides operations to call the translateExchangeIds method. */
public class TranslateExchangeIdsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The InputIds property */
    private java.util.List<String> _inputIds;
    /** The SourceIdType property */
    private ExchangeIdFormat _sourceIdType;
    /** The TargetIdType property */
    private ExchangeIdFormat _targetIdType;
    /**
     * Instantiates a new translateExchangeIdsPostRequestBody and sets the default values.
     * @return a void
     */
    public TranslateExchangeIdsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a translateExchangeIdsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static TranslateExchangeIdsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TranslateExchangeIdsPostRequestBody();
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
        final TranslateExchangeIdsPostRequestBody currentObject = this;
        return new HashMap<>(3) {{
            this.put("inputIds", (n) -> { currentObject.setInputIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("sourceIdType", (n) -> { currentObject.setSourceIdType(n.getEnumValue(ExchangeIdFormat.class)); });
            this.put("targetIdType", (n) -> { currentObject.setTargetIdType(n.getEnumValue(ExchangeIdFormat.class)); });
        }};
    }
    /**
     * Gets the inputIds property value. The InputIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getInputIds() {
        return this._inputIds;
    }
    /**
     * Gets the sourceIdType property value. The SourceIdType property
     * @return a exchangeIdFormat
     */
    @javax.annotation.Nullable
    public ExchangeIdFormat getSourceIdType() {
        return this._sourceIdType;
    }
    /**
     * Gets the targetIdType property value. The TargetIdType property
     * @return a exchangeIdFormat
     */
    @javax.annotation.Nullable
    public ExchangeIdFormat getTargetIdType() {
        return this._targetIdType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("inputIds", this.getInputIds());
        writer.writeEnumValue("sourceIdType", this.getSourceIdType());
        writer.writeEnumValue("targetIdType", this.getTargetIdType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the inputIds property value. The InputIds property
     * @param value Value to set for the InputIds property.
     * @return a void
     */
    public void setInputIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._inputIds = value;
    }
    /**
     * Sets the sourceIdType property value. The SourceIdType property
     * @param value Value to set for the SourceIdType property.
     * @return a void
     */
    public void setSourceIdType(@javax.annotation.Nullable final ExchangeIdFormat value) {
        this._sourceIdType = value;
    }
    /**
     * Sets the targetIdType property value. The TargetIdType property
     * @param value Value to set for the TargetIdType property.
     * @return a void
     */
    public void setTargetIdType(@javax.annotation.Nullable final ExchangeIdFormat value) {
        this._targetIdType = value;
    }
}
